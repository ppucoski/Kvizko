package com.example.kvizko.service.impl;

import com.example.kvizko.exceptions.InvalidCredentialsException;
import com.example.kvizko.exceptions.UsernameAlreadyTakenException;
import com.example.kvizko.models.Quiztaker;
import com.example.kvizko.models.User;
import com.example.kvizko.repository.QuizTakerRepository;
import com.example.kvizko.repository.UserRepository;
import com.example.kvizko.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final QuizTakerRepository quizTakerRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, QuizTakerRepository quizTakerRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.quizTakerRepository = quizTakerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) throws InvalidCredentialsException {
        User user=userRepository.findByUsername(username);
        if(user==null || !passwordEncoder.matches(password, user.getPasswordAttr()))
            throw new InvalidCredentialsException();

        return user;
    }

    @Override
    public void registerUser(String username, String full_name, String password) throws UsernameAlreadyTakenException {
        if(this.userRepository.findByUsername(username)==null)
        {
            User user=this.userRepository.save(new User(full_name, username, passwordEncoder.encode(password)));
            Quiztaker quiztakerID=new Quiztaker(user.getUserid());
            this.quizTakerRepository.save(quiztakerID);
        }
        else
        {
            throw new UsernameAlreadyTakenException();
        }
    }


}
