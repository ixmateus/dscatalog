package com.javaspringexpert.dscatalog.services;

import com.javaspringexpert.dscatalog.entities.Category;
import com.javaspringexpert.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> finAll(){
        return categoryRepository.findAll();
    }
}
