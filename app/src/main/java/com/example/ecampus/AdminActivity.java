package com.example.ecampus;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class AdminActivity extends AppCompatActivity {

    SNavigationDrawer sNavigationDrawer;
    Class fragmentClass;
    public static Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        sNavigationDrawer = findViewById(R.id.navigationDrawer);

        //Menu add
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Admin",R.drawable.app_color));
        menuItems.add(new MenuItem("About College",R.drawable.app_color));
        menuItems.add(new MenuItem("About Department",R.drawable.app_color));
        menuItems.add(new MenuItem("Teacher Management",R.drawable.app_color));
        menuItems.add(new MenuItem("Student Registration",R.drawable.app_color));
        menuItems.add(new MenuItem("Course Registration",R.drawable.app_color));
        menuItems.add(new MenuItem("Exam Registration",R.drawable.app_color));
        menuItems.add(new MenuItem("Result",R.drawable.app_color));
        menuItems.add(new MenuItem("Forum",R.drawable.app_color));
        menuItems.add(new MenuItem("Logout",R.drawable.app_color));

        sNavigationDrawer.setMenuItemList(menuItems);



    }
}
