package com.project.rest.webservices.social_media.controller;

import com.project.rest.webservices.social_media.dto.response.UserReponseDto;
import com.project.rest.webservices.social_media.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //    Get user profile
    //    Follow / unfollow users
    //    View followers / followingL
    //    Update user details (optional)

    private final AuthService authService;

    public UserController(AuthService authService) {
        this.authService = authService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserReponseDto> getUser(@PathVariable int id){
        return ResponseEntity.ok(authService.getUserById(id));
    }

}
