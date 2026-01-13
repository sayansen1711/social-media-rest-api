package com.project.rest.webservices.social_media.repository;

import com.project.rest.webservices.social_media.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public Optional<User> findByUsername(String username);
}
