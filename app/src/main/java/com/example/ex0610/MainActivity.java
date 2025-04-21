package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ToggleButton tB;
    ConstraintLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        tB = findViewById(R.id.tB);
        main = findViewById(R.id.main);
    }

    public void pressed(View view) {
        if (sw.isChecked() && tB.isChecked())
        {
            main.setBackgroundColor(Color.GREEN);
        }
        else if (sw.isChecked())
        {
            main.setBackgroundColor(Color.YELLOW);
        }
        else if (tB.isChecked())
        {
            main.setBackgroundColor(Color.BLUE);
        }
        else
        {
            main.setBackgroundColor(Color.RED);
        }
    }
}