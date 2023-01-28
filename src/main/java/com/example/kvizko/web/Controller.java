package com.example.kvizko.web;

import com.example.kvizko.service.QuizService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private final QuizService quizService;

    public Controller(QuizService quizService) {
        this.quizService = quizService;
    }


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("quizzes", quizService.listAll());
        return "index";
    }

}
