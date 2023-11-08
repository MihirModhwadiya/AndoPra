package com.example.mada_practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Practical_13_iii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical13_iii);

        Button showPopupMenuButton = findViewById(R.id.showPopupMenuButton);

        showPopupMenuButton.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(this, v);
            popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();
                if (id == R.id.action_item1) {
                    Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.action_item2) {
                    Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });

            popupMenu.show();
        });


    }
}