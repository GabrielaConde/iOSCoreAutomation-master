package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuizPersonalityTests extends EditionsInit {

    //Search Quiz
    @Test(dataProvider = "personality", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST PERSONALITY QUIZ-------------------");
        testName("Search Personality Quiz");
        personality.tapOnSearchIcon();
        personality.completeSearch(data);
    }

    //First screen
   // @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning() {
        testName("Verify Quiz Title is present");
        Assert.assertEquals(personality.verifyQuizTitleIsPresent(), "Pick A Bunch Of Kittens And We'll Guess Your Life Goal");
        print("Verified Quiz title: 'Pick A Bunch Of Kittens And We'll Guess Your Life Goal");
    }

   // @Test(priority = 2)
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

    @Test(priority = 5)
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
    public void testQuizTitleResultScreenIsPresent() {
        testName("Verify Quiz title on Results screen");
        Assert.assertTrue(personality.verifyQuizTitleResultsIsPresent());
        print("Verified Quiz title is present on Results screen");
    }

    @Test(priority = 20)
    public void testDescriptionsResultScreenArePresent() {
        testName("Verify Descriptions of the obtained result are present on Results screen");
        Assert.assertTrue(personality.verifyDescriptionResult1IsPresent());

        Assert.assertTrue(personality.verifyDescriptionResults2IsPresent());
        print("Verified Personality and description are present on Results screen");
    }

    @Test(priority = 21)
    public void verifyRetakeQuiz()
    {
        personality.tapOnRetaqueQuiz();
        Assert.assertTrue(personality.validatePlayNowButtonIsPresent());
    }

    @Test(priority = 22)
    public void verifyPrevButton(){
        personality.tapPlayNowButton();
        personality.tapAnyChoice();
        personality.tapOnPrevBtn();
        Assert.assertEquals(personality.progressBar(), "1 of 6");
        personality.tapBackButton();

    }

    //Results sub-tab
    @Test(priority = 23)
    public void testResultsSubTab() throws InterruptedException {
        personality.tapQuizzesTab();
        testName("Verify the quiz is present on Results Sub-tab");
        Thread.sleep(3000);
        Assert.assertEquals(personality.verifyQuizOnResultsPersonalityTab(),"Pick A Bunch Of Kittens And We'll Guess Your Life Goal" );
        print("Verified the quiz is present on Results Sub-Tab");
    }
}
