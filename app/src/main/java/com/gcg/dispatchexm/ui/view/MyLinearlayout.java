package com.gcg.dispatchexm.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by imSunLight on 2016/10/21.
 */
public class MyLinearlayout extends LinearLayout {


    public MyLinearlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //屏幕的三分之一宽度
        int width=getWidth()/3;
        int height=getHeight();
        int count=getChildCount();


        if(event.getX()<width){
            this.getChildAt(0).dispatchTouchEvent(event);
            return  true;
        }else if(event.getX()<2*width){
            //判断手指滑动的高度
            if(event.getY()<height/2){
                //将事件分发给3个子view
                for(int i=0;i<count;i++){
                    this.getChildAt(i).dispatchTouchEvent(event);
                }
                return  true;
            }else {
                this.getChildAt(1).dispatchTouchEvent(event);
                return  true;
            }
        }else {
            this.getChildAt(2).dispatchTouchEvent(event);
            return true;
        }


    }
}
