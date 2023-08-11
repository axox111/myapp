package com.example.javaapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class Finish extends QuitDialog {

    String dbURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView text = findViewById(R.id.finish_text);
        TextView caseResult = findViewById(R.id.finish_test_result);
        Button buttonLeaderboard = findViewById(R.id.btn_leaderboard);
        dbURL = "https://firstapp-2f050-default-rtdb.europe-west1.firebasedatabase.app/";

        Player player = new Player();
        player.setResult(Case.result);
        player.setName(Description.name.getText().toString());

        FirebaseDatabase database = FirebaseDatabase.getInstance(dbURL);
        DatabaseReference myRef = database.getReference("results");
        myRef.push().setValue(player);
        caseResult.setText(player.getResult());
        buttonLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Finish.this, Leaderboard.class);
                startActivity(i);
            }
        });
    }
}