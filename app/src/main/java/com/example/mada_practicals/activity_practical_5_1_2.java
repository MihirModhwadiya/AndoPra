package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class activity_practical_5_1_2 extends AppCompatActivity {

    TextView username, pass;
    String user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical512);

        username = findViewById(R.id.username);
        pass = findViewById(R.id.pass);

        Intent intent = getIntent();
        user = intent.getStringExtra("username");
        password = intent.getStringExtra("password");

        username.setText(user);
        pass.setText(password);

    }
}