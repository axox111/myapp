package com.example.javaapp;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;


public class Finish extends QuitDialog {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView text = findViewById(R.id.finish_text);
        TextView caseResult = findViewById(R.id.finish_test_result);
        String dbURL = "https://firstapp-2f050-default-rtdb.europe-west1.firebasedatabase.app/";

        Player player = new Player();
        player.setName(Description.name.getText().toString());
        player.setResult(Case.result);

        FirebaseDatabase database = FirebaseDatabase.getInstance(dbURL);
        DatabaseReference myRef = database.getReference(player.getName());
        myRef.setValue(player.getResult());
        caseResult.setText(player.getResult());
    }
}