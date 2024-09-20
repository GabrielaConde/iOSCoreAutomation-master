package config.pages.quizzes;

import org.openqa.selenium.WebElement;
import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.WebElement;
import org.openqa.selenium.By;

public class QuizzesLatestPage extends CommonPage {

    //Catching elements
    private final By quizPartyHeader = AppiumBy.accessibilityId("\t\n" + "\uD83D\uDCA5 QUIZ PACKS \uD83D\uDCA5");
    private final By quizPacksHeader = AppiumBy.accessibilityId("\uD83D\uDCA5QUIZ PACKS\uD83D\uDCA5");

    // TABS
    private final By matchups = AppiumBy.accessibilityId("Matchups");
    private final By trending = AppiumBy.accessibilityId("Trending");
    private final By results = AppiumBy.accessibilityId("Results");
    private final By food = AppiumBy.accessibilityId("Food");
    private final By trivia = AppiumBy.accessibilityId("Trivia");
    private final By more = AppiumBy.accessibilityId("More");
    private final By canWeGuess = AppiumBy.accessibilityId("Can We Guess?");
    private final By disney = AppiumBy.accessibilityId("Disney");
    private final By whoAreYou = AppiumBy.accessibilityId("Who Are You?");
    private final By love = AppiumBy.accessibilityId("Love");


    //Methods
    public void tapOnMatchups() {getDriver().findElement(matchups).click();}
    public void tapOnTrending() {getDriver().findElement(trending).click();}
    public void tapOnResults() {getDriver().findElement(results).click();}
    public void tapOnFood() {getDriver().findElement(food).click();}
    public void tapOnTrivia() {getDriver().findElement(trivia).click();}
    public void tapOnMore() {getDriver().findElement(more).click();}
    public void tapOnCanWeGuess() {getDriver().findElement(canWeGuess).click();}
    public void tapOnDisney() {getDriver().findElement(disney).click();}
    public void tapOnWhoAreYou() {getDriver().findElement(whoAreYou).click();}
    public void tapOnLove() {getDriver().findElement(love).click();}


    //--Go to Quizzes
    public boolean quizzesTabIsPresent(){
        return getDriver().findElement(quizzesTab).isDisplayed();
    }

    //--1) Quiz Party package
    public void tapItemsQuizPartyPackage(){
        int x=1;
        for (WebElement e : getDriver().findElements(itemsPackage)) {
            e.click();
          //  WaitersPage.waitForElement(backButton);
            tapBackButton();
            print("Tapped item: " + x  + " from 'Throw Quiz Party' Package");
            x++;
        }
        print("Tapped all items from 'Throw Quiz Party' package");
    }

    public Boolean quizPartyHeaderIsPresent(){
        return getDriver().findElement(quizPartyHeader).isDisplayed();
    }

    //--2) Quiz Packs package
    public void tapItemsQuizPacks(){
        int x=1;
        for (WebElement e : getDriver().findElements(itemsPackage)) {
            e.click();
            scroll.scrollDown();
            tapBackButton();
            print("Tapped item: " + x  + " from 'Quiz Packs' Package");
            x++;
        }
        print("Tapped all items from 'Quiz Packs' package");
    }

    public Boolean quizPacksHeaderIsPresent(){
        return getDriver().findElement(quizPacksHeader).isDisplayed();
    }
}
