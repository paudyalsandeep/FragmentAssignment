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
public class PalindromeFragment extends Fragment {

    EditText etPalindNum;
    Button btnPalindromeCheck;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);

        etPalindNum=view.findViewById(R.id.etPalindNumber);
        btnPalindromeCheck=view.findViewById(R.id.btnPalindromeCheck);

        btnPalindromeCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(etPalindNum.getText().toString());
                int r,sum=0,temp;
                temp=num;
                while(num>0){
                    r=num%10;  //getting remainder
                    sum=(sum*10)+r;
                    num=num/10;
                }
                if (temp==sum)
                {
                    Toast.makeText(getActivity(), "It is a palindrome number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(), "It is not a palindrome number", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }

}
