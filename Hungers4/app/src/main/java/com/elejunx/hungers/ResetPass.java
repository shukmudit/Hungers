package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);


        Button btn_login = (Button) findViewById(R.id.button_login);
        Button btn_sbmt = (Button) findViewById(R.id.button_reset);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_activity =new Intent(ResetPass.this,MainActivity.class
                );
                startActivity(login_activity);
            }
        });
        btn_sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reset_pass =new Intent(ResetPass.this,MainActivity.class
                );
                startActivity(reset_pass);
            }
        });
    }
}