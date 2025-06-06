package com.example.shardinngdemo.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shardinngdemo.dao.entity.User2;
import com.example.shardinngdemo.dao.mapper.User2Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User2Service extends ServiceImpl<User2Mapper, User2> {
    public User2 saveUser2(User2 user) {
        this.save(user);
        return user;
    }
    public List<User2> getAllUsers() {
        return this.list();
    }
}