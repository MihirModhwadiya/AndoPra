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
        Button btnCustomDialog = findViewById(R.id.btnCustomDialog);


        btnAlertDialog.setOnClickListener(v -> showAlertDialogs());
        btnCustomDialog.setOnClickListener(v -> showCustomDialog());
    }
    private void showAlertDialogs() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Simple AlertDialog
        builder.setTitle("Simple AlertDialog")
                .setMessage("This is a simple AlertDialog")
                .setPositiveButton("OK", (dialog, which) -> {
                    // Handle positive button click
                })
                .show();

        // AlertDialog with buttons
        builder.setTitle("AlertDialog with Buttons")
                .setMessage("This is an AlertDialog with buttons")
                .setPositiveButton("Positive", (dialog, which) -> {
                    // Handle positive button click
                })
                .setNegativeButton("Negative", (dialog, which) -> {
                    // Handle negative button click
                })
                .setNeutralButton("Neutral", (dialog, which) -> {
                    // Handle neutral button click
                })
                .show();
    }

    // Method to display a Custom Dialog
    private void showCustomDialog() {
        // Create and show a custom dialog
        Dialog customDialog = new Dialog(this);
        customDialog.setContentView(R.layout.custom_dialog_layout);

        Button closeDialogButton = customDialog.findViewById(R.id.btnCloseDialog);
        closeDialogButton.setOnClickListener(v -> customDialog.dismiss());

        customDialog.show();
    }
}