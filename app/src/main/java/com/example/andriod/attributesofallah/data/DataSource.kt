package com.example.andriod.attributesofallah.data

import android.content.Context
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.model.Attribute


class DataSource {

        fun loadAttributes():List<Attribute>{
        return listOf(
                Attribute(english = R.string.eng_ar_rahman, transliteration = R.string.trans_ar_rahman, arabic = R.string.ar_rahman),
                Attribute(english = R.string.eng_ar_raheem, transliteration = R.string.trans_ar_raheem , arabic = R.string.ar_raheem),
                Attribute(english = R.string.eng_al_malik, transliteration = R.string.trans_al_malik, arabic = R.string.al_malik),
                Attribute(english = R.string.eng_al_quddus, transliteration = R.string.trans_al_quddus, arabic = R.string.al_quddus),
                Attribute(english = R.string.eng_as_salaam, transliteration = R.string.trans_as_salaam, arabic = R.string.as_salaam),
                Attribute(english = R.string.eng_al_mumin, transliteration = R.string.trans_al_mumin, arabic = R.string.al_mumin),
                Attribute(english = R.string.eng_al_muhaymin, transliteration = R.string.trans_muhaymin,R.string.al_muhaymin),
                Attribute(english = R.string.eng_al_azeez, transliteration = R.string.trans_al_azeez, arabic = R.string.al_azeez),
                Attribute(english = R.string.eng_al_jabaar, transliteration = R.string.trans_al_jabaar, arabic = R.string.al_jabaar),
                Attribute(english = R.string.eng_al_mutakabir, transliteration = R.string.trans_al_mutakabir,R.string.al_mutakabir),

                Attribute(english = R.string.eng_al_khaaliq, transliteration = R.string.trans_al_khaaliq, arabic = R.string.al_khaaliq),
                Attribute(english = R.string.eng_al_baari, transliteration = R.string.trans_al_baari, arabic = R.string.al_baari),
                Attribute(english = R.string.eng_al_musawwir, transliteration = R.string.trans_al_musawwir, arabic = R.string.al_musawwir),
                Attribute(english = R.string.eng_al_gaffaar, transliteration = R.string.trans_al_gaffaar, arabic = R.string.al_gaffaar),
                Attribute(english = R.string.eng_al_qahaar, transliteration = R.string.trans_al_qahaar, arabic = R.string.al_qahaar),
                Attribute(english = R.string.eng_al_wahaab, transliteration = R.string.trans_al_wahaab, arabic = R.string.al_wahaab),
                Attribute(english = R.string.eng_ar_razzaaq, transliteration = R.string.trans_ar_razzaaq, arabic = R.string.ar_razzaaq),
                Attribute(english = R.string.eng_al_fattah, transliteration = R.string.trans_al_fattah, arabic = R.string.al_fattah),
                Attribute(english = R.string.eng_al_aleem, transliteration = R.string.trans_al_aleem, arabic = R.string.al_aleem),
                Attribute(english = R.string.eng_al_qaabid, transliteration = R.string.trans_al_qaabid, arabic = R.string.al_qaabid),

                Attribute(english = R.string.eng_al_baasit, transliteration = R.string.trans_al_baasit ,R.string.al_baasit),
                Attribute(english = R.string.eng_al_khaafidh, transliteration = R.string.trans_al_khaafidh, arabic = R.string.al_khaafidh),
                Attribute(english = R.string.eng_ar_raafi, transliteration = R.string.trans_ar_raafi, arabic = R.string.ar_raafi),
                Attribute(english = R.string.eng_al_muizz, transliteration = R.string.trans_al_muizz, arabic = R.string.al_muizz),
                Attribute(english = R.string.eng_al_muzil, transliteration = R.string.trans_al_muzil, arabic = R.string.al_muzil),
                Attribute(english = R.string.eng_as_samee, transliteration = R.string.trans_as_samee, arabic = R.string.as_samee),
                Attribute(english = R.string.eng_al_baseer, transliteration = R.string.trans_al_baseer, arabic = R.string.al_baseer),
                Attribute(english = R.string.eng_al_hakam, transliteration = R.string.trans_al_hakam, arabic = R.string.al_hakam),
                Attribute(english = R.string.eng_al_adl, transliteration = R.string.trans_al_adl, arabic = R.string.al_adl),
                Attribute(english = R.string.eng_al_lateef, transliteration = R.string.trans_al_lateef, arabic = R.string.al_lateef),

                Attribute(english = R.string.eng_al_khabeer, transliteration = R.string.trans_al_khabeer, arabic = R.string.al_khabeer),
                Attribute(english = R.string.eng_al_haleem, transliteration = R.string.trans_al_haleem, arabic = R.string.al_haleem),
                Attribute(english = R.string.eng_al_azeem, transliteration = R.string.trans_al_azeem, arabic = R.string.al_azeem),
                Attribute(english = R.string.eng_al_ghafoor, transliteration = R.string.trans_al_ghafoor, arabic = R.string.al_ghafoor),
                Attribute(english = R.string.eng_al_shakoor, transliteration = R.string.trans_al_shakoor, arabic = R.string.ash_shakoor),
                Attribute(english = R.string.eng_al_alee, transliteration = R.string.trans_al_alee, arabic = R.string.al_alee),
                Attribute(english = R.string.eng_al_kabeer, transliteration = R.string.trans_al_kabeer, arabic = R.string.al_kabeer),
                Attribute(english = R.string.eng_al_hafeedh, transliteration = R.string.trans_al_hafeedh, arabic = R.string.al_hafeedh),
                Attribute(english = R.string.eng_al_muqeet, transliteration = R.string.trans_al_muqeet, arabic = R.string.al_muqeet),
                Attribute(english = R.string.eng_al_haseeb, transliteration = R.string.trans_al_haseeb, arabic = R.string.al_haseeb),

                Attribute(english = R.string.eng_al_jaleel, transliteration = R.string.trans_al_jaleel, arabic = R.string.al_jaleel),
                Attribute(english = R.string.eng_al_kareem, transliteration = R.string.trans_al_kareem, arabic = R.string.al_kareem),
                Attribute(english = R.string.eng_ar_raqeeb, transliteration = R.string.trans_ar_raqeeb, arabic = R.string.ar_raqeeb),
                Attribute(english = R.string.eng_al_mujeeb, transliteration = R.string.trans_al_mujeeb, arabic = R.string.al_mujeeb),
                Attribute(english = R.string.eng_al_waasi, transliteration = R.string.trans_al_waasi, arabic = R.string.al_waasi),
                Attribute(english = R.string.eng_al_hakeem, transliteration = R.string.trans_al_hakeem, arabic = R.string.al_hakeem),
                Attribute(english = R.string.eng_al_wadood, transliteration = R.string.trans_al_wadood, arabic = R.string.al_wadood),
                Attribute(english = R.string.eng_al_majeed, transliteration = R.string.trans_al_majeed, arabic = R.string.al_majeed),
                Attribute(english = R.string.eng_al_baaith, transliteration = R.string.trans_al_baaith, arabic = R.string.al_baaith),
                Attribute(english = R.string.eng_as_shaheed, transliteration = R.string.trans_as_shaheed, arabic = R.string.ash_shaheed),

                Attribute(english = R.string.eng_al_haqq, transliteration = R.string.trans_al_haqq, arabic = R.string.al_haqq),
                Attribute(english = R.string.eng_al_wakeel,transliteration = R.string.trans_al_wakeel, arabic = R.string.al_wakeel),
                Attribute(english = R.string.eng_al_qawiy,transliteration = R.string.trans_al_qawiy,arabic = R.string.al_qawiy),
                Attribute(english = R.string.eng_al_mateen, transliteration = R.string.trans_al_mateen, arabic = R.string.al_mateen),
                Attribute(english = R.string.eng_al_waliyy, transliteration = R.string.trans_al_waliyy, arabic = R.string.al_waliyy),
                Attribute(english = R.string.eng_al_hameed, transliteration = R.string.trans_al_hameed, arabic = R.string.al_hameed),
                Attribute(english = R.string.eng_al_muhsee, transliteration = R.string.trans_al_muhsee, arabic = R.string.al_muhsee),
                Attribute(english = R.string.eng_al_mubdi, transliteration = R.string.trans_al_mubdi, arabic = R.string.al_mubdi),
                Attribute(english = R.string.eng_al_mueed, transliteration = R.string.trans_al_mueed, arabic = R.string.al_mueed),
                Attribute(english = R.string.eng_al_muhyi, transliteration = R.string.trans_al_muhyi, arabic = R.string.al_muhyi),

                Attribute(english = R.string.eng_al_mumeet, transliteration = R.string.trans_al_mumeet, arabic = R.string.al_mumeet),
                Attribute(english = R.string.eng_al_hayy, transliteration = R.string.trans_al_hayy, arabic = R.string.al_hayy),
                Attribute(english = R.string.eng_al_qayyoom, transliteration = R.string.trans_al_qayyoom, arabic = R.string.al_qayyoom),
                Attribute(english = R.string.eng_al_waajid, transliteration = R.string.trans_al_waajid, arabic = R.string.al_waajid),
                Attribute(english = R.string.eng_al_maajid, transliteration = R.string.trans_al_maajid, arabic = R.string.al_maajid),
                Attribute(english = R.string.eng_al_waahid, transliteration = R.string.trans_al_waahid, arabic = R.string.al_waahid),
                Attribute(english = R.string.eng_al_ahad, transliteration = R.string.trans_al_ahad, arabic = R.string.al_ahad),
                Attribute(english = R.string.eng_as_samad, transliteration = R.string.trans_as_samad, arabic = R.string.as_samad),
                Attribute(english = R.string.eng_al_qaadir, transliteration = R.string.trans_al_qaadir, arabic = R.string.al_qaadir),
                Attribute(english = R.string.eng_al_muqtadir, transliteration = R.string.trans_al_muqtadir, arabic = R.string.al_muqtadir),

                Attribute(english = R.string.eng_al_muqadam, transliteration = R.string.trans_al_muqadam,arabic = R.string.al_muqadam),
                Attribute(english = R.string.eng_al_muakhar, transliteration = R.string.trans_al_muakhar, arabic =R.string.al_muakhar),
                Attribute(english = R.string.eng_al_awal, transliteration = R.string.trans_al_awal, arabic = R.string.al_awal),
                Attribute(english = R.string.eng_al_aakhir, transliteration = R.string.trans_al_aakhir, arabic = R.string.al_aakhir),
                Attribute(english = R.string.eng_az_zawhir, transliteration = R.string.trans_az_zawhir, arabic = R.string.az_zawhir),
                Attribute(english = R.string.eng_al_baatin, transliteration = R.string.trans_al_baatin, arabic = R.string.al_baatin),
                Attribute(english = R.string.eng_al_waali, transliteration = R.string.trans_al_waali, arabic = R.string.al_waali),
                Attribute(english = R.string.eng_al_mutaaali, transliteration = R.string.trans_al_mutaaali, arabic = R.string.al_mutaaali),
                Attribute(english = R.string.eng_al_barr, transliteration = R.string.trans_al_barr, arabic = R.string.al_barr),
                Attribute(english = R.string.eng_at_tawwaab, transliteration = R.string.trans_at_tawwaab, arabic = R.string.at_tawwaab),

                Attribute(english = R.string.eng_al_muntaqim, transliteration = R.string.trans_al_muntaqim, arabic = R.string.al_muntaqim),
                Attribute(english = R.string.eng_al_afuww, transliteration = R.string.trans_al_afuww, arabic = R.string.al_afuww),
                Attribute(english = R.string.eng_ar_raoof, transliteration = R.string.trans_ar_raoof, arabic = R.string.ar_raoof),
                Attribute(english = R.string.eng_malik_ul_mulk, transliteration = R.string.trans_malik_ul_mulk, arabic = R.string.malik_ul_mulk),
                Attribute(english = R.string.eng_dhul_jalaali_wal_ikraam, transliteration = R.string.trans_dhul_jalaali_wal_ikraam, arabic = R.string.dhul_jalaali_wal_ikraam),
                Attribute(english = R.string.eng_al_muqsit, transliteration = R.string.trans_al_muqsit, arabic = R.string.al_muqsit),
                Attribute(english = R.string.eng_al_jaami, transliteration = R.string.trans_al_jaami, arabic = R.string.al_jaami),
                Attribute(english = R.string.eng_al_ganiyy, transliteration = R.string.trans_al_ganiyy, arabic = R.string.al_ganiyy),
                Attribute(english = R.string.eng_al_mugni, transliteration = R.string.trans_al_mugni, arabic = R.string.al_mugni),
                Attribute(english = R.string.trans_al_maani, transliteration = R.string.eng_al_maani,arabic = R.string.al_maani),

                Attribute(english = R.string.trans_ad_dhaar, transliteration = R.string.eng_ad_dhaar, arabic = R.string.ad_dhaar),
                Attribute(english = R.string.trans_an_naafi,R.string.eng_an_naafi,R.string.an_naafi),
                Attribute(english = R.string.trans_an_noor, transliteration = R.string.eng_an_noor, arabic = R.string.an_noor),
                Attribute(english = R.string.trans_al_haadi, transliteration = R.string.eng_al_haadi, arabic = R.string.al_haadi),
                Attribute(english = R.string.trans_al_badee, transliteration = R.string.eng_al_badee, arabic = R.string.al_badee),
                Attribute(english = R.string.trans_al_baaqee, transliteration = R.string.eng_al_baaqee, arabic = R.string.al_baaqee),
                Attribute(english = R.string.trans_al_waarith, transliteration = R.string.eng_al_waarith, arabic = R.string.al_waarith),
                Attribute(english = R.string.trans_ar_rasheed, transliteration = R.string.eng_ar_rasheed, arabic = R.string.ar_rasheed),
                Attribute(english = R.string.trans_as_saboor, transliteration = R.string.eng_as_saboor, arabic = R.string.as_saboor)
                )
    }
}