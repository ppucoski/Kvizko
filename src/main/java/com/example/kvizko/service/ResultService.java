package com.example.kvizko.service;


import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.ResultTable;

public interface ResultService {

    ResultTable save(Attempt attempt, long points);

}
