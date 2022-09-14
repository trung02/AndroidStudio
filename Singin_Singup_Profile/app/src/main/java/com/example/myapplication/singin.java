package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class singin extends AppCompatActivity {

    public List<ModelAccount> createAccount(ModelAccount acc){
        List<ModelAccount> list = new ArrayList<>();
        list.add(acc);
        return list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        btn3 = (Button) findViewById(R.id.button);
        EditText user = findViewById(R.id.editTextUserName);
        EditText password = findViewById(R.id.editPass);
        ModelAccount acc = new ModelAccount();
        acc.setUsername(user.getText().toString());
        acc.setPassword(password.getText().toString());
        createAccount(acc);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(singin.this, MainActivity.class);
                startActivity(mh3);
            }
        });
    }
}