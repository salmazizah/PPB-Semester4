package com.example.renotion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TaskItemDetail extends AppCompatActivity {
    TaskListAdapter taskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        TextView taskName = findViewById(R.id.task_name);
        TextView taskDesc = findViewById(R.id.task_desc);
        TextView taskDate = findViewById(R.id.task_date);
        TextView taskTime = findViewById(R.id.task_time);

        Intent intent = getIntent();

        Task task = intent.getParcelableExtra("task");
        taskName.setText(task.getTask());
        taskDesc.setText(task.getDesc());
        taskDate.setText(task.getDate());
        taskTime.setText(task.getTime());
    }
}
