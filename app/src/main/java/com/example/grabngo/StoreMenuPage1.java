package com.example.grabngo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class StoreMenuPage1 extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_menu_page_1);

        // BUTTON HANDLER
        // I tried to do out of normal and its still pretty repetitive and long
        // But at least its clear what I'm doing and can add more buttons
        ImageButton add1 = (ImageButton) findViewById(R.id.AddButton1);
        ImageButton add2 = (ImageButton) findViewById(R.id.AddButton2);
        ImageButton add3 = (ImageButton) findViewById(R.id.AddButton3);
        ImageButton subtract1 = (ImageButton) findViewById(R.id.MinusButton1);
        ImageButton subtract2 = (ImageButton) findViewById(R.id.MinusButton2);
        ImageButton subtract3 = (ImageButton) findViewById(R.id.MinusButton3);

        add1.setOnClickListener(this);
        add2.setOnClickListener(this);
        add3.setOnClickListener(this);
        subtract1.setOnClickListener(this);
        subtract2.setOnClickListener(this);
        subtract3.setOnClickListener(this);
    }

    public void onClick(View view) {
        TextView quantity;
        int count = 0;

        switch (view.getId()) {
            case R.id.AddButton1:
                quantity = findViewById(R.id.MenuItem1Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count++;
                quantity.setText(String.valueOf(count));
                break;
            case R.id.MinusButton1:
                quantity = findViewById(R.id.MenuItem1Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count--;
                if (count < 0) {
                    count = 0;
                }
                quantity.setText(String.valueOf(count));
                break;
            case R.id.AddButton2:
                quantity = findViewById(R.id.MenuItem2Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count++;
                quantity.setText(String.valueOf(count));
                break;
            case R.id.MinusButton2:
                quantity = findViewById(R.id.MenuItem2Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count--;
                if (count < 0) {
                    count = 0;
                }
                quantity.setText(String.valueOf(count));
                break;
            case R.id.AddButton3:
                quantity = findViewById(R.id.MenuItem3Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count++;
                quantity.setText(String.valueOf(count));
                break;
            case R.id.MinusButton3:
                quantity = findViewById(R.id.MenuItem3Quantity);
                count = Integer.valueOf(quantity.getText().toString());
                count--;
                if (count < 0) {
                    count = 0;
                }
                quantity.setText(String.valueOf(count));
                break;
            default:
                break;
        }
    }
}