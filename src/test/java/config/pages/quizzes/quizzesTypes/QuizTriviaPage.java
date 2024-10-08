package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;

import java.util.HashMap;
import java.util.Map;

public class QuizTriviaPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By triviaTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
  //  private final By triviaTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
    private final By subText = AppiumBy.accessibilityId("Welcome to game night!");
    private final By authorInfo = AppiumBy.accessibilityId("by Simrin Singh, BuzzFeed Staff");
    private final By progressBar1 = AppiumBy.accessibilityId("1 of 14");
    private final By progressBar14 = AppiumBy.accessibilityId("14 of 14");
    private final By intermediateProgressBar = By.xpath("//*[contains(@name,'of 14')]");
    private final By yourAnswerField = AppiumBy.iOSNsPredicateString("value == 'Your Answer'");
    private final By guessButton = AppiumBy.accessibilityId("Guess");
    private final By lipsFirstAnswer = AppiumBy.accessibilityId("Lips!");
    private final By hummingBirdLatestAnswer = AppiumBy.accessibilityId("Hummingbird!");
    private final By iGiveUpButton = AppiumBy.accessibilityId("I give up!");
    private final By quizTitleResultsScreen = AppiumBy.accessibilityId("How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");
    private final By resultsFinishCard = AppiumBy.accessibilityId("You're a Pictionary champ!");
    private final By descriptionFinishCard = AppiumBy.accessibilityId("You're great at this game and everyone always want you to be on their team!");


    //Methods
    //--First screen
    public boolean verifySubTextIsPresent(){
        return getDriver().findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return getDriver().findElement(authorInfo).isDisplayed();
    }

    //--First Q - Good
    public boolean verifyProgressBar1IsPresent(){
        return getDriver().findElement(progressBar1).isDisplayed();
    }

    public boolean verifyYourAnswerFieldIsPresent(){
        return getDriver().findElement(yourAnswerField).isDisplayed();
    }

    public void tapYourAnswerField(){
        getDriver().findElement(yourAnswerField).click();
        print("Tapped 'Your Answer' field");
    }

    public String verifyTriviaTitle(){
      //  WaitersPage.waitForElement(triviaTitle);
        return getDriver().findElement(triviaTitle).getText();}

    public void sendAnswerString1(){
        getDriver().findElement(yourAnswerField).sendKeys("Lips");
        print("Typed (Good) Answer: 'Lips'");
    }

    public boolean verifyGuessButtonIsPresent() {
        return getDriver().findElement(guessButton).isDisplayed();
    }

    public void tapGuessButton(){
        getDriver().findElement(guessButton).click();
        print("Tapped 'Guess' button");
    }

    public boolean verifylipsTextIsPresent(){
        return getDriver().findElement(lipsFirstAnswer).isDisplayed();
    }

    public boolean verifyNextButtonIsPresent(){
        return getDriver().findElement(nextButton).isDisplayed();
    }

    //--Intermediate answers
    public void answerIntermediateQs(String data){
        String progressBar = getDriver().findElement(intermediateProgressBar).getText();
        print("Progress Bar: " + progressBar);
        print("checking this answer: " + data);
        getDriver().findElement(yourAnswerField).click();
        getDriver().findElement(yourAnswerField).sendKeys(data);
        getDriver().findElement(guessButton).click();
        getDriver().findElement(correctText).isDisplayed();
        print("'Correct!' text is displayed");
        getDriver().findElement(nextButton).click();
    }

    //--Latest answer - Fail
    public boolean verifyProgressBar14IsPresent(){
      //  WaitersPage.waitForElement(progressBar14);
        return getDriver().findElement(progressBar14).isDisplayed();
    }

    public void sendAnswerString14(){
        getDriver().findElement(yourAnswerField).sendKeys("Bird");
        print("Typed (Good) Answer: 'Lips'");
    }

    public boolean verifyIGiveUpButtonIsPresent(){
        return getDriver().findElement(iGiveUpButton).isDisplayed();
    }

    public void tapIGiveUpButton(){
        getDriver().findElement(iGiveUpButton).click();
        print("Tapped 'I Give Up!' button");
    }

    public boolean verifyHummingbirdTextIsPresent(){
        return getDriver().findElement(hummingBirdLatestAnswer).isDisplayed();
    }

    //--Results card
    public boolean verifyQuizTitleResultIsPresent(){
      //  WaitersPage.waitForElement(quizTitleResultsScreen);
        return getDriver().findElement(quizTitleResultsScreen).isDisplayed();
    }

    public boolean verifyResultsTextIsPresent(){
        return getDriver().findElement(resultsFinishCard).isDisplayed();
    }

    public boolean verifyDescriptionTextIsPresent(){
        return getDriver().findElement(descriptionFinishCard).isDisplayed();
    }

    //--Swipe
    public void swipeUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
      //  params.put("element", (getDriver().findElement(nextButton).getId()));
      //  js.executeScript("mobile: swipe", params);
    }
}

