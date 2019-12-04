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
public class ReverseFragment extends Fragment {

    EditText etreverseNumber;
    Button btnRevCalculate;


    public ReverseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse, container, false);

        etreverseNumber=view.findViewById(R.id.etRevNum);
        btnRevCalculate=view.findViewById(R.id.btnReverseCalculate);

        btnRevCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(etreverseNumber.getText().toString());
                int reversed=0;
                while(a != 0) {
                    int digit = a % 10;
                    reversed = reversed * 10 + digit;
                    a /= 10;
                }
                etreverseNumber.setText(String.valueOf(reversed));
                //Toast.makeText(getActivity(), "The reversed number id: "+reversed, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
