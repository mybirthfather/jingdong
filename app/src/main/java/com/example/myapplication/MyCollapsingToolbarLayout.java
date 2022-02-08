package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class MyCollapsingToolbarLayout extends CollapsingToolbarLayout {
    private static final String TAG = "222222";
    private int leftSpace = 0;
    private int rightSpace = 0;
    private float totalScrollRange;
    private AppBarLayout abl;

    public MyCollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    public MyCollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyCollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        leftSpace = Utils.dip2px(context, 44);
        rightSpace = Utils.dip2px(context, 88);
    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            abl = (AppBarLayout) parent;
            abl.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
                /**
                 * 这个是总偏移量
                 * @param appBarLayout
                 * @param verticalOffset
                 */
                @Override
                public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                    totalScrollRange = abl.getTotalScrollRange();

                    Log.e(TAG, "onOffsetChanged: " + "verticalOffset" + verticalOffset + "totalScrollRange=" + totalScrollRange);
                    float rate = (float)  verticalOffset / totalScrollRange;
//                    tvLeft.setTranslationX(-leftSpace * rate);
//                    tvRight.setTranslationX(rightSpace * rate);
//                    tvRight.setPadding(10,20,30,40);
                    if (rate > 1) {
                        rate = 1;
                    }
                    par.setPadding((int) (paddingDef - leftSpace * rate),
                            0,
                            (int) (paddingDef - rightSpace * rate),
                            0);

                }
            });
        }
    }

    private View tvLeft, tvRight, par;
    private int paddingDef;

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        par = findViewById(R.id.par);
        paddingDef = par.getPaddingLeft();
    }
}
