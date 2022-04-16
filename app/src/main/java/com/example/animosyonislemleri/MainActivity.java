package com.example.animosyonislemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonUst,buttonYap;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonUst = findViewById(R.id.buttonUst);
        buttonYap = findViewById(R.id.buttonYap);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ardisikcalismasi);


        buttonYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonUst.startAnimation(animation);
            }
        });

    }
}