package com.eking.animslibrary;

import android.view.View;

/**
 * Created by zx.jin on 2017/8/18.
 */

public class Effect {


   public static  AnimationUtil with(EffectsType effectsType){
        return new AnimationUtil(effectsType);
    }

    public static AnimationUtil with(BaseAnimation baseAnimation){
        return new AnimationUtil(baseAnimation);
    }

}
