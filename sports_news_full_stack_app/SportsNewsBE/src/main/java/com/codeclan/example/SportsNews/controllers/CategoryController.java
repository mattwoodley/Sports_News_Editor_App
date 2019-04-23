package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ArticleRepository articleRepository;

    @PutMapping(value = "/{id}")
    public void updateAddCategory(@PathVariable long id){
        Category category = categoryRepository.getOne(id);
        categoryRepository.save(category);
    }
//    @RequestMapping(value = "/criteria/{criteria}/sortorder/{sortOrder}")
//    public List<Article> findByDateCreated(@PathVariable String criteria, @PathVariable String sortOrder) {
//        List<Article> articles;
//        if(sortOrder.equals("ASC")) {
//            articles = articleRepository.findAll(Sort.by(Sort.Direction.ASC, criteria));
//        }else{
//            articles = articleRepository.findAll(Sort.by(Sort.Direction.DESC, criteria));
//        }
//        return articles;
//    }
}
