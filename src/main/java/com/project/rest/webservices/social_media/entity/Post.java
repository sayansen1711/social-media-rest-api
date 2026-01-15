package com.project.rest.webservices.social_media.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 500)
    private String description;

    public Post(){}

    public User getUser() {
        return user;
    }

    public void setUsername(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate date) {
        this.createdAt = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
