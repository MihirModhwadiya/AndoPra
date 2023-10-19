package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class activity_practical_5_1_2 extends AppCompatActivity {

    EditText username, password;
    Button submit;
    CheckBox remember;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical512);
        submit = findViewById(R.id.sum);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        remember = findViewById(R.id.remember);

        SharedPreferences sp = getSharedPreferences("LogIn", MODE_PRIVATE);
        username.setText(sp.getString("username", ""));
        password.setText(sp.getString("password", ""));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username = findViewById(R.id.username), password = findViewById(R.id.password);
                CheckBox checked = findViewById(R.id.remember);

                SharedPreferences sp = getSharedPreferences("LogIn", MODE_PRIVATE);

                if(checked.isChecked()){
                    sp.edit().putString("username", username.getText().toString()).apply();
                    sp.edit().putString("password", password.getText().toString()).apply();
                }

                if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Intent intent = new Intent(activity_practical_5_1_2.this, Practical_5_1_LinearLayout.class);
                    intent.putExtra("username", username.getText().toString());
                    intent.putExtra("password", password.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}