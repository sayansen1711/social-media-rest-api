package com.project.rest.webservices.social_media.service.impl;

import com.project.rest.webservices.social_media.config.SecurityConfig;
import com.project.rest.webservices.social_media.dto.request.LoginRequestDto;
import com.project.rest.webservices.social_media.dto.request.SignUpRequestDto;
import com.project.rest.webservices.social_media.dto.response.UserReponseDto;
import com.project.rest.webservices.social_media.entity.User;
import com.project.rest.webservices.social_media.exception.ResourceNotFoundException;
import com.project.rest.webservices.social_media.repository.UserRepository;
import com.project.rest.webservices.social_media.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final SecurityConfig securityConfig;

    public AuthServiceImpl(UserRepository userRepository, SecurityConfig securityConfig) {
        this.userRepository = userRepository;
        this.securityConfig = securityConfig;
    }

    @Override
    public UserReponseDto signup(SignUpRequestDto requestDto) {
        if(userRepository.findByUsername(requestDto.getUsername()).isPresent()){ //check for existing user
            throw new RuntimeException("Username already exists");
        }
        User user=new User();
        user.setUsername(requestDto.getUsername());
        user.setPassword(securityConfig.passwordEncoder().encode(requestDto.getPassword()));
        user.setRole(requestDto.getRole());
        User savedUser=userRepository.save(user);
        return new UserReponseDto(savedUser.getId(),savedUser.getUsername());
    }

    @Override
    public void login(LoginRequestDto requestDto) {
        User user=userRepository.findByUsername(requestDto.getUsername())
                .orElseThrow(()-> new RuntimeException("Invalid credentials"));

        String password=requestDto.getPassword();
        if(!securityConfig.passwordEncoder().matches(requestDto.getPassword(), user.getPassword())){
            throw new RuntimeException("Invalid credentials");
        }
    }
}
