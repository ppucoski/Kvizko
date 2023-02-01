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
    private final SelectionQuestionRepository selectionQuestionRepository;

    public ChoiceServiceImpl(ChoiceRepository choiceRepository, SelectionQuestionRepository selectionQuestionRepository) {
        this.choiceRepository = choiceRepository;
        this.selectionQuestionRepository = selectionQuestionRepository;
    }

    @Override
    public List<Choice> choicesByQuestions(List<Question> questions) {
        List<Long> questionsid = questions.stream().map(Question::getQuestionid).toList();
        //List<Selectionquestion> selectionquestions = selectionQuestionRepository.findAllById(questionsid);
        List<Choice> choices = new ArrayList<>();

        for(Long id : questionsid)
        {
            choices = Stream.concat(choices.stream(), choiceRepository.findAllBySelectionquestion_Questionid(id).stream())
                    .collect(Collectors.toList());;

        }

        return choices;
    }

    @Override
    public Choice getById(Long id) {
         return choiceRepository.findById(id).orElse(null);
    }
}
