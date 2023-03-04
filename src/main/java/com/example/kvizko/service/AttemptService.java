package com.example.kvizko.service;

import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.Quiz;
import com.example.kvizko.models.Quiztaker;

public interface AttemptService {

    Attempt save(Quiztaker quiztaker, java.sql.Date attemptDate, Quiz quiz);

}
