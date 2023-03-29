package com.example.grabngo.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.grabngo.R;

// TODO: Unsure (ask Radhi)
// TODO: Edit comment to reflect Function, Input, Output,
//  Sent/Read from DB, Link to Prev or Next Page, Java Concepts Used
//  Example below!
// Function: For users to choose whether they would like to enter as vendor or customer
// Input: None (setContentView to layout/activity_choose_one.xml
// Output: None (redirect page)
// Sent/Read from DB: None
// Prev Page Link: None
// Next Page Link: MainMenu.java
// Java Concepts/OOP: Intent(?)

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageview);

        imageView.animate().alpha(1f).setDuration(1000);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
                finish();

            }
        }, 3000);


    }

}