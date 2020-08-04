package com.dalong.elmbusiness;

import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;

import android.annotation.SuppressLint;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.dalong.elmbusiness.ui.NewTabActivity;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;

@RunWith(AndroidJUnit4.class)
public class AndroidAcceptanceTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(NewTabActivity.class);

    @Test
    public void GoodsFragmentTest() {
        Espresso.onView(withId(R.id.noShop)).check(matches(withText("购物车为空")));
    }
}
