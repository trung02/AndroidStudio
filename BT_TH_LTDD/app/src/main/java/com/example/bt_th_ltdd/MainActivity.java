package com.example.bt_th_ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName, edtPassWord;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(edtUserName.getText().toString().equals("abc") && edtPassWord.getText().toString().equals("123")){
                        Toast.makeText(getApplicationContext(),"Dang Nhap Thanh Cong",Toast.LENGTH_LONG).show();
                        Intent mh2 = new Intent(MainActivity.this, ListCongan.class);
                        startActivity(mh2);
                    }else{
                        Toast.makeText(getApplicationContext(),"Tai Khoan Hoac Mat Khau Sai",Toast.LENGTH_LONG).show();
                    }
                }
        });
    }
}