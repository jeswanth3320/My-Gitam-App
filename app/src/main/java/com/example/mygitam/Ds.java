package com.example.mygitam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Ds extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mylink1= new Intent(Intent.ACTION_VIEW);
                mylink1.setData(Uri.parse("https://drive.google.com/file/d/13455CspZZ4C4XQTGXblTAgadzZojEpVo/view?usp=sharing"));
                startActivity(mylink1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mylink2= new Intent(Intent.ACTION_VIEW);
                mylink2.setData(Uri.parse("https://drive.google.com/file/d/13455CspZZ4C4XQTGXblTAgadzZojEpVo/view?usp=sharing"));
                startActivity(mylink2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mylink3= new Intent(Intent.ACTION_VIEW);
                mylink3.setData(Uri.parse("https://drive.google.com/file/d/13455CspZZ4C4XQTGXblTAgadzZojEpVo/view?usp=sharing"));
                startActivity(mylink3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mylink4= new Intent(Intent.ACTION_VIEW);
                mylink4.setData(Uri.parse("https://drive.google.com/file/d/13455CspZZ4C4XQTGXblTAgadzZojEpVo/view?usp=sharing"));
                startActivity(mylink4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mylink5= new Intent(Intent.ACTION_VIEW);
                mylink5.setData(Uri.parse("https://drive.google.com/file/d/13455CspZZ4C4XQTGXblTAgadzZojEpVo/view?usp=sharing"));
                startActivity(mylink5);
            }
        });
    }
}