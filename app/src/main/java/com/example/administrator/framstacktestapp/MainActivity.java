package com.example.administrator.framstacktestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rey.material.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

    }
}