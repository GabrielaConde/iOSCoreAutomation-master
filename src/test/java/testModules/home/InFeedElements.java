package testModules.home;

import config.initPages.EditionsInit;
import config.initPages.EditionsInit;
import config.pages.WaitersPage;
import config.pages.bpage.BpageCommentsPage;
import config.pages.bpage.BpagePage;
import config.pages.home.HomeLatestPage;
import config.pages.settings.SettingsSetupPage;
//import org.apache.tools.ant.taskdefs.Echo;
import config.pages.signIn.SignInMailPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InFeedElements extends EditionsInit {
    BpageCommentsPage bpageComments;

    @BeforeClass
    public void initProcess() {
        latestSubTab = new HomeLatestPage();
        String pwd = "sanfer12";
        String user = "salpimie";
    }

    @Test()
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


  //  @Test(enabled = true, priority = 2)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableVisualFeedExp() throws InterruptedException{
        testName("Enabling Trending Product package experiments");
        SettingsSetupPage enableExp = new SettingsSetupPage();
      //  Thread.sleep(5000);
        WaitersPage.waiterEnv(3000);

        enableExp.turnOnVisualFeedFF();
     //   Thread.sleep(8000);
     //   WaitersPage.waiterEnv(8000);
        latestSubTab.tapCloseButton();
        latestSubTab.closeGoToGamesScreen();
    }

    @Test(priority = 3)
    public void tapOnInFeedComments()throws InterruptedException{
        Thread.sleep(3000);
        bpageComments =  new BpageCommentsPage();
     //   Thread.sleep(3000);

       // latestSubTab.tapHomeTab();
       // latestSubTab.tapHomeTab();
        latestSubTab.scrollInHome();
        Thread.sleep(1000);
        latestSubTab.tapOnInFeedComments();
     //   WaitersPage.waiterEnv(2000);
        Thread.sleep(2000);
        bpageComments.tapMostHeartsSection();
        bpageComments.tapMostRecentSection();
     //   WaitersPage.waiterEnv(2000);
        Thread.sleep(2000);
        bpageComments.backFromHome();
    }

    @Test(priority = 4)
    public void validateInFeedDailyTriviaPromo()throws InterruptedException{
      //  scroll.scrollMultipleTimes(2);
      //  latestSubTab.tapHomeTab();
      /*  latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome();
        latestSubTab.scrollInHome(); */
        latestSubTab.scrollMultipleTimesOnhome(8);
        Thread.sleep(1000);
        latestSubTab.tapOnDailyTriviaPromo();
        latestSubTab.tapCloseButton();
        latestSubTab.tapHomeTab();
        latestSubTab.tapHomeTab();

    }
}
