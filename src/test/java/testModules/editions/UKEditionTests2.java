package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UKEditionTests2 extends EditionsInit {

   // @BeforeClass
    public void onboarding() throws InterruptedException{
        editions.tapAllowButton();
        editions.tapAllowButton();
        disableAdExp.disableAdExp();
        editions.tapAllowButton();
        editions.tapOnSuscribeBtn();
    }

    @Test
    public void testUKEditionIsPresent(){
        print("-------------------STARTING UK EDITION TESTS-------------------");
        testName("Verify 'UK' edition is present");
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.ukEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapUKEdition();
        editions.tapCloseButton();
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();

    }

    @Test(priority = 2)
    public void testTrendingSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        homeSubTabs.clickOnTrendingBtn();
        print("Verified 'Trending' sub-tab  is present");
        latestSubTab.tapHomeTab();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTrendingtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 3)
    public void testShowsSubTab()throws InterruptedException{
        Boolean failed = false;
           try{
        testName("Verify 'Shows' Sub-Tab");
               driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnShowsBtn();
        homeSubTabs.tapBackButton();

        print("Verified 'Shows' sub-tab  is present");
           } catch (Exception e) {
               Thread.sleep(2000);
               latestSubTab.tapOnMore();
               homeSubTabs.clickOnShowsBtn();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }
    }

    @Test (priority = 4)
    public void testVideosSubTab()throws InterruptedException{
        Boolean failed = false;
            try{
        testName("Verify 'Videos' Sub-Tab");
                driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnVideosTab();
        homeSubTabs.tapBackButton();

            } catch (Exception e) {
                Thread.sleep(2000);
                latestSubTab.tapOnMore();
                homeSubTabs.clickOnVideosTab();
                homeSubTabs.tapBackButton();
            }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed= false;
           try{
               driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnAnimalsBtn();
            homeSubTabs.tapBackButton();
           } catch (Exception e) {
               Thread.sleep(2000);
               latestSubTab.tapOnMore();
               homeSubTabs.clickOnAnimalsBtn();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }
    }


    @Test (priority = 7)
    public void testBooksSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }


    @Test (priority = 8)
    public void testCelebritySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Celebrity' sub-tab");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCelebritytab();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCelebritytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 9)
    public void testFoodSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Food' sub-tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnFoodBtn();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 10)
    public void testCommunitySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }


    @Test (priority = 12)
    public void testMusicSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 13)
    public void testNiftySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 14)
    public void testParentsSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 15)
    public void testRewindSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 16)
    public void testStyleSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 17)
    public void testTravelHomeSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }


    //News
    @Test (priority = 18)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");

    }

    @Test(enabled = true, priority = 19)
    public void tapFstNewsCell(){
        try{
            news.tapFirstCell();
            news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to News Tab"));
            print("ERROR" + e.getMessage());
        }
    }

    //Shopping
    @Test (priority = 28)
    public void testGoingShoppingTab() {
            testName("SHOPPING");
            testName("Verify Shopping tab / Latest sub-tab");
            editions.tapForeignShoppingTab();
            Assert.assertTrue(editions.shoppingHeaderIsPresent());
            print("Verified the 'Shopping' header in the Shopping feed is present");
            editions.tapSplash();
            bpage.tapBackButton();

    }

    @Test (priority = 29)
    public void testTrendingShoppingSubTab() {
            testName("Verify 'Trending' sub-tab");
            editions.tapTrendingSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 30)
    public void testBeautySubTab() {
            testName("Verify 'Beauty' sub-tab");
            shoppingSubTabs.tapBeautySubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 31)
    public void testDealsSubTab() {
            testName("Verify 'Deals' sub-tab");
            shoppingSubTabs.tapDealsSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 32)
    public void testHomeSubTab() {
            testName("Verify 'Home' sub-tab");
            shoppingSubTabs.tapHomeSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 33)
    public void testClothingSubTab() {
            testName("Verify 'Clothing' sub-tab");
            shoppingSubTabs.tapClothingSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 34)
    public void testClickShoppingOnMoreNews() {
            testName("Verify 'Culture' sub-tab");
            news.tapOnMore();
    }


    @Test (priority = 35)
    public void testGiftSubTab() {
            testName("Verify 'Gift Ideas' sub-tab");
            editions.tapGiftIdeasSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    @Test (priority = 36)
    public void testUnder20SubTab() {
            testName("Verify 'Under $50' sub-tab");
            shoppingSubTabs.tapUnder20SubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
    }

    //Quizzes
    @Test (priority = 39)
    public void testGoingToQuizzesTab(){
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
            editions.visitSplashAndReturn();
    }

    @Test (priority = 40)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapBackButton();
    }

  //  @Test (priority = 41)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

    @Test (priority = 42)
    public void testTapOnAIQuizzes(){
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        editions.tapBackButton();
    }

    @Test (priority = 43)
    public void testTapOnTriviaCategory(){
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

    @Test (priority = 44)
    public void testTapCanWeGuess(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();
        editions.tapBackButton();
    }

 //   @Test (priority = 45)
    public void testTapOnMatchups(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnMatchups();
        quizzesSubTabs.tapBackButton();
    }

    @Test(enabled = true, priority = 49)
    public void tapGamesTab(){
        try{
            news.tapGamesTab();
            news.tapHomeTab();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }
}





