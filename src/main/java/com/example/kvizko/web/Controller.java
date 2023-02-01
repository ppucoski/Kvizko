package com.example.kvizko.web;

import com.example.kvizko.models.Choice;
import com.example.kvizko.models.Question;

import com.example.kvizko.service.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private final QuizService quizService;
    private final CategoryService categoryService;
    private final SubjectService subjectService;
    private final QuestionService questionService;
    private final ChoiceService choiceService;

    public Controller(QuizService quizService, CategoryService categoryService, SubjectService subjectService, QuestionService questionService, ChoiceService choiceService) {
        this.quizService = quizService;
        this.categoryService = categoryService;
        this.subjectService = subjectService;
        this.questionService = questionService;
        this.choiceService = choiceService;
    }


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("subjects", subjectService.listAll());
        return "index";
    }

    @GetMapping("/{subjectid}/categories")
    public String selectCategory(@PathVariable Long subjectid, Model model)
    {
        model.addAttribute("categories", categoryService.findBySubject(subjectid));
        return "categories";
    }

    @GetMapping("/{categoryid}/quizzes")
    public String selectQuiz(@PathVariable Long categoryid, Model model)
    {
        model.addAttribute("quizzes", quizService.quizzesByCategoryID(categoryid));
        return "quizzes";
    }

    @GetMapping("/{quizid}/questions")
    public String quizSolving(@PathVariable Long quizid, Model model)
    {
        List<Question> questionsByQuiz =  questionService.questionsByQuiz(quizid);
        model.addAttribute("quizName", quizService.quizById(quizid).getQuizname());
        model.addAttribute("questions",questionsByQuiz);
        model.addAttribute("questionCount", questionsByQuiz.size());
        model.addAttribute("choices", choiceService.choicesByQuestions(questionsByQuiz));


        return "questions";
    }

    @PostMapping("/quizResult")
    public String quizResult(Model model, @RequestParam Integer questionCount, @RequestParam Long... choiceIds)
    {
        List<Choice> listAllChoices=new ArrayList<>();

        for(Long id : choiceIds)
        {
            listAllChoices.add(choiceService.getById(id));
        }

        double totalResult=0.0;
        if(!listAllChoices.isEmpty())
        {
            for (Choice c : listAllChoices)
            {
                if(c.isIscorrect())
                {
                    totalResult+=100;
                }

            }
            totalResult=totalResult/questionCount;

        }
        model.addAttribute("result", totalResult);
        return "quizResult";

    }

}
