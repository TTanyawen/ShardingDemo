package com.example.shardinngdemo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.shardinngdemo.serialization.IdCardDesensitizationSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@TableName("user2")
public class User2 {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String password;

    @JsonSerialize(using = IdCardDesensitizationSerializer.class)
    private String idcard;

}
