package com.task.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.task.taskmaster.R;

public class SettingsPage extends AppCompatActivity {
    // this is for setting up shared preferences
    SharedPreferences preferences;
    // This is the preference tag
    public static final String USER_NAME_TAG = "userName";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        // this is the shared preference instance
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String userNameText = preferences.getString(USER_NAME_TAG, "");

        if(!userNameText.isEmpty()){
            EditText userNameTextEdited = findViewById(R.id.userNameInput);
            userNameTextEdited.setText(userNameText);
        }

        Button userNameButton = findViewById(R.id.settingsSubmitButton);
        userNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // this sets up the editor
                SharedPreferences.Editor preferenceEditor = preferences.edit();
                EditText userNameText = findViewById(R.id.userNameInput);
                String userNameString = userNameText.getText().toString();

                preferenceEditor.putString(USER_NAME_TAG, userNameString);
                preferenceEditor.apply(); // can not save without apply()

                Toast.makeText(SettingsPage.this, "Name Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}