package com.nhalam.yearbook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        ImageButton btn_back = (ImageButton) findViewById(R.id.button_back_login);
        btn_back.setOnClickListener(v->{
            Intent myIntent = new Intent(this, LoginActivity.class);
            startActivity(myIntent);
        });
    }
}

