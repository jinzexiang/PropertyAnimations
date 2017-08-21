package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

public class SideFall extends BaseAnimation{

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "scaleX", 2, 1.5f, 1),
                ObjectAnimator.ofFloat(view,"scaleY",2,1.5f,1),
                ObjectAnimator.ofFloat(view, "translationX",80,0),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1)

        );
    }
}
