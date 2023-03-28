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

public class AddOnPage1 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_on_page_1);

        CheckBox check1 = findViewById(R.id.MeatCheckBox);
        CheckBox check2 = findViewById(R.id.EggCheckBox);
        CheckBox check3 = findViewById(R.id.TofuCheckBox);
        CheckBox check4 = findViewById(R.id.NoAddOnCheckBox);

        AppCompatButton proceedbtn = findViewById(R.id.PlaceOrderButton1);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check1.isChecked()) {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_enabled));
                    proceedbtn.setEnabled(true);
                } else {
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
                } else {
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
                } else {
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
                } else {
                    proceedbtn.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.button_disabled));
                    proceedbtn.setEnabled(false);
                }
            }
        });

        proceedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextAdd = new Intent(view.getContext(), AddOnPage2.class);
                view.getContext().startActivity(nextAdd);
            }
        });
    }
}
