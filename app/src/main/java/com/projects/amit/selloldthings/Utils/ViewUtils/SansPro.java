package com.projects.amit.selloldthings.Utils.ViewUtils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Amit on 7/23/2018.
 */

public class SansPro extends android.support.v7.widget.AppCompatTextView {
    public SansPro(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public SansPro(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SansPro(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "SansPro.otf");
        setTypeface(tf, 1);

    }

}
