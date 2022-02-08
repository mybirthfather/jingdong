package com.example.myapplication;

import android.content.Context;

public class Utils {
    public static String getMotionEvent(int motionevent) {
        String result;
        switch (motionevent) {
            case 0:
                result = "DOWN";
                break;
            case 1:
                result = "UP";
                break;
            case 2:
                result = "MOVE";
                break;
            case 3:
                result="ACTION_CANCEL";
                break;
            default:
                result="未知的";
        }
        return result;
    }
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


}
