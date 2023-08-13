package com.secretcitylabs.digitaledna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_controller);
        getSupportActionBar().hide();
    }
}