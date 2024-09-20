package testModules.home;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
//import org.apache.tools.ant.taskdefs.Echo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLatestNewNavTests extends EditionsInit {
    protected SettingsSetupPage disableAdExp;
    protected String testName;

   // @BeforeClass
    public void initProcess() {
        disableAdExp = new SettingsSetupPage();
    }

    //Allow Button
  //  @Test
    public void testAllowButton()throws InterruptedException{
            print("-------------------STARTING LATEST SUB-TAB TESTS-------------------");
            testName = "TEST ALLOW BUTTON";
            testName("Verify Allow button is present and tap-able");
            Assert.assertTrue(latestSubTab.allowButtonIsPresent());
            print("Verified Allow Notification button");
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            Thread.sleep(3000);
            latestSubTab.tapOnAcceptAllCookiesBtn();
            Thread.sleep(3000);
            latestSubTab.tapOnGoToGames();
            latestSubTab.tapHomeTab();
    }
   //  @Test(enabled = true, priority = 1)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
     public void enableGamesTabExp() throws InterruptedException{
             testName("Enabling Trending Product package experiments");
                 Thread.sleep(2000);
             SettingsSetupPage enableExp = new SettingsSetupPage();
             enableExp.turnOnGamesTabFF();
             latestSubTab.tapAllowButton();
     }

 //   @Test(enabled = true, priority = 1)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableVisualFeedExp() throws InterruptedException{
            testName("Enabling Trending Product package experiments");
            SettingsSetupPage enableExp = new SettingsSetupPage();
            Thread.sleep(2000);
            enableExp.turnOnVisualFeedFF();
            latestSubTab.tapCloseButton();
            latestSubTab.closeGoToGamesScreen();
    }

  //  @Test(enabled = true, priority = 2)               //if TRUE, uncomment capabilities (Base class)
    public void disableAdExp()throws InterruptedException {
            testName("Disabling Dynamic Ads on Bpages");
            disableAdExp = new SettingsSetupPage();
            disableAdExp.disableAdExp();
            Thread.sleep(3000);
            latestSubTab.closeGoToGamesScreen();

    }

   // @Test(enabled = true, priority = 3)
    public void enableAIQuizzesExp()
    {
        disableAdExp = new SettingsSetupPage();
        disableAdExp.turnOnAIQuizzesFF();
    }

   // @Test (priority = 4)
    public void validateGamesTab()throws InterruptedException{
        Thread.sleep(5000);
        latestSubTab.tapGamesTab();
        Thread.sleep(1000);
        latestSubTab.tapHomeTab();
        scroll.scrollUp();
    }

    @Test(priority = 1)
    public void signInOnFstLaunch()throws InterruptedException{
        try {
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            //  latestSubTab.switchToAlert();
            // latestSubTab.tapAllowButton();
            // latestSubTab.switchToAlert();
            latestSubTab.tapOnGuestSignIn();
            Thread.sleep(3000);
          /*  latestSubTab.tapOnSignInLink();
            latestSubTab.enterPassword("sanfer12");
            latestSubTab.enterEmail("salpimie");
            Thread.sleep(2000);
            latestSubTab.tapSignInBFButton();
            Thread.sleep(3000);

            latestSubTab.tapNotNow();*/
        }catch (Exception e) {}
        //  signIn.switchToAlert();
     //   latestSubTab.setUSEdition();

    }


  //  @Test (priority = 5)
    public void verifyBuzzFeedLogo()throws InterruptedException{
            testName("Verify Buzzfeed Logo is present");
            Thread.sleep(2000);
            latestSubTab.buzzfeedLogoIsPresent();
            print("Verified 'BuzzFeed' logo is present on Home feed");
    }



  //  @Test (priority = 6)
    public void tapSplash() throws InterruptedException{
            testName("Verify 'Splash' is present and tap-able");
            print("Verified 'Splash' is present on Home/Latest feed");
            latestSubTab.tapSplashNewNav();
            BpagePage bpage = new BpagePage();
            Thread.sleep(2000);
            bpage.tapBackButton();
    }

  //  @Test (priority = 7)
    public void tapFirstBpage()throws InterruptedException{
            testName("Verify 'First Bpage' is present and tap-able");
            print("Verified First Bpage under Splash is present on Home/Latest feed");
            scroll.scrollDown();
            latestSubTab.tapFstCellNewNav();
            Thread.sleep(2000);
        bpage.tapBackButton();
    }


    @Test(priority = 8)
    public void tapItemsShoppingPackage(){
        try{
            testName("Verify Shopping Package items on Home/Latest feed");
            latestSubTab.tapHomeTab();
            latestSubTab.scrollMultipleTimesOnhome(2);
       //     latestSubTab.tapItemsShopPackage();
        }catch (Exception e) {}
    }

    @Test(priority = 9)
    public void tapCTALink()throws InterruptedException{
        try{
        latestSubTab.tapOnCTALink();
        Thread.sleep(2000);
        shoppingLatestSubTabs.isShoppingHeaderDisplayed();
        Thread.sleep(2000);
        latestSubTab.tapHomeTab();
        }catch (Exception e) {}
    }

   // @Test(priority = 9)
     public void validateTrendingVideos(){
        scroll.scrollMultipleTimes(1);
         Assert.assertTrue(latestSubTab.validateTrendingVideosTitle());
     }

  //  @Test(priority = 10)
     public void tapOnTrendingVideo(){
       latestSubTab.tapOnVideos();
       latestSubTab.closeTrendingVideo();
     }

  //  @Test(priority =11)
    public void openTrendingModal()throws InterruptedException{
            testName("Verify opening trending Modal for the first item on Trending Product package");
            latestSubTab.scrollMultipleTimesOnhome(5);
            Thread.sleep(2000);
            latestSubTab.tapFirstTrendingCell();
            latestSubTab.tapCloseButton();
            print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");
            latestSubTab.tapHomeTab();
    }



    @Test(priority =13)
    public void tapOnTrending()throws InterruptedException{
        try{
      //  latestSubTab.tapOnTrending();
        Thread.sleep(4000);
        latestSubTab.tapOnTrendingSubNav();
        Thread.sleep(2000);
        bpage.tapBackButton();
        }catch (Exception e) {}
    }



    @Test(priority =16)
    public void tapOnFunnyTweets()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnFunnyTweetsSubNav();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =17)
    public void tapOnGames()throws InterruptedException{
        try{
        Thread.sleep(2000);
            latestSubTab.tapOnGamesSubNav();
            homeSubTabs.tapHomeTab();
        }catch (Exception e) {}
    }

    @Test(priority =18)
    public void tapOnLatest()throws InterruptedException{
        try{
        Thread.sleep(2000);
            latestSubTab.tapOnLatestSubNav();
         //   latestSubTab.tapSplash();
         //   bpage.tapBackButton();
            homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority =19)
    public void tapOnRandom()throws InterruptedException{
        try{
        Thread.sleep(2000);
      //  scroll.swipeLeftAppium2();
        latestSubTab.tapOnRandomSubNav();
     //   Thread.sleep(2000);
      //  latestSubTab.tapSplash();
      //  Thread.sleep(2000);
      //  bpage.tapBackButton();
        latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

     @Test(priority =20)
    public void tapOnGossip()throws InterruptedException{
        try{
        Thread.sleep(2000);
            latestSubTab.tapOnGossipSubNav();
         //   latestSubTab.tapSplash();
         //   bpage.tapBackButton();
            latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority =21)
    public void tapOnGayStuff()throws InterruptedException{
        try{
        latestSubTab.tapOnGaySubNav();
     //  latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =22)
    public void tapOnMore(){
        try{
        latestSubTab.tapOnMoreSubNav();
        }catch (Exception e) {}
    }


  //    @Test(priority =23)
    public void tapOnRecentlyViewed()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapOnRecentlyViewed();
    //    Thread.sleep(2000);
    //    latestSubTab.tapFirstCell();
    //    Thread.sleep(2000);
    //    bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =24)
    public void tapOnVideos()throws InterruptedException{
        try{
        Thread.sleep(3000);
            latestSubTab.tapVideosBtn();
            Thread.sleep(1000);
            bpage.tapBackButton();
        }catch (Exception e) {}
    }

  //  @Test(priority =25)
    public void tapOnShows()throws InterruptedException{
        Thread.sleep(3000);
        latestSubTab.tapOnShows();
        latestSubTab.tapBackButton();
    }

    @Test(priority =26)
    public void tapOnEntentainment()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnEntertainment();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =27)
    public void tapOnTVAndMovies()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnTVAndMovies();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =28)
    public void tapOnAnimals()throws InterruptedException{
        try{
        Thread.sleep(2000);
            latestSubTab.tapOnAnimals();
      //      latestSubTab.tapSplash();
      //      bpage.tapBackButton();
        Thread.sleep(2000);
            latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =29)
    public void tapOnBooks()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnBooks();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
       latestSubTab.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =30)
    public void tapOnComunity()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnCommunity();
      //  latestSubTab.tapSplash();
      //  bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =31)
    public void tapOnFood()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnFood();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

  //  @Test(priority =31)
    public void tapOnLGBTQ()throws InterruptedException{
        latestSubTab.tapOnLGBTQ();
      //  latestSubTab.tapSplash();
      //  bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority =32)
    public void tapOnMusic()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnMusic();
     //   latestSubTab.tapSplash();
     //   bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =33)
    public void tapOnNifty()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnNifty();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

   @Test(priority =34)
    public void tapOnParents()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnParents();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
       Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =35)
    public void tapOnRewind()throws InterruptedException{
        try{
        Thread.sleep(2000);
        latestSubTab.tapOnRewind();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =36)
    public void tapOnStyle()throws InterruptedException{
        try{
        Thread.sleep(3000);
        latestSubTab.tapOnStyle();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority =37)
    public void tapOnTravel()throws InterruptedException{
        try{
        Thread.sleep(3000);
        latestSubTab.tapOnTravel();
    //    latestSubTab.tapSplash();
    //    bpage.tapBackButton();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority = 38)
    public void moveToNewsTab()throws InterruptedException{
        try{
        Thread.sleep(2000);
            news.tapNewsTab();
        }catch (Exception e) {}
    }

  //  @Test(enabled = true, priority = 39)
    public void tapNewsSplash()throws InterruptedException{
        Thread.sleep(3000);
            news.tapSplash();
        Thread.sleep(3000);
            news.tapBackButton();
    }

   // @Test(enabled = true, priority = 40)
    public void tapFstNewsCell(){
            news.tapFirstCell();
            news.tapBackButton();
    }

    @Test(enabled = true, priority = 41)
    public void tapGamesTab()throws InterruptedException{
        try{
        Thread.sleep(2000);
        homeSubTabs.tapGamesTab();
        homeSubTabs.tapHomeTab();
        homeSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

 //   @Test(enabled = true, priority = 42)
   public void testFail(){
        Assert.assertTrue(false);
   }

}
