package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journalists")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;


    @PutMapping(value = "/{id}")
    public void updateAddJournalist(@PathVariable long id){
        Journalist journalist = journalistRepository.getOne(id);
        journalistRepository.save(journalist);
    }

}
