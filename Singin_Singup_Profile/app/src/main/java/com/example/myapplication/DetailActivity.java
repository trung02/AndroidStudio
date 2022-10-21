package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);
        List<Integer> image = new ArrayList<>();

        TextView backList = findViewById(R.id.backList);
        image.add(R.drawable.yeezy1);
        image.add(R.drawable.yeezy2);
        image.add(R.drawable.yeezy3);
        image.add(R.drawable.yeezy4);

        Button next = findViewById(R.id.nextImage);
        Button back = findViewById(R.id.backImage);
        ImageView imageView = findViewById(R.id.imageViewDescription);
        imageView.setImageResource(image.get(0));
        int i = 0;
        next.setOnClickListener(new View.OnClickListener() {
            int j = i;
            List<Integer> image2 = image;
            @Override
            public void onClick(View view) {
                imageView.setImageResource(image.get(j));
                j++;
                if(j == image2.size()){
                    j = 0;
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            int j = i;
            List<Integer> image2 = image;
            @Override
            public void onClick(View view) {
                imageView.setImageResource(image.get(j));
                j++;
                if(j == image2.size()){
                    j = 0;
                }
            }
        });
        backList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, ListGiay.class);
                startActivity(intent);
            }
        });
    }

}
