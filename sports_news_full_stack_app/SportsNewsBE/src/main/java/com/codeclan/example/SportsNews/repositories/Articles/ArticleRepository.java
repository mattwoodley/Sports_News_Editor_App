package com.codeclan.example.SportsNews.repositories.Articles;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.projections.ArticleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource(excerptProjection = ArticleProjection.class)
public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {


}
