package com.firstapp.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView jerry;
    ImageView Tom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Jerry = findViewById(R.id.jerry);
        Tom = findViewById(R.id.tommy);

        Jerry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), text: "You Clicked Tom", Toast.LENGTH_SHORT).show();
            }
        };
        Jerry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), text: "You Clicked Jerry", Toast.LENGTH_SHORT).show();
            }
        };
    }
}