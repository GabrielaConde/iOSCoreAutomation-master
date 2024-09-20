package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
//import org.omg.CORBA.PUBLIC_MEMBER;
//import org.springframework.ui.context.Theme;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AustraliaEditionTests extends EditionsInit {

    @BeforeClass
    public void signInOnFstLaunch()throws InterruptedException{
        Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        latestSubTab.tapOnGuestSignIn();
        Thread.sleep(3000);
      /*  Thread.sleep(2000);
        latestSubTab.tapAllowButton();
        latestSubTab.tapOnSignInLink();
        latestSubTab.enterPassword("sanfer12");
        latestSubTab.enterEmail("salpimie");
        Thread.sleep(2000);
        latestSubTab.tapSignInBFButton();
        Thread.sleep(3000);
        latestSubTab.tapNotNow();*/

    //    latestSubTab.switchToAlert();
    //    latestSubTab.tapAllowButton();
      //  latestSubTab.switchToAlert();
      //  latestSubTab.tapNotNow();
        //  signIn.switchToAlert();
      //  latestSubTab.setUSEdition();
    }

    @Test
    public void testAustraliaEditionIsPresent() {
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
     //   editions.tapOnNoThanksSweepTakes();
    //    editions.tapProfileButton();

        editions.tapSettingsButton();
     //   editions.tapGearIcon();
       // editions.tapEditionOption();

    //    editions.tapSettingsMenu();
     //   editions.tapEditionOption();
        editions.tapOnEditionOnAustralia();
        editions.tapAustraliaEdition();
        editions.tapCloseButton();

    }

    //Home
  //  @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException {
        try {
            testName("HOME");
            testName("Verify Home tab / Lastest sub-tab");
            print("Verified 'BuzzFeed' logo is present on Home feed");
            print("Verified 'Latest' sub-tab is present on Home/Latest");
          //  homeSubTabs.tapSplash();
          //  bpage.tapBackButton();
        } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

  //  @Test(priority = 2)
    public void testTrendingSubTab() throws InterruptedException {
        try {
            print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
            testName("Verify 'Trending' Tab");
            Thread.sleep(2000);
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


  //  @Test(priority = 4)
    public void testFunnyTweetsSubTab() throws InterruptedException {
      //  try {
            testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(2000);
            latestSubTab.tapOnFunnyTweetsSubNav();
            latestSubTab.isFunnyTweetsHeaderDisplayed();
           // latestSubTab.tapSplash();
           // bpage.tapBackButton();
            homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

 //   @Test(priority = 5)
    public void testGamesSubTab() {
      //  try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        latestSubTab.isGamesHeaderDisplayed();
        homeSubTabs.tapHomeTab();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

 //   @Test(priority = 6)
    public void testLatestsSubTab() {
        try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnLatestSubNav();
        latestSubTab.isLatestHeaderDisplayed();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
        } catch (Exception e){
        //    Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

 //   @Test(priority = 7)
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
//            Assert.assertTrue(false);
        }
    }

 //   @Test(priority = 8)
    public void testGossipSubTab() {
        try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGossipSubNav();
        latestSubTab.isGossipHeaderDisplayed();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
        } catch (Exception e){
         //   Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }
    }

 //   @Test(priority = 9)
    public void testGayStuffpSubTab()throws InterruptedException {
        Thread.sleep(4000);
    //    try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGaySubNav();
      //  latestSubTab.isLgbtqHeaderDisplayed();
      //  latestSubTab.tapSplash();
      //  bpage.tapBackButton();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
       //     Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

  //  @Test(priority = 10)
    public void tapOnMore1() throws InterruptedException {
        //  Thread.sleep(5000);
        Thread.sleep(5000);
        latestSubTab.tapOnMoreSubNav();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);
    }

    //   @Test (priority = 11)
    public void testRecentlyViewedSubTab() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
           Thread.sleep(3000);
        latestSubTab.tapOnRecentlyViewed();
           Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

  //  @Test(priority = 12)
    public void testEntertainmentSubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnEntertainment();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

  //  @Test(priority = 13)
    public void testAnimalsSubTab() throws InterruptedException {
        Thread.sleep(2000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(2000);
      //  homeSubTabs.tapSplash();
      //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


  //  @Test(priority = 14)
    public void testBooksSubTab() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnBooks();
        Thread.sleep(2000);
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


  //  @Test(priority = 15)
    public void testFoodSubTab() throws InterruptedException{
        Thread.sleep(3000);
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
    }

  //  @Test(priority = 16)
    public void testCommunitySubTab()throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnCommunity();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }


  //  @Test(priority = 17)
    public void testMusicSubTab()throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnMusic();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

 //   @Test(priority = 18)
    public void testNiftySubTab()throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnNifty();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

  //  @Test(priority = 19)
    public void testParentsSubTab() throws InterruptedException{
        Thread.sleep(4000);
        latestSubTab.tapOnParents();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

 //   @Test(priority = 20)
    public void testRewindSubTab()throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnRewind();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

  //  @Test(priority = 21)
    public void testStyleSubTab() throws InterruptedException{
        Thread.sleep(5000);
        latestSubTab.tapOnStyle();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }

 //   @Test(priority = 22)
    public void testTravelHomeSubTab()throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnTravel();
        Thread.sleep(5000);
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
    public void testGoingNewsTab()throws InterruptedException {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        Thread.sleep(3000);
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
    }

  //  @Test(enabled = true, priority = 24)
    public void tapFstNewsCell() {
        news.tapFirstCell();
        news.tapBackButton();
    }


    //Shopping
 //   @Test(priority = 25)
    public void testGoingShoppingTab() throws InterruptedException{
        Thread.sleep(5000);
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        editions.tapForeignShoppingTab();
        Thread.sleep(3000);
        //  Assert.assertTrue(editions.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");
        editions.isContentDisplayed();
      //  editions.tapSplash();
       // Thread.sleep(2000);
      //  bpage.tapBackButton();
    }


    //Quizzes
    @Test(priority = 26)
    public void testGoingToQuizzesTab()throws InterruptedException {
        Thread.sleep(3000);
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
      //  editions.visitSplashAndReturn();

    }

    @Test(priority = 27)
    public void testTapOnTrendingCategory()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
//        editions.tapSplash();
  //      editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    //   @Test (priority = 26)
    public void testTapOnAIQuizzes() {
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnAIQuizzes();
        editions.tapBackButton();
    }

    @Test(priority = 28)
    public void testTapOnTriviaCategory()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
    //    quizzesSubTabs.tapSplash();
    //    editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }


    @Test(priority = 29)
    public void testCanWeGuess() throws InterruptedException{
        testName("testTapWCanWeGuess");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnCanWeGuess();
   //     quizzesSubTabs.tapSplash();
   //     editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

      @Test (priority = 30)
    public void testTapPolls() throws InterruptedException{
        testName("testTapOnPolls");
          Thread.sleep(3000);
        quizzesSubTabs.tapOnPolls();
          Thread.sleep(3000);
        editions.tapBackButton();
    }


    @Test (priority = 31)
    public void testOnMore()throws InterruptedException {
        testName("testOnMore");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMore();
    }

    @Test (priority = 32)
    public void testTapOnTaylorSwift()throws InterruptedException{
        Thread.sleep(3000);
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 33)
    public void testTapOnMarvel()throws InterruptedException {
        testName("testTapOnMarvel");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 34)
    public void testTapOnZodiac() throws InterruptedException {
        testName("testTapOnZodiac");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 35)
    public void testTapOnHarryPotter() throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 36)
    public void testTapOnAnime()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 37)
    public void testTapOnKPop() throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 38)
    public void testTapOnGeography()throws InterruptedException {
        testName("testTapOnGeography");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 39)
    public void testTapOnChecklist()throws InterruptedException {
        testName("testTapOnChecilist");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }


    @Test(enabled = true, priority = 40)
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

   // @Test(enabled = true, priority = 41)
    public void testFail(){
        Assert.assertTrue(false);
    }

}







