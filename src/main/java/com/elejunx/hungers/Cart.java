package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ImageView home = (ImageView) findViewById(R.id.logo);
        ImageView proceed = (ImageView) findViewById(R.id.button_proceed);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Cart.this,Home.class);
                startActivity(home_view);
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent address = new Intent(Cart.this,Address.class);
                startActivity(address);
            }
        });
    }


}