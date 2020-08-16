package com.spring.LearningSpring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String anons;
    private String description;
    private int views;

    public Post(String title, String anons, String description) {
        this.title = title;
        this.anons = anons;
        this.description = description;
    }

    public Post() {

    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAnons() { return anons; }
    public String getDescription() { return description; }
    public int getViews() { return views; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAnons(String anons) { this.anons = anons; }
    public void setDescription(String description) { this.description = description; }
    public void setViews(int views) { this.views = views; }





}
