package com.example.testingforclass;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity>
        testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkNos()
    {
        onView(withId(R.id.etFirst))
                .perform(typeText("12"));
        onView(withId(R.id.etSecond))
                .perform(typeText("10"));
        onView(withId(R.id.btnSum))
                .perform(click());

        // This is another activity, no need to tell Espresso
        onView(withId(R.id.tvOutput))
                .check(matches(withText("Result is : 22.0")));
    }
}



