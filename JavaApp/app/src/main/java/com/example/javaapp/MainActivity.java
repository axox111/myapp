package com.example.javaapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;


public class MainActivity extends QuitDialog {

    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }


    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if (y1 + 100 < y2){
                    Intent i = new Intent(MainActivity.this, Description.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}