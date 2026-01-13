package com.project.rest.webservices.social_media.dto.response;

public class UserReponseDto {
    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public UserReponseDto(int id, String username){
        this.id=id;
        this.username=username;
    }
}
