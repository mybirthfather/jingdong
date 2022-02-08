package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingParent3;

public class MyLinearLayout extends LinearLayout {
    private static final String TAG = "MyLinearLayout";

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = MeasureSpec.getSize(heightMeasureSpec);
        int mode = MeasureSpec.getMode(heightMeasureSpec);
        ViewParent parent = getParent();
        Log.e(TAG, "onMeasure: parent="+parent );
        Log.e(TAG, "heightMode=" + Integer.toBinaryString(mode) + "heightsize=" + size+"mode="+mode+"measureedHeight="+getMeasuredHeight());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

//        ContentFrameLayout
//        1000 0000 0000 0000 0000 0000 0000 0000
//         setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),MeasureSpec.getSize(heightMeasureSpec));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "onDraw: " );
    }

    @Override
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Log.e(TAG, "drawChild: " );
        return super.drawChild(canvas, child, drawingTime);
    }
}
