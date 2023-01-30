package com.example.kvizko.service.impl;

import com.example.kvizko.models.Category;
import com.example.kvizko.repository.CategoryRepository;
import com.example.kvizko.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findBySubject(Long subjectid) {
        return categoryRepository.findAllBySubjectSubjectid(subjectid);
    }
}
