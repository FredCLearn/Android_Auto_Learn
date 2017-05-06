package com.example.fred.myapplication;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class testTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testTest() throws InterruptedException {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.actionButton), withText("Click to see who is the Best!"),
                        withParent(allOf(withId(R.id.relativeLayout),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton.perform(click());

        Thread.sleep(1500);

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.actionButton), withText("Click to see who is the Best!"),
                        withParent(allOf(withId(R.id.relativeLayout),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton2.perform(click());

        Thread.sleep(1500);

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.actionButton), withText("Click to see who is the Best!"),
                        withParent(allOf(withId(R.id.relativeLayout),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton3.perform(click());

        Thread.sleep(1500);

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.actionButton), withText("Click to see who is the Best!"),
                        withParent(allOf(withId(R.id.relativeLayout),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton4.perform(click());

        Thread.sleep(1500);


        appCompatButton4.perform(click());

    }

}
