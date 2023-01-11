package config.pages.signIn;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SignInMailPage extends CommonPage {

    //Catching elements
    private final By userName = MobileBy.AccessibilityId("@salpimie");
    private final By date = MobileBy.AccessibilityId("Joined Nov 2021");

    //Methods
    public boolean profileButtonIsPresent() {
        return driver.findElement(profileButton).isDisplayed();
    }

    public boolean emailFieldIsPresent() {
        return driver.findElement(emailField).isDisplayed();
    }

    public boolean passwordFieldIsPresent() {
        return driver.findElement(passwordField).isDisplayed();
    }

    public boolean signInButtonIsPresent() {
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean userNameIsPresent() {
        return driver.findElement(userName).isDisplayed();
    }

    public boolean dateIsPresent() {
        return driver.findElement(date).isDisplayed();
    }
}