package com.example.andriod.attributesofallah

import android.graphics.drawable.Drawable
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class DrawableTests {

    @Test
    fun check_ar_rahman_drawable_image() {

        ActivityScenario.launch(MainActivity::class.java)

        onView(withText("Ar-Rahman")).perform(click())

        onView(withId(R.id.attr_image)).check(matches(CustomMatchers.withDrawableImage(getDrawable(R.drawable.ar_rahman))))

    }

    private fun getDrawable(id: Int): Drawable {
        val context = InstrumentationRegistry.getInstrumentation().targetContext

        return context.resources.getDrawable(id)
    }
}