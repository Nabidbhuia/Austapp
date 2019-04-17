package com.example.user.alphafile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button routine,calander,notes,meal,about,web,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=findViewById(R.id.button5);
        contact=findViewById(R.id.button10);
        about=findViewById(R.id.button4);
        meal=findViewById(R.id.MealId);
        routine=findViewById(R.id.RoutineId);
        notes=findViewById(R.id.Notesbtn);
        calander=findViewById(R.id.academicCalanderbtn);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note;
                note = new Intent(MainActivity.this,map.class);
                startActivity(note);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click_url("http://www.aust.edu");
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note;
                note = new Intent(MainActivity.this,About.class);
                startActivity(note);
            }
        });
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note;
                note = new Intent(MainActivity.this,meal.class);
                startActivity(note);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note;
                note = new Intent(MainActivity.this,notes.class);
                startActivity(note);
            }
        });
        calander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    click_url("http://www.aust.edu/academic_cal.htm");

            }
        });
        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent_work(v);
            }
        });

    }

    public void Intent_work(View view){
        Intent Routin;
        Routin = new Intent(MainActivity.this,Routine.class);
        startActivity(Routin);
    }

    private void click_url(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
