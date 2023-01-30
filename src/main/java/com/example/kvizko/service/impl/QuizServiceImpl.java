package com.example.kvizko.service.impl;

import com.example.kvizko.models.Quiz;
import com.example.kvizko.repository.QuizRepository;
import com.example.kvizko.service.QuizService;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import org.springframework.stereotype.Service;

import javax.naming.directory.InvalidAttributeIdentifierException;
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

    @Override
    public List<Quiz> quizzesByCategoryID(Long categoryid) {
        return quizRepository.findAllByCategoryCategoryid(categoryid);
    }

    @Override
    public Quiz quizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }
}
