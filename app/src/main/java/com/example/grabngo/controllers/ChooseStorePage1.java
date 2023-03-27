package com.example.grabngo.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.grabngo.R;

public class ChooseStorePage1 extends Activity {
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_store_page_1);

        CardView store1 = findViewById(R.id.ChickenRiceStoreTab);
        //CardView store2 = findViewById(R.id.BanmianStoreTab);
        //CardView store3 = findViewById(R.id.MixedRiceStoreTab);

        store1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chickenRiceStore = new Intent(view.getContext(), StoreMenuPage1.class);
                view.getContext().startActivity(chickenRiceStore);
            }
        });

//        store2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent banMianStore = new Intent(view.getContext(), StoreMenuPage1.class);
//                view.getContext().startActivity(banMianStore);
//            }
//        });
//
//        store3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mixedRiceStore = new Intent(view.getContext(), StoreMenuPage1.class);
//                view.getContext().startActivity(mixedRiceStore);
//            }
//        });

    }
}
