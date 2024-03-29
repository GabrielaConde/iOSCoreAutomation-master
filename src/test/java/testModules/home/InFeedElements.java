package testModules.home;

import config.initPages.EditionsInit;
import config.initPages.EditionsInit;
import config.pages.WaitersPage;
import config.pages.bpage.BpageCommentsPage;
import config.pages.bpage.BpagePage;
import config.pages.settings.SettingsSetupPage;
import org.apache.tools.ant.taskdefs.Echo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InFeedElements extends EditionsInit {
    BpageCommentsPage bpageComments;

    @Test
    public void testAllowButton()throws InterruptedException{
        print("-------------------STARTING LATEST SUB-TAB TESTS-------------------");
       // testName = "TEST ALLOW BUTTON";
        testName("Verify Allow button is present and tap-able");
        Assert.assertTrue(latestSubTab.allowButtonIsPresent());
        print("Verified Allow Notification button");
        WaitersPage.waiterEnv(3000);
      //  Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        WaitersPage.waiterEnv(3000);
       // Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        WaitersPage.waiterEnv(3000);
       // Thread.sleep(3000);
        latestSubTab.tapOnAcceptAllCookiesBtn();
        WaitersPage.waiterEnv(3000);
     //   Thread.sleep(3000);
        latestSubTab.tapOnGoToGames();
        latestSubTab.tapHomeTab();
    }

    @Test(enabled = true, priority = 2)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableVisualFeedExp() throws InterruptedException{
        testName("Enabling Trending Product package experiments");
        SettingsSetupPage enableExp = new SettingsSetupPage();
      //  Thread.sleep(5000);
        WaitersPage.waiterEnv(5000);
        enableExp.turnOnVisualFeedFF();
     //   Thread.sleep(8000);
        WaitersPage.waiterEnv(8000);
        latestSubTab.tapCloseButton();
        latestSubTab.closeGoToGamesScreen();
    }

    @Test(priority = 3)
    public void tapOnInFeedComments()throws InterruptedException{
        Thread.sleep(6000);
        bpageComments =  new BpageCommentsPage();
     //   Thread.sleep(3000);

        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();
        scroll.scrollDown90_20();
        latestSubTab.tapOnInFeedComments();
        WaitersPage.waiterEnv(2000);
      //  Thread.sleep(2000);
        bpageComments.tapMostHeartsSection();
        bpageComments.tapMostRecentSection();
        WaitersPage.waiterEnv(2000);
    //    Thread.sleep(2000);
        bpageComments.backFromHome();
    }

    @Test(priority = 4)
    public void validateInFeedDailyTriviaPromo()throws InterruptedException{
        scroll.scrollMultipleTimes(2);
        latestSubTab.tapOnDailyTriviaPromo();
        latestSubTab.tapCloseButton();
        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();

    }
}
