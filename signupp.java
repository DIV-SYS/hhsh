package com.example.shoppinghobe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import com.google.firebase.database.FirebaseDatabase;

public class signupp extends AppCompatActivity {
      Button button1;
      FirebaseDatabase firebaseDatabase;
      DatabaseReference refrence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupp);
        button1=(Button)findViewById(R.id.clickablelogin);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),login.class);
                startActivity(intent3);
                finish();
            }
        });

    }
}