package com.example.mada_practicals;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Practical_15 extends AppCompatActivity {

    private DBHandler dbHandler;
    private EditText inputEditText, idUpdateEditText, nameUpdateEditText, idDeleteEditText;
    private TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical15);

        dbHandler = new DBHandler(this);
        inputEditText = findViewById(R.id.inputEditText);
        idUpdateEditText = findViewById(R.id.id_update);
        nameUpdateEditText = findViewById(R.id.name_update);
        idDeleteEditText = findViewById(R.id.id_delete);
        displayTextView = findViewById(R.id.displayTextView);
    }

    public void insertData(View view) {
        String stdName = inputEditText.getText().toString();
        dbHandler.addStd(stdName);
        displayData(view);
    }

    public void updateData(View view) {
        String stdId = idUpdateEditText.getText().toString();
        String stdName = nameUpdateEditText.getText().toString();

        if (!stdId.isEmpty() && !stdName.isEmpty()) {
            int enrollmentId = Integer.parseInt(stdId);
            dbHandler.updateStd(enrollmentId, stdName);
            displayData(view);
        }
    }

    public void deleteData(View view) {
        String stdId = idDeleteEditText.getText().toString();

        if (!stdId.isEmpty()) {
            int enrollmentId = Integer.parseInt(stdId);
            dbHandler.deleteStd(enrollmentId);
            displayData(view);
        }
    }

    public void displayData(View view) {
        String data = dbHandler.getData();
        displayTextView.setText(data);
    }
}
