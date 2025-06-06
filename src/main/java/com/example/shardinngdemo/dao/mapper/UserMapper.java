package com.example.shardinngdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardinngdemo.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
