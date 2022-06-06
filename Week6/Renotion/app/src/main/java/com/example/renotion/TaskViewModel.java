package com.example.renotion;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TaskViewModel extends AndroidViewModel {
    private TaskRepository mRepository;
    private final LiveData<List<Task>> mAllTasks;
    private WorkManager workManager;
    private static final String TAG = TaskViewModel.class.getSimpleName();

    public TaskViewModel (Application application) {
        super(application);
        mRepository = new TaskRepository(application);
        mAllTasks = mRepository.getAllTasks();
    }

    LiveData<List<Task>> getAllTasks() { return mAllTasks; }

    public void insert(Task task) {
        mRepository.insert(task);

        String format = "dd/MM/yyyy - HH:mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
        String dateTime = task.getDate() + " - " + task.getTime();
        Date date;
        try {
            date = dateFormat.parse(dateTime);
            Long diffTime = date.getTime() - System.currentTimeMillis();
            System.out.println("diffTime:" + diffTime);
            Data myData = new Data.Builder()
                    .putString("title", task.getTask())
                    .build();
            WorkRequest workRequest = new OneTimeWorkRequest.Builder(WorkerNotification.class)
                    .setInitialDelay(diffTime, TimeUnit.MILLISECONDS)
                    .setInputData(myData)
                    .build();
            workManager.enqueue(workRequest);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
