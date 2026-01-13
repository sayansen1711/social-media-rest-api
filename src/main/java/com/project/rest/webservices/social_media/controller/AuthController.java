package com.project.rest.webservices.social_media.controller;

import com.project.rest.webservices.social_media.dto.request.LoginRequestDto;
import com.project.rest.webservices.social_media.dto.request.SignUpRequestDto;
import com.project.rest.webservices.social_media.dto.response.ApiResponseDto;
import com.project.rest.webservices.social_media.dto.response.UserReponseDto;
import com.project.rest.webservices.social_media.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService; //constructor injection
    }

    @PostMapping("/signup")
    public ResponseEntity<UserReponseDto> signUp(@RequestBody SignUpRequestDto request){
        System.out.println("username"+request.getUsername());
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponseDto> login(@RequestBody LoginRequestDto request){
        authService.login(request);
        return ResponseEntity.ok(new ApiResponseDto("Login Successful"));
    }
}
