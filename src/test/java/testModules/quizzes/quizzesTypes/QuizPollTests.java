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
        pollQuiz.completeSearch(data);
    }

    @Test(priority = 1)
    public void testCategoryDateIsPresent() {
        testName("Verify Category & Date are present on the top of the quiz ");
        Assert.assertTrue(pollQuiz.verifyCategoryDateInfoIsPresent());
        print("Verified Category & Date are present at top of the Quiz");
    }

    @Test(priority = 2)
    public void testQuizTitleIsPresent() {
        testName("Verify Quiz Title is present");
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
        Assert.assertTrue(pollQuiz.verifyShareVoteButtonIsPresent());
        print("Verified 'Share Your Vote' button is present");
        pollQuiz.tapShareVoteButton();
    }

    @Test(priority = 8)
    public void testTapCopyLinkAndToast() {
        testName("Verify Copy Link is present on Share sheet");
        Assert.assertTrue(pollQuiz.verifyCopyLinkbuttonIsPresent());
        print("Verified 'Copy Link' button is present on share sheet");
        pollQuiz.tapCopyLink();

        Assert.assertTrue(pollQuiz.verifyLinkCopiedToastIsPresent());
        System.out.print("'Link Copied' toast is present after tapping 'Copy Link' share option");

        Assert.assertTrue(pollQuiz.verifyLinkCopiedToastTextIsPresent());
        System.out.print("'Link Copied' text is present on toast after tapping 'Copy Link' share option");

    }

    //Second question - tap view results
    @Test(priority = 9)
    public void testTapViewResults() {
        testName("Verify View Results button is present and tap-able");
        pollQuiz.scroll1();
        Assert.assertTrue(pollQuiz.verifyViewResultsIsPresent());
        print("Verified 'View Results' button is present");
        pollQuiz.tapViewResults();
    }

    @Test(priority = 10)
    public void testTapGoBackAndVote() {
        testName("Verify Go Back and Vote button is present");
        Assert.assertTrue(pollQuiz.verifyGoBackAndVoteIsPresent());
        print("Verified 'Go Back and Vote' button is present");

        pollQuiz.tapGoBackAndVoteButton();
    }

    @Test(priority = 11)
    public void testTapAnswerSecondQuestion() {
        testName("Verify choices are loading on second Q");
        Assert.assertTrue(pollQuiz.verifySecondQChoiceIsPresent());
        print("Verified first choice on second question is present");

        pollQuiz.tapSecondQChoice();
        pollQuiz.tapBackButtonFromSearch();
    //    pollQuiz.tapFirstCell();

    }

    //Read comments
 //   @Test(priority = 12)
    public void testTapReadComments() {
        testName("Verify Read Comments button is present and tap-able");
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();

      pollQuiz.verifyReadCommentsIsPresent();
        print("Verified 'Read Comments' button is present");

        pollQuiz.tapReadComments();
        scroll.scrollDown();
        pollQuiz.tapDoneButton();
        print("Verified 'Read Comments' is loading fine");
        pollQuiz.tapBackButton();
        pollQuiz.tapFirstCell();
    }
}
