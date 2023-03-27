package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

import com.example.grabngo.R;

public class AddOnPage2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_on_page_2);

        ImageButton continuebtn = (ImageButton) findViewById(R.id.ContinueShoppingTab);
        ImageButton confirmbtn = (ImageButton) findViewById(R.id.ViewCartTab);

        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backChoose = new Intent(view.getContext(), ChooseStorePage1.class);
                view.getContext().startActivity(backChoose);
            }
        });

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextCart = new Intent(view.getContext(), ViewCartPage.class);
                view.getContext().startActivity(nextCart);
            }
        });

    }
}
