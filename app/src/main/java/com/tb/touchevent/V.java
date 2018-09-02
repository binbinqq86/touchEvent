package com.tb.touchevent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @Author:tb
 * @Email:624715451@qq.com
 * @DateAndTime:2018/9/1 19:39
 * @Description:模拟View
 *
 * 执行顺序：onTouch--->onTouchEvent--->onClick
 * 注意：onClick直接消费掉了事件，不会再向上回传了
 */
@SuppressLint("AppCompatCustomView")
public class V extends TextView {
    private static final String TAG = "V";
    public V(Context context) {
        super(context);
        init();
    }

    public V(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public V(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public V(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
//        setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e(TAG, "onClick: ======" );
//            }
//        });
//        setOnTouchListener(new OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e(TAG, "onTouch: ======" );
//                return false;
//            }
//        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
//        Log.e(TAG, "dispatchTouchEvent: ======"+Utils.getActionName(event.getAction()) );
        switch (event.getAction()){
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
        return super.dispatchTouchEvent(event);
//        return false;
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        Log.e(TAG, "onTouchEvent: ======"+Utils.getActionName(event.getAction()) );
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent: ======ACTION_DOWN" );
//                return true;
                break;
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
