package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IndiaEditionTests2 extends EditionsInit {

       @BeforeClass
    public void onboarding() throws InterruptedException {
        editions.tapAllowButton();
        editions.tapAllowButton();
        disableAdExp.disableAdExp();
        editions.tapAllowButton();
        editions.tapOnSuscribeBtn();
    }

    @Test
    public void testIndiaEditionIsPresent() {
        //   try{
        print("-------------------STARTING INDIA EDITION TESTS-------------------");
        testName("Verify 'India' edition is present");
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.indiaEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapIndiaEdition();
        editions.tapCloseButton();
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //Home
    @Test(priority = 1)
    public void testLatestSubTab() throws InterruptedException {
        //   try{
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");

        //    Assert.assertTrue((editions.buzzfeedLogoIsPresent()));
        //    print("Verified 'BuzzFeed' logo is present on Home feed");

        //    Assert.assertTrue((editions.latestSubTabIsPresent()));
        print("Verified 'Latest' sub-tab is present on Home/Latest");

        //   Assert.assertTrue(editions.splashCellIsPresent());
        //   print("Verified 'Splash' is present on Home/Latest feed");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        homeSubTabs.tapSplash();
        // bpage.tapOnBpageTitle();
        bpage.tapBackButton();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/

    }

    @Test(priority = 2)
    public void testTrendingSubTab() {
        //    try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        //  homeSubTabs.clickOnTrendingtab();
        homeSubTabs.clickOnTrendingBtn();
        //   Assert.assertTrue(editions.trendingSubTabIsPresent());
        print("Verified 'Trending' sub-tab  is present");

        //    Assert.assertTrue(editions.splashCellIsPresent());
        //    print("Verified Splash is present on 'Trending' sub-tab");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        latestSubTab.tapBackButton();
        //  latestSubTab.backHome();
        //  homeSubTabs.
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 3)
    public void testShowsSubTab() throws InterruptedException {
        //   try{
        testName("Verify 'Shows' Sub-Tab");
        // scroll.swipeLeft();
        Thread.sleep(3000);
        homeSubTabs.clickOnShowsBtn();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
        //   homeSubTabs.clickOnShowCell();
        //    homeSubTabs.tapBackButton();
        //    homeSubTabs.tapBackButton();

        //    Thread.sleep(3000);
        //    homeSubTabs.tapAllowButton();

        //    Assert.assertTrue(showSubTab.showsTabIsPresent());
        //    print("Verified 'Shows' sub-tab is present");

        //  Assert.assertTrue(editions.verifyShowIsPresent());
        print("Verified 'Shows' sub-tab  is present");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 4)
    public void testVideosSubTab() throws InterruptedException {
        //    try{
        testName("Verify 'Videos' Sub-Tab");
        //scroll.();
        Thread.sleep(3000);
        homeSubTabs.clickOnVideosTab();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();

        //     Assert.assertTrue(editions.videosSubTabIsPresent());
        //     print("Verified 'Videos' sub-tab is present");

        //     Assert.assertTrue(homeSubTabs.firstVideoIsPresent());
        //     print("Verified First Video is present on 'Videos' sub-tab");

        //  editions.tapFirstVideo();
        //   editions.tapCloseButton();
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 5)
    public void testAnimalsSubTab() throws InterruptedException {
        //    try{
        Thread.sleep(3000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(3000);
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


    @Test(priority = 6)
    public void tapOnMore1() throws InterruptedException {
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


    @Test(priority = 7)
    public void testBooksSubTab() throws InterruptedException {
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

    @Test(priority = 8)
    public void testCelebritySubTab() {
        try {
            testName("Verify 'Celebrity' sub-tab");
            // scroll.swipeLeft();
            homeSubTabs.clickOnCelebrityBtn();

            // Assert.assertTrue(homeSubTabs.celebrityTabIsPresent());
            // print("Verified 'Celebrity' sub-tab is present");

            // Assert.assertTrue(editions.splashCellIsPresent());
            // print("Verified Splash is present on 'Celebrity' sub-tab");

            //  print("Bpage on Splash: " + editions.getSplashTitle());
            //  editions.visitSplashAndReturn();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 9)
    public void testFoodSubTab() {
        try {
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

    @Test(priority = 10)
    public void testCommunitySubTab() {
        try {
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

    @Test(priority = 11)
    public void testHealthSubTab() {
        try {
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

    @Test(priority = 12)
    public void testMusicSubTab() {
        try {
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

    @Test(priority = 13)
    public void testNiftySubTab() {
        try {
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

    @Test(priority = 14)
    public void testParentsSubTab() {
        try {
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

    @Test(priority = 15)
    public void testRewindSubTab() {
        try {
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

    @Test(priority = 16)
    public void testStyleSubTab() {
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

    @Test(priority = 17)
    public void testTravelHomeSubTab() {
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
    @Test(priority = 18)
    public void testGoingNewsTab() {
        try {
            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();

            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");

            // Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Latest' sub-tab");

            //  print("Bpage on Splash: " + editions.getSplashTitle());
            //    homeSubTabs.tapSplash();
            //    bpage.tapBackButton();
            // news.backToNews();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 19)
    public void testHealthNewsTab() throws InterruptedException {
        //    try{
        testName("Verify 'Science' sub-tab");
        //  news.tapScienceSubTab();
        Thread.sleep(3000);
        news.clickOnHealthBtn();
        Thread.sleep(3000);

        //  Assert.assertTrue(editions.splashCellIsPresent());
        print("Verified Splash is present on 'Health' sub-tab");

        //  print("Bpage on Splash: " + editions.getSplashTitle());
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
        news.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
        //  editions.visitSplashAndReturn();
        //  news.backToNews();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 20)
    public void testScienceTab() throws InterruptedException {
        try {
            testName("Verify 'Culture' sub-tab");
            //   news.tapCultureSubTab();
            Thread.sleep(3000);
            news.clickOnScienceBtn();
            Thread.sleep(3000);
            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Culture' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
            //.backHome();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 21)
    public void testPoliticsTab() throws InterruptedException {
        //  try{
        testName("Verify 'Politics' sub-tab");
        //   news.tapCultureSubTab();
        Thread.sleep(3000);
        news.clickOnCultureBtn();
        Thread.sleep(3000);
        //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        //  print("Verified Splash is present on 'Culture' sub-tab");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        news.tapBackButton();
        //.backHome();
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 22)
    public void testCultureTab() throws InterruptedException {
        try {
            testName("Verify 'Culture' sub-tab");
            //   news.tapCultureSubTab();
            Thread.sleep(3000);
            news.clickOnCultureBtn();
            Thread.sleep(3000);

            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Culture' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
            //.backHome();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 23)
    public void testTechTab() throws InterruptedException {
        try {
            testName("Verify 'Culture' sub-tab");
            //   news.tapCultureSubTab();
            Thread.sleep(3000);
            news.tapOnTech();
            Thread.sleep(3000);
            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Culture' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
            //.backHome();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 24)
    public void testClickOnMoreNews() {
        try {
            testName("Verify 'Culture' sub-tab");
            //   news.tapCultureSubTab();
            news.tapOnMore();

            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Culture' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            //.backHome();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }


    @Test(priority = 26)
    public void testWordlTab() {
        //    try{
        testName("Verify 'Entertainment' sub-tab");
        //  news.tapEntertainmentSubTab();
        news.tapOnWorld();

        //  Assert.assertTrue(editions.splashCellIsPresent());
        //  print("Verified Splash is present on 'Entertainment' sub-tab");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 27)
    public void testEntertainmentNewsTab() {
        //    try{
        testName("Verify 'Entertainment' sub-tab");
        //  news.tapEntertainmentSubTab();
        news.tapOnEntertainment();

        //  Assert.assertTrue(editions.splashCellIsPresent());
        //  print("Verified Splash is present on 'Entertainment' sub-tab");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }


    //Shopping
    @Test(priority = 28)
    public void testGoingShoppingTab() {
        try {
            testName("SHOPPING");
            testName("Verify Shopping tab / Latest sub-tab");
            //  Assert.assertTrue(editions.foreignShoppingTabIsPresent());
            //  print("Verified the 'Shopping' Tab is present in the nav bar");

            editions.tapForeignShoppingTab();

            Assert.assertTrue(editions.shoppingHeaderIsPresent());
            print("Verified the 'Shopping' header in the Shopping feed is present");

            //Assert.assertTrue(editions.splashCellIsPresent());
            //print("Verified Splash is present on 'Latest' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();

        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 29)
    public void testTrendingShoppingSubTab() {
        try {
            testName("Verify 'Trending' sub-tab");
            editions.tapTrendingSubTab();

            //    Assert.assertTrue(editions.splashCellIsPresent());
            //    print("Verified Splash is present on 'Trending' sub-tab");

            //   print("Bpage on Splash: " + editions.getSplashTitle());
            //   editions.visitSplashAndReturn();
            news.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();

        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 30)
    public void testBeautySubTab() {
        try {
            testName("Verify 'Beauty' sub-tab");
            shoppingSubTabs.tapBeautySubTab();

            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Beauty' sub-tab");
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 31)
    public void testDealsSubTab() {
        try {
            testName("Verify 'Deals' sub-tab");
            shoppingSubTabs.tapDealsSubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Deals' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 32)
    public void testHomeSubTab() {
        try {
            testName("Verify 'Home' sub-tab");
            shoppingSubTabs.tapHomeSubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Home' sub-tab");

            //  print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  // @Test(priority = 33)
    public void testClothingSubTab() {
        try {
            testName("Verify 'Clothing' sub-tab");
            shoppingSubTabs.tapClothingSubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Clothing' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 34)
    public void testClickShoppingOnMoreNews() {
        try {
            testName("Verify 'Culture' sub-tab");
            //   news.tapCultureSubTab();
            news.tapOnMore();

            //  Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            //  print("Verified Splash is present on 'Culture' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            //.backHome();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }


    @Test(priority = 35)
    public void testGiftSubTab() {
        try {
            testName("Verify 'Gift Ideas' sub-tab");
            editions.tapGiftIdeasSubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Gift Ideas' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 36)
    public void testUnder50SubTab() {
        try {
            testName("Verify 'Under $50' sub-tab");
            editions.tapUnder1000SubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Under $50' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 37)
    public void testBooksShoppingSubTab() {
        try {
            testName("Verify 'Self Care' sub-tab");
            editions.tapBooksSubTab();

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Self Care' sub-tab");

            //  print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 38)
    public void testFoodfSubTab() {
        try {
            testName("Verify 'Treat Yourself' sub-tab");
            editions.tapFoodSubTab();

            //   Assert.assertTrue(editions.splashCellIsPresent());
            //   print("Verified Splash is present on 'Treat Yourself' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 39)
    public void testSelfCareSubTab() {
        try {
            testName("Verify 'Treat Yourself' sub-tab");
            editions.tapSelfCareSubTab();

            //   Assert.assertTrue(editions.splashCellIsPresent());
            //   print("Verified Splash is present on 'Treat Yourself' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 40)
    public void testWorthEveryRupeeSubTab() {
        try {
            testName("Verify 'Treat Yourself' sub-tab");
            editions.tapWorthEveryRupeeSubTab();

            //   Assert.assertTrue(editions.splashCellIsPresent());
            //   print("Verified Splash is present on 'Treat Yourself' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }



    //Quizzes
    @Test(priority = 41)
    public void testGoingToQuizzesTab() {
        try {
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();

            //   Assert.assertTrue(editions.quizzesHeaderIsPresent());
            //   print("Verified 'Quizzes' header is present on Quizzes/Latest feed");

            //   Assert.assertTrue(editions.splashCellIsPresent());
            //   print("Verified Splash is present on Quizzes/Latest feed");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 42)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.visitSplashAndReturn();
    }

    @Test (priority = 43)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

    @Test (priority = 44)
    public void testTapOnFoodCategory(){
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnFood();
        editions.visitSplashAndReturn();
    }

    @Test (priority = 45)
    public void testTapOnTriviaCategory(){
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnFood();
        editions.visitSplashAndReturn();
    }

    @Test (priority = 46)
    public void testTapOnMore(){
        testName("testTapOnMore");
        testName("Verify tapping on More btn");
        quizzesSubTabs.tapOnMore();
    }

    @Test (priority = 47)
    public void testTapCanWeGuess(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
    }

    @Test (priority = 48)
    public void testTapOnDisney(){
        testName("testTapOnDisney");
        quizzesSubTabs.tapOnDisney();
    }

    @Test (priority = 49)
    public void testTapWhoAreYou(){
        testName("testTapWhoAreYou");
        quizzesSubTabs.tapOnWhoAreYou();
    }

    @Test (priority = 50)
    public void testTapOnLove(){
        testName("testTapOnLove");
        quizzesSubTabs.tapOnLove();
    }

    //Search
    @Test(priority = 51)
    public void testSearchTab() {
        try {
            testName("SEARCH");
            testName("Verify going to Search tab");
            editions.tapSearchTab();

            Assert.assertTrue(editions.suggestedSearchesTitleIsPresent());
            print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

}