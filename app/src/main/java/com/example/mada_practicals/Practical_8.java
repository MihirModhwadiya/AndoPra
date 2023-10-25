package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Practical_8 extends AppCompatActivity {

    Button check;
    RadioGroup Radio_Group;
    RadioButton Radio_Button;
    CheckBox ck1, ck2, ck3;

    TextView txt_radio, txt_checkbox1, txt_checkbox2, txt_checkbox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical8);

        Radio_Group = findViewById(R.id.radioGroup);
        ck1 = findViewById(R.id.checkbox_1);
        ck2 = findViewById(R.id.checkbox_2);
        ck3 = findViewById(R.id.checkbox_3);

        txt_radio = findViewById(R.id.txt_radiobtn);
        txt_checkbox1 = findViewById(R.id.txt_checkbox1);
        txt_checkbox2 = findViewById(R.id.txt_checkbox2);
        txt_checkbox3 = findViewById(R.id.txt_checkbox3);

    }

    public void Check(View view) {
        int selectedRadioButtonId = Radio_Group.getCheckedRadioButtonId();
        Radio_Button = findViewById(selectedRadioButtonId);

        if (Radio_Button != null) {
            txt_radio.setText(Radio_Button.getText().toString());
        }

        if (ck1.isChecked()) {
            txt_checkbox1.setText(ck1.getText().toString());
        }else{
            txt_checkbox1.setText("");
        }
        if (ck2.isChecked()) {
            txt_checkbox2.setText(ck2.getText().toString());
        }else{
            txt_checkbox2.setText("");
        }
        if (ck3.isChecked()) {
            txt_checkbox3.setText(ck3.getText().toString());
        }else{
            txt_checkbox3.setText("");
        }
    }
}