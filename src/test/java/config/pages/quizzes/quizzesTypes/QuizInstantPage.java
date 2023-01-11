package config.pages.quizzes.quizzesTypes;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QuizInstantPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By subText = MobileBy.AccessibilityId("Denmark, Norway, or Sweden?");
    private final By authorInfo = MobileBy.AccessibilityId("by soffy5, Community Contributor");
    private final By questions = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("Which Scandinavian Country Are You Based On Your Personality?");
    private final By fstChoice = MobileBy.AccessibilityId("Cat");
    private final By sndChoice = MobileBy.AccessibilityId("Volvo");
    private final By trdChoice = MobileBy.AccessibilityId("Burgers");
    private final By fthChoice = MobileBy.AccessibilityId("contains('George')");
    private final By fftChoice = MobileBy.AccessibilityId("Fanta");
    private final By sthChoice = MobileBy.AccessibilityId("Japan");



    public void tap1Choice(){driver.findElement(fstChoice).click();}
    public void tap2Choice(){driver.findElement(sndChoice).click();}
    public void tap3Choice(){driver.findElement(trdChoice).click();}
    public void tap4Choice(){driver.findElement(fthChoice).click();}
    public void tap5Choice(){driver.findElement(fftChoice).click();}
    public void tap6Choice(){driver.findElement(sthChoice).click();}

    //Methods
    //--First screen
    public boolean verifySubTextIsPresent() {
        return driver.findElement(subText).isDisplayed();
    }

    public boolean verifyAuthorInfoIsPresent() {
        return driver.findElement(authorInfo).isDisplayed();
    }

    //--Answers
    public String questions(){
        String question = driver.findElement(questions).getText();
        print("Question: '" + question + "'");
        return question;
    }

    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return driver.findElement(quizTitleResultsScreen).isDisplayed();
    }
}
