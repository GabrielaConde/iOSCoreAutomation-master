package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizAnswersDataProvider;
import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import config.pages.WaitersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuizTriviaTests extends EditionsInit {

    //Search trivia

    public void init(){

    }

    @Test(dataProvider = "trivia", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchTriviaQuiz(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST TRIVIA QUIZ-------------------");
        testName("Search Trivia Quiz");
        trivia.completeSearch(data);

    }

    //First screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning() {

        testName("Verify Quiz Title is present");
        Assert.assertEquals(trivia.verifyTriviaTitle(), "How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");
        print("Verified Quiz title: 'How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out' text is present on First screen");

    }


    @Test(priority = 3)
    public void testSubTextIsPresent() {
        testName("Verify Sub-Text is present");
        Assert.assertTrue(trivia.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");

    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
        testName("Verify Author Info is present");
        Assert.assertTrue(trivia.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
    }

    @Test(priority = 5)
    public void testPlayWithFriendsButton() {
        testName("Verify Play With Friends Button is present");
        Assert.assertTrue(trivia.verifyPlayWithFriendsButtonIsPresent());
        print("Verified 'Play With Friends' button is present on First Screen");
    }

    @Test(priority = 6)
    public void testPlayNowButton() {
        testName("Verify Play button is present and tapping it");
        Assert.assertTrue(trivia.verifyPlayNowButtonIsPresent());
        print("Verified 'Play Now' button is present' on First screen");

        trivia.tapPlayNowButton();

    }

    //First answer
    @Test(priority = 7)
    public void testProgressBar1() {
        testName("Question 1 out of 14 -> Validations");
        trivia.verifyProgressBar1IsPresent();
        Assert.assertTrue(trivia.verifyProgressBar1IsPresent());
        print("Verified Progress Bar for the first Q is present: '1 of 14'");      //if it fails it's because of https://buzzfeed.atlassian.net/browse/IOS-8692

        }

    @Test(priority = 8)
    public void testSendFirstAnswer() {
        testName("Verify sending first answer - correct. Verify Guess button is present and tap-able");
        Assert.assertTrue(trivia.verifyYourAnswerFieldIsPresent());
        print("Verified 'Your answer' field is present");

        trivia.tapYourAnswerField();
        trivia.sendAnswerString1();

        Assert.assertTrue(trivia.verifyGuessButtonIsPresent());
        print("Verified 'Guess' button is present");

        trivia.tapGuessButton();

    }

    @Test(priority = 9)
    public void testCorrectTextIsPresent() {
        testName("Verify Correct text is present on partial results screen");
        Assert.assertTrue(trivia.verifyCorrectTextIsPresent());
        print("Verified 'Correct!' text is present on partial results screen");

    }

    @Test(priority = 10)
    public void testFirstAnswerTextIsPresent() {
        testName("Verify Answer text is present on partial results screen");
        Assert.assertTrue(trivia.verifylipsTextIsPresent());
        print("Verified 'lips!' text is present on partial results screen");
    }

    @Test(priority = 11)
    public void testNextButtonIsPresent() {
        testName("Verify Next button is present on partial results screen");
        Assert.assertTrue(trivia.verifyNextButtonIsPresent());
        print("Verified 'Next' text is present on partial results screen");
    }

    @Test(priority = 12)
    public void testTapNextButton() {
        testName("Verify tapping Next button");
        trivia.tapNextButton();
    }

    //Intermediate answers
    @Test(priority = 13, dataProvider = "QuizTriviaAnswers", dataProviderClass = QuizAnswersDataProvider.class)
    public void testIntermediateAnswers(String data) {
        testName("Verify completing the intermediate questions");
        trivia.answerIntermediateQs(data);
    }

    //Latest answer
    @Test(priority = 14)
    public void testProgressBar14() {
        testName("Question 14 out of 14 -> Validations");
        Assert.assertTrue(trivia.verifyProgressBar14IsPresent());
        print("Verified Progress Bar for the first Q is present: '14 of 14'");
    }

    @Test(priority = 15)
    public void testSendLatestAnswer() {
        testName("Verify sending last answer - wrong");
        trivia.tapYourAnswerField();
        trivia.sendAnswerString14();
        trivia.tapGuessButton();
    }

    @Test(priority = 16)
    public void testIGiveUpButtonIsPresent() {
        testName("Verify I Give Up! button is present");
        Assert.assertTrue(trivia.verifyIGiveUpButtonIsPresent());
        print("Verified 'I Give Up!' button is present");

    }

    @Test(priority = 17)
    public void testTapIGiveUpButton() {
        testName("Verify tapping I Give Up! button");
        trivia.tapIGiveUpButton();
    }

    @Test(priority = 18)
    public void testWrongTextIsPresent() {
        testName("Verify Wrong! text is present on partial results screen");
        Assert.assertTrue(trivia.verifyWrongTextIsPresent());
        print("Verified 'Wrong!' text is present on partial results screen");

    }

    @Test(priority = 19)
    public void testLatestAnswerTextIsPresent() {
        testName("Verify answer text is present on partial results screen");
        Assert.assertTrue(trivia.verifyHummingbirdTextIsPresent());
        print("Verified answer text is present on partial results screen");

        trivia.swipeUp();

    }

    @Test(priority = 20)
    public void testQuizTitleResultScreenIsPresent() {
        testName("Verify Quiz title is present on Results screen");
        Assert.assertTrue(trivia.verifyQuizTitleResultIsPresent());
        print("Verified Quiz title: 'How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out' text is present on Results screen");
    }

    @Test(priority = 21)
    public void testScoreTextResultScreenIsPresent() {
        testName("Verify score is present on Results screen");
        Assert.assertTrue(trivia.verifyScoreIsPresent());
        print("Verified Score text: '13 of 14 Correct' is present on Results screen");
    }

    @Test(priority = 22)
    public void testResultsTextIsPresent() {
        testName("Verify Results text is present on Results screen");
        Assert.assertTrue(trivia.verifyResultsTextIsPresent());
        print("Verified 'You're a Pictionary champ!' text is present on Results screen");
    }

    @Test(priority = 23)
    public void testResultsDescriptionTextIsPresent() {
        testName("Verify Results Description is present on Results screen");
        Assert.assertTrue(trivia.verifyDescriptionTextIsPresent());
        print("Verified 'You're great at this game and everyone always want you to be on their team!' text is present on Results screen");
    }

    //Results sub-tab
 //   @Test(priority = 24)                            //Failing: https://buzzfeed.atlassian.net/browse/IOS-8712
    public void testResultsSubTab() {
        testName("Verify the quiz is present on Results Sub-tab");
        Assert.assertEquals(trivia.verifyQuizOnResultsTriviaTab(), "How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out");
        print("Verified The quiz is present on Results Sub-Tab");
    }




}
