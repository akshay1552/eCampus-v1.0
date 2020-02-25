package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StloginActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stlogin);

        button1 = findViewById(R.id.stlogin_btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StudentActivity = new Intent(StloginActivity.this,StudentActivity.class);
                startActivity(StudentActivity);
            }
        });

    }
}
