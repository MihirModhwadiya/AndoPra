package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Practical_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical7);

        Button one_btn = findViewById(R.id.one_btn);
        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Practical_7.this, "Mihir One Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        View.OnClickListener clk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Practical_7.this, "Mihir thired button clicked", Toast.LENGTH_SHORT).show();
            }
        };

        Button three_button = findViewById(R.id.three_btn);
        three_button.setOnClickListener(clk);
    }
    public void clickk(View view){
        Toast.makeText(this, "Mihir Second Button clicked", Toast.LENGTH_SHORT).show();
    }
}