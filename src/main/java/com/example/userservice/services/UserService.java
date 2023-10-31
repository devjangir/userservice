package com.example.userservice.services;

import com.example.userservice.dtos.UserDto;
import com.example.userservice.models.User;
import com.example.userservice.repositories.UserRepository;

@org.springframework.stereotype.Service
public class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
