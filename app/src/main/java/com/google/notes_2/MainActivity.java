package com.google.notes_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void onClick1(View view){
        fragment_1 fragment_1 = new fragment_1();
        FragmentTransaction frag1 = getSupportFragmentManager().beginTransaction();
        frag1.replace(R.id.container, fragment_1);
        frag1.commit();
    }

    public  void onClick2(View view){
        fragment_2 fragment_2 = new fragment_2();
        FragmentTransaction frag2 = getSupportFragmentManager().beginTransaction();
        frag2.replace(R.id.container, fragment_2);
        frag2.commit();
    }

    public  void onClick3(View view){

    }


}