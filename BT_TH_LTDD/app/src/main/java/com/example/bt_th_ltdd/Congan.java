package com.example.bt_th_ltdd;

public class Congan {
    private String ten;
    private String capBac;
    private String noiCongTac;
    private int soSao;
    private int hinhAnh;

    public Congan() {
    }

    public Congan(String ten, String capBac, String noiCongTac, int soSao, int hinhAnh) {
        this.ten = ten;
        this.capBac = capBac;
        this.noiCongTac = noiCongTac;
        this.soSao = soSao;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public int getSoSao() {
        return soSao;
    }

    public void setSoSao(int soSao) {
        this.soSao = soSao;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
