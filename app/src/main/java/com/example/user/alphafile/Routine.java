package com.example.user.alphafile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Routine extends AppCompatActivity {

    Button examRoutine,classRoutine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);
       examRoutine=findViewById(R.id.examRoutinbtn);
        classRoutine=findViewById(R.id.classRoutine);


        examRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Routin;
                Routin = new Intent(Routine.this,examRoutinepdf.class);
                startActivity(Routin);

            }
        });
        classRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Routin2;
                Routin2 = new Intent(Routine.this,Routinepdf.class);
                startActivity(Routin2);
            }
        });
    }

}
