package com.project.rest.webservices.social_media.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UpdatePostRequestDto {

    @NotBlank(message = "The title cannot be blank")
    @Size(min= 3, max = 100)
    private String title;
    @Size(min = 3, max = 500)
    @NotBlank(message = "The content of the post cannot be blank")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
