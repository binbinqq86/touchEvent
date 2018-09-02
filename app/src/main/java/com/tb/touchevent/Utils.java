package com.tb.touchevent;

import android.view.MotionEvent;

public class Utils {
    public static String getActionName(int action) {
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                return "ACTION_DOWN";
            case MotionEvent.ACTION_MOVE:
                return "ACTION_MOVE";
            case MotionEvent.ACTION_CANCEL:
                return "ACTION_CANCEL";
            case MotionEvent.ACTION_UP:
                return "ACTION_UP";
            default:
                return "default";
        }
    }
}
