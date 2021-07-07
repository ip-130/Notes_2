package com.google.notes_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();



    }

    //Метод получение пользовательских элементов по идентификатору
    public void initView() {
        Button btn_add = findViewById(R.id.btn_add);
        Button btn_notes = findViewById(R.id.btn_notes);
        Button btn_exit = findViewById(R.id.btn_exit);
        Button btn_save_all = findViewById(R.id.save_all);


    }

    //Метод описывающий кнопку Add в activity_main
    public void onClick1(View view){
        fragment_1 fragment_1 = new fragment_1();
        FragmentTransaction frag1 = getSupportFragmentManager().beginTransaction();
        frag1.replace(R.id.container, fragment_1);
        frag1.commit();
    }

    //Метод описывающий кнопку Note в activity_main
    public  void onClick2(View view){
        fragment_2 fragment_2 = new fragment_2();
        FragmentTransaction frag2 = getSupportFragmentManager().beginTransaction();
        frag2.replace(R.id.container, fragment_2);
        frag2.commit();
    }

    public void sharedPref(){
        SharedPreferences prefs = getSharedPreferences("MyPref", MODE_PRIVATE);
        String nameFirst = prefs.getString("etTitle", "sda");
        String nameSecond = prefs.getString("tvNoteDate", "No name defined");
        String nameThird = prefs.getString("tvNoteDate", "No name defined");
        int idName = prefs.getInt("idName", 0);
    }

    //Метод описывающий кнопку Exit в activity_main
    public  void onClick3(View view){
        finish();
        System.exit(0);
    }

    public  void onClick4(View view){
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("etTitle", "string_value");
        editor.putString("tvNoteDate", "string_value");
        editor.putString("etText", "string_value");

        editor.apply();

    }



}