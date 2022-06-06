package com.example.renotion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    LinearLayout layoutView;
    private final TextView taskItemName;
    private final TextView taskItemDate;

    private TaskViewHolder(View itemView) {
        super(itemView);
        taskItemName = itemView.findViewById(R.id.taskName);
        taskItemDate = itemView.findViewById(R.id.taskDate);
        layoutView = itemView.findViewById(R.id.taskList);
    }

    public void bind(String task, String date) {
        taskItemName.setText(task);
        taskItemDate.setText(date);
    }

    static TaskViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new TaskViewHolder(view);
    }
}
