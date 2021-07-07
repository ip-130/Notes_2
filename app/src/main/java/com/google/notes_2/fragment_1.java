package com.google.notes_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class fragment_1 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //Метод получение пользовательских элементов по идентификатору
    public void initView(View view){
        EditText etText = (EditText)view.findViewById(R.id.etText);
        TextView tvNoteDate = (TextView)view.findViewById(R.id.tvNoteDate);;
        EditText etTitle = (EditText)view.findViewById(R.id.etTitle);;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        initView();
        return inflater.inflate(R.layout.fragment_1, container, false);


    }



}