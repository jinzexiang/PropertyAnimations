package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by zx.jin on 2017/8/17.
 */

public class FadeIn extends BaseAnimation {

    @Override
    protected void setupAnimation(View target) {
        getAnimatorSet().playTogether(ObjectAnimator.ofFloat(target,"alpha", 0, 0.5f, 1));
    }
}
