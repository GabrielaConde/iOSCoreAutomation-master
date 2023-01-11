package config.pages.quizzes.quizzesTypes;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class QuizPollPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By categoryDateInfo = MobileBy.AccessibilityId("Animals • Jul 25, 2018");
    private final By quizTitle = MobileBy.iOSNsPredicateString("value == 'Do You Prefer Puppies Or Food?'");
    private final By subText = MobileBy.AccessibilityId("To clarify–we're not eating the puppies.");
    private final By authorInfo = MobileBy.AccessibilityId("by Joanna Borns, BuzzFeed Staff");
    private final By question = MobileBy.AccessibilityId("Which one of these would you rather have right now?");
    private final By firstQChoice = MobileBy.AccessibilityId("macaroni and cheese");
    private final By shareVoteButton = MobileBy.AccessibilityId("Share your vote");
    private final By viewResultsButton = MobileBy.AccessibilityId("VIEW RESULTS");
    private final By goBackAndVoteButton = By.xpath("//XCUIElementTypeStaticText[@name=\"GO BACK AND VOTE\"]");

    //private final By goBackAndVoteButton = MobileBy.AccessibilityId("GO BACK AND VOTE");
    private final By secondQChoice = MobileBy.AccessibilityId("grilled cheese");
    private final By readCommentsButton = MobileBy.AccessibilityId("Read Comments");


    //Methods
    //--First screen
    public boolean verifyCategoryDateInfoIsPresent(){
            return driver.findElement(categoryDateInfo).isDisplayed();
    }

    public boolean verifyPollQuizTitleIsPresent(){
        return driver.findElement(quizTitle).isDisplayed();
    }

    public boolean verifySubTextIsPresent(){
        return driver.findElement(subText).isDisplayed();
    }

    public boolean verifyAuthorInfoIsPresent(){
        return driver.findElement(authorInfo).isDisplayed();
    }

    //--First question + share your vote
    public boolean verifyQuestionIsPresent(){
        return driver.findElement(question).isDisplayed();
    }

    public boolean verifyFirstQChoiceIsPresent(){
        return driver.findElement(firstQChoice).isDisplayed();
    }

    public void tapFirstQChoice (){
        driver.findElement(firstQChoice).click();
        print("Tapped first choice on first question");
    }

    public boolean verifyShareVoteButtonIsPresent(){
        return driver.findElement(shareVoteButton).isDisplayed();
    }

    public void tapShareVoteButton(){
        driver.findElement(shareVoteButton).click();
        print("Tapped 'Share Your Vote' button");
    }

    //--Second question + view results
    public void scroll1(){
        scroll.scrollDown();
      /*  Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.70);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(startx, endy)).release().perform();*/
    }

    public boolean verifyViewResultsIsPresent(){
        return driver.findElement(viewResultsButton).isDisplayed();
    }

    public void tapViewResults(){
        driver.findElement(viewResultsButton).click();
        print("Tapped 'View Results' button'");
    }

    public boolean verifyGoBackAndVoteIsPresent(){
        return driver.findElement(goBackAndVoteButton).isDisplayed();
    }

    public void tapGoBackAndVoteButton(){
        driver.findElement(goBackAndVoteButton).click();
        print("Tapped 'Go Back and Vote' button'");
    }

    public boolean verifySecondQChoiceIsPresent(){
        return driver.findElement(secondQChoice).isDisplayed();
    }

    public void tapSecondQChoice(){
        driver.findElement(secondQChoice).click();
        print("Tapped first choice on second question");
    }

    //--Read comments
    public boolean verifyReadCommentsIsPresent(){
        scroll.scrollUntilElement(readCommentsButton);
        return driver.findElement(readCommentsButton).isDisplayed();
    }

    public void tapReadComments(){
        driver.findElement(readCommentsButton).click();
        print("Tapped 'Read Comments' button");
    }
}
