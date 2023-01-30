package com.example.kvizko.service.impl;

import com.example.kvizko.models.Subject;
import com.example.kvizko.repository.SubjectRepository;
import com.example.kvizko.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> listAll() {
        return subjectRepository.findAll();
    }
}
