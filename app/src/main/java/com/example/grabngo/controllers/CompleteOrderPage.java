package com.example.grabngo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.grabngo.R;

public class CompleteOrderPage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_order_page);

        Button completeOrderButton = (Button) findViewById(R.id.ProceedButton);
        completeOrderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(CompleteOrderPage.this, OrdersforSpecifiedTimePage2.class);
                startActivity(i);

            }
        });

    }
}
