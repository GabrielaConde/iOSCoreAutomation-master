package testModules.quizzes.AsyncQuizzes;

import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import config.pages.bpage.BpagePage;
import config.pages.home.HomeLatestPage;
import config.pages.profile.HeaderPage;
import config.pages.quizzes.QuizzesSubTabsPage;
import config.pages.quizzes.quizzesTypes.QuizPredetPage;
import config.pages.settings.BuzzfeedPlusPage;
import config.pages.settings.SettingsSetupPage;
import config.pages.signIn.SignInMailPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvitationFlowTrivia extends EditionsInit {
    private SettingsSetupPage ABExp;
    private HomeLatestPage latestPage;
    private BuzzfeedPlusPage BFPlus;
    private BpagePage bpage;
    private SignInMailPage signIn;
    private QuizzesSubTabsPage quizzesLatestSubTab;
    private HeaderPage header;
    private SignInMailPage login;
    private QuizPredetPage trivia;


    @BeforeClass
    public void init(){
        ABExp = new SettingsSetupPage();
        latestPage = new HomeLatestPage();
        BFPlus = new BuzzfeedPlusPage();
        bpage = new BpagePage();
        signIn = new SignInMailPage();
        header = new HeaderPage();
        quizzesLatestSubTab = new QuizzesSubTabsPage();
        login = new SignInMailPage();
        trivia = new QuizPredetPage();
    }

    @Test(priority = 1,dataProvider = "predetermined", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST PERSONALITY QUIZ-------------------");
        testName("Search Personality Quiz");
     //   latestPage.tapSplash();
     //   bpage.tapOnBpageTitle();
     //   bpage.tapBackButton();
        // data = "Pick Some Cupcakes And We'll Give You A Biiiiiig City To Live In";
        personality.completeSearch(data);
    }

    @Test(priority = 2)
    public void runQUiz() throws InterruptedException{
        Thread.sleep(3000);
        trivia.tapPlayNowButton();
        for (int i=1; i<15; i++){
            //    personality.tapAnyChoice();
            Thread.sleep(2000);
            trivia.tapAnswer();
            Thread.sleep(2000);
            trivia.tapNextButton();
        }
        trivia.clickInviteFriendBtn();
    }

    @Test(priority = 6)
    public void inviteFriend() throws InterruptedException {
        trivia.clickOnSendBtn();
        Thread.sleep(3000);
        trivia.closeMatchUps();
        Thread.sleep(3000);
        trivia.tapBackButton();
        latestPage.clickOnHomeIcon();
        login.tapProfileButton();
        header.tapEditProfileButton();
        header.clickOnSignOutBtn();
        header.clickOnAreYouSureOkBtn();
    }

}
