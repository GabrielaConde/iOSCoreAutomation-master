package config.pages;

import basePackage.Base;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.springframework.ui.context.Theme;

public class WaitersPage extends Base {

    //140
    protected WebDriverWait waiter = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

    //Method
    public Boolean waitForElement(By data) {
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