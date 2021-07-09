package com.google.notes_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.format.DateUtils;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.search_item:
                // do your code
                return true;
            case R.id.upload_item:
                // do your code
                return true;
            case R.id.copy_item:
                // do your code
                return true;
            case R.id.print_item:
                // do your code
                return true;
            case R.id.share_item:
                // do your code
                return true;
            case R.id.bookmark_item:
                // do your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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


    //Метод описывающий кнопку Exit в activity_main
    public  void onClick3(View view){
        finish();
        System.exit(0);
    }

    //Метод описывающий кнопку Save в activity_main
    public  void onClick4(View view){

    }




}