package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Practical_5_1_LinearLayout extends AppCompatActivity {
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical51_linear_layout);
        Intent intent = getIntent();
        String a = intent.getStringExtra("username");
        String b = intent.getStringExtra("password");
        view = findViewById(R.id.disp);
        view.setText(a + "\n\n" + b);
    }
}