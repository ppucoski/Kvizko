package com.example.kvizko.web;

import com.example.kvizko.service.CategoryService;
import com.example.kvizko.service.QuestionService;
import com.example.kvizko.service.QuizService;
import com.example.kvizko.service.SubjectService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.stereotype.Controller
public class Controller {

    private final QuizService quizService;
    private final CategoryService categoryService;
    private final SubjectService subjectService;
    private final QuestionService questionService;

    public Controller(QuizService quizService, CategoryService categoryService, SubjectService subjectService, QuestionService questionService) {
        this.quizService = quizService;
        this.categoryService = categoryService;
        this.subjectService = subjectService;
        this.questionService = questionService;
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
        model.addAttribute("quizName", quizService.quizById(quizid).getQuizname());
        model.addAttribute("questions", questionService.questionsByQuiz(quizid));
        return "questions";
    }

}
