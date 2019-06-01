package com.example.testingforclass;
import androidx.test.espresso.Espresso;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withInputType;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


public class SimpleActivityTest {

    @Rule
    public ActivityTestRule<SimpleActivity> testRule =
            new ActivityTestRule<>(SimpleActivity.class);

    private String mText = "Hello";

    @Test
    public void TestUI() throws Exception
    {
        // input some text in EditText
        onView(withId(R.id.etText))
                .perform(typeText(mText));

        // close soft keyboard
        closeSoftKeyboard();

        // perform button click
        onView(withId(R.id.btnClick))
                .perform(click());

        // checking the text in the TextView
        onView(withId(R.id.tvDisplay))
                .check(matches(withText(mText)));

//        onView(withId(R.id.tvDisplay))
//                .check(matches(isDisplayed()));
    }
}

