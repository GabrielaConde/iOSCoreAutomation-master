package config.pages.quizzes.quizzesTypes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class QuizPollPage extends QuizzesTypesGeneralPage {

    //Catching elements
    private final By categoryDateInfo = AppiumBy.accessibilityId("Animals • Jul 25, 2018");
    private final By quizTitle = AppiumBy.iOSNsPredicateString("value == 'Do You Prefer Puppies Or Food?'");
    private final By subText = AppiumBy.accessibilityId("To clarify–we're not eating the puppies.");
    private final By authorInfo = AppiumBy.accessibilityId("by Joanna Borns, BuzzFeed Staff");
    private final By question = AppiumBy.accessibilityId("Which one of these would you rather have right now?");
    private final By firstQChoice = AppiumBy.accessibilityId("macaroni and cheese");
    private final By shareVoteButton = AppiumBy.accessibilityId("Share your vote");
    private final By viewResultsButton = AppiumBy.accessibilityId("VIEW RESULTS");
    private final By goBackAndVoteButton = By.xpath("//XCUIElementTypeStaticText[@name=\"GO BACK AND VOTE\"]");

    //private final By goBackAndVoteButton = AppiumBy.accessibilityId("GO BACK AND VOTE");
    private final By secondQChoice = AppiumBy.accessibilityId("grilled cheese");
    private final By readCommentsButton = AppiumBy.accessibilityId("Read Comments");


    //Methods
    //--First screen
    public boolean verifyCategoryDateInfoIsPresent(){
            return getDriver().findElement(categoryDateInfo).isDisplayed();
    }

    public boolean verifyPollQuizTitleIsPresent(){
        return getDriver().findElement(quizTitle).isDisplayed();
    }

    public boolean verifySubTextIsPresent(){
        return getDriver().findElement(subText).isDisplayed();
    }

    public boolean verifyAuthorInfoIsPresent(){
        return getDriver().findElement(authorInfo).isDisplayed();
    }

    //--First question + share your vote
    public boolean verifyQuestionIsPresent(){
        return getDriver().findElement(question).isDisplayed();
    }

    public boolean verifyFirstQChoiceIsPresent(){
        return getDriver().findElement(firstQChoice).isDisplayed();
    }

    public void tapFirstQChoice (){
        getDriver().findElement(firstQChoice).click();
        print("Tapped first choice on first question");
    }

    public boolean verifyShareVoteButtonIsPresent(){
        return getDriver().findElement(shareVoteButton).isDisplayed();
    }

    public void tapShareVoteButton(){
        getDriver().findElement(shareVoteButton).click();
        print("Tapped 'Share Your Vote' button");
    }

    //--Second question + view results
    public void scroll1(){
        scroll.scrollDown();
      /*  Dimension size = getDriver().manage().window().getSize();
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.70);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        TouchAction action = new TouchAction(getDriver());
        action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(startx, endy)).release().perform();*/
    }

    public boolean verifyViewResultsIsPresent(){
        return getDriver().findElement(viewResultsButton).isDisplayed();
    }

    public void tapViewResults(){
        getDriver().findElement(viewResultsButton).click();
        print("Tapped 'View Results' button'");
    }

    public boolean verifyGoBackAndVoteIsPresent(){
        return getDriver().findElement(goBackAndVoteButton).isDisplayed();
    }

    public void tapGoBackAndVoteButton(){
        getDriver().findElement(goBackAndVoteButton).click();
        print("Tapped 'Go Back and Vote' button'");
    }

    public boolean verifySecondQChoiceIsPresent(){
        return getDriver().findElement(secondQChoice).isDisplayed();
    }

    public void tapSecondQChoice(){
        getDriver().findElement(secondQChoice).click();
        print("Tapped first choice on second question");
    }

    //--Read comments
    public boolean verifyReadCommentsIsPresent(){
        scroll.scrollUntilElement(readCommentsButton);
        return getDriver().findElement(readCommentsButton).isDisplayed();
    }

    public void tapReadComments(){
        getDriver().findElement(readCommentsButton).click();
        print("Tapped 'Read Comments' button");
    }
}
