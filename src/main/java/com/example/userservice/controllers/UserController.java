package com.example.userservice.controllers;

import com.example.userservice.dtos.UserDto;
import com.example.userservice.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    UserController(UserService userService) {
        this.userService = userService;
    }
}
