package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizAnswersDataProvider;
import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuizPredetTests extends EditionsInit {

    //Search quiz
    @Test(dataProvider = "predetermined", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchPredetQuiz(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST PREDETERMINED QUIZ-------------------");
        testName("Search Predetermined Quiz");
        predetermined.completeSearch(data);
    }

    //First screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning() throws InterruptedException{
        testName("Verify Quiz Title is present");
        Thread.sleep(3000);
        Assert.assertEquals(predetermined.verifyQuizTitleIsPresent(), "Try To Guess The \"Avengers: Infinity War\" Character By The Simple Drawing");
        print("Verified Quiz title: 'Try To Guess The 'Avengers: Infinity War' Character By The Simple Drawing");
    }

    @Test(priority = 2)
    public void testMainImageIsPresent() {
        testName("Verify Main Image is Present");
        Assert.assertTrue(predetermined.verifyMainImageIsPresent());
        print("Verified Main Image is present on First screen");
    }

    @Test(priority = 3)
    public void testSubTextIsPresent() {
        testName("Verify Sub-Text is present");
        Assert.assertTrue(predetermined.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");
    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
        testName("Verify Author Info is present");
        Assert.assertTrue(predetermined.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
    }

    @Test(priority = 5)
    public void testPlayWithFriendsButton() {
        testName("Verify Play With Friends Button is present");
        Assert.assertTrue(predetermined.verifyPlayWithFriendsButtonIsPresent());
        print("Verified 'Play With Friends' button is present on First Screen");
    }

    @Test(priority = 6)
    public void testPlayNowButton() {
        testName("Verify Play button is present and tapping it");
        Assert.assertTrue(predetermined.verifyPlayNowButtonIsPresent());
        print("Verified 'Play Now' button is present' on First screen");
        predetermined.tapPlayNowButton();
    }

    //First answer - good
    @Test(priority = 7)
    public void testProgressBarFirstQ() {
    testName("Verify Question 1 out of 14 -> Validations");
        Assert.assertEquals(predetermined.progressBar(), "1 of 14");     //if it fails it's because of https://buzzfeed.atlassian.net/browse/IOS-8692
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 8)
    public void testSendFirstAnswer() {
        testName("Verify send the first good answer");
        Assert.assertTrue(predetermined.verifyFirstAnswerIsPresent());
        print("Verified first answer is present on screen");
        predetermined.tapFirstAnswer();
    }

    @Test(priority = 9)
    public void testCorrectTextIsPresent() {
        testName("Verify 'Correct!' text is present on results");
        Assert.assertTrue(predetermined.verifyCorrectTextIsPresent());
        print("Verified 'Correct!' text is present");
    }

    @Test(priority = 10)
    public void testFirstAnswerTextIsPresent() {
        testName("Verify 'Captain America' text is present on results");
        Assert.assertTrue(predetermined.verifyFirstAnswerIsPresent());
        print("Verified 'Captain America!' text is present");
    }

    @Test(priority = 11)
    public void testNextButtonGoodAnswerIsPresent() {
        testName("Verify 'Next' button is present on results");
        Assert.assertTrue(predetermined.verifyNextButtonIsPresent());
        print("Verified 'Next' text is present");
    }

    @Test(priority = 12)
    public void testTapNextGoodAnswerButton() {
        testName("Verify tapping Next button");
        predetermined.tapNextButton();
        print("Verified 'Next' button is working fine");
    }

    //Second answer - fail
    @Test(priority = 13)
    public void testProgressBarSecondQ() {
        testName("Verify Question 2 out of 14 -> Validations");
        Assert.assertEquals(predetermined.progressBar(), "2 of 14");
        print("Verified Progress Bar is present and correct");
    }

    @Test(priority = 14)
    public void testSendSecondAnswer() {
        testName("Verify send the second wrong answer");
        Assert.assertTrue(predetermined.verifySecondWrongAnswerIsPresent());
        print("Verified Second wrong answer is present on screen");

        predetermined.tapSecondWrongAnswer();
    }

    @Test(priority = 15)
    public void testWrongTextIsPresent() {
        testName("Verify 'Wrong!' text is present on results");
        Assert.assertTrue(predetermined.verifyWrongTextIsPresent());
        print("Verified 'Wrong!' text is present");
    }

    @Test(priority = 16)
    public void testSecondAnswerTextIsPresent() {
        testName("Verify 'Spider-Man' text is present on results");
        Assert.assertTrue(predetermined.verifySecondGoodAnswerIsPresent());
        print("Verified 'Spider-Man!' text is present");
    }

    @Test(priority = 17)
    public void testNextButtonWrongAnswerIsPresent() {
        testName("Verify 'Next' button is present on results");
        Assert.assertTrue(predetermined.verifyNextButtonIsPresent());
        print("Verified 'Next' text is present");
    }

    @Test(priority = 18)
    public void testTapNextWrongAnswerButton() {
        testName("Verify tapping Next button");
        predetermined.tapNextButton();
        print("Verified 'Next' button is working fine");
    }

    //Completing the quiz
    @Test(priority = 19, dataProvider = "QuizPredetAnswers", dataProviderClass = QuizAnswersDataProvider.class)

    public void testCompletingQuiz(String data) throws InterruptedException {
            testName("Verify completing the rest of the Quiz answers");
            Thread.sleep(2000);
            predetermined.completingQuiz(data);

    }

    //Results screen
    @Test(priority = 20)
    public void testQuizTitleResultScreenIsPresent() throws InterruptedException {
        testName("Verify Quiz title on Results screen");
        Thread.sleep(4000);
       predetermined.verifyQuizTitleResultIsPresent();
        print("Verified Quiz title is present on Results screen");
     //   predetermined.tapBackButton();
    }

    @Test(priority = 21)
    public void testScoreResultScreenIsPresent()throws InterruptedException {
        testName("Verify Score on Results screen");
        Thread.sleep(3000);
        Assert.assertTrue(predetermined.verifyScoreIsPresent());
        predetermined.tapBackButton();
        print("Verified Score is present on Results screen");
    }

}
