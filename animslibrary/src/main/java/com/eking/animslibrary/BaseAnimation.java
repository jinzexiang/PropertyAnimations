package com.eking.animslibrary;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.v4.view.ViewCompat;
import android.view.View;

/**
 * Created by zx.jin on 2017/8/16.
 */

public abstract class BaseAnimation {

    private AnimatorSet animatorSet;

    private int mRepeatMode = ValueAnimator.RESTART;

    {
        animatorSet = new AnimatorSet();
    }

    protected abstract void prepare(View target);
    
    
    public void setTarget(View view){
        reset(view);
        prepare(view);
        
    }


    /**
     * 初始化View
     * @param view
     */
    private void reset(View view) {
        ViewCompat.setAlpha(view,1);
        ViewCompat.setScaleX(view,1);
        ViewCompat.setScaleY(view,1);
        ViewCompat.setRotation(view,0);
        ViewCompat.setRotationX(view,0);
        ViewCompat.setRotationY(view,0);
        ViewCompat.setTranslationX(view,0);
        ViewCompat.setTranslationY(view,0);
    }


}
