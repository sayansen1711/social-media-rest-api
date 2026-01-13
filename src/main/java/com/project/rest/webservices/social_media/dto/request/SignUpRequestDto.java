package com.project.rest.webservices.social_media.dto.request;

public class SignUpRequestDto {
    private String usernsme;
    private String password;

    public String getUsernsme() {
        return usernsme;
    }

    public void setUsernsme(String usernsme) {
        this.usernsme = usernsme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
