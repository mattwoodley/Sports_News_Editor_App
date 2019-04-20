package com.codeclan.example.SportsNews.components;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    ArticleRepository articleRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        DateFormat sfd = new SimpleDateFormat("dd-MM-yy");
        String newDate= "11-02-2019";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Category football = new Category("Football");
        categoryRepository.save(football);

        Category baseball = new Category("Baseball");
        categoryRepository.save(baseball);

        Journalist journalist1 = new Journalist("John", "Burn", "url");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Gordon", "Doe", "url");
        journalistRepository.save(journalist2);

        Article articleFootball1 = new Article("Football", "About football", "Long story about football", date, "url", 7, football, journalist2);
        articleRepository.save(articleFootball1);

        Article articleFootball2 = new Article("Football", "About football", "The winner", date, "url", 5, football, journalist1);
        articleRepository.save(articleFootball2);

        Article articleBaseball1 = new Article("Baseball", "About baseball", "Great team of great people", date, "url", 2, baseball, journalist1);
        articleRepository.save(articleBaseball1);

        football.addArticle(articleFootball1);
        football.addArticle(articleFootball2);
        categoryRepository.save(football);

        journalist1.addArticle(articleFootball2);
        journalist1.addArticle(articleBaseball1);
        journalistRepository.save(journalist1);
        journalist2.addArticle(articleFootball1);
        journalistRepository.save(journalist2);


    }
}
