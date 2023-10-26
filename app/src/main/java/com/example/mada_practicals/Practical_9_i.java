package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Practical_9_i extends AppCompatActivity {
    TextView username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical9_i);

        Intent intent = getIntent();
        String a = intent.getStringExtra("username");
        String b = intent.getStringExtra("password");

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        username.setText(a);
        password.setText(b);
    }
}