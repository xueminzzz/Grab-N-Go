package com.example.grabngo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.grabngo.R;

public class OrdersforSpecifiedTimePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders_for_specified_time);

        View includedLayout = findViewById(R.id.orders_for_specified_time_page);
        TextView textView = includedLayout.findViewById(R.id.FixedText13);
        textView.setText(R.string.timeslot);
    }
}

