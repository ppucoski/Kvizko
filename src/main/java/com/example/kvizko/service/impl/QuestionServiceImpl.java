package com.example.kvizko.service.impl;

import com.example.kvizko.models.Question;
import com.example.kvizko.models.Selectionquestion;
import com.example.kvizko.repository.QuestionIsPartOfQuizRepository;
import com.example.kvizko.repository.QuestionRepository;
import com.example.kvizko.repository.SelectionQuestionRepository;
import com.example.kvizko.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final SelectionQuestionRepository selectionQuestionRepository;
    private final QuestionIsPartOfQuizRepository questionIsPartOfQuizRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository, SelectionQuestionRepository selectionQuestionRepository, QuestionIsPartOfQuizRepository questionIsPartOfQuizRepository) {
        this.questionRepository = questionRepository;
        this.selectionQuestionRepository = selectionQuestionRepository;
        this.questionIsPartOfQuizRepository = questionIsPartOfQuizRepository;
    }


    @Override
    public List<Question> questionsByQuiz(Long id) {
        List<Long> questionIDs= questionIsPartOfQuizRepository.findAllByQuestionIsPartOfQuizIdClassQuizid(id).
                stream().map(obj -> obj.getQuestionIsPartOfQuizIdClass().getQuestionid()).toList();

        List<Long> selection_questionIDs= questionIDs.stream().filter(selectionQuestionRepository::existsById).toList();
        return questionRepository.findAllById(selection_questionIDs);
    }
}
