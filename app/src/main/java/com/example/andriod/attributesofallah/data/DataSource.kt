package com.example.andriod.attributesofallah.data

import android.content.Context
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.model.Attribute
import java.util.jar.Attributes

class DataSource {
    fun loadAttributes():List<Attribute>{
        return listOf<Attribute>(
            Attribute("The Compassionate","Ar-Rahman","الرَّحْمَنُ"),
            Attribute("The Merciful","Ar-Raheem","الرَّحِيمُ"),
            Attribute("The King","Al-Malik","الْمَلِكُُ"),
            Attribute("The Holy","Al-Quddus","الْقُدُّوسُ"),
            Attribute("Source of Peace","As-Salaam","السَّلاَمُ"),
            Attribute("The Gaurantor","Al-Mu'min","الْمُؤْمِنُ"),
            Attribute("The Guardian","Al-Muhaymin","الْمُهَيْمِنُ"),
            Attribute("The Mighty","Al-Azeez","الْعَزِيزُ"),
            Attribute("The Compeller","Al-Jabaar","الْجَبَّارُ"),
            Attribute("the Supreme","Al-Mutaqabir","الْمُتَكَبِّر"),
            Attribute("The Creator","Al-Khaaliq","الْخَالِقُ"),
            Attribute("The Evolver","Al-Baari","الْبَارِئُ"),
            Attribute("The Fashioner","Al-Musawwir","الْمُصَوِّرُ"),
            Attribute("The Forgiver","Al-Gaffaar","الْغَفَّارُ"),
            Attribute("The Subduer","Al-Qahaar","الْقَهَّارُ"),
            Attribute("The Bestower","Al-Wahaab","الْوَهَّابُ"),
            Attribute("The Provider","Ar-Razzaaq","الرَّزَّاقُ"),
            Attribute("The Giver of Victory","Al-Fattah","الْفَتَّاحُ"),
            Attribute("The Knower","Al-'Aleem'","اَلْعَلِيْمُ"),
            Attribute("The Restrainer","Al-Qaabid","الْقَابِضُ"),
            Attribute("The Expander","Al-Baasit","الْبَاسِطُ"),
            Attribute("The Reducer","Al-Khaafidh","الْخَافِضُ"),
            Attribute("The Exalted","Ar-Raafi'","الرَّافِعُ"),
            Attribute("The Honourer","Al-Mu'izz","الْمُعِزُّ"),
            Attribute("The Dishonourer","Al-Muzil","ٱلْمُذِلُّ"),
            Attribute("The All-Hearing","As-Samee'","السَّمِيعُ"),
            Attribute("The All-Seeing","Al-Baseer","الْبَصِيرُ")
        )
    }
}