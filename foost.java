package com.example.shoppinghobe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class foost extends AppCompatActivity {
     public Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foost);
        button1=(Button)findViewById(R.id.cus);
        button2=(Button)findViewById(R.id.sowner);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(foost.this,login.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(foost.this,addshopo.class);
                startActivity(intent1);
            }
        });
    }
}