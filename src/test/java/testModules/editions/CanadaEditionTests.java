package testModules.editions;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CanadaEditionTests extends EditionsInit {

    @Test
    public void testCanadaEditionIsPresent(){
        try{
        print("-------------------STARTING CANADA EDITION TESTS-------------------");
        testName("Verify 'Canada' edition is present");
        editions.tapHomeTab();
        editions.tapSettingsButton();
        editions.tapEditionOption();

        Assert.assertTrue(editions.canadaEditionIsPresent());
        print("Verified 'Canada' edition is present in the list");

        editions.tapCanadaEdition();
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

        latestSubTab.buzzfeedLogoIsPresent();
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");

        latestSubTab.splashCellIsPresent();
        print("Verified 'Splash' is present on Home/Latest feed");

        editions.tapSplash();
        editions.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void testTrendingSubTab(){
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        homeSubTabs.clickOnTrendingBtn();
        print("Verified 'Trending' sub-tab  is present");
        editions.tapSplash();
        latestSubTab.tapBackButton();
               } catch (Exception e) {
                   System.out.println("ERROR ON THIS TEST CASE");
                   System.out.print("EXCEPTION: ");
                System.out.print(e.getMessage());
               }
             }

    @Test (priority = 3)
    public void testRecentlyViewedSubTab()throws InterruptedException{
        try{
        testName("Verify 'Shows' Sub-Tab");
        latestSubTab.tapOnRecentlyViewed();
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
         System.out.print(e.getMessage());
        }
        }

    @Test (priority = 4)
    public void testShowsSubTab()throws InterruptedException{
        testName("Verify 'Shows' Sub-Tab");
        homeSubTabs.clickOnShowsBtn();
        homeSubTabs.tapBackButton();

    }

    @Test (priority = 5)
    public void testVideosSubTab(){
        testName("Verify 'Videos' Sub-Tab");
        homeSubTabs.clickOnVideosTab();
        homeSubTabs.tapBackButton();

    }

    @Test (priority = 6)
    public void testAIQuizzesTab(){
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnAIQuizzes();
        homeSubTabs.tapBackButton();
    }
    @Test (priority = 7)
    public void testGamesTab(){
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        homeSubTabs.tapHomeTab();
    }

      @Test(priority =7)
         public void tapOnMore1()throws InterruptedException{
             latestSubTab.tapOnMore();
         }

             @Test (priority = 8)
                public void testEntertainmentSubTab() throws InterruptedException{
                    latestSubTab.tapOnEntertainment();
                    homeSubTabs.tapSplash();
                    bpage.tapBackButton();
                    homeSubTabs.tapBackButton();
                }

                 @Test (priority = 9)
                    public void testAnimalsSubTab() throws InterruptedException{
                            homeSubTabs.clickOnAnimalsBtn();
                            homeSubTabs.tapSplash();
                            bpage.tapBackButton();
                            homeSubTabs.tapBackButton();
                    }


                     @Test (priority = 11)
                     public void testCelebritySubTab(){
                             testName("Verify 'Celebrity' sub-tab");
                             homeSubTabs.clickOnCelebrityBtn();
                             latestSubTab.tapBackButton();
                     }

                       @Test (priority = 10)
                         public void testBooksSubTab() throws InterruptedException{
                                  latestSubTab.tapOnBooks();
                                  latestSubTab.tapSplash();
                                  bpage.tapBackButton();
                                  homeSubTabs.tapBackButton();
                         }


                     @Test (priority = 12)
                     public void testFoodSubTab(){
                             testName("Verify 'Food' sub-tab");
                             homeSubTabs.clickOnFoodBtn();
                             latestSubTab.tapBackButton();
                     }


                     @Test (priority = 13)
                         public void testCommunitySubTab(){
                                 latestSubTab.tapOnCommunity();
                                 latestSubTab.tapSplash();
                                 bpage.tapBackButton();
                                 homeSubTabs.tapBackButton();
                         }

                      @Test (priority = 14)
                      public void testMusicSubTab(){
                              latestSubTab.tapOnMusic();
                              latestSubTab.tapSplash();
                              bpage.tapBackButton();
                              homeSubTabs.tapBackButton();
                      }

                      @Test (priority = 15)
                      public void testNiftySubTab(){
                              latestSubTab.tapOnNifty();
                              latestSubTab.tapSplash();
                              bpage.tapBackButton();
                              homeSubTabs.tapBackButton();
                      }

                   @Test (priority = 16)
                      public void testParentsSubTab(){
                              latestSubTab.tapOnParents();
                              latestSubTab.tapSplash();
                              bpage.tapBackButton();
                              homeSubTabs.tapBackButton();
                      }

                      @Test (priority = 17)
                      public void testRewindSubTab(){
                              latestSubTab.tapOnRewind();
                              latestSubTab.tapSplash();
                              bpage.tapBackButton();
                              homeSubTabs.tapBackButton();
                      }
                      @Test (priority = 18)
                      public void testStyleSubTab(){
                             latestSubTab.tapOnStyle();
                             latestSubTab.tapSplash();
                             bpage.tapBackButton();
                             homeSubTabs.tapBackButton();
                    }

                    @Test (priority = 19)
                    public void testTravelHomeSubTab(){
                    latestSubTab.tapOnTravel();
                    latestSubTab.tapSplash();
                    bpage.tapBackButton();
                    homeSubTabs.tapBackButton();
                }


    //News
   // @Test (priority = 17)
    public void testGoingNewsTab() {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");

      //  Assert.assertTrue(homeSubTabs.QCUSectionIsPresent());
        print("Verified Splash is present on 'Latest' sub-tab");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 18)
    public void testHealthNewsSubTab() {
        testName("Verify 'Science' sub-tab");
        news.tapScienceSubTab();
        print("Verified Splash is present on 'Science' sub-tab");
        editions.visitSplashAndReturn();
    }


//    @Test (priority = 20)
    public void testCultureSubTab() {
        try{
        testName("Verify 'Culture' sub-tab");
        news.tapCultureSubTab();
       //     news.clickOnCultureBtn();

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

  //  @Test (priority = 21)
    public void testTechSubTab() {
        try{
        testName("Verify 'Tech' sub-tab");
        news.tapTechSubTab();
     //   news.clickOnTechBtn();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Tech' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 22)
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


    
    //SHOPPING
    @Test (priority = 24)
    public void testGoingShoppingTab() {
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        Assert.assertTrue(editions.foreignShoppingTabIsPresent());
        print("Verified the 'Shopping' Tab is present in the nav bar");

        editions.tapForeignShoppingTab();

        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Latest' sub-tab");
        editions.visitSplashAndReturn();
    }

    @Test (priority = 25)
    public void testTrendingShoppingSubTab() {
        testName("Verify 'Trending' sub-tab");
        editions.tapTrendingSubTab();
        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Trending' sub-tab");
        editions.visitSplashAndReturn();
    }

   // @Test (priority = 26)
    public void testBeautySubTab() {
        try{
        testName("Verify 'Beauty' sub-tab");
        shoppingSubTabs.tapBeautySubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
      //  print("Verified Splash is present on 'Beauty' sub-tab");
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 27)
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

   // @Test (priority = 28)
    public void testHomeSubTab() {
        testName("Verify 'Home' sub-tab");
        shoppingSubTabs.tapHomeSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Home' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
    }

  //  @Test (priority = 29)
    public void testClothingSubTab() {
        try{
        testName("Verify 'Clothing' sub-tab");
        shoppingSubTabs.tapClothingSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Clothing' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 30)
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

 //   @Test (priority = 31)
    public void testUnder50SubTab() {
        try{
        testName("Verify 'Under $50' sub-tab");
        shoppingSubTabs.tapUnder50SubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Under $50' sub-tab");

     //   print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 32)
    public void testSelfCareSubTab() {
        try{
        testName("Verify 'Self Care' sub-tab");
        editions.tapSelfCareSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Self Care' sub-tab");

       // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

  //  @Test (priority = 33)
    public void testTreatYourselfSubTab() {
        try{
        testName("Verify 'Treat Yourself' sub-tab");
        editions.tapTreatYourselfSubTab();

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on 'Treat Yourself' sub-tab");

      //  print("Bpage on Splash: " + editions.getSplashTitle());
        editions.visitSplashAndReturn();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //Quizzes
    @Test (priority = 34)
    public void testGoingToQuizzesTab(){
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();

        Assert.assertTrue(quizzesLatestSubTab.quizzesHeaderIsPresent());
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");

        Assert.assertTrue(quizzesLatestSubTab.splashCellIsPresent());
        print("Verified Splash is present on Quizzes/Latest feed");
        editions.visitSplashAndReturn();
    }

    @Test (priority = 35)
    public void testTapOnTrendingCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

  //  @Test (priority = 36)
    public void testTapOnResultsCategory(){
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnResults();
        editions.tapBackButton();
    }

    @Test (priority = 37)
    public void testTapOnAIQuizzesCategory(){
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        editions.tapBackButton();
    }

    @Test (priority = 38)
    public void testTapOnTriviaCategory(){
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnFood();
        editions.tapSplash();
        editions.tapBackButton();
        editions.tapBackButton();
    }

    @Test (priority = 40)
    public void testTapCanWeGuess(){
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        quizzesSubTabs.tapSplash();
        quizzesSubTabs.tapBackButton();
        quizzesSubTabs.tapBackButton();
    }

   // @Test (priority = 41)
    public void testTapOnMatchups(){
        testName("testTapOnDisney");
        quizzesSubTabs.tapOnMatchups();
        quizzesSubTabs.tapBackButton();
    }

    //Search
    @Test (priority = 44)
    public void testSearchTab() {
        testName("SEARCH");
        testName("Verify going to Search tab");
        editions.tapSearchTab();

        Assert.assertTrue(quizzesLatestSubTab.suggestedSearchesTitleIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
    }

}
