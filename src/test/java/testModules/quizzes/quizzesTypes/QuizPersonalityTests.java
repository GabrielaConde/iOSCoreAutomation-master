package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuizPersonalityTests extends EditionsInit {
    protected SettingsSetupPage setup;

    @BeforeClass
    public void init()throws InterruptedException{
        testName("Disabling Dynamic Ads on Bpages");
        setup = new SettingsSetupPage();
        quizzesLatestSubTab.tapAllowButton();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapAllowButton();
        Thread.sleep(2000);
        quizzesLatestSubTab.setUSEdition();
        Thread.sleep(3000);
     //   quizzesLatestSubTab.tapOnAcceptAllCookiesBtn();
     //   Thread.sleep(2000);
    }

    //Search Quiz
    @Test(dataProvider = "personality", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST PERSONALITY QUIZ-------------------");
        testName("Search Personality Quiz");
        personality.tapOnSearchIcon();
        personality.completeSearch(data);
    }

    //First screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning()throws InterruptedException {
        testName("Verify Quiz Title is present");
        Thread.sleep(3000);
        Assert.assertEquals(personality.verifyQuizTitleIsPresent(), "Pick A Bunch Of Kittens And We'll Guess Your Life Goal");
        print("Verified Quiz title: 'Pick A Bunch Of Kittens And We'll Guess Your Life Goal");
    }

    @Test(priority = 2)
    public void testMainImageIsPresent() {
        testName("Verify Main Image is Present");
        Assert.assertTrue(personality.verifyMainImageIsPresent());
        print("Verified Main Image is present on First screen");
    }

    @Test(priority = 3)
    public void testSubTextIsPresent() {
        testName("Verify Sub-Text is present");
        Assert.assertTrue(personality.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");
    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
        testName("Verify Author Info is present");
        Assert.assertTrue(personality.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
    }

  //  @Test(priority = 5)
    public void testPlayWithFriendsButtonIsPresent() {
        testName("Verify Play With Friends Button is present");
        Assert.assertTrue(personality.verifyPlayWithFriendsButtonIsPresent());
        print("Verified 'Play With Friends' button is present on First Screen");
    }

    @Test(priority = 6)
    public void testPlayNowButton() {
        testName("Verify Play button is present and tapping it");
        Assert.assertTrue(personality.verifyPlayNowButtonIsPresent());
        print("Verified 'Play Now' button is present' on First screen");
        personality.tapPlayNowButton();
    }

    //Completing the quiz
    @Test(priority = 7)
    public void testQuestion1Countdown() {
        testName("Question 1 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "1 of 6");       //if it fails it's because of https://buzzfeed.atlassian.net/browse/IOS-8692
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 8)
    public void testQuestion1() {
        testName("Question 1 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    @Test(priority = 9)
    public void testQuestion2Countdown() {
        testName("Question 2 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "2 of 6");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 10)
    public void testQuestion2() {
        testName("Question 2 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    @Test(priority = 11)
    public void testQuestion3Countdown() {
        testName("Question 3 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "3 of 6");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 12)
    public void testQuestion3() {
        testName("Question 3 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    @Test(priority = 13)
    public void testQuestion4Countdown() {
        testName("Question 4 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "4 of 6");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 14)
    public void testQuestion4() {
        testName("Question 4 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    @Test(priority = 15)
    public void testQuestion5Countdown() {
        testName("Question 5 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "5 of 6");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 16)
    public void testQuestion5() {
        testName("Question 5 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    @Test(priority = 17)
    public void testQuestion6Countdown() {
        testName("Question 6 out of 6 -> Validations. Then tapping a choice");
        Assert.assertEquals(personality.progressBar(), "6 of 6");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 18)
    public void testQuestion6() {
        testName("Question 6 out of 6 -> Validations. Then tapping a choice");
        personality.tapAnyChoice();
    }

    //Last screen
    @Test(priority = 19)
    public void testQuizTitleResultScreenIsPresent()throws InterruptedException {
        testName("Verify Quiz title on Results screen");
        Thread.sleep(3000);
        Assert.assertTrue(personality.verifyQuizTitleResultsIsPresent());
        print("Verified Quiz title is present on Results screen");
    }

    @Test(priority = 21)
    public void verifyRetakeQuiz()throws InterruptedException
    {
        Thread.sleep(3000);
        personality.tapOnRetaqueQuiz();
        Assert.assertTrue(personality.validatePlayNowButtonIsPresent());
    }

    @Test(priority = 22)
    public void verifyPrevButton()throws InterruptedException{
        Thread.sleep(3000);
        personality.tapPlayNowButton();
        personality.tapAnyChoice();
        personality.tapOnPrevBtn();
        Assert.assertEquals(personality.progressBar(), "1 of 6");
        personality.tapBackButton();
    }

    //Results sub-tab
  //  @Test(priority = 23)
    public void testResultsSubTab() throws InterruptedException {
        personality.tapQuizzesTab();
        testName("Verify the quiz is present on Results Sub-tab");
        Thread.sleep(3000);
        personality.verifyQuizOnResultsPersonalityTab();
        print("Verified the quiz is present on Results Sub-Tab");
        personality.tapBackButton();
    }
}
