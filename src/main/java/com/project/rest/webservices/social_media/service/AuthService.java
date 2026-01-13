package com.project.rest.webservices.social_media.service;

import com.project.rest.webservices.social_media.dto.request.LoginRequestDto;
import com.project.rest.webservices.social_media.dto.request.SignUpRequestDto;
import com.project.rest.webservices.social_media.dto.response.ApiResponseDto;
import com.project.rest.webservices.social_media.dto.response.UserReponseDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface AuthService {
    public UserReponseDto signup(SignUpRequestDto requestDto);
    public void login(LoginRequestDto requestDto);
    public UserReponseDto getUserById(int id);
}
