package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QuizPersonalityPage extends QuizzesTypesGeneralPage{

    //Catching elements:
    private final By subText = MobileBy.AccessibilityId("Make your own kitten army.");
    private final By authorInfo = MobileBy.AccessibilityId("by Joanna Borns, BuzzFeed Staff");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("Pick A Bunch Of Kittens And We'll Guess Your Life Goal");

    private final By PrevBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Prev\"]");

    private final By completedQuizPersonality = By.xpath("//XCUIElementTypeStaticText[@name=\"Pick A Bunch Of Kittens And We'll Guess Your Life Goal\"]");


    //Methods
    //--First scren
    public boolean verifySubTextIsPresent(){
        return driver.findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return driver.findElement(authorInfo).isDisplayed();
    }
    public void tapOnPlayBtn() {driver.findElement(PrevBtn).click();}


    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return driver.findElement(quizTitleResultsScreen).isDisplayed();
    }

    public void tapOnPrevBtn() {driver.findElement(PrevBtn).click();}

    public String verifyQuizOnResultsPersonalityTab(){

        driver.findElement(resultsSubTab).click();
   //     tapOnQuizTitleOnResultsScreen();
        WaitersPage.waitForElement(completedQuizPersonality);
        String quizCompleted = driver.findElement(completedQuizPersonality).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }
}
