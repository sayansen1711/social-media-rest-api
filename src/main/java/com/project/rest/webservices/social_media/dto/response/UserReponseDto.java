package com.project.rest.webservices.social_media.dto.response;

public class UserReponseDto {
    private int id;
    private String username;
    private String role;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole(){
        return role;
    }

    public UserReponseDto(int id, String username, String role){
        this.id=id;
        this.username=username;
        this.role=role;
    }
}
