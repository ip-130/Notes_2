package com.google.notes_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class fragment_1 extends Fragment {

    public static final String ARG_NOTE = "note";

    TextView tvNoteDate;
    EditText etText;
    EditText etTitle;
    Button saveAll;
    Button rvNotesList;
    View inflatedView = null;
    Calendar dateAndTime=Calendar.getInstance();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        public  void onClick4(View view){
            this.inflatedView = inflater.inflate(R.id.save_all,container, false);
            if(saveAll == null){
                Log.d("debugCheck", "HeadFrag: saveAll is null");
                return inflatedView;
            }
            saveAll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String headline = ((EditText) v.findViewById(R.id.etText)).getText().toString();
                    ((TextView) v.findViewById(R.id.tvNoteDate)).setText(headline);
                    ((EditText) v.findViewById(R.id.etTitle)).getText().toString();
                }
            });
        }
        initView(view);
        setInitialDateTime();
        return view;
        return inflatedView;
    }

    //Метод получение пользовательских элементов по идентификатору
    public void initView(View view){
        etText = (EditText)view.findViewById(R.id.etText);
        tvNoteDate = (TextView)view.findViewById(R.id.tvNoteDate);
        etTitle = (EditText)view.findViewById(R.id.etTitle);
        saveAll = (Button)view.findViewById(R.id.save_all);
        rvNotesList = (Button)view.findViewById(R.id.rvNotesList);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's state here
    }

    // установка начальных даты и времени
    private void setInitialDateTime() {
        tvNoteDate.setText(DateUtils.formatDateTime(getContext(),
                dateAndTime.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
                        | DateUtils.FORMAT_SHOW_TIME));
    }

    //Метод описывающий кнопку Save в activity_main



}