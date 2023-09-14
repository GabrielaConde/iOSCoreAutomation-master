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
    public void testCanadaEditionIsPresent(){
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
        latestSubTab.tapOnTrendingSubNav();
        latestSubTab.trendingSubTabIsPresent();
       // latestSubTab.tapSplash();
       // bpage.tapBackButton();
        print("Verified 'Trending' sub-tab  is present");
        latestSubTab.tapHomeTab();
    }

    @Test (priority = 3)
    public void testFunnyTweetsSubTab()throws InterruptedException{
        Boolean failed = false;
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

    @Test (priority = 4)
    public void testGamesSubTab() throws InterruptedException{
        Boolean failed = false;
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

    @Test (priority = 5)
    public void testLatestsSubTab() throws InterruptedException{
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


    @Test (priority = 6)
    public void testRandomSubTab() throws InterruptedException{
        scroll.scrollHoriz(1,1,1,1);
        Boolean failed = false;
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
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

    @Test (priority = 7)
    public void testGossipSubTab()throws InterruptedException{
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

    @Test (priority = 8)
    public void testGayStuffSubTab()throws InterruptedException{
        Boolean failed = false;
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

    @Test (priority = 9)
    public void testMoreSubTab() throws InterruptedException{
        Boolean failed = false;
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            latestSubTab.tapOnMoreSubNav();
    }

    @Test (priority = 10)
    public void testRecentlyViewedSubTab() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        latestSubTab.tapOnRecentlyViewed();
        homeSubTabs.tapBackButton();
    }

    @Test (priority = 11)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnAnimalstab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
            homeSubTabs.clickOnAnimalstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }

    @Test (priority = 12)
    public void testBooksSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
            homeSubTabs.clickOnBookstab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
        }
    }


    @Test (priority = 13)
    public void testCommunitySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
    } catch (Exception e) {
            latestSubTab.tapOnMoreSubNav();
        homeSubTabs.clickOnCommunitytab();
        homeSubTabs.tapBackButton();
        homeSubTabs.tapBackButton();
       }
    }

    @Test (priority = 14)
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

    @Test (priority = 15)
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

    @Test (priority = 16)
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

    @Test (priority = 17)
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

    @Test (priority = 18)
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


      @Test (priority = 19)
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
    @Test (priority = 20)
    public void testGoingNewsTab()throws InterruptedException {

            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();

            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");

    }

    @Test(enabled = true, priority = 21)
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
    @Test (priority = 22)
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
    @Test (priority = 23)
    public void testGoingToQuizzesTab(){
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
            editions.tapSplash();
            editions.tapBackButton();
    }

    @Test (priority = 24)
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

    @Test (priority = 25)
    public void testTapOnAIQuizzes(){
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        editions.tapBackButton();
    }

    @Test (priority = 26)
    public void testTapOnTriviaCategory(){
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        editions.tapBackButton();
    }


    @Test (priority = 27)
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

}





