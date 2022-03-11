# AttributesOfAllah
This is my personal project aimed at writing _Android Instrumentation_ tests.

Please note: this project is a work in progress. 

### What is the app about? ###

The concept of the app is relatively straight-forward. It lists the 'Attributes'(or names) of Allah in a RecyclerView.

### Purpose ###

The focus of the project is predominantly writing Instrumentation (UI) tests using Espresso. 

#### RecyclerView ####
[ListsTest.kt](/app/src/androidTest/java/com/example/andriod/attributesofallah/ListsTests.kt "ListsTest title") has extensive UI RecyclerView tests which test a specific (name of Allah) at a certain position in the recycler view, asserts/checks whether it has certain sibling text that is displayed. It then performs a longClick() operation to send an intent.

#### Navigation Jetpack ####
[NavigationTests.kt](/app/src/androidTest/java/com/example/andriod/attributesofallah/NavigationTests.kt "NavigationTests title") contains a single test to assert that clicking on a name navigates to the correct target destination fragment. This is achieved with the help of navigation and fragment testing dependencies. 

#### UiAutomator ####
I have also attemtped to use UiAutomator API to extend the above functionality to enable a name to be shared to a WhatsApp contact. 
I used _Appium's_ built-in Layout Inspector to inspect WhatsApp's layout in order to obtain its content description/res Id allowing tests to locate/interact with components.

#### Intents ####
There are a couple of other tests to test Intents using intended() function as well as testing fragment in isolation.

### More Information ###
This project also aims to apply some of the concepts learnt from [Android Basics In Kotlin](https://github.com/azzumw/GoogleDeveloper) namely: Jetpack Navigation Component using fragments. 

I intend to extend the functionality of the app by adding audio clip to each Attribute instance so that the user can hear the pronunciation of each word.
