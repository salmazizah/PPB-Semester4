package com.example.renotion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    private final TextView taskItemView;

    private TaskViewHolder(View itemView) {
        super(itemView);
        taskItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        taskItemView.setText(text);
    }

    static TaskViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new TaskViewHolder(view);
    }
}
