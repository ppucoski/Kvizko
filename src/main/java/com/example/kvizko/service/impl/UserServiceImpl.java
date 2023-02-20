package com.example.kvizko.service.impl;

import com.example.kvizko.models.User;
import com.example.kvizko.repository.UserRepository;
import com.example.kvizko.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPasswordAttr(username, password);
    }

    @Override
    public void save(String username, String full_name, String password) throws Exception {
        if(this.userRepository.findByUsername(username)==null)
        {
            this.userRepository.save(new User(full_name, username, passwordEncoder.encode(password)));
        }
        else
        {
            throw new Exception();
        }
    }

}
