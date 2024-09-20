package config.pages.quizzes.quizzesTypes;

import org.openqa.selenium.WebElement;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.WebElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizChecklistPage extends QuizzesTypesGeneralPage{

    //Catching elements:
    private final By subText = AppiumBy.accessibilityId("How much of a movie buff are you really?");
    private final By authorInfo = AppiumBy.accessibilityId("by Ellie Woodward, BuzzFeed Staff");
    private final By showMeMyResultsButton = AppiumBy.accessibilityId("Show me my results!");
    private final By quizTitleResultsScreen = AppiumBy.accessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
    private final By anyChecklistOption = By.xpath("//XCUIElementTypeButton[]");
    private final By fstChoice = By.xpath("//XCUIElementTypeButton[@name=\"The Wizard of Oz\"]");
    private final By sndChoice = By.xpath("//XCUIElementTypeButton[@name=\"Citizen Kane\"]");
    private final By trdChoice = By.xpath("//XCUIElementTypeButton[@name=\"Get Out\"]");
   // private final By anyChecklistOption = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton");
    private final By youCheckedText =  By.xpath("//*[contains(@name,'You checked')]");
  //  private final By youCheckedText = By.xpath("3 of 50 Correct");

    // Fallback elements




    //Methods
    //--First screen
    public boolean verifySubTextIsPresent(){
        return getDriver().findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return getDriver().findElement(authorInfo).isDisplayed();
    }

    public String verifyQuizOnResultsPersonalityTab(){
        //    tapBackButton();
        tapQuizzesTab();
        getDriver().findElement(resultsSubTab).click();
        tapOnQuizTitleOnResultsScreen();
      //  WaitersPage.waitForElement(completedQuizChecklist);
        String quizCompleted = getDriver().findElement(completedQuizChecklist).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    //--Tapping random options
    public List<String> listOfChoices() {
        List<WebElement> choices = getDriver().findElements(anyChecklistOption);
        List<String>  listOfChoices = new ArrayList<>();
        for(WebElement e : choices) {
            listOfChoices.add(e.getAttribute("name"));
            }
        print("List of Movies on Checklist Quiz: " + listOfChoices);
        return listOfChoices;

    }

    public void tapChecklistChoice() {
       /* List<WebElement> elements = getDriver().findElements(anyChecklistOption);
        Random random = new Random();
        int i;
        for(i=0; i<=4; i++) {
            int randomChoice = random.nextInt(elements.size());
            print("Random Choice Selected: " + randomChoice);
            elements.get(randomChoice).click();
        }*/
        getDriver().findElement(fstChoice).click();
        getDriver().findElement(sndChoice).click();
        getDriver().findElement(trdChoice).click();
    }

    //--Show me results
    public void tapShowMeMyResultsButton(){
        getDriver().findElement(showMeMyResultsButton).click();
        print("Tapped 'Show Me My Results!' button");
    }

    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return getDriver().findElement(quizTitleResultsScreen).isDisplayed();
    }

    public boolean verifyYouCheckedIsPresent() {
        return getDriver().findElement(youCheckedText).isDisplayed();
    }
}
