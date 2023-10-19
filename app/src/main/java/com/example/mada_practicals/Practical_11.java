package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Practical_11 extends AppCompatActivity {

    ListView lstv;
    String[] lst = {"india", "USA", "UK"};
    int[] flag = {R.drawable.india, R.drawable.usa, R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical11);

//        flag[0] = findViewById(R.drawable.india);

        lstv = findViewById(R.id.main_lst);

//        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.activity_item, R.id.title, lst);
        Custom_adapter ad = new Custom_adapter(lst, flag, this);

        lstv.setAdapter(ad);

    }
}