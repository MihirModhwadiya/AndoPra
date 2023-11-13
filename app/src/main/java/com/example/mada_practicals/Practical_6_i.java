package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Practical_6_i extends AppCompatActivity {
    String username, email, password, phone_number,radio;
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical6_i);

        disp = findViewById(R.id.disp);

        Intent intentt = getIntent();

        username = intentt.getStringExtra("username");
        password = intentt.getStringExtra("password");
        email = intentt.getStringExtra("email");
        phone_number = intentt.getStringExtra("number");
        radio = intentt.getStringExtra("radio");



    }
}