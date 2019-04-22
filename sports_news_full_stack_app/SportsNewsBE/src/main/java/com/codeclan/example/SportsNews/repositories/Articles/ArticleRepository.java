package com.codeclan.example.SportsNews.repositories.Articles;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.projections.ArticleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource(excerptProjection = ArticleProjection.class)
public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {

    public List<Article> getArticlesByCategory(Category category);
}
