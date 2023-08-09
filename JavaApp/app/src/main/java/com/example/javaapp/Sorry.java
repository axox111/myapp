package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sorry extends AppCompatActivity {
    private TextView sorry_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorry);
        sorry_text = findViewById(R.id.sorry_text);

    }
}