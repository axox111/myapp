package com.example.javaapp;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Description extends QuitDialog {

    public Keyboard keyboard;
    public String playerName;
    private Button startButton;
    private EditText name;
    private TextView enterName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        final MyKeyboard keyboard = findViewById(R.id.description_keyboard);
        startButton = findViewById(R.id.startButton);
        name = findViewById(R.id.name);

        InputConnection ic = name.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection(ic);
        name.setInputType(InputType.TYPE_NULL);


        if (name.getText().length() > 0) {
            startButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Description.this, Case.class);
                            startActivity(i);
                        }
                    }
            );
        } else {
            enterName.setText(R.string.name_text);
        }

    }
}