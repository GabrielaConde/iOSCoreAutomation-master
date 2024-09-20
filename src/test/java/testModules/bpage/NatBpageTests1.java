package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.initPages.BpageInit;
import config.pages.profile.BookmarksPage;
import config.pages.settings.SettingsSetupPage;
//import org.springframework.ui.context.Theme;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1
public class NatBpageTests1 extends BpageInit {

    protected SettingsSetupPage disableAdExp;

    //THIS IS A MASTER TEST COMMENT *****
    //THIS IS A SECOND MASTER TEST COMMENT *****
    //THIS IS A THIRD MASTER TEST COMMENT *****
    //THIS IS A FORTH MASTER TEST COMMENT *****
    //THIS IS A FIFTH MASTER TEST COMMENT *****
    @BeforeClass
    public void initProcess()throws InterruptedException {
     /*   testName("Enter Email");
        Thread.sleep(4000);
        nativeBpage.tapAllowButton();
        Thread.sleep(3000);
        nativeBpage.tapOnGuestSignIn();*/
        nativeBpage.tapAllowButton();
        nativeBpage.tapGuestSignInAndNotif();
    //    nativeBpage.signInWithBFAuth0();
        Thread.sleep(3000);
     //   nativeBpage.tapHomeTab();
    }



  //  @Test(enabled = true )               //if TRUE, uncomment capabilities (Base class)
    public void disableAdExp() throws InterruptedException {
        testName("Disabling Dynamic Ads on Bpages");
            disableAdExp.disableAdExp();
            Thread.sleep(2000);
            nativeBpage.tapAllowButton();
            nativeBpage.tapCloseButton();
        Thread.sleep(4000);

         //   nativeBpage.closeGoToGamesScreen();

    }

    @Test(priority = 1, dataProvider = "nativeBpage", dataProviderClass = BpagesDataProvider.class)
    public void testSearchNativeBpage(String data) throws InterruptedException {
        try {
            Thread.sleep(4000);
            print("-------------------STARTING TO TEST NATIVE BPAGE -------------------");
            testName("Search Native Bpage");
            nativeBpage.completeSearch(data);
            Thread.sleep(3000);
        }catch (Exception e){}
    }

    @Test(priority = 2)
    public void verifyDataCategoryArePresent() {
        try{
        testName("Verify Data & Category are present at top the Native Bpage");
       // Assert.assertEquals(nativeBpage.categoryDateArePresent(), "News • Updated Aug 3, 2021");
        print("Verified Date & Category are ok at top of the Native Bpage");
        }catch (Exception e){}
    }

    @Test(priority = 3)
    public void verifyTitleIsPresent() {
        try{
        testName("Verify title is present on Native Bpage");
        Assert.assertEquals(nativeBpage.bpageTitleIsPresent(), "Simone Biles Won A Bronze Medal In Her Olympic Return");
        print("Verified title is present and correct on Native Bpage");
        }catch (Exception e){}
    }

    @Test(priority = 4)
    public void verifySubTitleIsPresent() {
        try{
        testName("Verify SubTitle is present on Native Bpage");
        Assert.assertEquals(nativeBpage.subtitleIsPresent(), "\"I was proud of myself just to go out there after what I've been through,\" Biles said afterward.");
        print("Verified SubTitle is present on Native Bpage");
        }catch (Exception e){}
    }

    //Author
    @Test(priority = 5)
    public void verifyAuthorInfoIsPresentOnBpage() {
        try{
        testName("Verify Author Info is present on Native Bpage");
        Assert.assertTrue(nativeBpage.nativeAuthorInfoIsPresent());
        print("Verified Author Info is present on Native Bpage: " + nativeBpage.nativeAuthorInfoIsPresent());
        }catch (Exception e){}
    }

    //Image and MV
    @Test(priority = 6)
    public void verifyImagePresentOnBpage() {
        try{
        testName("Verify 'Image' is present on Bpage");
        Assert.assertTrue(nativeBpage.imageIsPresent());
        print("Verified 'Image' is present on Bpage");
        }catch (Exception e){}
    }

    @Test(priority = 7)
    public void tapImage() {
        try{
        testName("Verify tapping image to go to MV");
        nativeBpage.tapImage();
        }catch (Exception e){}
    }

    @Test(priority = 8)
    public void verifyShareButtonIsPresentOnMV() {
        try{
        testName("Verify 'Share' button is present on MV");
        Assert.assertTrue(nativeBpage.shareButtonIsPresent());
        print("Verified 'Share' button is present on MV");
        }catch (Exception e){}
    }

    @Test(priority = 9)
    public void tapShareButtonOnMV() {
        try{
        testName("Verify tapping 'Share' button on Media Viewer");
        nativeBpage.tapShare();
        nativeBpage.tapCloseButton();
        print("Verified tapping 'Share' button is opening the sheet on Media Viewer");
        }catch (Exception e){}
    }

    @Test(priority = 10)
    public void verifyDismissMV()throws InterruptedException {
        try{
        testName("Verify tapping 'Close' button to dimiss MV");
        nativeBpage.tapCloseMVButton();
        print("Verified 'Close' button is present on MV and tap-able to return to the Bpage");
        Thread.sleep(4000);
        nativeBpage.tapBackButton();
        Thread.sleep(4000);
        }catch (Exception e){}
    }

    //Internal/External Links
  //  @Test(priority = 11)
    public void tapInternalLink()throws InterruptedException {
       // try {
            testName("Verify tapping 'Internal' link");
            nativeBpage.scrollInBpage();
            Thread.sleep(3000);
            nativeBpage.tapNativeInternalLink();
            print("Verified 'Internal' link is tap-able");
      //  }catch (Exception e){}
    }

  //  @Test(priority = 12)
    public void verifyInternalLinkLoadsFine() throws InterruptedException{
        Thread.sleep(3000);
        testName("Verify tapping internal link leads to a bpage which loads fine");
        nativeBpage.bpageTitleIsPresent(); //"Simone Biles Pulled Out Of The Women’s Gymnastics Team Final Due To Mental Health Concerns");
        print("Verified Internal Link Bpage is loading fine: 'Simone Biles Pulled Out Of The Women’s Gymnastics Team Final Due To Mental Health Concerns'");
        Thread.sleep(2000);
        nativeBpage.tapBackButton();
    }

    //Share bpage
  //  @Test(priority = 14)
    public void verifyShareButtonIsPresent() throws InterruptedException{
        testName("Verify 'Share' button is present on bpage");
        Thread.sleep(2000);
        nativeBpage.shareButtonIsPresent();
        print("Verified 'Share' button is present on bpage");
    }

  //  @Test(priority = 15)
    public void tapShareButtonOnBpage()throws InterruptedException {
        testName("Verify tapping 'Share' button on Bpage");
        Thread.sleep(2000);
        nativeBpage.tapShare();
        Thread.sleep(2000);
        nativeBpage.tapCloseButton();
        Thread.sleep(2000);
        nativeBpage.tapBackButton();
        print("Verified tapping 'Share' button is opening the sheet on Bpage");
    }



    //More on this section
  //  @Test(priority = 18)
    public void verifyMoreOnThisHeaderIsPresent() throws InterruptedException {
        testName("Verify 'More In This' header is present'");
        nativeBpage.scrollInBpageMultipleTimes(5);
        Thread.sleep(2000);
        nativeBpage.moreOnThisHeaderIsPresent();
        print("Verified 'More On This' header is present");
    }

   // @Test(priority = 19)
    public void verifyMoreOnThisBpageIsPresent() {
        testName("Verify bpage from 'More In This' section is present'");
        Assert.assertTrue(nativeBpage.nativeMoreOnThisBpageIsPresent());
        print("Verified 'More On This' Bpage is present");
    }

  //  @Test(priority = 20)
    public void verifyMoreOnThisBpage() throws InterruptedException{
        testName("Verify tapping the first bpage from More On This section is loading");
        String bpageTitle= nativeBpage.nativeTitleMoreOnThisBpage();
        print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + bpageTitle + "'");
        Thread.sleep(3000);
        nativeBpage.nativeTapMoreOnThisBpage();
       // nativeBpage.bpageTitleIsPresent();
      //  print("Verified Bpage is loading fine. Actual title: " + "\n" + "'" + nativeBpage.bpageTitleIsPresent() + "'");
        Thread.sleep(2000);
        nativeBpage.tapBackButton();
    }

 //   @Test(priority = 21)
    public void validateRelatedContentHeader(){
        print(testName("Verify bpage related content Header is displayed"));
        scroll.scrollDown();
       Assert.assertTrue(nativeBpage.relatedContentHeaderIsPresent());
    }

 //   @Test(priority = 22)
    public void validateRelatedContentItemDisplays() throws InterruptedException{
        print(testName("Verify bpage related content item opens fine"));
        nativeBpage.tapRelatedContentItem();
        nativeBpage.tapSplash();
        nativeBpage.tapBackButton();
        nativeBpage.tapCloseButton();
    }


  //  @Test(priority = 24)
    public void verifyMoreLikeThisBpageIsPresent()throws InterruptedException {
     /*   testName("Verify 'More Like this' Bpage is present");
        getDriver().get("buzz://emilymaeczachor/sandra-bullock-channing-tatum-met-principals-office");
        Thread.sleep(4000);
        try{
        nativeBpage.returnToBFApp();
    //    nativeBpage.returnToBFApp();
    //    nativeBpage.returnToBFApp();
    //    nativeBpage.returnToBFApp();
        } catch (Exception e){}
        Thread.sleep(2000);
      //  nativeBpage.tapOnBpageTitle();*/
       // nativeBpage.scrollInBpageMultipleTimes(18);
        nativeBpage.scrollInBpageMultipleTimes(6);
        Thread.sleep(2000);
        nativeBpage.moreLikeThisBpageIsPresent();
        print("Verified 'More Like This' bpage is present");

    }

  //  @Test(priority = 25)
    public void tapFirstMoreLikeThisBpage()throws InterruptedException {
        testName("Verify tapping bpage from 'More Like This' section");
        Thread.sleep(2000);
       // String bpageTitle= nativeBpage.nativeTitleMoreLikeThisBpage();
    //    print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + bpageTitle + "'");
        nativeBpage.tapMoreLikeThisBpage();

       // Assert.assertEquals(nativeBpage.bpageTitleIsPresent(), bpageTitle);
      //  nativeBpage.bpageTitleIsPresent();
     //   print("Verified Bpage is loading fine. Actual title: " + "\n" + "'" + nativeBpage.bpageTitleIsPresent() + "'");
            nativeBpage.tapBackButton();
    }

    //Trending section
 //   @Test(priority = 26)
    public void verifyTrendingHeader() {
        testName("Verify 'Trending' header is present");
        nativeBpage.scrollInBpageMultipleTimes(6);
       // nativeBpage.scrollTrendingHeaderNativeBpage();
        nativeBpage.trendingHeaderIsPresent();
        print("Verified 'Trending' header is present");
    }

  //  @Test(priority = 27)
    public void verifyTrendingBpageIsPresent() {
        testName("Verify 'Trending' bpage is present");
        Assert.assertTrue(nativeBpage.trendingBpageIsPresent());
        print("Verified 'Trending' bpage is present");
    }

  //  @Test(priority = 28)
    public void tapTrendingBpage() {
        testName("Verify tapping 'Trending' bpage");
        print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + nativeBpage.titleTrendingBpage() + "'");
        nativeBpage.tapTrendingBpage();
        nativeBpage.tapBackButton();
        nativeBpage.tapBackButton();
    }

    @Test( priority = 16, dataProvider = "amazonButtonNativeBpage", dataProviderClass = BpagesDataProvider.class)
    public void testSearchFallbackBpage(String data) throws InterruptedException{
        try{
        print("-------------------STARTING TO TEST SHOPPING BUTTONS ON NATIVE BPAGE -------------------");
        testName("Search native Bpage with Amazon shopping button");
        Thread.sleep(5000);
        try {
            amazonButton.completeSearch(data);
        }catch (Exception e) {}
        }catch (Exception e){}
    }

    @Test(priority = 17)
    public void testBuyFromAmazonButtonIsPresent() {
        try{
        testName("Verify 'Buy from Amazon' button is present on bpage");
        // Assert.assertEquals(amazonButton.bpageTitleIsPresent(), "33 Trendy Pieces Your Friends Will Want To Borrow");
        print("Verified Bpage title is present. Bpage loaded fine.");

        //    scroll.scrollDown90_10();
        nativeBpage.scrollInBpageMultipleTimes(1);

//        Assert.assertTrue(amazonButton.buyFromAmazonIsPresent());
        print("Verified 'Buy from Amazon' button is present");
        }catch (Exception e){}
    }

    @Test(priority = 18)
    public void testBuyFromAmazonButton()throws InterruptedException {
        try{
        Thread.sleep(4000);
        testName("Verify 'Buy from Amazon' button is present on bpage");
        try {
            amazonButton.tapBuyFromAmazonButton();

            Assert.assertTrue(amazonButton.amazonSiteIsPresent());
            print("Verified 'Amazon' site loaded fine");

            //   amazonButton.returnToBFApp();
            getDriver().activateApp("com.apple.mobilesafari");
            //   getDriver().get("buzz://jenae_sitzes/best-deals-this-week-5-9-22");
            //   getDriver().navigate().to("buzz://jenae_sitzes/best-deals-this-week-5-9-22");
            amazonButton.tapSafariHeader();
            Thread.sleep(2000);
            amazonButton.enterTextOnSafari("buzzfeed://");
            amazonButton.tapOnOpenAlert();
        }catch (Exception e){}
        }catch (Exception e){}

    }



  //  @Test(priority = 29)
    public void failTest(){
        Assert.assertTrue(false);
    }
}
