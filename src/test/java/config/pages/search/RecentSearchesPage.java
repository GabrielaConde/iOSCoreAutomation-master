package config.pages.search;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RecentSearchesPage extends CommonPage {

    //Catching elements
    private final By recentSearchesTitle = AppiumBy.accessibilityId("Recent Searches");
    private final By recentSearchTerm = By.id("recent");
    private final By clearButton = AppiumBy.accessibilityId("Clear");
    private final By clearRecentSearchesButton = AppiumBy.accessibilityId("Clear Recent Searches");

    //Methods
    public boolean recentSearchesTitleIsPresent() {
        return getDriver().findElement(recentSearchesTitle).isDisplayed();
    }

    public boolean recentSearchTermIsPresent() {
        return getDriver().findElement(recentSearchTerm).isDisplayed();
    }

    public void tapRecentSearchTerm() {
        getDriver().findElement(recentSearchTerm).click();
        print("Tapped recent search term");
    }

    public boolean clearButtonIsPresent() {
        return getDriver().findElement(clearButton).isDisplayed();
    }

    public void tapClearButton() {
        getDriver().findElement(clearButton).click();
        print("Tapped Clear button");
    }

    public boolean clearRecentSearchesButtonIsPresent() {
        return getDriver().findElement(clearRecentSearchesButton).isDisplayed();
    }

    public void tapClearRecentSearchesButton() {
        getDriver().findElement(clearRecentSearchesButton).click();
        print("Cleared Recent searches");
    }
}