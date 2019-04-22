package com.codeclan.example.SportsNews.repositories.Articles;


import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{
    //add method to sort articles by dateCreated and headline.

    @Autowired
    EntityManager entityManager;
}
