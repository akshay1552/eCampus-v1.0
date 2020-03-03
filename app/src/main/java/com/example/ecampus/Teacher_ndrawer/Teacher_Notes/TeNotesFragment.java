package com.example.ecampus.Teacher_ndrawer.Teacher_Notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.ecampus.R.id;
import static com.example.ecampus.R.layout;

public class TeNotesFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layout.fragment_tenotes,container,false);

        Button notesconnect = (Button) view.findViewById(id.notes_connect);
        notesconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(getActivity(), TeNotesActivity.class);
                startActivity(in1);
            }
        });

        return view;
    }
}