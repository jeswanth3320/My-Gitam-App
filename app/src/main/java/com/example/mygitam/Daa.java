package com.example.mygitam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Daa extends AppCompatActivity {
    ListView pdfListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daa);
        pdfListview = (ListView) findViewById(R.id.myPdfListview1);
        String[] pdfFiles = {"Module 1-DAA", "Module 2-DAA", "Module 3-DAA", "Module 4-DAA", "Module 5-DAA"};
        ArrayAdapter<String> adapter21 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(R.id.textView1);
                return view;
            }
        };
        pdfListview.setAdapter(adapter21);
        pdfListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView ,View view,int i ,long l) {
                String item =pdfListview.getItemAtPosition(i).toString();
                Intent start =new Intent(getApplicationContext(),Pdfopener1.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);

            }
        });
    }
}