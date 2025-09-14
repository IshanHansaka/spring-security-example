package com.telusko.spring_security_example.service;

import org.springframework.stereotype.Service;

import com.telusko.spring_security_example.model.User;
import com.telusko.spring_security_example.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User register(User user) {
        userRepository.save(user);
        return user;
    }
}
