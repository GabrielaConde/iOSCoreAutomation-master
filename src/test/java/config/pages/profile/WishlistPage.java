package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class WishlistPage extends CommonPage {

    //Catching elements
    private final By  wishlistCell = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther");
    private final By wishlist = MobileBy.AccessibilityId("Wishlist");
    private final By addToWishlistButton = By.xpath("(//XCUIElementTypeButton[@name=\"love\"])[1]");
    private final By wishlistMultipleItems = By.xpath("//XCUIElementTypeButton[@name='Add to wishlist']");
    private final By wishlistEmptyMessage = MobileBy.AccessibilityId("You don't have anything in your wishlist yet!");
    private final By exploreButton = MobileBy.AccessibilityId("Explore BuzzFeed Shopping");
    private final By shoppingHeader = MobileBy.AccessibilityId("Shopping");
    private final By wishlistResult = MobileBy.AccessibilityId("If You're Looking To Treat Yourself, Here Are 31 Things Under $10 From Target");
 //   private final By addToWishlistButton = MobileBy.AccessibilityId("icon heart");
    private final By addedToWishlistToast = MobileBy.AccessibilityId("Saved product to wishlist!");
    private final By bpageDate = MobileBy.AccessibilityId("Shopping • Jun 15, 2021");
    private final By savedProductHeading = MobileBy.AccessibilityId("1 saved product");
    private final By multipleSavedProductsHeading = MobileBy.AccessibilityId("3 saved products");
    private final By disclosure =  MobileBy.AccessibilityId("BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.");
    private final By menuButton = MobileBy.AccessibilityId("menu button");
    private final By removeFromWishlistButton = MobileBy.AccessibilityId("Remove from wishlist");
    private final By removedFromWishlistToast = MobileBy.AccessibilityId("Removed product from wishlist");
    private final By getItButton = MobileBy.AccessibilityId("Get it");

    //Methods
    public boolean wishlistIsPresent() {
        return driver.findElement(wishlist).isDisplayed();
    }

    public Boolean verifyItemsAreAdded(){
        return driver.findElements(wishlistCell).size()>0;
    }



    public void tapWishlistTab() {
        driver.findElement(wishlist).click();
        print("Tapped Wishlist tab");
    }


    public boolean wishlistEmptyMessageIsPresent() {
        return driver.findElement(wishlistEmptyMessage).isDisplayed();
    }

    public boolean exploreButtonIsPresent() {
        return driver.findElement(exploreButton).isDisplayed();
    }

    public void tapExploreButton() {
        driver.findElement(exploreButton).click();
        print("Tapped Explore Buzzfeed Shopping");
    }

    public void scrollToMultipleItemsButton(){
        scroll.scrollMultipleTimes(1);
        scroll.scrollUntilElement(wishlistMultipleItems);

    }

    public boolean shoppingHeaderIsPresent() {
        return driver.findElement(shoppingHeader).isDisplayed();
    }

    public boolean addToWishlistButtonIsPresent() {
        return driver.findElement(addToWishlistButton).isDisplayed();
    }

    public void tapAddToWishlistButton() throws InterruptedException {
        Thread.sleep(2000);
        scroll.scrollMultipleTimes(1);
        scroll.scrollUntilElement(addToWishlistButton);
        Thread.sleep(1000);
        driver.findElement(addToWishlistButton).click();
        print("Tapped Add to wishlist button");
    }

    public void tapAddMultipleItemsToWishlistButton() {
        driver.findElement(wishlistMultipleItems).click();
        print("Tapped Add to wishlist button");
    }

    public boolean addedToWishlistToastIsPresent() {
        return driver.findElement(addedToWishlistToast).isDisplayed();
    }

    public boolean savedProductHeadingIsPresent() {
        WaitersPage.waitForElement(savedProductHeading);
        return driver.findElement(savedProductHeading).isDisplayed();
    }

    public boolean multipleSavedProductHeadingIsPresent() {
        WaitersPage.waitForElement(multipleSavedProductsHeading);
        return driver.findElement(multipleSavedProductsHeading).isDisplayed();
    }

    public boolean disclosureIsPresent() {
        WaitersPage.waitForElement(disclosure);
        return driver.findElement(disclosure).isDisplayed();
    }

    public boolean getItButtonIsPresent() {
        return driver.findElement(getItButton).isDisplayed();
    }

    public boolean removedFromWishlistToastIsPresent() {
        return driver.findElement(removedFromWishlistToast).isDisplayed();
    }

    public void tapRemoveFromWishlistButton() {
        driver.findElement(removeFromWishlistButton).click();
        print("Tapped the menu button on a product");
    }

    public void tapWishlistResult() {
        driver.findElement(wishlistResult).click();
        print("Tapped the searched bpage");
    }

    public void tapMenuButton() {
        driver.findElement(menuButton).click();
        print("Tapped the menu button on a product");
    }

    public void tapGetItButton() {
        driver.findElement(getItButton).click();
        print("Tapped Get It button");
    }

    //--Waiter
    public void waitForBpage() {
        WaitersPage.waitForElement(bpageDate);
    }
}