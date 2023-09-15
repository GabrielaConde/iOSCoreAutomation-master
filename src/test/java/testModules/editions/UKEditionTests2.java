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

    //News
    @Test (priority = 23)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");

    }

    @Test(enabled = true, priority = 24)
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

 //  @Test (priority = 29)
    public void testTrendingShoppingSubTab() {
        try {
            testName("Verify 'Trending' sub-tab");
            editions.tapTrendingSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

  //  @Test (priority = 30)
    public void testBeautySubTab() {
        try{
            testName("Verify 'Beauty' sub-tab");
            shoppingSubTabs.tapBeautySubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

  //  @Test (priority = 31)
    public void testDealsSubTab() {
        try{
            testName("Verify 'Deals' sub-tab");
            shoppingSubTabs.tapDealsSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

  //  @Test (priority = 32)
    public void testHomeSubTab() {
        try{
            testName("Verify 'Home' sub-tab");
            shoppingSubTabs.tapHomeSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

  //  @Test (priority = 33)
    public void testClothingSubTab() {
        try{
            testName("Verify 'Clothing' sub-tab");
            shoppingSubTabs.tapClothingSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

 //   @Test (priority = 34)
    public void testClickShoppingOnMoreNews() {
            testName("Verify 'Culture' sub-tab");
            news.tapOnMore();
    }


  //  @Test (priority = 35)
    public void testGiftSubTab() {
        try{
            testName("Verify 'Gift Ideas' sub-tab");
            editions.tapGiftIdeasSubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
    }

  //  @Test (priority = 36)
    public void testUnder20SubTab() {
        try{
            testName("Verify 'Under $50' sub-tab");
            shoppingSubTabs.tapUnder20SubTab();
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        }catch (Exception e){
            editions.tapBackButton();
            Assert.assertTrue(false);
        }
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
            news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }
}





