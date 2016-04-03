package com.januarl.interactiveview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;

public class InteractiveButton extends android.widget.Button {
    public InteractiveButton(Context context) {
        super(context);
    }

    public InteractiveButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InteractiveButton(Context context, AttributeSet attrs, int defStyle) {
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
