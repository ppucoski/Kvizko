package com.example.kvizko.service;

import com.example.kvizko.models.Question;


import java.util.List;

public interface QuestionService {

    List<Question> questionsByQuiz(Long id);

}
