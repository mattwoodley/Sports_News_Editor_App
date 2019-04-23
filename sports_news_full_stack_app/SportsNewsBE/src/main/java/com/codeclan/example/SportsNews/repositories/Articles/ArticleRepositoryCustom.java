package com.codeclan.example.SportsNews.repositories.Articles;


import com.codeclan.example.SportsNews.models.Article;

import java.util.List;

public interface ArticleRepositoryCustom {

    public List<Article> findArticlesByCategory(Long categoryId);
    //add method to sort articles by dateCreated and headline.
}
