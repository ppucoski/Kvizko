package com.example.kvizko;

import com.example.kvizko.exceptions.InvalidCredentialsException;
import com.example.kvizko.exceptions.UsernameAlreadyTakenException;
import com.example.kvizko.models.Question;
import com.example.kvizko.models.User;
import com.example.kvizko.service.QuestionService;
import com.example.kvizko.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class KvizkoJunitTests {

    @Autowired
    private UserService userService;

    @Autowired
    private QuestionService questionService;

    @Test
    public void loginTest() throws InvalidCredentialsException {
        User user = userService.findByUsernameAndPassword("admin", "admin");

        assertNotNull(user); //assertNull
        assertEquals(user.getUsername(), "admin");
    }

    @Test
    public void invalidLoginTest() {
        assertThrows(InvalidCredentialsException.class, () -> userService.findByUsernameAndPassword("invalidLogin", "invalidLogin"));
    }

    @Test
    public void invalidRegisterTest() {
        assertThrows(UsernameAlreadyTakenException.class, () -> userService.registerUser("admin", "adminName", "password"));
    }

    @Test
    public void validRegisterTest()
    {
        assertDoesNotThrow(() -> userService.registerUser("validRegister2", "validRegisterName", "validRegisterPassword"));
    }

    @Test
    public void testQuestionsByNonExistentQuiz() {
        List<Question> questions = questionService.questionsByQuiz(123L);

        assertTrue(questions.isEmpty()); //assertFalse(!questions.isEmpty());
    }

    @Test
    public void testQuestionsByNonExistentQuiz2()
    {

        List<Question> questions = questionService.questionsByQuiz(123L);

        if (!questions.isEmpty())
        {
            fail("The question list is not empty");
        }

    }

    //assertArrayEquals, assertSame

}
