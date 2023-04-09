package com.example.grabngo.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.grabngo.R;

// TODO: Integrate with HY and Michelle
/** Function: For users to view the main page for Vendors
 *  Input: None (setContentView to layout/main_vendor_page.xml)
 *  Output: None
 *  Sent/Read from DB: None
 *  Prev Page Link: Vendorlogin.java
 *  Next Page Link: UNSURE look at integration on Monday
 *  Java Concepts/OOP: Intent
 */

public class VendorMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_vendor_page);
    }
}
