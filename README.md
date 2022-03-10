# AttributesOfAllah
This is my personal project aimed at Android Instrumentation testing.

Please note: this project is a work in progress. 

###What is the app about?###

The concept of the app is straight-forward. It lists the 'Attributes'(or names) of Allah in a RecyclerView.

### Purpose ###

The focus of the project is predominantly writing Instrumentation (UI) tests using Espresso. 

#### RecyclerView ####
[ListsTest.kt](/app/src/androidTest/java/com/example/andriod/attributesofallah/ListsTests.kt "ListsTest title") has extensive UI RecyclerView tests which test a specific (name of Allah) at a certain position in the recycler view, asserts/checks whether it has certain sibling text that is displayed. It then performs a longClick() operation to send an intent. 

#### UiAutomator ####
I have also attemtped to use UiAutomator API to extend the above function to enable name to be shared to a recently appearing WhatsApp contact. I used Appium's built in Layout Inspector to inspect WhatsApp app layout to obtain its content description/red Id to interact with the UI components.

#### Intents ####
There are a couple of other tests to test Intents using intended() function as well as testing fragment in isolation.

### More Information ###
This project also aims to apply some of the concepts learnt from Google Developer namely: Jetpack Navigation Component using fragments. It is, currently, a one screen app, but I am in the process of implementing a second fragment(screen) which will take user, when clicking on a particular name in the list, to the second fragment. This fragment will act as a Detail Fragment to provide further detail on the meaning, and possibly implement audio capability to let user hear the name.
