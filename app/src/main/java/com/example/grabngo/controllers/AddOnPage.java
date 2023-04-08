package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import com.example.grabngo.R;
import com.example.grabngo.test.FoodFactory;
import com.example.grabngo.test.Food;
import com.example.grabngo.test.Order;
import com.example.grabngo.test.SteamedChickenRice;

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

    private Food food;
    private boolean meat;
    private boolean egg;
    private boolean tofu;
    private boolean nocheck; //TODO Can consider deleting this checkbox, then allow user to click proceed



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_on_page);

        CheckBox meatCheckBox = findViewById(R.id.MeatCheckBox);
        CheckBox eggCheckBox = findViewById(R.id.EggCheckBox);
        CheckBox tofuCheckBox = findViewById(R.id.TofuCheckBox);
        CheckBox noCheckBox = findViewById(R.id.NoAddOnCheckBox);
        meat = meatCheckBox.isChecked();
        egg = eggCheckBox.isChecked();
        tofu = tofuCheckBox.isChecked();
        nocheck = noCheckBox.isChecked();

        AppCompatButton proceedbtn = findViewById(R.id.PlaceOrderButton1);
        Intent receiveData = getIntent();
        String foodName = receiveData.getStringExtra("foodName");
        Log.d("AddOnPage-onCreate", "FoodName is: " + foodName);


        meatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                meat = b;
                updateProceedButton(proceedbtn, meat, egg,tofu,nocheck);
            }
        });

        eggCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                egg = b;
                updateProceedButton(proceedbtn, meat, egg,tofu,nocheck);
            }
        });

        tofuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                tofu = b;
                updateProceedButton(proceedbtn, meat, egg,tofu,nocheck);
            }
        });

        noCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                nocheck = b;
                updateProceedButton(proceedbtn, meat, egg,tofu,nocheck);
            }
        });

        proceedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO need to know which object to create
                // Food steamed1 = new SteamedChickenRice.SteamedChickenRiceBuilder().setAddEgg(false).setAddTofu(true).setAddMeat(false).build();
                Order order = Order.getInstance();
                food = FoodFactory.createFoodWithAddOns(foodName, meat, egg,tofu);
                order.addFood(food);
                Log.d("AddOnPage-onClick", order.toString());
                Intent nextAdd = new Intent(view.getContext(), ConfirmAddOnPage.class);
                view.getContext().startActivity(nextAdd);
            }
        });
    }


        private void updateProceedButton(AppCompatButton proceedbtn, boolean meat, boolean egg, boolean tofu, boolean noCheckBox){
            if (meat || egg || tofu || noCheckBox){
                proceedbtn.setBackground((ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled)));
                proceedbtn.setEnabled(true);
            }
            else{
                proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                proceedbtn.setEnabled(false);
            }
    }
}
