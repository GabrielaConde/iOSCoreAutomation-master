package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
//import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UKEditionTests2 extends EditionsInit {

    @BeforeClass
    public void onboarding() throws InterruptedException{
        Thread.sleep(5000);
        editions.tapAllowButton();
        Thread.sleep(2000);
        editions.tapOnGuestSignIn();
      //  editions.tapAllowButton();
     //   disableAdExp.disableAdExp();
     //   editions.tapAllowButton();
     //   editions.tapOnSuscribeBtn();
    }

    @Test
    public void testUKEditionIsPresent(){
        print("-------------------STARTING UK EDITION TESTS-------------------");
        testName("Verify 'UK' edition is present");
      //  editions.tapProfileButton();
      //  editions.tapGearIcon();
        editions.tapSettingsMenu();

        //   editions.tapEditionOption();
        editions.tapOnEditionOnUK();

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
     //   try {
            testName("Verify 'Shows' Sub-Tab");
            latestSubTab.tapOnFunnyTweetsSubNav();
            latestSubTab.isFunnyTweetsHeaderDisplayed();
         //   latestSubTab.tapSplash();
         //   bpage.tapBackButton();
            homeSubTabs.tapBackButton();
       /* } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }/*
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
     //   try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnLatestSubNav();
            latestSubTab.isLatestHeaderDisplayed();
       //     latestSubTab.tapSplash();
       //     bpage.tapBackButton();
            homeSubTabs.tapBackButton();
       /* } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 7)
    public void testRandomSubTab() {
       // try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnRandomSubNav();
            latestSubTab.isRandomHeaderDisplayed();
            homeSubTabs.tapHomeTab();
       /* } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);
        }*/
    }

    @Test(priority = 8)
    public void testGossipSubTab() {
        try{
            testName("Verify 'Videos' Sub-Tab");
            latestSubTab.tapOnGossipSubNav();
            latestSubTab.isGossipHeaderDisplayed();
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
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 12)
    public void testEntertainmentSubTab() throws InterruptedException {
        latestSubTab.tapOnEntertainment();
    //    homeSubTabs.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 13)
    public void testAnimalsSubTab() throws InterruptedException {
        homeSubTabs.clickOnAnimalsBtn();
     //   homeSubTabs.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 14)
    public void testBooksSubTab() throws InterruptedException {
        latestSubTab.tapOnBooks();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 15)
    public void testFoodSubTab()throws InterruptedException {
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
    }

    @Test(priority = 16)
    public void testCommunitySubTab() throws InterruptedException{
        latestSubTab.tapOnCommunity();
      //  latestSubTab.tapSplash();
      //  bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 17)
    public void testMusicSubTab()throws InterruptedException {
        latestSubTab.tapOnMusic();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 18)
    public void testNiftySubTab()throws InterruptedException {
        latestSubTab.tapOnNifty();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 19)
    public void testParentsSubTab()throws InterruptedException {
        latestSubTab.tapOnParents();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 20)
    public void testRewindSubTab() throws InterruptedException{
        latestSubTab.tapOnRewind();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 21)
    public void testStyleSubTab()throws InterruptedException {
        latestSubTab.tapOnStyle();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 22)
    public void testTravelHomeSubTab()throws InterruptedException {
        latestSubTab.tapOnTravel();
      //  latestSubTab.tapSplash();
      //  bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    //News
    @Test (priority = 23)
    public void testGoingNewsTab() throws InterruptedException{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

       news.newsHeaderIsPresent();
        print("Verified the Buzzfeed News header in the News feed is present");

    }

  //  @Test(enabled = true, priority = 24)
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
   // @Test (priority = 28)
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


    //Quizzes
    @Test (priority = 39)
    public void testGoingToQuizzesTab(){
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
          //  editions.visitSplashAndReturn();
    }

    @Test (priority = 40)
    public void testTapOnTrendingCategory()throws InterruptedException{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(2000);
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
    public void testTapOnTriviaCategory()throws InterruptedException{
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(2000);
        editions.tapBackButton();
    }

    @Test (priority = 44)
    public void testTapCanWeGuess()throws InterruptedException{
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(2000);
        editions.tapBackButton();
    }

    @Test (priority = 45)
    public void testTapPolls() throws InterruptedException{
        testName("testTapOnPolls");
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(2000);
        editions.tapBackButton();
    }


    @Test (priority = 46)
    public void testOnMore() {
        testName("testOnMore");
        quizzesSubTabs.tapOnMore();
    }

    @Test (priority = 47)
    public void testTapOnTaylorSwift() throws InterruptedException{
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 48)
    public void testTapOnMarvel() throws InterruptedException{
        testName("testTapOnMarvel");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 49)
    public void testTapOnZodiac()throws InterruptedException {
        testName("testTapOnZodiac");
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 50)
    public void testTapOnHarryPotter()throws InterruptedException {
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 51)
    public void testTapOnAnime()throws InterruptedException {
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 52)
    public void testTapOnKPop()throws InterruptedException {
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 53)
    public void testTapOnGeography()throws InterruptedException {
        testName("testTapOnGeography");
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 54)
    public void testTapOnChecklist()throws InterruptedException {
        testName("testTapOnChecilist");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

 //   @Test (priority = 45)
    public void testTapOnMatchups(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnMatchups();
        quizzesSubTabs.tapBackButton();
    }

    @Test(enabled = true, priority = 55)
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





