package com.ccy.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by chanchaoyue on 2017/12/1.
 */

public class BootBroadcastReceiver extends BroadcastReceiver {

    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(ACTION)) {
            Intent intent1 = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            context.startActivity(intent1);
        }
    }
}
