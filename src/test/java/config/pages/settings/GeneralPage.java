package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class GeneralPage extends CommonPage {

    //Catching elements
    private final By generalHeader = AppiumBy.accessibilityId("GENERAL");
    private final By editionSection = AppiumBy.accessibilityId("Edition, United States");
    private final By darkModeSection = AppiumBy.accessibilityId("Dark Mode, Match System");
    private final By darkModeHeader = AppiumBy.accessibilityId("Dark Mode");
    private final By matchSystemOption = AppiumBy.accessibilityId("Match System");
    private final By lightModeOption = AppiumBy.accessibilityId("Light Mode");
    private final By darkModeOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"Dark Mode\"])[2]");
    private final By lightModeSelected = AppiumBy.accessibilityId("Dark Mode, Light Mode");
    private final By darkModeSelected = AppiumBy.accessibilityId("Dark Mode, Dark Mode");
    private final By pushNotificationSection = AppiumBy.accessibilityId("Push Notification Settings");
    private final By coronavirusSection = AppiumBy.accessibilityId("Extra Coronavirus Notifications");

    //Methods
    public boolean generalHeaderIsPresent(){
        return getDriver().findElement(generalHeader).isDisplayed();
    }

    public boolean editionSectionIsPresent(){
        return getDriver().findElement(editionSection).isDisplayed();
    }

    public boolean darkModeSectionIsPresent(){
        return getDriver().findElement(darkModeSection).isDisplayed();
    }

    public void tapDarkModeSection() {
        getDriver().findElement(darkModeSection).click();
        System.out.println("Tapped Dark Mode Section");
    }

    public boolean darkModeHeaderIsPresent(){
        return getDriver().findElement(darkModeHeader).isDisplayed();
    }

    public boolean lightModeOptionIsPresent(){
        return getDriver().findElement(lightModeOption).isDisplayed();
    }

    public void selectLightMode() {
        getDriver().findElement(lightModeOption).click();
        System.out.println("Selected Light Mode option");
    }

    public boolean lightModeSelectedIsPresent(){
        return getDriver().findElement(lightModeSelected).isDisplayed();
    }

    public void selectDarkMode()throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(darkModeOption).click();
        System.out.println("Selected Dark Mode option");
    }

    public boolean darkModeSelectedIsPresent(){
        return getDriver().findElement(darkModeSelected).isDisplayed();
    }

    public void tapThemeSection() {
        getDriver().findElement(lightModeSelected).click();
        System.out.println("Tapped Dark Mode Section");
    }

    public void tapThemeSectionDark() {
        getDriver().findElement(darkModeSelected).click();
        System.out.println("Tapped DDark Mode Section");
    }

    public void selectMatchSystem() {
        getDriver().findElement(matchSystemOption).click();
        System.out.println("Selected Match System option");
    }

    public boolean pushNotificationSectionIsPresent(){
        return getDriver().findElement(pushNotificationSection).isDisplayed();
    }
}