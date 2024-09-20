package config.pages.profile;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MyCommentsPage extends CommonPage {

    //Catching element
    private final By myComments = AppiumBy.accessibilityId("My Comments");
    private final By myCommentsEmptyMessage = AppiumBy.accessibilityId("No comments yet, ");

    //Methods
    public boolean myCommentsIsPresent() {
        return getDriver().findElement(myComments).isDisplayed();
    }

    public void tapMyComments() {
        getDriver().findElement(myComments).click();
        print("Tapped My Comments");
    }

    public boolean myCommentsEmptyMessageIsPresent() {
        return getDriver().findElement(myCommentsEmptyMessage).isDisplayed();
    }
}