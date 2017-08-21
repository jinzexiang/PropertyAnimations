package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by zx.jin on 2017/8/21.
 */

public class Shake extends BaseAnimation{


    @Override
    protected void setupAnimation(View target) {

        getAnimatorSet().playTogether(ObjectAnimator.ofFloat(target,"translationX",0,70f,-70f,50f,-50f,30f,-30f,10,-10f,0));

    }
}
