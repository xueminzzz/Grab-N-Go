package com.example.grabngo.controllers;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to confirm their order
// Input: Order object from extra Intents (setContentView to layout/order_confirmation_page.xml
// Output: Unsure (redirect page)
// Sent/Read from DB: Send order data to FB
// Prev Page Link: ViewCartPage.java
// Next Page Link: None
// Java Concepts/OOP: Intent(?) Anything to do with Order object?

public class OrderConfirmationPage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_confirmation_page);
    }
}
