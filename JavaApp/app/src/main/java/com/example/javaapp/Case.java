package com.example.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;


public class Case extends QuitDialog {

    public static String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);

        final EditText et1 = findViewById(R.id.letter_1);
        final EditText et2 = findViewById(R.id.letter_2);
        final EditText et3 = findViewById(R.id.letter_3);
        final EditText et4 = findViewById(R.id.letter_4);
        final EditText et5 = findViewById(R.id.letter_5);
        final EditText et6 = findViewById(R.id.letter_6);
        final EditText et7 = findViewById(R.id.letter_7);
        final EditText et8 = findViewById(R.id.letter_8);
        final EditText et9 = findViewById(R.id.letter_9);
        final EditText et10 = findViewById(R.id.letter_10);
        final EditText et11 = findViewById(R.id.letter_11);
        final EditText et12 = findViewById(R.id.letter_12);
        final MyKeyboard keyboard = findViewById(R.id.case_keyboard);
        int size = 1;
        final String correctAnswer = getResources().getString(R.string.correct_answer);
        final TextView tryAgain = findViewById(R.id.tryAgain);

        InputConnection ic1 = et1.onCreateInputConnection(new EditorInfo());
        InputConnection ic2 = et2.onCreateInputConnection(new EditorInfo());
        InputConnection ic3 = et3.onCreateInputConnection(new EditorInfo());
        InputConnection ic4 = et4.onCreateInputConnection(new EditorInfo());
        InputConnection ic5 = et5.onCreateInputConnection(new EditorInfo());
        InputConnection ic6 = et6.onCreateInputConnection(new EditorInfo());
        InputConnection ic7 = et7.onCreateInputConnection(new EditorInfo());
        InputConnection ic8 = et8.onCreateInputConnection(new EditorInfo());
        InputConnection ic9 = et9.onCreateInputConnection(new EditorInfo());
        InputConnection ic10 = et10.onCreateInputConnection(new EditorInfo());
        InputConnection ic11 = et11.onCreateInputConnection(new EditorInfo());
        InputConnection ic12 = et12.onCreateInputConnection(new EditorInfo());

        keyboard.setInputConnection(ic1);

//        et1.setInputType(InputType.TYPE_NULL);
//        et2.setInputType(InputType.TYPE_NULL);
//        et3.setInputType(InputType.TYPE_NULL);
//        et4.setInputType(InputType.TYPE_NULL);
//        et5.setInputType(InputType.TYPE_NULL);
//        et6.setInputType(InputType.TYPE_NULL);
//        et7.setInputType(InputType.TYPE_NULL);
//        et8.setInputType(InputType.TYPE_NULL);
//        et9.setInputType(InputType.TYPE_NULL);
//        et10.setInputType(InputType.TYPE_NULL);
//        et11.setInputType(InputType.TYPE_NULL);
//        et12.setInputType(InputType.TYPE_NULL);

        long start = System.currentTimeMillis();
        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et2.requestFocus();
                    keyboard.setInputConnection(ic2);
                }
            }
        });
        et2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (v.getId() == R.id.button_backspace) {
                    et1.requestFocus();
                    et1.setText("q");
                }
                return false;
            }
        });
        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et3.requestFocus();
                    keyboard.setInputConnection(ic3);
                }
            }
        });
        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et4.requestFocus();
                    keyboard.setInputConnection(ic4);
                }
            }
        });
        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et5.requestFocus();
                    keyboard.setInputConnection(ic5);
                }
            }
        });
        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et6.requestFocus();
                    keyboard.setInputConnection(ic6);
                }
            }
        });
        et6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et7.requestFocus();
                    keyboard.setInputConnection(ic7);
                }
            }
        });
        et7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et8.requestFocus();
                    keyboard.setInputConnection(ic8);
                }
            }
        });
        et8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et9.requestFocus();
                    keyboard.setInputConnection(ic9);
                }
            }
        });
        et9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et10.requestFocus();
                    keyboard.setInputConnection(ic10);
                }
            }
        });
        et10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et11.requestFocus();
                    keyboard.setInputConnection(ic11);
                }
            }
        });
        et11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    et12.requestFocus();
                    keyboard.setInputConnection(ic12);
                }
            }
        });
        et12.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    String answer = et1.getText().toString()
                            + et2.getText().toString() + et3.getText().toString()
                            + et4.getText().toString() + et5.getText().toString()
                            + et6.getText().toString() + et7.getText().toString()
                            + et8.getText().toString() + et9.getText().toString()
                            + et10.getText().toString() + et11.getText().toString()
                            + et12.getText().toString();
                    if (correctAnswer.equals(answer)) {
                        long finish = System.currentTimeMillis();
                        long elapsed = finish - start;
                        int seconds = (int) (elapsed / 1000);
                        int mSeconds = (int) (elapsed % 1000);
                        result = seconds + "." + mSeconds;
                        Runnable delayedActivity = new Runnable() {
                            @Override
                            public void run() {
                                Intent i = new Intent(Case.this, Finish.class);
                                startActivity(i);
                            }
                        };
                        new Handler().postDelayed(delayedActivity, 300);
                    } else {
                        tryAgain.setText(R.string.case_try_again);
                    }
                }
            }
        });

    }
}
