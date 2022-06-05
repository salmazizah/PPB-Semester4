package com.example.notificationscheduler;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationJobService extends JobService {
    NotificationManager mNotifyManager;
    private ExecutorService executorService;
    // Notification channel ID.
    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";

    /**
     * Creates a Notification channel, for OREO and higher.
     */
    public void createNotificationChannel() {

        // Define notification manager object.
        mNotifyManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // Notification channels are only available in OREO and higher.
        // So, add a check on SDK version.
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

            // Create the NotificationChannel with all the parameters.
            NotificationChannel notificationChannel = new NotificationChannel (PRIMARY_CHANNEL_ID,
                    "Job Service notification", NotificationManager.IMPORTANCE_HIGH);

            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Notifications from Job Service");

            mNotifyManager.createNotificationChannel(notificationChannel);
        }
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Handler handler = new Handler(Looper.getMainLooper());
        executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            boolean jobFinished = true;
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                Log.d("Thread", "Thread destroyed");
                jobFinished = false;
            }
            boolean finalJobFinished = jobFinished;
            handler.post(() -> {
                if (finalJobFinished) {
                    createNotificationChannel();

                    PendingIntent contentPendingIntent = PendingIntent.getActivity(
                            getApplicationContext(),
                            0,
                            new Intent(this, MainActivity.class),
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );

                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, PRIMARY_CHANNEL_ID)
                            .setContentTitle("Job Service")
                            .setContentText("Your Job is running")
                            .setContentIntent(contentPendingIntent)
                            .setSmallIcon(R.drawable.ic_job_running)
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .setDefaults(NotificationCompat.DEFAULT_ALL)
                            .setAutoCancel(true);
                    mNotifyManager.notify(0, builder.build());
                    Toast.makeText(getApplicationContext(), "Job Complete", Toast.LENGTH_SHORT)
                            .show();
                }
                jobFinished(jobParameters, !finalJobFinished);
            });
        });
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        if (executorService != null) {
            executorService.shutdownNow();
        }
        Toast.makeText(getApplicationContext(), "Job Failed", Toast.LENGTH_SHORT).show();
        return true;
    }
}
