package testModules.quizzes.quizzesTypes;

import config.dataProvider.*;
import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class QuizPollTests extends EditionsInit {

    //Search poll
    @Test(dataProvider = "poll", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchPollQuiz(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST POLL QUIZ-------------------");
        testName("Search Poll Quiz");
        Thread.sleep(3000);
        pollQuiz.completeSearch(data);
    }

    @Test(priority = 2)
    public void testQuizTitleIsPresent()throws InterruptedException {
        testName("Verify Quiz Title is present");
        Thread.sleep(2000);
        Assert.assertTrue(pollQuiz.verifyPollQuizTitleIsPresent());
        print("Verified Quiz title is loading fine on Quiz");
    }

    @Test(priority = 3)
    public void testSubTextIsPresent() {
        testName("Verify Sub-Text is present");
        Assert.assertTrue(pollQuiz.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");
    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
        testName("Verify Author Info is present");
        Assert.assertTrue(pollQuiz.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
    }

    //First question - tap share vote
    @Test(priority = 5)
    public void testQuestionIsPresent() {
        testName("Verify First Question is present");
        Assert.assertTrue(pollQuiz.verifyQuestionIsPresent());
        print("Verified Question is present on first question");
    }

    @Test(priority = 6)
    public void testTapAnswerFirstQuestion() {
        testName("Verify choices are loading fine on first Q");
        Assert.assertTrue(pollQuiz.verifyFirstQChoiceIsPresent());
        print("Verified First choice is present on first question");
        pollQuiz.tapFirstQChoice();
    }

    @Test(priority = 7)
    public void testTapShareVoteButton() {
        testName("Verify Share button is present");
        pollQuiz.verifyShareVoteButtonIsPresent();
        print("Verified 'Share Your Vote' button is present");
        pollQuiz.tapShareVoteButton();
        pollQuiz.tapCloseButton();
    }


    //Second question - tap view results
    @Test(priority = 9)
    public void testTapViewResults() {
        testName("Verify View Results button is present and tap-able");
        pollQuiz.scroll1();
        print("Verified 'View Results' button is present");
        pollQuiz.tapViewResults();
    }

    @Test(priority = 10)
    public void testTapGoBackAndVote() throws InterruptedException{
        testName("Verify Go Back and Vote button is present");
        Thread.sleep(3000);
        pollQuiz.verifyGoBackAndVoteIsPresent();
        print("Verified 'Go Back and Vote' button is present");
        pollQuiz.tapGoBackAndVoteButton();
    }

    @Test(priority = 11)
    public void testTapAnswerSecondQuestion() {
        testName("Verify choices are loading on second Q");
        Assert.assertTrue(pollQuiz.verifySecondQChoiceIsPresent());
        print("Verified first choice on second question is present");
        pollQuiz.tapSecondQChoice();
        pollQuiz.tapBackButton();
    }

}
