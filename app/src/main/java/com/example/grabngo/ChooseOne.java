package com.example.grabngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//for users to choose whether they would like to enter as vendor or customer
public class ChooseOne extends AppCompatActivity {

    Button Vendor, Customer;
    Intent intent;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        Vendor = (Button)findViewById(R.id.vendor);
        Customer = (Button)findViewById(R.id.customer);

        Vendor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(type.equals("Email")) {
                    Intent loginemail = new Intent(ChooseOne.this, Vendorlogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if (type.equals("SignUp")) {

                    Intent Register = new Intent(ChooseOne.this, VendorRegistration.class);
                    startActivity(Register);
                }
            }
        });

        Customer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(type.equals("Email")) {
                    Intent loginemailcust = new Intent(ChooseOne.this, Login.class);
                    startActivity(loginemailcust);
                    finish();
                }
                if(type.equals("SignUp")) {
                    Intent Registercust = new Intent(ChooseOne.this, Registration.class);
                    startActivity(Registercust);
                }
            }
        });
    }
}