package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class CommentBoxPage extends CommonPage {

    //Catching elements
    private final By commentBoxTitle = AppiumBy.accessibilityId("COMMENT BOX");
    private final By suggestAppFeature = AppiumBy.accessibilityId("Suggest an App Feature, How can we make the BuzzFeed app better?");
    private final By reportIssue = AppiumBy.accessibilityId("Report a Technical Issue");
    private final By editorialFeedback = AppiumBy.accessibilityId("Leave Editorial Feedback");
    private final By FAQSection = AppiumBy.accessibilityId("Frequently Asked Questions");
    private final By betaTester = AppiumBy.accessibilityId("Become a Beta Tester");
    private final By FAQHeader = AppiumBy.accessibilityId("FAQ");
    private final By changeEdition = AppiumBy.accessibilityId("How to change your edition?");
    private final By changeEditionText = AppiumBy.accessibilityId("First you will need to click the small gear tool " +
            "in the top left corner which will open the Settings panel. From Settings, you will go to the Edition tab where you can click a region for our different language feeds from our many offices.");
    private final By resetPassword = AppiumBy.accessibilityId("How to reset your password?");
    private final By resetPassWordText = AppiumBy.accessibilityId("With Sign in with Apple you can reset your password via the App Store. With Google, you can reset the password via Google directly. With Facebook, you can also reset the password on Facebook directly. Lastly, with email if you click on the sign in with email option, you can see a reset password button underneath the sign in button.");
    private final By updateProfilePhoto = AppiumBy.accessibilityId("How to update profile photo?");
    private final By updateProfilePhotoText = AppiumBy.accessibilityId("You can edit your image within the app by clicking the profile icon in the top right corner. This will open a settings tab where you can click the small pencil in the top right corner and then go to update profile photo. You can use an image from your library or take an image to display.");
    private final By editUsername = AppiumBy.accessibilityId("How do you edit your username?");
    private final By editUsernameText = AppiumBy.accessibilityId("You can edit your username by click the image icon in the top right corner, then click the pencil in the top right corner of the tab that opened. This will prompt a pop menu that will allow you to edit your display name and username.");
    private final By editLanguage = AppiumBy.accessibilityId("How do you edit your language?");
    private final By editLanguageText = AppiumBy.accessibilityId("You can edit the language setting by going to your phone Settings > General > Language & Region > Change to desired language or region.");

    //Methods
    public boolean commentBoxTitleIsPresent(){
        return getDriver().findElement(commentBoxTitle).isDisplayed();
    }

    public boolean suggestAppFeatureIsPresent(){
        return getDriver().findElement(suggestAppFeature).isDisplayed();
    }

    public boolean reportIssueIsPresent(){
        return getDriver().findElement(reportIssue).isDisplayed();
    }

    public boolean editorialFeedbackIsPresent(){
        return getDriver().findElement(editorialFeedback).isDisplayed();
    }

    public boolean FAQSectionIsPresent(){
        return getDriver().findElement(FAQSection).isDisplayed();
    }

    public void tapFAQSection() {
        getDriver().findElement(FAQSection).click();
        System.out.println("Tapped the FAQ section");
    }

    public boolean FAQHeaderIsPresent(){
        return getDriver().findElement(FAQHeader).isDisplayed();
    }

    public boolean changeEditionIsPresent(){
        return getDriver().findElement(changeEdition).isDisplayed();
    }

    public void tapChangeEdition() {
        getDriver().findElement(changeEdition).click();
        System.out.println("Expanded the Change Edition FAQ");
    }

    public boolean changeEditionTextIsPresent(){
        return getDriver().findElement(changeEditionText).isDisplayed();
    }

    public boolean resetPasswordIsPresent(){
        return getDriver().findElement(resetPassword).isDisplayed();
    }

    public boolean resetPasswordTextIsPresent(){
        return getDriver().findElement(resetPassWordText).isDisplayed();
    }

    public void tapResetPassword() {
        getDriver().findElement(resetPassword).click();
        System.out.println("Expanded the Reset Password FAQ");
    }

    public boolean updateProfilePhotoIsPresent(){
        return getDriver().findElement(updateProfilePhoto).isDisplayed();
    }

    public void tapUpdateProfilePhoto() {
        getDriver().findElement(updateProfilePhoto).click();
        System.out.println("Expanded the Update Profile Photo FAQ");
    }

    public boolean updateProfilePhotoTextIsPresent(){
        return getDriver().findElement(updateProfilePhotoText).isDisplayed();
    }

    public boolean editUsernameIsPresent(){
        return getDriver().findElement(editUsername).isDisplayed();
    }

    public void tapEditUsername() {
        getDriver().findElement(editUsername).click();
        System.out.println("Expanded the Edit Username FAQ");
    }

    public boolean editUsernameTextIsPresent(){
        return getDriver().findElement(editUsernameText).isDisplayed();
    }

    public boolean editLanguageIsPresent(){
        return getDriver().findElement(editLanguage).isDisplayed();
    }

    public void tapEditLanguage() {
        getDriver().findElement(editLanguage).click();
        System.out.println("Expanded the Edit Language FAQ");
    }

    public boolean editLanguageTextIsPresent(){
        return getDriver().findElement(editLanguageText).isDisplayed();
    }

    public boolean betaTesterIsPresent(){
        return getDriver().findElement(betaTester).isDisplayed();
    }

    public void tapBetaTester() {
        getDriver().findElement(betaTester).click();
        System.out.println("Tapped the Beta Tester section");
    }
}