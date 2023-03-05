package com.example.kvizko.service;

import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.Selectedchoice;

public interface SelectedchoiceService {

    Selectedchoice save(Long choiceid, Attempt attempt);

}
