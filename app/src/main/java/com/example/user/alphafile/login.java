package com.example.user.alphafile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button login,register;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.button17);
        register=findViewById(R.id.button18);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =login.getText().toString();
                String password =register.getText().toString();
               if(username.equals("nabid")&&password.equals("1234")){
                   Intent intent=new Intent(login.this,MainActivity.class);
                   startActivity(intent);
               }
                else if(username.equals("sajat")&&password.equals("1234")){
                    Intent intent=new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                }
                if(username.equals("rahim")&&password.equals("1234")){
                    Intent intent=new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                }
               else textView.setText("Try again");
            }
        });

    }
}
