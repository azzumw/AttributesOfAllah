package com.example.andriod.attributesofallah

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.allOf

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

//We annotate each test class with AndroidJunit4::class otherwise the default Junit runner will take over the running process, and tests will fail.
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest() : BaseTestClass() {


    @Test
    fun checkFirstAttribute() {
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_ar_rahman), isDisplayed()))
        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_ar_rahman), isDisplayed()))
//        onView(withText(R.string.eng_ar_rahman)).check(matches(isDisplayed()))
    }

    @Test
    fun checkArRaheem() {
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_ar_raheem), isDisplayed()))
    }

    @Test fun checkAlMalik(){
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_al_malik), isDisplayed()))
    }

    @Test fun checkAlQuddus(){
        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_al_quddus), isDisplayed()))
    }

    @Test fun checkSalaam(){
        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_as_salaam), isDisplayed()))
    }

    @Test fun checkRahmanArabic(){
        onView(allOf(withId(R.id.arabictextView), withText(R.string.ar_rahman), isDisplayed()))
    }
}