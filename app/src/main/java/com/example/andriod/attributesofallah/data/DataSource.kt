package com.example.andriod.attributesofallah.data

import android.content.Context
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.model.Attribute
import java.util.jar.Attributes

class DataSource {
    fun loadAttributes(context:Context):List<Attribute>{
        return listOf<Attribute>(
                Attribute(context.getString(R.string.eng_ar_rahman),context.getString(R.string.trans_ar_rahman),context.getString(R.string.ar_rahman)),
                Attribute(context.getString(R.string.eng_ar_raheem),context.getString(R.string.trans_ar_raheem),context.getString(R.string.ar_raheem)),
                Attribute(context.getString(R.string.eng_al_malik),context.getString(R.string.trans_al_malik),"الْمَلِكُُ"),
                Attribute(context.getString(R.string.eng_al_quddus),context.getString(R.string.trans_al_quddus),"الْقُدُّوسُ"),
                Attribute(context.getString(R.string.eng_as_salaam),context.getString(R.string.trans_as_salaam),"السَّلاَمُ"),
                Attribute(context.getString(R.string.eng_al_mumin),context.getString(R.string.trans_al_mumin),"الْمُؤْمِنُ"),
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
                Attribute(context.getString(R.string.eng_al_lateef),context.getString(R.string.trans_al_lateef),"اللَّطِيفُ"),
                Attribute(context.getString(R.string.eng_al_khabeer),context.getString(R.string.trans_al_khabeer),"الْخَبِيرُ"),
                Attribute(context.getString(R.string.eng_al_haleem),context.getString(R.string.trans_al_haleem),"الْحَلِيمُ"),
                Attribute(context.getString(R.string.eng_al_azeem),context.getString(R.string.trans_al_azeem),"الْعَظِيمُ"),
                Attribute(context.getString(R.string.eng_al_ghafoor),context.getString(R.string.trans_al_ghafoor),"الْغَفُور"),
                Attribute(context.getString(R.string.eng_al_shakoor),context.getString(R.string.trans_al_shakoor),context.getString(R.string.ash_shakoor)),
                Attribute(context.getString(R.string.eng_al_alee),context.getString(R.string.trans_al_alee),context.getString(R.string.al_alee)),
                Attribute(context.getString(R.string.eng_al_kabeer),context.getString(R.string.trans_al_kabeer),context.getString(R.string.al_kabeer)),
                Attribute(context.getString(R.string.eng_al_hafeedh),context.getString(R.string.trans_al_hafeedh),context.getString(R.string.al_hafeedh)),
                Attribute(context.getString(R.string.eng_al_muqeet),context.getString(R.string.trans_al_muqeet),context.getString(R.string.al_muqeet)),
                Attribute(context.getString(R.string.eng_al_haseeb),context.getString(R.string.trans_al_haseeb),context.getString(R.string.al_haseeb)),
                Attribute(context.getString(R.string.eng_al_jaleel),context.getString(R.string.trans_al_jaleel),context.getString(R.string.al_jaleel)),
                Attribute(context.getString(R.string.eng_al_kareem),context.getString(R.string.trans_al_kareem),context.getString(R.string.al_kareem)),
                Attribute(context.getString(R.string.eng_ar_raqeeb),context.getString(R.string.trans_ar_raqeeb),context.getString(R.string.ar_raqeeb)),
                Attribute(context.getString(R.string.eng_al_mujeeb),context.getString(R.string.trans_al_mujeeb),context.getString(R.string.al_mujeeb)),
                Attribute(context.getString(R.string.eng_al_waasi),context.getString(R.string.trans_al_waasi),context.getString(R.string.al_waasi)),
                Attribute(context.getString(R.string.eng_al_hakeem),context.getString(R.string.trans_al_hakeem),context.getString(R.string.al_hakeem)),
                Attribute(context.getString(R.string.eng_al_wadood),context.getString(R.string.trans_al_wadood),context.getString(R.string.al_wadood)),
                Attribute(context.getString(R.string.eng_al_majeed),context.getString(R.string.trans_al_majeed),context.getString(R.string.al_majeed)),
                Attribute(context.getString(R.string.eng_al_baaith),context.getString(R.string.trans_al_baaith),context.getString(R.string.al_baaith)),
                Attribute(context.getString(R.string.eng_as_shaheed),context.getString(R.string.trans_as_shaheed),context.getString(R.string.ash_shaheed)),
                Attribute(context.getString(R.string.eng_al_haqq),context.getString(R.string.trans_al_haqq),context.getString(R.string.al_haqq)),
                Attribute(context.getString(R.string.eng_al_wakeel),context.getString(R.string.trans_al_wakeel),context.getString(R.string.al_wakeel)),
                Attribute(context.getString(R.string.eng_al_qawiy),context.getString(R.string.trans_al_qawiy),context.getString(R.string.al_qawiy)),
                Attribute(context.getString(R.string.eng_al_mateen),context.getString(R.string.trans_al_mateen),context.getString(R.string.al_mateen)),
                Attribute(context.getString(R.string.eng_al_waliyy),context.getString(R.string.trans_al_waliyy),context.getString(R.string.al_waliyy)),
                Attribute(context.getString(R.string.eng_al_hameed),context.getString(R.string.trans_al_hameed),context.getString(R.string.al_hameed)),
                Attribute(context.getString(R.string.eng_al_muhsee),context.getString(R.string.trans_al_muhsee),context.getString(R.string.al_muhsee)),
                Attribute(context.getString(R.string.eng_al_mubdi),context.getString(R.string.trans_al_mubdi),context.getString(R.string.al_mubdi)),
                Attribute(context.getString(R.string.eng_al_mueed),context.getString(R.string.trans_al_mueed),context.getString(R.string.al_mueed)),

                Attribute(context.getString(R.string.eng_al_muhyi),context.getString(R.string.trans_al_muhyi),context.getString(R.string.al_muhyi)),
                Attribute(context.getString(R.string.eng_al_mumeet),context.getString(R.string.trans_al_mumeet),context.getString(R.string.al_mumeet)),

                Attribute(context.getString(R.string.eng_al_hayy),context.getString(R.string.trans_al_hayy),context.getString(R.string.al_hayy)),
                Attribute(context.getString(R.string.eng_al_qayyoom),context.getString(R.string.trans_al_qayyoom),context.getString(R.string.al_qayyoom)),
                Attribute(context.getString(R.string.eng_al_waajid),context.getString(R.string.trans_al_waajid),context.getString(R.string.al_waajid)),
                Attribute(context.getString(R.string.eng_al_maajid),context.getString(R.string.trans_al_maajid),context.getString(R.string.al_maajid)),
                Attribute(context.getString(R.string.eng_al_waahid),context.getString(R.string.trans_al_waahid), context.getString(R.string.al_waahid)),
                Attribute(context.getString(R.string.eng_al_ahad),context.getString(R.string.trans_al_ahad), context.getString(R.string.al_ahad)),
                Attribute(context.getString(R.string.eng_as_samad),context.getString(R.string.trans_as_samad), context.getString(R.string.as_samad)),
                Attribute(context.getString(R.string.eng_al_qaadir),context.getString(R.string.trans_al_qaadir), context.getString(R.string.al_qaadir)),
                Attribute(context.getString(R.string.eng_al_muqtadir),context.getString(R.string.trans_al_muqtadir), context.getString(R.string.al_muqtadir))
                )
    }
}