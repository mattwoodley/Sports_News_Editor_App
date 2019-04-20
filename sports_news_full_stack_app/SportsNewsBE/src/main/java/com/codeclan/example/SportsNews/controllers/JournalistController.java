package com.codeclan.example.SportsNews.controllers;

import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "journalists")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;
}
