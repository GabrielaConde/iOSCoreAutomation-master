package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class GeneralPage extends CommonPage {

    //Catching elements
    private final By generalHeader = MobileBy.AccessibilityId("GENERAL");
    private final By editionSection = MobileBy.AccessibilityId("Edition, United States");
    private final By darkModeSection = MobileBy.AccessibilityId("Dark Mode, Match System");
    private final By darkModeHeader = MobileBy.AccessibilityId("Dark Mode");
    private final By matchSystemOption = MobileBy.AccessibilityId("Match System");
    private final By lightModeOption = MobileBy.AccessibilityId("Light Mode");
    private final By darkModeOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"Dark Mode\"])[2]");
    private final By lightModeSelected = MobileBy.AccessibilityId("Dark Mode, Light Mode");
    private final By darkModeSelected = MobileBy.AccessibilityId("Dark Mode, Dark Mode");
    private final By pushNotificationSection = MobileBy.AccessibilityId("Push Notification Settings");
    private final By coronavirusSection = MobileBy.AccessibilityId("Extra Coronavirus Notifications");

    //Methods
    public boolean generalHeaderIsPresent(){
        return driver.findElement(generalHeader).isDisplayed();
    }

    public boolean editionSectionIsPresent(){
        return driver.findElement(editionSection).isDisplayed();
    }

    public boolean darkModeSectionIsPresent(){
        return driver.findElement(darkModeSection).isDisplayed();
    }

    public void tapDarkModeSection() {
        driver.findElement(darkModeSection).click();
        System.out.println("Tapped Dark Mode Section");
    }

    public boolean darkModeHeaderIsPresent(){
        return driver.findElement(darkModeHeader).isDisplayed();
    }

    public boolean lightModeOptionIsPresent(){
        return driver.findElement(lightModeOption).isDisplayed();
    }

    public void selectLightMode() {
        driver.findElement(lightModeOption).click();
        System.out.println("Selected Light Mode option");
    }

    public boolean lightModeSelectedIsPresent(){
        return driver.findElement(lightModeSelected).isDisplayed();
    }

    public void selectDarkMode() {
        driver.findElement(darkModeOption).click();
        System.out.println("Selected Dark Mode option");
    }

    public boolean darkModeSelectedIsPresent(){
        return driver.findElement(darkModeSelected).isDisplayed();
    }

    public void tapThemeSection() {
        driver.findElement(lightModeSelected).click();
        System.out.println("Tapped Dark Mode Section");
    }

    public void tapThemeSectionDark() {
        driver.findElement(darkModeSelected).click();
        System.out.println("Tapped DDark Mode Section");
    }

    public void selectMatchSystem() {
        driver.findElement(matchSystemOption).click();
        System.out.println("Selected Match System option");
    }

    public boolean pushNotificationSectionIsPresent(){
        return driver.findElement(pushNotificationSection).isDisplayed();
    }
}