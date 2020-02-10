package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    //layout declaration
    private LinearLayout layout1;
    private LinearLayout layout2;
    private LinearLayout layout3;
    private LinearLayout layout4;


    //annimation declaration
    Animation btnanim1;
    Animation btnanim2;
    Animation btnanim3;
    Animation btnanim4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //declare the animation
        btnanim1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btt1);
        btnanim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btt2);
        btnanim3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btt3);
        btnanim4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.btt4);

        //declare the layout
        layout1 = findViewById(R.id.btn1);
        layout2 = findViewById(R.id.btn2);
        layout3 = findViewById(R.id.btn3);
        layout4 = findViewById(R.id.btn4);

        //setup annimation
        layout1.setAnimation(btnanim1);
        layout2.setAnimation(btnanim2);
        layout3.setAnimation(btnanim3);
        layout4.setAnimation(btnanim4);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AdminActivity = new Intent(LoginActivity.this,AdloginActivity.class);
                startActivity(AdminActivity);
            }
        });



    }
}
