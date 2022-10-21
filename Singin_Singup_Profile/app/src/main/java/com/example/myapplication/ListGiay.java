package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ListGiay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView;

        ArrayList<Giay> arrayList;
        AdapterGiay adapter;
        TextView detail = findViewById(R.id.textViewDescription);

        listView = findViewById(R.id.listviewgiay);

        Button backBnt = (Button) findViewById(R.id.backBtn);
        arrayList = new ArrayList<>();

        arrayList.add(new Giay("Yeezy 1", 300.000, R.drawable.yeezy1,"Sản phẩm này may bằng vải công nghệ Primeblue, chất liệu tái chế hiệu năng cao có sử dụng sợi Parley Ocean Plastic. 50% thân giày làm bằng vải dệt, 92% vải dệt bằng sợi Primeblue. Không sử dụng polyester nguyên sinh."));
        arrayList.add(new Giay("Yeezy 2", 350.000, R.drawable.yeezy2,"Sản phẩm này may bằng vải công nghệ Primeblue, chất liệu tái chế hiệu năng cao có sử dụng sợi Parley Ocean Plastic. 50% thân giày làm bằng vải dệt, 92% vải dệt bằng sợi Primeblue. Không sử dụng polyester nguyên sinh."));
        arrayList.add(new Giay("Yeezy 3",150.000, R.drawable.yeezy3,"Sản phẩm này may bằng vải công nghệ Primeblue, chất liệu tái chế hiệu năng cao có sử dụng sợi Parley Ocean Plastic. 50% thân giày làm bằng vải dệt, 92% vải dệt bằng sợi Primeblue. Không sử dụng polyester nguyên sinh."));
        arrayList.add(new Giay("Yeezy 4", 1000.000, R.drawable.yeezy4,"Sản phẩm này may bằng vải công nghệ Primeblue, chất liệu tái chế hiệu năng cao có sử dụng sợi Parley Ocean Plastic. 50% thân giày làm bằng vải dệt, 92% vải dệt bằng sợi Primeblue. Không sử dụng polyester nguyên sinh."));

        adapter = new AdapterGiay(ListGiay.this,R.layout.layout_giay,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListGiay.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        backBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListGiay.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}