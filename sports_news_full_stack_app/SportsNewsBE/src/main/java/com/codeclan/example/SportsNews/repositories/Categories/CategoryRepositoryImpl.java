package com.codeclan.example.SportsNews.repositories.Categories;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CategoryRepositoryImpl implements CategoryRepositoryCustom{
    @Autowired
    EntityManager entityManager;
}
