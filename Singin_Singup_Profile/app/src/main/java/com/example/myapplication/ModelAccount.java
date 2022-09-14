package com.example.myapplication;

public class ModelAccount {
    private String userName;
    private String password;

    public ModelAccount(String userName, String password){
        this.userName= userName;
        this.password = password;
    }
    public ModelAccount(){
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
