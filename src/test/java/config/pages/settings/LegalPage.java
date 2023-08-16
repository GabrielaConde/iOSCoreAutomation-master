package config.pages.settings;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
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
    private final By legalSectionTitle = MobileBy.AccessibilityId("LEGAL");
    private final By privacyPolicy = MobileBy.AccessibilityId("BuzzFeed Privacy Policy");
    private final By privacyPolicyTitle = MobileBy.AccessibilityId("BuzzFeed’s Privacy Policy and Cookie Policy");
    private final By userAgreement = MobileBy.AccessibilityId("BuzzFeed User Agreement");
    private final By userAgreementTitle = MobileBy.AccessibilityId("BUZZFEED SERVICE USER AGREEMENT");
    private final By userAccountData = MobileBy.AccessibilityId("BuzzFeed User Account Data, Send an email for instructions on how to access your data.");
    private final By appleData = MobileBy.AccessibilityId("Apple Data & Privacy, Sign in to apple.com to learn more about what Apple collects and how to access your subscription data.");
    private final By quantcastPrivacyPolicy = MobileBy.AccessibilityId("Quantcast Privacy Policy");
    private final By quantcastPrivacyPolicyTitle = By.xpath("//XCUIElementTypeStaticText[@name='Quantcast Privacy Policy']");
    private final By quantcastTracking = By.xpath("//XCUIElementTypeStaticText[@name=\"Quantcast Tracking\"]");
    private final By nielsenRatings = MobileBy.AccessibilityId("Nielsen Ratings");
    private final By aboutNielsen = MobileBy.AccessibilityId("ABOUT NIELSEN MEASUREMENT");
    private final By manageAdvConsent = By.xpath("//XCUIElementTypeStaticText[@name=\"Manage Advertisement Consent\"]");

    //Methods
    public boolean legalSectionTitleIsPresent(){
        return driver.findElement(legalSectionTitle).isDisplayed();
    }
    public boolean manageAdvConsentIsPresent(){
        return driver.findElement(manageAdvConsent).isDisplayed();
    }
    public void tapOnManageAdvConsentIsPresent(){
         driver.findElement(manageAdvConsent).click();
    }



    public boolean privacyPolicyIsPresent(){
        return driver.findElement(privacyPolicy).isDisplayed();
    }

    public void tapPrivacyPolicy() {
        driver.findElement(privacyPolicy).click();
        print("Tapped the Privacy Policy section");
    }

    public boolean privacyPolicyTitleIsPresent(){
        return driver.findElement(privacyPolicyTitle).isDisplayed();
    }

    public boolean userAgreementIsPresent(){
        return driver.findElement(userAgreement).isDisplayed();
    }

    public void tapUserAgreement() {
        driver.findElement(userAgreement).click();
        print("Tapped the User Agreement section");
    }

    public boolean userAgreementTitleIsPresent(){
        return driver.findElement(userAgreementTitle).isDisplayed();
    }

    public boolean userAccountDataIsPresent(){
        return driver.findElement(userAccountData).isDisplayed();
    }

    public boolean appleDataIsPresent(){
        return driver.findElement(appleData).isDisplayed();
    }

    public void tapAppleData() {
        driver.findElement(appleData).click();
        print("Tapped the Apple Data section");
    }

    public boolean quantcastPrivacyPolicyIsPresent(){
        return driver.findElement(quantcastPrivacyPolicyTitle).isDisplayed();
    }

    public void tapQuantcastPrivacyPolicy() {
        driver.findElement(quantcastPrivacyPolicy).click();
        print("Tapped the Quantcast Privacy Policy section");
    }

    public boolean quantcastPrivacyPolicyTitleIsPresent(){
        WaitersPage.waitForElement(quantcastPrivacyPolicyTitle);
        return driver.findElement(quantcastPrivacyPolicyTitle).isDisplayed();
    }

    public boolean quantcastTrackingIsPresent(){
        return driver.findElement(quantcastTracking).isDisplayed();
    }

    public boolean nielsenRatingsIsPresent(){
        return driver.findElement(nielsenRatings).isDisplayed();
    }

    public void tapNielsenRatings() {
        driver.findElement(nielsenRatings).click();
        print("Tapped the Nielsen Ratings section");
    }

    public boolean aboutNielsenIsPresent(){
        return driver.findElement(aboutNielsen).isDisplayed();
    }
}