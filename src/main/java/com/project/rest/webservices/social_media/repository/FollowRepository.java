package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Integer> {
}
