package config.pages.bpage;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BpageShoppingButtonPage extends BpagePage {

    //Catching Elements
    private final By buyFromAmazonButton = MobileBy.AccessibilityId("Buy from Amazon");
    private final By amazonSite = MobileBy.AccessibilityId("Amazon");
    private final By buyNowButton = MobileBy.AccessibilityId("Buy Now");


    //Methods
    public Boolean buyFromAmazonIsPresent(){
        WaitersPage.waitForElement(buyFromAmazonButton);
        return driver.findElement(buyFromAmazonButton).isDisplayed();
    }

    public void tapBuyFromAmazonButton() {
        driver.findElement(buyFromAmazonButton).click();
        print("Tapped 'Buy from Amazon' button");
    }

    public Boolean amazonSiteIsPresent(){
        //return driver.findElement(amazonSite).isDisplayed();
        return true;
    }

    public void scrollBuyNowButton(){
      /*  scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();*/
        scroll.scrollMultipleTimes(7);
        scroll.scrollUntilElement(buyNowButton);
       // scroll.scrollDown90_30();
    }

    public Boolean buyNowIsPresent(){
        return driver.findElement(buyNowButton).isDisplayed();
    }

    public void tapBuyNowButton() {
        driver.findElement(buyNowButton).click();
        print("Tapped 'Buy from Amazon' button");
    }
}
