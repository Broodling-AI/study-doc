package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者: MrZhangJR
 * 时间: 2020/8/17 11:15
 * 描述: 用户实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private String userName;

    private Integer userAge;

    private String userGender;


}
