package com.task.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.task.taskmaster.R;

// just like our main() -- entry point
public class MainActivity extends AppCompatActivity {
    public static final String User_Name_Tag = "userName";
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String userName = preferences.getString(SettingsPage.USER_NAME_TAG, "No Name");
        TextView userNameText = findViewById(R.id.myTasksHeader);
        userNameText.setText(userName);




        setUpSettingsImageView();





        Button addTaskButton = findViewById(R.id.AddTaskButton);

        addTaskButton.setOnClickListener(v -> {
            Intent goToAddTaskIntent = new Intent(MainActivity.this, AddTask.class);
            startActivity(goToAddTaskIntent);
        });





        Button allTasksButton = MainActivity.this.findViewById(R.id.AllTasksbutton);

        allTasksButton.setOnClickListener(v ->

        {
            Intent goToAllTasksIntent = new Intent(MainActivity.this, AllTasks.class);
            startActivity(goToAllTasksIntent);
        });




        Button addWalkButton = findViewById(R.id.walkDog);

        addWalkButton.setOnClickListener(v ->

        {
            Intent goToWalkDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            startActivity(goToWalkDogIntent);
        });

        Button addFeedButton = findViewById(R.id.feedDog);

        addFeedButton.setOnClickListener(v ->

        {
            Intent goToFeedDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            startActivity(goToFeedDogIntent);
        });

        Button addVacuumButton = findViewById(R.id.vacuumDog);

        addVacuumButton.setOnClickListener(v ->

        {
            Intent goToVacuumDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            startActivity(goToVacuumDogIntent);
        });

    }

    private void setUpSettingsImageView(){
            ImageView userSettingsImageView = (ImageView) findViewById(R.id.settingsButton);
            userSettingsImageView.setOnClickListener(v -> {
                Intent goToUserSettingsIntent = new Intent(MainActivity.this, SettingsPage.class);
                startActivity(goToUserSettingsIntent);
            });
        }

//        addTaskButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }


