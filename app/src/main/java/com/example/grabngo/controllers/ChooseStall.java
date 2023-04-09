package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import com.example.grabngo.R;

public class ChooseStall extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_stall);

        AppCompatButton stall1 = (AppCompatButton) findViewById(R.id.chickenButton);
        AppCompatButton stall2 = (AppCompatButton) findViewById(R.id.mixedButton);


        stall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chickenRiceStore = new Intent(ChooseStall.this, VendorMainPage.class);
                startActivity(chickenRiceStore);
            }
        });
        stall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mixedRiceStore = new Intent(ChooseStall.this, VendorMainPage_Mixed.class);
                startActivity(mixedRiceStore);
            }
        });


    }
}