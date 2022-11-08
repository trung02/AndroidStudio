package com.example.sinhvien_connect_to_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class DangNhap extends AppCompatActivity {
    Button btndangnhap;
    TextView txvChuCoTaiKhoan;
    EditText edtNhapTen,edtNhapMK;
    String ten,mk;
    FirebaseFirestore db;
    CollectionReference sinhVien ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);

        //ánh xạ
        edtNhapTen = (EditText) findViewById(R.id.edtNhaptendndn);
        edtNhapMK = (EditText)findViewById(R.id.edtNhapMatKhaudn);
        txvChuCoTaiKhoan = (TextView) findViewById(R.id.tvChuaCoTaiKhoandn);
        btndangnhap = (Button)findViewById(R.id.btnDangNhapdn);

        //khai bao
        db = FirebaseFirestore.getInstance();
        sinhVien = db.collection("sinhVien");

        //su kien chua co tai khoan
        txvChuCoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DangNhap.this,DangkyActivity.class);
                startActivity(i);
            }
        });

        //su kien button đang nhap
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DangNhap.this,TrangchuActivity.class);
                ten = edtNhapTen.getText().toString();
                mk = edtNhapMK.getText().toString();
                if(edtNhapTen.equals("") || edtNhapMK.equals("")){
                    Toast.makeText(DangNhap.this, "Nhập đầy đủ thông tin đăng nhập", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    sinhVien.whereEqualTo("msv", ten)
                            .whereEqualTo("mk", mk)
                            .get()
                            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                    Toast.makeText(DangNhap.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                                    startActivity(i);
                                }
                            });
                }

            }
        });

    }
}