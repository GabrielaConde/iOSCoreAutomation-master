package testModules.quizzes.AsyncQuizzes;

import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.home.HomeLatestPage;
import config.pages.settings.BuzzfeedPlusPage;
import config.pages.settings.SettingsSetupPage;
import config.pages.signIn.SignInMailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnerPlayGame extends EditionsInit {
    private SettingsSetupPage ABExp;
    private HomeLatestPage latestPage;
    private BuzzfeedPlusPage BFPlus;
    private BpagePage bpage;
    private SignInMailPage signIn;

    @Test(priority = 1)
    public void init(){
        ABExp = new SettingsSetupPage();
        latestPage = new HomeLatestPage();
        BFPlus = new BuzzfeedPlusPage();
        bpage = new BpagePage();
        signIn = new SignInMailPage();

      /*  try {
            latestPage.tapAllowButton();
            //  latestPage.tapAllowButton();
        }catch (Exception e){}
        //  latestPage.tapBackButton();
        ABExp.turnOnGameHubFF();
        latestPage.tapAllowButton();*/

    }

    @Test(priority = 2)
    public void GotoMatchupsTab(){
        quizzesLatestSubTab.tapQuizzesTab();
        personality.clickOnMatchupsTab();

    }

    @Test(priority = 3)
    public void signInToPlayEnterEmail()throws InterruptedException{
        String data = "SalPimienta";
        personality.signInToPlayMatchups();
        Thread.sleep(5000);
        signIn.enterEmail(data);
    }

    @Test(priority = 4)
    public void signInToPlayEnterPass()throws InterruptedException{
        String pass = "sanfer12";
        signIn.enterPassword(pass);
        signIn.tapSignInButton();
    }

    @Test(priority = 5)
    public void tapOnRoom(){
        personality.tapOnRoom();
        personality.clickOnRoomImage();
        personality.playQUizMatchup();
    }

    @Test(priority = 6)
    public void runQuiz() throws InterruptedException{
        Thread.sleep(3000);
        for (int i=1; i<7; i++){
            //    personality.tapAnyChoice();
            personality.tapOption();
        }
        personality.tapBackButton();
        personality.backFromRooms();
        quizzesLatestSubTab.tapOnSearchIcon();
   //   personality.clickOnTrash();
    //    personality.confirmRoomDelete();
    }

   // @Test(priority = 7)
    public void confirmFail(){
        Assert.assertTrue(false);
    }



}
