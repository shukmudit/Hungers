package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Checkout extends AppCompatActivity {
    RadioButton radio1,radio2;
    LinearLayoutCompat layout1,layout2;
    ImageView proceed_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

         radio1= findViewById(R.id.button_radio1);
         radio2= findViewById(R.id.button_radio2);
         layout1 = findViewById(R.id.layou_radio1);
         layout2 = findViewById(R.id.layou_radio2);
         proceed_btn = findViewById(R.id.button_proceed);
        ImageView home = (ImageView) findViewById(R.id.logo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_view = new Intent(Checkout.this,Home.class);
                startActivity(home_view);
            }
        });
        proceed_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odr_view = new Intent(Checkout.this,Order.class);
                startActivity(odr_view);
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.button_radio1:
                if (checked) {
                    radio2.setChecked(false);
                    layout1.setBackgroundResource(R.drawable.checkout_bg_blue);
                    layout2.setBackgroundResource(R.drawable.checkout_bg_white);
                    break;
                }
            case R.id.button_radio2:
                if (checked){
                    radio1.setChecked(false);
                    layout1.setBackgroundResource(R.drawable.checkout_bg_white);
                    layout2.setBackgroundResource(R.drawable.checkout_bg_blue);
                    break;
                }
        }
    }


}