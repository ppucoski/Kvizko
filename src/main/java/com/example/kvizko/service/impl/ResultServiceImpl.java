package com.example.kvizko.service.impl;

import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.ResultTable;
import com.example.kvizko.repository.ResultRepository;
import com.example.kvizko.service.ResultService;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    private final ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public ResultTable save(Attempt attempt, long points) {
        return resultRepository.save(new ResultTable(attempt, points));
    }
}
