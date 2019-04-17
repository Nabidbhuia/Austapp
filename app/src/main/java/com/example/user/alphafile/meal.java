package com.example.user.alphafile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class meal extends AppCompatActivity {

    Button buymeal;
    int sum=0;

    CheckBox milkc,waterc,birianic,breadc,fishc,lemonc;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);
        milkc=findViewById(R.id.checkBoxMilk);
     //   waterc=findViewById(R.id.checkBoxWater);
        birianic=findViewById(R.id.checkBoxBirani);
        breadc=findViewById(R.id.checkBoxBread);
        fishc=findViewById(R.id.checkBoxFish);
        lemonc=findViewById(R.id.checkBoxLemon);
        buymeal=findViewById(R.id.mealbtn);
        resultText=findViewById(R.id.textViewResult);
        buymeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder=new StringBuilder();
                if(milkc.isChecked()){
                    int m=20;
                    String value=milkc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=m+sum;
                }
                /*if(waterc.isChecked()){
                    int w=5;
                    String value=waterc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=w+sum;
                }*/
                if(birianic.isChecked()){
                    int bri=50;
                    String value=birianic.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=bri+sum;
                }
                if(breadc.isChecked()){
                    int b=5;
                    String value=breadc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=b+sum;
                }
                if(fishc.isChecked()){
                    int f=50;
                    String value=fishc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=f+sum;
                }
                if(lemonc.isChecked()){
                    int l=20;
                    String value=lemonc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=l+sum;
                }
                if(milkc.isChecked()){
                    int m=20;
                    String value=milkc.getText().toString();
                    stringBuilder.append(value+"is ordered ,\n");
                    sum=m+sum;
                }resultText.setText(stringBuilder);



                showIntent(v);
            }

            private void showIntent(View view) {
                Intent buymeal;
                buymeal = new Intent(meal.this,buymeal.class);
                startActivity(buymeal);
            }

        });
    }
}
