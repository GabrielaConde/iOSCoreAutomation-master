package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BuzzfeedPlusPage extends CommonPage {

    //Catching elements
    private final By closeSubsScreen = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])[2]");
  //  private final By settingsHeader = AppiumBy.accessibilityId("Settings");
    private final By settingsHeader  = By.xpath("//XCUIElementTypeStaticText[@name=\"Settings\"]");
    private final By buzzfeedPlusTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"BUZZFEED+\"]");
  //  private final By buzzfeedPlusTitle = AppiumBy.accessibilityId("BUZZFEED+");
    private final By subscribeSection = AppiumBy.accessibilityId("Subscribe to BuzzFeed+, Get exclusive app benefits: An ad-free experience, custom app icons, and customizable tabs.");
    private final By subscribeHeader = AppiumBy.accessibilityId("Subscribe to BuzzFeed+");
    private final By appIcon = AppiumBy.accessibilityId("App Icon");
    private final By defaultIcon = AppiumBy.accessibilityId("Default");
    private final By prideIcon = AppiumBy.accessibilityId("Pride");
    private final By changeIconConfirmation = AppiumBy.accessibilityId("You have changed the icon for “BuzzFeed \uD83D\uDC1E”.");
    private final By mutedWords = AppiumBy.accessibilityId("Muted Words");
    private final By adFreeSection = AppiumBy.accessibilityId("Ad-Free, Disabled");
    private final By adFreeText = AppiumBy.accessibilityId("BuzzFeed is an ad-supported app, but you can help support our entertainment content and award-winning journalism for a low monthly price.\n\nPlease note that shopping recommendations and select sponsored features and content will remain available to you.");
    private final By customizableTabsSection = AppiumBy.accessibilityId("Customizable Tabs, Disabled");
    private final By customizableTabsText = AppiumBy.accessibilityId("Pick new app tabs from the main screen. Want quicker access to Food content or our Videos including Tasty recipes? No problem!\n\nThese can be configured straight from the app’s Home screen by holding down on a tab and selecting from the popup list.");

    //Methods

    public void closeSubscribeScreen(){
        getDriver().findElement(closeSubsScreen).click();
    }

    public boolean settingsButtonIsPresent() {
        return getDriver().findElement(settingsButton).isDisplayed();
    }

    public boolean settingsHeaderIsPresent(){
        return getDriver().findElement(settingsHeader).isDisplayed();
    }

    public boolean buzzfeedPlusTitleIsPresent(){
        return getDriver().findElement(buzzfeedPlusTitle).isDisplayed();
    }

    public boolean subscribeSectionIsPresent(){
        return getDriver().findElement(subscribeSection).isDisplayed();
    }

    public boolean subscribeHeaderIsPresent(){
        return getDriver().findElement(subscribeHeader).isDisplayed();
    }

    public boolean appIconIsPresent(){
        return getDriver().findElement(appIcon).isDisplayed();
    }

    public void tapAppIconSection() {
        getDriver().findElement(appIcon).click();
        System.out.println("Tapped the App Icon section");
    }

    public boolean defaultIconIsPresent(){
        return getDriver().findElement(defaultIcon).isDisplayed();
    }

    public boolean prideIconIsPresent(){
        return getDriver().findElement(prideIcon).isDisplayed();
    }

    public void selectPrideIcon() {
        getDriver().findElement(prideIcon).click();
        System.out.println("Selected the Pride icon");
    }

    public boolean changeIconConfirmationIsPresent(){
        return getDriver().findElement(changeIconConfirmation).isDisplayed();
    }

    public void selectDefaultIcon() {
        getDriver().findElement(defaultIcon).click();
        System.out.println("Selected the default icon");
    }

    public boolean mutedWordsIsPresent(){
        return getDriver().findElement(mutedWords).isDisplayed();
    }

    public void tapMutedWords() {
        getDriver().findElement(mutedWords).click();
        System.out.println("Tapped the Muted Words section");
    }

    public boolean adFreeSectionIsPresent(){
        return getDriver().findElement(adFreeSection).isDisplayed();
    }

    public void tapAdFreeSection() {
        getDriver().findElement(adFreeSection).click();
        System.out.println("Tapped the Ad-Free section");
    }

    public boolean adFreeTextIsPresent(){
        return getDriver().findElement(adFreeText).isDisplayed();
    }

    public boolean customizableTabsSectionIsPresent(){
        return getDriver().findElement(customizableTabsSection).isDisplayed();
    }

    public void tapCustomizableTabsSection() {
        getDriver().findElement(customizableTabsSection).click();
        System.out.println("Tapped the Customizable Tabs section");
    }

    public boolean customizableTabsTextIsPresent(){
        return getDriver().findElement(customizableTabsText).isDisplayed();
    }
}