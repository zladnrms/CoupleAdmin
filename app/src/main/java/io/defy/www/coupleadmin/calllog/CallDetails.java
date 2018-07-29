package io.defy.www.coupleadmin.calllog;

import android.content.Context;
import android.database.Cursor;
import android.provider.CallLog;

import java.util.Date;

public class CallDetails {
    public static Cursor getCallLog(Context context) {
        return context.getContentResolver().query(
                CallLog.Calls.CONTENT_URI, null, null, null,
                CallLog.Calls.DEFAULT_SORT_ORDER);
    }
}
