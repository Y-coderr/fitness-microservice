package com.fitness.userservice;

import com.fitness.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
    Boolean existsByEmail(String email);  //automatically it understands what user wants to do
}
