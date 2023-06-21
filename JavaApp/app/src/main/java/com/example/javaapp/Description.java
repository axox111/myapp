package com.example.javaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.media.Image;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Description extends QuitDialog {

    public static EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        final Button startButton = findViewById(R.id.startButton);
        name = findViewById(R.id.name);
        final ImageView fasolPicture = findViewById(R.id.fasol);
        final TextView getFasol = findViewById(R.id.description_text31);
        final TextView enterName = findViewById(R.id.enter_name);
        final MyKeyboard keyboard = findViewById(R.id.description_keyboard);


        InputConnection ic = name.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection(ic);
        name.setInputType(InputType.TYPE_NULL);

        getFasol.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
                    fadeIn.setDuration(1500);
                    fasolPicture.startAnimation(fadeIn);
                    fasolPicture.setVisibility(View.VISIBLE);
                    fasolPicture.bringToFront();
                    fasolPicture.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                                AlphaAnimation fadeOut = new AlphaAnimation(1, 0);
                                fadeOut.setDuration(500);
                                fasolPicture.startAnimation(fadeOut);
                                fasolPicture.setVisibility(View.INVISIBLE);
                            }
                            return false;
                        }
                    });
                }
                return false;
            }
        });


        startButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (name.getText().length() > 0) {
                            Intent i = new Intent(Description.this, Case.class);
                            startActivity(i);
                        } else {
                            enterName.setText(R.string.enter_name);
                            AlphaAnimation fadeOut = new AlphaAnimation(1, 0);
                            fadeOut.setDuration(1500);
                            enterName.startAnimation(fadeOut);
                            enterName.setVisibility(View.INVISIBLE);
                        }
                    }
                }
        );
    }
}