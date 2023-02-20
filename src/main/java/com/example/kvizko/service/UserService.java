package com.example.kvizko.service;

import com.example.kvizko.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    public User findByUsernameAndPassword(String username, String password);

    public void save(String username, String full_name, String password) throws Exception;
}
