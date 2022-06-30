package com.task.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.task.taskmaster.R;

public class TaskDetailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setUpTaskDetailPage(){
        Intent callingIntent = getIntent();
        String taskNameString = null;
        if(callingIntent != null){
            taskNameString = callingIntent.getStringExtra(MainActivity.User_Name_Tag);
        }

//        TextView taskDetailTaskName = findViewById(R.id.userNameInput);
//        if(userNameInput
        }
    }
