package com.januarl.interactiveview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;

public class InteractiveTextView extends android.widget.TextView {
    public InteractiveTextView(Context context) {
        super(context);
    }

    public InteractiveTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InteractiveTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setPressed(boolean pressed) {
        if (pressed) {
            if (getBackground() != null) {
                getBackground().setColorFilter(0x33888888, PorterDuff.Mode.SRC_ATOP);
            }
        } else {
            if (getBackground() != null) {
                getBackground().clearColorFilter();
            }
        }
        super.setPressed(pressed);
    }

}
