package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import java.util.ArrayList;
import java.util.List;


public class singin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn3,submit;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        btn3 = (Button) findViewById(R.id.registerBnt);
        submit = (Button) findViewById(R.id.button);
        String user = ((EditText) findViewById(R.id.editTextUserName)).getText().toString();
        String password =((EditText) findViewById(R.id.editTextPassWord)).getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = user;
                String passwordc = password;
                FirebaseAuth mAuth = FirebaseAuth.getInstance();
                mAuth.createUserWithEmailAndPassword(email, passwordc)
                        .addOnCompleteListener(singin.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent mh3 = new Intent(singin.this, MainActivity.class);
                                    startActivity(mh3);
                                    finishAffinity();
                                } else {
                                    Toast.makeText(singin.this, "create fail", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
    }
}