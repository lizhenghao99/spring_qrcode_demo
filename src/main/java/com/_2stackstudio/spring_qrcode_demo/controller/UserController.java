package com._2stackstudio.spring_qrcode_demo.controller;

import com._2stackstudio.spring_qrcode_demo.entity.User;
import com._2stackstudio.spring_qrcode_demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public User getUserByName(@PathVariable("name") String name) {
        return userService.getUserByName(name);
    }

    @PostMapping("/create")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @GetMapping(value = "/qrcode/data", produces = MediaType.IMAGE_PNG_VALUE)
    public BufferedImage getQrcodeByData(@Param("data") String data) throws Exception{
        return userService.getQrcodeByData(data);
    }

    @GetMapping(value = "/qrcode/name/{name}", produces = MediaType.IMAGE_PNG_VALUE)
    public BufferedImage getQrcodeByName(@PathVariable("name") String name) throws Exception {
        return userService.getQrcodeByName(name);
    }
}
