package com.codeclan.example.SportsNews.components;

import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {


        Category football = new Category("Football");
        categoryRepository.save(football);

        Category baseball = new Category("Baseball");
        categoryRepository.save(baseball);

        Journalist journalist1 = new Journalist("John", "Burn", "url");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Gordon", "Doe", "url");
        journalistRepository.save(journalist2);
    }
}
