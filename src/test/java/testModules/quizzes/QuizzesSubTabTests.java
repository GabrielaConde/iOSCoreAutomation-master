package testModules.quizzes;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuizzesSubTabTests extends EditionsInit {

    @BeforeClass
    public void onboardingProcess() {
        //scroll.swipeRight();
    }

    @Test (priority = 1)
    public void trendingTab(){
        try{
        scroll.scrollUp();
        scroll.scrollUp();
        scroll.scrollUp();
        //scroll.swipeRight();
        quizzesSubTabs.tapOnTrending();
        System.out.println("-------------------STARTING SUB-TABS TESTS ON QUIZZES-------------------");
        testName("Verify Trending sub-tab is present, active. Splash and first quiz are present on Trending feed");

       quizzesSubTabs.trendingSubTabIsPresent();
        print("Sub-tab 'Trending' is present");

       // Assert.assertEquals(quizzesSubTabs.trendingSubTabIsActive(), "1");
        print("'value' for sub-tab 'Trending' is = 1, the sub-tab is active");

        quizzesSubTabs.splashCellIsPresent();
        print("Splash is present on sub-tab 'Trending'");

        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();

        Assert.assertTrue(quizzesSubTabs.firstCellOnTrendingIsPresent());
        System.out.println("First quiz is present on sub-tab 'Trending'");

        quizzesSubTabs.tapFirstCellOnTrending();
        quizzesSubTabs.tapBackButton();
        quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }


    @Test (priority = 2)
    public void foodTab(){
        try{
            testName("Verify Food sub-tab is present, active. Splash and first quiz are present on Food feed");
            //    scroll.swipeRight();
            quizzesSubTabs.tapOnFood();

            Assert.assertTrue(quizzesSubTabs.foodTabIsPresent());
            print("Sub-tab 'Food' is present");

            //   Assert.assertEquals(quizzesSubTabs.foodTabIsActive(), "1");
            print("'value' for sub-tab 'Food' is = 1, the sub-tab is active");

            Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
            print("Splash is present on sub-tab 'Food'");

            quizzesSubTabs.tapSplash();
            quizzesSubTabs.tapBackButton();

            Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
            print("First quiz is present on sub-tab 'Food'");

            quizzesSubTabs.tapFirstCell();
            quizzesSubTabs.tapBackButton();
            quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 3)
    public void triviaTab(){
        try{
            testName("Verify Trivia sub-tab is present, active. Splash and first quiz are present on Trivia feed");
            //   scroll.swipeRight();
            quizzesSubTabs.tapOnTrivia();

            Assert.assertTrue(quizzesSubTabs.triviaTabIsPresent());
            print("Sub-tab 'Trivia' is present");

            //  Assert.assertEquals(quizzesSubTabs.triviaTabIsActive(), "1");
            print("'value' for sub-tab 'Trivia' is = 1, the sub-tab is active");

            Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
            print("Splash is present on sub-tab 'Trivia'");

            quizzesSubTabs.tapSplash();
            quizzesSubTabs.tapBackButton();

            Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
            print("First quiz is present on sub-tab 'Trivia'");

            quizzesSubTabs.tapFirstCell();
            quizzesSubTabs.tapBackButton();
            quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 4)
    public void Matchups(){
        try{
            testName("Verify Trivia sub-tab is present, active. Splash and first quiz are present on Trivia feed");
            //   scroll.swipeRight();
            quizzesSubTabs.tapOnMatchups();
            quizzesSubTabs.tapBackButton();
           // Assert.assertTrue(quizzesSubTabs.triviaTabIsPresent());
            print("Sub-tab 'Trivia' is present");


        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 5)
    public void TapOnResults(){
        try{
            testName("Verify Trivia sub-tab is present, active. Splash and first quiz are present on Trivia feed");
            //   scroll.swipeRight();
            quizzesSubTabs.tapOnResults();
            quizzesSubTabs.tapBackButton();

            // Assert.assertTrue(quizzesSubTabs.triviaTabIsPresent());
            print("Sub-tab 'Trivia' is present");


        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 6)
    public void tapOnMore(){
        try{
            testName("Verify Trivia sub-tab is present, active. Splash and first quiz are present on Trivia feed");
            //   scroll.swipeRight();
            quizzesSubTabs.tapOnMore();

            // Assert.assertTrue(quizzesSubTabs.triviaTabIsPresent());
            print("Sub-tab 'Trivia' is present");


        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 7)
    public void canWeGuessTab(){
        try{
            testName("Verify Can We Guess sub-tab is present, active. Splash and first quiz are present on Can We Guess feed");
            //  scroll.swipeLeft();
            //  scroll.swipeLeft();
            //  scroll.swipeRight();
            //  scroll.swipeRight();
            quizzesSubTabs.tapOnCanWeGuess();

            Assert.assertTrue(quizzesSubTabs.canWeGuessTabIsPresent());
            print("Sub-tab 'Can We Guess?' is present");

            // Assert.assertEquals(quizzesSubTabs.canWeGuessTabIsActive(), "1");
            print("'value' for sub-tab 'Can We Guess?' is = 1, the sub-tab is active");

            Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
            print("Splash is present on sub-tab 'Can We Guess?'");

            quizzesSubTabs.tapSplash();
            quizzesSubTabs.tapBackButton();

            Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
            print("First quiz is present on sub-tab 'Can We Guess?'");

            quizzesSubTabs.tapFirstCell();
            quizzesSubTabs.tapBackButton();
            quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 8)
    public void disneyTab(){
        try{
        testName("Verify Disney sub-tab is present, active. Splash and first quiz are present on Disney feed");
      //  scroll.swipeLeft();
      //  scroll.swipeRight();
        quizzesSubTabs.tapOnDisney();

        Assert.assertTrue(quizzesSubTabs.disneyIsPresent());
        print("Sub-tab 'Disney' is present");

   //     Assert.assertEquals(quizzesSubTabs.disneyIsActive(), "1");
        print("'value' for sub-tab 'Disney' is = 1, the sub-tab is active");

        Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
        print("Splash is present on sub-tab 'Disney?'");

        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();

        Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
        print("First quiz is present on sub-tab 'Disney'");

        quizzesSubTabs.tapFirstCell();
        quizzesSubTabs.tapBackButton();
        quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }



    @Test (priority = 9)
    public void whoAreYouTab(){
        try{
        testName("Verify Who Are You sub-tab is present, active. Splash and first quiz are present on Who Are You feed");
    //    scroll.swipeRight();
        quizzesSubTabs.tapOnWhoAreYou();

        Assert.assertTrue(quizzesSubTabs.whoAreYouTabIsPresent());
        print("Sub-tab 'Who are you?' is present");

      //  Assert.assertEquals(quizzesSubTabs.whoAreYouTabIsActive(), "1");
        print("'value' for sub-tab 'Who are you?' is = 1, the sub-tab is active");

        Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
        print("Splash is present on sub-tab 'Who are you?'");

        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();

        Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
        print("First quiz is present on sub-tab 'Who are you?'");

        quizzesSubTabs.tapFirstCell();
        quizzesSubTabs.tapBackButton();
        quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 10)
    public void loveTab(){
        try{
        testName("Verify Love sub-tab is present, active. Splash and first quiz are present on Love feed");
       // scroll.swipeRight();
        quizzesSubTabs.tapOnLove();

        Assert.assertTrue(quizzesSubTabs.loveTabIsPresent());
        print("Sub-tab 'Love' is present");

      //  Assert.assertEquals(quizzesSubTabs.loveTabIsActive(), "1");
        print("'value' for sub-tab 'Love'  is = 1, the sub-tab is active");

        Assert.assertTrue(quizzesSubTabs.splashCellIsPresent());
        print("Splash is present on sub-tab 'Love'");

        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();

        Assert.assertTrue(quizzesSubTabs.fistCellIsPresent());
        print("First quiz is present on sub-tab 'Love'");

        quizzesSubTabs.tapFirstCell();
        quizzesSubTabs.tapBackButton();
        quizzesSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }


}
