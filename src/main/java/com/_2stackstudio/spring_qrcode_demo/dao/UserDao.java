package com._2stackstudio.spring_qrcode_demo.dao;

import com._2stackstudio.spring_qrcode_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User getUserById(@Param("id") Long id);

    User getUserByName(@Param("name") String name);

    void insertUser(User user);
}
