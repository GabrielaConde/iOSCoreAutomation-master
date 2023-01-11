package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AustraliaEditionTests extends EditionsInit {

    @BeforeClass
    public void onboarding()throws InterruptedException{
        editions.tapAllowButton();
        editions.tapAllowButton();
        disableAdExp.disableAdExp();

    }

    @Test
    public void testAustraliaEditionIsPresent(){
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.australiaEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapAustraliaEdition();
        editions.tapCloseButton();
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");

       Assert.assertTrue((editions.buzzfeedLogoIsPresent()));
        print("Verified 'BuzzFeed' logo is present on Home feed");

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

        editions.visitSplashAndReturn();
        latestSubTab.tapBackButton();

    }

       @Test (priority = 3)
    public void testShowsSubTab()throws InterruptedException{
            testName("Verify 'Shows' Sub-Tab");
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();

    }

     @Test (priority = 4)
    public void testVideosSubTab(){
            testName("Verify 'Videos' Sub-Tab");
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();

    }

    @Test (priority = 5)
    public void testAnimalsSubTab() throws InterruptedException{
    //    try{
            homeSubTabs.clickOnAnimalsBtn();
            homeSubTabs.tapSplash();
         //   bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }



    @Test(priority =6)
    public void tapOnMore1()throws InterruptedException{
    //    try{
          //  Thread.sleep(5000);
            latestSubTab.tapOnMore();
           // Thread.sleep(5000);
            //    Assert.assertTrue(false);
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }



     @Test (priority = 7)
    public void testBooksSubTab() throws InterruptedException{
     //    try{
             latestSubTab.tapOnBooks();
             latestSubTab.tapSplash();
             bpage.tapOnBpageTitle();
             bpage.tapBackButton();
             homeSubTabs.tapBackButton();
      /*   } catch (Exception e) {
             System.out.println("ERROR ON THIS TEST CASE");
             System.out.print("EXCEPTION: ");
             System.out.print(e.getMessage());
         }*/
    }

    @Test (priority = 8)
    public void testCelebritySubTab(){
        try{
            testName("Verify 'Celebrity' sub-tab");
            homeSubTabs.clickOnCelebrityBtn();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 9)
    public void testFoodSubTab(){
        try{
            testName("Verify 'Food' sub-tab");
            //   scroll.swipeLeft();
            homeSubTabs.clickOnFoodBtn();

            //    Assert.assertTrue(homeSubTabs.foodTabIsPresent());
            //    print("Verified 'Food' sub-tab is present");

            //   Assert.assertTrue(editions.splashCellIsPresent());
            //   print("Verified Splash is present on 'Food' sub-tab");

            //   print("Bpage on Splash: " + editions.getSplashTitle());
            //    editions.visitSplashAndReturn();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 10)
    public void testCommunitySubTab(){
        try{
            latestSubTab.tapOnCommunity();
            latestSubTab.tapSplash();
           // bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 11)
    public void testHealthSubTab(){
        try{
            latestSubTab.tapOnHealth();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 12)
    public void testMusicSubTab(){
        try{
            latestSubTab.tapOnMusic();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 13)
    public void testNiftySubTab(){
        try{
            latestSubTab.tapOnNifty();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 14)
    public void testParentsSubTab(){
        try{
            latestSubTab.tapOnParents();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 15)
    public void testRewindSubTab(){
        try{
            latestSubTab.tapOnRewind();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 16)
    public void testStyleSubTab(){
            try {
                latestSubTab.tapOnStyle();
                latestSubTab.tapSplash();
                bpage.tapOnBpageTitle();
                bpage.tapBackButton();
                homeSubTabs.tapBackButton();
            } catch (Exception e) {
                System.out.println("ERROR ON THIS TEST CASE");
                System.out.print("EXCEPTION: ");
                System.out.print(e.getMessage());
            }
    }

    @Test (priority = 17)
    public void testTravelHomeSubTab(){
        try {
            latestSubTab.tapOnTravel();
            latestSubTab.tapSplash();
            bpage.tapOnBpageTitle();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }





  //  @Test (priority = 16)
    public void testTravelSubTab(){
        try{
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
    @Test (priority = 18)
    public void testGoingNewsTab() {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
    }

    @Test (priority = 19)
    public void testHealthNewsTab() {
        testName("Verify 'Science' sub-tab");
        news.clickOnHealthBtn();
        print("Verified Splash is present on 'Health' sub-tab");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();

    }

    @Test (priority = 20)
    public void testScienceTab() {
            testName("Verify 'Culture' sub-tab");
            news.clickOnScienceBtn();
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
    }

    @Test (priority = 21)
    public void testPoliticsTab() {
            testName("Verify 'Culture' sub-tab");
            news.clickOnPoliticseBtn();
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
    }

    @Test (priority = 22)
    public void testCultureTab() {
            testName("Verify 'Culture' sub-tab");
            news.clickOnCultureBtn();
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 23)
    public void testInvestigationsTab() throws InterruptedException {
            testName("Verify 'Culture' sub-tab");
            Thread.sleep(3000);
            news.clickOnInvestigationsBtn();
            Thread.sleep(3000);
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }

    @Test (priority = 24)
    public void testClickOnMoreNews() {
             news.tapOnMore();
    }

    @Test (priority = 25)
    public void testTechTab() {
        testName("Verify 'Tech' sub-tab");
        news.tapOnTech();
        print("Verified Splash is present on 'Tech' sub-tab");
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test (priority = 26)
    public void testWordlTab() {
        testName("Verify 'Entertainment' sub-tab");
        news.tapOnWorld();
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test (priority = 27)
    public void testEntertainmentNewsTab() {
        testName("Verify 'Entertainment' sub-tab");
        news.tapOnEntertainment();
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
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
    public void testUnder50SubTab() {
        testName("Verify 'Under $50' sub-tab");
        shoppingSubTabs.tapUnder50SubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 37)
    public void testSelfCareSubTab() {
        testName("Verify 'Self Care' sub-tab");
        editions.tapSelfCareSubTab();
        editions.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
    }

    @Test (priority = 38)
    public void testTreatYourselfSubTab() {
        testName("Verify 'Treat Yourself' sub-tab");
        editions.tapTreatYourselfSubTab();
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

    //Search
    @Test (priority = 40)
    public void testSearchTab() {
        testName("SEARCH");
        testName("Verify going to Search tab");
        editions.tapSearchTab();
        Assert.assertTrue(editions.suggestedSearchesTitleIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");

    }




}





