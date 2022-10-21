package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    singin a = new singin();
    List<ModelAccount> list = a.getList();
    EditText edtUserName, edtPassWord;
    Button btnLogin, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = (EditText) findViewById(R.id.editTextUserName);
        edtPassWord = (EditText) findViewById(R.id.editTextPassWord);
        btnLogin = (Button) findViewById(R.id.submitBnt);
        btn4 = (Button) findViewById(R.id.registerBnt);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(MainActivity.this, singin.class);
                startActivity(mh4);
            }
        });
        list.add(new ModelAccount("user1","123"));
        list.add(new ModelAccount("user2","123"));
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(ModelAccount acc : list){
                    if(edtUserName.getText().toString().equals(acc.getUserName()) && edtPassWord.getText().toString().equals(acc.getPassword())){
                        Toast.makeText(getApplicationContext(),"Dang Nhap Thanh Cong",Toast.LENGTH_LONG).show();
                        Intent mh2 = new Intent(MainActivity.this, Profile.class);
                        startActivity(mh2);
                        break;
                    }else{
                        Toast.makeText(getApplicationContext(),"Tai Khoan Hoac Mat Khau Sai",Toast.LENGTH_LONG).show();
                    }
                }
            }

        });
    }


}