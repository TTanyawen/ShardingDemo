package com.example.shardinngdemo.controller;


import com.example.shardinngdemo.dao.entity.User2;
import com.example.shardinngdemo.service.User2Service;
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
    private User2Service user2Service;

    @GetMapping("/save")
    public String saveUser() {
        User2 user=new User2();
        user.setPassword("pw123456");
        user.setIdcard("441223200310142640");
        User2 user2=user2Service.saveUser2(user);
        return user2.getId().toString();
    }

    @GetMapping("/getAll")
    public String getAllUsers() throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
//        User2 user = new User2();
//        user.setId(1L);
//        user.setPassword("pw123456");
//        user.setIdcard("441223200310142640");
//
//        String json = objectMapper.writeValueAsString(user);
//        System.out.println(json);

        return objectMapper.writeValueAsString(user2Service.getAllUsers());
    }

    @GetMapping("/getAll2")
    public List<User2> getAllUsers2()  {
        return user2Service.getAllUsers();
    }
}
