package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderHistory extends AppCompatActivity {
    TextView profile,odr_history,logout,orders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        profile = findViewById(R.id.profie);
        odr_history = findViewById(R.id.odr_history);
        logout = findViewById(R.id.logout);
        ImageView home = (ImageView) findViewById(R.id.logo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(OrderHistory.this,Home.class);
                startActivity(home_view);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_view = new Intent(OrderHistory.this,Profile.class);
                startActivity(profile_view);
            }
        });
        odr_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odr_his_view = new Intent(OrderHistory.this,OrderHistory.class);
                startActivity(odr_his_view);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_view = new Intent(OrderHistory.this,MainActivity.class);
                startActivity(login_view);
            }
        });

    }
    public void order_view(View view){
        Intent odr_view = new Intent(OrderHistory.this,Order.class);
        startActivity(odr_view);
    }
}