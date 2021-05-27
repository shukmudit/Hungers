package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        Button btn_login = (Button) findViewById(R.id.button_login);
        Button btn_get_otp = (Button) findViewById(R.id.button_get_opt);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_activity =new Intent(ForgotPass.this,MainActivity.class
                );
                startActivity(login_activity);
            }
        });
        btn_get_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reset_pass =new Intent(ForgotPass.this,OTP.class
                );
                startActivity(reset_pass);
            }
        });
    }
}