package com.secretcitylabs.digitaledna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecordData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_data);
        getSupportActionBar().hide();
    }
}