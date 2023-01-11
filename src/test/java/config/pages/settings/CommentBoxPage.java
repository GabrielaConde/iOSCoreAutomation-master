package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class CommentBoxPage extends CommonPage {

    //Catching elements
    private final By commentBoxTitle = MobileBy.AccessibilityId("COMMENT BOX");
    private final By suggestAppFeature = MobileBy.AccessibilityId("Suggest an App Feature, How can we make the BuzzFeed app better?");
    private final By reportIssue = MobileBy.AccessibilityId("Report a Technical Issue");
    private final By editorialFeedback = MobileBy.AccessibilityId("Leave Editorial Feedback");
    private final By FAQSection = MobileBy.AccessibilityId("Frequently Asked Questions");
    private final By betaTester = MobileBy.AccessibilityId("Become a Beta Tester");
    private final By FAQHeader = MobileBy.AccessibilityId("FAQ");
    private final By changeEdition = MobileBy.AccessibilityId("How to change your edition?");
    private final By changeEditionText = MobileBy.AccessibilityId("First you will need to click the small gear tool " +
            "in the top left corner which will open the Settings panel. From Settings, you will go to the Edition tab where you can click a region for our different language feeds from our many offices.");
    private final By resetPassword = MobileBy.AccessibilityId("How to reset your password?");
    private final By resetPassWordText = MobileBy.AccessibilityId("With Sign in with Apple you can reset your password via the App Store. With Google, you can reset the password via Google directly. With Facebook, you can also reset the password on Facebook directly. Lastly, with email if you click on the sign in with email option, you can see a reset password button underneath the sign in button.");
    private final By updateProfilePhoto = MobileBy.AccessibilityId("How to update profile photo?");
    private final By updateProfilePhotoText = MobileBy.AccessibilityId("You can edit your image within the app by clicking the profile icon in the top right corner. This will open a settings tab where you can click the small pencil in the top right corner and then go to update profile photo. You can use an image from your library or take an image to display.");
    private final By editUsername = MobileBy.AccessibilityId("How do you edit your username?");
    private final By editUsernameText = MobileBy.AccessibilityId("You can edit your username by click the image icon in the top right corner, then click the pencil in the top right corner of the tab that opened. This will prompt a pop menu that will allow you to edit your display name and username.");
    private final By editLanguage = MobileBy.AccessibilityId("How do you edit your language?");
    private final By editLanguageText = MobileBy.AccessibilityId("You can edit the language setting by going to your phone Settings > General > Language & Region > Change to desired language or region.");

    //Methods
    public boolean commentBoxTitleIsPresent(){
        return driver.findElement(commentBoxTitle).isDisplayed();
    }

    public boolean suggestAppFeatureIsPresent(){
        return driver.findElement(suggestAppFeature).isDisplayed();
    }

    public boolean reportIssueIsPresent(){
        return driver.findElement(reportIssue).isDisplayed();
    }

    public boolean editorialFeedbackIsPresent(){
        return driver.findElement(editorialFeedback).isDisplayed();
    }

    public boolean FAQSectionIsPresent(){
        return driver.findElement(FAQSection).isDisplayed();
    }

    public void tapFAQSection() {
        driver.findElement(FAQSection).click();
        System.out.println("Tapped the FAQ section");
    }

    public boolean FAQHeaderIsPresent(){
        return driver.findElement(FAQHeader).isDisplayed();
    }

    public boolean changeEditionIsPresent(){
        return driver.findElement(changeEdition).isDisplayed();
    }

    public void tapChangeEdition() {
        driver.findElement(changeEdition).click();
        System.out.println("Expanded the Change Edition FAQ");
    }

    public boolean changeEditionTextIsPresent(){
        return driver.findElement(changeEditionText).isDisplayed();
    }

    public boolean resetPasswordIsPresent(){
        return driver.findElement(resetPassword).isDisplayed();
    }

    public boolean resetPasswordTextIsPresent(){
        return driver.findElement(resetPassWordText).isDisplayed();
    }

    public void tapResetPassword() {
        driver.findElement(resetPassword).click();
        System.out.println("Expanded the Reset Password FAQ");
    }

    public boolean updateProfilePhotoIsPresent(){
        return driver.findElement(updateProfilePhoto).isDisplayed();
    }

    public void tapUpdateProfilePhoto() {
        driver.findElement(updateProfilePhoto).click();
        System.out.println("Expanded the Update Profile Photo FAQ");
    }

    public boolean updateProfilePhotoTextIsPresent(){
        return driver.findElement(updateProfilePhotoText).isDisplayed();
    }

    public boolean editUsernameIsPresent(){
        return driver.findElement(editUsername).isDisplayed();
    }

    public void tapEditUsername() {
        driver.findElement(editUsername).click();
        System.out.println("Expanded the Edit Username FAQ");
    }

    public boolean editUsernameTextIsPresent(){
        return driver.findElement(editUsernameText).isDisplayed();
    }

    public boolean editLanguageIsPresent(){
        return driver.findElement(editLanguage).isDisplayed();
    }

    public void tapEditLanguage() {
        driver.findElement(editLanguage).click();
        System.out.println("Expanded the Edit Language FAQ");
    }

    public boolean editLanguageTextIsPresent(){
        return driver.findElement(editLanguageText).isDisplayed();
    }

    public boolean betaTesterIsPresent(){
        return driver.findElement(betaTester).isDisplayed();
    }

    public void tapBetaTester() {
        driver.findElement(betaTester).click();
        System.out.println("Tapped the Beta Tester section");
    }
}