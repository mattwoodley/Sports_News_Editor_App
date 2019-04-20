package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @PutMapping(value = "/{id}")
    public void updateAddCategory(@PathVariable long id){
        Category category = categoryRepository.getOne(id);
        categoryRepository.save(category);
    }

}
