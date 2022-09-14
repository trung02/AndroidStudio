package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName, edtPassWord;
    Button btnLogin, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = (EditText) findViewById(R.id.editTextUserName);
        edtPassWord = (EditText) findViewById(R.id.editTextPassWord);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(MainActivity.this, singin.class);
                startActivity(mh4);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "user";
                String password = "123";
                if(edtUserName.getText().toString().equals(username) && edtPassWord.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),"Dang Nhap Thanh Cong",Toast.LENGTH_LONG).show();
                    Intent mh2 = new Intent(MainActivity.this, Profile.class);
                    startActivity(mh2);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Tai Khoan Hoac Mat Khau Sai",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}