package com._2stackstudio.spring_qrcode_demo.service;

import com._2stackstudio.spring_qrcode_demo.entity.User;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public interface UserService {
    User getUserById(Long id);
    User getUserByName(String name);
    BufferedImage getQrcodeByData(String data) throws Exception;
    BufferedImage getQrcodeByName(String name) throws Exception;
    void insertUser(User user);
}
