package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AddAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        Button btn_add = (Button) findViewById(R.id.button_add);
        Button btn_back = (Button) findViewById(R.id.button_back);
        ImageView home = (ImageView) findViewById(R.id.logo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(AddAddress.this,Home.class);
                startActivity(home_view);
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_address =new Intent(AddAddress.this,Address.class
                );
                startActivity(add_address);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_address =new Intent(AddAddress.this,Address.class
                );
                startActivity(add_address);
            }
        });
    }
}