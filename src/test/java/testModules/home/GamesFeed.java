package testModules.home;

import config.initPages.EditionsInit;
import config.pages.home.HomeLatestPage;
import config.pages.home.NewHomeFeed;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GamesFeed extends EditionsInit {
    NewHomeFeed newHomeFeed;

    @BeforeClass
    public void initProcess() {
        latestSubTab = new HomeLatestPage();
        newHomeFeed = new NewHomeFeed();

        String pwd = "sanfer12";
        String user = "salpimie";
    }

  //  @Test()
    public void signInOnFstLaunch()throws InterruptedException{
        latestSubTab.tapOnSignInLink();
        latestSubTab.enterPassword("sanfer12");
        latestSubTab.enterEmail("salpimie");
        Thread.sleep(2000);
        latestSubTab.tapSignInBFButton();
        Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        latestSubTab.switchToAlert();
        latestSubTab.tapAllowButton();
        latestSubTab.switchToAlert();
        latestSubTab.tapNotNow();
        //  signIn.switchToAlert();
        latestSubTab.setUSEdition();
    }


    @Test(priority = 1)
    public void isGamesLblDisplayed()throws InterruptedException{
        Thread.sleep(2000);
            latestSubTab.tapAllowButton();
        Thread.sleep(2000);
        latestSubTab.tapOnGuestSignIn();
        Thread.sleep(4000);
        Thread.sleep(6000);
        latestSubTab.tapGamesTab();
       Thread.sleep(3000);
       Assert.assertTrue( latestSubTab.isGamesLblDisplayed());
    }

    @Test(priority = 2)
    public void arePyramidSchemeElementsDisplayed(){
       Assert.assertTrue(latestSubTab.isFeaturedGamesDisplayed());
       Assert.assertTrue(latestSubTab.isPyramidSchemeImgDisplayed());
       Assert.assertTrue(latestSubTab.isPyramidSchemeDescDisplayed());
    }

   // @Test(priority = 3)
    public void validateTappingOnPyramidScheme()throws InterruptedException{
        Thread.sleep(3000);
       latestSubTab.clickOnPyramidScheme();
       latestSubTab.tapCloseButton();
    }

   // @Test(priority = 4)
    public void validatePyramidSchemeOnboarding()throws InterruptedException{
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

  //  @Test(priority = 5)
    public void validateTappingOnQuizParty()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.clickOnQuizParty();
        Thread.sleep(2000);
        latestSubTab.tapXMark();
    }

  //  @Test(priority = 6)
    public void validateTappingOnTrivia()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.clickOnDailyTrivia();
        Thread.sleep(2000);
       // latestSubTab.tapXMark();
        Thread.sleep(2000);
     //   latestSubTab.tapHomeTab();
    }

    @Test(priority = 7)
    public void validateTriviaQuizElements() throws InterruptedException{
       Assert.assertTrue(latestSubTab.isDailyTriviaHeaderDisplayed());
       Thread.sleep(3000);
       Assert.assertTrue(latestSubTab.isStartGameDisplayed());
       latestSubTab.tapXMark();
    }

   // @Test(priority = 8)
    public void validateMakeYours() throws InterruptedException{
        Thread.sleep(2000);
        newHomeFeed.tapMakeYours();
        Thread.sleep(4000);
        newHomeFeed.isMakeYoursTitleDisplayed();
        Thread.sleep(1000);
        newHomeFeed.isHotTopicDisplayed();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void validateCreatorsCarrousel()throws InterruptedException{
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

    @Test(priority = 9)
    public void validateWhealOfFortune() throws InterruptedException{
        newHomeFeed.tapOnWhealOfFortune();
        Thread.sleep(3000);
        latestSubTab.tapBackButton();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void validateMoreFunStuff()throws InterruptedException {
    scroll.scrollGenericManyTimes(0.8,0.7, 1, getDriver());
    Thread.sleep(2000);
    newHomeFeed.isMoreFunStuffDisplayed();
    }
    @Test(priority = 11)
    public void tapMoreFunCarrouselItem() throws InterruptedException  {
        newHomeFeed.tapOnNewGamesEveryDay();
        Thread.sleep(2000);
        latestSubTab.tapBackButton();
        Thread.sleep(2000);
        latestSubTab.tapHomeTab();
    }

  //  @Test(priority = 9)
    public void validateTappingOnNepogochi()throws InterruptedException{
        latestSubTab.tapOnNepogochi();
        Thread.sleep(3000);
        latestSubTab.tapBackButton();
        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();

    }




}
