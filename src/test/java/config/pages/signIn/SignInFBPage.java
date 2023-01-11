package config.pages.signIn;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SignInFBPage extends CommonPage {

    //Catching elements
    private final By FBLoginButton = MobileBy.AccessibilityId("Continue with Facebook");
    private final By continueBtn = MobileBy.AccessibilityId("Continue");
    private final By continueToFBButton = MobileBy.AccessibilityId("Continuar");
    private final By emailField = By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField");
    private final By passwordField = By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField");
    private final By loginFBModalButton = By.xpath("//XCUIElementTypeButton[@name='Log in']");
    private final By FBuserName = MobileBy.AccessibilityId("@s4c162ba1f");
    private final By FBdate = MobileBy.AccessibilityId("Joined Sep 2016");

    //Methods

    public void tapContinueBtn(){
        driver.findElement(continueBtn).click();
    }

    public void tapFBLoginButton() {
        driver.findElement(FBLoginButton).click();
        print("Tapped Continue with FB button button");
    }

    public void tapContinueToFBButton() {
        driver.findElement(continueToFBButton).click();
        print("Tapped Continue to FB on modal");
    }

    public void tapUserFieldOnFB() {
        driver.findElement(emailField).click();
        print("Tapped User field on FB Web Site");
    }

    public void sendUserDataOnFB(String userData) {
        driver.findElement(emailField).sendKeys(userData);
        print("Sent user data");
    }

    public void tapPasswordFieldOnFB() {
        driver.findElement(passwordField).click();
        print("Tapped Password field on FB Web Site");
    }

    public void sendPassDataOnFB(String passData) {
        driver.findElement(passwordField).sendKeys(passData);
        print("Sent pass data");
    }

    public void tapLoginButtonOnFB() {
        driver.findElement(loginFBModalButton).click();
        print("Tapped Login button on FB Web Site");
    }

    public boolean FBuserNameIsPresent(){
        return driver.findElement(FBuserName).isDisplayed();
    }

    public boolean FBdateIsPresent(){
        return driver.findElement(FBdate).isDisplayed();
    }
}