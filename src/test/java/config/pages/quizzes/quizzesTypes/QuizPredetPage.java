package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QuizPredetPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By sndAnswer = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
    private final By answer = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[1]");
    private final By subText = MobileBy.AccessibilityId("A test as challenging as Thanos.");
    private final By authorInfo = MobileBy.AccessibilityId("by Christopher Hudspeth, BuzzFeed Staff");
    private final By completeQuizPredet = MobileBy.AccessibilityId("How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");

    private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
  //  private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage");
    private final By firstAnswer = MobileBy.AccessibilityId("Captain America");
    private final By secondWrongAnswer = MobileBy.AccessibilityId("Iron Man");
    private final By secondGoodAnswer = MobileBy.AccessibilityId("Spider-Man");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");
    private final By resultsDescription1 = MobileBy.AccessibilityId("Nicely Done!");
    private final By resultsDescription2 = MobileBy.AccessibilityId("This is quite a challenge but you held your own! Either you’re a pretty big Marvel fan or you’ve just got a knack for identifying things from the tiniest bit of visual aid. Much respect!");


    //Methods
    //--First screen
    public boolean verifySubTextIsPresent(){
        return driver.findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return driver.findElement(authorInfo).isDisplayed();
    }

    //--First answer - good
    public boolean verifyFirstAnswerIsPresent(){
        return driver.findElement(firstAnswer).isDisplayed();
    }

    public void tapAnswer(){driver.findElement(answer).click();}

    public void tapFirstAnswer(){
        driver.findElement(firstAnswer).click();
        print("Tapped first answer - good");
    }

    public void tapSndAnswer(){
        driver.findElement(sndAnswer).click();
        print("Tapped second answer - good");
    }

    //--Second answer - fail
    public boolean verifySecondWrongAnswerIsPresent(){
        return driver.findElement(secondWrongAnswer).isDisplayed();
    }

    public void tapSecondWrongAnswer(){
        driver.findElement(secondWrongAnswer).click();
        print("Tapped second answer - fail");
    }

    public boolean verifySecondGoodAnswerIsPresent(){
        return driver.findElement(secondGoodAnswer).isDisplayed();
    }

    //--Completing the quiz
    public void tapImageOnQ(){
        driver.findElement(imageQuestion).click();
        print("Tapped image on Q");
    }

    public void completingQuiz(String data){
      //  WaitersPage.waitForElement(imageQuestion);
      //  tapImageOnQ();
        driver.findElement(MobileBy.AccessibilityId(data)).click();
        WaitersPage.waitForElement(nextButton);
        tapNextButton();
        print("Completing Quiz");
    }

    //--Results screen
    public boolean verifyQuizTitleResultIsPresent(){
        return driver.findElement(quizTitleResultsScreen).isDisplayed();
    }

    public String verifyPredetQuizOnResultsTriviaTab(){
        tapBackButton();
        tapQuizzesTab();
        driver.findElement(resultsSubTab).click();

        driver.findElement(triviaSubTab).click();   //It's not finding Trivia tab inside Results: https://buzzfeed.atlassian.net/browse/IOS-8712
        WaitersPage.waitForElement(completedQuiz);
        String quizCompleted = driver.findElement(completeQuizPredet).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    public boolean verifyResultDescription1IsPresent(){
        return driver.findElement(resultsDescription1).isDisplayed();
    }

    public boolean verifyResultDescription2IsPresent(){
        return driver.findElement(resultsDescription2).isDisplayed();
    }
}
