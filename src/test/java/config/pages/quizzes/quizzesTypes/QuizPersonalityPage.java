package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuizPersonalityPage extends QuizzesTypesGeneralPage{

    //Catching elements:
    private final By subText = AppiumBy.accessibilityId("Make your own kitten army.");
    private final By authorInfo = AppiumBy.accessibilityId("by Joanna Borns, BuzzFeed Staff");
    private final By quizTitleResultsScreen = AppiumBy.accessibilityId("Pick A Bunch Of Kittens And We'll Guess Your Life Goal");

    private final By PrevBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Prev\"]");

    private final By completedQuizPersonality = By.xpath("//XCUIElementTypeStaticText[@name=\"Pick A Bunch Of Kittens And We'll Guess Your Life Goal\"]");


    //Methods
    //--First scren
    public boolean verifySubTextIsPresent(){
        return getDriver().findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return getDriver().findElement(authorInfo).isDisplayed();
    }
    public void tapOnPlayBtn() {getDriver().findElement(PrevBtn).click();}


    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return getDriver().findElement(quizTitleResultsScreen).isDisplayed();
    }

    public void tapOnPrevBtn() {getDriver().findElement(PrevBtn).click();}

    public String verifyQuizOnResultsPersonalityTab(){

        getDriver().findElement(resultsSubTab).click();
   //     tapOnQuizTitleOnResultsScreen();
      //  WaitersPage.waitForElement(completedQuizPersonality);
        String quizCompleted = getDriver().findElement(completedQuizPersonality).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }
}
