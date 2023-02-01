package com.example.kvizko.service;

import com.example.kvizko.models.Choice;
import com.example.kvizko.models.Question;
import com.example.kvizko.models.Selectionquestion;

import java.util.List;

public interface ChoiceService {

    List<Choice> choicesByQuestion(Question question);
    Choice getById(Long id);
}
