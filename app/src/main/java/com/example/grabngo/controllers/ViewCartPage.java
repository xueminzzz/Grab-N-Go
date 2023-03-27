package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import com.example.grabngo.R;

public class ViewCartPage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_cart_page);

        AppCompatButton finalConfirm = findViewById(R.id.placeOrderButton);

        finalConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent finalcheck = new Intent(view.getContext(), OrderConfirmationPage.class);
                view.getContext().startActivity(finalcheck);
            }
        });
    }
}
