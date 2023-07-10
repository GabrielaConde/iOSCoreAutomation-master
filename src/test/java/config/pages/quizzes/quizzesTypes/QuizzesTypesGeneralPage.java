package config.pages.quizzes.quizzesTypes;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class QuizzesTypesGeneralPage extends CommonPage {

    //Catching elements
    //--Completed Sub-tab

    protected final By completedQuizChecklist = MobileBy.AccessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
   // protected final By completedQuiz = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeCell[@name=\"personality-quiz-saved-result\"]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
    protected final By completedQuiz = MobileBy.AccessibilityId("Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");

    protected final By retakeQuiz = By.xpath("//XCUIElementTypeButton[@name=\"Retake Quiz\"]");


    //--First screen
    protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
 //   protected final By mainImage = By.xpath("//XCUIElementTypeImage[@name=\"This quiz starts off easy and gets harder as you go. Type in what you think each drawing is. Good luck!\"]");
 //   protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
//    protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");
   // protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");

    protected final By quizTitleOnResutlsScreen = MobileBy.AccessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");

    protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
 //   protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//    protected final By quizTitle= By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
 //   protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
   // protected final By quizTitle= By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
    protected final By playNowButton = MobileBy.AccessibilityId("Play Now");
    protected final By playWithFriendsButton = By.xpath("//XCUIElementTypeButton[@name='Play with friends']");

    //--Answers
    protected final By progressBar = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
  //  protected final By progressBar = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
    protected final By option0 = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[2]");
    protected final By option1 = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]/XCUIElementTypeStaticText[2]");
    protected final By option2 = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[3]/XCUIElementTypeStaticText[2]");
    protected final By option3 = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[4]/XCUIElementTypeStaticText[2]");
   // protected final By anyChoice = By.xpath("//XCUIElementTypeOther[@name='BUZZ_PAGE']/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton");
 //   protected final By InstantAnyChoice = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]")


    protected final By InstantAnyChoice = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
 //   protected final By InstantAnyChoice = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
  //  protected final By InstantAnyChoice = By.xpath("///XCUIElementTypeOther[`name == \"BUZZ_PAGE\"`]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[2]");
    protected final By nextButton = MobileBy.AccessibilityId("Next");
    protected final By correctText = MobileBy.AccessibilityId("Correct!");
    protected final By wrongText = MobileBy.AccessibilityId("Wrong!");
    protected final By option = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[1]");


    // ASYNC QUIZZES ELEMENTS
    //ELEMENTS FROM INVITE SCREEN
    protected final By quizMatchUpsTitle = MobileBy.AccessibilityId("Quiz Matchups");
    protected final By choosePicsTextLbl = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    protected final By inviteFriendBtn = By.xpath("//XCUIElementTypeButton[@name=\"Invite Friend\"]");
    protected final By quizMatchuptsCloseBtn = MobileBy.AccessibilityId("Close");
    protected final By imageQuizMatchup = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By playPersonalityMatchupsText = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Play personality quiz matchups with friends anywhere, anytime!\"]");
    protected final By signInToPlayBtn = MobileBy.AccessibilityId("Sign In to play");
    protected final By signInToPlayMatchupScreen = MobileBy.AccessibilityId("Sign in to play");

    //ELEMENTS FROM MATCHUPS SCREEN
    protected final By closeBtn = MobileBy.AccessibilityId("Close");
  //  protected final By closeBtn = By.xpath("//XCUIElementTypeButton[@name=\"Close\"]"):
    protected final By matchupsTab = MobileBy.AccessibilityId("Matchups");
    protected final By userImageMatchupScreen = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-profile\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]");
    protected final By QuizzesLblMatchupScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Quizzes\"]");
    protected final By QuizRoomsLblMatchupScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Quiz Rooms\"]");
    protected final By userNameMatchupsScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Gabby\"]");
    protected final By friendImageMatchupScreen = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-room\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
    protected final By dateLblMatchupScreen = By.xpath("//*[contains(@name,'2022')]");
    protected final By sheetGraber = MobileBy.AccessibilityId("Sheet Grabber");
    protected final By sendButton = By.xpath("//XCUIElementTypeButton[@name=\"Send\"]");
    protected final By sentLbl = By.xpath("//XCUIElementTypeButton[@name=\"Sent\"]");
    protected final By room = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-room\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
    protected final By upNextImage = By.xpath("//XCUIElementTypeOther[@name=\"quizzes_game_room\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage");
    protected final By playQuizMatchupBtn = MobileBy.AccessibilityId("Play quiz matchup");
    protected final By trash = MobileBy.AccessibilityId("trash");
    protected final By UpNext = MobileBy.AccessibilityId("Up Next");
    protected final By confirmDeleteRoom = MobileBy.AccessibilityId("Delete game progress");
    protected final By backRoomBtn = MobileBy.AccessibilityId("Back");


    //Results screen
    protected final By imageResultScreen = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    protected final By description1Result = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]/XCUIElementTypeTextView");
    protected final By description2Result = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]/XCUIElementTypeTextView");
    protected final By scoreFinishCard = MobileBy.AccessibilityId("8 of 14 Correct");
    protected final By scoreFinishCardTrivia= MobileBy.AccessibilityId("13 of 14 Correct");
    protected final By resultsSubTab = MobileBy.AccessibilityId("Results");
    protected final By triviaSubTab = MobileBy.AccessibilityId("Trivia");
    protected final By progressInfo = By.xpath("//*[contains(@name,'of')]");
  //  protected final By progressBarInfo = By.xpath("//XCUIElementTypeStaticText[@name='1 of 5']");

    // ASYNC QUIZZES METHODS
    //MATCHUP HALF INVITE SCREEN
    public Boolean validateQuizMatchUpInviteTitleIsDisplayed(){ return driver.findElement(quizMatchUpsTitle).isDisplayed();}
    public Boolean validateChoosePicsTestLblInviteScreen() {return driver.findElement(choosePicsTextLbl).isDisplayed();}
    public Boolean validateImageQuizMatchupInviteScreenIsDisplayed() {return driver.findElement(imageQuizMatchup).isDisplayed();}
    public Boolean validatePlayPersonalityInviteScreenText() {return driver.findElement(playPersonalityMatchupsText).isDisplayed();}
    public void clickInviteFriendBtn() { driver.findElement(inviteFriendBtn).click();}
    public void setQuizMatchuptsInviteScreenCloseBtn() { driver.findElement(quizMatchuptsCloseBtn).click();}
    public void clickOnSendBtn() {driver.findElement(sendButton).click();}
    public Boolean validateSendLblIsDisplayed(){return driver.findElement(sentLbl).isDisplayed();}
    public void signInToPlay() {driver.findElement(signInToPlayBtn).click();}



    //QUIZ MATCHUP SCREEN METHODS
    public void backFromRooms(){driver.findElement(backRoomBtn).click();}
    public void closeMatchUps(){driver.findElement(closeBtn).click();}
    public void clickOnMatchupsTab(){driver.findElement(matchupsTab).click();}
    public void signInToPlayMatchups(){driver.findElement(signInToPlayMatchupScreen).click();}
    public void tapOnRoom(){driver.findElement(room).click();}
    public void clickOnRoomImage() {driver.findElement(upNextImage).click();}
    public void playQUizMatchup(){driver.findElement(playQuizMatchupBtn).click();}
    public void clickOnTrash(){driver.findElement(trash).click();}
    public void clickOnUPNext() {driver.findElement(UpNext).click();}
    public void confirmRoomDelete(){driver.findElement(confirmDeleteRoom).click();}


    //Methods
    //--First Screen
    public void tapOnQuizTitleOnResultsScreen() {driver.findElement(quizTitleOnResutlsScreen).click();}
    public String getQuizOnResultsScreen() {return driver.findElement(quizTitleOnResutlsScreen).getText();}
    public void tapOption() {driver.findElement(option).click();}

    public boolean verifyMainImageIsPresent(){
        return driver.findElement(mainImage).isDisplayed();
    }

    public String verifyQuizTitleIsPresent(){
        String quizTitleValue = driver.findElement(quizTitle).getAttribute("value");
     //   String quizTitleValue = driver.findElement(quizTitle).getA
        print(quizTitleValue);
        return quizTitleValue;
    }

    public void tapOnRetaqueQuiz(){
        driver.findElement(retakeQuiz).click();}

    public Boolean validatePlayNowButtonIsPresent(){ return driver.findElement(playNowButton).isDisplayed();}


    public void tapPlayNowButton(){
        driver.findElement(playNowButton).click();
        print("Tapped 'Play Now' button");
    }

    public boolean verifyPlayNowButtonIsPresent(){
        return driver.findElement(playNowButton).isDisplayed();
    }

    public boolean verifyPlayWithFriendsButtonIsPresent(){
        return driver.findElement(playWithFriendsButton).isDisplayed();
    }

    //--Answers
    public String progressBar(){
        String progressBarInfo = driver.findElement(progressInfo).getText();
        print("Question Number: " + progressBarInfo);
        return progressBarInfo;
    }

    public void tapAnyChoice() {
      /*  String choice0 = driver.findElement(option0).getText();
        String choice1 = driver.findElement(option1).getText();
        String choice2 = driver.findElement(option2).getText();
        String choice3 = driver.findElement(option3).getText();
        print("Choices: " +
                "Choice 0: " + choice0 + " / " +
                "Choice 1: " + choice1 + " / " +
                "Choice 2: " + choice2 + " / " +
                "Choice 3: " + choice3);*/
       /* List<MobileElement> elements = driver.findElements(anyChoice);
        Random random = new Random();
        int randomChoice = random.nextInt(elements.size());
        print("Random Choice Selected: " + randomChoice);
        elements.get(randomChoice).click();*/
        driver.findElement(InstantAnyChoice).click();
    }

    public boolean verifyCorrectTextIsPresent(){
        WaitersPage.waitForElement(correctText);
        return driver.findElement(correctText).isDisplayed();
    }

    public boolean verifyWrongTextIsPresent(){
        WaitersPage.waitForElement(wrongText);
        return driver.findElement(wrongText).isDisplayed();
    }

    public boolean verifyNextButtonIsPresent(){
        return driver.findElement(nextButton).isDisplayed();
    }

    public void tapNextButton(){
        driver.findElement(nextButton).click();
        print("Tapped 'Next' button");
    }

    //--Results screen
    public boolean verifyResultImageIsPresent(){
        return driver.findElement(imageResultScreen).isDisplayed();
    }

    public boolean verifyScoreIsPresent(){
        return driver.findElement(scoreFinishCard).isDisplayed();
    }

    public boolean verifyScoreTriviaIsPresent(){
        return driver.findElement(scoreFinishCardTrivia).isDisplayed();
    }

    public Boolean verifyDescriptionResult1IsPresent() {
        String result = driver.findElement(description1Result).getText();
        print("Result: " + result);
        return driver.findElement(description1Result).isDisplayed();
    }

    public Boolean verifyDescriptionResults2IsPresent() {
        String desCountryResults = driver.findElement(description2Result).getText();
        print("Description on Results screen: " + desCountryResults);
        return driver.findElement(description2Result).isDisplayed();
    }

    //--Verify Results tab
    public void swipeToResultsTab() {
        for (int i = 0; i < 6; i++) {
            scroll.swipeRight();
        }
    }

    public String verifyQuizOnResultsPersonalityTab(){
    //    tapBackButton();
        tapQuizzesTab();
        driver.findElement(resultsSubTab).click();

        WaitersPage.waitForElement(completedQuizChecklist);
        String quizCompleted = driver.findElement(completedQuizChecklist).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    public String verifyQuizOnResultsTriviaTab()throws InterruptedException{
        tapBackButton();
        tapQuizzesTab();
        driver.findElement(resultsSubTab).click();
        Thread.sleep(4000);
        driver.findElement(triviaSubTab).click();   //It's not finding Trivia tab inside Results: https://buzzfeed.atlassian.net/browse/IOS-8712
        WaitersPage.waitForElement(completedQuiz);
        String quizCompleted = driver.findElement(completedQuiz).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }
}
