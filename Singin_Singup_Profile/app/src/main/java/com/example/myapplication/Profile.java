package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profile extends AppCompatActivity {

    Button myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button logoutbnt,saveBtn;
        EditText editTextAddress,editTextMail,editTextSchool,editTextPhone;

        ModelInfo modelInfo = new ModelInfo();
        modelInfo.setAddress("Address: Da Nang");
        modelInfo.setEmail("Email: huynhtrung02@gmail.com");
        modelInfo.setSchool("School: UTE");
        modelInfo.setPhone("Phone: 090999999");

        editTextAddress = findViewById(R.id.editTextAddress);
        editTextMail = findViewById(R.id.editTextMail);
        editTextSchool = findViewById(R.id.editTextSchool);
        editTextPhone = findViewById(R.id.editTextPhone);

        editTextAddress.setText(modelInfo.getAddress());
        editTextMail.setText(modelInfo.getEmail());
        editTextSchool.setText(modelInfo.getSchool());
        editTextPhone.setText(modelInfo.getPhone());

        saveBtn = findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modelInfo.setAddress(editTextAddress.getText().toString());
                modelInfo.setEmail(editTextMail.getText().toString());
                modelInfo.setSchool(editTextSchool.getText().toString());
                modelInfo.setPhone(editTextPhone.getText().toString());

                editTextAddress.setText(modelInfo.getAddress());
                editTextMail.setText(modelInfo.getEmail());
                editTextSchool.setText(modelInfo.getSchool());
                editTextPhone.setText(modelInfo.getPhone());
            }
        });

        myList = (Button) findViewById(R.id.myList);
        myList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh4 = new Intent(Profile.this, MainActivity_listGiay.class);
                startActivity(mh4);
            }
        });
        logoutbnt = (Button) findViewById(R.id.logoutBnt);
        logoutbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}