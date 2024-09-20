package testModules.home;

import config.initPages.EditionsInit;
import config.pages.home.HomeLatestPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GamesFeed extends EditionsInit {

    @BeforeClass
    public void initProcess() {
        latestSubTab = new HomeLatestPage();
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

    @Test(priority = 3)
    public void validateTappingOnPyramidScheme()throws InterruptedException{
        Thread.sleep(3000);
       latestSubTab.clickOnPyramidScheme();
      // latestSubTab.tapCloseButton();
    }

    @Test(priority = 4)
    public void validatePyramidSchemeOnboarding()throws InterruptedException{
     //  latestSubTab.isPyramidSchemeImgDisplayed();
        Thread.sleep(6000);
       latestSubTab.tapStartPyramid();
       Thread.sleep(2000);
       latestSubTab.isHowToPlayHeaderDisplayed();
        Thread.sleep(3000);
       latestSubTab.tapNextPyramid();
        Thread.sleep(1000);
       latestSubTab.isHowToPlayHeaderDisplayed();
        Thread.sleep(3000);
       latestSubTab.tapNextPyramid();
        Thread.sleep(3000);
       latestSubTab.tapDoneButton();
       Thread.sleep(2000);
    //   latestSubTab.tapStart();
       latestSubTab.tapCloseButton();
    }

    @Test(priority = 5)
    public void validateTappingOnQuizParty(){
        latestSubTab.clickOnQuizParty();
        latestSubTab.tapCloseButton();
    }

    @Test(priority = 6)
    public void validateTappingOnTrivia(){
        latestSubTab.clickOnDailyTrivia();
     //   latestSubTab.tapCloseButton();
    }

    @Test(priority = 7)
    public void validateTriviaQuizElements() throws InterruptedException{
       Assert.assertTrue(latestSubTab.isDailyTriviaHeaderDisplayed());
       Thread.sleep(3000);
       Assert.assertTrue(latestSubTab.isStartGameDisplayed());
       latestSubTab.tapCloseButton();
    }

  //  @Test(priority = 8)
    public void validateTappingOnWhoDis(){
        latestSubTab.tapOnWhoDis();
        latestSubTab.tapBackButton();
    }

   // @Test(priority = 9)
    public void validateTappingOnNepogochi()throws InterruptedException{
        latestSubTab.tapOnNepogochi();
        Thread.sleep(3000);
        latestSubTab.tapBackButton();
        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();

    }




}
