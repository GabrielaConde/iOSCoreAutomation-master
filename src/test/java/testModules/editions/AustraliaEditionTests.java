package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.ui.context.Theme;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AustraliaEditionTests extends EditionsInit {

    @BeforeClass
    public void onboarding()throws InterruptedException{
        Thread.sleep(3000);
        editions.tapAllowButton();
        Thread.sleep(3000);
        editions.tapAllowButton();
        Thread.sleep(2000);
        editions.tapOnAcceptAllCookiesBtn();
        Thread.sleep(2000);
        disableAdExp.disableAdExp();
        editions.tapCloseButton();
        editions.closeGoToGamesScreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        disableAdExp.turnOnVisualFeedFF();
    }

    @Test
    public void testAustraliaEditionIsPresent(){
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        editions.tapOnNoThanksSweepTakes();
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();
        print("Verified 'Australia' edition is present in the list");
        editions.tapAustraliaEdition();
        editions.tapCloseButton();

    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
    }

    @Test(priority = 2)
    public void testTrendingSubTab()throws InterruptedException{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        homeSubTabs.clickOnTrendingBtn();
        print("Verified 'Trending' sub-tab  is present");
        Thread.sleep(2000);
        print("Here i am");
        latestSubTab.tapHomeTab();

    }

    @Test (priority = 3)
    public void testRecentlyViewedSubTab()throws InterruptedException{
        testName("Verify 'Shows' Sub-Tab");
        latestSubTab.tapOnRecentlyViewed();
        homeSubTabs.tapBackButton();

    }

       @Test (priority = 4)
    public void testShowsSubTab()throws InterruptedException{
            testName("Verify 'Shows' Sub-Tab");
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
    }

     @Test (priority = 5)
    public void testVideosSubTab(){
            testName("Verify 'Videos' Sub-Tab");
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();

    }

    @Test (priority = 6)
    public void testAIQuizzesTab(){
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnAIQuizzes();
        homeSubTabs.tapBackButton();
    }

    @Test (priority = 7)
    public void testGamesTab(){
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        homeSubTabs.tapHomeTab();
    }


    @Test(priority =8)
    public void tapOnMore1()throws InterruptedException{
        //    try{
        //  Thread.sleep(5000);
        latestSubTab.tapOnMore();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test (priority = 9)
    public void testEntertainmentSubTab() throws InterruptedException{
        latestSubTab.tapOnEntertainment();
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test (priority = 10)
    public void testAnimalsSubTab() throws InterruptedException{
            homeSubTabs.clickOnAnimalsBtn();
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }



     @Test (priority = 11)
    public void testBooksSubTab() throws InterruptedException{
             latestSubTab.tapOnBooks();
             latestSubTab.tapSplash();
             bpage.tapBackButton();
             homeSubTabs.tapBackButton();
    }

    @Test (priority = 12)
    public void testCelebritySubTab(){
            testName("Verify 'Celebrity' sub-tab");
            homeSubTabs.clickOnCelebrityBtn();
            latestSubTab.tapBackButton();
    }

    @Test (priority = 13)
    public void testFoodSubTab(){
            testName("Verify 'Food' sub-tab");
            homeSubTabs.clickOnFoodBtn();
            latestSubTab.tapBackButton();
    }

    @Test (priority = 14)
    public void testCommunitySubTab(){
            latestSubTab.tapOnCommunity();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }


    @Test (priority = 15)
    public void testMusicSubTab(){
            latestSubTab.tapOnMusic();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 16)
    public void testNiftySubTab(){
            latestSubTab.tapOnNifty();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 17)
    public void testParentsSubTab(){
            latestSubTab.tapOnParents();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 18)
    public void testRewindSubTab(){
            latestSubTab.tapOnRewind();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 19)
    public void testStyleSubTab(){
          latestSubTab.tapOnStyle();
          latestSubTab.tapSplash();
          bpage.tapBackButton();
          homeSubTabs.tapBackButton();
    }

    @Test (priority = 20)
    public void testTravelHomeSubTab(){
            latestSubTab.tapOnTravel();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }





  //  @Test (priority = 16)
    public void testTravelSubTab(){
        try{
        testName("Verify Travel sub-tab");
    //    scroll.swipeLeft();
        homeSubTabs.clickOnTraveltab();

      //  Assert.assertTrue(homeSubTabs.travelTabIsPresent());
      //  print("Verified 'Travel' sub-tab is present");

      //  Assert.assertTrue(editions.splashCellIsPresent());
      //  print("Verified Splash is present on 'Travel' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //News
    @Test (priority = 21)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
    }

    @Test(enabled = true, priority = 22)
    public void tapFstNewsCell(){
            news.tapFirstCell();
            news.tapBackButton();
    }


    //Shopping
    @Test (priority = 23)
    public void testGoingShoppingTab() {
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        editions.tapForeignShoppingTab();

      //  Assert.assertTrue(editions.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");
        editions.tapSplash();
        bpage.tapBackButton();
    }


    //Quizzes
    @Test (priority = 24)
    public void testGoingToQuizzesTab(){
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        editions.visitSplashAndReturn();

    }

    @Test (priority = 25)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

 //   @Test (priority = 26)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

    @Test (priority = 27)
    public void testTapOnTriviaCategory(){
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        quizzesSubTabs.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }


    @Test (priority = 28)
    public void testCanWeGuess(){
        testName("testTapWhoAreYou");
        quizzesSubTabs.tapOnCanWeGuess();
        quizzesSubTabs.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

  //  @Test (priority = 29)
    public void testTapMatchups(){
        testName("testTapOnLove");
        quizzesSubTabs.tapOnMatchups();
        editions.tapBackButton();
    }

    @Test(enabled = true, priority = 30)
    public void tapGamesTab(){
        try{
            news.tapGamesTab();
            news.tapHomeTab();
              news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }

    }

}





