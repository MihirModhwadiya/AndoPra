package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Practical_11 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ListView lstv;
    String[] lst = {"india", "USA", "UK"};
    Spinner spinner;
    int[] flag = {R.drawable.india, R.drawable.usa, R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical11);

//        flag[0] = findViewById(R.drawable.india);

        lstv = findViewById(R.id.main_lst);
        spinner = findViewById(R.id.spinner);

//        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.activity_item, R.id.title, lst);

        Custom_adapter ad = new Custom_adapter(lst, flag, this);

//        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.activity_item, R.id.title, lst);
//        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(this);

//        lstv.setAdapter(ad);

        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Practical_11.this, ""+lst[i], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, ""+lst[i], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}