package config.pages.shopping;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class ShoppingSubTabsPageDeprecated extends CommonPage {

    //Catching Elements
    private final By amazonSubTab = MobileBy.AccessibilityId("Amazon");
    private final By beautySubTab = MobileBy.AccessibilityId("Beauty");
    private final By dealsSubTab = MobileBy.AccessibilityId("Deals");
    private final By homeSubTab = MobileBy.AccessibilityId("Home");
    private final By clothingSubTab = MobileBy.AccessibilityId("Clothing");
    private final By under50SubTab = MobileBy.AccessibilityId("Under $50");
    private final By under20SubTab = MobileBy.AccessibilityId("Under £20");
    private final By gadgetsSubTab = MobileBy.AccessibilityId("Gadgets");
    private final By splurgeSubTab = MobileBy.AccessibilityId("Splurge-Worthy");
    private final By giftSubTab = MobileBy.AccessibilityId("Gift Guide");


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
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(tab)));
            Assert.assertEquals(driver.findElement(tab).getAttribute("value"), "1");
            print("The active tab is " + tab);
        }
    }

    public void getSubTabActiveRight() {
        ArrayList<By> listTabsRight = getSubTabsRight();
        for (By tab : listTabsRight) {
            swipeRight();
            WaitersPage.waitForElement(tab);
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(tab)));
            Assert.assertEquals(driver.findElement(tab).getAttribute("value"), "1");
            print("The active tab is " + tab);
        }
    }
     */

    public List<String> getSubTabActiveLeft() {
        List<MobileElement> swipedTab = driver.findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (MobileElement tab : swipedTab) {
            scroll.swipeLeft();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public List<String>  getSubTabActiveRight() {
        List<MobileElement> swipedTab = driver.findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (MobileElement tab : swipedTab) {
            scroll.swipeRight();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public void tapAmazonSubTab() {
        driver.findElement(amazonSubTab).click();
        print("Tapped the Amazon sub-ab");
    }

    public String amazonSubTabIsActive(){
        return driver.findElement(amazonSubTab).getAttribute("value");
    }

    public void tapBeautySubTab() {
        driver.findElement(beautySubTab).click();
        print("Tapped the Beauty sub-ab");
    }

    public String beautySubTabIsActive(){
        return driver.findElement(beautySubTab).getAttribute("value");
    }

    public void tapDealsSubTab() {
        driver.findElement(dealsSubTab).click();
        print("Tapped the Deals sub-ab");
    }

    public String dealsSubTabIsActive(){
        return driver.findElement(dealsSubTab).getAttribute("value");
    }

    public void tapHomeSubTab() {
        driver.findElement(homeSubTab).click();
        print("Tapped the Home sub-ab");
    }

    public String homeSubTabIsActive(){
        return driver.findElement(homeSubTab).getAttribute("value");
    }

    public void tapClothingSubTab() {
        driver.findElement(clothingSubTab).click();
        print("Tapped the Clothing sub-ab");
    }

    public String clothingSubTabIsActive(){
        return driver.findElement(clothingSubTab).getAttribute("value");
    }

    public void tapUnder50SubTab() {
        driver.findElement(under50SubTab).click();
        print("Tapped the Under $50 sub-ab");
    }

    public void tapUnder20SubTab() {
        driver.findElement(under20SubTab).click();
        print("Tapped the Under $20sub-ab");
    }

    public String under50SubTabIsActive(){
        return driver.findElement(under50SubTab).getAttribute("value");
    }

    public void tapGadgetsSubTab() {
        driver.findElement(gadgetsSubTab).click();
        print("Tapped the Gadgets sub-ab");
    }

    public String gadgetsSubTabIsActive(){
        return driver.findElement(gadgetsSubTab).getAttribute("value");
    }

    public void tapSplurgeSubTab() {
        driver.findElement(splurgeSubTab).click();
        print("Tapped the Splurge-Worthy sub-ab");
    }

    public String splurgeSubTabIsActive(){
        return driver.findElement(splurgeSubTab).getAttribute("value");
    }

    public void tapGiftSubTab() {
        driver.findElement(giftSubTab).click();
        print("Tapped the Gift Guide sub-ab");
    }

    public String giftSubTabIsActive(){
        return driver.findElement(giftSubTab).getAttribute("value");
    }
}
