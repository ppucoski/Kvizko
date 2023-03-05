package com.example.kvizko.service.impl;

import com.example.kvizko.models.Attempt;
import com.example.kvizko.models.Selectedchoice;
import com.example.kvizko.repository.SelectedchoiceRepository;
import com.example.kvizko.service.SelectedchoiceService;
import org.springframework.stereotype.Service;

@Service
public class SelectedchoiceServiceImpl implements SelectedchoiceService {

    private final SelectedchoiceRepository selectedchoiceRepository;

    public SelectedchoiceServiceImpl(SelectedchoiceRepository selectedchoiceRepository) {
        this.selectedchoiceRepository = selectedchoiceRepository;
    }

    @Override
    public Selectedchoice save(Long choiceid, Attempt attempt) {
        return selectedchoiceRepository.save(new Selectedchoice(choiceid, attempt));
    }
}
