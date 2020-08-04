package com.dalong.elmbusiness;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.view.animation.Animation;

import com.dalong.elmbusiness.entity.GoodsListBean;
import com.dalong.elmbusiness.ui.NewTabActivity;
import com.dalong.elmbusiness.ui.fragment.EvaluateFragment;
import com.dalong.elmbusiness.utils.AnimationUtil;
import com.dalong.elmbusiness.utils.DataUtils;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AndroidUnitTest {

    @Test
    public void TestEvaluateFragment() {
        //test EvaluateFragment creat
        EvaluateFragment evaluateFragment = new EvaluateFragment();
        assertEquals("com.dalong.elmbusiness.ui.fragment.EvaluateFragment", EvaluateFragment.getInstance("test").getClass().getName());
    }

    @Test
    public void TestAnimationUtils() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        Animation animation = AnimationUtil.createInAnimation(appContext, 40);
        assertEquals(400, animation.getDuration());
    }
}
