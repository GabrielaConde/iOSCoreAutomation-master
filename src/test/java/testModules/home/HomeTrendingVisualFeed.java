package testModules.home;

import config.initPages.EditionsInit;
import config.pages.bpage.BpageCommentsPage;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import config.pages.signIn.SignInFBPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class HomeTrendingVisualFeed extends EditionsInit {
    protected SettingsSetupPage disableAdExp;
    protected SettingsSetupPage enableExp;
    protected String testName;
    protected BpageCommentsPage nativeComments;



  //   @BeforeClass
    public void initProcess() {
        testName("Enabling Trending Product package experiments");
    }

    @Test(priority = 1)
    public void validateCommentsButton()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapOnTrending();
        Thread.sleep(3000);
        latestSubTab.closeGoToGamesScreen();
        Thread.sleep(6000);
        latestSubTab.tapOnTrending();
        Thread.sleep(3000);
        latestSubTab.tapOnCommentBtn();
        Thread.sleep(2000);
        latestSubTab.closeComments();

    }

   @Test(priority = 2)
    public void validateBookmarksButton() throws InterruptedException{
        nativeComments = new BpageCommentsPage();
        signIn = new SignInFBPage();
       Thread.sleep(2000);
        latestSubTab.tapOnBookmarks();
       Thread.sleep(3000);
       signIn.tapFBLoginButton();
       Thread.sleep(2000);
       signIn.tapContinueBtn();
       Thread.sleep(7000);
       signIn.tapUserFieldOnFB();
       signIn.sendUserDataOnFB("shammni@hotmail.com");
       signIn.tapPasswordFieldOnFB();
       signIn.sendPassDataOnFB("sanfer12");
       signIn.tapLoginButtonOnFB();
       Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void validateShareButton()throws InterruptedException{
        Thread.sleep(3000);
        latestSubTab.tapOnShareBtn();
        latestSubTab.tapCloseButton();

    }

    @Test(priority = 4)
    public void validateViewsButton()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapOnViewsBtn();
        latestSubTab.tapBackButton();

    }

    @Test(priority = 5)
    public void validateAuthorButton()throws InterruptedException{
        Thread.sleep(3000);
        latestSubTab.tapOnAuthorName();
        latestSubTab.closeAuthor();
    }


    @Test(priority = 6)
    public void scrollDownOnVisualFeed(){
        latestSubTab.scrollDownOnvisualFeed();
    }

    @Test(priority = 7)
    public void isContinueReadingLblDisplayed()throws InterruptedException{
        Thread.sleep(2000);
       Assert.assertTrue(latestSubTab.validateContinueReadingLblIsDisplayed());
    }

    @Test(priority = 8)
    public void tapOnLifeBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapLifeBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 9)
    public void tapOnVideosBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapVideosBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 10)
    public void tapOnCelebrityBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapCelebrityBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 11)
    public void tapOnAnimalsBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapAnimalsBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 12)
    public void tapOnFoodBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapFoodBtn();
        latestSubTab.tapBackButton();
    }

    @Test(priority = 13)
    public void tapOnMusicBtn()throws InterruptedException{
        Thread.sleep(2000);
        latestSubTab.tapMusicBtn();
        latestSubTab.tapBackButton();
      //  latestSubTab.backHome();
    }

}
