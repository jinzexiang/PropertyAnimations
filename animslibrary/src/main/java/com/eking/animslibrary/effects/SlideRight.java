package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

public class SlideRight extends BaseAnimation{

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationX",300,0).setDuration(DURATION),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(DURATION*3/2));
    }
}
