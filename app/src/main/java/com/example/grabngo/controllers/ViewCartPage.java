package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import com.example.grabngo.R;
import com.example.grabngo.test.Order;

// TODO: Unsure of some below
// Function: For users to view their food cart
// Input: StallID?, TimeSlot?, FoodBuilder object with info like food id and add-ons? (setContentView to layout/activity_choose_one.xml
// Output: Order object with above info? (redirect page)
// Sent/Read from DB: Unsure
// Prev Page Link: ConfirmAddOnPage.java
// Next Page Link: OrderConfirmationPage.java
// Java Concepts/OOP: Intent(?) Anything to do with the Order object?

public class ViewCartPage extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_cart_page);

        AppCompatButton finalConfirm = findViewById(R.id.placeOrderButton);

        finalConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //onClick i want to push data to firebase
                Order ordermanager = Order.getInstance();
                //FirebaseDB.addOrder(ordermanagerv2);
                Intent finalcheck = new Intent(view.getContext(), OrderConfirmationPage.class);
                view.getContext().startActivity(finalcheck);
            }
        });
    }
}
