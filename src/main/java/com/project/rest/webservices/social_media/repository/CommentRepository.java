package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
