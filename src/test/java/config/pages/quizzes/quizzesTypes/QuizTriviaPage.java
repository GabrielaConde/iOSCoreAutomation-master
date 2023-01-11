package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;

import java.util.HashMap;
import java.util.Map;

public class QuizTriviaPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By triviaTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
    private final By subText = MobileBy.AccessibilityId("Welcome to game night!");
    private final By authorInfo = MobileBy.AccessibilityId("by Simrin Singh, BuzzFeed Staff");
    private final By progressBar1 = MobileBy.AccessibilityId("1 of 14");
    private final By progressBar14 = MobileBy.AccessibilityId("14 of 14");
    private final By intermediateProgressBar = By.xpath("//*[contains(@name,'of 14')]");
    private final By yourAnswerField = MobileBy.iOSNsPredicateString("value == 'Your Answer'");
    private final By guessButton = MobileBy.AccessibilityId("Guess");
    private final By lipsFirstAnswer = MobileBy.AccessibilityId("Lips!");
    private final By hummingBirdLatestAnswer = MobileBy.AccessibilityId("Hummingbird!");
    private final By iGiveUpButton = MobileBy.AccessibilityId("I give up!");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");
    private final By resultsFinishCard = MobileBy.AccessibilityId("You're a Pictionary champ!");
    private final By descriptionFinishCard = MobileBy.AccessibilityId("You're great at this game and everyone always want you to be on their team!");


    //Methods
    //--First screen
    public boolean verifySubTextIsPresent(){
        return driver.findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return driver.findElement(authorInfo).isDisplayed();
    }

    //--First Q - Good
    public boolean verifyProgressBar1IsPresent(){
        return driver.findElement(progressBar1).isDisplayed();
    }

    public boolean verifyYourAnswerFieldIsPresent(){
        return driver.findElement(yourAnswerField).isDisplayed();
    }

    public void tapYourAnswerField(){
        driver.findElement(yourAnswerField).click();
        print("Tapped 'Your Answer' field");
    }

    public String verifyTriviaTitle(){
        WaitersPage.waitForElement(triviaTitle);
        return driver.findElement(triviaTitle).getText();}

    public void sendAnswerString1(){
        driver.findElement(yourAnswerField).sendKeys("Lips");
        print("Typed (Good) Answer: 'Lips'");
    }

    public boolean verifyGuessButtonIsPresent() {
        return driver.findElement(guessButton).isDisplayed();
    }

    public void tapGuessButton(){
        driver.findElement(guessButton).click();
        print("Tapped 'Guess' button");
    }

    public boolean verifylipsTextIsPresent(){
        return driver.findElement(lipsFirstAnswer).isDisplayed();
    }

    public boolean verifyNextButtonIsPresent(){
        return driver.findElement(nextButton).isDisplayed();
    }

    //--Intermediate answers
    public void answerIntermediateQs(String data){
        String progressBar = driver.findElement(intermediateProgressBar).getText();
        print("Progress Bar: " + progressBar);
        print("checking this answer: " + data);
        driver.findElement(yourAnswerField).click();
        driver.findElement(yourAnswerField).sendKeys(data);
        driver.findElement(guessButton).click();
        driver.findElement(correctText).isDisplayed();
        print("'Correct!' text is displayed");
        driver.findElement(nextButton).click();
    }

    //--Latest answer - Fail
    public boolean verifyProgressBar14IsPresent(){
        return driver.findElement(progressBar14).isDisplayed();
    }

    public void sendAnswerString14(){
        driver.findElement(yourAnswerField).sendKeys("Bird");
        print("Typed (Good) Answer: 'Lips'");
    }

    public boolean verifyIGiveUpButtonIsPresent(){
        return driver.findElement(iGiveUpButton).isDisplayed();
    }

    public void tapIGiveUpButton(){
        driver.findElement(iGiveUpButton).click();
        print("Tapped 'I Give Up!' button");
    }

    public boolean verifyHummingbirdTextIsPresent(){
        return driver.findElement(hummingBirdLatestAnswer).isDisplayed();
    }

    //--Results card
    public boolean verifyQuizTitleResultIsPresent(){
        return driver.findElement(quizTitleResultsScreen).isDisplayed();
    }

    public boolean verifyResultsTextIsPresent(){
        return driver.findElement(resultsFinishCard).isDisplayed();
    }

    public boolean verifyDescriptionTextIsPresent(){
        return driver.findElement(descriptionFinishCard).isDisplayed();
    }

    //--Swipe
    public void swipeUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        params.put("element", (driver.findElement(nextButton).getId()));
        js.executeScript("mobile: swipe", params);
    }
}

