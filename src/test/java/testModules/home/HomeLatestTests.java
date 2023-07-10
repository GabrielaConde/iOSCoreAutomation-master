package testModules.home;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLatestTests extends EditionsInit {

    protected SettingsSetupPage disableAdExp;
    protected String testName;

    @BeforeClass
    public void initProcess() {
        disableAdExp = new SettingsSetupPage();
    }

    //Allow Button
  //  @Test
    public void testAllowButton(){
        print("-------------------STARTING LATEST SUB-TAB TESTS-------------------");
        testName = "TEST ALLOW BUTTON";
           // testName("Verify Allow button is present and tap-able");
            Assert.assertTrue(latestSubTab.allowButtonIsPresent());
            print("Verified Allow Notification button");

            latestSubTab.tapAllowButton();
    }

   @Test(enabled = false, priority = 1)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableVisualFeedExp() {
            testName("Enabling Trending Product package experiments");
            SettingsSetupPage enableExp = new SettingsSetupPage();
            enableExp.turnOnVisualFeedFF();
    }

 //   @Test(enabled = true, priority = 1)               //if TRUE, uncomment capabilities (Base class)
    public void disableAdExp() {
        testName("Disabling Dynamic Ads on Bpages");
        disableAdExp.disableAdExp();
        disableAdExp.tapAllowButton();
      //  latestSubTab.tapCloseButton();
    }

    //BuzzFeed logo + Latest sub-tab
    @Test (priority = 2)
    public void verifyBuzzFeedLogo(){
        testName("Verify Buzzfeed Logo is present");
        Assert.assertTrue((latestSubTab.buzzfeedLogoIsPresent()));
        print("Verified 'BuzzFeed' logo is present on Home feed");
    }

    @Test (priority = 3)
    public void verifyLatestIsPresentActive(){
        testName("Verify 'Latest' subtab is present and active");
        Assert.assertTrue((latestSubTab.latestSubTabIsPresent()));
        print("Verified Sub-tab'Latest' is present on Home/Latest");

       // Assert.assertEquals(latestSubTab.latestSubTabIsActive(), "1");
        print("Verified 'value' for sub-tab 'Latest' is = 1, the sub-tab is active");
    }

    //Splash and first cell
    @Test (priority = 4)
    public void tapSplash() throws InterruptedException{
        testName("Verify 'Splash' is present and tap-able");

        Assert.assertTrue(latestSubTab.splashCellIsPresent());
        print("Verified 'Splash' is present on Home/Latest feed");

        latestSubTab.tapSplash();
        BpagePage bpage = new BpagePage();
        Thread.sleep(3000);
        bpage.tapBackButton();

    }

    @Test (priority = 5)
    public void tapFirstBpage(){
        testName("Verify 'First Bpage' is present and tap-able");
        print("Verified First Bpage under Splash is present on Home/Latest feed");

        latestSubTab.tapFirstCell();
        latestSubTab.tapBackButton();
    }

    //Shopping package
    @Test(priority = 6)
    public void tapItemsShoppingPackage(){
        testName("Verify Shopping Package items on Home/Latest feed");
        latestSubTab.tapHomeTab();
        scroll.scrollDown90_20();
        latestSubTab.tapItemsShopPackage();
    }


    /*
    Commenting these @tests because right now the Shopping package is changed because of Thanks Giving and Black friday.
    The CTA is other and the screen is Gift Guide and it differs a little to Shopping screen.
    @Test(priority = 7)
    public void shoppingPackageCTAIsPresent(){
        testName("Verify Shopping Package CTA button is on Home/Latest feed");
        Assert.assertTrue(latestSubTab.shoppingPackageCTAButtonIsPresent());
        print("Verified Shopping Package CTA button: 'Find even more shopping recommendations' is present on Home/Latest feed");
    }

    @Test(priority = 8)
    public void tapShoppingCTAButton(){
        testName("Verify tapping Shopping Package CTA Button on Home/Latest feed");
        latestSubTab.tapShoppingCTAButton();
    }

    @Test(priority = 9)
    public void ShoppingHeaderOnShopFeedIsPresent(){
        testName("Verify Shopping header is on Shopping Recommendations feed");
        latestSubTab.waitForLatestGiftGuidesTitle();

        Assert.assertTrue(latestSubTab.shoppingHeaderIsPresent());
        print("Verified 'Shopping' header is present on Shopping Recommendations feed");
    }

    @Test(priority = 10)
    public void trendingProductsHeaderOnShopFeedIsPresent(){
        testName("Verify Trending header is present on Shopping Recommendations feed");
        scroll.scrollDown();

        try {
            Assert.assertTrue(latestSubTab.trendingProductsTitleIsPresent());
        }catch(RuntimeException exception){
            scroll.scrollDown90_10();
            Assert.assertTrue(latestSubTab.trendingProductsTitleIsPresent());
        }

        print("Verified 'Trending Products' header is present on Shopping Recommendations feed");
    }

    @Test(priority = 11)
    public void shopNowButtonShopFeedIsPresent(){
        testName("Verify 'Shop Now' button is present on Shopping Recommendations feed");
        Assert.assertTrue(latestSubTab.firstShopNowButtonIsPresent());
        print("Verified 'Show Now' button is present on Shopping Recommendations feed");
    }

    @Test(priority = 12)
    public void tapFirstShopNowShopFeed(){
        testName("Verify tapping first 'Shop Now' button on Shopping Recommendations feed");
        latestSubTab.tapFirstShowNowTrendingProduct();
        latestSubTab.returnToBFApp();
        print("Verified 'Show Now' button is working fine");
    }

    @Test(priority = 13)
    public void tapFirstBpageShopFeed(){
        testName("Verify tapping first bpage on Shopping Recommendations feed");
        latestSubTab.tapFirstCellShoppingRecommendations();
        print("Verified Shopping Recommendations feed loads content correctly");
        latestSubTab.tapBackButton();
    }
     */
//START DISCOMMENTING RIGHT HERE
    //Trending product package
    @Test(priority =14)
    public void openTrendingModal(){
        testName("Verify opening trending Modal for the first item on Trending Product package");
        latestSubTab.scrollDownToTrending();
        latestSubTab.tapFirstTrendingCell();
        latestSubTab.tapCloseButton();
        print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");

    }

    @Test(priority =15)
    public void shopNowButtonIsPresent() throws InterruptedException {
        testName("Verify tapping first 'Shop Now' button on Trending Product package");
        latestSubTab.tapFirstShowNowTrendingProduct();
        latestSubTab.returnToBFApp();
        print("Verified the 'Shop Now' button is working properly on Trending Product package from Home/Latest feed");
    }

    @Test(priority = 16)
    public void trendingHeaderIsPresent(){
        testName("Verify 'Trending' header is present on Trending Product package");
        Assert.assertTrue(latestSubTab.trendingProductsTitleIsPresent());
        print("Verified 'Trending' header is present on home/Latest feed");
    }

    @Test(priority = 17)
    public void collectDataDisclaimerIsPresent(){
        testName("Verify the collect data disclaimer is present under Trending Product package");
        Assert.assertTrue(latestSubTab.collectDataDisclaimerIsPresent());
        print("Verified the collect data disclaimer is present under Trending Products package on Home/Latest feed");
    }

    //Video package
    @Test(priority = 18)
    public void tapFirstItemVideoPackage(){
        testName("Verify items from Video package are present and tap-able");
        latestSubTab.scrollDownToVideos();
        latestSubTab.tapItemVideosPackage();
        print("Verified the video items from Trending Video package are working fine");
    }

    @Test(priority = 19)
    public void seeMoreButtonIsPresent(){
        testName("Verify 'See More Video' button is present under Videos Package");
        Assert.assertTrue((latestSubTab.seeMoreVideoButtonIsPresent()));
        print("Verified 'See More Video' button is present under Videos Package on Home/Latest feed");
    }

    @Test(priority = 20)
    public void videoHeaderIsPresent(){
        testName("Verify 'Trending Videos' header is present on Videos Package");
        scroll.scrollUp70_90();

        Assert.assertTrue((latestSubTab.videosHeaderIsPresent()));
        print("Verified 'Trending Videos' header is present on Videos Package on Home/Latest feed");
    }

    @Test(priority = 21)
    public void tapSeeMoreVideoButton(){
        testName("Verify tapping 'See More' button from Videos Package takes the user to Videos sub-tab");
        latestSubTab.tapSeeMoreButton();

        Assert.assertTrue((latestSubTab.videosSubTabIsPresent()));
        print("Verified 'Videos' sub-tab is present");
    }

    @Test(priority = 22)
    public void videosSubTabIsActive(){
        testName("Verify 'Videos' sub-tab is active");
        Assert.assertEquals(latestSubTab.videosSubTabIsActive(), "1");     //All tests related to value:1 are going to fail because of https://buzzfeed.atlassian.net/browse/IOS-8663
        print("Verified the 'value' for 'Videos' sub-tab is = 1, the sub-tab is active");
    }

}
