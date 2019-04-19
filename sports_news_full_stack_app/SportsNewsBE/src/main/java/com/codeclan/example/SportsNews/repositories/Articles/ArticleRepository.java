package com.codeclan.example.SportsNews.repositories.Articles;

import com.codeclan.example.SportsNews.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
