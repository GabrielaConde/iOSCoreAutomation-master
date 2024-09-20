package config.pages.quizzes.quizzesTypes;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class QuizzesTypesGeneralPage extends CommonPage {

    //Catching elements
    //--Completed Sub-tab

    protected final By completedQuizChecklist = AppiumBy.accessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
   // protected final By completedQuiz = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeCell[@name=\"personality-quiz-saved-result\"]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
    protected final By completedQuiz = AppiumBy.accessibilityId("Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");

    protected final By retakeQuiz = By.xpath("//XCUIElementTypeButton[@name=\"Retake Quiz\"]");


    //--First screen
    protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
 //   protected final By mainImage = By.xpath("//XCUIElementTypeImage[@name=\"This quiz starts off easy and gets harder as you go. Type in what you think each drawing is. Good luck!\"]");
 //   protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
//    protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");
   // protected final By mainImage = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");

    protected final By quizTitleOnResutlsScreen = AppiumBy.accessibilityId("How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");

    protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
 //   protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
//    protected final By quizTitle= By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
 //   protected final By quizTitle = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
   // protected final By quizTitle= By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
    protected final By playNowButton = AppiumBy.accessibilityId("Play Now");
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
    protected final By nextButton = AppiumBy.accessibilityId("Next");
    protected final By correctText = AppiumBy.accessibilityId("Correct!");
    protected final By wrongText = AppiumBy.accessibilityId("Wrong!");
    protected final By option = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeButton[1]");


    // ASYNC QUIZZES ELEMENTS
    //ELEMENTS FROM INVITE SCREEN
    protected final By quizMatchUpsTitle = AppiumBy.accessibilityId("Quiz Matchups");
    protected final By choosePicsTextLbl = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    protected final By inviteFriendBtn = By.xpath("//XCUIElementTypeButton[@name=\"Invite Friend\"]");
    protected final By quizMatchuptsCloseBtn = AppiumBy.accessibilityId("Close");
    protected final By imageQuizMatchup = AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By playPersonalityMatchupsText = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Play personality quiz matchups with friends anywhere, anytime!\"]");
    protected final By signInToPlayBtn = AppiumBy.accessibilityId("Sign In to play");
    protected final By signInToPlayMatchupScreen = AppiumBy.accessibilityId("Sign in to play");

    //ELEMENTS FROM MATCHUPS SCREEN
    protected final By closeBtn = AppiumBy.accessibilityId("Close");
  //  protected final By closeBtn = By.xpath("//XCUIElementTypeButton[@name=\"Close\"]"):
    protected final By matchupsTab = AppiumBy.accessibilityId("Matchups");
    protected final By userImageMatchupScreen = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-profile\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]");
    protected final By QuizzesLblMatchupScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Quizzes\"]");
    protected final By QuizRoomsLblMatchupScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Quiz Rooms\"]");
    protected final By userNameMatchupsScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Gabby\"]");
    protected final By friendImageMatchupScreen = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-room\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
    protected final By dateLblMatchupScreen = By.xpath("//*[contains(@name,'2022')]");
    protected final By sheetGraber = AppiumBy.accessibilityId("Sheet Grabber");
    protected final By sendButton = By.xpath("//XCUIElementTypeButton[@name=\"Send\"]");
    protected final By sentLbl = By.xpath("//XCUIElementTypeButton[@name=\"Sent\"]");
    protected final By room = By.xpath("//XCUIElementTypeCell[@name=\"quiz-hub-room\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
    protected final By upNextImage = By.xpath("//XCUIElementTypeOther[@name=\"quizzes_game_room\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage");
    protected final By playQuizMatchupBtn = AppiumBy.accessibilityId("Play quiz matchup");
    protected final By trash = AppiumBy.accessibilityId("trash");
    protected final By UpNext = AppiumBy.accessibilityId("Up Next");
    protected final By confirmDeleteRoom = AppiumBy.accessibilityId("Delete game progress");
    protected final By backRoomBtn = AppiumBy.accessibilityId("Back");


    //Results screen
    protected final By imageResultScreen = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    protected final By description1Result = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]/XCUIElementTypeTextView");
    protected final By description2Result = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]/XCUIElementTypeTextView");
    protected final By scoreFinishCard = AppiumBy.accessibilityId("8 of 14 Correct");
    protected final By scoreFinishCardTrivia= AppiumBy.accessibilityId("13 of 14 Correct");
    protected final By resultsSubTab = AppiumBy.accessibilityId("Results");
    protected final By triviaSubTab = AppiumBy.accessibilityId("Trivia");
    protected final By progressInfo = By.xpath("//*[contains(@name,'of')]");
  //  protected final By progressBarInfo = By.xpath("//XCUIElementTypeStaticText[@name='1 of 5']");

    // ASYNC QUIZZES METHODS
    //MATCHUP HALF INVITE SCREEN
    public Boolean validateQuizMatchUpInviteTitleIsDisplayed(){ return getDriver().findElement(quizMatchUpsTitle).isDisplayed();}
    public Boolean validateChoosePicsTestLblInviteScreen() {return getDriver().findElement(choosePicsTextLbl).isDisplayed();}
    public Boolean validateImageQuizMatchupInviteScreenIsDisplayed() {return getDriver().findElement(imageQuizMatchup).isDisplayed();}
    public Boolean validatePlayPersonalityInviteScreenText() {return getDriver().findElement(playPersonalityMatchupsText).isDisplayed();}
    public void clickInviteFriendBtn() { getDriver().findElement(inviteFriendBtn).click();}
    public void setQuizMatchuptsInviteScreenCloseBtn() { getDriver().findElement(quizMatchuptsCloseBtn).click();}
    public void clickOnSendBtn() {getDriver().findElement(sendButton).click();}
    public Boolean validateSendLblIsDisplayed(){return getDriver().findElement(sentLbl).isDisplayed();}
    public void signInToPlay() {getDriver().findElement(signInToPlayBtn).click();}



    //QUIZ MATCHUP SCREEN METHODS
    public void backFromRooms(){getDriver().findElement(backRoomBtn).click();}
    public void closeMatchUps(){getDriver().findElement(closeBtn).click();}
    public void clickOnMatchupsTab(){getDriver().findElement(matchupsTab).click();}
    public void signInToPlayMatchups(){getDriver().findElement(signInToPlayMatchupScreen).click();}
    public void tapOnRoom(){getDriver().findElement(room).click();}
    public void clickOnRoomImage() {getDriver().findElement(upNextImage).click();}
    public void playQUizMatchup(){getDriver().findElement(playQuizMatchupBtn).click();}
    public void clickOnTrash(){getDriver().findElement(trash).click();}
    public void clickOnUPNext() {getDriver().findElement(UpNext).click();}
    public void confirmRoomDelete(){getDriver().findElement(confirmDeleteRoom).click();}


    //Methods
    //--First Screen
    public void tapOnQuizTitleOnResultsScreen() {getDriver().findElement(quizTitleOnResutlsScreen).click();}
    public String getQuizOnResultsScreen() {return getDriver().findElement(quizTitleOnResutlsScreen).getText();}
    public void tapOption() {getDriver().findElement(option).click();}

    public boolean verifyMainImageIsPresent(){
        return getDriver().findElement(mainImage).isDisplayed();
    }

    public String verifyQuizTitleIsPresent(){
        String quizTitleValue = getDriver().findElement(quizTitle).getAttribute("value");
     //   String quizTitleValue = getDriver().findElement(quizTitle).getA
        print(quizTitleValue);
        return quizTitleValue;
    }

    public void tapOnRetaqueQuiz(){
        getDriver().findElement(retakeQuiz).click();}

    public Boolean validatePlayNowButtonIsPresent(){ return getDriver().findElement(playNowButton).isDisplayed();}


    public void tapPlayNowButton(){
        getDriver().findElement(playNowButton).click();
        print("Tapped 'Play Now' button");
    }

    public boolean verifyPlayNowButtonIsPresent(){
        return getDriver().findElement(playNowButton).isDisplayed();
    }

    public boolean verifyPlayWithFriendsButtonIsPresent(){
        return getDriver().findElement(playWithFriendsButton).isDisplayed();
    }

    //--Answers
    public String progressBar(){
        String progressBarInfo = getDriver().findElement(progressInfo).getText();
        print("Question Number: " + progressBarInfo);
        return progressBarInfo;
    }

    public void tapAnyChoice() {
      /*  String choice0 = getDriver().findElement(option0).getText();
        String choice1 = getDriver().findElement(option1).getText();
        String choice2 = getDriver().findElement(option2).getText();
        String choice3 = getDriver().findElement(option3).getText();
        print("Choices: " +
                "Choice 0: " + choice0 + " / " +
                "Choice 1: " + choice1 + " / " +
                "Choice 2: " + choice2 + " / " +
                "Choice 3: " + choice3);*/
       /* List<MobileElement> elements = getDriver().findElements(anyChoice);
        Random random = new Random();
        int randomChoice = random.nextInt(elements.size());
        print("Random Choice Selected: " + randomChoice);
        elements.get(randomChoice).click();*/
        getDriver().findElement(InstantAnyChoice).click();
    }

    public boolean verifyCorrectTextIsPresent(){
      //  WaitersPage.waitForElement(correctText);
        return getDriver().findElement(correctText).isDisplayed();
    }

    public boolean verifyWrongTextIsPresent(){
     //   WaitersPage.waitForElement(wrongText);
        return getDriver().findElement(wrongText).isDisplayed();
    }

    public boolean verifyNextButtonIsPresent(){
        return getDriver().findElement(nextButton).isDisplayed();
    }

    public void tapNextButton(){
        getDriver().findElement(nextButton).click();
        print("Tapped 'Next' button");
    }

    //--Results screen
    public boolean verifyResultImageIsPresent(){
        return getDriver().findElement(imageResultScreen).isDisplayed();
    }

    public boolean verifyScoreIsPresent(){
        return getDriver().findElement(scoreFinishCard).isDisplayed();
    }

    public boolean verifyScoreTriviaIsPresent(){
        return getDriver().findElement(scoreFinishCardTrivia).isDisplayed();
    }

    public Boolean verifyDescriptionResult1IsPresent() {
        String result = getDriver().findElement(description1Result).getText();
        print("Result: " + result);
        return getDriver().findElement(description1Result).isDisplayed();
    }

    public Boolean verifyDescriptionResults2IsPresent() {
        String desCountryResults = getDriver().findElement(description2Result).getText();
        print("Description on Results screen: " + desCountryResults);
        return getDriver().findElement(description2Result).isDisplayed();
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
        getDriver().findElement(resultsSubTab).click();

      //  WaitersPage.waitForElement(completedQuizChecklist);
        String quizCompleted = getDriver().findElement(completedQuizChecklist).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }

    public String verifyQuizOnResultsTriviaTab()throws InterruptedException{
        tapBackButton();
        tapQuizzesTab();
        getDriver().findElement(resultsSubTab).click();
        Thread.sleep(4000);
        getDriver().findElement(triviaSubTab).click();   //It's not finding Trivia tab inside Results: https://buzzfeed.atlassian.net/browse/IOS-8712
       // WaitersPage.waitForElement(completedQuiz);
        String quizCompleted = getDriver().findElement(completedQuiz).getAttribute("name");
        print("First Quiz on Results sub-tab: " + quizCompleted);
        return quizCompleted;
    }
}
