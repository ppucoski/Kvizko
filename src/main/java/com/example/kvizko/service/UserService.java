package com.example.kvizko.service;

import com.example.kvizko.exceptions.UsernameAlreadyTakenException;
import com.example.kvizko.models.User;

public interface UserService {

    public User findByUsernameAndPassword(String username, String password);

    public void registerUser(String username, String full_name, String password) throws UsernameAlreadyTakenException;
}
