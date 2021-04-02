package com._2stackstudio.spring_qrcode_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

import java.awt.image.BufferedImage;

@SpringBootApplication
@MapperScan("com._2stackstudio.spring_qrcode_demo.dao")
public class SpringQrcodeDemoApplication {

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringQrcodeDemoApplication.class, args);
    }

}
