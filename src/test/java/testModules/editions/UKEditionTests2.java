package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UKEditionTests2 extends EditionsInit {

    //@BeforeClass
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
            testName("Verify 'Trending' Tab");

            homeSubTabs.clickOnTrendingBtn();
            print("Verified 'Trending' sub-tab  is present");

            editions.tapSplash();
            bpage.tapBackButton();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTrendingtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 3)
    public void testShowsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Shows' Sub-Tab");
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
            print("Verified 'Shows' sub-tab  is present");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 4)
    public void testVideosSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Videos' Sub-Tab");
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed= false;
        try{
            homeSubTabs.clickOnAnimalsBtn();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnAnimalsBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 6)
    public void testBooksSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 7)
    public void testCelebritySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Celebrity' sub-tab");
            Thread.sleep(3000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCelebritytab();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnCelebritytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 8)
    public void testFoodSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Food' sub-tab");
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodBtn();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnFoodBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 9)
    public void testCommunitySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 10)
    public void testHealthSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnHealth();
            bpage.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnHealthtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 11)
    public void testMusicSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            Thread.sleep(2000);
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 12)
    public void testNiftySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 13)
    public void testParentsSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 14)
    public void testRewindSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 15)
    public void testStyleSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 16)
    public void testTravelHomeSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    //@Test (priority = 17)
    public void testTravelSubTab(){
        try{
            testName("Verify Travel sub-tab");
            //scroll.swipeLeft();
            homeSubTabs.clickOnTraveltab();

            //Assert.assertTrue(homeSubTabs.travelTabIsPresent());
            //print("Verified 'Travel' sub-tab is present");

            //Assert.assertTrue(editions.splashCellIsPresent());
            //print("Verified Splash is present on 'Travel' sub-tab");

            //print("Bpage on Splash: " + editions.getSplashTitle());
            editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
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

    @Test (priority = 19)
    public void testHealthNewsTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Science' sub-tab");
            Thread.sleep(3000);
            news.clickOnHealthBtn();
            print("Verified Splash is present on 'Health' sub-tab");
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.clickOnHealthBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 20)
    public void testScienceTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Culture' sub-tab");
            news.clickOnScienceBtn();
            bpage.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.clickOnScienceBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 21)
    public void testCultureTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Culture' sub-tab");
            news.clickOnCultureBtn();
            bpage.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.clickOnCultureBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 22)
    public void testTechTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Culture' sub-tab");
            news.clickOnTechBtn();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.clickOnTechBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 23)
    public void testWorldTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Tech' sub-tab");
            news.clickOnWorldBtn();
            print("Verified Splash is present on 'Tech' sub-tab");
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.clickOnWorldBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 24)
    public void testEntertainmentNewsTab()throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Entertainment' sub-tab");
            news.tapOnMore();
            news.tapOnEntertainment();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            news.tapOnMore();
            news.tapOnEntertainment();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    //Shopping
    @Test (priority = 25)
    public void testGoingShoppingTab() {
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        editions.tapForeignShoppingTab();

        Assert.assertTrue(editions.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");

        editions.tapSplash();
        bpage.tapBackButton();

    }

    @Test (priority = 26)
    public void testTrendingShoppingSubTab() {
        testName("Verify 'Trending' sub-tab");
        editions.tapTrendingSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 27)
    public void testBeautySubTab() {
        testName("Verify 'Beauty' sub-tab");
        shoppingSubTabs.tapBeautySubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 28)
    public void testDealsSubTab() {
        testName("Verify 'Deals' sub-tab");
        shoppingSubTabs.tapDealsSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 29)
    public void testHomeSubTab() {
        testName("Verify 'Home' sub-tab");
        shoppingSubTabs.tapHomeSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 30)
    public void testClothingSubTab() {
        testName("Verify 'Clothing' sub-tab");
        shoppingSubTabs.tapClothingSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 31)
    public void testClickShoppingOnMoreNews() {
        testName("Verify 'Culture' sub-tab");
        news.tapOnMore();
    }


    @Test (priority = 32)
    public void testGiftSubTab() {
        testName("Verify 'Gift Ideas' sub-tab");
        editions.tapGiftIdeasSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 33)
    public void testUnder20SubTab() {
        testName("Verify 'Under $50' sub-tab");
        shoppingSubTabs.tapUnder20SubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 34)
    public void testSelfCareSubTab() {
        testName("Verify 'Self Care' sub-tab");
        editions.tapSelfCareSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 35)
    public void testTreatYourselfSubTab() {
        testName("Verify 'Treat Yourself' sub-tab");
        editions.tapTreatYourselfSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    //Quizzes
    @Test (priority = 36)
    public void testGoingToQuizzesTab(){
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        editions.visitSplashAndReturn();
    }

    //Search
    @Test (priority = 37)
    public void testSearchTab() {
        testName("SEARCH");
        testName("Verify going to Search tab");
        editions.tapSearchTab();

        Assert.assertTrue(editions.suggestedSearchesTitleIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
    }
}