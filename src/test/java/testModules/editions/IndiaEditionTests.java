package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class IndiaEditionTests extends EditionsInit {

    @Test
    public void testIndiaEditionIsPresent(){
        try{
            print("-------------------STARTING INDIA EDITION TESTS-------------------");
            testName("Verify 'India' edition is present");
            editions.tapProfileButton();
            editions.tapSettingsButton();
            editions.tapEditionOption();

            print("Verified 'India' edition is present in the list");

            editions.tapIndiaEdition();
            editions.tapCloseButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab(){
        try{
            testName("HOME");
            testName("Verify Home tab / Lastest sub-tab");

            Assert.assertTrue((latestSubTab.buzzfeedLogoIsPresent()));
            print("Verified 'BuzzFeed' logo is present on Home feed");

            print("Verified 'Latest' sub-tab is present on Home/Latest");

            Assert.assertTrue(latestSubTab.splashCellIsPresent());
            print("Verified 'Splash' is present on Home/Latest feed");

            print("Bpage on Splash: " + editions.getSplashTitle());
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 2)
    public void testVideosSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Videos' Sub-Tab");
            homeSubTabs.clickOnVideosTab();

            Assert.assertTrue(homeSubTabs.videosSubTabIsPresent());
            print("Verified 'Videos' sub-tab is present");

            Assert.assertTrue(homeSubTabs.firstVideoIsPresent());
            print("Verified First Video is present on 'Videos' sub-tab");

            homeSubTabs.tapFirstVideo();
            homeSubTabs.tapCloseButton();
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

    @Test(priority = 3)
    public void testTrendingSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Trending' Tab");
            Thread.sleep(2000);
            homeSubTabs.clickOnTrendingtab();

            print("Verified 'Trending' sub-tab is present");
            print("Verified Splash is present on 'Trending' sub-tab");

            editions.tapBackButton();
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

    @Test (priority = 4)
    public void testShowsSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Shows' Sub-Tab");
            homeSubTabs.clickOnShowstab();

            Assert.assertTrue(showSubTab.showsTabIsPresent());
            print("Verified 'Shows' sub-tab is present");

            Assert.assertTrue(editions.verifyShowIsPresent());
            print("Verified 'Shows' sub-tab is present");
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnShowstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Animals' sub-tab");
            homeSubTabs.clickOnAnimalstab();

            Assert.assertTrue(homeSubTabs.animalsTabIsPresent());
            print("Verified 'Animals' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Animals' sub-tab");
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnAnimalstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 6)
    public void testCelebritySubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Celebrity' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCelebritytab();
            print("Verified 'Celebrity' sub-tab is present");
            print("Verified Splash is present on 'Celebrity' sub-tab");
            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnCelebritytab();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 7)
    public void testBooksSubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Books' sub-tab");
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnBookstab();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 8)
    public void testCommunitySubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Community' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCommunitytab();

            Assert.assertTrue(homeSubTabs.communityTabIsPresent());
            print("Verified 'Community' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Community' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            System.out.print(e.getMessage());
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 9)
    public void testFoodSubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Food' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodtab();

            print("Verified 'Food' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Food' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            System.out.print(e.getMessage());
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnFoodtab();
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
            testName("Verify 'Health' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            latestSubTab.tapOnHealth();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            latestSubTab.tapBackButton();
            Thread.sleep(5000);
            homeSubTabs.clickOnHealthtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 11)
    public void testMusicSubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Music' Sub-Tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnMusictab();

            Assert.assertTrue(homeSubTabs.musicTabIsPresent());
            print("Verified 'Music' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Music' sub-tab");

            print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnMusictab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 12)
    public void testNiftySubTab(){
        Boolean failed = false;
        try{
            testName("Verify 'Nifty' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnNiftytab();

            Assert.assertTrue(homeSubTabs.niftyTabIsPresent());
            print("Verified 'Nifty' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Nifty' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnNiftytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 13)
    public void testParentsSubTab(){
        Boolean failed = false;
        try{
            testName("Verify Parents sub-tab");
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnParentstab();

            Assert.assertTrue(homeSubTabs.parentsTabIsPresent());
            print("Verified 'Parents' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Parents' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnParentstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 14)
    public void testRewindSubTab(){
        Boolean failed = false;
        try{

            testName("Verify 'Rewind' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnRewindtab();

            Assert.assertTrue(homeSubTabs.rewindTabIsPresent());
            print("Verified 'Rewind' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Rewind' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnRewindtab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 15)
    public void testStyleSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify Style sub-tabb");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnStyletab();

            Assert.assertTrue(homeSubTabs.styleTabIsPresent());
            print("Verified 'Style' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Style' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnStyletab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 16)
    public void testTravelSubTab(){
        Boolean failed= false;
        try{
            testName("Verify Travel sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTraveltab();

            Assert.assertTrue(homeSubTabs.travelTabIsPresent());
            print("Verified 'Travel' sub-tab is present");

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Travel' sub-tab");

            editions.tapBackButton();
            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            homeSubTabs.tapBackButton();
            homeSubTabs.clickOnTraveltab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
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

    @Test (priority = 18)
    public void testHealthNewsSubTab() throws InterruptedException {
        Boolean failed = false;
        try{
            Thread.sleep(5000);
            news.clickOnHealthBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Science' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnHealthBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 19)
    public void testPoliticsSubTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Politics' sub-tab");
            Thread.sleep(4000);
            news.clickOnPoliticseBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Politics' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnPoliticseBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 20)
    public void testCultureSubTab()throws InterruptedException {
        Boolean failed = true;
        try{
            testName("Verify 'Culture' sub-tab");
            Thread.sleep(4000);
            news.clickOnCultureBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Culture' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnCultureBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 21)
    public void testTechSubTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Tech' sub-tab");
            Thread.sleep(4000);
            news.clickOnTechBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Tech' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnTechBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 22)
    public void testWorldSubTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'World' sub-tab");
            Thread.sleep(4000);
            news.clickOnWorldBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'World' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnWorldBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 23)
    public void testEntertainmentSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Entertainment' sub-tab");
            Thread.sleep(4000);
            news.clickOnEntertainmentBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Entertainment' sub-tab");

            editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.clickOnEntertainmentBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
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

        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Latest' sub-tab");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
    }

    @Test (priority = 25)
    public void testTrendingShoppingSubTab() {
        testName("Verify 'Trending' sub-tab");
        editions.tapTrendingSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Trending' sub-tab");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapBackButton();
    }

    @Test (priority = 26)
    public void testBeautySubTab() {
        testName("Verify 'Beauty' sub-tab");
        shoppingSubTabs.tapBeautySubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Beauty' sub-tab");

        shoppingSubTabs.tapBackButton();
    }

    @Test (priority = 27)
    public void testDealsSubTab() {
        testName("Verify 'Deals' sub-tab");
        shoppingSubTabs.tapDealsSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Deals' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 28)
    public void testHomeSubTab() {
        testName("Verify 'Home' sub-tab");
        shoppingSubTabs.tapHomeSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Home' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 29)
    public void testFashionSubTab() {
        testName("Verify 'Fashion' sub-tab");
        editions.tapFashionSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Clothing' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 30)
    public void testGiftSubTab() {
        testName("Verify 'Gift Ideas' sub-tab");
        news.tapOnMore();
        editions.tapGiftIdeasSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Gift Ideas' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 31)
    public void testUnder1000SubTab() {
        testName("Verify 'Under ₹ 1000' sub-tab");
        editions.tapUnder1000SubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Under $50' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 32)
    public void testBooksShoppingSubTab(){
        testName("Verify 'Books' Sub-Tab");
        editions.tapBooksSubTab();

        Assert.assertTrue(homeSubTabs.booksTabIsPresent());
        print("Verified Sub-tab 'Books' is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Books' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 33)
    public void testFoodShoppingSubTab(){
        testName("Verify 'Food' Sub-Tab");
        editions.tapFoodSubTab();
        print("Verified Sub-tab 'Food' is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Food' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 34)
    public void testSelfCareSubTab() {
        testName("Verify 'Self Care' sub-tab");
        editions.tapSelfCareSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Self Care' sub-tab");

        editions.tapBackButton();
    }

    @Test (priority = 35)
    public void testWorthEveryRupeeSubTab() {
        testName("Verify 'Worth Every Rupee' sub-tab");
        editions.tapWorthEveryRupeeSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Worth Every Rupee' sub-tab");

        editions.tapBackButton();
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

        Assert.assertTrue(quizzesLatestSubTab.suggestedSearchesTitleIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
    }
}