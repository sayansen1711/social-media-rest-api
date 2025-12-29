package com.project.rest.webservices.social_media.controller;

import com.project.rest.webservices.social_media.dto.request.CreatePostRequestDto;
import com.project.rest.webservices.social_media.dto.response.PostReponseDto;
import com.project.rest.webservices.social_media.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PostController {

    public PostService postService;

    public PostController(PostService postService){
        this.postService=postService;
    }

    @PostMapping("/api/add-post")
    public ResponseEntity<PostReponseDto> addPost(@Valid @RequestBody CreatePostRequestDto createPostRequestDto){
        PostReponseDto reponseDto=postService.createPost(createPostRequestDto);
        return new ResponseEntity<>(reponseDto, HttpStatus.CREATED);
    }
    @GetMapping("/api/check")
    public String checkApiStatus(){
        return "Hello world";
    }
}
