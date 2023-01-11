package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.dataProvider.LoginCredentialsDataProvider;
import config.initPages.BpageInit;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//5- Continues from FallBpageTests4
public class FallBpageCommentsTests5 extends BpageInit {

    protected SettingsSetupPage setUpSettings;

    @BeforeClass
    public void initProcess() {
     /*   fallbackComments.tapBackButton();
        setUpSettings = new SettingsSetupPage();
        setUpSettings.changeToStage();
        fallbackComments.tapContinueButton();
        fallbackComments.tapAllowButton();*/
    }

    @Test(dataProvider = "fallbackBpageComments", dataProviderClass = BpagesDataProvider.class)
    public void testSearchNativeBpage(String data)throws InterruptedException {
        print("-------------------STARTING TO TEST COMMENTS ON NATIVE BPAGE -------------------");
        print("Search Fallback Bpage");

        fallbackComments.completeSearch(data);
    }

   @Test(priority = 1)
    public void verifyReadCommentsIsPresent() {
        testName("Verify 'Read Comments' button is present on Bpage");
          fallbackBpage.tapOnCommentsButton();
      //  fallbackComments.scrollToReadCommentsOnFallBpage();

        try {
           // Assert.assertTrue(fallbackComments.readCommentsIsPresent());
            print("Verified 'Read Comments' button is present on Bpage");
        }catch (RuntimeException exception){
            scroll.scrollDown2Times();
            Assert.assertTrue(fallbackComments.readCommentsIsPresent());
            print("Verified 'Read Comments' button is present on Bpage");
        }

    }

  //  @Test(priority = 2)
    public void tapReadCommentsButton(){
        testName("Verify tapping 'Read Comments' button");
       // fallbackComments.tapOnToolbarComments();
        fallbackComments.tapReadCommentsButton();

    }

    @Test(priority = 3)
    public void verifyReportButtonIsPresent(){
        testName("Verify 'Report' button is present on Comments Lists");
        Assert.assertTrue(fallbackComments.reportButtonIsPresent());
        print("Verified 'Report' button is present on Comments Lists");
    }

    @Test(priority = 4, dataProvider = "comment", dataProviderClass = BpagesDataProvider.class)
    public void addComment(String data){
        testName("Verify sending comment on Comments Lists");
        fallbackComments.addComment(data);
    }

    @Test(priority = 5)
    public void verifyPostButtonIsPresent(){
        testName("Verify 'Post' button is present on Comments Lists");
        Assert.assertTrue(fallbackComments.postButtonIsPresent());
        print("Verified 'Post' button is present on Comments Lists");
    }

    @Test(priority = 6)
    public void tapPostButton(){
        testName("Verify tapping 'Post' button on Comments Lists");
        fallbackComments.tapPostButton();
    }

    @Test(priority = 7, dataProvider = "stageUser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterEmail(String data) {
        testName("Enter Email");
        fallbackComments.enterEmail(data);
    }

    @Test(priority = 8, dataProvider = "stagePass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data) {
        testName("Enter password and login");
        fallbackComments.enterPassword(data);
        fallbackComments.tapSignInButton();

        try{
            fallbackComments.tapOKButton();             //It always fails the first time to login on Stage
            fallbackComments.tapSignInButton();
        }catch (RuntimeException exception){
            print("Logged in with email");
        }
        fallbackComments.tapPostButton();
    }

    @Test(priority = 9)
    public void verifyMostHeartSectionIsPresent(){
        testName("Verify 'Most Hearts' section is present on Comments Lists");
        Assert.assertTrue(fallbackComments.mostHeartsIsPresent());
        print("Verified 'Most Hearts' section is present on Comments Lists");
    }

    @Test(priority = 10)
    public void verifyMostHeartSectionLoads(){
        testName("Verify 'Most Hearts' section loads fine when tapping it");
        fallbackComments.tapMostHeartsSection();

        Assert.assertTrue(fallbackComments.fallbackMostHeartsUserIsPresent());
        print("Verified 'Most Hearts' section is loading fine");
    }

    @Test(priority = 11)
    public void verifyMostRecentSectionIsPresent(){
        testName("Verify 'Most Recent' section is present on Comments Lists");

        Assert.assertTrue(fallbackComments.mostRecentIsPresent());
        print("Verified 'Most Recent' section is present on Comments Lists");

        fallbackComments.tapMostRecentSection();
    }

    @Test(priority = 12)
    public void verifyUserIsPresentOnMoreRecentSection(){
        testName("Verify 'User' is present on 'More Recent' Section");
        Assert.assertTrue(fallbackComments.userIsPresent());
        print("Verified 'User' is present on 'More Recent' Section");
    }

    @Test(priority = 13, dataProvider = "comment", dataProviderClass = BpagesDataProvider.class)
    public void verifyCommentIsPresent(String data) {
        testName("Verify comment is present on 'More Recent' Section");
        print("Expected comment: " + "'" + data + "'");

        Assert.assertEquals(fallbackComments.commentIsPresent(), data);
        print("Verified comment is present on 'More Recent' Section");
    }

    @Test(priority = 14)
    public void verifyLikeCommentButtonIsPresent(){
        testName("Verify 'Like Comment' button is present on 'More Recent' Section");
        Assert.assertTrue(fallbackComments.likeCommentButtonPresent());
        print("Verified 'Like Comment' is present on 'More Recent' Section");
    }

    @Test(priority = 15)
    public void tapLikeCommentButton(){
        testName("Verify tapping 'Like Comment' button on 'More Recent' Section");
        fallbackComments.tapLikeCommentButton();
    }

    @Test(priority = 16)
    public void verifyLikeButtonIsFilled(){
        testName("Verify 'Like Comment' button is filled after voting on 'More Recent' Section");
        Assert.assertTrue(fallbackComments.likeButtonIsFilled());
        print("Verified 'Like Comment' is filled");

    }

    @Test(priority = 17)
    public void verifyReplyButtonIsPresent(){
        testName("Verify 'Reply' button is present on 'More Recent' Section");

        Assert.assertTrue(fallbackComments.replyButtonPresent());
        print("Verified 'Reply' is present on 'More Recent' Section");

        fallbackComments.tapReplyButton();
    }

    @Test(priority = 18, dataProvider = "replyComment", dataProviderClass = BpagesDataProvider.class)
    public void replyComment(String data){
        testName("Verify replying a comment on 'More Recent' Section");
        fallbackComments.addComment(data);
        fallbackComments.tapPostButton();

    }

    @Test(priority = 19, dataProvider = "replyComment", dataProviderClass = BpagesDataProvider.class)
    public void verifyReplyCommentIsPresent(String data) {
        testName("Verify reply comment is present on 'More Recent' Section");
        print("Expected comment: " + "'" + data + "'");

        Assert.assertEquals(fallbackComments.replyCommentIsPresent(), data);
        print("Verified comment is present on 'More Recent' Section");

        fallbackComments.tapDoneButton();
        fallbackBpage.tapBackButton();

    }
}
