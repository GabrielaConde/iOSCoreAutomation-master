package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.dataProvider.LoginCredentialsDataProvider;
import config.initPages.BpageInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//7- Continues from NatBpageAddYoursTests6
public class NatBpageCommentsTests7 extends BpageInit  {

    @Test(dataProvider = "nativeBPageComment", dataProviderClass = BpagesDataProvider.class)
    public void testSearchNativeBpage(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST COMMENTS ON NATIVE BPAGE -------------------");
        testName("Search Native Bpage");
        Thread.sleep(4000);
        nativeComments.tapCancelButton();
        nativeComments.completeSearch(data);
    }

    @Test(priority = 1)
    public void verifyCommentsBtnIsPresent()throws InterruptedException {
        testName("Verify 'Read Comments' button is present on Bpage");
        Thread.sleep(3000);
        nativeBpage.tapOnCommentsButton();
    }



    @Test(priority = 4, dataProvider = "comment", dataProviderClass = BpagesDataProvider.class)
    public void addComment(String data){
        testName("Verify sending comment on Comments Lists");
        nativeComments.addComment(data);

    }

    @Test(priority = 5)
    public void verifyPostButtonIsPresent(){
        testName("Verify 'Post' button is present on Comments Lists");
        Assert.assertTrue(nativeComments.postButtonIsPresent());
        print("Verified 'Post' button is present on Comments Lists");

    }

    @Test(priority = 6)
    public void tapPostButton(){
        testName("Verify tapping 'Post' button on Comments Lists");
        nativeComments.tapPostButton();
    }


    @Test(priority = 7, dataProvider = "stageUser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterEmail(String data) {
        testName("Enter Email");
        nativeComments.enterEmail(data);
    }

    @Test(priority = 8, dataProvider = "stagePass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data) throws InterruptedException {
        testName("Enter password and login");
            nativeComments.enterPassword(data);
            nativeComments.tapSignInButton();
            print("Logged in with email");
            Thread.sleep(4000);
            nativeComments.tapNotNow();
            Thread.sleep(3000);
            nativeComments.tapPostButton();
    }


    @Test(priority = 9)
    public void verifyMostHeartSectionIsPresent()throws InterruptedException{
        testName("Verify 'Most Hearts' section is present on Comments Lists");
        Thread.sleep(2000);
        Assert.assertTrue(nativeComments.mostHeartsIsPresent());
        print("Verified 'Most Hearts' section is present on Comments Lists");
    }

    @Test(priority = 10)
    public void verifyMostHeartSectionLoads()throws InterruptedException{
        testName("Verify 'Most Hearts' section loads fine when tapping it");
        nativeComments.tapMostHeartsSection();
        Thread.sleep(3000);
        nativeComments.nativeMostHeartsUserIsPresent();
        print("Verified 'Most Hearts' section is loading fine");

    }

    @Test(priority = 11)
    public void verifyMostRecentSectionIsPresent(){
        testName("Verify 'Most Recent' section is present on Comments Lists");

        nativeComments.mostRecentIsPresent();
        print("Verified 'Most Recent' section is present on Comments Lists");

        nativeComments.tapMostRecentSection();
    }

    @Test(priority = 12)
    public void verifyUserIsPresentOnMoreRecentSection()throws InterruptedException{
        testName("Verify 'User' is present on 'More Recent' Section");
        Thread.sleep(3000);
        nativeComments.userIsPresent();
        print("Verified 'User' is present on 'More Recent' Section");

    }

    @Test(priority = 13, dataProvider = "comment", dataProviderClass = BpagesDataProvider.class)
    public void verifyCommentIsPresent(String data) {
        testName("Verify comment is present on 'More Recent' Section");
        print("Expected comment: " + "'" + data + "'");

        nativeComments.commentIsPresent();
        print("Verified comment is present on 'More Recent' Section");
    }


    @Test(priority = 15)
    public void tapLikeCommentButton(){
        testName("Verify tapping 'Like Comment' button on 'More Recent' Section");
        nativeComments.tapLikeCommentButton();

    }


    @Test(priority = 17)
    public void verifyReplyButtonIsPresent()throws InterruptedException{
        testName("Verify 'Reply' button is present on 'More Recent' Section");
        Thread.sleep(3000);
        nativeComments.replyButtonPresent();
        print("Verified 'Reply' is present on 'More Recent' Section");
        nativeComments.tapReplyButton();
    }

    @Test(priority = 18, dataProvider = "replyComment", dataProviderClass = BpagesDataProvider.class)
    public void replyComment(String data){
        testName("Verify replying a comment on 'More Recent' Section");
        nativeComments.addComment(data);
        nativeComments.tapPostButton();
    }

    @Test(priority = 19, dataProvider = "replyComment", dataProviderClass = BpagesDataProvider.class)
    public void verifyReplyCommentIsPresent(String data)throws InterruptedException {
        testName("Verify reply comment is present on 'More Recent' Section");
        print("Expected comment: " + "'" + data + "'");
        Thread.sleep(3000);
        nativeComments.replyCommentIsPresent();
        print("Verified comment is present on 'More Recent' Section");
        nativeComments.tapDoneButton();

    }
}
