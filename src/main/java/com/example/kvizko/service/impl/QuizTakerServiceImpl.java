package com.example.kvizko.service.impl;

import com.example.kvizko.models.Quiztaker;
import com.example.kvizko.repository.QuizTakerRepository;
import com.example.kvizko.service.QuizTakerService;
import org.springframework.stereotype.Service;

@Service
public class QuizTakerServiceImpl implements QuizTakerService {

    private final QuizTakerRepository quizTakerRepository;

    public QuizTakerServiceImpl(QuizTakerRepository quizTakerRepository) {
        this.quizTakerRepository = quizTakerRepository;
    }

    @Override
    public Quiztaker findById(Long id) {
        return quizTakerRepository.findById(id).orElse(null);
    }
}
