package com.example.sinhvien_connect_to_firebase;


public class SinhVien {
    private  String maSV,tenSV,tuoiSV,lopSV,matKhau,nhapLaiMatKhau;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(String tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public String getLopSV() {
        return lopSV;
    }

    public void setLopSV(String lopSV) {
        this.lopSV = lopSV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNhapLaiMatKhau() {
        return nhapLaiMatKhau;
    }

    public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }

    public SinhVien(String maSV, String tenSV, String tuoiSV, String lopSV, String matKhau, String nhapLaiMatKhau) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoiSV = tuoiSV;
        this.lopSV = lopSV;
        this.matKhau = matKhau;
        this.nhapLaiMatKhau = nhapLaiMatKhau;
    }
}
