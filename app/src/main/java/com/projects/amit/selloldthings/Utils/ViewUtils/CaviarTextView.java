package com.projects.amit.selloldthings.Utils.ViewUtils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Amit on 7/23/2018.
 */

public class CaviarTextView extends android.support.v7.widget.AppCompatTextView {
    public CaviarTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CaviarTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CaviarTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "CaviarDreams.ttf");
        setTypeface(tf, 1);

    }

}
