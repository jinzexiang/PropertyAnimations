package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by zx.jin on 2017/8/21.
 */

public class FlipV extends BaseAnimation{


    @Override
    protected void setupAnimation(View target) {

        getAnimatorSet().playTogether(ObjectAnimator.ofFloat(target, "rotationX", -90,0).setDuration(DURATION));

    }
}
