package com.example.javaapp;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;
import io.realm.mongodb.sync.SyncConfiguration;


public class Finish extends QuitDialog {

    String appId = "application-0-kkvxx";
    Realm uiThreadRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView text = findViewById(R.id.finish_text);
        TextView caseResult = findViewById(R.id.finish_test_result);

        Realm.init(this);
        App app = new App(new AppConfiguration.Builder(appId).build());
        Credentials credentials = Credentials.anonymous();
        app.loginAsync(credentials, result -> {
            if (result.isSuccess()) {
                Log.v("QUICKSTART", "Successfully authenticated anonymously.");
                User user = app.currentUser();
                String partitionValue = "My Project";
                SyncConfiguration config = new SyncConfiguration.Builder(
                        user,
                        partitionValue)
                        .build();
                uiThreadRealm = Realm.getInstance(config);
             //   addChangeListenerToRealm(uiThreadRealm);
               // FutureTask<String> task = new FutureTask(new BackgroundQuickStart(app.currentUser()), "test");
                //ExecutorService executorService = Executors.newFixedThreadPool(2);
                //executorService.execute(task);
            } else {
                Log.e("QUICKSTART", "Failed to log in. Error: " + result.getError());
            }
        });
        caseResult.setText(Case.result);
        caseResult.getText();
    }
}