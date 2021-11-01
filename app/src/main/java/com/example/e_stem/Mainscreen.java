package com.example.e_stem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mainscreen extends AppCompatActivity {
    ImageView btnstem,btnquiz,btnreview,btnattendence,btnshare,btnreminder;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        btnstem = findViewById(R.id.btnstem);
        btnattendence=findViewById(R.id.btnattendence);
        btnquiz = findViewById(R.id.btnquiz);
        btnreview = findViewById(R.id.btnreview);
        btnshare = findViewById(R.id.btnshare);
        btnreminder = findViewById(R.id.btnreminder);


        btnstem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, STEMActivity.class);
                startActivity(i);
            }
        });
        btnquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, Quizactivity.class);
                startActivity(i);
            }
        });
        btnreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, Quizactivity.class);
                startActivity(i);
            }
        });
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, ShareActivity.class);
                startActivity(i);
            }
        });
        btnattendence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, AttendenceActivity.class);
                startActivity(i);
            }
        });
        btnreminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Mainscreen.this, ReminderActivity.class);
                startActivity(i);
            }
        });

    }
}