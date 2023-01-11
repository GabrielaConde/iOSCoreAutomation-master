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
    public void init(){
        testName("Disabling Dynamic Ads on Bpages");
        setup = new SettingsSetupPage();
        quizzesLatestSubTab.tapAllowButton();
        quizzesLatestSubTab.tapAllowButton();

    }

    //Search Quiz
    @Test(dataProvider = "checklist", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST CHECKLIST QUIZ-------------------");
        testName("Search personality Quiz");
        checklist.tapOnSearchIcon();
        checklist.completeSearch(data);

    }

    //First Screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning() {
        testName("Verify Quiz Title is present");
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
    public void testQuizTitleResultScreenIsPresent() {
        testName("Verify Quiz title on Results screen");
        Assert.assertTrue(checklist.verifyQuizTitleResultsIsPresent());
        print("Verified Quiz title is present on Results screen");
    }

    @Test(priority = 10)
    public void testYouCheckedTextResultIsPresent() {
        testName("Verify 'You checked...' text is present on Results screen");
        Assert.assertTrue(checklist.verifyYouCheckedIsPresent());
        print("'Verified You checked...' text is present on Results screen");
      //  checklist.tapBackButton();
   //     checklist.tapBackButtonFromSearch();
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

    }
}