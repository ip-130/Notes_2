package com.google.notes_2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class fragment_1 extends Fragment {
    TextView tvNoteDate;
    EditText etText;
    EditText etTitle;
    Calendar dateAndTime=Calendar.getInstance();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        initView(view);
        setInitialDateTime();
        return view;
    }

    //Метод получение пользовательских элементов по идентификатору
    public void initView(View view){
        etText = (EditText)view.findViewById(R.id.etText);
        tvNoteDate = (TextView)view.findViewById(R.id.tvNoteDate);
        etTitle = (EditText)view.findViewById(R.id.etTitle);
    }

    // установка начальных даты и времени
    private void setInitialDateTime() {
        tvNoteDate.setText(DateUtils.formatDateTime(getContext(),
                dateAndTime.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
                        | DateUtils.FORMAT_SHOW_TIME));
    }
}