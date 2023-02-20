package com.example.kvizko.exceptions;

public class UsernameAlreadyTakenException extends Exception{

    public UsernameAlreadyTakenException() {
        super("This username is already taken!");
    }
}
