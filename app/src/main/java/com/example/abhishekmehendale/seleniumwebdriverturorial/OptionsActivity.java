package com.example.abhishekmehendale.seleniumwebdriverturorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }

    public void goToIntro(View view){
        Intent intent = new Intent(this,Intro_activity.class);
        startActivity(intent);
    }

    public void goToBasic(View view){
        Intent intent = new Intent(this, BasicCommands.class);
        startActivity(intent);
    }

    public void goToInstall(View view){
        Intent intent = new Intent(this, Installation.class);
        startActivity(intent);
    }

    public void goToMidCommands(View view){
        Intent intent = new Intent(this, MidCommands.class);
        startActivity(intent);
    }

    public void goToAdv(View view){
        Intent intent = new Intent(this, advCommands.class);
        startActivity(intent);
    }
}
