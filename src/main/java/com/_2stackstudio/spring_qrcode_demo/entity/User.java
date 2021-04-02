package com._2stackstudio.spring_qrcode_demo.entity;

public class User {
    private Long user_id;
    private String username;
    private String user_data;

    public User(Long user_id, String username, String user_data) {
        this.user_id = user_id;
        this.username = username;
        this.user_data = user_data;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_data() {
        return user_data;
    }

    public void setUser_data(String user_data) {
        this.user_data = user_data;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", user_data='" + user_data + '\'' +
                '}';
    }
}
