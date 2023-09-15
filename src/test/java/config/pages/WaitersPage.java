package config.pages;

import basePackage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.ui.context.Theme;

public class WaitersPage extends Base {

    //140
    protected static WebDriverWait waiter = new WebDriverWait(driver, 60);

    //Method
    public static Boolean waitForElement(By data) {
        try {
            waiter.until(ExpectedConditions.visibilityOfElementLocated(data));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public static void waiterEnv(Integer time) throws InterruptedException {
        if (env == "BS") {
            Thread.sleep(time);
        }
    }
}