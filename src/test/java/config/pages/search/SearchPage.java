package config.pages.search;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SearchPage extends CommonPage {

    //Catching elements
    private final By clearSearch = MobileBy.AccessibilityId("Clear search text");


    //Methods
    public boolean searchTabIsPresent() {
        return driver.findElement(searchTab).isDisplayed();
    }

    public boolean searchFieldIsPresent() {
        return driver.findElement(searchField).isDisplayed();
    }

    public boolean clearSearchIsPresent() {
        return driver.findElement(clearSearch).isDisplayed();
    }

    public void tapClearSearch() {
        driver.findElement(clearSearch).click();
        print("Tapped Clear search button");
    }

    public boolean searchResultIsPresent() {
        return driver.findElement(searchResult).isDisplayed();
    }
}