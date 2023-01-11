package config.pages.quizzes;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class QuizzesLatestPage extends CommonPage {

    //Catching elements
    private final By quizPartyHeader = MobileBy.AccessibilityId("\t\n" + "\uD83D\uDCA5 QUIZ PACKS \uD83D\uDCA5");
    private final By quizPacksHeader = MobileBy.AccessibilityId("\uD83D\uDCA5QUIZ PACKS\uD83D\uDCA5");

    // TABS
    private final By matchups = MobileBy.AccessibilityId("Matchups");
    private final By trending = MobileBy.AccessibilityId("Trending");
    private final By results = MobileBy.AccessibilityId("Results");
    private final By food = MobileBy.AccessibilityId("Food");
    private final By trivia = MobileBy.AccessibilityId("Trivia");
    private final By more = MobileBy.AccessibilityId("More");
    private final By canWeGuess = MobileBy.AccessibilityId("Can We Guess?");
    private final By disney = MobileBy.AccessibilityId("Disney");
    private final By whoAreYou = MobileBy.AccessibilityId("Who Are You?");
    private final By love = MobileBy.AccessibilityId("Love");


    //Methods
    public void tapOnMatchups() {driver.findElement(matchups).click();}
    public void tapOnTrending() {driver.findElement(trending).click();}
    public void tapOnResults() {driver.findElement(results).click();}
    public void tapOnFood() {driver.findElement(food).click();}
    public void tapOnTrivia() {driver.findElement(trivia).click();}
    public void tapOnMore() {driver.findElement(more).click();}
    public void tapOnCanWeGuess() {driver.findElement(canWeGuess).click();}
    public void tapOnDisney() {driver.findElement(disney).click();}
    public void tapOnWhoAreYou() {driver.findElement(whoAreYou).click();}
    public void tapOnLove() {driver.findElement(love).click();}


    //--Go to Quizzes
    public boolean quizzesTabIsPresent(){
        return driver.findElement(quizzesTab).isDisplayed();
    }

    //--1) Quiz Party package
    public void tapItemsQuizPartyPackage(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            WaitersPage.waitForElement(backButton);
            tapBackButton();
            print("Tapped item: " + x  + " from 'Throw Quiz Party' Package");
            x++;
        }
        print("Tapped all items from 'Throw Quiz Party' package");
    }

    public Boolean quizPartyHeaderIsPresent(){
        return driver.findElement(quizPartyHeader).isDisplayed();
    }

    //--2) Quiz Packs package
    public void tapItemsQuizPacks(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            scroll.scrollDown();
            tapBackButton();
            print("Tapped item: " + x  + " from 'Quiz Packs' Package");
            x++;
        }
        print("Tapped all items from 'Quiz Packs' package");
    }

    public Boolean quizPacksHeaderIsPresent(){
        return driver.findElement(quizPacksHeader).isDisplayed();
    }
}
