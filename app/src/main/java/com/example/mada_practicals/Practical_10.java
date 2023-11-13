package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Practical_10 extends AppCompatActivity {
    EditText username, password;
    Button submit;
    CheckBox remember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical10);
        submit = findViewById(R.id.login);
        username = findViewById(R.id.edit_username);
        password = findViewById(R.id.edit_password);
        remember = findViewById(R.id.remember);

        SharedPreferences sp = getSharedPreferences("LogIn", MODE_PRIVATE);
        username.setText(sp.getString("username", ""));
        password.setText(sp.getString("password", ""));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                EditText username = findViewById(R.id.edit_username);
//                EditText password = findViewById(R.id.edit_password);
//                CheckBox checked = findViewById(R.id.remember);

                SharedPreferences sp = getSharedPreferences("LogIn", MODE_PRIVATE);

                if (remember.isChecked()) {
                    sp.edit().putString("username", username.getText().toString()).apply();
                    sp.edit().putString("password", password.getText().toString()).apply();
                }
                if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    Intent intent = new Intent(Practical_10.this, activity_practical_5_1_2.class);
                    intent.putExtra("username", username.getText().toString());
                    intent.putExtra("password", password.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}