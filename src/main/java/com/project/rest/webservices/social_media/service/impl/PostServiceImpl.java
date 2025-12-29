package com.project.rest.webservices.social_media.service.impl;

import com.project.rest.webservices.social_media.dto.request.CreatePostRequestDto;
import com.project.rest.webservices.social_media.dto.response.PostReponseDto;
import com.project.rest.webservices.social_media.entity.Post;
import com.project.rest.webservices.social_media.repository.PostRepository;
import com.project.rest.webservices.social_media.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    public PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository=postRepository;
    }
    @Override
    public PostReponseDto createPost(CreatePostRequestDto requestDto) {
        //DTO --> Entity
        Post entityObject=new Post();
        entityObject.setUsername("user"); //get from Spring security context->logged in user
        entityObject.setTitle(requestDto.getTitle());
        entityObject.setDescription(requestDto.getDescription());
        entityObject.setCreatedAt(LocalDate.now());
        //added to DB
        Post savedPost=postRepository.save(entityObject);
        //Entity --> DTO
        PostReponseDto reponseDto=new PostReponseDto();
        reponseDto.setId(savedPost.getId());
        reponseDto.setTitle(savedPost.getTitle());
        reponseDto.setDescription(savedPost.getDescription());
        reponseDto.setCreatedAt(savedPost.getCreatedAt());

        return reponseDto;
    }
}
