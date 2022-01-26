package com.example.andriod.attributesofallah

import android.view.KeyEvent
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice

object Helpers {

    fun shareTheNametWith(name:String,device: UiDevice){
        device.findObject(By.text(name)).click()
        device.pressKeyCode(KeyEvent.KEYCODE_ENTER)
        device.pressEnter()
        device.findObject(By.desc("Send")).click()
    }
}