package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

        TextWatcher tw = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                validate();
            }
        };

        View.OnClickListener clk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        };

        email.addTextChangedListener(tw);
        password.addTextChangedListener(tw);
        phone_number.addTextChangedListener(tw);

        radio.setOnClickListener(clk);

        cricket.setOnClickListener(clk);

        football.setOnClickListener(clk);

        hockey.setOnClickListener(clk);
    }

    public void validate() {
        boolean isusernameValid = !(username.getText().toString().isEmpty());
        boolean ispasswordValid = !(password.getText().toString().isEmpty());
        boolean isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches();
        boolean isPhoneNumberValid = phone_number.getText().toString().length() == 10;
        boolean isChecked = hockey.isChecked() || football.isChecked() || cricket.isChecked();
        radio = findViewById(R.id.radioGroup);
        int selectedRadioButtonId = radio.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedRadioButtonId);
        if (selectedRadioButton != null) {
            submit.setEnabled(isEmailValid && isPhoneNumberValid && isusernameValid && ispasswordValid && isChecked);
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