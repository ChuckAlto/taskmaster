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
        String userName = preferences.getString(SettingsPage.USER_NAME_TAG, "My Tasks");
        TextView userNameText = findViewById(R.id.myTasksHeader);
        userNameText.setText(userName);




        setUpSettingsImageView();
        setUpWalkDogButton();
        setUpFeedDogButton();
        setUpVacuumDogButton();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        String userName = preferences.getString(SettingsPage.USER_NAME_TAG, "No name");
//        TextView userNameText = findViewById(R.id.userNameInput);
//        userNameText.setText((userName));
//    }



    private void setUpWalkDogButton(){
        Button walkDogButton = findViewById(R.id.walkDog);
        walkDogButton.setOnClickListener(v -> {
            Intent goToWalkDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            goToWalkDogIntent.putExtra(User_Name_Tag, "Walk The Dog");
            startActivity((goToWalkDogIntent));
        });
    }

    private void setUpFeedDogButton(){
        Button feedDogButton = findViewById(R.id.feedDog);
        feedDogButton.setOnClickListener(v -> {
            Intent goToFeedDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            goToFeedDogIntent.putExtra(User_Name_Tag, "Feed The Dog");
            startActivity((goToFeedDogIntent));
        });
    }

    private void setUpVacuumDogButton(){
        Button vacuumDogButton = findViewById(R.id.vacuumDog);
        vacuumDogButton.setOnClickListener(v -> {
            Intent goToVacuumDogIntent = new Intent(MainActivity.this, TaskDetailPage.class);
            goToVacuumDogIntent.putExtra(User_Name_Tag, "Vacuum The Dog");
            startActivity((goToVacuumDogIntent));
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


