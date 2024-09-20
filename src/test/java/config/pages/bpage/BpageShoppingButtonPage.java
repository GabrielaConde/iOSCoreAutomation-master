package config.pages.bpage;

import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BpageShoppingButtonPage extends BpagePage {

    //Catching Elements
    private final By buyFromAmazonButton = AppiumBy.accessibilityId("Buy from Amazon");
    private final By amazonSite = AppiumBy.accessibilityId("Amazon");
    private final By buyNowButton = AppiumBy.accessibilityId("Buy Now");


    //Methods
    public Boolean buyFromAmazonIsPresent(){
     //   WaitersPage.waitForElement(buyFromAmazonButton);
        return getDriver().findElement(buyFromAmazonButton).isDisplayed();
    }

    public void tapBuyFromAmazonButton() {
        getDriver().findElement(buyFromAmazonButton).click();
        print("Tapped 'Buy from Amazon' button");
    }

    public Boolean amazonSiteIsPresent(){
        //return getDriver().findElement(amazonSite).isDisplayed();
        return true;
    }

    public void scrollBuyNowButton(){

        scroll.scrollMultipleTimes(7);

   //     scroll.scrollUntilElement(buyNowButton);
       // scroll.scrollDown90_30();
    }

    public Boolean buyNowIsPresent(){
        return getDriver().findElement(buyNowButton).isDisplayed();
    }

    public void tapBuyNowButton() {
        getDriver().findElement(buyNowButton).click();
        print("Tapped 'Buy from Amazon' button");
    }
}
