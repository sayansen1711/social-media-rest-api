package com.project.rest.webservices.social_media.controller;

import com.project.rest.webservices.social_media.entity.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/api/all-posts")
    public ResponseEntity<Post> showAllPosts(){
        System.out.println("api working");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
