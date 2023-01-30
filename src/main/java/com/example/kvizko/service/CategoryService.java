package com.example.kvizko.service;

import com.example.kvizko.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<Category> listAll();
    List<Category> findBySubject(Long subjectid);

}
