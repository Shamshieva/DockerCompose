package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;


    @GetMapping("/getAllUsers")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
