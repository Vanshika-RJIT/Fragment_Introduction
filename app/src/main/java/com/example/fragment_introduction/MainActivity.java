package com.example.fragment_introduction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
    }


    public void btn_1(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment_01 f1 = new Fragment_01();
        ft.replace(R.id.mainLayout, f1);
        ft.commit();
    }

    public void btn_2(View view) {
        FragmentManager fm1=getSupportFragmentManager();
        FragmentTransaction ft1=fm1.beginTransaction();
        Fragment_02 f2= new Fragment_02();
        ft1.replace(R.id.mainLayout,f2);
        ft1.commit();

    }


    }