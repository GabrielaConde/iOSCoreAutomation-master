package config.pages.shopping;

import org.openqa.selenium.WebElement;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.WebElement;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class ShoppingSubTabsPageDeprecated extends CommonPage {

    //Catching Elements
    private final By amazonSubTab = AppiumBy.accessibilityId("Amazon");
    private final By beautySubTab = AppiumBy.accessibilityId("Beauty");
    private final By dealsSubTab = AppiumBy.accessibilityId("Deals");
    private final By homeSubTab = AppiumBy.accessibilityId("Home");
    private final By clothingSubTab = AppiumBy.accessibilityId("Clothing");
    private final By under50SubTab = AppiumBy.accessibilityId("Under $50");
    private final By under20SubTab = AppiumBy.accessibilityId("Under £20");
    private final By gadgetsSubTab = AppiumBy.accessibilityId("Gadgets");
    private final By splurgeSubTab = AppiumBy.accessibilityId("Splurge-Worthy");
    private final By giftSubTab = AppiumBy.accessibilityId("Gift Guide");


    //Methods

    /*
    public ArrayList<By> getSubTabsLeft(){
        ArrayList<By> listTabsLeft = new ArrayList<>();
        listTabsLeft.add(amazonSubTab);
        listTabsLeft.add(beautySubTab);
        listTabsLeft.add(dealsSubTab);
        listTabsLeft.add(homeSubTab);
        listTabsLeft.add(clothingSubTab);
        listTabsLeft.add(under50SubTab);
        listTabsLeft.add(gadgetsSubTab);
        listTabsLeft.add(splurgeSubTab);
        listTabsLeft.add(giftSubTab);

        return listTabsLeft;
    }

    public ArrayList<By> getSubTabsRight(){
        ArrayList<By> listTabsRight = new ArrayList<>();
        listTabsRight.add(splurgeSubTab);
        listTabsRight.add(gadgetsSubTab);
        listTabsRight.add(under50SubTab);
        listTabsRight.add(clothingSubTab);
        listTabsRight.add(homeSubTab);
        listTabsRight.add(dealsSubTab);
        listTabsRight.add(beautySubTab);
        listTabsRight.add(amazonSubTab);
        listTabsRight.add(trendingSubTab);
        listTabsRight.add(latestSubTab);

        return listTabsRight;
    }

    public void getSubTabActiveLeft() {
        ArrayList<By> listTabsLeft = getSubTabsLeft();
        for (By tab : listTabsLeft) {
            swipeLeft();
            WaitersPage.waitForElement(tab);
            //wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(tab)));
            Assert.assertEquals(getDriver().findElement(tab).getAttribute("value"), "1");
            print("The active tab is " + tab);
        }
    }

    public void getSubTabActiveRight() {
        ArrayList<By> listTabsRight = getSubTabsRight();
        for (By tab : listTabsRight) {
            swipeRight();
            WaitersPage.waitForElement(tab);
            //wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(tab)));
            Assert.assertEquals(getDriver().findElement(tab).getAttribute("value"), "1");
            print("The active tab is " + tab);
        }
    }
     */

    public List<String> getSubTabActiveLeft() {
        List<WebElement> swipedTab = getDriver().findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (WebElement tab : swipedTab) {
            scroll.swipeLeft();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public List<String>  getSubTabActiveRight() {
        List<WebElement> swipedTab = getDriver().findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (WebElement tab : swipedTab) {
            scroll.swipeRight();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public void tapAmazonSubTab() {
        getDriver().findElement(amazonSubTab).click();
        print("Tapped the Amazon sub-ab");
    }

    public String amazonSubTabIsActive(){
        return getDriver().findElement(amazonSubTab).getAttribute("value");
    }

    public void tapBeautySubTab() {
        getDriver().findElement(beautySubTab).click();
        print("Tapped the Beauty sub-ab");
    }

    public String beautySubTabIsActive(){
        return getDriver().findElement(beautySubTab).getAttribute("value");
    }

    public void tapDealsSubTab() {
        getDriver().findElement(dealsSubTab).click();
        print("Tapped the Deals sub-ab");
    }

    public String dealsSubTabIsActive(){
        return getDriver().findElement(dealsSubTab).getAttribute("value");
    }

    public void tapHomeSubTab() {
        getDriver().findElement(homeSubTab).click();
        print("Tapped the Home sub-ab");
    }

    public String homeSubTabIsActive(){
        return getDriver().findElement(homeSubTab).getAttribute("value");
    }

    public void tapClothingSubTab() {
        getDriver().findElement(clothingSubTab).click();
        print("Tapped the Clothing sub-ab");
    }

    public String clothingSubTabIsActive(){
        return getDriver().findElement(clothingSubTab).getAttribute("value");
    }

    public void tapUnder50SubTab() {
        getDriver().findElement(under50SubTab).click();
        print("Tapped the Under $50 sub-ab");
    }

    public void tapUnder20SubTab() {
        getDriver().findElement(under20SubTab).click();
        print("Tapped the Under $20sub-ab");
    }

    public String under50SubTabIsActive(){
        return getDriver().findElement(under50SubTab).getAttribute("value");
    }

    public void tapGadgetsSubTab() {
        getDriver().findElement(gadgetsSubTab).click();
        print("Tapped the Gadgets sub-ab");
    }

    public String gadgetsSubTabIsActive(){
        return getDriver().findElement(gadgetsSubTab).getAttribute("value");
    }

    public void tapSplurgeSubTab() {
        getDriver().findElement(splurgeSubTab).click();
        print("Tapped the Splurge-Worthy sub-ab");
    }

    public String splurgeSubTabIsActive(){
        return getDriver().findElement(splurgeSubTab).getAttribute("value");
    }

    public void tapGiftSubTab() {
        getDriver().findElement(giftSubTab).click();
        print("Tapped the Gift Guide sub-ab");
    }

    public String giftSubTabIsActive(){
        return getDriver().findElement(giftSubTab).getAttribute("value");
    }
}
