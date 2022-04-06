package com.example.a7hwmth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.contayner_one, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.contayner_two, new SecondFragment()).commit();
    }
}