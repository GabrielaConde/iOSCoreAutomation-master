package config.pages.profile;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MyCommentsPage extends CommonPage {

    //Catching element
    private final By myComments = MobileBy.AccessibilityId("My Comments");
    private final By myCommentsEmptyMessage = MobileBy.AccessibilityId("No comments yet, ");

    //Methods
    public boolean myCommentsIsPresent() {
        return driver.findElement(myComments).isDisplayed();
    }

    public void tapMyComments() {
        driver.findElement(myComments).click();
        print("Tapped My Comments");
    }

    public boolean myCommentsEmptyMessageIsPresent() {
        return driver.findElement(myCommentsEmptyMessage).isDisplayed();
    }
}