package com.example.kvizko.service.impl;

import com.example.kvizko.models.Quiz;
import com.example.kvizko.repository.QuizRepository;
import com.example.kvizko.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }


    @Override
    public List<Quiz> listAll() {
        return quizRepository.findAll();
    }
}
