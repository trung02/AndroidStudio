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
    private List<ModelAccount> list = new ArrayList<>();
    public List<ModelAccount> getList() {
        return list;
    }

    public void setList(List<ModelAccount> list) {
        this.list = list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        btn3 = (Button) findViewById(R.id.button);
        String user = ((EditText) findViewById(R.id.editTextUserName)).getText().toString();
        String password =((EditText) findViewById(R.id.editPass)).getText().toString();
        list.add(new ModelAccount(user,password));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(singin.this, MainActivity.class);
                startActivity(mh3);
            }
        });
    }
}