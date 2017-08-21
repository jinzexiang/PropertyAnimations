package com.eking.animslibrary;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;

import com.nineoldandroids.animation.Animator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zx.jin on 2017/8/17.
 */

public class AnimationUtil {

    public  BaseAnimation mAnimation;

    private List<Animator.AnimatorListener> callbacks = new ArrayList<>();

    private long duration = 1000;
    private int mRepeatMode = ValueAnimator.RESTART;
    private long delay = 0;
    private int mRepeatCount = 0;


    public AnimationUtil (EffectsType effectsType){
        mAnimation = effectsType.getAnimation();

    }

    public  AnimationUtil(BaseAnimation baseAnimation){

        mAnimation = baseAnimation;
    }

    public AnimationUtil onStart(final AnimatorCallBack animatorCallBack){
        callbacks.add(new AnimListener() {

            @Override
            public void onAnimationStart(Animator animation) {
                animatorCallBack.callBack(animation);
            }
        });

        return this;
    }

    public AnimationUtil onEnd(final AnimatorCallBack animatorCallBack) {
              callbacks.add(new AnimListener() {
            @Override
            public void onAnimationEnd(Animator animation) {
                animatorCallBack.callBack(animation);
            }
        });
        return this;
    }


    /**
     * 设置动画监听
     * @param animatorListener
     * @return
     */
    public AnimationUtil withListener(Animator.AnimatorListener animatorListener){
        callbacks.add(animatorListener);
        return this;
    }



    public BaseAnimation play(View target){

        mAnimation.setTarget(target);

        mAnimation.setStartDelay(delay);
        mAnimation.setRepeatCounts(mRepeatCount);
        mAnimation.setRepeatMode(mRepeatMode);

        if (callbacks.size() > 0) {
            for (Animator.AnimatorListener callback : callbacks) {
                mAnimation.addAnimationListener(callback);
            }
        }
        mAnimation.start();

       return mAnimation;
    }



    public AnimationUtil setInterpolator(Interpolator interpolator){

           mAnimation.setInterploator(interpolator);
        return this;
    }

    public AnimationUtil setDuration(long duration){

        mAnimation.setDuration(duration);

        return this;
    }

    public AnimationUtil setRepeatMode(int mode){
        this.mRepeatMode = mode;
        return this;
    }


    /**
     * 设置播放次数
     * @param count
     * @return
     */
    public AnimationUtil setRepeatCount(int count){

        this.mRepeatCount = count;

        return this;
    }


    public AnimationUtil setStartDelay(long delayTime){

        this.delay = delayTime;

        return this;
    }


     public interface AnimatorCallBack{

         void callBack(Animator animation);

    }




}
