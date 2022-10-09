package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_listGiay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView;
        ArrayList<Giay> arrayList;
        AdapterGiay adapter;

        listView = findViewById(R.id.listviewgiay);
        Button backBnt = (Button) findViewById(R.id.backBtn);
        arrayList = new ArrayList<>();

        arrayList.add(new Giay("Yeezy 1", "ĐƠN GIÁ: 300.000 VNĐ", R.drawable.yeezy1));
        arrayList.add(new Giay("Yeezy 2", "ĐƠN GIÁ: 350.000 VNĐ", R.drawable.yeezy2));
        arrayList.add(new Giay("Yeezy 3", "ĐƠN GIÁ: 150.000 VNĐ", R.drawable.yeezy3));
        arrayList.add(new Giay("Yeezy 4", "ĐƠN GIÁ: 1000.000 VNĐ", R.drawable.yeezy4));

        adapter = new AdapterGiay(MainActivity_listGiay.this,R.layout.layout_giay,arrayList);
        listView.setAdapter(adapter);
        backBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_listGiay.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}