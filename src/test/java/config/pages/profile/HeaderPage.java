package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HeaderPage extends CommonPage {

    //Catching elements
    private final By displayNameBF = MobileBy.AccessibilityId("salpimienta");
    private final By newDisplayName = MobileBy.AccessibilityId("salpimientas");
    private final By displayNameFB = MobileBy.AccessibilityId("s4c162ba1f");
    private final By editProfileButton = MobileBy.AccessibilityId("Settings");
   // private final By editProfileButton = MobileBy.AccessibilityId("Edit profile");
  //  private final By editDisplayNameButton = MobileBy.AccessibilityId("Edit display name");
    private final By editDisplayNameButton = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]");
    private final By displayNameTextField = MobileBy.iOSNsPredicateString("type == \"XCUIElementTypeTextField\"");
    private final By editDisplayNameModal = MobileBy.AccessibilityId("You may update your display name whenever you like.");
  //  private final By editUserNameModal = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]");
 //    private final By editUserNameButton = MobileBy.AccessibilityId("Edit user name");
     private final By editUserNameButton = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]");
    private final By editUserNameModal = MobileBy.AccessibilityId("Choose wisely! You can only change this once, and only if you haven’t written any BuzzFeed posts.");
    private final By updateProfilePhotoButton = MobileBy.AccessibilityId("Update profile photo");
    private final By deleteProfilePhotoButton = MobileBy.AccessibilityId("Delete profile photo");
    private final By chooseFromLibrary = MobileBy.AccessibilityId("Choose from library");
    private final By photo = By.xpath("//*[contains(@name,'Photo,')]");
    private final By choosePhoto = MobileBy.AccessibilityId("Choose");
    private final By signOutBtn = MobileBy.AccessibilityId("Sign out");
    private final By areYouSureBtn = By.xpath("//XCUIElementTypeAlert[@name=\"Are you sure?\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]");


    //Methods

    public void clickOnAreYouSureOkBtn() {driver.findElement(areYouSureBtn).click();}
    public void clickOnSignOutBtn(){driver.findElement(signOutBtn).click();}
    public boolean displayNameIsPresent() {
        return driver.findElement(displayNameBF).isDisplayed();
    }

    public boolean fbDisplayNameIsPresent() {
        return driver.findElement(displayNameFB).isDisplayed();
    }

    public boolean editProfileButtonIsPresent() {
        return driver.findElement(editProfileButton).isDisplayed();
    }

    public void tapEditProfileButton() {
        driver.findElement(editProfileButton).click();
        print ("Tapped Edit Profile button");
    }

    public boolean editDisplayNameButtonIsPresent() {
        return driver.findElement(editDisplayNameButton).isDisplayed();
    }

    public void tapEditDisplayNameButton() {
        driver.findElement(editDisplayNameButton).click();
        print ("Tapped Edit Display Name button");
    }

    public void enterDisplayName(String displayName) {
        driver.findElement(displayNameTextField).clear();
        driver.findElement(displayNameTextField).sendKeys(displayName);
        print ("Entered a new Display Name");
    }

    public boolean editUserNameModalIsPresent() {
        return driver.findElement(editUserNameModal).isDisplayed();
    }

    public boolean editUserNameButtonIsPresent() {
        return driver.findElement(editUserNameButton).isDisplayed();
    }

    public void tapEditUserNameButton() {
        driver.findElement(editUserNameButton).click();
        print ("Tapped Edit User Name button");
    }

    public boolean updateProfilePhotoButtonIsPresent() {
        return driver.findElement(updateProfilePhotoButton).isDisplayed();
    }

    public void tapUpdateProfilePhotoButton() {
        driver.findElement(updateProfilePhotoButton).click();
        print ("Tapped Update profile photo button");
    }

    public boolean deleteProfilePhotoButtonIsPresent() {
        return driver.findElement(deleteProfilePhotoButton).isDisplayed();
    }

    public void tapDeleteProfilePhotoButton() {
        driver.findElement(deleteProfilePhotoButton).click();
        print ("Tapped Update profile photo button");
    }

    public boolean editDisplayNameModalIsPresent() {
        return driver.findElement(editDisplayNameModal).isDisplayed();
    }

    public boolean newDisplayNameIsPresent() {
        WaitersPage.waitForElement(newDisplayName);
        return driver.findElement(newDisplayName).isDisplayed();
    }

    public boolean chooseFromLibraryIsPresent() {
        return driver.findElement(chooseFromLibrary).isDisplayed();
    }

    public void tapChooseFromLibrary() {
        driver.findElement(chooseFromLibrary).click();
        print ("Tapped Choose from library option");
    }

    public void tapPhoto() {
        driver.findElement(photo).click();
        print ("Selected a photo");
    }

    public void tapChoosePhoto() {
        driver.findElement(choosePhoto).click();
        print ("Added a new profile photo");
    }
}