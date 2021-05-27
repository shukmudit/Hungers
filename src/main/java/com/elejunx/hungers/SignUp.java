package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;
public class SignUp extends AppCompatActivity {
    EditText email,password,re_pass;
    // defining our own password pattern
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[a-z])" +     // at least 1 lowercse character
                    "(?=.*[A-Z])" +     // at least 1 uppercase character
                    "(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{8,}" +                // at least 4 characters
                    "$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        Button btn_login = (Button) findViewById(R.id.button_login);
        Button btn_register = (Button) findViewById(R.id.button_register);

        email =findViewById(R.id.email_signup);
        password =findViewById(R.id.pass_signup);
        re_pass =findViewById(R.id.re_pass_signup);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_activity =new Intent(SignUp.this,MainActivity.class
                );
                startActivity(login_activity);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass_txt,re_pass_txt,email_txt;
                email_txt = String.valueOf(email.getText());
                pass_txt = String.valueOf(password.getText());
                re_pass_txt = String.valueOf(re_pass.getText());
                Integer pass_match = re_pass_txt.compareTo(pass_txt);
                Boolean error_signup = false;

                if(email_txt.isEmpty()){
                    email.setError("Email can't be blank!");
                    Toast.makeText(SignUp.this, "Email can't be blank!", Toast.LENGTH_SHORT).show();
                    error_signup = true;
                }else if(pass_txt.isEmpty()){
                    password.setError("Password can't be blank!");
                    Toast.makeText(SignUp.this, "Password can't be blank!", Toast.LENGTH_SHORT).show();
                    error_signup = true;
                }else if (pass_match != 0) {
                    password.setError("Password not match!");
                    Toast.makeText(SignUp.this, "Password not match!", Toast.LENGTH_SHORT).show();
                    error_signup = true;
                }else if (pass_match == 0 && !PASSWORD_PATTERN.matcher(pass_txt).matches()) {
                    password.setError("Password is weak!");
                    Toast.makeText(SignUp.this, "Password is Weak!", Toast.LENGTH_SHORT).show();
                    error_signup = true;
                }
                if(!error_signup) {


                }
            }
        });
    }
}