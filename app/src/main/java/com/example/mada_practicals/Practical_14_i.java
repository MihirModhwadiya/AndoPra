package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;

public class Practical_14_i extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical14_i);

        Button btnCustomDialog = findViewById(R.id.btnCustomDialog);

        btnCustomDialog.setOnClickListener(v -> showCustomDialog());
    }

    private void showCustomDialog() {
        // Create and show a custom dialog
        Dialog customDialog = new Dialog(this);
        customDialog.setContentView(R.layout.custom_dialog_layout);

        Button closeDialogButton = customDialog.findViewById(R.id.btnCloseDialog);
        closeDialogButton.setOnClickListener(v -> customDialog.dismiss());

        customDialog.show();
    }
}