package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to choose stores (only 2 are available in this page)
// Input: TimeSlot? from extra Intent (setContentView to layout/choose_store_page_1.xml)
// Output: TimeSlot? StallID?
// Sent/Read from DB: Unsure (If can, retrieve available stores?)
// Prev Page Link: MainCustomerPage.java
// Next Page Link: StoreMenuPage.java (Chicken Rice stall only available)
// Java Concepts/OOP: Intent(?)
public class ChooseStorePage2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_store_page_2);

        CardView store1 = findViewById(R.id.ChickenRiceStoreTab);
        store1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chickenRiceStore = new Intent(view.getContext(), StoreMenuPage.class);
                view.getContext().startActivity(chickenRiceStore);
            }
        });
    }
}
