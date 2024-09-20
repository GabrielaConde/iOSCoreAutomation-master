package config.pages.signIn;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SignInMailPage extends CommonPage {

    //Catching elements
    private final By userName = AppiumBy.accessibilityId("salpimienta");
    private final By date = AppiumBy.accessibilityId("Joined Nov 2021");




    private final By signInWithExistAccLnk = AppiumBy.accessibilityId("Sign in with existing account");

    //Methods


    public boolean profileButtonIsPresent() {
        return getDriver().findElement(profileButton).isDisplayed();
    }

    public void tapOnSignInWithExistingAccLnk() {getDriver().findElement(signInWithExistAccLnk).click();}

    public boolean emailFieldIsPresent() {
        return getDriver().findElement(emailField).isDisplayed();
    }


    public boolean passwordFieldIsPresent() {
        return getDriver().findElement(passwordField).isDisplayed();
    }

    public boolean signInButtonIsPresent() {
        return getDriver().findElement(signInButton).isDisplayed();
    }

    public boolean userNameIsPresent() {
        return getDriver().findElement(userName).isDisplayed();
    }

    public boolean dateIsPresent() {
        return getDriver().findElement(date).isDisplayed();
    }
}