package io.defy.www.coupleadmin.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import io.defy.www.coupleadmin.service.NeverdieService;
import io.defy.www.coupleadmin.service.RestartService;

public class AlarmRecever extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Intent in = new Intent(context, RestartService.class);
            context.startForegroundService(in);
        } else {
            Intent in = new Intent(context, NeverdieService.class);
            context.startService(in);
        }
    }

}