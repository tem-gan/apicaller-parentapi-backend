package com.example.api_caller;


public class User {


    Long id;

    private String username;

    private String password;

    private String iv;

    public  User(){

    }
    public User(Long id, String username, String password, String iv,String desc) {
//        this.id=id;
//        this.username=username;
//        this.password=password;
//        this.iv=iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getIv() {
        return iv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

