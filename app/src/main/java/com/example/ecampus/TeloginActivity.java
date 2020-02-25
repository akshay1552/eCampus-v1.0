package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TeloginActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telogin);

        button1 = findViewById(R.id.telogin_btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TeacherActivity = new Intent(TeloginActivity.this,TeacherActivity.class);
                startActivity(TeacherActivity);
            }
        });

    }
}
