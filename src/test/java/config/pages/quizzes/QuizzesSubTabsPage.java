package config.pages.quizzes;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QuizzesSubTabsPage extends CommonPage {

    //Catching elements

    private final By trendingSubTab = MobileBy.AccessibilityId("Trending");
    private final By triviaSubTab = MobileBy.AccessibilityId("Trivia");
    private final By matchups = MobileBy.AccessibilityId("Matchups");
    private final By foodSubTab = MobileBy.AccessibilityId("Food");
    private final By resultsSubTab = MobileBy.AccessibilityId("Results");
    private final By disneySubTab = MobileBy.AccessibilityId("Disney");
    private final By whoAreYouSubTab = MobileBy.AccessibilityId("Who Are You?");
    private final By loveSubTab = MobileBy.AccessibilityId("Love");
    private final By more = MobileBy.AccessibilityId("More");


    private final By celebrity = MobileBy.AccessibilityId("Celebrity");
    private final By canWeGuessSubTab = MobileBy.AccessibilityId("Can We Guess?");


    //Methods

    public void tapOnTrending(){driver.findElement(trendingSubTab).click();}
    public void tapOnCanWeGuess(){driver.findElement(canWeGuessSubTab).click();}
    public void tapOnDisney(){driver.findElement(disneySubTab).click();}
    public void tapOnFood(){driver.findElement(foodSubTab).click();}
    public void tapOnWhoAreYou(){driver.findElement(whoAreYouSubTab).click();}
    public void tapOnLove(){driver.findElement(loveSubTab).click();}
    public void tapOnTrivia(){driver.findElement(triviaSubTab).click();}
    public void tapOnMore(){driver.findElement(more).click();}
        public void tapOnResults() {driver.findElement(resultsSubTab).click();}
        public void tapOnMatchups() {driver.findElement(matchups).click();}


    //--Tabs Name - Active
    public Boolean canWeGuessTabIsPresent(){
        return driver.findElement(canWeGuessSubTab).isDisplayed();
    }

    public String canWeGuessTabIsActive(){
        String value = driver.findElement(canWeGuessSubTab).getAttribute("value");
        return value;
    }

    public Boolean disneyIsPresent(){
        return driver.findElement(disneySubTab).isDisplayed();
    }

    public String disneyIsActive(){
        String value = driver.findElement(disneySubTab).getAttribute("value");
        return value;
    }

    public Boolean foodTabIsPresent(){
        return driver.findElement(foodSubTab).isDisplayed();
    }

    public String foodTabIsActive(){
        String value = driver.findElement(foodSubTab).getAttribute("value");
        return value;
    }

    public Boolean whoAreYouTabIsPresent(){
        return driver.findElement(whoAreYouSubTab).isDisplayed();
    }

    public String whoAreYouTabIsActive(){
        String value = driver.findElement(whoAreYouSubTab).getAttribute("value");
        return value;
    }

    public Boolean loveTabIsPresent(){
        return driver.findElement(loveSubTab).isDisplayed();
    }

    public String loveTabIsActive(){
        String value = driver.findElement(loveSubTab).getAttribute("value");
        return value;
    }

    public Boolean triviaTabIsPresent(){
        return driver.findElement(triviaSubTab).isDisplayed();
    }

    public String triviaTabIsActive(){
        String value = driver.findElement(triviaSubTab).getAttribute("value");
        return value;
    }
}
