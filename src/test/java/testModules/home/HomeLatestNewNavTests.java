package testModules.home;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import org.apache.tools.ant.taskdefs.Echo;
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

  //  @Test(enabled = true, priority = 1)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableVisualFeedExp() throws InterruptedException{
            testName("Enabling Trending Product package experiments");
            SettingsSetupPage enableExp = new SettingsSetupPage();
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

    @Test (priority = 4)
    public void validateGamesTab()throws InterruptedException{
        Thread.sleep(5000);
        latestSubTab.tapGamesTab();
        Thread.sleep(1000);
        latestSubTab.tapHomeTab();
        scroll.scrollUp();
    }


    @Test (priority = 5)
    public void verifyBuzzFeedLogo()throws InterruptedException{
            testName("Verify Buzzfeed Logo is present");
            Thread.sleep(2000);
            latestSubTab.buzzfeedLogoIsPresent();
            print("Verified 'BuzzFeed' logo is present on Home feed");
    }



    @Test (priority = 6)
    public void tapSplash() throws InterruptedException{
            testName("Verify 'Splash' is present and tap-able");
            print("Verified 'Splash' is present on Home/Latest feed");
            latestSubTab.tapSplashNewNav();
            BpagePage bpage = new BpagePage();
            bpage.tapBackButton();
    }

    @Test (priority = 7)
    public void tapFirstBpage(){
            testName("Verify 'First Bpage' is present and tap-able");
            print("Verified First Bpage under Splash is present on Home/Latest feed");
            scroll.scrollDown();
            latestSubTab.tapFstCellNewNav();
        bpage.tapBackButton();
    }


    @Test(priority = 8)
    public void tapItemsShoppingPackage(){
            testName("Verify Shopping Package items on Home/Latest feed");
            latestSubTab.tapHomeTab();
            scroll.scrollDown90_20();
            latestSubTab.tapItemsShopPackage();
    }

    @Test(priority = 9)
    public void tapCTALink()throws InterruptedException{
        latestSubTab.tapOnCTALink();
        Thread.sleep(2000);
        shoppingLatestSubTabs.isShoppingHeaderDisplayed();
        Thread.sleep(2000);
        latestSubTab.tapHomeTab();
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

    @Test(priority =11)
    public void openTrendingModal()throws InterruptedException{
            testName("Verify opening trending Modal for the first item on Trending Product package");
            latestSubTab.scrollDownToTrending();
            Thread.sleep(4000);
            latestSubTab.tapFirstTrendingCell();
            latestSubTab.tapCloseButton();
            print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");
            latestSubTab.tapHomeTab();
    }



    @Test(priority =13)
    public void tapOnTrending()throws InterruptedException{
      //  latestSubTab.tapOnTrending();
        Thread.sleep(4000);
        latestSubTab.tapOnTrendingSubNav();
        bpage.tapBackButton();
    }



    @Test(priority =16)
    public void tapOnFunnyTweets()throws InterruptedException{
        latestSubTab.tapOnFunnyTweetsSubNav();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =17)
    public void tapOnGames()throws InterruptedException{
            latestSubTab.tapOnGamesSubNav();
            homeSubTabs.tapHomeTab();
    }

    @Test(priority =18)
    public void tapOnLatest()throws InterruptedException{
            latestSubTab.tapOnLatestSubNav();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            homeSubTabs.tapBackButton();
    }


    @Test(priority =19)
    public void tapOnRandom()throws InterruptedException{
        scroll.scrollHoriz(1,1,1,1);
        latestSubTab.tapOnRandomSubNav();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

     @Test(priority =20)
    public void tapOnGossip()throws InterruptedException{
            latestSubTab.tapOnGossipSubNav();
            latestSubTab.tapSplash();
            bpage.tapBackButton();
            latestSubTab.tapBackButton();
    }


    @Test(priority =21)
    public void tapOnGayStuff()throws InterruptedException{
        latestSubTab.tapOnGaySubNav();
       latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =22)
    public void tapOnMore(){
        latestSubTab.tapOnMoreSubNav();
    }


      @Test(priority =23)
    public void tapOnRecentlyViewed()throws InterruptedException{
        latestSubTab.tapOnRecentlyViewed();
        Thread.sleep(2000);
        latestSubTab.tapFirstCell();
        Thread.sleep(2000);
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =24)
    public void tapOnVideos()throws InterruptedException{
            latestSubTab.tapVideosBtn();
            bpage.tapBackButton();
    }

    @Test(priority =25)
    public void tapOnShows()throws InterruptedException{
        latestSubTab.tapOnShows();
        latestSubTab.tapBackButton();
    }

    @Test(priority =26)
    public void tapOnEntentainment()throws InterruptedException{
        latestSubTab.tapOnEntertainment();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =27)
    public void tapOnTVAndMovies()throws InterruptedException{
        latestSubTab.tapOnTVAndMovies();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =28)
    public void tapOnAnimals()throws InterruptedException{
        latestSubTab.tapOnAnimals();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        latestSubTab.tapBackButton();
    }

    @Test(priority =29)
    public void tapOnBooks()throws InterruptedException{
        latestSubTab.tapOnBooks();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
       latestSubTab.tapBackButton();
    }

    @Test(priority =30)
    public void tapOnComunity()throws InterruptedException{
        latestSubTab.tapOnCommunity();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =31)
    public void tapOnFood()throws InterruptedException{
        latestSubTab.tapOnFood();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

  //  @Test(priority =31)
    public void tapOnLGBTQ()throws InterruptedException{
        latestSubTab.tapOnLGBTQ();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =32)
    public void tapOnMusic()throws InterruptedException{
        latestSubTab.tapOnMusic();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =33)
    public void tapOnNifty()throws InterruptedException{
        latestSubTab.tapOnNifty();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

   @Test(priority =34)
    public void tapOnParents()throws InterruptedException{
        latestSubTab.tapOnParents();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =35)
    public void tapOnRewind()throws InterruptedException{
        latestSubTab.tapOnRewind();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =36)
    public void tapOnStyle()throws InterruptedException{
        latestSubTab.tapOnStyle();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }

    @Test(priority =37)
    public void tapOnTravel()throws InterruptedException{
        scroll.scrollDown();
        latestSubTab.tapOnTravel();
        latestSubTab.tapSplash();
        bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 38)
    public void moveToNewsTab(){
            news.tapNewsTab();
    }

    @Test(enabled = true, priority = 39)
    public void tapNewsSplash(){
            news.tapSplash();
            news.tapBackButton();
    }

    @Test(enabled = true, priority = 40)
    public void tapFstNewsCell(){
            news.tapFirstCell();
            news.tapBackButton();
    }

    @Test(enabled = true, priority = 41)
    public void tapGamesTab(){
        homeSubTabs.tapGamesTab();
        homeSubTabs.tapHomeTab();
        homeSubTabs.tapBackButton();
    }



}
