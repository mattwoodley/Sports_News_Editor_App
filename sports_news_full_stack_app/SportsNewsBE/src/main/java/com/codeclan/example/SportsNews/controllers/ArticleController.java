package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.OrderBy;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController{

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @PutMapping(value = "/{id}/{categoryId}/{journalistId}")
    public void updateAddArticle(@PathVariable Long id, @PathVariable Long categoryId, @PathVariable Long journalistId) {
        Article article = articleRepository.getOne(id);
        Category category = categoryRepository.getOne(categoryId);
        Journalist journalist = journalistRepository.getOne(journalistId);
        article.setCategory(category);
        article.setJournalist(journalist);
        articleRepository.save(article);
    }
    @RequestMapping(value = "/criteria/{criteria}/sortorder/{sortOrder}")
    public List<Article> findByDateCreated(@PathVariable String criteria, @PathVariable String sortOrder) {
        List<Article> articles;
        if(sortOrder.equals("ASC")) {
           articles = articleRepository.findAll(Sort.by(Sort.Direction.ASC, criteria));
        }else{
            articles = articleRepository.findAll(Sort.by(Sort.Direction.DESC, criteria));
        }
        return articles;
    }
}
