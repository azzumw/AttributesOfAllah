package com.example.andriod.attributesofallah

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

open class BaseTestClass {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        //To access information about the current test,
        //we run the @InstrumentationRegistry Class
        //it holds a reference to the instrumentation object runing in the process
        //as well as to the target application context object, the test app context object
        //,and the command line args passed into your test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.andriod.attributesofallah", appContext.packageName)
    }
}