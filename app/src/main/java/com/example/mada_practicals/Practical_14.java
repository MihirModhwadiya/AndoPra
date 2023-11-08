package com.example.mada_practicals;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

public class Practical_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical14);

        Button btnAlertDialog = findViewById(R.id.btnAlertDialog);

        btnAlertDialog.setOnClickListener(v -> showAlertDialogs());
    }

    private void showAlertDialogs() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Simple AlertDialog")
                .setMessage("This is a simple AlertDialog")
                .setPositiveButton("OK", (dialog, which) -> {
                })
                .show();

        builder.setTitle("AlertDialog with Buttons")
                .setMessage("This is an AlertDialog with buttons")
                .setPositiveButton("Positive", (dialog, which) -> {
                })
                .setNegativeButton("Negative", (dialog, which) -> {
                })
                .setNeutralButton("Neutral", (dialog, which) -> {
                })
                .show();
    }

}