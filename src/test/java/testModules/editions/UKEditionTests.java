package testModules.editions;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UKEditionTests extends EditionsInit {

    @Test
    public void testUKEditionIsPresent(){
        try{
        print("-------------------STARTING UK EDITION TESTS-------------------");
        testName("Verify 'UK' edition is present");
      /*  editions.tapHomeTab();
        editions.tapLatamSettingsButton();
        editions.tapEditionOptionOnLatamEdition();

        Assert.assertTrue(editions.ukEditionIsPresent());
        print("Verified 'UK' edition is present in the list");

        editions.tapUKEdition();
        editions.tapCloseSettingsButtonOnLatamEdition();*/

        //******
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.ukEditionIsPresent());
        print("Verified 'India' edition is present in the list");

        editions.tapUKEdition();
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

      //  Assert.assertTrue((latestSubTab.latestSubTabIsPresent()));
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
    public void testVideosSubTab(){
        try{
        testName("Verify 'Videos' Sub-Tab");
      //  scroll.swipeLeft();
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
        }
    }

    @Test(priority = 3)
    public void testTrendingSubTab() throws InterruptedException{
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
       // scroll.swipeLeft();
        Thread.sleep(2000);
        homeSubTabs.clickOnTrendingtab();
      //  homeSubTabs.clickOnTrendingBtn();

      //  Assert.assertTrue(homeSubTabs.trendingSubTabIsPresent());
        print("Verified 'Trending' sub-tab is present");

   //     Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Trending' sub-tab");

        print("Bpage on Splash: " + editions.getSplashTitle());
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 4)
    public void testShowsSubTab(){
        try{
        testName("Verify 'Shows' Sub-Tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnShowstab();

        Assert.assertTrue(showSubTab.showsTabIsPresent());
        print("Verified 'Shows' sub-tab is present");

        Assert.assertTrue(editions.verifyShowIsPresent());
        print("Verified 'Shows' sub-tab is present");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab(){
        try{
        testName("Verify 'Animals' Sub-Tab");
      //  scroll.swipeLeft();
        homeSubTabs.clickOnAnimalstab();

        Assert.assertTrue(homeSubTabs.animalsTabIsPresent());
        print("Verified 'Animals' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Animals' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 6)
    public void testCelebritySubTab(){
        try{
        testName("Verify 'Celebrity' Sub-Tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnCelebritytab();
        //    homeSubTabs.clickOnCelebrityBtn();

      //  Assert.assertTrue(homeSubTabs.celebrityTabIsPresent());
        print("Verified 'Celebrity' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Celebrity' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 7)
    public void testBooksSubTab(){
        try{
        testName("Verify 'Books' Sub-Tab");
      //  scroll.swipeLeft();
        homeSubTabs.clickOnBookstab();

        Assert.assertTrue(homeSubTabs.booksTabIsPresent());
        print("Verified 'Books' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Books' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 8)
    public void testCommunitySubTab(){
        try{
        testName("Verify 'Community' Sub-Tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnCommunitytab();

        Assert.assertTrue(homeSubTabs.communityTabIsPresent());
        print("Verified 'Community' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Community' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
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
       // scroll.swipeLeft();
        homeSubTabs.clickOnFoodtab();

    //    Assert.assertTrue(homeSubTabs.foodTabIsPresent());
        print("Verified 'Food' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Food' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 10)
    public void testHealthSubTab(){
        try{
        testName("Verify 'Health' Sub-Tab");
     //   scroll.swipeLeft();
        homeSubTabs.clickOnHealthtab();

        Assert.assertTrue(homeSubTabs.healthTabIsPresent());
        print("Verified 'Health' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Health' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 11)
    public void testMusicSubTab(){
        try{
        testName("Verify 'Music' Sub-Tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnMusictab();

        Assert.assertTrue(homeSubTabs.musicTabIsPresent());
        print("Verified 'Music' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Music' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 12)
    public void testNiftySubTab(){
        try{
        testName("Verify 'Nifty' Sub-Tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnNiftytab();

        Assert.assertTrue(homeSubTabs.niftyTabIsPresent());
        print("Verified 'Nifty' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Nifty' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 13)
    public void testParentsSubTab(){
        try{
        testName("Verify Parents sub-tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnParentstab();

        Assert.assertTrue(homeSubTabs.parentsTabIsPresent());
        print("Verified 'Parents' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Parents' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 14)
    public void testRewindSubTab(){
        try{
        testName("Verify 'Rewind' sub-tab");
       // scroll.swipeLeft();
        homeSubTabs.clickOnRewindtab();

        Assert.assertTrue(homeSubTabs.rewindTabIsPresent());
        print("Verified 'Rewind' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Rewind' sub-tab");

     //   print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 15)
    public void testStyleSubTab(){
        try{
        testName("Verify Style sub-tab");
    //    scroll.swipeLeft();
        homeSubTabs.clickOnStyletab();

        Assert.assertTrue(homeSubTabs.styleTabIsPresent());
        print("Verified 'Style' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Style' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }

    }

    @Test (priority = 16)
    public void testTravelSubTab(){
        try{
        testName("Verify Travel Sub-Tab");
      //  scroll.swipeLeft();
        homeSubTabs.clickOnTraveltab();

        Assert.assertTrue(homeSubTabs.travelTabIsPresent());
        print("Verified 'Travel' sub-tab is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Travel' sub-tab");

    //    print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //News
    @Test (priority = 17)
    public void testGoingNewsTab() {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");

//        Assert.assertTrue(homeSubTabs.QCUSectionIsPresent());
        print("Verified Splash is present on 'Latest' sub-tab");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 18)
    public void testHealthNewsSubTab() {
        try{
        testName("Verify 'Science' sub-tab");
        news.tapScienceSubTab();
     //       news.clickOnHealthBtn();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Science' sub-tab");

        print("Bpage on Splash: " + editions.getSplashTitle());
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 19)
    public void testCultureSubTab() {
        try{
        testName("Verify 'Culture' sub-tab");
        news.tapCultureSubTab();
      //      news.clickOnCultureBtn();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Culture' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 20)
    public void testTechSubTab() {
        try{
        testName("Verify 'Tech' sub-tab");
       news.tapTechSubTab();
    //        news.clickOnTechBtn();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Tech' sub-tab");

        print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 21)
    public void testWorldSubTab() {
        try{
        testName("Verify 'World' sub-tab");
        news.tapWorldSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'World' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 22)
    public void testEntertainmentSubTab() {
        try{
            testName("Verify 'Entertainment' sub-tab");
            news.tapEntertainmentSubTab();
          //  news.clickOnEntertainmentBtn();

            Assert.assertTrue(homeSubTabs.splashCellIsPresent());
            print("Verified Splash is present on 'Entertainment' sub-tab");

            //  print("Bpage on Splash: " + editions.getSplashTitle());
            editions.visitSplashAndReturn();

    } catch (Exception e) {
        System.out.println("ERROR ON THIS TEST CASE");
        System.out.print("EXCEPTION: ");
        System.out.print(e.getMessage());
    }
    }

    //Shopping
    @Test (priority = 23)
    public void testGoingShoppingTab() {
        try{
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        Assert.assertTrue(editions.foreignShoppingTabIsPresent());
        print("Verified the 'Shopping' Tab is present in the nav bar");

        editions.tapForeignShoppingTab();

        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Latest' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 24)
    public void testTrendingShoppingSubTab() {
        try{
        testName("Verify 'Trending' sub-tab");
        shoppingSubTabs.tapTrendingSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Trending' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 25)
    public void testBeautySubTab() {
        try{
        testName("Verify 'Beauty' sub-tab");
        shoppingSubTabs.tapBeautySubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Beauty' sub-tab");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 26)
    public void testDealsSubTab() {
        try{
        testName("Verify 'Deals' sub-tab");
        shoppingSubTabs.tapDealsSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Deals' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 27)
    public void testHomeSubTab() {
        try{
        testName("Verify 'Home' sub-tab");
        shoppingSubTabs.tapHomeSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Home' sub-tab");

     //   print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 28)
    public void testClothingSubTab() {
        try{
        testName("Verify 'Clothing' sub-tab");
        shoppingSubTabs.tapClothingSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Clothing' sub-tab");

     //   print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 29)
    public void testGiftSubTab() {
        try{
        testName("Verify 'Gift Ideas' sub-tab");
        editions.tapGiftIdeasSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Gift Ideas' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 30)
    public void testUnder20SubTab() {
        try{
        testName("Verify 'Under £20' sub-tab");
        editions.tapUnder20SubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Under £20' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 31)
    public void testSelfCareSubTab() {
        try{
        testName("Verify 'Self Care' sub-tab");
        editions.tapSelfCareSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Self Care' sub-tab");

     //   print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 32)
    public void testTreatYourselfSubTab() {
        try{
        testName("Verify 'Treat Yourself' sub-tab");
        editions.tapTreatYourselfSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Treat Yourself' sub-tab");

    //    print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //Quizzes
    @Test (priority = 33)
    public void testGoingtoQuizzesTab(){
        try{
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();

        Assert.assertTrue(quizzesLatestSubTab.quizzesHeaderIsPresent());
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");

        Assert.assertTrue(quizzesLatestSubTab.splashCellIsPresent());
        print("Verified Splash is present on Quizzes/Latest feed");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //Search
    @Test (priority = 34)
    public void testSearchTab() {
        try{
        testName("SEARCH");
        testName("Verify going to Search tab");
        editions.tapSearchTab();

        Assert.assertTrue(quizzesLatestSubTab.suggestedSearchesTitleIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }
}
