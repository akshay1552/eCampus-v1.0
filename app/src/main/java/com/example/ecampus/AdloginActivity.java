package com.example.ecampus;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdloginActivity extends AppCompatActivity {

    EditText username,password;
    Button btnlogin;

    String admin_id = "ecampus";
    String admin_pw = "project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adlogin);

        username = findViewById(R.id.adminid);
        password = findViewById(R.id.adminpw);
        btnlogin = findViewById(R.id.adlogin_btn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //validate input

                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){

                    Toast.makeText(AdloginActivity.this,"Please Enter Username and Password",Toast.LENGTH_LONG).show();

                }else if (username.getText().toString().equals(admin_id)){

                    //check password
                    if (password.getText().toString().equals(admin_pw)){

                        Toast.makeText(AdloginActivity.this,"Succesfully Login !!!",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(AdloginActivity.this,AdNavigationActivity.class);
                        startActivity(intent);

                    }else {

                        Toast.makeText(AdloginActivity.this,"Login Failed",Toast.LENGTH_LONG).show();

                    }

                }else {

                    Toast.makeText(AdloginActivity.this,"Login Failed :(",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
