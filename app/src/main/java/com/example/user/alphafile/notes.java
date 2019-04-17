package com.example.user.alphafile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notes extends AppCompatActivity {

    Button totobutton;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        totobutton=findViewById(R.id.twoone);
        totobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buymeal;
                buymeal = new Intent(notes.this,activityToTo.class);
                startActivity(buymeal);
            }
        });
    }
}
