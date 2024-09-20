package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
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
    private final By wishlist = AppiumBy.accessibilityId("Wishlist");
    private final By addToWishlistButton = By.xpath("(//XCUIElementTypeButton[@name=\"love\"])[1]");
    private final By wishlistMultipleItems = By.xpath("//XCUIElementTypeButton[@name='Add to wishlist']");
    private final By wishlistEmptyMessage = AppiumBy.accessibilityId("You don't have anything in your wishlist yet!");
    private final By exploreButton = AppiumBy.accessibilityId("Explore BuzzFeed Shopping");
    private final By shoppingHeader = AppiumBy.accessibilityId("Shopping");
    private final By wishlistResult = AppiumBy.accessibilityId("If You're Looking To Treat Yourself, Here Are 31 Things Under $10 From Target");
 //   private final By addToWishlistButton = AppiumBy.accessibilityId("icon heart");
    private final By addedToWishlistToast = AppiumBy.accessibilityId("Saved product to wishlist!");
    private final By bpageDate = AppiumBy.accessibilityId("Shopping • Jun 15, 2021");
    private final By savedProductHeading = AppiumBy.accessibilityId("1 saved product");
    private final By multipleSavedProductsHeading = AppiumBy.accessibilityId("3 saved products");
    private final By disclosure =  AppiumBy.accessibilityId("BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.");
    private final By menuButton = AppiumBy.accessibilityId("menu button");
    private final By removeFromWishlistButton = AppiumBy.accessibilityId("Remove from wishlist");
    private final By removedFromWishlistToast = AppiumBy.accessibilityId("Removed product from wishlist");
    private final By getItButton = AppiumBy.accessibilityId("Get it");

    //Methods
    public boolean wishlistIsPresent() {
        return getDriver().findElement(wishlist).isDisplayed();
    }

    public Boolean verifyItemsAreAdded(){
        return getDriver().findElements(wishlistCell).size()>0;
    }



    public void tapWishlistTab() {
        getDriver().findElement(wishlist).click();
        print("Tapped Wishlist tab");
    }


    public boolean wishlistEmptyMessageIsPresent() {
        return getDriver().findElement(wishlistEmptyMessage).isDisplayed();
    }

    public boolean exploreButtonIsPresent() {
        return getDriver().findElement(exploreButton).isDisplayed();
    }

    public void tapExploreButton() {
        getDriver().findElement(exploreButton).click();
        print("Tapped Explore Buzzfeed Shopping");
    }

    public void scrollToMultipleItemsButton(){
      //  scroll.scrollDown
        scroll.scrollUntilElement(wishlistMultipleItems);

    }

    public boolean shoppingHeaderIsPresent() {
        return getDriver().findElement(shoppingHeader).isDisplayed();
    }

    public boolean addToWishlistButtonIsPresent() {
        return getDriver().findElement(addToWishlistButton).isDisplayed();
    }

    public void tapAddToWishlistButton() throws InterruptedException {
        Thread.sleep(2000);
        scroll.scrollMultipleTimes(1);
        scroll.scrollUntilElement(addToWishlistButton);
        Thread.sleep(1000);
        getDriver().findElement(addToWishlistButton).click();
        print("Tapped Add to wishlist button");
    }

    public void tapAddMultipleItemsToWishlistButton()throws InterruptedException {
        scrollInBpage2();
        Thread.sleep(2000);
        getDriver().findElement(wishlistMultipleItems).click();
        Thread.sleep(2000);
        print("Tapped Add to wishlist button");
    }

    public boolean addedToWishlistToastIsPresent() {
        return getDriver().findElement(addedToWishlistToast).isDisplayed();
    }

    public boolean savedProductHeadingIsPresent() {
       // WaitersPage.waitForElement(savedProductHeading);
        return getDriver().findElement(savedProductHeading).isDisplayed();
    }

    public boolean multipleSavedProductHeadingIsPresent() {
       // WaitersPage.waitForElement(multipleSavedProductsHeading);
        return getDriver().findElement(multipleSavedProductsHeading).isDisplayed();
    }

    public boolean disclosureIsPresent() {
       // WaitersPage.waitForElement(disclosure);
        return getDriver().findElement(disclosure).isDisplayed();
    }

    public boolean getItButtonIsPresent() {
        return getDriver().findElement(getItButton).isDisplayed();
    }

    public boolean removedFromWishlistToastIsPresent() {
        return getDriver().findElement(removedFromWishlistToast).isDisplayed();
    }

    public void tapRemoveFromWishlistButton() {
        getDriver().findElement(removeFromWishlistButton).click();
        print("Tapped the menu button on a product");
    }

    public void tapWishlistResult() {
        getDriver().findElement(wishlistResult).click();
        print("Tapped the searched bpage");
    }

    public void tapMenuButton() {
        getDriver().findElement(menuButton).click();
        print("Tapped the menu button on a product");
    }

    public void tapGetItButton() {
        getDriver().findElement(getItButton).click();
        print("Tapped Get It button");
    }

    //--Waiter
    public void waitForBpage() {
     //   WaitersPage.waitForElement(bpageDate);
    }
}