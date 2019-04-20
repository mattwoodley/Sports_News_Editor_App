package com.codeclan.example.SportsNews.repositories.Journalists;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class JournalistRepositoryImpl implements JournalistRepositoryCustom{

    @Autowired
    EntityManager entityManager;
}
