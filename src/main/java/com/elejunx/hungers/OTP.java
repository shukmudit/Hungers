package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class OTP extends AppCompatActivity {
    Intent get_val,login_activity,home_activity;
    String username,password;
    EditText otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);


        Button btn_back = (Button) findViewById(R.id.button_back);
        Button btn_sbmt = (Button) findViewById(R.id.button_submit);

        get_val = getIntent();
        username = get_val.getStringExtra("username");
        otp = findViewById(R.id.input_otp);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_activity =new Intent(OTP.this,MainActivity.class
                );
                startActivity(login_activity);
            }
        });
        btn_sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                home_activity =new Intent(OTP.this,Home.class);
                startActivity(home_activity);


            }
        });
    }

}