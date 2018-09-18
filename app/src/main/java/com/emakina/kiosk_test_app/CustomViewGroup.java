package com.emakina.kiosk_test_app;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class CustomViewGroup extends ViewGroup {
    public CustomViewGroup(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // Intercepted touch!
        return true;
    }

}

