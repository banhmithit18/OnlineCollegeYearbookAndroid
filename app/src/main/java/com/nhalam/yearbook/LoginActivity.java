package com.nhalam.yearbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        // get button
        Button btn_signup = findViewById(R.id.button_sign_up);

        //set event
       btn_signup.setOnClickListener(v->{
           Intent myIntent = new Intent(this, RegisterActivity.class);
           startActivity(myIntent);
       });

    }


}

