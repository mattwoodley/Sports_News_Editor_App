package com.codeclan.example.SportsNews.repositories.Articles;

import com.codeclan.example.SportsNews.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{
    //add method to sort articles by dateCreated and headline.

    @Autowired
    EntityManager entityManager;

    @Autowired
    ArticleRepository articleRepository;

}
