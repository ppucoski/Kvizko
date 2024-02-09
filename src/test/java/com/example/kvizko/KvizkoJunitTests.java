package com.example.kvizko;

import com.example.kvizko.exceptions.InvalidCredentialsException;
import com.example.kvizko.models.User;
import com.example.kvizko.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class KvizkoJunitTests {

    @Autowired
    private UserService userService;


    @Test
    public void LoginTest() throws InvalidCredentialsException {
        User user = userService.findByUsernameAndPassword("admin", "admin");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getUsername(), "admin");
    }

    @Test
    public void invalidLoginTest() {
        Assertions.assertThrows(InvalidCredentialsException.class, () -> {
            userService.findByUsernameAndPassword("invalidLogin", "invalidLogin");
        });
    }
}
