package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Integer> {
}
