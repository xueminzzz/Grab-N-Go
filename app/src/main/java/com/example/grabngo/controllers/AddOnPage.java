package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to choose add-ons or remove ingredients from food
// Input: StallID?, FoodID? TimeSlot? from extra Intent (setContentView to layout/add_on_page.xml
// Output: StallID?, FoodID?, TimeSlot?, Add-OnsList? (If using FoodBuilder, list of "boolean states" {-1, 0, 1} - -1 indicate remove, 0 indicate no change, 1 indicate add-on to food)
// Sent/Read from DB: Unsure (If can, retrieve eligible add-ons for food based off FoodID?)
// Prev Page Link: MainMenu.java
// Next Page Link: Vendorlogin/VendorRegistration/Customerlogin/CustomerRegistration
// Java Concepts/OOP: Intent(?)

// TODO: BASIC CHECKBOX FUNCTIONALITY: Add indeterminate state for removing ingredients (minus sign in checkbox)
// Link to resource: https://m2.material.io/components/checkboxes#behavior
public class AddOnPage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_on_page);

        CheckBox check1 = findViewById(R.id.MeatCheckBox);
        CheckBox check2 = findViewById(R.id.EggCheckBox);
        CheckBox check3 = findViewById(R.id.TofuCheckBox);
        CheckBox check4 = findViewById(R.id.CucumberCheckBox);
        CheckBox check5 = findViewById(R.id.NoAddOnCheckBox);

        AppCompatButton proceedbtn = findViewById(R.id.PlaceOrderButton1);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check1.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else if (!check2.isChecked() && !check3.isChecked() && !check4.isChecked() && !check5.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check2.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else if (!check1.isChecked() && !check3.isChecked() && !check4.isChecked() && !check5.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check3.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else if (!check1.isChecked() && !check2.isChecked() && !check4.isChecked() && !check5.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        check4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check4.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else if (!check1.isChecked() && !check2.isChecked() && !check3.isChecked() && !check5.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        check5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check5.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else if (!check1.isChecked() && !check2.isChecked() && !check3.isChecked() && !check4.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        proceedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextAdd = new Intent(view.getContext(), ConfirmAddOnPage.class);
                view.getContext().startActivity(nextAdd);
            }
        });
    }
}
