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

    private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
  //  private final By imageQuestion = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage");
    private final By firstAnswer = MobileBy.AccessibilityId("Captain America");
    private final By secondWrongAnswer = MobileBy.AccessibilityId("Iron Man");
    private final By secondGoodAnswer = MobileBy.AccessibilityId("Spider-Man");
    private final By quizTitleResultsScreen = MobileBy.AccessibilityId("Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");
    private final By resultsDescription1 = MobileBy.AccessibilityId("INCREDIBLE!");
    private final By resultsDescription2 = MobileBy.AccessibilityId("There are good performances and then there are great performances that are worthy of remembrance. Give yourself a round of applause because this test was no match for your Marvel knowledge and your extraordinary ability to identify characters with little to go off of. You’re a hero in your own right!");


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

    public boolean verifyResultDescription1IsPresent(){
        return driver.findElement(resultsDescription1).isDisplayed();
    }

    public boolean verifyResultDescription2IsPresent(){
        return driver.findElement(resultsDescription2).isDisplayed();
    }
}
