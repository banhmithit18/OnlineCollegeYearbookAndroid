package com.nhalam.yearbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_main_layout);

    }
    public void changeDrawerUserLayout(View view){
        setContentView(R.layout.user_drawer_layout);
        Button btn_sign_out =  findViewById(R.id.button_sign_out);
        btn_sign_out.setOnClickListener(v->{
            Intent myIntent = new Intent(this, LoginActivity.class);
            startActivity(myIntent);
        });

    }
    public void changeStudentMainLayout(View view){
        setContentView(R.layout.student_main_layout);
    }
    public void changeTeacherMainLayout(View view){setContentView(R.layout.teacher_main_layout);}
    public void changeUserEditLayout(View view ){ setContentView(R.layout.edit_user_layout);}
    public void changeAchievementSelectLayout(View view ){ setContentView(R.layout.achievement_select_layout);}
    public void changeAchievementDetailSelectLayout(View view){setContentView(R.layout.achievement_detail_select_layout);}
    public void changeAchievementResultLayout(View view){setContentView(R.layout.achievement_result_layout);}
    public void changeStudentFindLayout(View view ){setContentView(R.layout.student_find_layout);}
    public void changeTeacherFindLayout(View view ){setContentView(R.layout.teacher_find_layout);}



}