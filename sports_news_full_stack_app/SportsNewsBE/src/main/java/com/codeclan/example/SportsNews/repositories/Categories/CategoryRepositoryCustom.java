package com.codeclan.example.SportsNews.repositories.Categories;

import com.codeclan.example.SportsNews.models.Article;

import java.util.List;

public interface CategoryRepositoryCustom {
    List<Article> findArticlesByCategory(Long categoryId);
}
