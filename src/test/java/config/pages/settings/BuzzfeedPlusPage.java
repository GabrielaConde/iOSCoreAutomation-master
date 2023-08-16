package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BuzzfeedPlusPage extends CommonPage {

    //Catching elements
    private final By closeSubsScreen = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])[2]");
  //  private final By settingsHeader = MobileBy.AccessibilityId("Settings");
    private final By settingsHeader  = By.xpath("//XCUIElementTypeStaticText[@name=\"Settings\"]");
    private final By buzzfeedPlusTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"BUZZFEED+\"]");
  //  private final By buzzfeedPlusTitle = MobileBy.AccessibilityId("BUZZFEED+");
    private final By subscribeSection = MobileBy.AccessibilityId("Subscribe to BuzzFeed+, Get exclusive app benefits: An ad-free experience, custom app icons, and customizable tabs.");
    private final By subscribeHeader = MobileBy.AccessibilityId("Subscribe to BuzzFeed+");
    private final By appIcon = MobileBy.AccessibilityId("App Icon");
    private final By defaultIcon = MobileBy.AccessibilityId("Default");
    private final By prideIcon = MobileBy.AccessibilityId("Pride");
    private final By changeIconConfirmation = MobileBy.AccessibilityId("You have changed the icon for “BuzzFeed \uD83D\uDC1E”.");
    private final By mutedWords = MobileBy.AccessibilityId("Muted Words");
    private final By adFreeSection = MobileBy.AccessibilityId("Ad-Free, Disabled");
    private final By adFreeText = MobileBy.AccessibilityId("BuzzFeed is an ad-supported app, but you can help support our entertainment content and award-winning journalism for a low monthly price.\n\nPlease note that shopping recommendations and select sponsored features and content will remain available to you.");
    private final By customizableTabsSection = MobileBy.AccessibilityId("Customizable Tabs, Disabled");
    private final By customizableTabsText = MobileBy.AccessibilityId("Pick new app tabs from the main screen. Want quicker access to Food content or our Videos including Tasty recipes? No problem!\n\nThese can be configured straight from the app’s Home screen by holding down on a tab and selecting from the popup list.");

    //Methods

    public void closeSubscribeScreen(){
        driver.findElement(closeSubsScreen).click();
    }

    public boolean settingsButtonIsPresent() {
        return driver.findElement(settingsButton).isDisplayed();
    }

    public boolean settingsHeaderIsPresent(){
        return driver.findElement(settingsHeader).isDisplayed();
    }

    public boolean buzzfeedPlusTitleIsPresent(){
        return driver.findElement(buzzfeedPlusTitle).isDisplayed();
    }

    public boolean subscribeSectionIsPresent(){
        return driver.findElement(subscribeSection).isDisplayed();
    }

    public boolean subscribeHeaderIsPresent(){
        return driver.findElement(subscribeHeader).isDisplayed();
    }

    public boolean appIconIsPresent(){
        return driver.findElement(appIcon).isDisplayed();
    }

    public void tapAppIconSection() {
        driver.findElement(appIcon).click();
        System.out.println("Tapped the App Icon section");
    }

    public boolean defaultIconIsPresent(){
        return driver.findElement(defaultIcon).isDisplayed();
    }

    public boolean prideIconIsPresent(){
        return driver.findElement(prideIcon).isDisplayed();
    }

    public void selectPrideIcon() {
        driver.findElement(prideIcon).click();
        System.out.println("Selected the Pride icon");
    }

    public boolean changeIconConfirmationIsPresent(){
        return driver.findElement(changeIconConfirmation).isDisplayed();
    }

    public void selectDefaultIcon() {
        driver.findElement(defaultIcon).click();
        System.out.println("Selected the default icon");
    }

    public boolean mutedWordsIsPresent(){
        return driver.findElement(mutedWords).isDisplayed();
    }

    public void tapMutedWords() {
        driver.findElement(mutedWords).click();
        System.out.println("Tapped the Muted Words section");
    }

    public boolean adFreeSectionIsPresent(){
        return driver.findElement(adFreeSection).isDisplayed();
    }

    public void tapAdFreeSection() {
        driver.findElement(adFreeSection).click();
        System.out.println("Tapped the Ad-Free section");
    }

    public boolean adFreeTextIsPresent(){
        return driver.findElement(adFreeText).isDisplayed();
    }

    public boolean customizableTabsSectionIsPresent(){
        return driver.findElement(customizableTabsSection).isDisplayed();
    }

    public void tapCustomizableTabsSection() {
        driver.findElement(customizableTabsSection).click();
        System.out.println("Tapped the Customizable Tabs section");
    }

    public boolean customizableTabsTextIsPresent(){
        return driver.findElement(customizableTabsText).isDisplayed();
    }
}