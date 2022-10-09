package com.example.myapplication;

public class ModelInfo {
    private String address;
    private String email;
    private String phone;
    private String school;

    public ModelInfo() {
    }

    public ModelInfo(String address, String email, String phone, String school) {
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.school = school;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
