package com.example.javaapp;


import android.os.Bundle;
import android.widget.TextView;


public class Finish extends QuitDialog {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView text = findViewById(R.id.finish_text);
        TextView result = findViewById(R.id.finish_test_result);
        result.setText(Case.result);
        result.getText();

    }

    private void postResult() {

        final String url;
        String name = String.valueOf(Description.name);
        String time = Case.result;

    }
}