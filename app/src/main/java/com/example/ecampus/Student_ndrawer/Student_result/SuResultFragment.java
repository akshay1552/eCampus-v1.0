package com.example.ecampus.Student_ndrawer.Student_result;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ecampus.R;
import com.example.ecampus.Student_result.Results1Activity;
import com.example.ecampus.Student_result.Results2Activity;
import com.example.ecampus.Student_result.Results3Activity;
import com.example.ecampus.Student_result.Results4Activity;
import com.example.ecampus.Student_result.Results5Activity;
import com.example.ecampus.Student_result.Results6Activity;

public class SuResultFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_suresult,container,false);

        Button bsem1 = (Button) view.findViewById(R.id.sem1);
        bsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), Results1Activity.class);
                startActivity(in1);
            }
        });

        Button bsem2 = (Button) view.findViewById(R.id.sem2);
        bsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Results2Activity.class);
                startActivity(in2);
            }
        });

        Button bsem3 = (Button) view.findViewById(R.id.sem3);
        bsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Results3Activity.class);
                startActivity(in3);
            }
        });

        Button bsem4 = (Button) view.findViewById(R.id.sem4);
        bsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Results4Activity.class);
                startActivity(in4);
            }
        });

        Button bsem5 = (Button) view.findViewById(R.id.sem5);
        bsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), Results5Activity.class);
                startActivity(in5);
            }
        });

        Button bsem6 = (Button) view.findViewById(R.id.sem6);
        bsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), Results6Activity.class);
                startActivity(in6);
            }
        });

        return view;
    }
}