package com.eking.animslibrary.effects;

import android.view.View;

import com.eking.animslibrary.BaseAnimation;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by zx.jin on 2017/8/22.
 */

public class RotationIn extends BaseAnimation {


    @Override
    protected void setupAnimation(View target) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(target,"rotation",1080,720,360,0).setDuration(DURATION),
                ObjectAnimator.ofFloat(target,"scaleX",0.1f,0.5f,1).setDuration(DURATION),
                ObjectAnimator.ofFloat(target,"scaleY",0.1f,0.5f,1).setDuration(DURATION),
                ObjectAnimator.ofFloat(target,"alpha",0,0.5f,1f).setDuration(DURATION*3/2)
        );
    }}
