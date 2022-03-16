package com.example.andriod.attributesofallah

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.view.View
import android.widget.ImageView
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

    //write  a drawable matcher
    fun withDrawableImage(expectedDrawable: Drawable?):Matcher<View>{
        return object:BoundedMatcher<View,ImageView>(ImageView::class.java){
            override fun describeTo(description: Description?) {
                description?.appendText("Drawable in image view $expectedDrawable")
            }

            override fun matchesSafely(item: ImageView?): Boolean {
                return isSameBitMap(item?.drawable,expectedDrawable)
            }
        }
    }

    private fun isSameBitMap(actualDrawable:Drawable?,expectedDrawable: Drawable?):Boolean{
        var localDrawable = actualDrawable
        var localExpectedDrawable = expectedDrawable

        if(localDrawable==null || localExpectedDrawable == null) return false

        if(localDrawable is StateListDrawable && localExpectedDrawable is StateListDrawable){
            localDrawable = localDrawable.current
            localExpectedDrawable = localExpectedDrawable.current
        }

        if(localDrawable is BitmapDrawable){
            val bitmap = localDrawable.bitmap
            val otherBitmap = (localExpectedDrawable as BitmapDrawable).bitmap

            return bitmap.sameAs(otherBitmap)
        }
        return false
    }
}