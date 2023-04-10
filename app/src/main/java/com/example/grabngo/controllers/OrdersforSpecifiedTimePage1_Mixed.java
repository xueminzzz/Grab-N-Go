package com.example.grabngo.controllers;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.grabngo.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OrdersforSpecifiedTimePage1_Mixed extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders_for_specified_time_page_1_mixed);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ordersRef = database.getReference("Order");
        //TextView OrderName1 = (TextView) findViewById(R.id.OrderName1) ;

        TextView[] orderNameTextViews = new TextView[] {(TextView) findViewById(R.id.OrderName1), (TextView) findViewById(R.id.OrderName2), (TextView) findViewById(R.id.OrderName3), (TextView) findViewById(R.id.OrderName4), (TextView) findViewById(R.id.OrderName5), (TextView) findViewById(R.id.OrderName6), (TextView) findViewById(R.id.OrderName7), (TextView) findViewById(R.id.OrderName8), (TextView) findViewById(R.id.OrderName9), (TextView) findViewById(R.id.OrderName10)};
        TextView[] orderQuantityTextViews = new TextView[] {(TextView) findViewById(R.id.OrderQuantity1), (TextView) findViewById(R.id.OrderQuantity2), (TextView) findViewById(R.id.OrderQuantity3), (TextView) findViewById(R.id.OrderQuantity4), (TextView) findViewById(R.id.OrderQuantity5), (TextView) findViewById(R.id.OrderQuantity6), (TextView) findViewById(R.id.OrderQuantity7), (TextView) findViewById(R.id.OrderQuantity8), (TextView) findViewById(R.id.OrderQuantity9), (TextView) findViewById(R.id.OrderQuantity10)};
        TextView[] orderPriceTextViews = new TextView[] {(TextView) findViewById(R.id.OrderPrice1), (TextView) findViewById(R.id.OrderPrice2), (TextView) findViewById(R.id.OrderPrice3), (TextView) findViewById(R.id.OrderPrice4), (TextView) findViewById(R.id.OrderPrice5), (TextView) findViewById(R.id.OrderPrice6), (TextView) findViewById(R.id.OrderPrice7), (TextView) findViewById(R.id.OrderPrice8), (TextView) findViewById(R.id.OrderPrice9), (TextView) findViewById(R.id.OrderPrice10)};
        CardView[] orderCardViews = new CardView[] {(CardView) findViewById(R.id.OrderDetailsTab1), (CardView) findViewById(R.id.OrderDetailsTab2),(CardView) findViewById(R.id.OrderDetailsTab3),(CardView) findViewById(R.id.OrderDetailsTab4), (CardView) findViewById(R.id.OrderDetailsTab5),(CardView) findViewById(R.id.OrderDetailsTab6),(CardView) findViewById(R.id.OrderDetailsTab7),(CardView) findViewById(R.id.OrderDetailsTab8),(CardView) findViewById(R.id.OrderDetailsTab9),(CardView) findViewById(R.id.OrderDetailsTab10)};

//        CardView order1 = (CardView) findViewById(R.id.OrderDetailsTab1);
//        LinearLayout mOrderList;
//        mOrderList = (LinearLayout) findViewById(R.id.OrdersforSpecifiedTimePage1);
        ImageView backarrow = (ImageView) findViewById(R.id.BackArrowLogo);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(OrdersforSpecifiedTimePage1_Mixed.this, VendorMainPage_Mixed.class);
                startActivity(back);
            }
        });
        String orderid = getIntent().getStringExtra("id");   //addoncode

        Query query = ordersRef.orderByChild("timeslot").equalTo("12.30");
        //Query query2 = ordersRef.orderByChild("stall_name").equalTo("Chicken Rice");
        //Query query = query.orderByChild("list_of_food/stall_name").equalTo("Chicken Rice");
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                // Loop through the orders in the "orders" node
                int i = 1;
//                final int j = i;
                for (DataSnapshot orderSnapshot : dataSnapshot.getChildren()) {
                    // Get the order details
                    String orderId = orderSnapshot.getKey();

                    double orderPrice = orderSnapshot.child("total_price").getValue(double.class);
                    for (DataSnapshot foodSnapshot : orderSnapshot.child("list_of_food").getChildren()){

                        String foodId = foodSnapshot.getKey();
                        Boolean isCompleted = foodSnapshot.child("isComplete").getValue(Boolean.class);
                        String stall_name = foodSnapshot.child("stall_name").getValue(String.class);
                        Log.d("isCompleted", String.valueOf(isCompleted));
                        if(stall_name.equals("Noodles")){
                            int count = (int) foodSnapshot.getChildrenCount(); // count the number of orders
                            TextView ordersCountTextView = (TextView) findViewById(R.id.NumberofOrders);
                            ordersCountTextView.setText(String.valueOf("TOTAL ORDERS: "+count)); // set the value to the UI
                            // Update the corresponding TextView with the order details
                            TextView orderNameTextView = orderNameTextViews[i-1];
                            orderNameTextView.setText("Order " + i);
                            TextView orderPriceTextView = orderPriceTextViews[i-1];
                            orderPriceTextView.setText("$" + orderPrice);
                            CardView orderCardView = orderCardViews[i-1];
                            if (isCompleted) {
                                // Set background color to grey
                                orderCardView.setBackgroundColor(Color.DKGRAY);
                                orderCardView.setOnClickListener(null);
                            }
                            else{
                                orderCardView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(OrdersforSpecifiedTimePage1_Mixed.this, CompleteOrderPage_Mixed.class);
                                        intent.putExtra("id", orderId);
                                        intent.putExtra("foodid", foodId);
                                        intent.putExtra("totalprice", String.valueOf(orderPrice));
                                        startActivity(intent);
                                    }
                                });
                            }
                            // Increment i for the next order
                            i++;


                        }

                    }
                }
                // Inflate the card view layout
//                    LayoutInflater inflater = LayoutInflater.from(OrdersforSpecifiedTimePage1.this);
//                    View cardView = inflater.inflate(R.layout.orders_for_specified_time_page_1, mOrderList, false);
////                    cardView.setText
//
//                    // Add the card view to the linear layout
//                    mOrderList.addView(cardView);


//              int orderQuantity;
//                for (DataSnapshot orderSnapshot : dataSnapshot.getChildren()){
//                    int orderQuantity = (int) orderSnapshot.getChildrenCount();
//                    String orderName = orderSnapshot.child("food_name").getValue(String.class);
//                    //int orderQuantity = orderSnapshot.child("orderQuantity").getValue(Integer.class);
////                    double price = orderSnapshot.child("base_price").getValue(double.class);





            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Firebase", "Error retrieving orders", databaseError.toException());
            }
        });

//        order1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                Intent i = new Intent(OrdersforSpecifiedTimePage1.this, CompleteOrderPage.class);
//                startActivity(i);
//
//            }
//        });


    }
}
