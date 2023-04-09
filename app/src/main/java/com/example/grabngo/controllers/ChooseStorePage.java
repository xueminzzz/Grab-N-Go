package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.grabngo.R;
import com.example.grabngo.test.Order;

// TODO: Unsure of some below
// Function: For users to choose stores (all are available in this page)
// Input: TimeSlot? from extra Intent (setContentView to layout/choose_store_page.xml)
// Output: Nil
// Sent/Read from DB: Unsure (If can, retrieve available stores?)
// Prev Page Link: MainCustomerPage.java
// Next Page Link: StoreMenuPage.java (Chicken Rice and Ban Mian stall available)
// Java Concepts/OOP: Intent(?)

public class ChooseStorePage extends Activity {
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_store_page);
        CardView store1 = findViewById(R.id.ChickenRiceStoreTab);
        CardView store2 = findViewById(R.id.BanmianStoreTab);
        Order order = Order.getInstance();
        Log.d("ChooseStorePage-onCreate", order.toString());

        store1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooseStore = new Intent(view.getContext(), StoreMenuPage.class);  //changed to test, change back to StoreMenuPage
                chooseStore.putExtra("storeName", "CR");
                view.getContext().startActivity(chooseStore);
            }
        });

        store2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooseStore = new Intent(view.getContext(), StoreMenuPage.class);  //changed to test, change back to StoreMenuPage
                chooseStore.putExtra("storeName", "BM");
                view.getContext().startActivity(chooseStore);
            }
        });

    }
}
