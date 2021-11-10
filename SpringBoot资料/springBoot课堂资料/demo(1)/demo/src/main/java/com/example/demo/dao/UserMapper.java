package com.example.demo.dao;

import com.example.demo.entity.TBUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 作者: MrZhangJR
 * 时间: 2020/8/18 17:23
 * 描述: 用户mapper接口
 */
public interface UserMapper {

    /**
     * 获取用户信息
     * @return
     */
    List<TBUserEntity> getUserEntityList();

}
