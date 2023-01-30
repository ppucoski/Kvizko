package com.example.kvizko.service.impl;

import com.example.kvizko.models.Question;
import com.example.kvizko.models.QuestionIsPartOfQuiz;
import com.example.kvizko.repository.QuestionRepository;
import com.example.kvizko.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Question> questionsByQuiz(Long id) {
        return null;
    }
}
