package config.pages;

import basePackage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitersPage extends Base {

    protected static WebDriverWait waiter = new WebDriverWait(driver, 140);

    //Method
    public static Boolean waitForElement(By data) {
        try {
            waiter.until(ExpectedConditions.visibilityOfElementLocated(data));
            return true;
        } catch (Exception e){
            return false;
        }
    }
}