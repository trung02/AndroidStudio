package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button subm =(Button) findViewById(R.id.btn);
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        TextView result = findViewById(R.id.result);
        subm.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                       double h = Double.parseDouble(height.getText().toString());
                       double w = Double.parseDouble(weight.getText().toString());
                       DecimalFormat formatter = new DecimalFormat("#0.00");
                       double res = w/(h*h);
                       String BMI ;
                       if(res < 18){
                           BMI ="BMI = "+formatter.format(res)+ " : Người gầy";
                       }else if(res >= 18 && res < 24.9){
                           BMI ="BMI = "+formatter.format(res)+ " : Người bình thường";
                       }else if(res >= 25 && res < 29.9){
                           BMI ="BMI = "+formatter.format(res)+ " : Người béo phì độ I";
                       }else if(res >= 30 && res < 34.9){
                           BMI ="BMI = "+formatter.format(res)+ " : Người béo phì độ II";
                       }else if(res >= 35){
                           BMI ="BMI = "+formatter.format(res)+ " : Người béo phì độ III";
                       }else{
                           BMI ="BMI = "+formatter.format(res)+ " : Chỉ số cơ thể không hợp lệ";
                       }
                       result.setText(BMI);
                    }
                });


    }
}