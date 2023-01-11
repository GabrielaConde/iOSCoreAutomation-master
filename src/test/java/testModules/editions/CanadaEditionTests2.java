package testModules.editions;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.security.auth.login.FailedLoginException;

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

        latestSubTab.tapBackButton();
    }

    @Test (priority = 3)
    public void testShowsSubTab()throws InterruptedException{
        Boolean failed = false;
        try {
            testName("Verify 'Shows' Sub-Tab");
            Thread.sleep(3000);
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
            print("Verified 'Shows' sub-tab  is present");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("The item menu was not located where it should be");
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

    @Test (priority = 4)
    public void testVideosSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Videos' Sub-Tab");
        Thread.sleep(3000);
        homeSubTabs.clickOnVideosTab();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print("The item menu was not located where it should be");
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnVideosTab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 5)
    public void testAnimalsSubTab() throws InterruptedException{
        Boolean failed = false;
            try{
        Thread.sleep(3000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(3000);
        homeSubTabs.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
            } catch (Exception e) {
                System.out.println("ERROR ON THIS TEST CASE");
                System.out.print("EXCEPTION: ");
                System.out.print(e.getMessage());
                Thread.sleep(5000);
                latestSubTab.tapOnMore();
                homeSubTabs.clickOnAnimalstab();
                homeSubTabs.tapBackButton();
                homeSubTabs.tapBackButton();
                failed = true;
                Assert.assertFalse(failed);
            }
    }


    @Test (priority = 7)
    public void testBooksSubTab() throws InterruptedException{
        Boolean failed = false;
        try{
        latestSubTab.tapOnMore();
        homeSubTabs.clickOnBookstab();
        bpage.tapBackButton();
    } catch (Exception e) {
        System.out.println("ERROR ON THIS TEST CASE");
        System.out.print("EXCEPTION: ");
        System.out.print(e.getMessage());
        latestSubTab.tapBackButton();
            Thread.sleep(2000);
        homeSubTabs.clickOnBookstab();
        homeSubTabs.tapBackButton();
        failed = true;
        Assert.assertFalse(failed);
      }
    }

    @Test (priority = 8)
    public void testCelebritySubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Celebrity' sub-tab");
            Thread.sleep(3000);
            latestSubTab.tapOnMore();
            Thread.sleep(2000);
            homeSubTabs.clickOnCelebritytab();
            latestSubTab.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            latestSubTab.tapBackButton();
            Thread.sleep(5000);
            homeSubTabs.clickOnCelebritytab();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 9)
    public void testFoodSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Food' sub-tab");
            Thread.sleep(2000);
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnFoodBtn();
            latestSubTab.tapBackButton();
    } catch (Exception e) {
        System.out.println("ERROR ON THIS TEST CASE");
        System.out.print("EXCEPTION: ");
        System.out.print(e.getMessage());
        Thread.sleep(5000);
        latestSubTab.tapBackButton();
        homeSubTabs.clickOnShowsBtn();
        homeSubTabs.tapBackButton();
        homeSubTabs.tapBackButton();
        failed = true;
        Assert.assertFalse(failed);
       }
    }

    @Test (priority = 10)
    public void testCommunitySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnCommunitytab();
            homeSubTabs.tapBackButton();
    } catch (Exception e) {
        System.out.println("ERROR ON THIS TEST CASE");
        System.out.print("EXCEPTION: ");
        System.out.print(e.getMessage());
        Thread.sleep(5000);
        latestSubTab.tapBackButton();
        homeSubTabs.clickOnCommunitytab();
        homeSubTabs.tapBackButton();
        homeSubTabs.tapBackButton();
        failed = true;
        Assert.assertFalse(failed);
    }
    }

    @Test (priority = 11)
    public void testHealthSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            Thread.sleep(3000);
            latestSubTab.tapOnMore();
            latestSubTab.tapOnHealth();
            bpage.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnHealth();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 12)
    public void testMusicSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnMusic();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            homeSubTabs.clickOnShowsBtn();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 13)
    public void testNiftySubTab() throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnNifty();
            bpage.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnNifty();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }

    }

    @Test (priority = 14)
    public void testParentsSubTab()throws InterruptedException{
        Boolean failed = false;
        try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapBackButton();
            latestSubTab.tapOnParents();
            homeSubTabs.tapBackButton();
            homeSubTabs.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }

    }

    @Test (priority = 15)
    public void testRewindSubTab()throws InterruptedException{
           Boolean failed = false;
           try{
            latestSubTab.tapOnMore();
            latestSubTab.tapOnRewind();
            homeSubTabs.tapBackButton();
           } catch (Exception e) {
               System.out.println("ERROR ON THIS TEST CASE");
               System.out.print("EXCEPTION: ");
               System.out.print(e.getMessage());
               Thread.sleep(5000);
               latestSubTab.tapOnMore();
               latestSubTab.tapOnParents();
               homeSubTabs.tapBackButton();
               homeSubTabs.tapBackButton();
               failed = true;
               Assert.assertFalse(failed);
           }


    }

    @Test (priority = 16)
    public void testStyleSubTab()throws InterruptedException{
          Boolean failed= false;
          try{
              latestSubTab.tapOnMore();
            latestSubTab.tapOnStyle();
            homeSubTabs.tapBackButton();
          } catch (Exception e) {
              System.out.println("ERROR ON THIS TEST CASE");
              System.out.print("EXCEPTION: ");
              System.out.print(e.getMessage());
              Thread.sleep(5000);
              latestSubTab.tapBackButton();
              latestSubTab.tapOnParents();
              homeSubTabs.tapBackButton();
              failed = true;
              Assert.assertFalse(failed);
          }

    }


      @Test (priority = 16)
    public void testTravelSubTab()throws InterruptedException{
           Boolean failed= false;
           try{
            testName("Verify Travel sub-tab");
            latestSubTab.tapOnMore();
            homeSubTabs.clickOnTraveltab();
            editions.tapBackButton();
           } catch (Exception e) {
               System.out.println("ERROR ON THIS TEST CASE");
               System.out.print("EXCEPTION: ");
               System.out.print(e.getMessage());
               Thread.sleep(5000);
               latestSubTab.tapBackButton();
               homeSubTabs.clickOnTraveltab();
               homeSubTabs.tapBackButton();
               failed = true;
               Assert.assertFalse(failed);
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

    @Test (priority = 19)
    public void testHealthNewsTab() throws InterruptedException {
        Boolean failed = false;
        try{
        testName("Verify 'Science' sub-tab");
        Thread.sleep(3000);
        news.clickOnHealthBtn();
        Thread.sleep(3000);
        print("Verified Splash is present on 'Health' sub-tab");
      news.tapBackButton();
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

    @Test (priority = 20)
    public void testScienceTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Culture' sub-tab");
            Thread.sleep(3000);
            news.clickOnScienceBtn();
            Thread.sleep(3000);
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(5000);
            latestSubTab.tapOnMore();
            news.clickOnHealthBtn();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
        }
    }

    @Test (priority = 21)
    public void testPoliticsTab() throws InterruptedException {
        Boolean failed = false;
        try{
            testName("Verify 'Politics' sub-tab");
            Thread.sleep(3000);
            news.clickOnPoliticseBtn();
            news.tapBackButton();
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

    @Test (priority = 22)
    public void testCultureTab() throws InterruptedException{
         Boolean failed = false;
         try{
            testName("Verify 'Culture' sub-tab");
            Thread.sleep(3000);
            news.clickOnCultureBtn();
            Thread.sleep(3000);
            news.tapBackButton();
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

    @Test (priority = 23)
    public void testTechTab() throws InterruptedException{
        Boolean failed = false;
        try{
            testName("Verify 'Culture' sub-tab");
            Thread.sleep(3000);
            news.tapOnTech();
            Thread.sleep(3000);
            homeSubTabs.tapSplash();
            bpage.tapBackButton();
            news.tapBackButton();
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

    @Test (priority = 26)
    public void testWorldTab() throws InterruptedException{
        Boolean failed = false;
        try{
        testName("Verify 'Entertainment' sub-tab");
        news.tapOnMore();
        news.clickOnWorldBtn();
        bpage.tapBackButton();
    } catch (Exception e) {
        System.out.println("ERROR ON THIS TEST CASE");
        System.out.print("EXCEPTION: ");
        System.out.print(e.getMessage());
        Thread.sleep(4000);
        latestSubTab.tapBackButton();
        news.clickOnWorldBtn();
        editions.tapBackButton();
        editions.tapBackButton();
        failed = true;
        Assert.assertFalse(failed);
       }
    }

    @Test (priority = 27)
    public void testEntertainmentNewsTab() throws InterruptedException {
        Boolean failed = false;
        try{
        testName("Verify 'Entertainment' sub-tab");
        news.tapOnEntertainment();
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
            Thread.sleep(4000);
            latestSubTab.tapOnMore();
            news.tapOnWorld();
            editions.tapBackButton();
            editions.tapBackButton();
            failed = true;
            Assert.assertFalse(failed);
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

    @Test (priority = 29)
    public void testTrendingShoppingSubTab() {
            testName("Verify 'Trending' sub-tab");
            editions.tapTrendingSubTab();
            news.tapSplash();
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
            testName("Verify 'Culture' sub-tab");
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





