package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycleView extends RecyclerView {
    private static final String TAG = "MyRecycleView";

    public MyRecycleView(@NonNull Context context) {
        super(context);
    }

    public MyRecycleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecycleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.e(TAG, "onLayout: ");
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        Log.e(TAG, "onMeasure height="+getHeight()+"getbottom="+getBottom()+"top="+getTop());

    }
// dy=0top=326height=1615getbottom=1941
    @Override
    public void onScrolled(int dx, int dy) {
        super.onScrolled(dx, dy);
        Log.e(TAG, "onScrolled: " + "dy=" + dy+"top="+getTop()+"height="+getHeight()+"getbottom="+getBottom());
    }
}
