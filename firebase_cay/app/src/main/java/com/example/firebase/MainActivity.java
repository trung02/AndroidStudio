package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText edtUserName, edtPassWord;
    Button btnLogin, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("cay");
        List<SinhVien> sinhViens = new ArrayList<>();


        SinhVien a = new SinhVien("Cây tre","cây tre","cây tre rất cao","mau xanh",R.drawable.caytre);
        SinhVien b = new SinhVien("Cây bàn","cây bàn","tán lá to ","mau xanh",R.drawable.cayban);
        sinhViens.add(a);
        sinhViens.add(b);
        myRef.setValue(sinhViens);


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

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickSignin();
            }

            private void onClickSignin() {
                String email = edtUserName.getText().toString();
                String password = edtPassWord.getText().toString();
                FirebaseAuth mAuth = FirebaseAuth.getInstance();
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(MainActivity.this, ListSinhvien.class);
                                    startActivity(intent);
                                    finishAffinity();
                                } else {
                                    Toast.makeText(MainActivity.this, "Authentication fail", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }

        });
    }
}