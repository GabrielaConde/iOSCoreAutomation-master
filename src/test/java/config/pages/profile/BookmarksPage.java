package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookmarksPage extends CommonPage {

    //Catching elements
    private final By cancelBtn = MobileBy.AccessibilityId("Cancel");
 //   private final By cancelBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    private final By bookmarksTab = MobileBy.AccessibilityId("Bookmarks");
    private final By bookmarksEmptyMessage = MobileBy.AccessibilityId("Did you know you can bookmark posts and quizzes?, To bookmark, tap the bookmark icon");
    private final By addBookmarkButton = MobileBy.AccessibilityId("Add Bookmark");
    private final By removeBookmarkButton = MobileBy.AccessibilityId("Remove Bookmark");
    private final By bookmarkAddedToast = MobileBy.AccessibilityId("Added to your Bookmarks!");
    private final By bookmarkRemovedToast = MobileBy.AccessibilityId("Removed from your Bookmarks!");
  //  private final By bpageBookmarked = By.xpath("//XCUIElementTypeStaticText[@name='33 Things To Bring On Your Next Outdoor Adventure']");
  //  private final By bpageBookmarked = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[5]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
   private final By bpageBookmarked = MobileBy.iOSNsPredicateString("label == \"33 Things To Bring On Your Next Outdoor Adventure\" AND name == \"33 Things To Bring On Your Next Outdoor Adventure\"");


    @Override
    public void enterEmail(String userData) {
        super.enterEmail(userData);
    }

    //Methods
    public boolean bookmarksTabIsPresent() {
        return driver.findElement(bookmarksTab).isDisplayed();
    }

    public void tapBookmarksTab() {
        driver.findElement(bookmarksTab).click();
        print("Tapped Bookmarks");
    }

    public void clickOnCancelBtn(){
        WaitersPage.waitForElement(cancelBtn);
        driver.findElement(cancelBtn).click();
    }

    public boolean bookmarksEmptyMessageIsPresent() {
        return driver.findElement(bookmarksEmptyMessage).isDisplayed();
    }

    public boolean addBookmarkButtonIsPresent() {
        return driver.findElement(addBookmarkButton).isDisplayed();
    }

    public void tapAddBookmarkButton() {
        driver.findElement(addBookmarkButton).click();
        print("Tapped Add to Bookmarks button");
    }

    public boolean removeBookmarkButtonIsPresent() {
        WaitersPage.waitForElement(removeBookmarkButton);
        return driver.findElement(removeBookmarkButton).isDisplayed();
    }

    public void tapRemoveBookmarkButton() {
        driver.findElement(removeBookmarkButton).click();
        print("Tapped Remove from Bookmarks button");
    }

    public boolean bookmarkAddedToastIsPresent() {
        return driver.findElement(bookmarkAddedToast).isDisplayed();
    }

    public boolean bookmarkRemovedToastIsPresent() {
        return driver.findElement(bookmarkRemovedToast).isDisplayed();
    }

    public boolean bpageBookmarkedIsPresent() {
       // WaitersPage.waitForElement(bpageBookmarked);
        Boolean result = driver.findElement(bpageBookmarked).isDisplayed();
        return result;
    }

    public void tapBpageBookmarked() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(bpageBookmarked).click();
        print("Tapped Bpage bookmarked");
    }
}