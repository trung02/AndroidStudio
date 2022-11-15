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
        conganList.add(new Congan("Cong an 1","Cap trung uy","Da Nang",5,R.drawable.can1));
        conganList.add(new Congan("Cong an 2","Cap dai uy","Da Nang",5,R.drawable.can2));
        conganList.add(new Congan("Cong an 3","Cap trung uy","Da Nang",5,R.drawable.can3));
        conganList.add(new Congan("Cong an 4","Cap dai uy","Da Nang",5,R.drawable.can4));

        listView.findViewById(R.id.listview);
        adapter = new Adapter(ListCongan.this,R.layout.layout_congan,conganList);
        listView.setAdapter(adapter);


    }
}
