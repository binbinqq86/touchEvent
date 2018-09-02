package com.tb.touchevent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
/**
 * @Author:tb
 * @Email:624715451@qq.com
 * @DateAndTime:2018/9/1 19:59
 * @Description:触摸事件分发机制研究
 */
class MainActivity : AppCompatActivity() {
    val TAG:String=MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
//        Log.e(TAG,"=====dispatchTouchEvent====="+Utils.getActionName(ev?.action?:-1))
        when(ev?.action){
            MotionEvent.ACTION_DOWN->{
                Log.e(TAG,"=====dispatchTouchEvent=====ACTION_DOWN")
//                return true
            }
            MotionEvent.ACTION_MOVE->{
                Log.e(TAG,"=====dispatchTouchEvent=====ACTION_MOVE")
            }
            MotionEvent.ACTION_UP->{
                Log.e(TAG,"=====dispatchTouchEvent=====ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL->{
                Log.e(TAG,"=====dispatchTouchEvent=====ACTION_CANCEL")
            }
            else->{
                Log.e(TAG,"=====dispatchTouchEvent=====default")
            }
        }
        return super.dispatchTouchEvent(ev)
//        return false
//        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        Log.e(TAG,"=====onTouchEvent====="+Utils.getActionName(event?.action?:-1))
        when(event?.action){
            MotionEvent.ACTION_DOWN->{
                Log.e(TAG,"=====onTouchEvent=====ACTION_DOWN")
//                return true
            }
            MotionEvent.ACTION_MOVE->{
                Log.e(TAG,"=====onTouchEvent=====ACTION_MOVE")
            }
            MotionEvent.ACTION_UP->{
                Log.e(TAG,"=====onTouchEvent=====ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL->{
                Log.e(TAG,"=====onTouchEvent=====ACTION_CANCEL")
            }
            else->{
                Log.e(TAG,"=====onTouchEvent=====default")
            }
        }
        return super.onTouchEvent(event)
//        return true
//        return false
    }
}
