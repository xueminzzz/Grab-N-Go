package com.example.grabngo.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.grabngo.R;

// TODO: Unsure of some below
// TODO: Edit comment to reflect Function, Input, Output,
//  Sent/Read from DB, Link to Prev or Next Page, Java Concepts Used
//  Example below!
// Function: For users to choose whether they would like to enter as vendor or customer
// Input: None (setContentView to layout/activity_choose_one.xml
// Output: None (redirect page)
// Sent/Read from DB: None
// Prev Page Link: MainMenu.java
// Next Page Link: Vendorlogin/VendorRegistration/Customerlogin/CustomerRegistration
// Java Concepts/OOP: Intent(?)

public class VendorMainPage extends AppCompatActivity {
    ImageButton button1230PM;
    ImageButton button1PM;
    ImageButton button130PM;
    ImageButton button2PM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_vendor_page);

        button1230PM = (ImageButton) findViewById(R.id.Time1230PM);
        button1PM = (ImageButton) findViewById(R.id.Time1PM);
        button130PM = (ImageButton) findViewById(R.id.Time130PM);
        button2PM = (ImageButton) findViewById(R.id.Time2PM);

        button1230PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage.this, OrdersforSpecifiedTimePage1.class);
                startActivity(i);
//                Intent i = new Intent(VendorMainPage.this, Recycler_1230PM.class);
//                startActivity(i);

            }
        });

        button1PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage.this, OrdersforSpecifiedTimePage1_1PM.class);
                startActivity(i);

            }
        });

        button130PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage.this, OrdersforSpecifiedTimePage1_130PM.class);
                startActivity(i);



            }
        });

        button2PM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage.this, OrdersforSpecifiedTimePage1_2PM.class);
                startActivity(i);


            }
        });


    }
}
