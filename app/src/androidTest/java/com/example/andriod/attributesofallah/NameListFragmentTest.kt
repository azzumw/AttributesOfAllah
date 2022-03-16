package com.example.andriod.attributesofallah

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.Until
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NameListFragmentTest {

    private val recyclerView = viewWithId(R.id.recycler_view)

    @Test
    fun test_home_fragment() {
        launchFragmentInContainer<NameListFragment>(themeResId = R.style.Theme_MaterialComponents_DayNight_DarkActionBar)

        recyclerView.perform(swipeUp())
        onView(withText("Al_Qaabid"))

//        recyclerView.perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(27)).perform(ViewActions.longClick())
    }
}