package com.lastreact.myapplication

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import android.net.wifi.p2p.WifiP2pDevice.FAILED
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
        private const val SUCCESS_KEY = "SUCCESS"
        private const val FAILED_KEY = "FAILED"
        private const val JOB_ID = 123
        private const val PERIODIC_TIME: Long = 15 * 60 * 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        schedule_job_btn.setOnClickListener { scheduleJob() }
        cancel_job_btn.setOnClickListener { cancelJob() }
    }

    private fun scheduleJob() {
        val componentName = ComponentName(this, ExampleJobService::class.java)
        val info = JobInfo.Builder(JOB_ID, componentName)
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
            .setRequiresDeviceIdle(false)
            .setRequiresCharging(true)
            .setPersisted(true)
            .setPeriodic(PERIODIC_TIME)
            .build()

        val jobScheduler: JobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
        val resultCode = jobScheduler.schedule(info)

        val isJobScheduledSuccess = resultCode == JobScheduler.RESULT_SUCCESS
        Log.d(TAG, "Job Scheduled ${if (isJobScheduledSuccess) SUCCESS_KEY else FAILED_KEY}")
    }

    private fun cancelJob() {
        val jobScheduler: JobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
        jobScheduler.cancel(JOB_ID)
        Log.d(TAG, "Job CANCELED")
    }
}
