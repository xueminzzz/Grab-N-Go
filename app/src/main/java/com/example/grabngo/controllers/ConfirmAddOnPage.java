package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to choose to view cart or add more items
// Input: StallID?, FoodID?, TimeSlot?, Add-OnsList? (setContentView to layout/confirm_add_on_page.xml
// Output: StallID?, TimeSlot?, FoodBuilder object with info like food id and add-ons? (redirect page)
// Sent/Read from DB: Unsure (Probably not yet until order confirmation)
// Prev Page Link: AddOnPage.java
// Next Page Link: ViewCartPage.java/ChooseStorePage1.java
// Java Concepts/OOP: Intent(?), Builder design pattern from FoodBuilder?

public class ConfirmAddOnPage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_add_on_page);

        ImageButton continuebtn = (ImageButton) findViewById(R.id.ContinueShoppingTab);
        ImageButton confirmbtn = (ImageButton) findViewById(R.id.ViewCartTab);

        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backChoose = new Intent(view.getContext(), ChooseStorePage1.class);
                view.getContext().startActivity(backChoose);
            }
        });

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextCart = new Intent(view.getContext(), ViewCartPage.class);
                view.getContext().startActivity(nextCart);
            }
        });

    }
}
