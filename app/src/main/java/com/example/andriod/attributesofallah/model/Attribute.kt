package com.example.andriod.attributesofallah.model

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.StringRes

data class Attribute(@StringRes val english:Int, @StringRes val transliteration:Int, @StringRes  val arabic:Int) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(english)
        parcel.writeInt(transliteration)
        parcel.writeInt(arabic)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Attribute> {
        override fun createFromParcel(parcel: Parcel): Attribute {
            return Attribute(parcel)
        }

        override fun newArray(size: Int): Array<Attribute?> {
            return arrayOfNulls(size)
        }
    }

}