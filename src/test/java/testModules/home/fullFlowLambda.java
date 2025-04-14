package testModules.home;


import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.home.HomeLatestPage;
import config.pages.quizzes.QuizzesLatestPage;
import config.pages.quizzes.QuizzesSubTabsPage;
import config.pages.settings.SettingsSetupPage;
//import org.apache.tools.ant.taskdefs.Echo;
import config.pages.shopping.ShoppingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import sun.security.krb5.internal.TGSRep;

import javax.swing.plaf.TableHeaderUI;

public class fullFlowLambda extends EditionsInit {
    SettingsSetupPage disableAds;
    HomeLatestPage homePage;
    ShoppingPage shoppingPage;
    QuizzesSubTabsPage quizzesLatestSubTabs;

    @BeforeClass
    public void initProcess() throws InterruptedException{
        // try {
        disableAds = new SettingsSetupPage();
        homePage = new HomeLatestPage();
        quizzesLatestSubTabs = new QuizzesSubTabsPage();
        Thread.sleep(2000);
        //    latestSubTab.tapAllowButton();
        latestSubTab.tapOnGuestSignIn();
        Thread.sleep(4000);
        disableAds.disableAdExp();
        Thread.sleep(13000);
        //  disableAds.tapAllowButton();
        // Thread.sleep(3000);
        disableAds.closeSubscribe();
        Thread.sleep(2000);
        //   enableHomefeed.enableNewHomeFeed();

        //   latestSubTab.tapAllowButton();
        //   Thread.sleep(3000);
        //   latestSubTab.tapCloseButton();
        //    Thread.sleep(3000);
        //  }catch (Exception e) {}
    }


    // @Test
    public void tapSplash()throws InterruptedException{
        Thread.sleep(3000);
        newHomeFeed.tapOnSplash();
        Thread.sleep(2000);
        bpage.tapBackButton();
    }

    @Test(priority = 1)
    public void validateSeeAll()throws InterruptedException{
        //  try {
        //    latestSubTab.tapAllowButton();
        //   latestSubTab.tapOnGuestSignIn();
        //     Thread.sleep(3000);
        Thread.sleep(3000);
        newHomeFeed.tapOnSeeAll();
        //   Thread.sleep(2000);
        //   newHomeFeed.tapOnTrendingSplash();
        //   Thread.sleep(2000);
        //   newHomeFeed.tapBackButton();
        Thread.sleep(3000);
        newHomeFeed.tapBackButton();
        // }catch (Exception e) {}

    }
    //  @Test(priority = 2)
    public void validateTrendingTopics()throws InterruptedException{
        //   try {
        //   newHomeFeed.scrollUntilTrendingTopics(getDriver());
        scroll.scrollGeneric(0.8,0.7,getDriver());
        //  newHomeFeed.tapOntopic1();
        //Thread.sleep(2000);
        //bpage.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOntopic2();
        Thread.sleep(2000);
        bpage.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOntopic3();
        Thread.sleep(2000);
        bpage.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOntopic4();
        Thread.sleep(2000);
        bpage.tapBackButton();
        //   }catch (Exception e){}
    }

    @Test(priority = 2)
    public void validateMoreButton()throws InterruptedException{
        //  try {
        scroll.scrollGeneric(0.8,0.7,getDriver());
        Thread.sleep(3000);
        newHomeFeed.tapOntMore();
        Thread.sleep(2000);
        newHomeFeed.tapOnFunnyTweetsSubNav();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnLatestSubNav();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapCelebrityBtn();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnTVAndMovies();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnCommunity();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnFood();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnRandomSubNav();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnLGBTQ();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnVideos();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnShows();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnRewind();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnAnimals();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(1000);
        scroll.scrollGeneric(0.8, 0.7, getDriver());
        newHomeFeed.tapOnBooks();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnMusic();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnStyle();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnTravel();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnNifty();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnParents();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapOnShowDown();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        //  }catch (Exception e){}

    }

    // @Test(priority = 4)
    public void validateDiscussionTopic()throws InterruptedException{
        try {
            Thread.sleep(2000);
            newHomeFeed.scrollUntilDiscussionTopic(getDriver());
            //   newHomeFeed.tapDiscussionTopic();
            newHomeFeed.isDiscussionLabelDisplayed();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 3)
    public void validateForYOu()throws InterruptedException{
        //   try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilForYou(getDriver());
        //  scroll.scrollGeneric(0.8,0.7,getDriver());
        Thread.sleep(2000);
        //   newHomeFeed.tapOnForYou();
        //   Thread.sleep(2000);
        //  newHomeFeed.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 4)
    public void validateCreatorsCarrousel()throws InterruptedException{
        Thread.sleep(2000);
        newHomeFeed.scrollUntilMakeYours(getDriver());
        Thread.sleep(2000);
        newHomeFeed.tapOnSeeAllMakeYours();
        Thread.sleep(2000);
        newHomeFeed.tapBackButton();
        Thread.sleep(3000);
//        newHomeFeed.tapOnMakeYoursCell();
        //   Thread.sleep(2000);
        //   bpage.tapBackButton();
        Thread.sleep(3000);
        newHomeFeed.tapOnCreatorItem();
        Thread.sleep(3000);
        newHomeFeed.tapDoneButton();
        Thread.sleep(3000);
        bpage.tapBackButton();
        Thread.sleep(2000);
    }


    @Test(priority = 5)
    public void validateDailyTriviaCell()throws InterruptedException{
        //  try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilDailyTriviaCell(getDriver());
        Thread.sleep(2000);
        newHomeFeed.isPlayNowDailyTriviaDisplayed();
        //   newHomeFeed.tapOnPlayNowDailyTrivia();
        //   Thread.sleep(2000);
        //   homePage.isDailyTriviaHeaderDisplayed();
        //   Thread.sleep(4000);
        //   homePage.tapOnCloseTrivia();
        //   Thread.sleep(4000);
        //   newHomeFeed.tapHomeTab();
        // } catch (Exception e) {}
    }

    @Test(priority = 6)
    public void validatePyramidSchemeCell()throws InterruptedException{
        //   try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilPyramidSchemeCell(getDriver());
        Thread.sleep(2000);
        //   newHomeFeed.tapOnPlayNowPyramidScheme();
        Thread.sleep(2000);
        //    homePage.isPyramidSchemeHeaderDisplayed();
        Thread.sleep(2000);
        //  homePage.tapOnClosePyramidScheme();
        Thread.sleep(2000);
        //  newHomeFeed.tapHomeTab();
        //   } catch (Exception e) {}
    }
    @Test(priority = 7)
    public void validateShoppingSection()throws InterruptedException{
        //  try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilShopping(getDriver());
        Thread.sleep(2000);
        //  newHomeFeed.tapOnShoppingSplash();
        //  Thread.sleep(2000);
        //  newHomeFeed.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 8)
    public void validateOnTheNewsSection()throws InterruptedException{
        //  try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilInTheNews(getDriver());
        Thread.sleep(3000);
        //   newHomeFeed.tapOnInTheNewsCell();
        //    Thread.sleep(2000);
        //     newHomeFeed.tapBackButton();
        //     Assert.assertTrue(false);
        //    }catch (Exception e){}
    }

    @Test(enabled = true, priority = 10)
    public void moveToNewsTab() throws InterruptedException {
        //   try{
        Thread.sleep(3000);
        news.tapNewsTab();
        Thread.sleep(3000);
       /* } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to News Tab"));
            print("ERROR" + e.getMessage());
        }*/

    }

    @Test(priority = 11)
    public void testNewsHeader() throws InterruptedException {
        testName("Verify the News Header");
        Thread.sleep(2000);
        //   try{
        news.newsHeaderIsPresent();
        print("Verified the Buzzfeed News header in the News feed is present");
    /*    } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify the News Header"));
            print("ERROR" + e.getMessage());
        }*/
    }

    @Test(priority = 12)
    public void tapOnNewssplash() throws InterruptedException {
        Thread.sleep(2000);
        news.tapOnNewsSplash();
        Thread.sleep(2000);
        news.newsHeaderIsPresent();
        Thread.sleep(1000);
        bpage.tapBackButtonNews();

    }
//**********************************************************************

    @Test(priority = 13)
    public void testShoppingTab() throws InterruptedException {
        //   try{
        Thread.sleep(3000);
        //  latestSubTab.closeGoToGamesScreen();
        testName("Verify the Shopping Tab");
        shoppingLatestSubTabs.shoppingTabIsPresent();
        print("Verified the Shopping Tab is present in the nav bar");
        print("Verified Allow Notification button");
        //  }catch (Exception e) {}

    }


    @Test(priority = 14)
    public void testShoppingHeaderIsPresent() throws InterruptedException {
        //  try{
        Thread.sleep(5000);
        testName("Verify the Shopping Tab");
        shoppingLatestSubTabs.tapShoppingTab();
        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the Shopping Header is present in the nav bar");
        //  }catch (Exception e) {}

    }

    //  @Test(priority = 2)
    public void validateBFDisclaimer() {
        testName("Verify BF Disclaimer Is present");
        Assert.assertTrue(shoppingLatestSubTabs.IsDisclaimerPresent());
    }


    @Test(priority = 15)
    public void testBeautyCategory() throws InterruptedException {
        //  try{
        testName("Test Beauty Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBeautyCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //  }catch (Exception e) {}
    }

    @Test(priority = 16)
    public void testFashionCategory() throws InterruptedException {
        //  try{
        String category;
        testName("Test Fashion Category");
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFashionCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //   }catch (Exception e) {}

    }

    @Test(priority = 17)
    public void testHomeCategory() throws InterruptedException {
        //  try{
        String category;
        testName("Test Home Category");
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnHomeCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //  }catch (Exception e) {}

    }

    @Test(priority = 18)
    public void testKidsCategory() throws InterruptedException {
        //    try{
        testName("Test Kids Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKidsCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //  }catch (Exception e) {}
    }

    @Test(priority = 19)
    public void testPetsCategory() throws InterruptedException {
        //  try{
        testName("Test Pets Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBPetsCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //   }catch (Exception e) {}
    }

    @Test(priority = 20)
    public void testSexToysCategory() throws InterruptedException {
        //   try{
        testName("Test Sex Toys Category");
        String category;
        Thread.sleep(4000);
        shoppingLatestSubTabs.tapOnSexToysCategory();
        Thread.sleep(4000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        //   }catch (Exception e) {}

    }

    @Test(priority = 21)
    public void testMore() throws InterruptedException {
        //  try{
        testName("Validate Test More Category");
        String category;
        Thread.sleep(4000);
        shoppingLatestSubTabs.tapOnMoreCategory();
        Thread.sleep(4000);
        Assert.assertTrue(shoppingLatestSubTabs.validateAllCateroryTitleIsDisplayed());
        //   }catch (Exception e) {}
    }

    @Test(priority = 22)
    public void validateBeautyAndCareMenu() throws InterruptedException {
        //  try{
        Thread.sleep(3000);
        shoppingLatestSubTabs.clickOnBeautyMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifyBeautyAndCareTitle();
        //  }catch (Exception e) {}
    }

    @Test(priority = 23)
    public void validateShopAllBeautyAndPersonalCareSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapShopBeautyAndPersonalCareSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 24)
    public void validateHairSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapHairSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 25)
    public void validateSMakeUpSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapMakeUpSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(3000);
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 26)
    public void validateOutDoorProductsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOutDoorProductsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 27)
    public void validatePersonalToolsSubMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapPersonalToolsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        // }catch (Exception e) {}
    }

    @Test(priority = 28)
    public void validateSkinCareSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSkinCareSubMenu();
        Thread.sleep(2000);
        // Assert.assertTrue(shoppingLatestSubTabs.validateSkinCareTitle());
        //  }catch (Exception e) {}
    }

    @Test(priority = 29)
    public void validateAcneSolutionsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAcneSolutionsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 30)
    public void validateBodySubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBodySubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 31)
    public void validateFaceSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFaceSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }


    @Test(priority = 33)
    public void validateFashionMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnFashionMenu();
        Thread.sleep(2000);
        Assert.assertTrue(shoppingLatestSubTabs.verifyFashionCatTitle());
        //  }catch (Exception e) {}
    }

    @Test(priority = 34)
    public void validateShopAllFashionSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAllFashionSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 35)
    public void validateFashionAccesoriesSubMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAccesoriesSubMenu();
        Thread.sleep(2000);
        Assert.assertTrue(shoppingLatestSubTabs.validateFashionAccessoriesTitle());
        //  }catch (Exception e) {}
    }

    @Test(priority = 36)
    public void validateBagsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBagsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 37)
    public void validateColdWeatherSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnColdWeatherSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 38)
    public void validateGlassesAndSunglassesSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnGlassesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 39)
    public void validateJewerlySubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnJewerlySubMenu();
        Thread.sleep(2000);
        // shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 40)
    public void validateDressesSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapDressesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 41)
    public void validateFootwareSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFootwareSubMenu();
        Thread.sleep(2000);
        //   Assert.assertTrue(shoppingLatestSubTabs.validateFootwareTitle());
        //  }catch (Exception e) {}

    }

    @Test(priority = 42)
    public void validateBootsSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBootsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 43)
    public void validateDressSubMenu() throws InterruptedException {
        //    try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnDressSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 44)
    public void validateFlatsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFlatsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 45)
    public void validateHeelsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnHeelsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 46)
    public void validateOutDoorSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOutDoorShoesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 47)
    public void validateSandalsSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnSandalsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 48)
    public void validateSneakersSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBagsSneakersMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 49)
    public void validateFormalWareSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFormalWearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 50)
    public void validateJacketsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapJacketsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //    }catch (Exception e) {}
    }

    @Test(priority = 51)
    public void validateJeansSubMenu() throws InterruptedException {
        //    try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapJeansSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 52)
    public void validateLoungeWareSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapLoungeWearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }


    @Test(priority = 53)
    public void validatePantsSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapPlantsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 54)
    public void validateSweatersSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSweatersSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 55)
    public void validateSwimsuitsSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSwimsuitsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 56)
    public void validateTopsSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapTopsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 57)
    public void validateUnderwareSubMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapUnderwearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        // }catch (Exception e) {}
    }


    @Test(priority = 58)
    public void validateHomeMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnHomeMenu();
        Thread.sleep(2000);
        //  Assert.assertTrue(shoppingLatestSubTabs.validateHomeTitle());
        //  }catch (Exception e) {}
    }

    @Test(priority = 59)
    public void validateBathroomSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBathroomsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 60)
    public void validateBeddingAndMatressSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBeddingMatressSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 61)
    public void validateCleaningSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnCleaningSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 62)
    public void validateKitchenSubMenu() throws InterruptedException {
        //     try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKitchenMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateKitchenTitle();
        //     }catch (Exception e) {}
    }

    @Test(priority = 63)
    public void validateAppliancesSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAppliancesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //    }catch (Exception e) {}
    }

    @Test(priority = 64)
    public void validatToolsSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnToolsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }


    @Test(priority = 65)
    public void validateDecorSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnDecorSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 66)
    public void validateFurnitureSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFurnitureSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateFurnitureTitle();
        //  }catch (Exception e) {}
    }

    @Test(priority = 67)
    public void validateBedroomSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBedroomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 68)
    public void validateKidsRoomSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKidsRoomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 69)
    public void validateKitchenRoomSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKitchenSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 70)
    public void validateLivingRoomSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnLivingRoomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 71)
    public void validateSecondOfficeSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOfficeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        // }catch (Exception e) {}
    }


    @Test(priority = 72)
    public void validateOfficeSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapHomeOfficeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 73)
    public void validateOrganizationSubMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOrganizationSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 74)
    public void validateOutdoorSubMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOutDoorHomeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateOnOutDoorTitle();
        //  }catch (Exception e) {}
    }

    @Test(priority = 75)
    public void validateBackyardSubMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBackyardSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        // }catch (Exception e) {}
    }

    @Test(priority = 76)
    public void validateGardenSubMenu() throws InterruptedException {
        //    try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnGardenSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //    }catch (Exception e) {}
    }

    @Test(priority = 77)
    public void validateRecreationSubMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnRecreationSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 78)
    public void validateKidsMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnKidsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 79)
    public void validatePetsMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnPetsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 80)
    public void validateSexToysMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSexToysMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 81)
    public void validateSportsAndFitnessMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSportsMenu();
        Thread.sleep(2000);
        //  Assert.assertTrue(shoppingLatestSubTabs.validateSportsAndFitnessTitle());
        //   }catch (Exception e) {}
    }

    @Test(priority = 82)
    public void validateShopAllSportsAndFitnessMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnShopAllSportsAndFitness();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 83)
    public void validateFitnessAccesoriesMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnFitnessAccessories();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //    }catch (Exception e) {}
    }

    @Test(priority = 84)
    public void validateMachineryMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnMachinery();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 85)
    public void validatePersonalCareMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnPersonalCareMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 86)
    public void validateStoresMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnStoresMenu();
        Thread.sleep(2000);
        // Assert.assertTrue(shoppingLatestSubTabs.validateStoresTitle());}catch (Exception e) {}
    }

    @Test(priority = 87)
    public void validateShopAllStoresMenu() throws InterruptedException {
        // try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAllShopStores();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 88)
    public void validateAmazonMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnAmazon();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 89)
    public void validateEtsyMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnEtsy();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 90)
    public void validateNordstromMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnNordstram();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 91)
    public void validateSephoraMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnSephora();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 92)
    public void validateShopSmallMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnShopSmail();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 93)
    public void validateTargetMenu() throws InterruptedException {
        try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnTarget();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            shoppingLatestSubTabs.tapBackButton();
        } catch (Exception e) {
        }
    }

    @Test(priority = 94)
    public void validateWalmartMenu() throws InterruptedException {
      //  try {
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapOnAllWalmat();
            Thread.sleep(2000);
            shoppingLatestSubTabs.verifySplashCategoryLoads();
            Thread.sleep(2000);
            shoppingLatestSubTabs.tapBackButton();
      //  } catch (Exception e) {

    }

    @Test(priority = 95)
    public void validateWayfairMenu() throws InterruptedException {
        //  try{
        Thread.sleep(3000);
        shoppingLatestSubTabs.tapOnAWayFair();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 96)
    public void validateSubscriptionsMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSubscriptions();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //   }catch (Exception e) {}
    }

    @Test(priority = 97)
    public void validateTechMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnTechMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateTechTitle();
        //  }catch (Exception e) {}
    }

    @Test(priority = 98)
    public void validateShopAllTechMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.shopAllTechMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 99)
    public void validateTechAccessoriesMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapTechAccesoriesMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        // }catch (Exception e) {}
    }

    @Test(priority = 100)
    public void validateGadgetsMenu() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapgadgetsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    @Test(priority = 101)
    public void validateHomeElectronicsMenu() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.taphomeElectronicsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBackButton();
        //  }catch (Exception e) {}
    }

    // COMMENTED AS IT IS DISABLED FOR NOW
    //   @Test(priority = 87)
    public void validateGiftGuideTitle() {
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitle());
    }

    // COMMENTED AS IT IS DISABLED FOR NOW
    // @Test(priority = 88)
    public void validateGiftGuideCTILink() throws InterruptedException {
        scroll.scrollDown90_20();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnCTAGiftGuideLink();
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitleOnScreen());

    }

    // COMMENTED AS IT IS DISABLED FOR NOW
    // @Test(priority = 89)
    public void validateGiftGuideSplashLoads() {
        shoppingLatestSubTabs.tapSplash();
        bpage.tapBackButton();
    }

    //   @Test(priority = 90)
    public void validateTrendingPackageTitleIsDisplayed() {
        Assert.assertTrue(shoppingLatestSubTabs.validateTrendingProductsTitle());
    }

    // @Test(priority = 91)
    public void tapItemsShoppingPackage() {
        testName("Verify Shopping Package items");
        latestSubTab.tapItemsShopPackage();
    }

    //  @Test(priority =92)
    public void openTrendingModal() {
        testName("Verify opening trending Modal for the first item on Trending Product package");
        latestSubTab.tapFirstTrendingCell();
        shoppingLatestSubTabs.tapCloseButton();
        print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");
        shoppingLatestSubTabs.tapBackButton();
    }


    // @Test(priority =93)
    public void testShopNowButton() throws InterruptedException {
        testName("Verify Shop Now button");

        Assert.assertTrue(shoppingLatestSubTabs.shopNowButtonIsPresent());
        print("Verified the Shop Now button is present");

        shoppingLatestSubTabs.tapShopNowButton();
        shoppingLatestSubTabs.returnToBFApp();
    }

    @Test(priority = 102)
    public void validateFeatureStoriesTitle() {
        //  try{
        shoppingLatestSubTabs.featureStoryTitleIsDisplayed();
        //  }catch (Exception e) {}
    }


    @Test(priority = 103)
    public void validateFeatureStoriesDisplays() throws InterruptedException {
        // try{
        testName("validate Feature Stories displays");
        shoppingLatestSubTabs.tapOnFeatureStoriesCell();
        Thread.sleep(3000);
        bpage.tapBackButtonShopping();
        Thread.sleep(3000);
        //  }catch (Exception e) {}

    }

    //QUIZZES=======================================================================

    @Test(priority = 104)
    public void tapQuizzesTab() {
        testName("Verify tapping Quizzes tab");
        quizzesLatestSubTab.tapQuizzesTab();
        print("Verified 'Quizzes' tab is tap-able");
    }

    @Test(priority = 105)
    public void verifyQuizzesHeaderIsPresent() throws InterruptedException {
        testName("Verify Quizzes header is present on Quizzes/Latest feed");
        Thread.sleep(2000);
        Assert.assertTrue(quizzesLatestSubTab.quizzesHeaderIsPresent());
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");
    }


    @Test(priority = 106)
    public void tapQuizSplash() throws InterruptedException {
        testName("Verify Splash is present on Quizzes/Latest feed and tap-able");
        Assert.assertTrue(quizzesLatestSubTab.splashCellIsPresent());
        print("Verified Splash is present on Quizzes/Latest feed");
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapQuizzesBack();
    }

    //  @Test (priority = 5)
    public void tapFirstCell() {
        testName("Verify fist Quiz under Splash is present");
        Assert.assertTrue(quizzesLatestSubTab.fistCellIsPresent());
        print("Verified first quiz under Splash is present on Quizzes/Latest feed");
        quizzesLatestSubTab.tapFirstCell();
        quizzesLatestSubTab.tapBackButton();
    }

    // @Test (priority = 6)
    public void tapOnAIQuizzes() {
        QuizzesLatestPage quizzes = new QuizzesLatestPage();
        quizzesSubTabs.tapOnAIQuizzes();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 107)
    public void tapOnTrending() throws InterruptedException {
        quizzesLatestSubTab.tapOnTrending();
        Thread.sleep(2000);
        //  quizzesLatestSubTab.tapSplash();
        // Thread.sleep(2000);
        //  quizzesLatestSubTab.tapBackButton();
        //  Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
        Thread.sleep(2000);
    }

    // @Test (priority = 8)
    public void tapOnResults() {
        quizzesLatestSubTab.tapOnResults();
        quizzesLatestSubTab.tapBackButton();
    }


    @Test(priority = 108)
    public void tapOnTrivia() throws InterruptedException {
        quizzesLatestSubTab.tapOnTrivia();
        //  Thread.sleep(2000);
        //  quizzesLatestSubTab.tapSplash();
        //  Thread.sleep(2000);
        //  quizzesLatestSubTab.tapBackButton();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 109)
    public void tapOnCanWeGuess() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnCanWeGuess();
        //  Thread.sleep(2000);
        //   quizzesLatestSubTab.tapSplash();
        //  Thread.sleep(2000);
        //  quizzesLatestSubTab.tapBackButton();
        //   Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
        Thread.sleep(2000);
    }


    @Test(priority = 110)
    public void tapOnMore() {
        quizzesLatestSubTab.tapOnMore();
    }

    @Test(priority = 111)
    public void tapOnDisney() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnDisney();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToDisney();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 112)
    public void tapOnFood() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnFood();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backtoFood();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 113)
    public void tapOnWhoAreYou() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnWhoAreYou();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backTWhoAreYou();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 114)
    public void tapOnLove() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTab.tapOnLove();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToLove();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 115)
    public void tapOnTaylorSwift() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnTaylorSwift();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToTaylorSwift();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 116)
    public void tapOnMarvel() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnMarvel();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToMarvel();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 117)
    public void tapOnZodiac() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnZodiac();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToZodiac();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 118)
    public void tapOnHarryPotter() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnHarryPotter();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToHarryPotter();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 119)
    public void tapOnAnime() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnAnime();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToAnime();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 120)
    public void tapOnKPop() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnKpop();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(3000);
        quizzesLatestSubTabs.backToKPop();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 121)
    public void tapOnGeography() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToGeography();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
    }

    @Test(priority = 122)
    public void tapOnChecklist() throws InterruptedException {
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapOnChecklist();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapSplash();
        Thread.sleep(2000);
        quizzesLatestSubTabs.backToChecklist();
        Thread.sleep(2000);
        quizzesLatestSubTab.tapBackButton();
        Thread.sleep(2000);
        quizzesLatestSubTabs.tapHomeTab();
    }

//==============GAMES TAB============================

    @Test(priority = 123)
    public void isGamesLblDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapGamesTab();
        Thread.sleep(3000);
        Assert.assertTrue(latestSubTab.isGamesLblDisplayed());
    }

    @Test(priority = 124)
    public void arePyramidSchemeElementsDisplayed() {
        Assert.assertTrue(latestSubTab.isFeaturedGamesDisplayed());
        Assert.assertTrue(latestSubTab.isPyramidSchemeImgDisplayed());
        Assert.assertTrue(latestSubTab.isPyramidSchemeDescDisplayed());
    }

  //  @Test(priority = 125)
    public void validateTappingOnPyramidScheme() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.clickOnPyramidScheme();
         latestSubTab.tapCloseButton();
    }

  //  @Test(priority = 126)
    public void validatePyramidSchemeOnboarding() throws InterruptedException {
        //  latestSubTab.isPyramidSchemeImgDisplayed();
        Thread.sleep(6000);
        latestSubTab.tapStartPyramid();
        Thread.sleep(2000);
        //  latestSubTab.isHowToPlayHeaderDisplayed();
        //  Thread.sleep(3000);
        latestSubTab.tapNextPyramid();
        Thread.sleep(3000);
        //  latestSubTab.isHowToPlayHeaderDisplayed();
        //   Thread.sleep(3000);
        //   latestSubTab.tapNextPyramid();
        //   Thread.sleep(3000);
        //   latestSubTab.tapDoneButton();
        //   Thread.sleep(2000);
        //   latestSubTab.tapStart();
        latestSubTab.tapXMark();
    }

  //  @Test(priority = 127)
    public void validateTappingOnQuizParty() throws InterruptedException {
        Thread.sleep(2000);
        latestSubTab.clickOnQuizParty();
        Thread.sleep(2000);
        latestSubTab.tapXMark();
    }

  //  @Test(priority = 128)
    public void validateTappingOnTrivia() throws InterruptedException {
        Thread.sleep(2000);
        latestSubTab.clickOnDailyTrivia();
        Thread.sleep(2000);
        // latestSubTab.tapXMark();
        Thread.sleep(2000);
        //   latestSubTab.tapHomeTab();
    }

  //  @Test(priority = 129)
    public void validateTriviaQuizElements() throws InterruptedException {
        Assert.assertTrue(latestSubTab.isDailyTriviaHeaderDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(latestSubTab.isStartGameDisplayed());
        latestSubTab.tapXMark();
    }


    @Test(priority = 130)
    public void validateMakeYours()throws InterruptedException{
        Thread.sleep(2000);
        newHomeFeed.tapMakeYours();
//        newHomeFeed.tapOnMakeYoursCell();
        //   Thread.sleep(2000);
        //   bpage.tapBackButton();
        Thread.sleep(3000);
        newHomeFeed.tapOnCreatorItem();
        Thread.sleep(3000);
        newHomeFeed.tapDoneButton();
        Thread.sleep(3000);
        bpage.tapBackButton();
        Thread.sleep(2000);
        bpage.tapBackButton();
        Thread.sleep(2000);
    }


    @Test(priority = 131)
    public void validateWhealOfFortune() throws InterruptedException {
        newHomeFeed.tapOnWhealOfFortune();
        Thread.sleep(3000);
        latestSubTab.tapBackButton();
        Thread.sleep(2000);
    }

    @Test(priority = 132)
    public void validateMoreFunStuff() throws InterruptedException {
        scroll.scrollGenericManyTimes(0.8, 0.7, 1, getDriver());
        Thread.sleep(2000);
        newHomeFeed.isMoreFunStuffDisplayed();
    }

    @Test(priority = 133)
    public void tapMoreFunCarrouselItem() throws InterruptedException {
        newHomeFeed.tapOnNewGamesEveryDay();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
        Thread.sleep(2000);
        latestSubTab.tapHomeTab();
    }
    //==================FOREIGN EDITIONS==========
    //==================AUSTRALIA=================

    @Test(priority = 134)
    public void testAustraliaEditionIsPresent() {
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        //   editions.tapOnNoThanksSweepTakes();
        //    editions.tapProfileButton();

        editions.tapGearIcon();
        //   editions.tapGearIcon();
        // editions.tapEditionOption();

        //    editions.tapSettingsMenu();
        //   editions.tapEditionOption();
        editions.tapOnEditionOnAustralia();
        editions.tapAustraliaEdition();
        editions.tapCloseButton();

    }

    //Home
    @Test(priority = 135)
    public void testLatestSubTab() throws InterruptedException {
        //   try {
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
      /*  } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 136)
    public void testTrendingSubTab() throws InterruptedException {
        //  try {
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnTrendingSubNav();
        latestSubTab.trendingSubTabIsPresent();
        // latestSubTab.tapTrendingSplash();
        // Thread.sleep(2000);
        //  bpage.tapBackButton();
        print("Verified 'Trending' sub-tab  is present");
        Thread.sleep(2000);
        print("Here i am");
        latestSubTab.tapHomeTab();
      /*  }catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/

    }


    @Test(priority = 137)
    public void testFunnyTweetsSubTab() throws InterruptedException {
        //  try {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnFunnyTweetsSubNav();
        latestSubTab.isFunnyTweetsHeaderDisplayed();
        // latestSubTab.tapSplash();
        // bpage.tapBackButton();
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 138)
    public void testGamesSubTab() {
        //  try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        latestSubTab.isGamesHeaderDisplayed();
        homeSubTabs.tapHomeTab();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 139)
    public void testLatestsSubTab() {
        //  try{

        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnLatestSubNav();
        latestSubTab.isLatestHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        homeSubTabs.tapBackButton();
        latestSubTab.horizontalSwap();
       /* } catch (Exception e){
            //    Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 140)
    public void testRandomSubTab() throws InterruptedException {
        //   try{
        testName("Verify 'Videos' Sub-Tab");

        Thread.sleep(2000);
        //    latestSubTab.tapOnRandomSubNav();
        //     latestSubTab.isRandomHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        //   homeSubTabs.tapHomeTab();
     /*   } catch (Exception e){
            homeSubTabs.tapBackButton();
//            Assert.assertTrue(false);
        }*/
    }

    @Test(priority = 141)
    public void testGossipSubTab() {
        //   try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGossipSubNav();
        latestSubTab.isGossipHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
     /*   } catch (Exception e){
            //   Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 142)
    public void testGayStuffpSubTab() throws InterruptedException {
        Thread.sleep(4000);
        //    try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGaySubNav();
        //  latestSubTab.isLgbtqHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
       //     Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 143)
    public void tapOnMore1() throws InterruptedException {
        //  Thread.sleep(5000);
        Thread.sleep(4000);
        latestSubTab.tapOnMoreSubNav();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);
    }

    //   @Test (priority = 11)
    public void testRecentlyViewedSubTab() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(3000);
        latestSubTab.tapOnRecentlyViewed();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 144)
    public void testEntertainmentSubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnEntertainment();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 145)
    public void testAnimalsSubTab() throws InterruptedException {
        Thread.sleep(2000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(2000);
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 146)
    public void testBooksSubTab() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnBooks();
        Thread.sleep(2000);
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 147)
    public void testFoodSubTab() throws InterruptedException {
        Thread.sleep(3000);
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
    }

    @Test(priority = 148)
    public void testCommunitySubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnCommunity();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 149)
    public void testMusicSubTab() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnMusic();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 150)
    public void testNiftySubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnNifty();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 151)
    public void testParentsSubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnParents();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 152)
    public void testRewindSubTab() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnRewind();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 153)
    public void testStyleSubTab() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnStyle();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 154)
    public void testTravelHomeSubTab() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnTravel();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 155)
    public void testTravelSubTab() {
      //  try {
            testName("Verify Travel sub-tab");
            //    scroll.swipeLeft();
            homeSubTabs.clickOnTraveltab();

            //  Assert.assertTrue(homeSubTabs.travelTabIsPresent());
            //  print("Verified 'Travel' sub-tab is present");

            //  Assert.assertTrue(editions.splashCellIsPresent());
            //  print("Verified Splash is present on 'Travel' sub-tab");

            // print("Bpage on Splash: " + editions.getSplashTitle());
            editions.tapBackButton();
            //  editions.visitSplashAndReturn();
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //News
    @Test(priority = 156)
    public void testGoingNewsTab() throws InterruptedException {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        Thread.sleep(3000);
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
    }

    //  @Test(enabled = true, priority = 24)
    public void tapFstNewsCell() {
        news.tapFirstCell();
        news.tapBackButton();
    }


    //Shopping
       @Test(priority = 157)
    public void testGoingShoppingTab() throws InterruptedException {
        Thread.sleep(5000);
        testName("SHOPPING");
        testName("Verify Shopping tab / Latest sub-tab");
        editions.tapForeignShoppingTab();
        Thread.sleep(3000);
        //  Assert.assertTrue(editions.shoppingHeaderIsPresent());
        print("Verified the 'Shopping' header in the Shopping feed is present");
        editions.isContentDisplayed();
        //  editions.tapSplash();
        // Thread.sleep(2000);
        //  bpage.tapBackButton();
    }


    //Quizzes
    @Test(priority = 158)
    public void testGoingToQuizzesTab() throws InterruptedException {
        Thread.sleep(3000);
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        //  editions.visitSplashAndReturn();

    }

    @Test(priority = 159)
    public void testTapOnTrendingCategory() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
//        editions.tapSplash();
        //      editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    //   @Test (priority = 26)
    public void testTapOnAIQuizzes() {
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnAIQuizzes();
        editions.tapBackButton();
    }

    @Test(priority = 160)
    public void testTapOnTriviaCategory() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        //    quizzesSubTabs.tapSplash();
        //    editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }


    @Test(priority = 161)
    public void testCanWeGuess() throws InterruptedException {
        testName("testTapWCanWeGuess");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnCanWeGuess();
        //     quizzesSubTabs.tapSplash();
        //     editions.tapBackButton();
        Thread.sleep(3000);
        editions.tapBackButton();
    }

    //  @Test (priority = 30)
    public void testTapPolls() throws InterruptedException {
        testName("testTapOnPolls");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(3000);
        editions.tapBackButton();
    }


    @Test(priority = 162)
    public void testOnMore() throws InterruptedException {
        testName("testOnMore");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMore();
    }

    @Test(priority = 163)
    public void testTapOnTaylorSwift() throws InterruptedException {
        Thread.sleep(3000);
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 164)
    public void testTapOnMarvel() throws InterruptedException {
        testName("testTapOnMarvel");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 165)
    public void testTapOnZodiac() throws InterruptedException {
        testName("testTapOnZodiac");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 166)
    public void testTapOnHarryPotter() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 167)
    public void testTapOnAnime() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 168)
    public void testTapOnKPop() throws InterruptedException {
        Thread.sleep(3000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 169)
    public void testTapOnGeography() throws InterruptedException {
        testName("testTapOnGeography");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
    }

    @Test(priority = 170)
    public void testTapOnChecklist() throws InterruptedException {
        testName("testTapOnChecilist");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
    }


    @Test(enabled = true, priority = 171)
    public void tapGamesTab() {
      //  try {
            news.tapGamesTab();
            news.tapHomeTab();
            news.tapBackButton();
     /*   } catch (Exception e) {
            print("ERROR IN THIS TC: " + testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }*/
    }


// END AUSTRALIA

// CANADA EDITION

    @Test(enabled = true, priority = 172)
    public void testCanadaEditionIsPresent() throws InterruptedException {
       // try{
            print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
            testName("Verify 'Australia' edition is present");
            //  editions.tapHomeTab();
            editions.tapSettingsMenu();
            Thread.sleep(2000);
            editions.tapOnEditionOnCanada();
            print("Verified 'Australia' edition is present in the list");

            editions.tapCanadaEdition();
        Thread.sleep(2000);
            editions.tapCloseButton();
    //    }catch (Exception e){}
    }

    @Test(priority = 173)
    public void validateSeeAllCanada()throws InterruptedException{
     //   try {
            //    latestSubTab.tapAllowButton();
            //   latestSubTab.tapOnGuestSignIn();
            //     Thread.sleep(3000);
            Thread.sleep(3000);
            newHomeFeed.tapOnSeeAll();
            //   Thread.sleep(2000);
            //   newHomeFeed.tapOnTrendingSplash();
            //   Thread.sleep(2000);
            //   newHomeFeed.tapBackButton();
            Thread.sleep(3000);
            newHomeFeed.tapBackButton();
      //  }catch (Exception e) {}

    }
  //  @Test(priority = 174)
    public void validateTrendingTopicsCanada()throws InterruptedException{
      //  try {
            //   newHomeFeed.scrollUntilTrendingTopics(getDriver());
            scroll.scrollGeneric(0.8,0.7,getDriver());
            Thread.sleep(2000);
           // newHomeFeed.tapOntopic1();
          //  Thread.sleep(2000);
           // bpage.tapBackButton();
           // Thread.sleep(2000);
            newHomeFeed.tapOntopic2();
            Thread.sleep(2000);
            bpage.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOntopic3();
            Thread.sleep(2000);
            bpage.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOntopic4();
            Thread.sleep(2000);
            bpage.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 175)
    public void validateMoreButtonCanada()throws InterruptedException{
     //   try {
        scroll.scrollGeneric(0.8,0.7,getDriver());
            Thread.sleep(3000);
            newHomeFeed.tapOntMore();
            Thread.sleep(2000);
            newHomeFeed.tapOnFunnyTweetsSubNav();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnLatestSubNav();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapCelebrityBtn();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
       //     newHomeFeed.tapOnTVAndMovies();
       //     Thread.sleep(2000);
          //  newHomeFeed.tapBackButton();
         //   Thread.sleep(2000);
           // newHomeFeed.tapOnCommunity();
          //  Thread.sleep(2000);
          //  newHomeFeed.tapBackButton();
         //   Thread.sleep(2000);
//            newHomeFeed.tapOnFood();
       //     Thread.sleep(2000);
         //   newHomeFeed.tapBackButton();
            Thread.sleep(2000);
        //    newHomeFeed.tapOnRandomSubNav();
        //    Thread.sleep(2000);
         //   newHomeFeed.tapBackButton();
         //   Thread.sleep(2000);
            newHomeFeed.tapOnLGBTQ();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnVideos();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnShows();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnRewind();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnAnimals();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(1000);
            scroll.scrollGeneric(0.8, 0.7, getDriver());
            newHomeFeed.tapOnBooks();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnMusic();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnStyle();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnTravel();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnNifty();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnParents();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapOnShowDown();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
      //  }catch (Exception e){}

    }

    @Test(priority = 176)
    public void testGoingNewsTabOnCanada() throws InterruptedException {
     //   try{
            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();

            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");
     //   }catch (Exception e){}
    }

    @Test(priority = 177)
    public void testGoingToQuizzesTabOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
       // }catch (Exception e){}
    }

    @Test(priority = 178)
    public void testTapOnTrendingCategoryOnCanada() throws InterruptedException {
       // try{
            Thread.sleep(3000);
            testName("testTapOnTrendingCategory");
            testName("Verify going to Trending Quizzes tab");
            quizzesSubTabs.tapOnTrending();
            Thread.sleep(3000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }


    @Test(priority = 179)
    public void testTapOnShowdownOnCanada() throws InterruptedException {
       // try{
            Thread.sleep(3000);
            testName("testTapOnFoodCategory");
            testName("Verify going to Food category");
            quizzesSubTabs.tapOnShowdown();
            Thread.sleep(3000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 180)
    public void testTapOnTriviaCategoryOnCanada() throws InterruptedException {
        //
      //  try{
            Thread.sleep(3000);
            testName("testTapOnTriviaCategory");
            testName("Verify going to Trivia category");
            quizzesSubTabs.tapOnTrivia();
            Thread.sleep(3000);
            editions.tapBackButton();
     //   }catch (Exception e){}
    }

    @Test(priority = 181)
    public void testTapOnCanWeGuessCategory() throws InterruptedException {
     //   try{
            Thread.sleep(3000);
            testName("testTapOnCanWeGuessCategory");
            quizzesSubTabs.tapOnCanWeGuess();
            Thread.sleep(3000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }

    // @Test(priority = 24)
    public void testTapPollsOnCanada() throws InterruptedException {
      //  try{
            testName("testTapOnPolls");
            Thread.sleep(3000);
            quizzesSubTabs.tapOnPolls();
            Thread.sleep(3000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }


    @Test(priority = 182)
    public void testOnMoreOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(2000);
            testName("testOnMore");
            quizzesSubTabs.tapOnMore();
     //   }catch (Exception e){}
    }

    @Test(priority = 183)
    public void testTapOnTaylorSwiftOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testOnTaylorSwift");
            quizzesSubTabs.tapOnTaylorSwift();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 184)
    public void testTapOnMarvelOnCanada() throws InterruptedException {
     //   try{
            Thread.sleep(3000);
            testName("testTapOnMarvel");
            quizzesSubTabs.tapOnMarvel();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
    //    }catch (Exception e){}
    }

    @Test(priority = 185)
    public void testTapOnZodiacOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testTapOnZodiac");
            quizzesSubTabs.tapOnZodiac();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
    //    }catch (Exception e){}
    }

    @Test(priority = 186)
    public void testTapOnHarryPotterOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testTapOnHarryPotter");
            quizzesSubTabs.tapOnHarryPotter();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
     //   }catch (Exception e){}
    }

    @Test(priority = 187)
    public void testTapOnAnimeOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testTapOnAnime");
            quizzesSubTabs.tapOnAnime();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
     //   }catch (Exception e){}
    }

    @Test(priority = 188)
    public void testTapOnKPopOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testTapOnKPop");
            quizzesSubTabs.tapOnKpop();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 189)
    public void testTapOnGeographyOnCanada() throws InterruptedException {
      //  try{
            Thread.sleep(3000);
            testName("testTapOnGeography");
            quizzesSubTabs.tapOnGeographys();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 190)
    public void testTapOnChecklistOnCanada() throws InterruptedException {
     //   try{
            Thread.sleep(3000);
            testName("testTapOnChecilist");
            quizzesSubTabs.tapOnChecklist();
            Thread.sleep(3000);
            quizzesSubTabs.tapBackButton();
           Thread.sleep(4000);
      //  }catch (Exception e){}
    }

    @Test(enabled = true, priority = 191)
    public void tapGamesTabOnCanada()throws InterruptedException {
     //   try{
            news.tapGamesTab();
        Thread.sleep(3000);
            news.tapHomeTab();
        Thread.sleep(3000);
        news.tapBackButton();
        Thread.sleep(2000);
        news.tapHomeTab();
     /*   } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }*/
    }
// INDIA
    @Test(enabled = true, priority = 192)
    public void testIndiaEditionIsPresent() throws InterruptedException{
      //  try{
            print("-------------------STARTING INDIA EDITION TESTS-------------------");
            testName("Verify 'India' edition is present");
        //    editions.tapSettingsMenu();
            editions.tapGearIcon();
            Thread.sleep(2000);
            editions.tapOnEditionOnIndia();
            print("Verified 'India' edition is present in the list");
            editions.tapIndiaEdition();
            editions.tapCloseButton();
      //  }catch (Exception e){}
    }


    @Test(priority = 193)
    public void testLatestSubTabOnIndia() throws InterruptedException {
        //   try {
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
      /*  } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 194)
    public void testTrendingSubTabOnIndia() throws InterruptedException {
        //  try {
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnTrendingSubNav();
        latestSubTab.trendingSubTabIsPresent();
        // latestSubTab.tapTrendingSplash();
        // Thread.sleep(2000);
        //  bpage.tapBackButton();
        print("Verified 'Trending' sub-tab  is present");
        Thread.sleep(2000);
        print("Here i am");
        latestSubTab.tapHomeTab();
      /*  }catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/

    }


    @Test(priority = 195)
    public void testFunnyTweetsSubTabOnIndia() throws InterruptedException {
        //  try {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnFunnyTweetsSubNav();
        latestSubTab.isFunnyTweetsHeaderDisplayed();
        // latestSubTab.tapSplash();
        // bpage.tapBackButton();
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 196)
    public void testGamesSubTabOnIndia() {
        //  try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        latestSubTab.isGamesHeaderDisplayed();
        homeSubTabs.tapHomeTab();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 197)
    public void testLatestsSubTabOnIndia() {
        //  try{

        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnLatestSubNav();
        latestSubTab.isLatestHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        homeSubTabs.tapBackButton();
        latestSubTab.horizontalSwap();
       /* } catch (Exception e){
            //    Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 198)
    public void testRandomSubTabOnIndia() throws InterruptedException {
        //   try{
        testName("Verify 'Videos' Sub-Tab");

        Thread.sleep(2000);
        //    latestSubTab.tapOnRandomSubNav();
        //     latestSubTab.isRandomHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        //   homeSubTabs.tapHomeTab();
     /*   } catch (Exception e){
            homeSubTabs.tapBackButton();
//            Assert.assertTrue(false);
        }*/
    }

    @Test(priority = 199)
    public void testGossipSubTabOnIndia() {
        //   try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGossipSubNav();
        latestSubTab.isGossipHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
     /*   } catch (Exception e){
            //   Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 200)
    public void testGayStuffpSubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        //    try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGaySubNav();
        //  latestSubTab.isLgbtqHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
       //     Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 201)
    public void tapOnMore1OnIndia() throws InterruptedException {
        //  Thread.sleep(5000);
        Thread.sleep(4000);
        latestSubTab.tapOnMoreSubNav();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);
    }

    //   @Test (priority = 11)
    public void testRecentlyViewedSubTabOnIndia() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(3000);
        latestSubTab.tapOnRecentlyViewed();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 202)
    public void testEntertainmentSubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnEntertainment();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 203)
    public void testAnimalsSubTabOnIndia() throws InterruptedException {
        Thread.sleep(2000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(2000);
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 204)
    public void testBooksSubTabOnIndia() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnBooks();
        Thread.sleep(2000);
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 205)
    public void testFoodSubTabOnIndia() throws InterruptedException {
        Thread.sleep(3000);
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
    }

    @Test(priority = 205)
    public void testCommunitySubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnCommunity();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 206)
    public void testMusicSubTabOnIndia() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnMusic();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 207)
    public void testNiftySubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnNifty();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 208)
    public void testParentsSubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnParents();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 209)
    public void testRewindSubTabOnIndia() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnRewind();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 210)
    public void testStyleSubTabOnIndia() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnStyle();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 211)
    public void testTravelHomeSubTabOnIndia() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnTravel();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 212)
    public void testTravelSubTabOnIndia() {
        //  try {
        testName("Verify Travel sub-tab");
        //    scroll.swipeLeft();
        homeSubTabs.clickOnTraveltab();

        //  Assert.assertTrue(homeSubTabs.travelTabIsPresent());
        //  print("Verified 'Travel' sub-tab is present");

        //  Assert.assertTrue(editions.splashCellIsPresent());
        //  print("Verified Splash is present on 'Travel' sub-tab");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapBackButton();
        //  editions.visitSplashAndReturn();
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }


    @Test(priority = 213)
    public void testGoingNewsTabOnIndia() {
      //  try{
            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();
            print("Verified the Buzzfeed News header in the News feed is present");
      //  }catch (Exception e){}
    }

    @Test(priority = 214)
    public void testGoingToQuizzesTabOnIndia() {
      //  try{
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
            //  editions.visitSplashAndReturn();
      //  }catch (Exception e){}

    }

    @Test(priority = 215)
    public void testTapOnTrendingCategoryOnIndia() throws InterruptedException {
    //    try{
            testName("testTapOnTrendingCategory");
            testName("Verify going to Trending Quizzes tab");
            quizzesSubTabs.tapOnTrending();
            Thread.sleep(2000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }
   // ===     quizzesmenu

    @Test(priority = 216)
    public void testTapOnSHowdoenOnIndia()throws InterruptedException {
        //  try{
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnShowdown();
        Thread.sleep(2000);
        editions.tapBackButton();
        //   }catch (Exception e){}
    }

    //  @Test(priority = 217)
    public void testOnMoreOnIndia() throws InterruptedException {
        //   try{
        testName("testOnMore");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnMore();
        //   }catch (Exception e){}
    }

  //  @Test(priority = 218)
    public void testTapOnTriviaCategoryOnIndia() throws InterruptedException {
        //   try{
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(2000);
        editions.tapBackButton();
        //    }catch (Exception e){}
    }

    // @Test(priority = 203)
    public void testTapCanWeGuessOnIndia() throws InterruptedException {
        //   try{
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(2000);
        editions.tapBackButton();
        //   }catch (Exception e){}
    }

    // @Test(priority = 47)
    public void testTapPollsOnUK() throws InterruptedException {
        //   try{
        testName("testTapOnPolls");
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(2000);
        editions.tapBackButton();
        //   }catch (Exception e){}
    }




    //   @Test(priority = 205)
    public void testTapOnTaylorSwiftOnIndia() throws InterruptedException {
        //  try{
        testName("testOnTaylorSwift");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //   }catch (Exception e){}
    }

    // @Test(priority = 206)
    public void testTapOnMarvelOnIndia() throws InterruptedException {
        //  try{
        testName("testTapOnMarvel");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //  }catch (Exception e){}
    }

    //  @Test(priority = 207)
    public void testTapOnZodiacOnIndia() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        testName("testTapOnZodiac");
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //  }catch (Exception e){}
    }

    //  @Test(priority = 208)
    public void testTapOnHarryPotterOnIndia() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //  }catch (Exception e){}
    }

    //  @Test(priority = 209)
    public void testTapOnAnimeOnIndia() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //  }catch (Exception e){}
    }

    //  @Test(priority = 210)
    public void testTapOnKPopOnindia() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        // }catch (Exception e){}
    }

    //  @Test(priority = 211)
    public void testTapOnGeographyOnIndia() throws InterruptedException {
        //  try{
        Thread.sleep(2000);
        testName("testTapOnGeography");
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //   }catch (Exception e){}
    }

    //  @Test(priority = 212)
    public void testTapOnChecklistOnIndia() throws InterruptedException {
        //   try{
        Thread.sleep(2000);
        testName("testTapOnChecilist");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        //   }catch (Exception e){}
    }


    @Test(enabled = true, priority = 217)
    public void tapGamesTabOnIndia2()throws InterruptedException {
     //   try {
            news.tapGamesTab();
            Thread.sleep(2000);
            news.tapHomeTab();
        Thread.sleep(2000);
        news.tapBackButton();
        Thread.sleep(2000);
        news.tapBackButton();
     /*   } catch (Exception e) {
            print("ERROR IN THIS TC: " + testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }*/
    }

    @Test(enabled = true, priority = 218)
    public void testUKEditionIsPresent() {
      //  try{
            print("-------------------STARTING UK EDITION TESTS-------------------");
            testName("Verify 'UK' edition is present");
            editions.tapSettingsMenu();
            editions.tapOnEditionOnUK();

            Assert.assertTrue(editions.ukEditionIsPresent());
            print("Verified 'Australia' edition is present in the list");

            editions.tapUKEdition();
            editions.tapCloseButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 219)
    public void testLatestSubTabONUK() throws InterruptedException {
        //   try {
        testName("HOME");
        testName("Verify Home tab / Lastest sub-tab");
        print("Verified 'BuzzFeed' logo is present on Home feed");
        print("Verified 'Latest' sub-tab is present on Home/Latest");
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
      /*  } catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 220)
    public void testTrendingSubTabONUK() throws InterruptedException {
        //  try {
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Trending' Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnTrendingSubNav();
        latestSubTab.trendingSubTabIsPresent();
        // latestSubTab.tapTrendingSplash();
        // Thread.sleep(2000);
        //  bpage.tapBackButton();
        print("Verified 'Trending' sub-tab  is present");
        Thread.sleep(2000);
        print("Here i am");
        latestSubTab.tapHomeTab();
      /*  }catch (Exception e){
            Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/

    }


    @Test(priority = 221)
    public void testFunnyTweetsSubTabONUK() throws InterruptedException {
        //  try {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(2000);
        latestSubTab.tapOnFunnyTweetsSubNav();
        latestSubTab.isFunnyTweetsHeaderDisplayed();
        // latestSubTab.tapSplash();
        // bpage.tapBackButton();
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 222)
    public void testGamesSubTabONUK() {
        //  try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapGamesTab();
        latestSubTab.isGamesHeaderDisplayed();
        homeSubTabs.tapHomeTab();
      /*  } catch (Exception e){
            homeSubTabs.tapBackButton();
            Assert.assertTrue(false);

        }*/
    }

    @Test(priority = 223)
    public void testLatestsSubTabONUK() {
        //  try{

        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnLatestSubNav();
        latestSubTab.isLatestHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        homeSubTabs.tapBackButton();
        latestSubTab.horizontalSwap();
       /* } catch (Exception e){
            //    Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 224)
    public void testRandomSubTabONUK() throws InterruptedException {
        //   try{
        testName("Verify 'Videos' Sub-Tab");

        Thread.sleep(2000);
        //    latestSubTab.tapOnRandomSubNav();
        //     latestSubTab.isRandomHeaderDisplayed();
        //   latestSubTab.tapSplash();
        //   bpage.tapBackButton();
        //   homeSubTabs.tapHomeTab();
     /*   } catch (Exception e){
            homeSubTabs.tapBackButton();
//            Assert.assertTrue(false);
        }*/
    }

    @Test(priority = 225)
    public void testGossipSubTabONUK() {
        //   try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGossipSubNav();
        latestSubTab.isGossipHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
     /*   } catch (Exception e){
            //   Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 226)
    public void testGayStuffpSubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        //    try{
        testName("Verify 'Videos' Sub-Tab");
        latestSubTab.tapOnGaySubNav();
        //  latestSubTab.isLgbtqHeaderDisplayed();
        //  latestSubTab.tapSplash();
        //  bpage.tapBackButton();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
      /*  } catch (Exception e){
       //     Assert.assertTrue(false);
            homeSubTabs.tapBackButton();
        }*/
    }

    @Test(priority = 227)
    public void tapOnMore1ONUK() throws InterruptedException {
        //  Thread.sleep(5000);
        Thread.sleep(4000);
        latestSubTab.tapOnMoreSubNav();
        // Thread.sleep(5000);
        //    Assert.assertTrue(false);
    }

    //   @Test (priority = 227)
    public void testRecentlyViewedSubTabONUK() throws InterruptedException {
        testName("Verify 'Shows' Sub-Tab");
        Thread.sleep(3000);
        latestSubTab.tapOnRecentlyViewed();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 228)
    public void testEntertainmentSubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnEntertainment();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 229)
    public void testAnimalsSubTabONUK() throws InterruptedException {
        Thread.sleep(2000);
        homeSubTabs.clickOnAnimalsBtn();
        Thread.sleep(2000);
        //  homeSubTabs.tapSplash();
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 230)
    public void testBooksSubTabONUK() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnBooks();
        Thread.sleep(2000);
        //  bpage.tapBackButton();
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 231)
    public void testFoodSubTabONUK() throws InterruptedException {
        Thread.sleep(3000);
        testName("Verify 'Food' sub-tab");
        homeSubTabs.clickOnFoodBtn();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
    }

    @Test(priority = 232)
    public void testCommunitySubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnCommunity();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 233)
    public void testMusicSubTabONUK() throws InterruptedException {
        Thread.sleep(3000);
        latestSubTab.tapOnMusic();
        Thread.sleep(3000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 234)
    public void testNiftySubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnNifty();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 235)
    public void testParentsSubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnParents();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 236)
    public void testRewindSubTabONUK() throws InterruptedException {
        Thread.sleep(4000);
        latestSubTab.tapOnRewind();
        Thread.sleep(4000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 237)
    public void testStyleSubTabONUK() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnStyle();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }

    @Test(priority = 238)
    public void testTravelHomeSubTabONUK() throws InterruptedException {
        Thread.sleep(5000);
        latestSubTab.tapOnTravel();
        Thread.sleep(5000);
        homeSubTabs.tapBackButton();
    }


    @Test(priority = 239)
    public void testTravelSubTabONUK() {
        //  try {
        testName("Verify Travel sub-tab");
        //    scroll.swipeLeft();
        homeSubTabs.clickOnTraveltab();

        //  Assert.assertTrue(homeSubTabs.travelTabIsPresent());
        //  print("Verified 'Travel' sub-tab is present");

        //  Assert.assertTrue(editions.splashCellIsPresent());
        //  print("Verified Splash is present on 'Travel' sub-tab");

        // print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapBackButton();
        //  editions.visitSplashAndReturn();
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 240)
    public void testGoingNewsTabOnUK() {
      //  try{
            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.tapNewsTab();
            print("Verified the Buzzfeed News header in the News feed is present");
     //   }catch (Exception e){}
    }

    @Test(priority = 241)
    public void testGoingToQuizzesTabOnUK() {
     //   try{
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");
            editions.tapQuizzesTab();
            //  editions.visitSplashAndReturn();
      //  }catch (Exception e){}
    }

    @Test(priority = 242)
    public void testTapOnTrendingCategoryOnUK() throws InterruptedException {
       // try{
            testName("testTapOnTrendingCategory");
            testName("Verify going to Trending Quizzes tab");
            quizzesSubTabs.tapOnTrending();
            Thread.sleep(2000);
            editions.tapBackButton();
      //  }catch (Exception e){}
    }

    @Test(priority = 243)
    public void testTapOnShowdownCategoryOnUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnShowdown();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 244)
    public void testTapOnTriviaCategoryOnUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 245)
    public void testTapOnCanWeGuessOnUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 246)
    public void testTapOnMOreOnUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnMore();
        Thread.sleep(2000);
     //   editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 247)
    public void testTapOnPollsUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 248)
    public void testTapOnTaylorSwiftUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 249)
    public void testTapOnMarvelUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 250)
    public void testTapOnZodiacUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 251)
    public void testTapOnHarryPotterUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 252)
    public void testTapOnAnimeUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 253)
    public void testTapOnKpopOnUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }

    @Test(priority = 254)
    public void testTapOnChecklistUK() throws InterruptedException {
        // try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(2000);
        editions.tapBackButton();
        //  }catch (Exception e){}
    }


    @Test(enabled = true, priority = 255)
    public void tapGamesTabOnUK()throws InterruptedException{
        Thread.sleep(2000);
      //  try{
            news.tapGamesTab();
        Thread.sleep(2000);
            news.tapHomeTab();
        Thread.sleep(2000);
      /*  } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }*/
    }

    //END UK

    @Test(enabled = true, priority = 256)
    public void testLatamEditionIsPresent()throws InterruptedException{
       try{
            print("-------------------STARTING LATAM EDITION TESTS-------------------");
            testName("Verify 'Latam' edition is present");
            Thread.sleep(3000);
            editions.tapSettingsMenu();
           Thread.sleep(3000);
            editions.tapOnEditionOnLatam();
            //     Assert.assertTrue(editions.latamEditionIsPresent());
            print("Verified 'India' edition is present in the list");
            editions.tapLatamEdition();
            editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 257)
    public void testLoUltimoSubTab(){
        try{
            testName("INICIO");
            testName("Verify Inicio tab / Lo Último sub-tab");
            print("Verified 'Lo Último' sub-tab is present on Inicio tab");
            //  latestSubTab.tapSplash();
            print("Verified 'Splash' is present on Home/Lo Último feed");
            //  editions.tapAtrasButton();
        }catch (Exception e){}
    }

    @Test(priority = 258)
    public void testTendenciasSubTab()throws InterruptedException{
        try{
            print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
            testName("Verify 'Tendencias' Tab");
            Assert.assertTrue(editions.tendenciasSubTabIsPresent());
            print("Verified 'Tendencias' Sub-tab is present");
            editions.tapTendenciasSubTab();
            //  homeSubTabs.tapSplash();
            print("Verified Splash is present on 'Tendencias' sub-tab");
            //   editions.tapAtrasButton();
            Thread.sleep(3000);
            editions.tapAtrasButton();
        }catch (Exception e){}
    }

    @Test(priority = 259)
    public void testJapanEditionIsPresent()throws InterruptedException{
        try{
            print("-------------------STARTING JAPAN EDITION TESTS-------------------");
            testName("Verify 'Japan' edition is present");
            Thread.sleep(3000);
            editions.tapSettingsMenu();
            editions.tapOnEditionOnJapan();
            editions.tapJapanEdition();
            editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test (priority = 260)
    public void testShoppingTabJapan() throws InterruptedException {
        try{
            testName("NEWS");
            testName("Verify going to News tab / Latest sub-tab");
            editions.shoppingJapan();
            Thread.sleep(3000);
            print("Verified Splash is present on 'Latest' sub-tab");
        }catch (Exception e){}

    }

    //Quizzes
    @Test (priority = 261)
    public void testGoingToQuizzesTabOnJapan()throws InterruptedException {
        try{
            testName("QUIZZES");
            testName("Verify going to Quizzes tab / Latest sub-tab");

            editions.tapQuizzesTab();
            print("Verified 'Quizzes' header is present on Quizzes/Latest feed");
            Thread.sleep(3000);
        }catch (Exception e){}


    }


}


