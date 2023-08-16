package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizChecklistPage extends QuizzesTypesGeneralPage{

    //Catching elements:
    private final By subText = MobileBy.AccessibilityId("How much of a movie buff are you really?");
    private final By authorInfo = MobileBy.AccessibilityId("by Ellie Woodward, BuzzFeed Staff");
    private final By showMeMyResultsButton = MobileBy.AccessibilityId("Show me my results!");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
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
        return driver.findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return driver.findElement(authorInfo).isDisplayed();
    }

    public String verifyQuizOnResultsPersonalityTab(){
        //    tapBackButton();
        tapQuizzesTab();
        driver.findElement(resultsSubTab).click();
        tapOnQuizTitleOnResultsScreen();
        WaitersPage.waitForElement(completedQuizChecklist);
        String quizCompleted = driver.findElement(completedQuizChecklist).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    //--Tapping random options
    public List<String> listOfChoices() {
        List<MobileElement> choices = driver.findElements(anyChecklistOption);
        List<String>  listOfChoices = new ArrayList<>();
        for(MobileElement e : choices) {
            listOfChoices.add(e.getAttribute("name"));
            }
        print("List of Movies on Checklist Quiz: " + listOfChoices);
        return listOfChoices;

    }

    public void tapChecklistChoice() {
       /* List<MobileElement> elements = driver.findElements(anyChecklistOption);
        Random random = new Random();
        int i;
        for(i=0; i<=4; i++) {
            int randomChoice = random.nextInt(elements.size());
            print("Random Choice Selected: " + randomChoice);
            elements.get(randomChoice).click();
        }*/
        driver.findElement(fstChoice).click();
        driver.findElement(sndChoice).click();
        driver.findElement(trdChoice).click();
    }

    //--Show me results
    public void tapShowMeMyResultsButton(){
        driver.findElement(showMeMyResultsButton).click();
        print("Tapped 'Show Me My Results!' button");
    }

    //--Results screen
    public boolean verifyQuizTitleResultsIsPresent() {
        return driver.findElement(quizTitleResultsScreen).isDisplayed();
    }

    public boolean verifyYouCheckedIsPresent() {
        return driver.findElement(youCheckedText).isDisplayed();
    }
}
