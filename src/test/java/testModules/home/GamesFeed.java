package testModules.home;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GamesFeed extends EditionsInit {

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
    public void validateTappingOnPyramidScheme(){
       latestSubTab.clickOnPyramidScheme();
      // latestSubTab.tapCloseButton();
    }

    @Test(priority = 4)
    public void validatePyramidSchemeOnboarding()throws InterruptedException{
       latestSubTab.isPyramidSchemeImgDisplayed();
        Thread.sleep(3000);
       latestSubTab.tapStartPyramid();
       Thread.sleep(2000);
       latestSubTab.isHowToPlayHeaderDisplayed();
        Thread.sleep(4000);
       latestSubTab.tapNextPyramid();
        Thread.sleep(1000);
       latestSubTab.isHowToPlayHeaderDisplayed();
        Thread.sleep(4000);
       latestSubTab.tapNextPyramid();
        Thread.sleep(4000);
       latestSubTab.tapDoneButton();
       Thread.sleep(3000);
       latestSubTab.tapStart();
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
       Assert.assertTrue(latestSubTab.isStartGameDisplayed());
       latestSubTab.tapCloseButton();
    }

    @Test(priority = 8)
    public void validateTappingOnWhoDis(){
        latestSubTab.tapOnWhoDis();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 9)
    public void validateTappingOnNepogochi()throws InterruptedException{
        latestSubTab.tapOnNepogochi();
        Thread.sleep(3000);
        latestSubTab.tapBackButton();
        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();

    }




}
