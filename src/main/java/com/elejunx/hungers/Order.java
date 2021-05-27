package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Order extends AppCompatActivity {
    Button bck_to_odrs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ImageView odr_done = (ImageView) findViewById(R.id.done_img);
        bck_to_odrs =  findViewById(R.id.button_back);
        ImageView home = (ImageView) findViewById(R.id.logo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Order.this,Home.class);
                startActivity(home_view);
            }
        });
        bck_to_odrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent his_view = new Intent(Order.this,OrderHistory.class);
                startActivity(his_view);
            }
        });
        odr_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Order.this,Home.class);
                startActivity(home_view);
            }
        });

    }
}