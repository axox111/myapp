package com.example.javaapp;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends QuitDialog {

    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View activityView = findViewById(R.id.activity_view);

        activityView.setOnTouchListener(new View.OnTouchListener() {
            float dY = 0;

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dY = view.getY() - event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        // Перемещаем активити вниз за жестом свайпа
                        if (event.getRawY() + dY > 0) {
                            activityView.setY(event.getRawY() + dY);
                        }
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if (y1 + 100 < y2) {
                    //вставитьпроверку по мак адерсу
                    Intent i = new Intent(MainActivity.this, Description.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}