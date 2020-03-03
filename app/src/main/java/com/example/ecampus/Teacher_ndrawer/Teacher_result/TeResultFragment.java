package com.example.ecampus.Teacher_ndrawer.Teacher_result;

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
import com.example.ecampus.Result_upload.Sem1Activity;
import com.example.ecampus.Result_upload.Sem2Activity;
import com.example.ecampus.Result_upload.Sem3Activity;
import com.example.ecampus.Result_upload.Sem4Activity;
import com.example.ecampus.Result_upload.Sem5Activity;
import com.example.ecampus.Result_upload.Sem6Activity;

public class TeResultFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teresult,container,false);

        Button bsem1 = (Button) view.findViewById(R.id.sem1);
        bsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), Sem1Activity.class);
                startActivity(in1);
            }
        });

        Button bsem2 = (Button) view.findViewById(R.id.sem2);
        bsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(), Sem2Activity.class);
                startActivity(in2);
            }
        });

        Button bsem3 = (Button) view.findViewById(R.id.sem3);
        bsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(), Sem3Activity.class);
                startActivity(in3);
            }
        });

        Button bsem4 = (Button) view.findViewById(R.id.sem4);
        bsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), Sem4Activity.class);
                startActivity(in4);
            }
        });

        Button bsem5 = (Button) view.findViewById(R.id.sem5);
        bsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), Sem5Activity.class);
                startActivity(in5);
            }
        });

        Button bsem6 = (Button) view.findViewById(R.id.sem6);
        bsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), Sem6Activity.class);
                startActivity(in6);
            }
        });

        return view;



    }
}