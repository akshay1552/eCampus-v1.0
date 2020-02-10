package com.example.ecampus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0;
    Button btnGetStarted;
    Animation btnanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //when this activity is about to be launch we need check if its opened before or not

        if (restorePrefdata()){

            Intent mainActivity = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(mainActivity);
            finish();

        }

        //ini views

        tabIndicator = findViewById(R.id.tab_indicator);
        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        btnanim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.getstart_btn_annimation);

        //fill list screen

        final List<introscreen_item> mList = new ArrayList<>();
        mList.add(new introscreen_item("ADMIN","Allows to update Student entries",R.drawable.admin));
        mList.add(new introscreen_item("TEACHER","Enter the students information into the the database",R.drawable.teacher));
        mList.add(new introscreen_item("STUDENT","Can view their Examination result",R.drawable.student));
        mList.add(new introscreen_item("GUEST","Has the information about College and Department",R.drawable.guest));

        //set viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //setup tablayout with view pager

        tabIndicator.setupWithViewPager(screenPager);

        //next button click listener

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()){

                    position++;
                    screenPager.setCurrentItem(position);

                }

                if (position == mList.size()-1) { // when we reach to the last screen

                    // TODO: shoe the GETSTARTED Button and hide the indicator and next button

                    loadLastScreen();

                }

            }
        });

        //tablayout add changer listener

        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size()-1){

                    loadLastScreen();

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Get started button click listener

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open main activity

                Intent mainActivity = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(mainActivity);

                //parat intro screen nahi yenya sathi
                //we need to save a bollean value to storage so next time when the user run the app
                //we could know that he is already checked the intro screen activity
                //use shared preference to the process

                savePrefsData();
                finish();

            }
        });

    }

    private boolean restorePrefdata() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityOpenBefore = pref.getBoolean("isIntroOpnend",false);
        return  isIntroActivityOpenBefore;

    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPreefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend",true);
        editor.commit();

    }

    //shoe the GETSTARTED Button and hide the indicator and next button

    private void loadLastScreen() {

        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);

        //TODO : ADD an animation the getstarted button
        //setup annimation
        btnGetStarted.setAnimation(btnanim);

    };
}
