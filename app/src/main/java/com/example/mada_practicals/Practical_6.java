package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Practical_6 extends AppCompatActivity {

    EditText username, email, password, phone_number;
    RadioGroup radio;
    RadioButton radio1, radio2;
    CheckBox cricket, football, hockey;
    Button submit;
    RadioButton selectedRadioButton;

    DatePicker date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical6);

        username = findViewById(R.id.edit_username);
        email = findViewById(R.id.edit_email);
        password = findViewById(R.id.edit_password);
        phone_number = findViewById(R.id.edit_number);

        cricket = findViewById(R.id.edit_hobby1);
        football = findViewById(R.id.edit_hobby2);
        hockey = findViewById(R.id.edit_hobby3);

        submit = findViewById(R.id.submit);
        submit.setEnabled(false);
        radio = findViewById(R.id.radioGroup);



        date = findViewById(R.id.edit_date);

        username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validate();
            }
        });

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validate();
            }
        });

        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validate();
            }
        });

        phone_number.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validate();
            }
        });
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        hockey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        submit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                validate();
            }
        });
    }

    public void validate() {
        boolean isusernameValid = !(username.getText().toString().isEmpty());
        boolean ispasswordValid = !(password.getText().toString().isEmpty());
        boolean isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches();
        boolean isPhoneNumberValid = phone_number.getText().toString().length() == 10;

        radio = findViewById(R.id.radioGroup);
        int selectedRadioButtonId = radio.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedRadioButtonId);
        if (selectedRadioButton != null) {
            submit.setEnabled(isEmailValid && isPhoneNumberValid && isusernameValid && ispasswordValid);
        }
    }

    public void tohome(View view) {
        Intent intentt = new Intent(this, Practical_6_i.class);
        intentt.putExtra("username", username.getText().toString());
        intentt.putExtra("password", password.getText().toString());
        intentt.putExtra("email", email.getText().toString());
        intentt.putExtra("number", phone_number.getText().toString());
        intentt.putExtra("radio", selectedRadioButton.getText().toString());
        startActivity(intentt);
    }

}