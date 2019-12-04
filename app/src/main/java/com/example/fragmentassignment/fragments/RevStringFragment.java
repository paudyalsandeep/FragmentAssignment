package com.example.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RevStringFragment extends Fragment {

    EditText etString;
    Button btnStrRevCheck;


    public RevStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_rev_string, container, false);

        etString=view.findViewById(R.id.etStringCheck);
        btnStrRevCheck=view.findViewById(R.id.btnStrRevCheck);

        btnStrRevCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=etString.getText().toString();
                String reverse = new StringBuilder(input).reverse().toString();

                etString.setText(reverse);
                //Toast.makeText(getActivity(), "The reverse is: "+reverse, Toast.LENGTH_SHORT).show();



            }
        });
        return view;
    }

}
