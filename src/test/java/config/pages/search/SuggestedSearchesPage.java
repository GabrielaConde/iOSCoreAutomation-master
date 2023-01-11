package config.pages.search;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SuggestedSearchesPage extends CommonPage {

    //Catching elements
    private final By suggestedSearchTerm = By.id("suggestion");


    //Methods
    public boolean suggestedSearchTermIsPresent() {
        return driver.findElement(suggestedSearchTerm).isDisplayed();
    }

    public void tapSuggestedSearchTerm() {
        driver.findElement(suggestedSearchTerm).click();
        print("Tapped a suggested search term");
    }
}
