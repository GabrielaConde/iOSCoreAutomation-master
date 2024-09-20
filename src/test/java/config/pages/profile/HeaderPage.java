package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HeaderPage extends CommonPage {

    //Catching elements
    private final By displayNameBF = AppiumBy.accessibilityId("salpimienta");
    private final By settingsMnu = AppiumBy.xpath("(//XCUIElementTypeButton[@name=\"Settings\"])[2]");
    private final By newDisplayName = AppiumBy.accessibilityId("salpimientas");
    private final By displayNameFB = AppiumBy.accessibilityId("s4c162ba1f");
    private final By editProfileButton = AppiumBy.accessibilityId("Settings");
   // private final By editProfileButton = AppiumBy.accessibilityId("Edit profile");
    private final By editDisplayNameButton = AppiumBy.accessibilityId("Edit display name");
  //  private final By editDisplayNameButton = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]");
    private final By displayNameTextField = AppiumBy.iOSNsPredicateString("type == \"XCUIElementTypeTextField\"");
    private final By editDisplayNameModal = AppiumBy.accessibilityId("You may update your display name whenever you like.");
  //  private final By editUserNameModal = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]");
    private final By editUserNameButton = AppiumBy.accessibilityId("Edit user name");
  //   private final By editUserNameButton = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]");
    private final By editUserNameModal = AppiumBy.accessibilityId("Choose wisely! You can only change this once, and only if you haven’t written any BuzzFeed posts.");
    private final By updateProfilePhotoButton = AppiumBy.accessibilityId("Update profile photo");
    private final By deleteProfilePhotoButton = AppiumBy.accessibilityId("Delete profile photo");
    private final By chooseFromLibrary = AppiumBy.accessibilityId("Choose from library");
  //  private final By photo = By.xpath("//*[contains(@name,'Photo,')]");
    private final By photo = AppiumBy.accessibilityId("Photo, 30 March 2018, 16:14");
    private final By choosePhoto = AppiumBy.accessibilityId("Choose");
    private final By signOutBtn = AppiumBy.accessibilityId("Sign out");
    private final By areYouSureBtn = By.xpath("//XCUIElementTypeAlert[@name=\"Are you sure?\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]");


    //Methods

     public void tapSettingsItemMnu(){getDriver().findElement(settingsMnu).click();}
    public void clickOnAreYouSureOkBtn() {getDriver().findElement(areYouSureBtn).click();}
    public void clickOnSignOutBtn(){getDriver().findElement(signOutBtn).click();}
    public boolean displayNameIsPresent() {
        return getDriver().findElement(displayNameBF).isDisplayed();
    }

    public boolean fbDisplayNameIsPresent() {
        return getDriver().findElement(displayNameFB).isDisplayed();
    }

    public boolean editProfileButtonIsPresent() {
        return getDriver().findElement(editProfileButton).isDisplayed();
    }

    public void tapEditProfileButton() {
        getDriver().findElement(editProfileButton).click();
        print ("Tapped Edit Profile button");
    }

    public boolean editDisplayNameButtonIsPresent() {
        return getDriver().findElement(editDisplayNameButton).isDisplayed();
    }

    public void tapEditDisplayNameButton() {
        getDriver().findElement(editDisplayNameButton).click();
        print ("Tapped Edit Display Name button");
    }

    public void enterDisplayName(String displayName) {
        getDriver().findElement(displayNameTextField).clear();
        getDriver().findElement(displayNameTextField).sendKeys(displayName);
        print ("Entered a new Display Name");
    }

    public boolean editUserNameModalIsPresent() {
        return getDriver().findElement(editUserNameModal).isDisplayed();
    }

    public boolean editUserNameButtonIsPresent() {
        return getDriver().findElement(editUserNameButton).isDisplayed();
    }

    public void tapEditUserNameButton() {
        getDriver().findElement(editUserNameButton).click();
        print ("Tapped Edit User Name button");
    }

    public boolean updateProfilePhotoButtonIsPresent() {
        return getDriver().findElement(updateProfilePhotoButton).isDisplayed();
    }

    public void tapUpdateProfilePhotoButton() {
        getDriver().findElement(updateProfilePhotoButton).click();
        print ("Tapped Update profile photo button");
    }

    public boolean deleteProfilePhotoButtonIsPresent() {
        return getDriver().findElement(deleteProfilePhotoButton).isDisplayed();
    }

    public void tapDeleteProfilePhotoButton() {
        getDriver().findElement(deleteProfilePhotoButton).click();
        print ("Tapped Update profile photo button");
    }

    public boolean editDisplayNameModalIsPresent() {
        return getDriver().findElement(editDisplayNameModal).isDisplayed();
    }

    public boolean newDisplayNameIsPresent() {
       // WaitersPage.waitForElement(newDisplayName);
        return getDriver().findElement(newDisplayName).isDisplayed();
    }

    public boolean chooseFromLibraryIsPresent() {
        return getDriver().findElement(chooseFromLibrary).isDisplayed();
    }

    public void tapChooseFromLibrary() {
        getDriver().findElement(chooseFromLibrary).click();
        print ("Tapped Choose from library option");
    }

    public void tapPhoto() throws InterruptedException{
        Thread.sleep(10000);
        getDriver().findElement(photo).click();
        print ("Selected a photo");
    }

    public void tapChoosePhoto() {
        getDriver().findElement(choosePhoto).click();
        print ("Added a new profile photo");
    }
}