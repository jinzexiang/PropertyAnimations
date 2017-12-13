package com.eking.animslibrary;

import android.view.animation.RotateAnimation;

import com.eking.animslibrary.effects.FadeIn;
import com.eking.animslibrary.effects.FlipH;
import com.eking.animslibrary.effects.FlipV;
import com.eking.animslibrary.effects.RotationIn;
import com.eking.animslibrary.effects.Shake;
import com.eking.animslibrary.effects.SideFall;
import com.eking.animslibrary.effects.SlideBottom;
import com.eking.animslibrary.effects.SlideLeft;
import com.eking.animslibrary.effects.SlideTop;
import com.eking.animslibrary.effects.Tada;

/**
 * Created by zx.jin on 2017/8/17.
 */

public enum EffectsType {

    FadeInAnim(FadeIn.class),
    FlipHAnim(FlipH.class),
    FlipvAnim(FlipV.class),
    ShakeAnim(Shake.class),
    SideFallAnim(SideFall.class),
    SlideButtomAnim(SlideBottom.class),
    SlideTopAnim(SlideTop.class),
    SlideLeftAnim(SlideLeft.class),
    TadaAnim(Tada.class),
    RotateAnim(RotationIn.class);


    private Class< ? extends BaseAnimation > animationClazz;



    private EffectsType(Class<? extends BaseAnimation> animationClazz) {
        this.animationClazz = animationClazz;
    }

    public BaseAnimation getAnimation() {

      BaseAnimation baseAnimation = null;

        try {
           baseAnimation = animationClazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

       return baseAnimation;
    }
}
