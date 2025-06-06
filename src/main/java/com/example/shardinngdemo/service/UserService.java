package com.example.shardinngdemo.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

    // 根据username查询
    public User getUserByUsername(String username) {
        return this.getOne(new QueryWrapper<User>().eq("username", username));
    }
}