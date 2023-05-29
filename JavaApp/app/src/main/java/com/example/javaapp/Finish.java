package com.example.javaapp;


import android.icu.util.Output;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;


public class Finish extends QuitDialog {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView text = findViewById(R.id.finish_text);
        TextView result = findViewById(R.id.finish_test_result);
        result.setText(Case.result);
        result.getText();
        try {
            postResult();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private void postResult() throws FileNotFoundException, UnsupportedEncodingException {

        final String url;
        String name = String.valueOf(Description.name);
        String time = Case.result;

        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);

        pw.println("string1");

        pw.close();
    }
}