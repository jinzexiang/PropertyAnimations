package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

public class SlideTop extends BaseAnimation{

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", -300, 0).setDuration(DURATION),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(DURATION*3/2)

        );
    }
}
