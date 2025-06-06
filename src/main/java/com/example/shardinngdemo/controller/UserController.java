package com.example.shardinngdemo.controller;


import com.example.shardinngdemo.dao.entity.User;
import com.example.shardinngdemo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/save")
    public String saveUser(String username) {
        User user=new User();
        user.setPassword("pw123456");
        user.setIdcard("441223200310142640");
        user.setUsername(username);
        User user2=userService.saveUser(user);
        return user.getId().toString();
    }

    @GetMapping("/getAll")
    public String getAllUsers() throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(userService.getAllUsers());
    }

    @GetMapping("/getAll/v2")
    public List<User> getAllUsers_v2()  {
        return userService.getAllUsers();
    }
}
