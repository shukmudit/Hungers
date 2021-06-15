package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


public class Profile extends AppCompatActivity {
    TextView profile,odr_history,logout,edit;
    ScrollView profile_view,edit_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profile = findViewById(R.id.profie);
        odr_history = findViewById(R.id.odr_history);
        logout = findViewById(R.id.logout);
        edit = findViewById(R.id.edit);
        profile_view = findViewById(R.id.profile_view);
        edit_view = findViewById(R.id.edit_view);
        ImageView home = (ImageView) findViewById(R.id.logo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Profile.this,Home.class);
                startActivity(home_view);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile_view = new Intent(Profile.this,Profile.class);
                startActivity(profile_view);
            }
        });
        odr_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odr_his_view = new Intent(Profile.this,OrderHistory.class);
                startActivity(odr_his_view);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Initiate Signout", "Initiate Signout Sequence");


                Intent login_view = new Intent(Profile.this,MainActivity.class);
                startActivity(login_view);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence edit_text;
                edit_text = edit.getText();
                if(edit_text == "edit") {
                    edit.setText("save");
                    profile_view.setVisibility(View.GONE);
                    edit_view.setVisibility(View.VISIBLE);
                }else {
                    edit.setText("edit");
                    profile_view.setVisibility(View.VISIBLE);
                    edit_view.setVisibility(View.GONE);
                }

            }
        });
    }
}