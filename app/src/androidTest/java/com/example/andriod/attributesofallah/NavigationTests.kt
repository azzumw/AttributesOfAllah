package com.example.andriod.attributesofallah

import android.app.Application
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {

    private lateinit var navController : TestNavHostController
    private lateinit var nameDetailFragScenario : FragmentScenario<NameListFragment>

    @Before
    fun setUp() {
        navController = TestNavHostController(ApplicationProvider.getApplicationContext())

        nameDetailFragScenario = launchFragmentInContainer(themeResId = R.style.Theme_MaterialComponents_DayNight_DarkActionBar)

        //explicitly declare which navigation graph we want the nav controller to use for the fragment
        nameDetailFragScenario.onFragment{
            navController.setGraph(R.navigation.nav_graph)

            Navigation.setViewNavController(it.requireView(),navController)
        }
    }

    @Test
    fun navigate_to_name_detail_fragment(){
        //GIVEN:
        //WHEN:
        onView(withId(R.id.recycler_view))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2,click()))

        //THEN
        assertEquals(navController.currentDestination?.id,R.id.nameDetailFragment)
    }
}