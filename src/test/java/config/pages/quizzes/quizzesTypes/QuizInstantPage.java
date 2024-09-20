package config.pages.quizzes.quizzesTypes;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuizInstantPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By subText = AppiumBy.accessibilityId("Denmark, Norway, or Sweden?");
    private final By authorInfo = AppiumBy.accessibilityId("by soffy5, Community Contributor");
    private final By questions = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText");
    private final By quizTitleResultsScreen = AppiumBy.accessibilityId("Which Scandinavian Country Are You Based On Your Personality?");
    private final By fstChoice = AppiumBy.accessibilityId("Cat");
    private final By sndChoice = AppiumBy.accessibilityId("Volvo");
    private final By trdChoice = AppiumBy.accessibilityId("Burgers");
    private final By fthChoice = AppiumBy.accessibilityId("contains('George')");
    private final By fftChoice = AppiumBy.accessibilityId("Fanta");
    private final By sthChoice = AppiumBy.accessibilityId("Japan");



    public void tap1Choice(){getDriver().findElement(fstChoice).click();}
    public void tap2Choice(){getDriver().findElement(sndChoice).click();}
    public void tap3Choice(){getDriver().findElement(trdChoice).click();}
    public void tap4Choice(){getDriver().findElement(fthChoice).click();}
    public void tap5Choice(){getDriver().findElement(fftChoice).click();}
    public void tap6Choice(){getDriver().findElement(sthChoice).click();}

    //Methods
    //--First screen
    public boolean verifySubTextIsPresent() {
        return getDriver().findElement(subText).isDisplayed();
    }

    public boolean verifyAuthorInfoIsPresent() {
        return getDriver().findElement(authorInfo).isDisplayed();
    }

    //--Answers
    public String questions(){
        String question = getDriver().findElement(questions).getText();
        print("Question: '" + question + "'");
        return question;
    }

    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return getDriver().findElement(quizTitleResultsScreen).isDisplayed();
    }
}
