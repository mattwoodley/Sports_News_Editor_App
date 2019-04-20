package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;
}
