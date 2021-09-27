package com.example.shoppinghobe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splasher extends AppCompatActivity {

     private static int timer=4000;
    ImageView imageView;
    TextView textView1,textView2;
    Animation upperanimation,bottomanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splasher);

        imageView=findViewById(R.id.homelogo);
        textView1=findViewById(R.id.introf);
        textView2=findViewById(R.id.intros);

        upperanimation= AnimationUtils.loadAnimation(this,R.anim.upper_animation);
        bottomanimation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView.setAnimation(upperanimation);
        textView1.setAnimation(bottomanimation);
        textView2.setAnimation(bottomanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splasher.this,foost.class);
                startActivity(intent);
                finish();
            }
        },timer);


    }
}