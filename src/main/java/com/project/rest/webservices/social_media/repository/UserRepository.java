package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
