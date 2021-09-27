package com.example.shoppinghobe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {
     public Button button1,button2;
     TextInputEditText username_var, passward_var;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        button1=(Button)findViewById(R.id.signuppp);
        button2=(Button)findViewById(R.id.doggy);
        username_var=findViewById(R.id.username_shop);
        passward_var=findViewById(R.id.passward_shop);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String username=username_var.getEditableText().toString();
             String passward=passward_var.getEditableText().toString();
             if(!username_.isEmpty())
             {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),signupp.class);
                startActivity(intent);

            }
        });
    }
}