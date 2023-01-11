package testModules.quizzes.AsyncQuizzes;

import config.dataProvider.LoginCredentialsDataProvider;
import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.profile.HeaderPage;
import config.pages.quizzes.QuizzesSubTabsPage;
import config.pages.settings.BuzzfeedPlusPage;
import config.pages.home.HomeLatestPage;
import config.pages.settings.SettingsSetupPage;
import config.pages.signIn.SignInMailPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testModules.quizzes.QuizzesSubTabTests;

public class InvitationFlow extends EditionsInit {
    private SettingsSetupPage ABExp;
    private HomeLatestPage latestPage;
    private BuzzfeedPlusPage BFPlus;
    private BpagePage bpage;
    private SignInMailPage signIn;
    private QuizzesSubTabsPage quizzesLatestSubTab;
    private HeaderPage header;
    private SignInMailPage login;


    @Test(priority = 1)
    public void init(){
         ABExp = new SettingsSetupPage();
         latestPage = new HomeLatestPage();
         BFPlus = new BuzzfeedPlusPage();
         bpage = new BpagePage();
         signIn = new SignInMailPage();
         header = new HeaderPage();
         quizzesLatestSubTab = new QuizzesSubTabsPage();
         login = new SignInMailPage();

         try {
             latestPage.tapAllowButton();
           //  latestPage.tapAllowButton();
         }catch (Exception e){}
             //  latestPage.tapBackButton();
             ABExp.turnOnGameHubFF();
             latestPage.tapAllowButton();

    }

    @Test(priority = 2,dataProvider = "personality", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST PERSONALITY QUIZ-------------------");
        testName("Search Personality Quiz");
       // latestPage.tapSplash();
       // bpage.tapOnBpageTitle();
       // bpage.tapBackButton();
       // data = "Pick Some Cupcakes And We'll Give You A Biiiiiig City To Live In";
        personality.completeSearch(data);
    }

   // @Test(priority = 2)
    public void invitationFlow() throws InterruptedException{

        latestPage.tapSplash();
        bpage.tapOnBpageTitle();
        bpage.tapBackButton();
        Thread.sleep(5000);
        driver.get("buzz://akavros0813/what-mean-girls-character-are-you-based-on-your-self-care");
        latestPage.returnToBFApp();
        latestPage.returnToBFApp();
        latestPage.returnToBFApp();
        latestPage.returnToBFApp();

    }

    @Test(priority = 3)
    public void runQUiz() throws InterruptedException{
        Thread.sleep(3000);
       personality.tapPlayNowButton();
        for (int i=1; i<7; i++){
        //    personality.tapAnyChoice();
        personality.tapOption();
        }
        personality.clickInviteFriendBtn();
    }

    @Test(priority = 4)
    public void signInToPlayEnterEmail(){
        String data = "gabmoreau@hotmail.com";
        personality.signInToPlay();
        signIn.enterEmail(data);
    }

    @Test(priority = 5)
    public void signInToPlayEnterPass(){
        String pass = "almadormida12";
        personality.signInToPlay();
        signIn.enterPassword(pass);
        signIn.tapSignInButton();
    }

    @Test(priority = 6)
    public void inviteFriend() throws InterruptedException{
        personality.clickOnSendBtn();
        Thread.sleep(3000);
        personality.closeMatchUps();
        Thread.sleep(3000);
        personality.tapBackButton();
        latestPage.clickOnHomeIcon();
        login.tapProfileButton();
        header.tapEditProfileButton();
        header.clickOnSignOutBtn();
        header.clickOnAreYouSureOkBtn();

   //     Assert.assertTrue(false);
      //  driver.terminateApp("com.buzzfeed.buzzfeed-alpha");

    }



}
