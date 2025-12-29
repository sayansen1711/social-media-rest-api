package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
