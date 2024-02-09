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
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
class KvizkoMockitoTests {

    @Mock
    private QuizService quizService;

/*    @Mock
    private CategoryService categoryService;*/

    @Mock
    private SubjectService subjectService;

    @Mock
    private QuestionService questionService;

    @Mock
    private ChoiceService choiceService;

    @Mock
    private UserService userService;

   /* @Mock
    private AttemptService attemptService;

    @Mock
    private ResultService resultService;

    @Mock
    private QuizTakerService quizTakerService;

    @Mock
    private SelectedchoiceService selectedchoiceService;

    @Mock
    private AdministratorRepository administratorRepository;

    @Mock
    private AvgpoenizakvizRepository avgpoenizakvizRepository;

    @Mock
    private BrturniribrigrachibrkvizovibrmedaliRepository brturniribrigrachibrkvizovibrmedaliRepository;

    @Mock
    private IzveshtajzaturnirRepository izveshtajzaturnirRepository;

    @Mock
    private KorisnicirangiranisporedmedaliRepository korisnicirangiranisporedmedaliRepository;

    @Mock
    private KvizovirangiranisporedtochniprashanjaRepository kvizovirangiranisporedtochniprashanjaRepository;

    @Mock
    private NajangazhiranikorisniciRepository najangazhiranikorisniciRepository;

    @Mock
    private NajigranikvizoviRepository najigranikvizoviRepository;

    @Mock
    private PrashanjarangiranisporedtochniodgovoriRepository prashanjarangiranisporedtochniodgovoriRepository;

    @Mock
    private Top5ReshavachiRepository top5ReshavachiRepository;

    @Mock
    private Vkbrojreshenikvizovivo3MeseciRepository vkbrojreshenikvizovivo3MeseciRepositoryRepository;

    @Mock
    private LeaderboardRepository leaderboardRepository;*/

    @Mock
    private HttpSession session;

    @Mock
    private Model model;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIndex() throws InvalidCredentialsException { //proverka dali index stranata ni vrakja kategorii

        List<Subject> subjects = Arrays.asList(new Subject(), new Subject(), new Subject());
        when(subjectService.listAll()).thenReturn(subjects);

        String result = controller.index(model, session);

        verify(model).addAttribute("subjects", subjects);
        assertEquals("index", result);
    }

    @Test
    public void testQuizStart() {

        // Kreiranje na Mock podatoci
        Quiz quiz = new Quiz();

        List<Question> questions = Arrays.asList(new Question(), new Question());

        when(questionService.questionsByQuiz(anyLong())).thenReturn(questions);
        when(choiceService.choicesByQuestion(any())).thenReturn(Collections.singletonList(new Choice()));
        when(quizService.quizById(anyLong())).thenReturn(quiz);

        // Pravenje na soodvetnata akcija
        String result = controller.quizStart(1L, model, session);

        // Proverka dali se dobieni ochekuvani podatoci
        verify(model).addAttribute(eq("question"), any(Question.class));
        verify(model).addAttribute(eq("choices"), anyList());
        assertEquals("Question-and-choices", result);
    }

    @Test
    public void testUserService() throws InvalidCredentialsException {

        // Kreiranje na Mock podatoci

        String username = "klimentshukanov";
        String password = "lozinka123";
        User mockUser = new User("Kliment Shukanov", username, password);
        when(userService.findByUsernameAndPassword(username, password)).thenReturn(mockUser);

        // Act
        User result = userService.findByUsernameAndPassword(username, password);
        // Assert
        assertNotNull(result);
        assertEquals(username, result.getUsername());
        assertEquals(password, result.getPasswordAttr());
        assertEquals("Kliment Shukanov", result.getFullname());

        // Verify that the repository's findById method was called with the correct argument
        verify(userService, times(1)).findByUsernameAndPassword(username, password);

    }


}
