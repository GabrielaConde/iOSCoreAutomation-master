package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuizChecklistTests extends EditionsInit {

    protected SettingsSetupPage setup;

    @BeforeClass
    public void init()throws InterruptedException{
        testName("Disabling Dynamic Ads on Bpages");
        setup = new SettingsSetupPage();
        quizzesLatestSubTab.tapAllowButton();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnAcceptAllCookiesBtn();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapAllowButton();

    }

    //Search Quiz
    @Test(dataProvider = "checklist", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST CHECKLIST QUIZ-------------------");
        Thread.sleep(3000);
        testName("Search personality Quiz");
        checklist.tapOnSearchIcon();
        checklist.completeSearch(data);

    }

    //First Screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning()throws InterruptedException {
        testName("Verify Quiz Title is present");
        Thread.sleep(3000);
        Assert.assertEquals(checklist.verifyQuizTitleIsPresent(), "How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
        print("Verified Quiz title: 'How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");

    }

    @Test(priority = 2)
    public void testMainImageIsPresent() {
        testName("Verify Main Image is Present");
        Assert.assertTrue(checklist.verifyMainImageIsPresent());
        print("Verified Main Image is present on First screen");

    }

    @Test(priority = 3)
    public void testSubTextIsPresent() {
        testName("Verify Sub-Text is present");
        Assert.assertTrue(checklist.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");
    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
        testName("Verify Author Info is present");
        Assert.assertTrue(checklist.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
    }

    @Test(priority = 5)
    public void testPlayNowButton() {
        testName("Verify Play button is present and tapping it");
        Assert.assertTrue(checklist.verifyPlayNowButtonIsPresent());
        print("Verified 'Play Now' button is present' on First screen");
        checklist.tapPlayNowButton();
    }

    //Completing the Quiz
    @Test(priority = 6)
    public void testChoicesAreLoading() {
        testName("Verify Movie Choices are loading fine");
        Assert.assertNotNull(checklist.listOfChoices());
        print("Verified Movie Choices are loading fine");

    }

    @Test(priority = 7)
    public void testTapChecklistChoice() {
        testName("Verify tapping choices");
        checklist.tapChecklistChoice();
    }

    @Test(priority = 8)
    public void testTapShowMeResults() {
        testName("Verify tapping Show Me Results! button");
        checklist.tapShowMeMyResultsButton();
    }

    //Results Screen
    @Test(priority = 9)
    public void testQuizTitleResultScreenIsPresent() throws InterruptedException {
        testName("Verify Quiz title on Results screen");
        Thread.sleep(4000);
        Assert.assertTrue(checklist.verifyQuizTitleResultsIsPresent());
        print("Verified Quiz title is present on Results screen");
    }

    @Test(priority = 10)
    public void testYouCheckedTextResultIsPresent() throws InterruptedException {
        testName("Verify 'You checked...' text is present on Results screen");
        Thread.sleep(2000);
        Assert.assertTrue(checklist.verifyYouCheckedIsPresent());
        print("'Verified You checked...' text is present on Results screen");
    }

    @Test(priority = 11)
     public void verifyRetakeQuiz()
     {
        checklist.tapOnRetaqueQuiz();
        Assert.assertTrue(checklist.validatePlayNowButtonIsPresent());
        checklist.tapBackButton();
     }


    //Results sub-tab
    @Test(priority = 12)
    public void testResultsSubTab() {
        checklist.tapQuizzesTab();
        testName("Verify the quiz is present on Results Sub-tab");
        Assert.assertEquals(checklist.verifyQuizOnResultsPersonalityTab(),"How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?");
        print("Verified the quiz is present on Results Sub-Tab");
        checklist.tapQuizzesBack();
    }
}