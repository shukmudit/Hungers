package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    boolean is_signedIn;
    Intent home_activity,otp_activity;
    EditText email,password;
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);





            Button btn_scl_login = (Button) findViewById(R.id.button_scl_login);
            Button btn_login = (Button) findViewById(R.id.button_login);
            email = findViewById(R.id.input_login);
            password = findViewById(R.id.pass_signup);

        btn_scl_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    home_activity =new Intent(MainActivity.this,Home.class
                    );
                    startActivity(home_activity);
                }
            });

            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    otp_activity =new Intent(MainActivity.this,OTP.class
                    );
                    startActivity(otp_activity);


                }
            });


    }
}