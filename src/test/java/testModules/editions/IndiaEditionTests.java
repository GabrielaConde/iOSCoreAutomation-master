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
    public void testLatestSubTab(){
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        Assert.assertTrue((latestSubTab.buzzfeedLogoIsPresent()));
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        Assert.assertTrue(latestSubTab.splashCellIsPresent());
        print("Verified 'Splash' is present on Home/Latest feed");
        print("Bpage on Splash: " + editions.getSplashTitle());
    }

    @Test (priority = 2)
    public void testVideosSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Videos' Sub-Tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnVideosTab();
        print("Verified 'Videos' sub-tab is present");
        homeSubTabs.firstVideoIsPresent();
        print("Verified First Video is present on 'Videos' sub-tab");
        homeSubTabs.tapFirstVideo();
        homeSubTabs.tapCloseButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test(priority = 3)
    public void testTrendingSubTab() throws InterruptedException{
        Boolean failed = false;
       try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        Thread.sleep(1000);
           driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnTrendingtab();

        print("Verified 'Trending' sub-tab is present");
        print("Verified Splash is present on 'Trending' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTrendingtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 4)
    public void testShowsSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Shows' Sub-Tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnShowstab();
        showSubTab.showsTabIsPresent();
        print("Verified 'Shows' sub-tab is present");
        Assert.assertTrue(editions.verifyShowIsPresent());
        print("Verified 'Shows' sub-tab is present");
        editions.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(1000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnShowstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Animals' sub-tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnAnimalstab();
        print("Verified Splash is present on 'Animals' sub-tab");
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(3000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnAnimalstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 6)
    public void testCelebritySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Celebrity' sub-tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Thread.sleep(1000);
        homeSubTabs.clickOnCelebritytab();
        print("Verified 'Celebrity' sub-tab is present");
        print("Verified Splash is present on 'Celebrity' sub-tab");
        editions.tapBackButton();
        } catch (Exception e) {
            Thread.sleep(1000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCelebritytab();
            latestSubTab.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 7)
    public void testBooksSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Books' sub-tab");
            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnBookstab();
        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 8)
    public void testCommunitySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Community' sub-tab");
            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnCommunitytab();

        homeSubTabs.communityTabIsPresent();
        print("Verified 'Community' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Community' sub-tab");

        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 9)
    public void testFoodSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Food' sub-tab");
            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnFoodtab();

        print("Verified 'Food' sub-tab is present");

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on 'Food' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }


    @Test (priority = 11)
    public void testMusicSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Music' Sub-Tab");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnMusictab();

        homeSubTabs.musicTabIsPresent();
        print("Verified 'Music' sub-tab is present");

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on 'Music' sub-tab");

        print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();

        }
    }

    @Test (priority = 12)
    public void testNiftySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Nifty' sub-tab");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnNiftytab();

        Assert.assertTrue(homeSubTabs.niftyTabIsPresent());
        print("Verified 'Nifty' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Nifty' sub-tab");

        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnNiftytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 13)
    public void testParentsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify Parents sub-tab");
        Thread.sleep(4000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnParentstab();

        homeSubTabs.parentsTabIsPresent();
        print("Verified 'Parents' sub-tab is present");

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on 'Parents' sub-tab");

        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnParentstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 14)
    public void testRewindSubTab()throws InterruptedException{
        Boolean failed = false;
        try{

        testName("Verify 'Rewind' sub-tab");
        Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnRewindtab();

        Assert.assertTrue(homeSubTabs.rewindTabIsPresent());
        print("Verified 'Rewind' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Rewind' sub-tab");
            editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnRewindtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 15)
    public void testStyleSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify Style sub-tabb");
        Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnStyletab();

        homeSubTabs.styleTabIsPresent();
        print("Verified 'Style' sub-tab is present");
        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on 'Style' sub-tab");
        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 16)
    public void testTravelSubTab() throws InterruptedException{
        Boolean failed= false;
        try{
        testName("Verify Travel sub-tab");
        Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnTraveltab();

        Assert.assertTrue(homeSubTabs.travelTabIsPresent());
        print("Verified 'Travel' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Travel' sub-tab");
        editions.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    //News
    @Test (priority = 17)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");
    }

    @Test(enabled = true, priority = 18)
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
    @Test (priority = 24)
    public void testGoingShoppingTab() {
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        Assert.assertTrue(editions.foreignShoppingTabIsPresent());
        print("Verified the 'Shopping' Tab is present in the nav bar");

        editions.tapForeignShoppingTab();

       shoppingLatestSubTabs.shoppingHeaderIsPresent();
        print("Verified the 'Shopping' header in the Shopping feed is present");

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on 'Latest' sub-tab");
        editions.visitSplashAndReturn();
    }

    //Quizzes
    @Test (priority = 36)
    public void testGoingToQuizzesTab(){
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        editions.tapSplash();
        editions.tapBackButton();
    }

    @Test (priority = 37)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

    @Test (priority = 38)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }


    @Test(enabled = true, priority = 49)
    public void tapGamesTab(){
        try{
            news.tapGamesTab();
            news.tapHomeTab();
       //     news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }

    }

}
