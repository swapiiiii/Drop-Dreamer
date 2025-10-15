package com.dropdreamer.backend.controller;

import com.dropdreamer.backend.entity.User;
import com.dropdreamer.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // POST endpoint to add a user
    @PostMapping
    public User addUser(@RequestParam String userName) {
        User user = new User(userName);
        return userRepository.save(user);
    }
}