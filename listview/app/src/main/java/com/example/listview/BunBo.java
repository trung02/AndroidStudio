package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BunBo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnql;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bun_bo);

        btnql = (Button) findViewById(R.id.buttonql);
        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh1 = new Intent( BunBo.this, MainActivity.class);
                startActivity(mh1);
            }
        });
    }
}