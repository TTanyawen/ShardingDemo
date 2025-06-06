package com.example.shardinngdemo.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shardinngdemo.dao.entity.User;
import com.example.shardinngdemo.dao.mapper.UserMapper;
import com.example.shardinngdemo.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    public User saveUser(User user) {
        this.save(user);
        return user;
    }
    public List<User> getAllUsers() {
        return this.list();
    }
}