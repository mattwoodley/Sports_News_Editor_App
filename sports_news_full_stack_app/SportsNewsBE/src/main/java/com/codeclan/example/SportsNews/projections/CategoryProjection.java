package com.codeclan.example.SportsNews.projections;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedArticle", types = Category.class)
public interface CategoryProjection {
    Long getId();
    String getName();
    List<Article> getArticles();
}
