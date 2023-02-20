package com.example.kvizko.web;

import com.example.kvizko.models.Question;

import com.example.kvizko.models.User;
import com.example.kvizko.service.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class Controller {

    private final QuizService quizService;
    private final CategoryService categoryService;
    private final SubjectService subjectService;
    private final QuestionService questionService;
    private final ChoiceService choiceService;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;


    public Controller(QuizService quizService, CategoryService categoryService, SubjectService subjectService, QuestionService questionService, ChoiceService choiceService, UserService userService, PasswordEncoder passwordEncoder) {
        this.quizService = quizService;
        this.categoryService = categoryService;
        this.subjectService = subjectService;
        this.questionService = questionService;
        this.choiceService = choiceService;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("subjects", subjectService.listAll());
        return "index";
    }

    @GetMapping("/{subjectid}/categories")
    public String selectCategory(@PathVariable Long subjectid, Model model) {
        model.addAttribute("categories", categoryService.findBySubject(subjectid));
        return "Quizzes-and-categories";
    }

    @GetMapping("/{categoryid}/quizzes")
    public String selectQuiz(@PathVariable Long categoryid, Model model) {
        model.addAttribute("quizzes", quizService.quizzesByCategoryID(categoryid));
        return "Quizzes-and-categories";
    }

    @GetMapping("/{quizid}/quizStart")
    public String quizStart(@PathVariable Long quizid, Model model, HttpSession session) {

        List<Question> questionsByQuiz = questionService.questionsByQuiz(quizid);

        Collections.shuffle(questionsByQuiz);

        Question firstQuestion = questionsByQuiz.remove(0);

        session.setAttribute("quizName", quizService.quizById(quizid).getQuizname());//model.addAttribute("quizName", quizService.quizById(quizid).getQuizname());
        session.setAttribute("questionsByQuiz", questionsByQuiz.stream().limit(4).collect(Collectors.toList()));//model.addAttribute("questionsByQuiz", questionsByQuiz);
        session.setAttribute("questionCount", questionsByQuiz.size()); //model.addAttribute("questionCount", questionsByQuiz.size());
        session.setAttribute("correctQuestionCounter", 0);//model.addAttribute("correctQuestionCounter", 0);


        model.addAttribute("question", firstQuestion);
        model.addAttribute("choices", choiceService.choicesByQuestion(firstQuestion));

        model.addAttribute("lastQuestion", false);

        return "Question-and-choices";
    }


    @PostMapping("/quizSolving")
    public String quizSolving(Model model,
                              @RequestParam(required = false) Long selectedChoice,
                              @SessionAttribute Integer questionCount,
                              @SessionAttribute List<Question> questionsByQuiz,
                              @SessionAttribute String quizName,
                              @SessionAttribute Integer correctQuestionCounter,
                              HttpSession session) {

        if (questionsByQuiz.isEmpty()) {
            //TODO: presmetka
            model.addAttribute("result", correctQuestionCounter * 100 / questionCount);
            return "Result";
        } else {
            if (questionsByQuiz.size() == 1) {
                model.addAttribute("lastQuestion", true);
            } else {
                model.addAttribute("lastQuestion", false);
            }
            session.setAttribute("questionCount", questionCount); //model.addAttribute("questionCount", questionCount);
            session.setAttribute("quizName", quizName);//model.addAttribute("quizName", quizName);

            Question currentQuestion = questionsByQuiz.remove(0);
            session.setAttribute("questionsByQuiz", questionsByQuiz);//model.addAttribute("questionsByQuiz", questionsByQuiz);


            if (selectedChoice!=null && choiceService.getById(selectedChoice).isIscorrect()) {
                correctQuestionCounter++;
            }
            session.setAttribute("correctQuestionCounter", correctQuestionCounter);//model.addAttribute("correctQuestionCounter", correctQuestionCounter);


            model.addAttribute("question", currentQuestion);
            model.addAttribute("choices", choiceService.choicesByQuestion(currentQuestion));

        }
        return "Question-and-choices";

    }

    @GetMapping("/getLogin")
    public String getLogin() {
        return "Login";
    }

    @GetMapping("/getRegister")
    public String getRegister() {
        return "Sign-up";
    }

    @PostMapping("/processLogin")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password)
    {
        User user = this.userService.findByUsernameAndPassword(username, password);
        if(user != null && passwordEncoder.matches(password, user.getPasswordAttr()))
        {
            return "index";
        }
        return "Login"; //TODO: ova da sme smeni
    }

    @PostMapping("/processSignup")
    public String processSignup(@RequestParam String username,
                                @RequestParam(required = false) String full_name,
                                @RequestParam String password) throws Exception {

        this.userService.save(username, full_name, password);
        return "index"; //TODO: ova da sme smeni
    }

}
