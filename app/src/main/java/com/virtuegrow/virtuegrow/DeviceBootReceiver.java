package com.virtuegrow.virtuegrow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Objects;


public class DeviceBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.requireNonNull(intent.getAction()).equals("android.intent.action.BOOT_COMPLETED")) {
            MainActivity.startAlarming(context);
            Log.d("vg", "Set alarm from BootReceiver.");
        }
    }
}
