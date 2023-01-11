package testModules.quizzes;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuizzesLatestTests extends EditionsInit {

    protected SettingsSetupPage setup;

  //  @BeforeClass
    public void initProcess() {
        testName("Disabling Dynamic Ads on Bpages");
        setup = new SettingsSetupPage();
        quizzesLatestSubTab.tapAllowButton();
        quizzesLatestSubTab.tapAllowButton();
        setup.disableAdExp();

    }

    //Quizzes tab, Splash and First cell
  //  @Test
    public void verifyQuizzesTabIsPresent() throws InterruptedException{
        print("-------------------STARTING TO TEST QUIZZES TAB-------------------");
        homeSubTabs.tapSplash();
        bpage.tapOnBpageTitle();
        bpage.tapBackButton();
        testName("Verify Quizzes tab is present");
        Assert.assertTrue(quizzesLatestSubTab.quizzesTabIsPresent());
        print("'Quizzes' tab is present on bottom menu bar");
    }

    @Test (priority = 1)
    public void tapQuizzesTab(){
        testName("Verify tapping Quizzes tab");
        quizzesLatestSubTab.tapQuizzesTab();
        print("Verified 'Quizzes' tab is tap-able");
    }

    @Test (priority = 2)
    public void verifyQuizzesHeaderIsPresent(){
        testName("Verify Quizzes header is present on Quizzes/Latest feed");
        Assert.assertTrue(quizzesLatestSubTab.quizzesHeaderIsPresent());
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");
    }



    @Test (priority = 4)
    public void tapSplash(){
        testName("Verify Splash is present on Quizzes/Latest feed and tap-able");
        Assert.assertTrue(quizzesLatestSubTab.splashCellIsPresent());
        print("Verified Splash is present on Quizzes/Latest feed");

        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 5)
    public void tapFirstCell(){
        testName("Verify fist Quiz under Splash is present");
        Assert.assertTrue(quizzesLatestSubTab.fistCellIsPresent());
        print("Verified first quiz under Splash is present on Quizzes/Latest feed");
        quizzesLatestSubTab.tapFirstCell();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 6)
    public void tapOnMatchups(){
        quizzesLatestSubTab.tapOnMatchups();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 7)
    public void tapOnTrending(){
        quizzesLatestSubTab.tapOnTrending();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();

    }

    @Test (priority = 8)
    public void tapOnResults(){
        quizzesLatestSubTab.tapOnResults();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 9)
    public void tapOnFood(){
        quizzesLatestSubTab.tapOnFood();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 10)
    public void tapOnTrivia(){
        quizzesLatestSubTab.tapOnTrivia();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 11)
    public void tapOnMore(){
        quizzesLatestSubTab.tapOnMore();
    }

    @Test (priority = 12)
    public void tapOnCanWeGuess(){
        quizzesLatestSubTab.tapOnCanWeGuess();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 13)
    public void tapOnDisney(){
        quizzesLatestSubTab.tapOnDisney();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 14)
    public void tapOnWhoAreYou(){
        quizzesLatestSubTab.tapOnWhoAreYou();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }

    @Test (priority = 15)
    public void tapOnLove(){
        quizzesLatestSubTab.tapOnLove();
        quizzesLatestSubTab.tapSplash();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
        quizzesLatestSubTab.tapBackButton();
    }


    //Quiz Party package
  //  @Test(priority = 6)
    public void tapItemsQuizPartyPackage(){
        testName("Verify Quiz Parti items are present and tap-able");
        quizzesLatestSubTab.tapQuizzesTab();
        scroll.scrollDown90_10();
        scroll.scrollDown90_10();
        scroll.scrollDown90_10();
        quizzesLatestSubTab.tapItemsQuizPartyPackage();
    }

   // @Test(priority = 7)
    public void quizPartyHeaderOnLatestFeedIsPresent(){
        testName("Verify Quizzes Party header is present on Quiz Party package");
        Assert.assertTrue(quizzesLatestSubTab.quizPartyHeaderIsPresent());
        print("Verified 'Throw a Quiz Party!' header is present on Quizzes/Latest feed");
    }

    //Quiz Packs package
 //   @Test(priority = 8)
    public void tapItemsQuizPacksPackage(){
        testName("Verify Quiz Packs package is present on Quizzes/Latest feed. Items are tap-able");
        quizzesLatestSubTab.tapItemsQuizPacks();

    }

  //  @Test(priority = 9)
    public void quizPacksHeaderOnLatestFeedIsPresent(){
        testName("Verify Quiz Packs header is present");
       // Assert.assertTrue(quizzesLatestSubTab.quizPacksHeaderIsPresent());
        print("'Quiz Packs' header is present on Quizzes/Latest feed");

    }
}
