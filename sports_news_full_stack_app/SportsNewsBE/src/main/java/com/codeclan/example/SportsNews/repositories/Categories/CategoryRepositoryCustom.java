package com.codeclan.example.SportsNews.repositories.Categories;

import com.codeclan.example.SportsNews.models.Article;

import java.util.List;

public interface CategoryRepositoryCustom {
    public List<Article> findArticlesByCategory(Long categoryId);
}
