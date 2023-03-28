package com.example.grabngo.controllers;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

// TODO: Unsure (ask Radhi)
// Function: For users to choose whether they would like to enter as vendor or customer
// Input: None (setContentView to layout/activity_choose_one.xml
// Output: None (redirect page)
// Sent/Read from DB: None
// Prev Page Link: MainMenu.java
// Next Page Link: Vendorlogin/VendorRegistration/Customerlogin/CustomerRegistration
// Java Concepts/OOP: Intent(?)
public class ReusableCodeForAll {

    public static void ShowAlert(Context context,String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        }).setTitle(title).setMessage(message).show();
    }
}

