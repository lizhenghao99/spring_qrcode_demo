package com._2stackstudio.spring_qrcode_demo.serviceimpl;

import com._2stackstudio.spring_qrcode_demo.dao.UserDao;
import com._2stackstudio.spring_qrcode_demo.entity.User;
import com._2stackstudio.spring_qrcode_demo.service.UserService;
import com._2stackstudio.spring_qrcode_demo.util.QrcodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public BufferedImage getQrcodeByData(String data) throws Exception{
        return QrcodeGenerator.generateQrcodeImage(data);
    }

    @Override
    public BufferedImage getQrcodeByName(String name) throws Exception {
        User user = userDao.getUserByName(name);
        return QrcodeGenerator.generateQrcodeImage(user.getUser_data());
    }
}
