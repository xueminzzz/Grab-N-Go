package com.example.grabngo.controllers;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.TextView;

        import androidx.annotation.Nullable;

        import com.example.grabngo.R;

// TODO: Unsure of some below
// Function: For users to choose food item from selected store
// Input: TimeSlot? StallID? (setContentView to layout/store_menu_page.xml
// Output: TimeSlot? StallID? FoodID? (redirect page)
// Sent/Read from DB: None
// Prev Page Link: ChooseStorePage.java
// Next Page Link: AddOnPage
// Java Concepts/OOP: Intent(?)

public class BMStoreMenuPage extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bm_store_menu_page);

        // BUTTON HANDLER
        ImageButton add1 = (ImageButton) findViewById(R.id.AddButton1);
        ImageButton add2 = (ImageButton) findViewById(R.id.AddButton2);
        ImageButton subtract1 = (ImageButton) findViewById(R.id.MinusButton1);
        ImageButton subtract2 = (ImageButton) findViewById(R.id.MinusButton2);
        ImageButton addon1 = findViewById(R.id.ArrowButton1);
        ImageButton addon2 = findViewById(R.id.ArrowButton2);

        add1.setOnClickListener(this);
        add2.setOnClickListener(this);
        subtract1.setOnClickListener(this);
        subtract2.setOnClickListener(this);
        addon1.setOnClickListener(this);
        addon2.setOnClickListener(this);

    }

    public void onClick(View view) {
        TextView quantity1 = findViewById(R.id.MenuItem1Quantity);
        String food1 = String.valueOf(findViewById(R.id.MenuItem1Name)).replaceAll(" ", "");
        Log.d("Price1", String.valueOf(findViewById(R.id.MenuItem1Price)));
        //Double price1 = Double.valueOf(String.valueOf(findViewById(R.id.MenuItem1Price)));
        int count1 = Integer.valueOf(quantity1.getText().toString());

        TextView quantity2 = findViewById(R.id.MenuItem2Quantity);
        String food2 = String.valueOf(findViewById(R.id.MenuItem2Name)).replaceAll(" ", "");
        Log.d("Price2", String.valueOf(findViewById(R.id.MenuItem2Price)));
        //Double price2 = Double.valueOf(String.valueOf(findViewById(R.id.MenuItem2Price)));
        int count2 = Integer.valueOf(quantity2.getText().toString());

        int overall_count = count1 + count2;

        Intent addon = new Intent(view.getContext(), AddOnPage.class);

        switch (view.getId()) {
            case R.id.AddButton1:
                if (overall_count < 1) {
                    overall_count++;
                    count1++;
                    quantity1.setText(String.valueOf(count1));
                }
                if (count1 > 0) {
                    findViewById(R.id.ArrowButton1).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.ArrowButton1).setVisibility(View.GONE);
                }
                break;
            case R.id.MinusButton1:
                if (count1 > 0) {
                    overall_count--;
                    count1--;
                    quantity1.setText(String.valueOf(count1));
                }
                if (count1 > 0) {
                    findViewById(R.id.ArrowButton1).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.ArrowButton1).setVisibility(View.GONE);
                }
                break;
            case R.id.ArrowButton1:
                addon.putExtra("foodName", food1);
                //addon.putExtra("foodPrice", price1);
                view.getContext().startActivity(addon);
                break;
            case R.id.AddButton2:
                if (overall_count < 1) {
                    overall_count++;
                    count2++;
                    quantity2.setText(String.valueOf(count2));
                }
                if (count2 > 0) {
                    findViewById(R.id.ArrowButton2).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.ArrowButton2).setVisibility(View.GONE);
                }
                break;
            case R.id.MinusButton2:
                if (count2 > 0) {
                    overall_count--;
                    count2--;
                    quantity2.setText(String.valueOf(count2));
                }
                if (count2 > 0) {
                    findViewById(R.id.ArrowButton2).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.ArrowButton2).setVisibility(View.GONE);
                }
                break;
            case R.id.ArrowButton2:
                addon.putExtra("foodName", food2);
                //addon.putExtra("foodPrice", price2);
                view.getContext().startActivity(addon);
                break;
            default:
                break;
        }
    }
}