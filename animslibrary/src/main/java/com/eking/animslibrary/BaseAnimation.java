package com.eking.animslibrary;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Interpolator;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ValueAnimator;

/**
 * Created by zx.jin on 2017/8/16.
 */

public abstract class BaseAnimation {

    private AnimatorSet animatorSet;

    private int mRepeatCount = 0;   //重复次数
    //设置重复模式
    private int mRepeatMode = ValueAnimator.RESTART;   //重新开始
    // private int mRepeatMode = ValueAnimator.REVERSE;   //逆向重复

    protected long DURATION = 1000;


    {
        animatorSet = new AnimatorSet();
    }

    protected abstract void setupAnimation(View target);
    
    
    public BaseAnimation setTarget(View view){
        reset(view);
        setupAnimation(view);
        return this;
        
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


    public AnimatorSet getAnimatorSet(){
        return animatorSet;
    }

    public BaseAnimation setDuration(long duration){

       animatorSet.setDuration(duration);
        return this;

    }

   public BaseAnimation setRepeatMode(int repeatMode){

       this.mRepeatMode = repeatMode;

       return this;
   }



    /**
     * 开启动画
     */
    public void start(){
         for (Animator animator : animatorSet.getChildAnimations()){
              if (animator instanceof ValueAnimator){
                    ((ValueAnimator) animator).setRepeatCount(mRepeatCount);
                    ((ValueAnimator) animator).setRepeatMode(mRepeatMode);

            }
            animatorSet.start();
         }
    }


    /**
     * 设置插值器
     * @param interploator
     * @return
     */
    public BaseAnimation setInterploator(Interpolator interploator){

        animatorSet.setInterpolator(interploator);

        return this;
    }


    /**
     * 设置动画播放次数
     * @param repeatCounts
     * @return
     */
    public BaseAnimation setRepeatCounts(int repeatCounts){
        this.mRepeatCount = repeatCounts;
        return this;
    }

    /**
     * 设置动画开启延时
     * @param delay
     * @return
     */
    public BaseAnimation setStartDelay(long delay){
        animatorSet.setStartDelay(delay);
        return this;
    }

    /**
     * 添加监听
     * @param animatorListener
     * @return
     */
   public BaseAnimation addAnimationListener(Animator.AnimatorListener animatorListener){

       animatorSet.addListener(animatorListener);
       return this;
   }


}
