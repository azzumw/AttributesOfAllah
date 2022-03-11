package com.example.andriod.attributesofallah

import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher

object CustomMatchers {

    fun withToolbarName(expectedName: CharSequence): Matcher<View> {
        return object : BoundedMatcher<View, Toolbar>(Toolbar::class.java) {
            override fun describeTo(description: Description?) {

                description?.appendText("$expectedName")
            }

            override fun matchesSafely(item: Toolbar?): Boolean {
                return expectedName == item?.title.toString()
            }
        }
    }
}