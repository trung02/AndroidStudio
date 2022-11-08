package com.example.sinhvien_connect_to_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DangkyActivity extends AppCompatActivity {
    TextView txvDaCoTaiKhoan;
    EditText edtNhapTen,edtNhapTuoi,edtNhapLop,edtNhapMSV,edtNhapMk,edtNhaplaimk;
    Button btnDangKy;
    String ten,tuoi,lop,msv,mk,nhapLaimk;
    FirebaseFirestore db;

    CollectionReference sinhVien ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangky);

        //ánh xạ
        txvDaCoTaiKhoan = (TextView) findViewById(R.id.tvDaCoTaiKhoandk);
        btnDangKy =(Button) findViewById(R.id.btnDangKy);
        edtNhapTen = (EditText)findViewById(R.id.edtNhapTenNguoiDungdk);
        edtNhapTuoi= (EditText)findViewById(R.id.edtNhapTuoidk);
        edtNhapLop = (EditText)findViewById(R.id.edtNhapLopdk);
        edtNhapMSV = (EditText)findViewById(R.id.edtNhapMaSinhViendk);
        edtNhapMk = (EditText)findViewById(R.id.edtNhapMatKhaudk);
        edtNhaplaimk= (EditText)findViewById(R.id.edtNhapMatKhaudk);

        //khai bao
        db = FirebaseFirestore.getInstance();
        sinhVien = db.collection("sinhVien");



        //su kien da co tai khoan
        txvDaCoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DangkyActivity.this, DangNhap.class);
                startActivity(i);
            }
        });

        // Sự kiện click button đăng ký
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Gán giá trị
                ten=edtNhapTen.getText().toString();
                tuoi= edtNhapTuoi.getText().toString();
                lop=edtNhapLop.getText().toString();
                msv=edtNhapMSV.getText().toString();
                mk=edtNhapMk.getText().toString();
                nhapLaimk=edtNhaplaimk.getText().toString();

                    Map<String, Object> sv = new HashMap<>();
                    sv.put("ten", ten);
                    sv.put("tuoi",tuoi);
                    sv.put("lop",lop);
                    sv.put("msv", msv);
                    sv.put("mk", mk);
                    sv.put("nhapLaimk", nhapLaimk);
                if(ten.equals("")||tuoi.equals("")||lop.equals("")||msv.equals("")||mk.equals("")||nhapLaimk.equals("")){
                        Toast.makeText(DangkyActivity.this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else{
                        sinhVien.add(sv).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(DangkyActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                            }
                        });

                }





            }
        });

    }
}