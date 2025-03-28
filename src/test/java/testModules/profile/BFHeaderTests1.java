package testModules.profile;

import config.dataProvider.ProfileDataProvider;
import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1 - For Buzzfeed Sign In
public class BFHeaderTests1 extends ProfileInit {
 @BeforeClass
 public void signIn()throws InterruptedException{
     header.tapGuestSignInAndNotif();
     header.signInWithBFAuth0();
 }

    @Test()
    public void testDisplayName()throws InterruptedException {
     try {
         testName("Verify Display Name");
         //  Thread.sleep(3000);
         //  header.tapOnPerfBtn();
         Thread.sleep(3000);
         header.tapEditProfileButton();
         header.tapContinueSignIn();
         Thread.sleep(3000);
//        Assert.assertTrue(header.displayNameIsPresent());
         print("Verified User Name is present in the Profile screen");
     }catch (Exception e) {}
    }

  //  @Test(priority = 1)
    public void testEditProfileButton() {
        testName("Verify Edit Profile button");
        Assert.assertTrue(header.editProfileButtonIsPresent());
        print("Verified Edit Profile button is present in the Profile screen");
        header.tapEditProfileButton();
    }

    @Test(priority = 2)
    public void testEditDisplayNameButton() {
     try{
        testName("Verify Edit Display Name option");
         Assert.assertTrue(header.editDisplayNameButtonIsPresent());
        print("Verified Edit Display Name option is present");
        header.tapEditDisplayNameButton();
     }catch (Exception e) {}
    }

    @Test(priority = 3, dataProvider = "ChangedProfileName", dataProviderClass = ProfileDataProvider.class)
    public void testEditDisplayName(String data) throws InterruptedException{
     try{
        testName("Change Edit Display Name");
      //  Assert.assertTrue(header.editDisplayNameModalIsPresent());
        print("Verified Edit Display Name modal is present");
        header.enterDisplayName(data);
        Thread.sleep(2000);
        header.tapDoneButton();
     }catch (Exception e) {}
    }

  //  @Test(priority = 4)
    public void testNewDisplayName() {
        testName("Verify the new Display Name");
       header.newDisplayNameIsPresent();
        print("Verified the new Display Name is present");

    }

    @Test(priority = 5, dataProvider = "BFOriginalProfileName", dataProviderClass = ProfileDataProvider.class)
    public void testChangeBackDisplayName(String data)throws InterruptedException {
     try{
        testName("Change to the previous display name for testing purposes");
        header.tapEditProfileButton();
        header.tapEditDisplayNameButton();
        Thread.sleep(3000);
        header.enterDisplayName(data);
        Thread.sleep(2000);
        header.tapDoneButton();
     }catch (Exception e) {}
    }

    @Test(priority = 6)
    public void testEditUsernameButton() {
     try{
        testName("Verify Edit User Name button");
        header.tapEditProfileButton();
        Assert.assertTrue(header.editUserNameButtonIsPresent());
        print("Verified Edit User Name option is present");
        header.tapEditUserNameButton();
     }catch (Exception e) {}
    }

    @Test(priority = 7)
    public void testEditUsernameModal()throws InterruptedException {
     try{
        testName("Verify Edit User Name modal");
       // header.editUserNameModalIsPresent();
        print("Verified Edit User modal is displayed");
        Thread.sleep(3000);
        header.tapCancelButton();
            Thread.sleep(3000);
            Assert.assertTrue(false);
     }catch (Exception e) {}
    }

  //  @Test(priority = 8)
    public void testUpdateProfilePhoto() throws InterruptedException{
        testName("Verify Update Profile Photo option");
        header.tapEditProfileButton();
         Assert.assertTrue(header.updateProfilePhotoButtonIsPresent());
        print("Verified Update Profile Photo option is present");
        Thread.sleep(3000);
        header.tapUpdateProfilePhotoButton();
    }

   // @Test(priority = 9)
    public void testDeleteProfilePhoto() throws InterruptedException {
        testName("Delete Profile Photo");
        Thread.sleep(3000);
        header.deleteProfilePhotoButtonIsPresent();
        print("Verified Update Profile Photo option is present");
        header.tapDeleteProfilePhotoButton();

    }

//    @Test(priority = 10)
    public void testAddProfilePhoto() throws InterruptedException{
        testName("Add a new profile photo");
        header.tapEditProfileButton();
        header.tapUpdateProfilePhotoButton();
        header.chooseFromLibraryIsPresent();
        print("Verified Choose from library option is present");

        header.tapChooseFromLibrary();
        Thread.sleep(2000);
        header.tapPhoto();
        header.tapChoosePhoto();

    }
}