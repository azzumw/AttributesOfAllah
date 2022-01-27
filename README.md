# AttributesOfAllah
Personal Project to memorise names of Allah.
The focus of the project is predominantly writing Instrumentation (UI) tests using Espresso. 
ListsTest.kt has extensive UI tests which test a specific (name of Allah) at a certain position, asserts/checks whether it has certain sibling text that is displayed. It then performs a longClick() operation to send an intent. 
Later in Jan 22, I attemtped to use UiAutomator API to extend the above function to enable name to be shared to a recently appearing WhatsApp contact.
I used Appium's built in Layout Inspector to inspect WhatsApp app layout to obtain its content description/red Id to interact with the UI components. 

There are a couple of other tests to test Intents using intended() function as well as testing fragment in isolation. 

This project also aims to apply some of the concepts learnt from Google Developer namely: Jetpack Navigation Component using fragments. 
It is, currently, a one screen app, but I am in the process of implementing a second fragment(screen) which will take user, when clicking on a particular name in the list, to the second fragment. This fragment will act as a Detail Fragment to provide further detail on the meaning, and possibly implement audio capability to let user hear the name. 
