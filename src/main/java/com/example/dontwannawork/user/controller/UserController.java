package com.example.dontwannawork.user.controller;

import com.example.dontwannawork.user.entity.User;
import com.example.dontwannawork.user.service.UserService;
import com.example.dontwannawork.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    @GetMapping("/users/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/name/{name}")
    public List<User> findByName(@PathVariable String name){
        return userService.findAllByName(name);
    }

}
