package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController{

    @Autowired
        ArticleRepository articleRepository;

}
