package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Practical_4 extends AppCompatActivity {
    TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical4);

        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonCreate";

        txt_view.setText(state);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonStart";

        txt_view.setText(state);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonResume";

        txt_view.setText(state);
    }

    @Override
    protected void onPause() {
        super.onPause();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonPause";

        txt_view.setText(state);
    }

    @Override
    protected void onStop() {
        super.onStop();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonStop";

        txt_view.setText(state);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonRestart";

        txt_view.setText(state);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        txt_view = findViewById(R.id.txt_view);
        String state = (txt_view.getText().toString()) + "\n\nonDestroy";

        txt_view.setText(state);
    }

}