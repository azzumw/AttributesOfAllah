package com.example.andriod.attributesofallah.data

import android.content.Context
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.model.Attribute
import java.util.jar.Attributes

class DataSource {
    fun loadAttributes(context:Context):List<Attribute>{
        return listOf<Attribute>(
            Attribute(context.getString(R.string.eng_ar_rahman),context.getString(R.string.trans_ar_rahman),context.getString(R.string.ar_rahman)),
            Attribute(context.getString(R.string.eng_ar_raheem),context.getString(R.string.trans_ar_raheem),"الرَّحِيمُ"),
            Attribute(context.getString(R.string.eng_al_malik),context.getString(R.string.trans_al_malik),"الْمَلِكُُ"),
            Attribute(context.getString(R.string.eng_al_quddus),context.getString(R.string.trans_al_quddus),"الْقُدُّوسُ"),
            Attribute(context.getString(R.string.eng_as_salaam),context.getString(R.string.trans_as_salaam),"السَّلاَمُ"),
            Attribute(context.getString(R.string.eng_al_mumin),context.getString(R.string.al_mumin),"الْمُؤْمِنُ"),
            Attribute(context.getString(R.string.eng_al_muhaymin),context.getString(R.string.trans_muhaymin),"الْمُهَيْمِنُ"),
            Attribute(context.getString(R.string.eng_al_azeez),context.getString(R.string.trans_al_azeez),"الْعَزِيزُ"),
            Attribute(context.getString(R.string.eng_al_jabaar),context.getString(R.string.trans_al_jabaar),"الْجَبَّارُ"),
            Attribute(context.getString(R.string.eng_al_mutakabir),context.getString(R.string.trans_al_mutakabir),"الْمُتَكَبِّر"),
            Attribute(context.getString(R.string.eng_al_khaaliq),context.getString(R.string.trans_al_khaaliq),"الْخَالِقُ"),
            Attribute(context.getString(R.string.eng_al_baari),context.getString(R.string.trans_al_baari),"الْبَارِئُ"),
            Attribute(context.getString(R.string.eng_al_musawwir),context.getString(R.string.trans_al_musawwir),"الْمُصَوِّرُ"),
            Attribute(context.getString(R.string.eng_al_gaffaar),context.getString(R.string.trans_al_gaffaar),"الْغَفَّارُ"),
            Attribute(context.getString(R.string.eng_al_qahaar),context.getString(R.string.trans_al_qahaar),"الْقَهَّارُ"),
            Attribute(context.getString(R.string.eng_al_wahaab),context.getString(R.string.trans_al_wahaab),"الْوَهَّابُ"),
            Attribute(context.getString(R.string.eng_ar_raaziq),context.getString(R.string.trans_ar_raaziq),"الرَّزَّاقُ"),
            Attribute(context.getString(R.string.eng_al_fattah),context.getString(R.string.trans_al_fattah),"الْفَتَّاحُ"),
            Attribute(context.getString(R.string.eng_al_aleem),context.getString(R.string.trans_al_aleem),"اَلْعَلِيْمُ"),
            Attribute(context.getString(R.string.eng_al_qaabid),context.getString(R.string.trans_al_qaabid),"الْقَابِضُ"),
            Attribute(context.getString(R.string.eng_al_baasit),context.getString(R.string.trans_al_baasit),"الْبَاسِطُ"),
            Attribute(context.getString(R.string.eng_al_khaafidh),context.getString(R.string.trans_al_khaafidh),"الْخَافِضُ"),
            Attribute(context.getString(R.string.eng_ar_raafi),context.getString(R.string.trans_ar_raafi),"الرَّافِعُ"),
            Attribute(context.getString(R.string.eng_al_muizz),context.getString(R.string.trans_al_muizz),"الْمُعِزُّ"),
            Attribute(context.getString(R.string.eng_al_muzil),context.getString(R.string.trans_al_muzil),"ٱلْمُذِلُّ"),
            Attribute(context.getString(R.string.eng_as_samee),context.getString(R.string.trans_as_samee),"السَّمِيعُ"),
            Attribute(context.getString(R.string.eng_al_baseer),context.getString(R.string.trans_al_baseer),"الْبَصِيرُ"),
            Attribute(context.getString(R.string.eng_al_hakam),context.getString(R.string.trans_al_hakam),"الْحَكَمُ"),
            Attribute(context.getString(R.string.eng_aladl),context.getString(R.string.trans_al_adl),"الْعَدْلُ"),
            Attribute(context.getString(R.string.eng_al_lateef),context.getString(R.string.trans_al_lateef),"اللَّطِيفُ")
        )
    }
}