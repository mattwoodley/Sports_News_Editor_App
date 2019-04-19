package com.codeclan.example.SportsNews.models;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    public Category(){};

    public Category(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

}
