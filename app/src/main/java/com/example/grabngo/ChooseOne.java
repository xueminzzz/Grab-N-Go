package com.example.grabngo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//for users to choose whether they would like to enter as vendor or customer
public class ChooseOne extends AppCompatActivity {

    Button connectvendor_btn, connectcustomer_btn;
    Intent intent;
    String type;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        connectvendor_btn = (Button)findViewById(R.id.connectvendorbtn);
        connectcustomer_btn = (Button)findViewById(R.id.connectcustomerbtn);

        connectvendor_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(type.equals("Email")) {
                    Intent loginwithemail_vendor = new Intent(ChooseOne.this, Vendorlogin.class);
                    startActivity(loginwithemail_vendor);
                    finish();
                }
                if (type.equals("SignUp")) {

                    Intent register_vendor = new Intent(ChooseOne.this, VendorRegistration.class);
                    startActivity(register_vendor);
                }
            }
        });

        connectcustomer_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(type.equals("Email")) {
                    Intent loginwithemail_customer = new Intent(ChooseOne.this, Customerlogin.class);
                    startActivity(loginwithemail_customer);
                    finish();
                }
                if(type.equals("SignUp")) {
                    Intent register_customer = new Intent(ChooseOne.this, CustomerRegistration.class);
                    startActivity(register_customer);
                }
            }
        });
    }
}