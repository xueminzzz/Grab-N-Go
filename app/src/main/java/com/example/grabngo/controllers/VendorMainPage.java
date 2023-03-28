package com.example.grabngo.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_vendor_page);
    }
}
