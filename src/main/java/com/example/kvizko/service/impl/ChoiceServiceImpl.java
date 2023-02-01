package com.example.kvizko.service.impl;

import com.example.kvizko.models.Choice;
import com.example.kvizko.models.Question;
import com.example.kvizko.models.Selectionquestion;
import com.example.kvizko.repository.ChoiceRepository;
import com.example.kvizko.repository.SelectionQuestionRepository;
import com.example.kvizko.service.ChoiceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ChoiceServiceImpl implements ChoiceService {

    private final ChoiceRepository choiceRepository;
    public ChoiceServiceImpl(ChoiceRepository choiceRepository) {
        this.choiceRepository = choiceRepository;
    }

    @Override
    public List<Choice> choicesByQuestion(Question question) {
        return choiceRepository.findAllBySelectionquestion_Questionid(question.getQuestionid());
    }

    @Override
    public Choice getById(Long id) {
         return choiceRepository.findById(id).orElse(null);
    }
}
