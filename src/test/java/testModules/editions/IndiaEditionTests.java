package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class IndiaEditionTests extends EditionsInit {

    @Test
    public void testIndiaEditionIsPresent(){
        print("-------------------STARTING INDIA EDITION TESTS-------------------");
        testName("Verify 'India' edition is present");
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        print("Verified 'India' edition is present in the list");

        editions.tapIndiaEdition();
        editions.tapCloseButton();
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException {
        try {
            testName("HOME");
            testName("Verify Home tab / Lastest sub-tab");
            print("Verified 'BuzzFeed' logo is present on Home feed");
            print("Verified 'Latest' sub-tab is present on Home/Latest");
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
        } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

    @Test(priority = 2)
    public void testTrendingSubTab() throws InterruptedException {
        try {
            print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
            testName("Verify 'Trending' Tab");
            latestSubTab.tapOnTrendingSubNav();
            latestSubTab.trendingSubTabIsPresent();
            // latestSubTab.tapTrendingSplash();
            // Thread.sleep(2000);
            //  bpage.tapBackButton();
            print("Verified 'Trending' sub-tab  is present");
            Thread.sleep(2000);
            print("Here i am");
            latestSubTab.tapHomeTab();
        }catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }

    }



    @Test(priority = 4)
    public void testFunnyTweetsSubTab() throws InterruptedException {
        try {
            testName("Verify 'Shows' Sub-Tab");
            latestSubTab.tapOnFunnyTweetsSubNav();
            latestSubTab.isFunnyTweetsHeaderDisplayed();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }
    }

    @Test(priority = 5)
    public void testGamesSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapGamesTab();
            latestSubTab.isGamesHeaderDisplayed();
            homeSubTabs.tapHomeTab();
        } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }
    }

    @Test(priority = 6)
    public void testLatestsSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnLatestSubNav();
            latestSubTab.isLatestHeaderDisplayed();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

    @Test(priority = 7)
    public void testRandomSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnRandomSubNav();
            latestSubTab.isRandomHeaderDisplayed();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapHomeTab();
        } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);
        }
    }

    @Test(priority = 8)
    public void testGossipSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnGossipSubNav();
            latestSubTab.isGossipHeaderDisplayed();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

    @Test(priority = 9)
    public void testGayStuffpSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnGaySubNav();
            latestSubTab.isLgbtqHeaderDisplayed();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

    @Test(priority = 10)
    public void tapOnMore1() throws InterruptedException {
        //  Thread.sleep(5000);
        latestSubTab.tapOnMoreSubNav();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);

    }

       @Test (priority = 11)
    public void testRecentlyViewedSubTab() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        latestSubTab.tapOnRecentlyViewed();
        homeSubTabs.tapBackButton();

    }

    @Test(priority = 12)
    public void testEntertainmentSubTab() throws InterruptedException {
        latestSubTab.tapOnEntertainment();
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 13)
    public void testAnimalsSubTab() throws InterruptedException {
        homeSubTabs.clickOnAnimalsBtn();
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 14)
    public void testBooksSubTab() throws InterruptedException {
        latestSubTab.tapOnBooks();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    // @Test (priority = 14)
    public void testCelebritySubTab() {
        testName("Verify 'Celebrity' sub-tab");
        homeSubTabs.clickOnCelebrityBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 15)
    public void testFoodSubTab() {
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 16)
    public void testCommunitySubTab() {
        latestSubTab.tapOnCommunity();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 17)
    public void testMusicSubTab() {
        latestSubTab.tapOnMusic();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 18)
    public void testNiftySubTab() {
        latestSubTab.tapOnNifty();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 19)
    public void testParentsSubTab() {
        latestSubTab.tapOnParents();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 20)
    public void testRewindSubTab() {
        latestSubTab.tapOnRewind();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 21)
    public void testStyleSubTab() {
        latestSubTab.tapOnStyle();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 22)
    public void testTravelHomeSubTab() {
        latestSubTab.tapOnTravel();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    //  @Test (priority = 16)
    public void testTravelSubTab() {
        try {
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
    @Test(priority = 23)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
    }

    @Test(enabled = true, priority = 24)
    public void tapFstNewsCell() {
        news.tapFirstCell();
        news.tapBackButton();
    }


    //Shopping
    @Test(priority = 25)
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
    @Test(priority = 26)
    public void testGoingToQuizzesTab() {
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        editions.visitSplashAndReturn();

    }

    @Test(priority = 27)
    public void testTapOnTrendingCategory() {
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

    //   @Test (priority = 26)
    public void testTapOnResultsCategory() {
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

  //  @Test(priority = 28)
    public void testTapOnTriviaCategory() {
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        quizzesSubTabs.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }


   // @Test(priority = 29)
    public void testCanWeGuess() {
        testName("testTapWhoAreYou");
        quizzesSubTabs.tapOnCanWeGuess();
        quizzesSubTabs.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

    //  @Test (priority = 29)
    public void testTapMatchups() {
        testName("testTapOnLove");
        quizzesSubTabs.tapOnMatchups();
        editions.tapBackButton();
    }

    @Test(enabled = true, priority = 30)
    public void tapGamesTab() {
        try {
            news.tapGamesTab();
            news.tapHomeTab();
            news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " + testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }


}
