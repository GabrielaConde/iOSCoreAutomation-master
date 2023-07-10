package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.dataProvider.LoginCredentialsDataProvider;
import config.initPages.BpageInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//6- Continues from FallBpageCommentsTests5
public class NatBpageAddYoursTests6 extends BpageInit {

    @Test(dataProvider = "addYoursButtonNativeBpage", dataProviderClass = BpagesDataProvider.class)
    public void testSearchNativeBpageWAddYoursButton(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST ADD YOURS ON NATIVE BPAGE -------------------");
        testName("Search Native Bpage");
   //     addYours.tapBackButton();
   //     addYours.tapCancelButton();
        addYours.completeSearch(data);
       /* addYours.scrollToAddYoursReadComments();
        addYours.tapReadCommentsButton();*/
        Thread.sleep(3000);
        addYours.tapOnCommentsButton();
    }

    @Test(priority = 1)
    public void testAddYoursButtonIsPresent(){
        testName("Verify 'Add yours' button is present on Comments");
        Assert.assertTrue(addYours.addPhotoButtonIsPresent());
        print("Verified 'Add yours' button is present on Comments");
        addYours.tapAddPhotoButton();
    }

    @Test(priority = 2)
    public void testChooseFromLibraryButtonIsPresent(){
        testName("Verify 'Choose From Library' button is present when tapping 'Add Yours' button");
        Assert.assertTrue(addYours.chooseFromLibraryButtonIsPresent());
        print("Verified 'Choose From Library' button is present");
        addYours.tapChooseFromLibraryButton();

    }

    @Test(priority = 3)
    public void testPhotoOnLibraryIsPresent(){
        testName("Verify photo loads on Library");
        Assert.assertTrue(addYours.photoOnLibraryIsPresent());
        print("Verified photo loads fine on Library feed");
        addYours.tapPhotoFromLibrary();
    }

    @Test(priority = 4)
    public void testDeletePhotoButtonIsPresent(){
        testName("Verify delete (x) button is present when a pic has been selected");
        Assert.assertTrue(addYours.deletePhotoIsPresent());
        print("Verified delete (x) button is present when a pic has been selected");
        addYours.tapDeletePhotoButton();
    }

    @Test(priority = 5)
    public void testDeletedPic() throws RuntimeException {
        testName("Verify pic is deleted after tapping delete (x) button");
            Assert.assertTrue(addYours.deletePhotoIsPresent());
            Assert.fail("Pic was not deleted after tapping delete (x) button");
    }

  //  @Test(priority = 6, dataProvider = "addYoursComment", dataProviderClass = BpagesDataProvider.class)
    public void testAddCommentWithPic(String data) throws InterruptedException{
        testName("Verify sending comment on Comments Lists");
        addYours.tapAddPhotoButton();
        addYours.tapChooseFromLibraryButton();
        Thread.sleep(3000);
        addYours.tapPhotoFromLibrary();
     //   addYours.addComment(data);
     //   addYours.tapPostButton();

    }

    /*
    @Test(priority = 7, dataProvider = "stageUser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterEmail(String data) {
        testName("Enter Email");
        addYours.enterEmail(data);
    }

    @Test(priority = 8, dataProvider = "stagePass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data) {
        testName("Enter password and login");
        addYours.enterPassword(data);
        addYours.tapSignInButton();
        print("Logged in with email");
        addYours.tapPostButton();
    }
     */

   // @Test(priority = 9)
    public void verifyUserIsPresentOnMoreRecentSection(){
        testName("Verify 'User' is present on 'More Recent' Section");
        Assert.assertTrue(addYours.userIsPresent());
        print("Verified 'User' is present on 'More Recent' Section");
    }

    //@Test(priority = 10, dataProvider = "addYoursComment", dataProviderClass = BpagesDataProvider.class)
    public void verifyCommentIsPresent(String data) {
        testName("Verify comment is present on 'More Recent' Section");
        print("Expected comment: " + "'" + data + "'");
        Assert.assertEquals(addYours.commentIsPresent(), data);
        print("Verified comment is present on 'More Recent' Section");
    }

 //   @Test(priority = 11)
    public void verifyPicIsPresentOnComment(){
       testName("Verify the comment includes the pic");
      addYours.picIsPresentOnComment();
        print("Verified pic is present on comment");
        addYours.tapDoneButton();
    }
}
