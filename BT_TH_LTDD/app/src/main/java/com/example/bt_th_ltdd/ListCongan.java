package com.example.bt_th_ltdd;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ListCongan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = null;
        Adapter adapter;
        List<Congan> conganList = null;
        conganList.add(new Congan("cong an 1","cap 2","Da Nang",2,R.drawable.bglogin3));

        listView.findViewById(R.id.listview);
        adapter = new Adapter(ListCongan.this,R.layout.layout_congan,conganList);
        listView.setAdapter(adapter);


    }
}
