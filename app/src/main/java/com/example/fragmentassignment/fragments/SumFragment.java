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
public class SumFragment extends Fragment {

    private EditText etFirst,etSecond;
    private Button btnCalculate;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_sum, container, false);

        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnCalculate=view.findViewById(R.id.btnCalculate);




        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(etFirst.getText().toString());
                int second=Integer.parseInt(etSecond.getText().toString());
                int result=first+second;
                Toast.makeText(getActivity(), "The sum is: "+result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
