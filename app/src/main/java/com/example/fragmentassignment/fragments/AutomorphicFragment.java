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
public class AutomorphicFragment extends Fragment {

    EditText etAutomorphic;
    Button btnAutomorphCheck;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic, container, false);
        etAutomorphic=view.findViewById(R.id.etAutomorphic);
        btnAutomorphCheck=view.findViewById(R.id.btnAutomorpCheck);

        btnAutomorphCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=Integer.parseInt(etAutomorphic.getText().toString());
                int square=number*number;

                String str_num=Integer.toString(number);
                String str_sq=Integer.toString(square);

                if (str_sq.endsWith(str_num))
                {
                    Toast.makeText(getActivity(), "It is an automorphic number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(), "It is not an automorphic number", Toast.LENGTH_SHORT).show();
                }


            }
        });
        return view;
    }

}
