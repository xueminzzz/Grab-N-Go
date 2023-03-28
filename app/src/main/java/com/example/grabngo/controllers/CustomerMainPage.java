package com.example.grabngo.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to choose which timeslot to order for
// Input: None (setContentView to layout/activity_choose_one.xml
// Output: TimeSlot? (redirect page)
// Sent/Read from DB: None
// Prev Page Link: Customerlogin.java
// Next Page Link: ChooseStorePage1/2.java
// Java Concepts/OOP: Intent(?)

public class CustomerMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_customer_page);

        // Detect on-click events in popup and redirect accordingly (hardcoded)
        // First 2 timeslots where all items available (ChooseStorePage1)
        // Last 2 timeslots where an item is unavailable (ChooseStorePage2)
        ImageButton timeslot1 = (ImageButton) findViewById(R.id.Time1230PM);
        ImageButton timeslot2 = (ImageButton) findViewById(R.id.Time1PM);
        ImageButton timeslot3 = (ImageButton) findViewById(R.id.Time130PM);
        ImageButton timeslot4 = (ImageButton) findViewById(R.id.Time2PM);

        timeslot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent all_avail = new Intent(view.getContext(), ChooseStorePage1.class);
                view.getContext().startActivity(all_avail);
            }
        });

        timeslot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent all_avail = new Intent(view.getContext(), ChooseStorePage1.class);
                view.getContext().startActivity(all_avail);
            }
        });

        timeslot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent all_avail = new Intent(view.getContext(), ChooseStorePage2.class);
                view.getContext().startActivity(all_avail);
            }
        });

        timeslot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent all_avail = new Intent(view.getContext(), ChooseStorePage2.class);
                view.getContext().startActivity(all_avail);
            }
        });
    }
}
