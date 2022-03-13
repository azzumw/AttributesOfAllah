package com.example.andriod.attributesofallah

import android.content.Context
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
open class BaseTestClass {
//    @get:Rule
//    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val rule = IntentsTestRule(MainActivity::class.java)

    lateinit var appContext : Context

    @Before
    fun useAppContext() {
        // Context of the app under test.
        //To access information about the current test,
        //we run the @InstrumentationRegistry Class
        //it holds a reference to the instrumentation object runing in the process
        //as well as to the target application context object, the test app context object
        //,and the command line args passed into your test.
        appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.andriod.attributesofallah", appContext.packageName)
    }
}