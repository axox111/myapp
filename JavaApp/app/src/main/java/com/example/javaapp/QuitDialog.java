package com.example.javaapp;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class QuitDialog extends AppCompatActivity {
    @Override
    public void onBackPressed(){

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.alert_dialog_icon)
                .setMessage(R.string.quit_massege)
                .setPositiveButton(R.string.btn_yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(R.string.btn_no, null).show();
    }
}