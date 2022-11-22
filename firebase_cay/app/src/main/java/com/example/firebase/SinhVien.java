package com.example.firebase;

public class SinhVien {
    private String name;
    private String msv;
    private String description;
    private String maula;
    private int image;

    public SinhVien() {
    }

    public SinhVien(String name, String msv, String description, String maula, int image) {
        this.name = name;
        this.msv = msv;
        this.description = description;
        this.maula = maula;
        this.image = image;
    }

    public String getMaula() {
        return maula;
    }

    public void setMaula(String maula) {
        this.maula = maula;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
