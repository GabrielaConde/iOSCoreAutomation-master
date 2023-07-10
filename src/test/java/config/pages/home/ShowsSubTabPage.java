package config.pages.home;

import config.pages.CommonPage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShowsSubTabPage extends CommonPage {

    //Catching elements
    private final By showsSubTab = By.id("Shows");
    private final By show = By.xpath("(//XCUIElementTypeCell[@name='buffet_image_cell'])");


    //Methods
    //--Going to Shows subtab
    public void swipeRightManyTimes(){
        for(int i=0; i<=2; i++){
            scroll.swipeRight();
        }
    }

    //--Shows tab - Active
    public Boolean showsTabIsPresent(){
        return driver.findElement(showsSubTab).isDisplayed();
    }

    public String showsTabIsActive(){
        String value = driver.findElement(showsSubTab).getAttribute("value");
        return value;
    }

    public void tapShowSubTab(){
        driver.findElement(showsSubTab).click();
        print("Tapped 'Show' sub-tab on Home Feed");
    }

    //--Tap Shows
    public void tapShow()throws InterruptedException{
        int x = 0;
            for (MobileElement e : driver.findElements(show)) {
                System.out.println("Show Position: " + x);
                e.click();
                Thread.sleep(2000);
                tapFirstVideo();
                Thread.sleep(2000);
                tapCloseButton();
                tapBackButton();
                WebDriverWait wait = new WebDriverWait(driver, 30);

                wait.until(ExpectedConditions.visibilityOfElementLocated(show));
                x++;
                }
        //    scroll.scrollDown90_005();
        //    scroll.scrollDown90_78();
            print("Scrolling to the next page");
        }
   // }
}
