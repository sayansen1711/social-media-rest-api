package com.project.rest.webservices.social_media.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Post {


    private String username;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private String title;
    private String description;
}
