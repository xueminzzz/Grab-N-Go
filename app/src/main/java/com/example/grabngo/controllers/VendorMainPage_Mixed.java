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
import android.widget.ImageView;
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

public class VendorMainPage_Mixed extends AppCompatActivity {
    ImageButton button1230PM_mixed;
    ImageButton button1PM_mixed;
    ImageButton button130PM_mixed;
    ImageButton button2PM_mixed;
    ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_vendor_page_mixed);

        button1230PM_mixed = (ImageButton) findViewById(R.id.Time1230PM_mixed);
        button1PM_mixed  = (ImageButton) findViewById(R.id.Time1PM_mixed);
        button130PM_mixed  = (ImageButton) findViewById(R.id.Time130PM_mixed);
        button2PM_mixed  = (ImageButton) findViewById(R.id.Time2PM_mixed);
        backarrow = (ImageView) findViewById(R.id.BackArrowLogo);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(VendorMainPage_Mixed.this, ChooseStall.class);
                startActivity(back);
            }
        });

        button1230PM_mixed .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

//                Intent i = new Intent(VendorMainPage.this, OrdersforSpecifiedTimePage1.class);
//                startActivity(i);
                Intent i = new Intent(VendorMainPage_Mixed.this, OrdersforSpecifiedTimePage1_Mixed.class);
                startActivity(i);

            }
        });

        button1PM_mixed .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage_Mixed.this, OrdersforSpecifiedTimePage1_1PM_Mixed.class);
                startActivity(i);

            }
        });

        button130PM_mixed .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage_Mixed.this, OrdersforSpecifiedTimePage1_130PM_Mixed.class);
                startActivity(i);



            }
        });

        button2PM_mixed .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(VendorMainPage_Mixed.this, OrdersforSpecifiedTimePage1_2PM_Mixed.class);
                startActivity(i);


            }
        });


    }
}
