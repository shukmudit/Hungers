package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


public class Home extends AppCompatActivity {
    TextView profile,odr_history,logout,all_items;
    ImageView burger,shakes,wraps,sandwich;
    ScrollView all_sec,burger_sec,shakes_sec,sandwich_sec,wrap_sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView cart_btn = (ImageView) findViewById(R.id.cart);
        profile         = findViewById(R.id.profie);
        odr_history     = findViewById(R.id.odr_history);
        logout          = findViewById(R.id.logout);
        all_items       = findViewById(R.id.all_items);
        burger          = findViewById(R.id.burger);
        shakes          = findViewById(R.id.shakes);
        wraps           = findViewById(R.id.wraps);
        sandwich        = findViewById(R.id.sandwich);
        all_sec         = findViewById(R.id.all_sec);
        burger_sec      = findViewById(R.id.burger_sec);
        sandwich_sec    = findViewById(R.id.sandwich_sec);
        shakes_sec      = findViewById(R.id.shakes_sec);
        wrap_sec        = findViewById(R.id.wrap_sec);

        cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cat_view = new Intent(Home.this,Cart.class);
                startActivity(cat_view);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_view = new Intent(Home.this,Profile.class);
                startActivity(profile_view);
            }
        });
        odr_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odr_his_view = new Intent(Home.this,OrderHistory.class);
                startActivity(odr_his_view);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Initiate Signout", "Initiate Signout Sequence");


                Intent login_view = new Intent(Home.this,MainActivity.class);
                startActivity(login_view);
            }
        });

    }
    public void change_back(View view) {
        switch(view.getId()) {
            case R.id.all_items:
                all_items.setBackgroundResource(R.drawable.hover_back);
                burger.setBackgroundResource(R.drawable.circular_container);
                shakes.setBackgroundResource(R.drawable.circular_container);
                wraps.setBackgroundResource(R.drawable.circular_container);
                sandwich.setBackgroundResource(R.drawable.circular_container);
                all_sec.setVisibility(View.VISIBLE);
                burger_sec.setVisibility(View.GONE);
                sandwich_sec.setVisibility(View.GONE);
                wrap_sec.setVisibility(View.GONE);
                shakes_sec.setVisibility(View.GONE);
                break;
            case R.id.burger:
                all_items.setBackgroundResource(R.drawable.circular_container);
                burger.setBackgroundResource(R.drawable.hover_back);
                shakes.setBackgroundResource(R.drawable.circular_container);
                wraps.setBackgroundResource(R.drawable.circular_container);
                sandwich.setBackgroundResource(R.drawable.circular_container);
                all_sec.setVisibility(View.GONE);
                burger_sec.setVisibility(View.VISIBLE);
                sandwich_sec.setVisibility(View.GONE);
                wrap_sec.setVisibility(View.GONE);
                shakes_sec.setVisibility(View.GONE);
                    break;
            case R.id.shakes:
                all_items.setBackgroundResource(R.drawable.circular_container);
                burger.setBackgroundResource(R.drawable.circular_container);
                shakes.setBackgroundResource(R.drawable.hover_back);
                wraps.setBackgroundResource(R.drawable.circular_container);
                sandwich.setBackgroundResource(R.drawable.circular_container);

                all_sec.setVisibility(View.GONE);
                burger_sec.setVisibility(View.GONE);
                sandwich_sec.setVisibility(View.GONE);
                wrap_sec.setVisibility(View.GONE);
                shakes_sec.setVisibility(View.VISIBLE);
                    break;
            case R.id.wraps:
                all_items.setBackgroundResource(R.drawable.circular_container);
                burger.setBackgroundResource(R.drawable.circular_container);
                shakes.setBackgroundResource(R.drawable.circular_container);
                wraps.setBackgroundResource(R.drawable.hover_back);
                sandwich.setBackgroundResource(R.drawable.circular_container);

                all_sec.setVisibility(View.GONE);
                burger_sec.setVisibility(View.GONE);
                sandwich_sec.setVisibility(View.GONE);
                wrap_sec.setVisibility(View.VISIBLE);
                shakes_sec.setVisibility(View.GONE);
                    break;
            case R.id.sandwich:
                all_items.setBackgroundResource(R.drawable.circular_container);
                burger.setBackgroundResource(R.drawable.circular_container);
                shakes.setBackgroundResource(R.drawable.circular_container);
                wraps.setBackgroundResource(R.drawable.circular_container);
                sandwich.setBackgroundResource(R.drawable.hover_back);

                all_sec.setVisibility(View.GONE);
                burger_sec.setVisibility(View.GONE);
                sandwich_sec.setVisibility(View.VISIBLE);
                wrap_sec.setVisibility(View.GONE);
                shakes_sec.setVisibility(View.GONE);
                    break;
        }
    }
}