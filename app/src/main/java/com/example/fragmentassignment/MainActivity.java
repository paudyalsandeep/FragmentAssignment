package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentassignment.fragments.AreaFragment;
import com.example.fragmentassignment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    Button btnSum,btnArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum=findViewById(R.id.btnSum);
        btnArea=findViewById(R.id.btnArea);

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
    }
}
