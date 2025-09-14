package com.telusko.spring_security_example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.spring_security_example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByUsername(String username);

}
