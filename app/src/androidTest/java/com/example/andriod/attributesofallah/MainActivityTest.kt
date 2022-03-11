package com.example.andriod.attributesofallah

import android.content.Intent
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.BundleMatchers.hasEntry
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest : BaseTestClass() {

    @Test
    @Ignore
    fun Test_ToolbarName() {

        val title = appContext.getString(R.string.app_name)

        onView(isAssignableFrom(Toolbar::class.java))
            .check(matches(CustomMatchers.withToolbarName(title)))
    }

    @Test
    fun Ar_Rahman_intended() {
        viewWithId(R.id.recycler_view).perform(
            RecyclerViewActions.actionOnItem<RecyclerView.ViewHolder>(
                hasDescendant(
                    withText(R.string.eng_ar_rahman)
                ), longClick()
            )
        )

        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val arabic = context.getString(R.string.ar_rahman)
        val eng = context.getString(R.string.eng_ar_rahman)
        val trans = context.getString(R.string.trans_ar_rahman)

        Intents.intended(hasExtras(hasEntry(Intent.EXTRA_TITLE, "NO")))
        Intents.intended(hasAction(equalTo(Intent.ACTION_SEND_MULTIPLE)))
        Intents.intended(hasType("text/plain"))

    }
}