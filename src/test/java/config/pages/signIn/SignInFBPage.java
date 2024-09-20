package config.pages.signIn;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SignInFBPage extends CommonPage {

    //Catching elements
    private final By FBLoginButton = AppiumBy.accessibilityId("Continue with Facebook");
    private final By continueBtn = AppiumBy.accessibilityId("Continue");
    private final By continueToFBButton = AppiumBy.accessibilityId("Continuar");
    private final By emailField = By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField     ");
 //   private final By emailField = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
 //   private final By passwordField = By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField");
    private final By passwordField = By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField");
   // private final By loginFBModalButton = By.xpath("//XCUIElementTypeButton[@name=\"Continue with Facebook\"]");
    private final By loginFBModalButton = AppiumBy.accessibilityId("Log In");
    private final By FBuserName = AppiumBy.accessibilityId("@s4c162ba1f");
    private final By FBdate = AppiumBy.accessibilityId("Joined Sep 2016");

    //Methods

    public void tapContinueBtn(){
     //   try {
            getDriver().findElement(continueBtn).click();
     //   }catch (Exception e){}
    }

    public void tapFBLoginButton() {
        getDriver().findElement(FBLoginButton).click();
        print("Tapped Continue with FB button button");
    }

    public void tapContinueToFBButton() {
        getDriver().findElement(continueToFBButton).click();
        print("Tapped Continue to FB on modal");
    }

    public void tapUserFieldOnFB() {
        getDriver().findElement(emailField).click();
        print("Tapped User field on FB Web Site");
    }

    public void sendUserDataOnFB(String userData) {
        getDriver().findElement(emailField).sendKeys(userData);
        print("Sent user data");
    }

    public void tapPasswordFieldOnFB() {
        getDriver().findElement(passwordField).click();
        print("Tapped Password field on FB Web Site");
    }

    public void sendPassDataOnFB(String passData) {
        getDriver().findElement(passwordField).sendKeys(passData);
        print("Sent pass data");
    }

    public void tapLoginButtonOnFB() {
        getDriver().findElement(loginFBModalButton).click();
        print("Tapped Login button on FB Web Site");
    }

    public boolean FBuserNameIsPresent(){
        return getDriver().findElement(FBuserName).isDisplayed();
    }

    public boolean FBdateIsPresent(){
        return getDriver().findElement(FBdate).isDisplayed();
    }
}