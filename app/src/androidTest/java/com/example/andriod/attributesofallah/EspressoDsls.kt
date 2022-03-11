package com.example.andriod.attributesofallah

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId


//Inline functions


fun viewWithId(id: Int): ViewInteraction = Espresso.onView(withId(id))

//View actions
fun ViewInteraction.click(): ViewInteraction = perform(ViewActions.click())

fun ViewInteraction.type(text: String): ViewInteraction = perform(ViewActions.typeText(text))

fun ViewInteraction.closeKeyboard(): ViewInteraction = perform(ViewActions.closeSoftKeyboard())