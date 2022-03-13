package com.example.renotion;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task_table")
public class Task {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "task")
    private String mTask;

    public Task(@NonNull String task) {this.mTask = task;}

    public String getTask(){return this.mTask;}
}
