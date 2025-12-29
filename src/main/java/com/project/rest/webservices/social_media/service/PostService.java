package com.project.rest.webservices.social_media.service;

import com.project.rest.webservices.social_media.dto.request.CreatePostRequestDto;
import com.project.rest.webservices.social_media.dto.response.PostReponseDto;

public interface PostService {
    public PostReponseDto createPost(CreatePostRequestDto postDto);
}
