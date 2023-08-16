package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.WaitersPage;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.security.auth.login.FailedLoginException;
import java.util.concurrent.TimeUnit;

public class CanadaEditionTests2 extends EditionsInit {

 //   @BeforeClass
    public void onboarding() throws InterruptedException{
        editions.tapAllowButton();
        editions.tapAllowButton();
        disableAdExp.disableAdExp();
        editions.tapAllowButton();
        editions.tapOnSuscribeBtn();
    }

    @Test
    public void testAustraliaEditionIsPresent(){
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.canadaEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapCanadaEdition();
        editions.tapCloseButton();
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
    }

    @Test(priority = 2)
    public void testTrendingSubTab(){
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        homeSubTabs.clickOnTrendingBtn();
        print("Verified 'Trending' sub-tab  is present");
        latestSubTab.tapHomeTab();
    }

    @Test (priority = 3)
    public void testShowsSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            testName("Verify 'Shows' Sub-Tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Thread.sleep(3000);
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
            print("Verified 'Shows' sub-tab  is present");
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnShowstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 4)
    public void testVideosSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Videos' Sub-Tab");
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Thread.sleep(2000);
        homeSubTabs.clickOnVideosTab();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed = false;
            try{
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(2000);
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
            } catch (Exception e) {
                latestSubTab.tapOnMore();
                homeSubTabs.clickOnAnimalstab();
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
        bpage.tapBackButton();
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
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCelebritytab();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
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
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnFoodBtn();
            latestSubTab.tapBackButton();
    } catch (Exception e) {
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodBtn();
        homeSubTabs.tapBackButton();
        homeSubTabs.tapBackButton();
       }
    }

    @Test (priority = 10)
    public void testCommunitySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
    } catch (Exception e) {
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
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnMusic();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            latestSubTab.tapOnMusic();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 13)
    public void testNiftySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnNifty();
            bpage.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMore();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }

    }

    @Test (priority = 14)
    public void testParentsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
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
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
           } catch (Exception e) {
               latestSubTab.tapOnMore();
               latestSubTab.tapOnParents();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }
    }

    @Test (priority = 16)
    public void testStyleSubTab()throws InterruptedException{
          Boolean failed= false;
          try{
            latestSubTab.tapOnStyle();
            homeSubTabs.tapBackButton();
          } catch (Exception e) {
              latestSubTab.tapOnMore();
              latestSubTab.tapOnParents();
              homeSubTabs.tapBackButton();
              homeSubTabs.tapBackButton();
          }

    }


      @Test (priority = 16)
    public void testTravelSubTab()throws InterruptedException{
           Boolean failed= false;
           try{
            testName("Verify Travel sub-tab");
            homeSubTabs.clickOnTraveltab();
            editions.tapBackButton();
           } catch (Exception e) {
               latestSubTab.tapOnMore();
               homeSubTabs.clickOnTraveltab();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
           }
    }

    //News
    @Test (priority = 18)
    public void testGoingNewsTab()throws InterruptedException {

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


    //Quizzes
    @Test (priority = 39)
    public void testGoingToQuizzesTab(){
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
            editions.tapSplash();
            editions.tapBackButton();
    }

    @Test (priority = 40)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapSplash();
        editions.tapBackButton();
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
        editions.tapBackButton();
    }


    @Test (priority = 45)
    public void testTapCanWeGuess(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        editions.tapBackButton();
    }

   // @Test (priority = 46)
    public void testTapOnMatchups(){
        testName("testTapOnDisney");
        quizzesSubTabs.tapOnMatchups();
        editions.tapBackButton();
    }

    @Test(enabled = true, priority = 49)
    public void tapGamesTab(){
        try{
            news.tapGamesTab();
            news.tapHomeTab();
         //   news.tapBackButton();
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

}





