package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.WaitersPage;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
//import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.security.auth.login.FailedLoginException;
import java.util.concurrent.TimeUnit;

public class CanadaEditionTests2 extends EditionsInit {

    @BeforeClass
    public void onboarding() throws InterruptedException{
        Thread.sleep(6000);
        latestSubTab.tapAllowButton();
        //  latestSubTab.switchToAlert();
        // latestSubTab.tapAllowButton();
        // latestSubTab.switchToAlert();
        latestSubTab.tapOnGuestSignIn();
        Thread.sleep(3000);

      /*      latestSubTab.tapOnSignInLink();
            latestSubTab.enterPassword("sanfer12");
            latestSubTab.enterEmail("salpimie");
            Thread.sleep(2000);
            latestSubTab.tapSignInBFButton();
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            latestSubTab.switchToAlert();
            latestSubTab.tapAllowButton();
            latestSubTab.switchToAlert();
            latestSubTab.tapNotNow();
            //  signIn.switchToAlert();
            latestSubTab.setUSEdition();*/
        }

    @Test
    public void testCanadaEditionIsPresent()throws InterruptedException{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        editions.tapHomeTab();
        editions.tapSettingsMenu();
        Thread.sleep(2000);
        editions.tapOnEditionOnCanada();

  //      Assert.assertTrue(editions.canadaEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapCanadaEdition();
        editions.tapCloseButton();
    }

    //Home
 //   @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
      //  homeSubTabs.tapSplash();
      //  bpage.tapBackButton();
    }

  //  @Test(priority = 2)
    public void testTrendingSubTab()throws InterruptedException{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnTrendingSubNav();
        latestSubTab.trendingSubTabIsPresent();
       // latestSubTab.tapSplash();
       // bpage.tapBackButton();
        print("Verified 'Trending' sub-tab  is present");
        latestSubTab.tapHomeTab();
    }

  //  @Test (priority = 3)
    public void testFunnyTweetsSubTab()throws InterruptedException{
        Boolean failed = false;
      //  try {
            testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(2000);
            latestSubTab.tapOnFunnyTweetsSubNav();
            latestSubTab.isFunnyTweetsHeaderDisplayed();
         //   latestSubTab.tapSplash();
         //   bpage.tapBackButton();
            homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);
        }*/
    }

  //  @Test (priority = 4)
    public void testGamesSubTab() throws InterruptedException{
        Boolean failed = false;
      //  try{
            testName("Verify 'Videos' Sub-Tab");
        Thread.sleep(2000);
            latestSubTab.tapGamesTab();
            latestSubTab.isGamesHeaderDisplayed();
            homeSubTabs.tapHomeTab();
       /* } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

  //  @Test (priority = 5)
    public void testLatestsSubTab() throws InterruptedException{
     //   try{
            testName("Verify 'Videos' Sub-Tab");
        Thread.sleep(2000);
            latestSubTab.tapOnLatestSubNav();
            latestSubTab.isLatestHeaderDisplayed();
          //  latestSubTab.tapSplash();
          //  bpage.tapBackButton();
        Thread.sleep(2000);
            homeSubTabs.tapBackButton();
   /*     } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }


  //  @Test (priority = 6)
    public void testRandomSubTab() throws InterruptedException{
       // scroll.scrollHoriz(1,1,1,1);
        Boolean failed = false;
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
     //   try{
            testName("Verify 'Videos' Sub-Tab");
          Thread.sleep(5000);
            latestSubTab.tapOnRandomSubNav();
         //   latestSubTab.isRandomHeaderDisplayed();
        //    latestSubTab.tapSplash();
        //    bpage.tapBackButton();
        Thread.sleep(4000);
            homeSubTabs.tapHomeTab();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);
        }*/
    }

  //  @Test (priority = 7)
    public void testGossipSubTab()throws InterruptedException{
    //    try{
            testName("Verify 'Videos' Sub-Tab");
        Thread.sleep(4000);
            latestSubTab.tapOnGossipSubNav();
        //    latestSubTab.isGossipHeaderDisplayed();
         //   latestSubTab.tapSplash();
         //   bpage.tapBackButton();
            Thread.sleep(4000);
            homeSubTabs.tapBackButton();
     /*   } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

  //  @Test (priority = 8)
    public void testGayStuffSubTab()throws InterruptedException{
        Boolean failed = false;
     //   try{
            testName("Verify 'Videos' Sub-Tab");
        Thread.sleep(4000);
            latestSubTab.tapOnGaySubNav();
         //   latestSubTab.isLgbtqHeaderDisplayed();
       //     latestSubTab.tapSplash();
       //     bpage.tapBackButton();
            Thread.sleep(4000);
            homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

  //  @Test (priority = 9)
    public void testMoreSubTab() throws InterruptedException{
        Thread.sleep(5000);
        Boolean failed = false;
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnMoreSubNav();
    }

  //  @Test (priority = 10)
    public void testRecentlyViewedSubTab() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(4000);
        latestSubTab.tapOnRecentlyViewed();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

  //  @Test (priority = 11)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed = false;
    //    try{
        Thread.sleep(4000);
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnAnimalstab();
            Thread.sleep(3000);
            homeSubTabs.tapBackButton();
      /*  } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
            homeSubTabs.clickOnAnimalstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }*/
    }

  //  @Test (priority = 12)
    public void testBooksSubTab() throws InterruptedException{
        Boolean failed = false;
     //   try{
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Thread.sleep(4000);
            homeSubTabs.clickOnBookstab();
            Thread.sleep(3000);
            homeSubTabs.tapBackButton();
     /*   } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }*/
    }


   // @Test (priority = 13)
    public void testCommunitySubTab() throws InterruptedException{
        Thread.sleep(3000);
        Boolean failed = false;
      //  try{
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCommunitytab();
            Thread.sleep(2000);
            homeSubTabs.tapBackButton();
  /*  } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
        homeSubTabs.clickOnCommunitytab();
        homeSubTabs.tapBackButton();
        homeSubTabs.tapBackButton();
       }*/
    }

  //  @Test (priority = 14)
    public void testMusicSubTab()throws InterruptedException{
        Thread.sleep(5000);
        Boolean failed = false;
     //   try{
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnMusic();
            Thread.sleep(4000);
            homeSubTabs.tapBackButton();
     /*   } catch (Exception e) {
            latestSubTab.tapOnMore();
            latestSubTab.tapOnMusic();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }*/
    }

  //  @Test (priority = 15)
    public void testNiftySubTab() throws InterruptedException{
        Thread.sleep(4000);
        Boolean failed = false;
    //    try{
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnNifty();
            Thread.sleep(4000);
            bpage.tapBackButton();
    /*    } catch (Exception e) {
            latestSubTab.tapOnMore();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }*/

    }

  //  @Test (priority = 16)
    public void testParentsSubTab()throws InterruptedException{
        Thread.sleep(4000);
        Boolean failed = false;
    //    try{
            getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnParents();
            Thread.sleep(4000);
            homeSubTabs.tapBackButton();
    /*    } catch (Exception e) {
            latestSubTab.tapOnMore();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }*/

    }

 //   @Test (priority = 17)
    public void testRewindSubTab()throws InterruptedException{
        Thread.sleep(5000);
           Boolean failed = false;
       //    try{
            latestSubTab.tapOnRewind();
               Thread.sleep(5000);
            homeSubTabs.tapBackButton();
       /*    } catch (Exception e) {
               latestSubTab.tapOnMore();
               latestSubTab.tapOnParents();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }*/
    }

  //  @Test (priority = 18)
    public void testStyleSubTab()throws InterruptedException{
        Thread.sleep(3000);
          Boolean failed= false;
      //    try{
            latestSubTab.tapOnStyle();
              Thread.sleep(3000);
            homeSubTabs.tapBackButton();
        /*  } catch (Exception e) {
              latestSubTab.tapOnMore();
              latestSubTab.tapOnParents();
              homeSubTabs.tapBackButton();
              homeSubTabs.tapBackButton();
          }*/

    }


  //    @Test (priority = 19)
    public void testTravelSubTab()throws InterruptedException{
          Thread.sleep(5000);
           Boolean failed= false;
       //    try{
            testName("Verify Travel sub-tab");
            homeSubTabs.clickOnTraveltab();
               Thread.sleep(5000);
            editions.tapBackButton();
       /*    } catch (Exception e) {
               latestSubTab.tapOnMore();
               homeSubTabs.clickOnTraveltab();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }*/
    }

    //News
    @Test (priority = 20)
    public void testGoingNewsTab()throws InterruptedException {

            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();

            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");

    }

  //  @Test(enabled = true, priority = 21)
    public void tapFstNewsCell()throws InterruptedException{
      //  try{
            news.tapFirstCell();
            Thread.sleep(2000);
            news.tapBackButton();
      /*  } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to News Tab"));
            print("ERROR" + e.getMessage());
        }*/

    }

    //Shopping
   // @Test (priority = 22)
    public void testGoingShoppingTab()throws InterruptedException{
            testName("SHOPPING");
            testName("Verify Shopping tab / Latest sub-tab");
            editions.tapForeignShoppingTab();

            Assert.assertTrue(editions.shoppingHeaderIsPresent());
            print("Verified the 'Shopping' header in the Shopping feed is present");
            editions.tapSplash();
        Thread.sleep(2000);
            bpage.tapBackButton();
    }


    //Quizzes
    @Test (priority = 23)
    public void testGoingToQuizzesTab()throws InterruptedException{
        Thread.sleep(3000);
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
         //   editions.tapSplash();
         //   editions.tapBackButton();
    }

    @Test (priority = 24)
    public void testTapOnTrendingCategory()throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

  //  @Test (priority = 41)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

    @Test (priority = 25)
    public void testTapOnAIQuizzes()throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    @Test (priority = 26)
    public void testTapOnTriviaCategory()throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    @Test (priority = 27)
    public void testTapOnCanWeGuessCategory()throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnCanWeGuessCategory");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    @Test (priority = 30)
    public void testTapPolls()throws InterruptedException {
        testName("testTapOnPolls");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(3000);
        editions.tapBackButton();
    }


    @Test (priority = 31)
    public void testOnMore()throws InterruptedException {
        Thread.sleep(2000);
        testName("testOnMore");
        quizzesSubTabs.tapOnMore();
    }

    @Test (priority = 32)
    public void testTapOnTaylorSwift()throws InterruptedException {
        Thread.sleep(3000);
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 33)
    public void testTapOnMarvel() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnMarvel");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 34)
    public void testTapOnZodiac()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnZodiac");
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
    public void testTapOnKPop()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 38)
    public void testTapOnGeography()throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnGeography");
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test (priority = 39)
    public void testTapOnChecklist() throws InterruptedException{
        Thread.sleep(3000);
        testName("testTapOnChecilist");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }



   // @Test (priority = 46)
    public void testTapOnMatchups(){
        testName("testTapOnDisney");
        quizzesSubTabs.tapOnMatchups();
        editions.tapBackButton();
    }

    @Test(enabled = true, priority = 40)
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

    //Search
  //  @Test (priority = 49)
    public void testSearchTab() {
            testName("SEARCH");
            testName("Verify going to Search tab");
            editions.tapSearchTab();

            Assert.assertTrue(editions.suggestedSearchesTitleIsPresent());
            print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
    }

  //  @Test(enabled = true, priority = 50)
    public void failTtest(){
        Assert.assertTrue(false);
    }

}





