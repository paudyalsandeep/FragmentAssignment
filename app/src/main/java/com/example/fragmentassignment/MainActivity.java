package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentassignment.fragments.AreaFragment;
import com.example.fragmentassignment.fragments.AutomorphicFragment;
import com.example.fragmentassignment.fragments.PalindromeFragment;
import com.example.fragmentassignment.fragments.RevStringFragment;
import com.example.fragmentassignment.fragments.ReverseFragment;
import com.example.fragmentassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    Button btnSum,btnArea,btnReverse,btnPalindrome,btnAutomorphic,btnStringReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum=findViewById(R.id.btnSum);
        btnArea=findViewById(R.id.btnArea);
        btnReverse=findViewById(R.id.btnReverse);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnAutomorphic=findViewById(R.id.btnAutomorphic);
        btnStringReverse=findViewById(R.id.btnStrReverse);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.commit();
            }
        });

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AreaFragment areaFragment=new AreaFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnStringReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                RevStringFragment revStringFragment=new RevStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,revStringFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
