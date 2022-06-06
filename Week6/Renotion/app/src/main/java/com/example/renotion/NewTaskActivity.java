package com.example.renotion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class NewTaskActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.renotion.REPLY";
    private EditText mEditTaskView, description, deadline, deadtime;
    final Calendar calendar = Calendar.getInstance();
    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        mEditTaskView = findViewById(R.id.edit_task);
        description = findViewById(R.id.edit_desc);
        deadline = findViewById(R.id.edit_date);
        deadtime = findViewById(R.id.edit_time);
        final Button button = findViewById(R.id.button_save);

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
                showDate();
            }
        };

        deadline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(NewTaskActivity.this, date, calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        deadtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTime();
            }
        });

        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditTaskView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String taskname = mEditTaskView.getText().toString();
                String desc = description.getText().toString();
                String duedate = deadline.getText().toString();
                String duetime = deadtime.getText().toString();

                Task task = new Task(taskname, desc, duedate, duetime);
                replyIntent.putExtra(EXTRA_REPLY, task);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }

    private void showDate() {
        String format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
        deadline.setText(dateFormat.format(calendar.getTime()));
    }

    private void showTime() {
        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                deadtime.setText(hour + ":" + minute);
            }
        }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
                DateFormat.is24HourFormat(this));
        timePickerDialog.show();
    }
}