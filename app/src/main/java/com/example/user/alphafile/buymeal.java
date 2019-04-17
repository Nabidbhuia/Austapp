package com.example.user.alphafile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buymeal extends AppCompatActivity {
    Button bkash,rocket,visa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buymeal);
        bkash=findViewById(R.id.button);
        rocket=findViewById(R.id.button2);
        visa=findViewById(R.id.button3);
        bkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buymeal;
                buymeal = new Intent(buymeal.this,payment.class);
                startActivity(buymeal);
            }
        });
        rocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buymeal;
                buymeal = new Intent(buymeal.this,payment.class);
                startActivity(buymeal);
            }
        });
        visa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buymeal;
                buymeal = new Intent(buymeal.this,payment.class);
                startActivity(buymeal);
            }
        });
    }
}
