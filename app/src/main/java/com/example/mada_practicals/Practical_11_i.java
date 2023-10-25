package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Practical_11_i extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ListView lstv;
    String[] lst = {"india", "USA", "UK"};
    int[] flag = {R.drawable.india, R.drawable.usa, R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical11_i);

        lstv = findViewById(R.id.main_lst);

        Custom_adapter ad = new Custom_adapter(lst, flag, this);

        lstv.setAdapter(ad);

        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Practical_11_i.this, ""+lst[i], Toast.LENGTH_SHORT).show();
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