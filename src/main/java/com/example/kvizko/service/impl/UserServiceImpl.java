package com.example.kvizko.service.impl;

import com.example.kvizko.exceptions.UsernameAlreadyTakenException;
import com.example.kvizko.models.Quiztaker;
import com.example.kvizko.models.User;
import com.example.kvizko.repository.QuizTakerRepository;
import com.example.kvizko.repository.UserRepository;
import com.example.kvizko.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final QuizTakerRepository quizTakerRepository;

    public UserServiceImpl(UserRepository userRepository, QuizTakerRepository quizTakerRepository) {
        this.userRepository = userRepository;
        this.quizTakerRepository = quizTakerRepository;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPasswordAttr(username, password);
    }

    @Override
    public void registerUser(String username, String full_name, String password) throws UsernameAlreadyTakenException {
        if(this.userRepository.findByUsername(username)==null)
        {
            User user=this.userRepository.save(new User(full_name, username, password));
            Quiztaker quiztakerID=new Quiztaker(user.getUserid());
            this.quizTakerRepository.save(quiztakerID);
        }
        else
        {
            throw new UsernameAlreadyTakenException();
        }
    }

}
