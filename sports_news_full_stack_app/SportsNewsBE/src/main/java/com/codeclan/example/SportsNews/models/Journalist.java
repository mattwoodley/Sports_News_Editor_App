package com.codeclan.example.SportsNews.models;

import javax.persistence.*;

@Entity
@Table(name="journalists")
public class Journalist {

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Journalist(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Journalist(){};

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
