package com.nhalam.yearbook;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_main_layout);

    }

    public void changeDrawerAdminLayout(View view) {
        setContentView(R.layout.admin_drawer_layout);
    }

    public void addStudent(View view) {
        setContentView(R.layout.add_student);
    }

    public void addTeacher(View view) {
        setContentView(R.layout.add_teacher);
    }
    public void changeAdminLayout(View view) {
        setContentView(R.layout.admin_main_layout);
    }



}
