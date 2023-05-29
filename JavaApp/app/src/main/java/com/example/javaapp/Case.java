package com.example.javaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;


public class Case extends QuitDialog {

    public static String result;
    public static MyKeyboard keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case);

        final EditText editText1 = findViewById(R.id.letter_1);
        final EditText editText2 = findViewById(R.id.letter_2);
        final EditText editText3 = findViewById(R.id.letter_3);
        final EditText editText4 = findViewById(R.id.letter_4);
        final EditText editText5 = findViewById(R.id.letter_5);
        final EditText editText6 = findViewById(R.id.letter_6);
        final EditText editText7 = findViewById(R.id.letter_7);
        final EditText editText8 = findViewById(R.id.letter_8);
        final EditText editText9 = findViewById(R.id.letter_9);
        final EditText editText10 = findViewById(R.id.letter_10);
        final EditText editText11 = findViewById(R.id.letter_11);
        final EditText editText12 = findViewById(R.id.letter_12);
        final MyKeyboard keyboard = findViewById(R.id.case_keyboard);
        int size = 1;
        final String correctAnswer = getResources().getString(R.string.correctAnswer);
        final TextView tryAgain = findViewById(R.id.tryAgain);

        InputConnection ic1 = editText1.onCreateInputConnection(new EditorInfo());
        InputConnection ic2 = editText2.onCreateInputConnection(new EditorInfo());
        InputConnection ic3 = editText3.onCreateInputConnection(new EditorInfo());
        InputConnection ic4 = editText4.onCreateInputConnection(new EditorInfo());
        InputConnection ic5 = editText5.onCreateInputConnection(new EditorInfo());
        InputConnection ic6 = editText6.onCreateInputConnection(new EditorInfo());
        InputConnection ic7 = editText7.onCreateInputConnection(new EditorInfo());
        InputConnection ic8 = editText8.onCreateInputConnection(new EditorInfo());
        InputConnection ic9 = editText9.onCreateInputConnection(new EditorInfo());
        InputConnection ic10 = editText10.onCreateInputConnection(new EditorInfo());
        InputConnection ic11 = editText11.onCreateInputConnection(new EditorInfo());
        InputConnection ic12 = editText12.onCreateInputConnection(new EditorInfo());

        keyboard.setInputConnection(ic1);

        editText1.setInputType(InputType.TYPE_NULL);
        editText2.setInputType(InputType.TYPE_NULL);
        editText3.setInputType(InputType.TYPE_NULL);
        editText4.setInputType(InputType.TYPE_NULL);
        editText5.setInputType(InputType.TYPE_NULL);
        editText6.setInputType(InputType.TYPE_NULL);
        editText7.setInputType(InputType.TYPE_NULL);
        editText8.setInputType(InputType.TYPE_NULL);
        editText9.setInputType(InputType.TYPE_NULL);
        editText10.setInputType(InputType.TYPE_NULL);
        editText11.setInputType(InputType.TYPE_NULL);
        editText12.setInputType(InputType.TYPE_NULL);

        long start = System.currentTimeMillis();
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText2.requestFocus();
                    keyboard.setInputConnection(ic2);
                }
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText1.requestFocus();
                    keyboard.setInputConnection(ic1);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText3.requestFocus();
                    keyboard.setInputConnection(ic3);
                }
            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText2.requestFocus();
                    keyboard.setInputConnection(ic2);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText4.requestFocus();
                    keyboard.setInputConnection(ic4);
                }
            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText3.requestFocus();
                    keyboard.setInputConnection(ic3);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText5.requestFocus();
                    keyboard.setInputConnection(ic5);
                }
            }
        });

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText4.requestFocus();
                    keyboard.setInputConnection(ic4);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText6.requestFocus();
                    keyboard.setInputConnection(ic6);
                }
            }
        });

        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText5.requestFocus();
                    keyboard.setInputConnection(ic5);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText7.requestFocus();
                    keyboard.setInputConnection(ic7);
                }
            }
        });
        editText7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText6.requestFocus();
                    keyboard.setInputConnection(ic6);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText8.requestFocus();
                    keyboard.setInputConnection(ic8);
                }
            }
        });
        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText7.requestFocus();
                    keyboard.setInputConnection(ic7);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText9.requestFocus();
                    keyboard.setInputConnection(ic9);
                }
            }
        });
        editText9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText8.requestFocus();
                    keyboard.setInputConnection(ic8);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText10.requestFocus();
                    keyboard.setInputConnection(ic10);
                }
            }
        });
        editText10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText9.requestFocus();
                    keyboard.setInputConnection(ic9);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText11.requestFocus();
                    keyboard.setInputConnection(ic11);
                }
            }
        });
        editText11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText10.requestFocus();
                    keyboard.setInputConnection(ic10);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    editText12.requestFocus();
                    keyboard.setInputConnection(ic12);
                }
            }
        });
        editText12.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int count) {
                if (count == 0) {
                    editText11.requestFocus();
                    keyboard.setInputConnection(ic11);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == size) {
                    String answer = editText1.getText().toString()
                            + editText2.getText().toString() + editText3.getText().toString()
                            + editText4.getText().toString() + editText5.getText().toString()
                            + editText6.getText().toString() + editText7.getText().toString()
                            + editText8.getText().toString() + editText9.getText().toString()
                            + editText10.getText().toString() + editText11.getText().toString()
                            + editText12.getText().toString();
                    if (correctAnswer.equals(answer)) {
                        long finish = System.currentTimeMillis();
                        long elapsed = finish - start;
                        int seconds = (int) (elapsed / 1000);
                        int mseconds = (int) (elapsed % 1000);
                        result = String.valueOf(seconds) + "." + String.valueOf(mseconds);
                        Runnable delayedActivity = new Runnable() {
                            @Override
                            public void run() {
                                Intent i = new Intent(Case.this, Finish.class);
                                startActivity(i);
                            }
                        };
                        new Handler().postDelayed(delayedActivity, 300);
                    } else {
                        tryAgain.setText(R.string.case_tryAgain);
                    }
                }
            }
        });

    }
}