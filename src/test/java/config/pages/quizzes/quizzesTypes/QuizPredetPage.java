package config.pages.quizzes.quizzesTypes;

import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuizPredetPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By sndAnswer = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
    private final By answer = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[1]");
    private final By subText = AppiumBy.accessibilityId("A test as challenging as Thanos.");
    private final By authorInfo = AppiumBy.accessibilityId("by Christopher Hudspeth, BuzzFeed Staff");
    private final By completeQuizPredet = AppiumBy.accessibilityId("How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");

    private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
  //  private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage");
    private final By firstAnswer = AppiumBy.accessibilityId("Captain America");
    private final By secondWrongAnswer = AppiumBy.accessibilityId("Iron Man");
    private final By secondGoodAnswer = AppiumBy.accessibilityId("Spider-Man");
    private final By quizTitleResultsScreen = AppiumBy.accessibilityId("Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");
    private final By resultsDescription1 = AppiumBy.accessibilityId("Nicely Done!");
    private final By resultsDescription2 = AppiumBy.accessibilityId("This is quite a challenge but you held your own! Either you’re a pretty big Marvel fan or you’ve just got a knack for identifying things from the tiniest bit of visual aid. Much respect!");


    //Methods
    //--First screen
    public boolean verifySubTextIsPresent(){
        return getDriver().findElement(subText).isDisplayed();
    }
    public boolean verifyAuthorInfoIsPresent(){
        return getDriver().findElement(authorInfo).isDisplayed();
    }

    //--First answer - good
    public boolean verifyFirstAnswerIsPresent(){
        return getDriver().findElement(firstAnswer).isDisplayed();
    }

    public void tapAnswer(){getDriver().findElement(answer).click();}

    public void tapFirstAnswer(){
        getDriver().findElement(firstAnswer).click();
        print("Tapped first answer - good");
    }

    public void tapSndAnswer(){
        getDriver().findElement(sndAnswer).click();
        print("Tapped second answer - good");
    }

    //--Second answer - fail
    public boolean verifySecondWrongAnswerIsPresent(){
        return getDriver().findElement(secondWrongAnswer).isDisplayed();
    }

    public void tapSecondWrongAnswer(){
        getDriver().findElement(secondWrongAnswer).click();
        print("Tapped second answer - fail");
    }

    public boolean verifySecondGoodAnswerIsPresent(){
        return getDriver().findElement(secondGoodAnswer).isDisplayed();
    }

    //--Completing the quiz
    public void tapImageOnQ(){
        getDriver().findElement(imageQuestion).click();
        print("Tapped image on Q");
    }

    public void completingQuiz(String data){
      //  WaitersPage.waitForElement(imageQuestion);
      //  tapImageOnQ();
        getDriver().findElement(AppiumBy.accessibilityId(data)).click();
       // WaitersPage.waitForElement(nextButton);
        tapNextButton();
        print("Completing Quiz");
    }

    //--Results screen
    public boolean verifyQuizTitleResultIsPresent(){
        return getDriver().findElement(quizTitleResultsScreen).isDisplayed();
    }

    public String verifyPredetQuizOnResultsTriviaTab(){
        tapBackButton();
        tapQuizzesTab();
        getDriver().findElement(resultsSubTab).click();

        getDriver().findElement(triviaSubTab).click();   //It's not finding Trivia tab inside Results: https://buzzfeed.atlassian.net/browse/IOS-8712
      //  WaitersPage.waitForElement(completedQuiz);
        String quizCompleted = getDriver().findElement(completeQuizPredet).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    public boolean verifyResultDescription1IsPresent(){
        return getDriver().findElement(resultsDescription1).isDisplayed();
    }

    public boolean verifyResultDescription2IsPresent(){
        return getDriver().findElement(resultsDescription2).isDisplayed();
    }
}
