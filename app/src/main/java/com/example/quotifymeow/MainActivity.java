package com.example.quotifymeow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.meowBottomNavigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_person_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_settings));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.baseline_rocket_launch));

        bottomNavigation.show(1, true);
    }
}