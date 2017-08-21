package com.eking.propertyanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.eking.animslibrary.Effect;
import com.eking.animslibrary.EffectsType;

/**
 * Created by zx.jin on 2017/8/18.
 */

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        final View bt_anim = (View) findViewById(R.id.bt_anim);
        bt_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Effect.with(EffectsType.TadaAnim)
                        .play(bt_anim);

            }
        });


    }
}
