package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ListSinhvien extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView;

        ArrayList<SinhVien> arrayList;
        AdapterSinhvien adapter;
        //TextView detail = findViewById(R.id.textViewDescription);

        listView = findViewById(R.id.listviewsv);

        Button backBnt = (Button) findViewById(R.id.backBtn);
        arrayList = new ArrayList<>();
        DatabaseReference database = FirebaseDatabase.getInstance().getReference("list");

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    SinhVien sinhVien = dataSnapshot.getValue(SinhVien.class);
                    arrayList.add(sinhVien);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        List<SinhVien> sinhViens = new ArrayList<>();


        SinhVien a = new SinhVien("Cây tre","cây tre","cây tre rất cao","mau xanh",R.drawable.caytre);
        SinhVien b = new SinhVien("Cây bàn","cây bàn","tán lá to ","mau xanh",R.drawable.cayban);
        sinhViens.add(a);
        sinhViens.add(b);
        adapter = new AdapterSinhvien(ListSinhvien.this,R.layout.layout_sinhvien,sinhViens);
        listView.setAdapter(adapter);

    }
}