package com.example.javaapp;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;

public class MyKeyboard extends LinearLayout implements View.OnClickListener {

    public MyKeyboard(Context context) {
        super(context, null,0);
    }

    public MyKeyboard(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }

    public MyKeyboard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private Button mButton1;    private Button mButton2;    private Button mButton3;
    private Button mButton4;    private Button mButton5;    private Button mButton6;
    private Button mButton7;    private Button mButton8;    private Button mButton9;
    private Button mButton10;    private Button mButton11;    private Button mButton12;
    private Button mButton13;    private Button mButton14;    private Button mButton15;
    private Button mButton16;    private Button mButton17;    private Button mButton18;
    private Button mButton19;    private Button mButton20;    private Button mButton21;
    private Button mButton22;    private Button mButton23;    private Button mButton24;
    private Button mButton25;    private Button mButton26;    private Button mButton27;
    private Button mButton28;    private Button mButton29;    private Button mButton30;
    private Button mButton31;    private Button mButton32;    private Button mButtonBackspace;

    SparseArray<String> keyValue = new SparseArray<>();

    InputConnection ic;

    private void init (Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true);
        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButton4 = (Button) findViewById(R.id.button_4);
        mButton5 = (Button) findViewById(R.id.button_5);
        mButton6 = (Button) findViewById(R.id.button_6);
        mButton7 = (Button) findViewById(R.id.button_7);
        mButton8 = (Button) findViewById(R.id.button_8);
        mButton9 = (Button) findViewById(R.id.button_9);
        mButton10 = (Button) findViewById(R.id.button_10);
        mButton11 = (Button) findViewById(R.id.button_11);
        mButton12 = (Button) findViewById(R.id.button_12);
        mButton13 = (Button) findViewById(R.id.button_13);
        mButton14 = (Button) findViewById(R.id.button_14);
        mButton15 = (Button) findViewById(R.id.button_15);
        mButton16 = (Button) findViewById(R.id.button_16);
        mButton17 = (Button) findViewById(R.id.button_17);
        mButton18 = (Button) findViewById(R.id.button_18);
        mButton19 = (Button) findViewById(R.id.button_19);
        mButton20 = (Button) findViewById(R.id.button_20);
        mButton21 = (Button) findViewById(R.id.button_21);
        mButton22 = (Button) findViewById(R.id.button_22);
        mButton23 = (Button) findViewById(R.id.button_23);
        mButton24 = (Button) findViewById(R.id.button_24);
        mButton25 = (Button) findViewById(R.id.button_25);
        mButton26 = (Button) findViewById(R.id.button_26);
        mButton27 = (Button) findViewById(R.id.button_27);
        mButton28 = (Button) findViewById(R.id.button_28);
        mButton29 = (Button) findViewById(R.id.button_29);
        mButton30 = (Button) findViewById(R.id.button_30);
        mButton31 = (Button) findViewById(R.id.button_31);
        mButton32 = (Button) findViewById(R.id.button_32);
        mButtonBackspace = (Button) findViewById(R.id.button_backspace);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);
        mButton10.setOnClickListener(this);
        mButton11.setOnClickListener(this);
        mButton12.setOnClickListener(this);
        mButton13.setOnClickListener(this);
        mButton14.setOnClickListener(this);
        mButton15.setOnClickListener(this);
        mButton16.setOnClickListener(this);
        mButton17.setOnClickListener(this);
        mButton18.setOnClickListener(this);
        mButton19.setOnClickListener(this);
        mButton20.setOnClickListener(this);
        mButton21.setOnClickListener(this);
        mButton22.setOnClickListener(this);
        mButton23.setOnClickListener(this);
        mButton24.setOnClickListener(this);
        mButton25.setOnClickListener(this);
        mButton26.setOnClickListener(this);
        mButton27.setOnClickListener(this);
        mButton28.setOnClickListener(this);
        mButton29.setOnClickListener(this);
        mButton30.setOnClickListener(this);
        mButton31.setOnClickListener(this);
        mButton32.setOnClickListener(this);
        mButtonBackspace.setOnClickListener(this);

        keyValue.put(R.id.button_1, "Й");
        keyValue.put(R.id.button_2, "Ц");
        keyValue.put(R.id.button_3, "У");
        keyValue.put(R.id.button_4, "К");
        keyValue.put(R.id.button_5, "Е");
        keyValue.put(R.id.button_6, "Н");
        keyValue.put(R.id.button_7, "Г");
        keyValue.put(R.id.button_8, "Ш");
        keyValue.put(R.id.button_9, "Щ");
        keyValue.put(R.id.button_10, "З");
        keyValue.put(R.id.button_11, "Х");
        keyValue.put(R.id.button_12, "Ъ");
        keyValue.put(R.id.button_13, "Ф");
        keyValue.put(R.id.button_14, "Ы");
        keyValue.put(R.id.button_15, "В");
        keyValue.put(R.id.button_16, "А");
        keyValue.put(R.id.button_17, "П");
        keyValue.put(R.id.button_18, "Р");
        keyValue.put(R.id.button_19, "О");
        keyValue.put(R.id.button_20, "Л");
        keyValue.put(R.id.button_21, "Д");
        keyValue.put(R.id.button_22, "Ж");
        keyValue.put(R.id.button_23, "Э");
        keyValue.put(R.id.button_24, "Я");
        keyValue.put(R.id.button_25, "Ч");
        keyValue.put(R.id.button_26, "С");
        keyValue.put(R.id.button_27, "М");
        keyValue.put(R.id.button_28, "И");
        keyValue.put(R.id.button_29, "Т");
        keyValue.put(R.id.button_30, "Ь");
        keyValue.put(R.id.button_31, "Б");
        keyValue.put(R.id.button_32, "Ю");
        keyValue.put(R.id.button_backspace, null);

    }

    @Override
    public void onClick(View v) {
        if (ic == null)
            return;
        if (v.getId()== R.id.button_backspace) {
            ic.deleteSurroundingText(1, 0);

        } else {
            String value = keyValue.get(v.getId());
            ic.commitText(value, 1);
        }
    }

    public void setInputConnection (InputConnection setIC) {
        this.ic = setIC;
    }
}

