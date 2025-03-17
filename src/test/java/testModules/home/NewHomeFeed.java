package testModules.home;


import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.home.HomeLatestPage;
import config.pages.settings.SettingsSetupPage;
//import org.apache.tools.ant.taskdefs.Echo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class NewHomeFeed extends EditionsInit {
    SettingsSetupPage disableAds;
    HomeLatestPage homePage;
    @BeforeClass
    public void initProcess() throws InterruptedException{
        try {
            disableAds = new SettingsSetupPage();
            homePage = new HomeLatestPage();
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
        }catch (Exception e) {}
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
        try {
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
        }catch (Exception e) {}

    }
    @Test(priority = 2)
    public void validateTrendingTopics()throws InterruptedException{
        try {
         //   newHomeFeed.scrollUntilTrendingTopics(getDriver());
            scroll.scrollGeneric(0.8,0.7,getDriver());
            newHomeFeed.tapOntopic1();
            Thread.sleep(2000);
            bpage.tapBackButton();
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
        }catch (Exception e){}
    }

    @Test(priority = 3)
    public void validateMoreButton()throws InterruptedException{
        try {
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
        }catch (Exception e){}

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

    @Test(priority = 5)
    public void validateForYOu()throws InterruptedException{
        try {
            Thread.sleep(2000);
            newHomeFeed.scrollUntilForYou(getDriver());
            //  scroll.scrollGeneric(0.8,0.7,getDriver());
            Thread.sleep(2000);
            newHomeFeed.tapOnForYou();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 6)
    public void validateDailyTriviaCell()throws InterruptedException{
        try {
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
       } catch (Exception e) {}
    }

    @Test(priority = 6)
    public void validatePyramidSchemeCell()throws InterruptedException{
         try {
        Thread.sleep(2000);
        newHomeFeed.scrollUntilPyramidSchemeCell(getDriver());
        Thread.sleep(2000);
        newHomeFeed.tapOnPlayNowPyramidScheme();
        Thread.sleep(2000);
        homePage.isPyramidSchemeHeaderDisplayed();
        Thread.sleep(2000);
        homePage.tapOnClosePyramidScheme();
        Thread.sleep(2000);
        newHomeFeed.tapHomeTab();
          } catch (Exception e) {}
    }
    @Test(priority = 7)
    public void validateShoppingSection()throws InterruptedException{
       try {
            Thread.sleep(2000);
            newHomeFeed.scrollUntilShopping(getDriver());
            Thread.sleep(2000);
            newHomeFeed.tapOnShoppingSplash();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 8)
    public void validateOnTheNewsSection()throws InterruptedException{
        try {
            Thread.sleep(2000);
            newHomeFeed.scrollUntilInTheNews(getDriver());
            Thread.sleep(3000);
            newHomeFeed.tapOnInTheNewsCell();
            Thread.sleep(2000);
            newHomeFeed.tapBackButton();
        }catch (Exception e){}
    }

}
