package com.example.andriod.attributesofallah

import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.By
import androidx.test.uiautomator.BySelector
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.example.andriod.attributesofallah.adapter.ItemAdapter
import com.example.andriod.attributesofallah.data.DataSource
import org.hamcrest.Matchers.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.w3c.dom.Text

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

//We annotate each test class with AndroidJunit4::class otherwise the default Junit runner will take over the running process, and tests will fail.
@RunWith(AndroidJUnit4::class)
class ListsTests() : BaseTestClass() {

    private val recyclerView = viewWithId(R.id.recycler_view)
    private lateinit var device : UiDevice



    @Before
    fun setUp() {
        device = UiDevice.getInstance(getInstrumentation())
    }

    @Test
    fun checkFirstAttribute() {

        //onView - a ViewInteraction for a given view. Takes the hamcrest ViewMatcher Instance(s)
        //as a parameter. You can pass one or more of these to the onView() method to locate a view
        //based on view properties, within the current view hierarchy.
        onView(withText("Ar-Rahman"))
                .check(matches(isDisplayed()))
                .perform(longClick())
//        onView(allOf(withText(R.string.trans_ar_rahman), isDisplayed())).perform(longClick())
//        onView(allOf(withId(R.id.translitration), withText(R.string.trans_ar_rahman), isDisplayed()))
//        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_ar_rahman), isDisplayed()))
//        onView(withText(R.string.eng_ar_rahman)).check(matches(isDisplayed()))
    }

    @Test fun checkContentDescription(){
//        onView(withContentDescription(R.string.transContentDesc)).check(matches(withText(R.string.trans_ar_rahman)))
        onView(allOf(withContentDescription(R.string.transContentDesc), withText(R.string.trans_ar_rahman), isDisplayed()))
                .perform(longClick())
//        onView(withId(R.id.translitration))
//                .check(matches(withContentDescription(containsString("Arabic"))))
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_ar_rahman), isDisplayed())).check(matches(allOf(withText((startsWith("Ar"))), withText(containsString("man")))))
    }



    @Test fun check_ar_rahman_ignorecase(){
        onView(allOf(withText(equalToIgnoringCase("ar-rahman")), withText(R.string.eng_ar_rahman))).perform(longClick())
    }


    @Test
    fun checkArRaheem() {
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_ar_raheem), isDisplayed()))
        onView(withText(endsWith("eem"))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test fun checkAlMalik(){
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_al_malik), isDisplayed()))
    }

    @Test fun checkAlQuddus(){
        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_al_quddus), isDisplayed()))
    }

    @Test fun checkSalaam(){
        onView(allOf(withId(R.id.englishtextView), withText(R.string.eng_as_salaam), isDisplayed()))
    }

    @Test fun checkRahmanArabic(){
        onView(allOf(withId(R.id.arabictextView), withText(R.string.ar_rahman), isDisplayed()))
    }

    @Test fun checkAlMuminTranslit(){
        onView(allOf(withId(R.id.translitration), withText(R.string.trans_al_mumin)))
    }

    @Test fun longClick_ArRahman(){
        val vm  = onView(withText(R.string.trans_ar_rahman))
        val va = vm.check(matches(isDisplayed()))

        va?.perform(longClick())


    }

    @Test fun scrolltoAl_Azeez(){
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_baasit))))

//        onView(allOf(withId(R.id.recycler_view), isDisplayed())).perform(RecyclerViewActions
//                .actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_khabeer)), longClick()))

    }

    @Test
    fun scrollto_alAzeem() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_azeez)), longClick()))
    }

    @Test
    fun check_alghafoor() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_ghafoor))))
    }

    @Test fun check_ash_shakoor(){
//        onView(withId(R.id.recycler_view))
//                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_shakoor))))

        onView(withId(R.id.recycler_view))
                .perform(swipeUp())
        onView(hasDescendant(allOf(withId(R.id.translitration), withText("Ash-Shakoor")))).check(matches(isDisplayed()))
    }

    @Test fun longClick_Ash_shakoor(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_shakoor)), longClick()))
    }

    @Test fun check_al_alee(){
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_alee))))
    }

    @Test fun scroll_Al_alee(){
        onView(withId(R.id.recycler_view)).
        perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_alee)), longClick()))
    }

    @Test fun longClick_al_kabeer(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_kabeer)), longClick()))
    }

    @Test fun longClick_al_hafeedh(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_hafeedh)), longClick()))
    }

    @Test fun scrollToAlKabeer(){
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_kabeer))))
    }

    @Test fun scrollToHafeedh(){
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_hafeedh))))
    }

    @Test fun longClick_AlMuqeet(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_muqeet)), longClick()))
    }

    @Test
    fun longClick_AlHaseeb() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_haseeb)), longClick()))
    }

    @Test fun scrollTo_AlMuqeet(){
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_muqeet))))
    }

    @Test
    fun scrollTo_AlHaseeb() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_haseeb))))
    }

    @Test
    fun longClick_AlJaleel(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_jaleel)), longClick()))
    }

    @Test
    fun longClick_alKareem() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_kareem)), longClick()))
    }

    @Test
    fun scrollTo_alJaleel() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_jaleel))))
    }

    @Test
    fun scrollTo_AlKareem() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_kareem))))
    }

    @Test
    fun scrollToPosition() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(20, scrollTo()))


//        onView(withId(R.id.recycler_view))
//                .perform(scrollToPosition<RecyclerView.ViewHolder>(40))
    }

    @Test
    fun scrollTo_ArRaqeeb() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(42, scrollTo()))
    }

    @Test
    fun longClick_ArRaqeeb(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_ar_raqeeb)), longClick()))
    }

    @Test
    fun scrollTo_AlMujeeb() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(43, scrollTo()))
    }

    @Test
    fun longClick_AlMujeeb() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_mujeeb)), longClick()))
    }

    @Test
    fun scrollTo_AlWaasi() {
        onView(withId(R.id.recycler_view))
                .perform(scrollToPosition<RecyclerView.ViewHolder>(44))
    }

    @Test
    fun longClick_AlHakeem() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_hakeem)), longClick()))
    }

    @Test
    fun scrollTo_AlHakeem_Position() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(45, longClick()))

    }

    @Test
    fun scrollTo_AlHakeem() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_hakeem))))
    }

    @Test
    fun scrollToWithPosition_AlHakeem() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(47, scrollTo()))
    }

    @Test
    fun longClick_AlWadood() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_wadood)), longClick()))
    }

    @Test fun checkSpelling_AlWadood(){
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(46, scrollTo()))
                .check(matches(hasDescendant(withText("Al-Wadood"))))


    }

    @Test
    fun longClick_Al_Baaith() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(48, scrollTo()))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.eng_al_baaith)), longClick()))


//        onView(withId(R.id.recycler_view))
//                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(48, longClick()));
    }

    @Test
    fun scrollTo_Al_Baaith() {
        onView(withId(R.id.recycler_view))
                .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_baaith))))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_baaith)), longClick()))


    }

    @Test
    fun longClick_AlHaqq() {
        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_haqq)), longClick()))
    }

    @Test
    fun scrollTo_Al_Waliyy() {
        onView(withId(R.id.recycler_view))
            .perform(scrollTo<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_waliyy))))

    }

    @Test
    fun longClick_Al_Waliyy() {
        onView(withId(R.id.recycler_view))
            .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_waliyy)),
                longClick()))
    }

    @Test
    fun scrollTo_AlMateen() {

        onView(withId(R.id.recycler_view))
                .perform(actionOnItem<RecyclerView.ViewHolder>(hasDescendant(withText(R.string.trans_al_mateen)),
                        scrollTo()))
                .check(matches(hasDescendant(isAssignableFrom(TextView::class.java))))



//        onView(withId(R.id.recycler_view))
//                .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(55, scrollTo()))
//                .perform(longClick())
//                .check(matches(hasDescendant(withText(R.string.eng_al_mateen)))).perform(longClick())

//        onView(withId(R.id.recycler_view))
//                .perform(scrollToPosition<RecyclerView.ViewHolder>(53))
//                .check(matches(allOf(
//                        hasDescendant(withText(R.string.trans_al_mateen))
//
//                )))
//                .perform(longClick())


    }

    @Test
    fun scrollTo_AlHameed() {
        onView(withId(R.id.recycler_view))
            .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(56, longClick()))
    }

    @Test
    fun scroll_and_longClick_Al_Muhsee() {
        onView(withId(R.id.recycler_view))
            .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(57, longClick()))
    }

    @Test
    fun al_mudi() {
//        onView(withId(R.id.recycler_view))
//                .perform(scrollToPosition<RecyclerView.ViewHolder>(58))
//                .check(matches(hasDescendant(withText(R.string.eng_al_mubdi))))
//                .check(matches(hasSibling(withText(R.string.trans_al_mubdi))))

//       onView(allOf(withParent(withId(R.id.card)), withChild(withId(R.id.numberTextView))))

        onView(withId(R.id.recycler_view))
                .perform(swipeUp())
        onView(withText("The One")).check(matches(isDisplayed()))
//        onView(withText("The One")).perform(longClick())



    }


    @Test
    fun test_recyclerView_hasChildCountSix() {
        onView(withId(R.id.recycler_view)).check(matches(hasChildCount(6)))
    }

    @Test
    fun recyclerView_hasCardView() {
        onView(withId(R.id.recycler_view)).check(matches(withChild(withId(R.id.card))))
    }

    @Test
    fun recyclerView_hasRelativeLayout() {
        onView(withId(R.id.recycler_view)).check(matches(hasDescendant(allOf(isAssignableFrom(ConstraintLayout::class.java), withId(R.id.rootItemlayout)))))
    }

    @Test
    fun al_maajid() {

        //why is this erroring out?

//        onView(withId(R.id.recycler_view)).perform(swipeUp()).check(matches(hasDescendant(allOf(isAssignableFrom(TextView::class.java), withText(R.string.trans_al_maajid)))))
        onView(withId(R.id.recycler_view)).perform(swipeUp())
//                .check(matches(hasDescendant(allOf(withId(R.id.englishtextView), withText(R.string.trans_al_maajid)))))

        onView(withText(R.string.eng_al_muhaymin)).perform(longClick())
    }

    @Test
    fun long_click_al_ahad() {

        // ***THIS WORKS***
//        recyclerView.perform(RecyclerViewActions.scrollTo<ItemAdapter.ItemViewHolder>(hasDescendant(withText(R.string.trans_al_ahad))))
//        onView(withText(R.string.trans_al_ahad)).perform(longClick())
        recyclerView.perform(actionOnItem<ItemAdapter.ItemViewHolder>(hasDescendant(withText(R.string.trans_al_ahad)), longClick()))
    }


    @Test
    fun scrollToAs_Samad() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(67))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_as_samad))).perform(longClick())
    }

    @Test
    fun scrollTo_Al_Qaadir() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(68))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_al_qaadir))).perform(longClick())
    }

    @Test
    fun scroll_to_al_muqtadir() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(69))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_al_muqtadir))).check(matches(isDisplayed()))
    }

    @Test
    fun scrollTo_al_muqadam() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(70))

        onView(allOf(isAssignableFrom(TextView::class.java), withText("The Expediter"))).check(matches(isDisplayed()))
    }

    @Test
    fun scrollTo_al_muakhar() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(71))

        onView(allOf(isAssignableFrom(TextView::class.java), withText("The Delayer"))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scrollto_al_awal() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(72))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_al_awal))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scrollTo_al_aakhir() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(73))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_al_aakhir))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_az_zawhir() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(74))

        onView(allOf(isAssignableFrom(TextView::class.java), withText(R.string.eng_az_zawhir))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_al_baatin() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(75))

        onView(withText(R.string.eng_al_baatin)).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_al_waali() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(76))

        onView(allOf(isAssignableFrom(TextView::class.java), withText("Al-Waali"))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_al_mutaaali() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(77))

        onView(withText("Al-Muta'aali")).check(matches(hasSibling(withText("The Self Exalted")))).perform(longClick())
    }


    @Test
    fun scroll_to_al_barr() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(78))

        onView(withText("Al-Barr")).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_at_tawwaab() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(79))
        onView(allOf(isAssignableFrom(TextView::class.java), withText("At-Tawwaab"))).check(matches(isDisplayed())).perform(longClick())
    }

    @Test
    fun scroll_to_al_muntaqim() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(80))

        onView(withText("Al-Muntaqim")).check(matches(hasSibling(withText("الْمُنْتَقِمُ")))).perform(longClick())

    }

    @Test
    fun scroll_to_al_afuww() {
        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(81))

        onView(withText("Al-'Afuww")).check(matches(allOf(hasSibling(withText(R.string.al_afuww)), hasSibling(withText("The Pardoner"))))).perform(longClick())
    }

    @Test
    fun scroll_to_ar_raoof() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(82))

        onView(withText("Ar-Ra'oof")).check(matches(allOf(hasSibling(withText(R.string.ar_raoof)), hasSibling(withText("The Most Kind"))))).perform(longClick())
    }

    @Test
    fun scroll_to_maalik_ul_mulk() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(83))

        onView(withText(equalToIgnoringCase("Malik-ul-mulk"))).check(matches(allOf(hasSibling(withText("The Master of Dominion")), hasSibling(withText(R.string.malik_ul_mulk)))))
                .perform(longClick())
    }

    @Test
    fun scroll_to_dhul_jallali_wal_ikraam() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(84))

        onView(withText(equalToIgnoringCase("Dhul Jalaali Wal Ikraam")))
                .check(matches(allOf(hasSibling(withText(R.string.eng_dhul_jalaali_wal_ikraam)), hasSibling(withText(R.string.dhul_jalaali_wal_ikraam)))))
                .perform(longClick())

    }

    @Test
    fun scroll_to_al_muqsit() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(85))

        onView(withText(equalToIgnoringCase("Al-muqsit")))
                .check(matches
                (allOf
                    (
                        hasSibling(withText("The Just One")),
                        hasSibling(withText("الْمُقْسِطُ"))
                    )
                ))
                .perform(longClick())
    }

    @Test
    fun scroll_to_al_jaami() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(86))

        onView(withText("Al-Jaami'"))
                .check(matches(allOf(
                        hasSibling(withText("The Gatherer")),
                        hasSibling(withText("الْجَامِعُ"))
                )))
                .perform(longClick())
    }

    @Test
    fun scroll_to_al_ghani() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(87))

        onView(withText("Al-Ghaniyy"))
                .check(matches(
                        allOf(
                                hasSibling(withText("The Self Sufficient")),
                                hasSibling(withText("ٱلْغَنيُّ"))
                        )
                )).perform(longClick())
    }

    @Test
    fun scroll_to_al_mughni() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(88))

        onView(withText(R.string.trans_al_mugni))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_al_mugni)),
                                hasSibling(withText(R.string.al_mugni))
                        )
                ))
    }

    @Test
    fun scroll_to_al_maani_and_shares_it_with_Emre() {

        val device = UiDevice.getInstance(getInstrumentation())

        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(89))

        onView(withText(R.string.trans_al_maani))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_al_maani)),
                                hasSibling(withText(R.string.al_maani)),

                        )
                ))
                .perform(longClick())

        Helpers.shareTheNametWith("Emre",device)

    }

    @Test
    fun scroll_to_ad_dhaar() {

        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(90))

        onView(withText(R.string.trans_ad_dhaar))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_ad_dhaar)),
                                hasSibling(withText(R.string.ad_dhaar))
                        )
                ))
                .perform(longClick())

        Helpers.shareTheNametWith("Mama",device = device)
    }

    @Test
    fun scroll_to_an_naafi() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(91))

        onView(withText(R.string.trans_an_naafi))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_an_naafi)),
                                hasSibling(withText(R.string.an_naafi))
                        )
                )).perform(longClick())

        Helpers.shareTheNametWith("Mama",device = device)
    }

    @Test
    fun scroll_to_an_noor() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(92))

        onView(withText("An-Noor"))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_an_noor)),
                                hasSibling(withText(R.string.an_noor))
                        )
                ))
                .perform(longClick())

        Helpers.shareTheNametWith("Mama",device)
    }

    @Test
    fun scroll_to_al_haadi() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(93))

        onView(withText("Al-Haadi"))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.eng_al_haadi)),
                                hasSibling(withText(R.string.al_haadi))
                        )
                ))
                .perform(longClick())

        device.findObject(UiSelector().text("Mama")).click()
        device.pressEnter()
        device.findObject(UiSelector().description("Send")).click()
    }

    @Test
    fun scroll_to_al_badee() {
        recyclerView.perform(RecyclerViewActions.scrollToPosition<ItemAdapter.ItemViewHolder>(94))

        onView(withText("Al-Badee'"))
                .check(matches(
                        allOf(
                                hasSibling(withText(R.string.al_badee)),
                                hasSibling(withText(R.string.eng_al_badee))
                        )
                ))
                .perform(longClick())

        device.findObject(UiSelector().text("Mama")).click()
        device.pressEnter()
        device.findObject(UiSelector().description("Send")).click()
    }

    @Test
    fun test_ui_automator() {

        device.pressHome()
        device.sleep()
        device.wakeUp()
        device.openNotification()


    }

    @Test
    fun scroll_to_last_element_and_assert() {
        val lastIndex = DataSource().loadAttributes(appContext).lastIndex
        val lastElementTransliteration = DataSource().loadAttributes(appContext).last().transliteration
        val lastElementEnglish = DataSource().loadAttributes(appContext).last().english
        val lastElementArabic = DataSource().loadAttributes(appContext).last().arabic

        recyclerView
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(lastIndex, scrollTo()))
                .check(matches(hasDescendant(withText(lastElementTransliteration))))
                .check(matches(hasDescendant(withText(lastElementEnglish))))
                .check(matches(hasDescendant(withText(lastElementArabic))))

    }

    @Test
    fun scrollto_and_longClick_lastElement() {
        val lastIndex = DataSource().loadAttributes(appContext).lastIndex
        val lastElementTransliteration = DataSource().loadAttributes(appContext).last().transliteration

        recyclerView.perform(scrollToPosition<ItemAdapter.ItemViewHolder>(lastIndex))

        onView(withText(lastElementTransliteration)).perform(longClick())
    }

    @After
    fun tearDown() {

    }
}