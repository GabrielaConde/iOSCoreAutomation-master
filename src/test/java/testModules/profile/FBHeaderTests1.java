package testModules.profile;

import config.dataProvider.ProfileDataProvider;
import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//1- For Facebook login
public class FBHeaderTests1 extends ProfileInit {

    @Test()
    public void testDisplayName()throws InterruptedException{
        testName("Verify Display Name");
        Thread.sleep(4000);
        Assert.assertTrue(header.fbDisplayNameIsPresent());
        print("Verified User Name is present in the Profile screen");
    }

    @Test(priority = 1)
    public void testEditProfileButton() {
        testName("Verify Edit Profile button");
        Assert.assertTrue(header.editProfileButtonIsPresent());
        print("Verified Edit Profile button is present in the Profile screen");

        header.tapEditProfileButton();
    }

    @Test(priority = 2)
    public void testEditDisplayNameButton() {
        testName("Verify Edit Display Name option");
        Assert.assertTrue(header.editDisplayNameButtonIsPresent());
        print("Verified Edit Display Name option is present");
        header.tapEditDisplayNameButton();
    }

    @Test(priority = 3, dataProvider = "ChangedProfileName", dataProviderClass = ProfileDataProvider.class)
    public void testEditDisplayName(String data) {
        testName("Change Edit Display Name");
        Assert.assertTrue(header.editDisplayNameModalIsPresent());
        print("Verified Edit Display Name modal is present");

        header.enterDisplayName(data);
        header.tapDoneButton();
    }

    @Test(priority = 4)
    public void testNewDisplayName() {
        testName("Verify the new Display Name");
        Assert.assertTrue(header.newDisplayNameIsPresent());
        print("Verified the new Display Name is present");

    }

    @Test(priority = 5, dataProvider = "FBOriginalProfileName", dataProviderClass = ProfileDataProvider.class)
    public void testChangeBackDisplayName(String data) {
        testName("Change to the previous display name for testing purposes");
        header.tapEditProfileButton();
        header.tapEditDisplayNameButton();
        header.enterDisplayName(data);
        header.tapDoneButton();

    }

    @Test(priority = 6)
    public void testEditUsernameButton() {
        testName("Verify Edit User Name button");
        header.tapEditProfileButton();

        Assert.assertTrue(header.editUserNameButtonIsPresent());
        print("Verified Edit User Name option is present");

        header.tapEditUserNameButton();

    }

    @Test(priority = 7)
    public void testEditUsernameModal() throws InterruptedException {
        testName("Verify Edit User Name modal");
        Assert.assertTrue(header.editUserNameModalIsPresent());
        print("Verified Edit User modal is displayed");
        Thread.sleep(2000);
        header.tapCancelButton();

    }

    @Test(priority = 8)
    public void testUpdateProfilePhoto() {
        testName("Verify Update Profile Photo option");
        header.tapEditProfileButton();
        Assert.assertTrue(header.updateProfilePhotoButtonIsPresent());
        print("Verified Update Profile Photo option is present");

        header.tapUpdateProfilePhotoButton();

    }

    @Test(priority = 9)
    public void testDeleteProfilePhoto() {
        testName("Delete Profile Photo");
      //  Assert.assertTrue(header.deleteProfilePhotoButtonIsPresent());
        print("Verified Update Profile Photo option is present");
        header.tapDeleteProfilePhotoButton();
    }

    @Test(priority = 10)
    public void testAddProfilePhoto()throws InterruptedException {
        testName("Add a new profile photo");
        header.tapEditProfileButton();
        header.tapUpdateProfilePhotoButton();

        Assert.assertTrue(header.chooseFromLibraryIsPresent());
        print("Verified Choose from library option is present");

        header.tapChooseFromLibrary();
        header.tapPhoto();
        header.tapChoosePhoto();

    }
}
