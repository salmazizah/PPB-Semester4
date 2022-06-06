package com.example.renotion;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task_table")
public class Task implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    int id;

    @NonNull
    @ColumnInfo(name = "task")
    private String mTask;

    @ColumnInfo(name = "desc")
    private String mDesc;

    @NonNull
    @ColumnInfo(name = "date")
    private String mDate;

    @NonNull
    @ColumnInfo(name = "time")
    private String mTime;

    public Task(@NonNull String task, String desc, String date, String time) {
        this.mTask = task;
        this.mDesc = desc;
        this.mDate = date;
        this.mTime = time;
    }

    public String getTask(){return this.mTask;}
    public String getDesc(){return this.mDesc;}
    public String getDate(){return this.mDate;}
    public String getTime(){return this.mTime;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.mTask);
        parcel.writeString(this.mDesc);
        parcel.writeString(this.mDate);
        parcel.writeString(this.mTime);
    }

    protected Task(Parcel in){
        this.id = in.readInt();
        this.mTask = in.readString();
        this.mDesc = in.readString();
        this.mDate = in.readString();
        this.mTime = in.readString();
    }

    public static final Parcelable.Creator<Task> CREATOR = new Parcelable.Creator<Task>(){

        @Override
        public Task createFromParcel(Parcel source) {
            return new Task(source);
        }

        @Override
        public Task[] newArray(int size) {
            return new Task[size];
        }
    };
}
