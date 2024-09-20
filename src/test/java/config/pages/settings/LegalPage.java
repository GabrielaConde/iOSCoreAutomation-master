package config.pages.settings;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LegalPage extends CommonPage {

    //Catching elements
    private final By legalSectionTitle = AppiumBy.accessibilityId("LEGAL");
    private final By privacyPolicy = AppiumBy.accessibilityId("BuzzFeed Privacy Policy");
    private final By privacyPolicyTitle = AppiumBy.accessibilityId("BuzzFeed’s Privacy Policy and Cookie Policy");
    private final By userAgreement = AppiumBy.accessibilityId("BuzzFeed User Agreement");
    private final By userAgreementTitle = AppiumBy.accessibilityId("BUZZFEED SERVICE USER AGREEMENT");
    private final By userAccountData = AppiumBy.accessibilityId("BuzzFeed User Account Data, Send an email for instructions on how to access your data.");
    private final By appleData = AppiumBy.accessibilityId("Apple Data & Privacy, Sign in to apple.com to learn more about what Apple collects and how to access your subscription data.");
    private final By quantcastPrivacyPolicy = AppiumBy.accessibilityId("Quantcast Privacy Policy");
    private final By quantcastPrivacyPolicyTitle = By.xpath("//XCUIElementTypeStaticText[@name='Quantcast Privacy Policy']");
    private final By quantcastTracking = By.xpath("//XCUIElementTypeStaticText[@name=\"Quantcast Tracking\"]");
    private final By nielsenRatings = AppiumBy.accessibilityId("Nielsen Ratings");
    private final By aboutNielsen = AppiumBy.accessibilityId("ABOUT NIELSEN MEASUREMENT");
    private final By manageAdvConsent = By.xpath("//XCUIElementTypeStaticText[@name=\"Manage Advertisement Consent\"]");

    //Methods
    public boolean legalSectionTitleIsPresent(){
        return getDriver().findElement(legalSectionTitle).isDisplayed();
    }
    public boolean manageAdvConsentIsPresent(){
        return getDriver().findElement(manageAdvConsent).isDisplayed();
    }
    public void tapOnManageAdvConsentIsPresent(){
         getDriver().findElement(manageAdvConsent).click();
    }



    public boolean privacyPolicyIsPresent(){
        return getDriver().findElement(privacyPolicy).isDisplayed();
    }

    public void tapPrivacyPolicy() {
        getDriver().findElement(privacyPolicy).click();
        print("Tapped the Privacy Policy section");
    }

    public boolean privacyPolicyTitleIsPresent(){
        return getDriver().findElement(privacyPolicyTitle).isDisplayed();
    }

    public boolean userAgreementIsPresent(){
        return getDriver().findElement(userAgreement).isDisplayed();
    }

    public void tapUserAgreement() {
        getDriver().findElement(userAgreement).click();
        print("Tapped the User Agreement section");
    }

    public boolean userAgreementTitleIsPresent(){
        return getDriver().findElement(userAgreementTitle).isDisplayed();
    }

    public boolean userAccountDataIsPresent(){
        return getDriver().findElement(userAccountData).isDisplayed();
    }

    public boolean appleDataIsPresent(){
        return getDriver().findElement(appleData).isDisplayed();
    }

    public void tapAppleData() {
        getDriver().findElement(appleData).click();
        print("Tapped the Apple Data section");
    }

    public boolean quantcastPrivacyPolicyIsPresent(){
        return getDriver().findElement(quantcastPrivacyPolicyTitle).isDisplayed();
    }

    public void tapQuantcastPrivacyPolicy() {
        getDriver().findElement(quantcastPrivacyPolicy).click();
        print("Tapped the Quantcast Privacy Policy section");
    }

    public boolean quantcastPrivacyPolicyTitleIsPresent(){
       // WaitersPage.waitForElement(quantcastPrivacyPolicyTitle);
        return getDriver().findElement(quantcastPrivacyPolicyTitle).isDisplayed();
    }

    public boolean quantcastTrackingIsPresent(){
        return getDriver().findElement(quantcastTracking).isDisplayed();
    }

    public boolean nielsenRatingsIsPresent(){
        return getDriver().findElement(nielsenRatings).isDisplayed();
    }

    public void tapNielsenRatings() {
        getDriver().findElement(nielsenRatings).click();
        print("Tapped the Nielsen Ratings section");
    }

    public boolean aboutNielsenIsPresent(){
        return getDriver().findElement(aboutNielsen).isDisplayed();
    }
}