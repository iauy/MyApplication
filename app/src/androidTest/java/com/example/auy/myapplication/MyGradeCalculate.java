package com.example.auy.myapplication;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.auy.myapplication.MainActivity;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class MyGradeCalculate {

    @Test
    public void testShowGradeDWhenScoreIs50() {
//        onView(withId(R.id.inputNumber)).perform(typeText(String.valueOf(50)));
       // onView(withId(R.id.button_cal_grade)).perform(click());
      //  onView(withId(R.id.editTextGrade)).check(matches(withText("Your grade = D")));
    }
}











































