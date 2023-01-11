package config.pages.search;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RecentSearchesPage extends CommonPage {

    //Catching elements
    private final By recentSearchesTitle = MobileBy.AccessibilityId("Recent Searches");
    private final By recentSearchTerm = By.id("recent");
    private final By clearButton = MobileBy.AccessibilityId("Clear");
    private final By clearRecentSearchesButton = MobileBy.AccessibilityId("Clear Recent Searches");

    //Methods
    public boolean recentSearchesTitleIsPresent() {
        return driver.findElement(recentSearchesTitle).isDisplayed();
    }

    public boolean recentSearchTermIsPresent() {
        return driver.findElement(recentSearchTerm).isDisplayed();
    }

    public void tapRecentSearchTerm() {
        driver.findElement(recentSearchTerm).click();
        print("Tapped recent search term");
    }

    public boolean clearButtonIsPresent() {
        return driver.findElement(clearButton).isDisplayed();
    }

    public void tapClearButton() {
        driver.findElement(clearButton).click();
        print("Tapped Clear button");
    }

    public boolean clearRecentSearchesButtonIsPresent() {
        return driver.findElement(clearRecentSearchesButton).isDisplayed();
    }

    public void tapClearRecentSearchesButton() {
        driver.findElement(clearRecentSearchesButton).click();
        print("Cleared Recent searches");
    }
}