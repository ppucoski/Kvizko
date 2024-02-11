package com.example.kvizko;

import com.example.kvizko.exceptions.InvalidCredentialsException;
import com.example.kvizko.models.*;
import com.example.kvizko.repository.*;
import com.example.kvizko.service.*;
import com.example.kvizko.service.impl.QuizServiceImpl;
import com.example.kvizko.web.Controller;
import jakarta.servlet.http.HttpSession;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.util.*;
import java.util.stream.Collectors;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
class KvizkoMockitoTests {

    @Mock
    private QuestionService questionService;

    @Mock
    private ChoiceService choiceService;

    @Mock
    private QuizTakerService quizTakerService;

    @Mock
    private AdministratorRepository administratorRepository;

    @Mock
    private AttemptService attemptService;

    private HttpSession session;

    private QuizService quizService;

    @Mock
    private Model model;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    public void setUp()
    {
        session = Mockito.mock(HttpSession.class);
        quizService = Mockito.mock(QuizService.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testiranjeGetLoginPristap()
    {
        when(session.getAttribute("user")).thenReturn(new User());

        String result = controller.getLogin(session, model);

        verify(session, times(1)).getAttribute("user");
        assertEquals("redirect:/", result);
    }

    @Test
    public void testiranjeGetRegisterPristap()
    {
        when(session.getAttribute("user")).thenReturn(new User());

        String result = controller.getRegister(session, model);

        verify(session, times(1)).getAttribute("user");
        assertEquals("redirect:/", result);
    }

    @Test
    public void quizStartMethodCall()
    {
        when(questionService.questionsByQuiz(anyLong())).thenReturn(Arrays.asList(new Question(), new Question()));
        when(choiceService.choicesByQuestion(any(Question.class))).thenReturn(Arrays.asList(new Choice(), new Choice()));

        when(quizService.quizById(anyLong())).thenReturn(new Quiz());
        when(quizTakerService.findById(anyLong())).thenReturn(new Quiztaker());

        when(session.getAttribute("user")).thenReturn(new User());
        //when(session.getAttribute("user")).thenReturn(null);

        String result = controller.quizStart(1L, model, session);

        verify(session, times(4)).getAttribute("user");
        verify(attemptService).save(any(Quiztaker.class), any(Date.class), any(Quiz.class));
        //verify(session, times(3)).getAttribute("user");
        //verify(attemptService, never()).save(any(Quiztaker.class), any(Date.class), any(Quiz.class));
    }

}
