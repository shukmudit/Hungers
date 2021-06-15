package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Button btn_add = (Button) findViewById(R.id.button_add);
        ImageView home = (ImageView) findViewById(R.id.logo);
        ImageView proceed = (ImageView) findViewById(R.id.button_proceed);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Address.this,Home.class);
                startActivity(home_view);
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_address =new Intent(Address.this,AddAddress.class
                );
                startActivity(add_address);
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent address = new Intent(Address.this,Checkout.class);
                startActivity(address);
            }
        });
    }
}