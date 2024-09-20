package config.pages.search;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SearchPage extends CommonPage {

    //Catching elements
    private final By clearSearch = AppiumBy.accessibilityId("Clear search text");


    //Methods
    public boolean searchTabIsPresent() {
        return getDriver().findElement(searchTab).isDisplayed();
    }

    public boolean searchFieldIsPresent() {
        return getDriver().findElement(searchField).isDisplayed();
    }

    public boolean clearSearchIsPresent() {
        return getDriver().findElement(clearSearch).isDisplayed();
    }

    public void tapClearSearch() {
        getDriver().findElement(clearSearch).click();
        print("Tapped Clear search button");
    }

    public boolean searchResultIsPresent() {
        return getDriver().findElement(searchResult).isDisplayed();
    }
}