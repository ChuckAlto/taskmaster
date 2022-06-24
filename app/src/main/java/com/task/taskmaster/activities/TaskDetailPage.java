package com.task.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.task.taskmaster.R;

public class TaskDetailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}