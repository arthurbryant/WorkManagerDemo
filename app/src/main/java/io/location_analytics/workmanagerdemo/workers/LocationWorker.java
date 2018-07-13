package io.location_analytics.workmanagerdemo.workers;

import android.support.annotation.NonNull;
import android.util.Log;

import java.lang.annotation.Target;

import androidx.work.Worker;

public class LocationWorker extends Worker {
    public static final String TAG = "LocationWorker";

    @NonNull
    @Override
    public Result doWork() {
        // Todo: try to get location: getLocation()
        Log.d(TAG, TAG + " will run once every 15 minutes");

        return Result.SUCCESS;
    }
}
