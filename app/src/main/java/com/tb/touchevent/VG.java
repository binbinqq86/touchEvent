package com.tb.touchevent;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
/**
 * @Author:tb
 * @Email:624715451@qq.com
 * @DateAndTime:2018/9/1 22:23
 * @Description:模拟ViewGroup
 */
public class VG extends FrameLayout {
    private static final String TAG = "VG";
    public VG(Context context) {
        super(context);
    }

    public VG(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VG(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public VG(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        Log.e(TAG, "dispatchTouchEvent: ======"+Utils.getActionName(ev.getAction()) );
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "dispatchTouchEvent: ======ACTION_DOWN" );
//                return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "dispatchTouchEvent: ======ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "dispatchTouchEvent: ======ACTION_UP" );
//                return true;
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "dispatchTouchEvent: ======ACTION_CANCEL" );
                break;
            default:
                Log.e(TAG, "dispatchTouchEvent: ======default" );
                break;
        }
        return super.dispatchTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        Log.e(TAG, "onInterceptTouchEvent: ======"+Utils.getActionName(ev.getAction()) );
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onInterceptTouchEvent: ======ACTION_DOWN" );
//                return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onInterceptTouchEvent: ======ACTION_MOVE" );
//                return true;
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onInterceptTouchEvent: ======ACTION_UP" );
//                return true;
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "onInterceptTouchEvent: ======ACTION_CANCEL" );
                break;
            default:
                Log.e(TAG, "onInterceptTouchEvent: ======default" );
                break;
        }
        return super.onInterceptTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        Log.e(TAG, "onTouchEvent: ======"+Utils.getActionName(event.getAction()) );
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent: ======ACTION_DOWN" );
                return true;
//                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onTouchEvent: ======ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onTouchEvent: ======ACTION_UP" );
//                return true;
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "onTouchEvent: ======ACTION_CANCEL" );
                break;
            default:
                Log.e(TAG, "onTouchEvent: ======default" );
                break;
        }
        return super.onTouchEvent(event);
//        return false;
//        return true;
    }
}
