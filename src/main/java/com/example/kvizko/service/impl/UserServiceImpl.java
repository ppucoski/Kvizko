package com.example.kvizko.service.impl;

import com.example.kvizko.exceptions.UsernameAlreadyTakenException;
import com.example.kvizko.models.User;
import com.example.kvizko.repository.UserRepository;
import com.example.kvizko.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPasswordAttr(username, password);
    }

    @Override
    public void save(String username, String full_name, String password) throws UsernameAlreadyTakenException {
        if(this.userRepository.findByUsername(username)==null)
        {
            this.userRepository.save(new User(full_name, username, password));
        }
        else
        {
            throw new UsernameAlreadyTakenException();
        }
    }

}
