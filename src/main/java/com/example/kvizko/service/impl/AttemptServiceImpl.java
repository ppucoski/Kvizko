package com.example.kvizko.service.impl;

import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.Quiz;
import com.example.kvizko.models.Quiztaker;
import com.example.kvizko.repository.AttemptRepository;
import com.example.kvizko.service.AttemptService;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class AttemptServiceImpl implements AttemptService {

    private final AttemptRepository attemptRepository;

    public AttemptServiceImpl(AttemptRepository attemptRepository) {
        this.attemptRepository = attemptRepository;
    }

    @Override
    public Attempt save(Quiztaker quiztaker, Date attemptDate, Quiz quiz) {
        return attemptRepository.save(new Attempt(quiztaker, attemptDate, quiz));
    }
}
