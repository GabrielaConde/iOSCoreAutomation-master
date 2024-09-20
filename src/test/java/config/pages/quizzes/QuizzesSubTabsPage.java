package config.pages.quizzes;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuizzesSubTabsPage extends CommonPage {

    //Catching elements

    private final By trendingSubTab = AppiumBy.accessibilityId("Trending");
    private final By triviaSubTab = AppiumBy.accessibilityId("Trivia");
    private final By matchups = AppiumBy.accessibilityId("Matchups");
    private final By foodSubTab = AppiumBy.accessibilityId("Food");
    private final By resultsSubTab = AppiumBy.accessibilityId("Results");
    private final By disneySubTab = AppiumBy.accessibilityId("Disney");
    private final By whoAreYouSubTab = AppiumBy.accessibilityId("Who Are You?");
    private final By loveSubTab = AppiumBy.accessibilityId("Love");
    private final By more = AppiumBy.accessibilityId("More");


    private final By celebrity = AppiumBy.accessibilityId("Celebrity");
    private final By canWeGuessSubTab = AppiumBy.accessibilityId("Can We Guess?");
    private final By aiquizzes = AppiumBy.accessibilityId("AI Quizzes");

    //New categories on foreign editions

    private final By polls  = AppiumBy.accessibilityId("Polls");
    private final By TaylorSwift  = AppiumBy.accessibilityId("Taylor Swift");
    private final By Marvel  = AppiumBy.accessibilityId("Marvel");
    private final By Zodiac  = AppiumBy.accessibilityId("Zodiac");
    private final By HarryPotter  = AppiumBy.accessibilityId("Harry Potter");
    private final By Anime  = AppiumBy.accessibilityId("Anime");
    private final By Kpop  = AppiumBy.accessibilityId("Kpop");
    private final By Geography  = AppiumBy.accessibilityId("Geography");
    private final By Checklist  = AppiumBy.accessibilityId("Checklist");



    //Methods

    public void tapOnAIQuizzes() {getDriver().findElement(aiquizzes).click();}
    public void tapOnTrending(){getDriver().findElement(trendingSubTab).click();}
    public void tapOnCanWeGuess(){getDriver().findElement(canWeGuessSubTab).click();}
    public void tapOnDisney(){getDriver().findElement(disneySubTab).click();}
    public void tapOnFood(){getDriver().findElement(foodSubTab).click();}
    public void tapOnWhoAreYou(){getDriver().findElement(whoAreYouSubTab).click();}
    public void tapOnLove(){getDriver().findElement(loveSubTab).click();}
    public void tapOnTrivia(){getDriver().findElement(triviaSubTab).click();}
    public void tapOnMore(){getDriver().findElement(more).click();}
        public void tapOnResults() {getDriver().findElement(resultsSubTab).click();}
        public void tapOnMatchups() {getDriver().findElement(matchups).click();}

    public void tapOnPolls() {getDriver().findElement(polls).click();}
    public void tapOnTaylorSwift() {getDriver().findElement(TaylorSwift).click();}
    public void tapOnMarvel() {getDriver().findElement(Marvel).click();}
    public void tapOnZodiac() {getDriver().findElement(Zodiac).click();}
    public void tapOnHarryPotter() {getDriver().findElement(HarryPotter).click();}
    public void tapOnAnime() {getDriver().findElement(Anime).click();}
    public void tapOnKpop() {getDriver().findElement(Kpop).click();}
    public void tapOnGeographys() {getDriver().findElement(Geography).click();}
    public void tapOnChecklist() {getDriver().findElement(Checklist).click();}


    //--Tabs Name - Active
    public Boolean canWeGuessTabIsPresent(){
        return getDriver().findElement(canWeGuessSubTab).isDisplayed();
    }

    public String canWeGuessTabIsActive(){
        String value = getDriver().findElement(canWeGuessSubTab).getAttribute("value");
        return value;
    }

    public Boolean disneyIsPresent(){
        return getDriver().findElement(disneySubTab).isDisplayed();
    }

    public String disneyIsActive(){
        String value = getDriver().findElement(disneySubTab).getAttribute("value");
        return value;
    }

    public Boolean foodTabIsPresent(){
        return getDriver().findElement(foodSubTab).isDisplayed();
    }

    public String foodTabIsActive(){
        String value = getDriver().findElement(foodSubTab).getAttribute("value");
        return value;
    }

    public Boolean whoAreYouTabIsPresent(){
        return getDriver().findElement(whoAreYouSubTab).isDisplayed();
    }

    public String whoAreYouTabIsActive(){
        String value = getDriver().findElement(whoAreYouSubTab).getAttribute("value");
        return value;
    }

    public Boolean loveTabIsPresent(){
        return getDriver().findElement(loveSubTab).isDisplayed();
    }

    public String loveTabIsActive(){
        String value = getDriver().findElement(loveSubTab).getAttribute("value");
        return value;
    }

    public Boolean triviaTabIsPresent(){
        return getDriver().findElement(triviaSubTab).isDisplayed();
    }

    public String triviaTabIsActive(){
        String value = getDriver().findElement(triviaSubTab).getAttribute("value");
        return value;
    }
}
