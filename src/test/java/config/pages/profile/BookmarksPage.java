package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookmarksPage extends CommonPage {

    //Catching elements
    private final By cancelBtn = AppiumBy.accessibilityId("Cancel");
 //   private final By cancelBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    private final By bookmarksTab = AppiumBy.accessibilityId("Bookmarks");
    private final By bookmarksEmptyMessage = AppiumBy.accessibilityId("Did you know you can bookmark posts and quizzes?, To bookmark, tap the bookmark icon");
    private final By addBookmarkButton = AppiumBy.accessibilityId("Add Bookmark");
    private final By removeBookmarkButton = AppiumBy.accessibilityId("Remove Bookmark");
    private final By bookmarkAddedToast = AppiumBy.accessibilityId("Added to your Bookmarks!");
    private final By bookmarkRemovedToast = AppiumBy.accessibilityId("Removed from your Bookmarks!");
  //  private final By bpageBookmarked = By.xpath("//XCUIElementTypeStaticText[@name='33 Things To Bring On Your Next Outdoor Adventure']");
  //  private final By bpageBookmarked = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[5]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
   private final By bpageBookmarked = AppiumBy.iOSNsPredicateString("label == \"33 Things To Bring On Your Next Outdoor Adventure\" AND name == \"33 Things To Bring On Your Next Outdoor Adventure\"");


    @Override
    public void enterEmail(String userData) {
        super.enterEmail(userData);
    }

    //Methods
    public boolean bookmarksTabIsPresent() {
        return getDriver().findElement(bookmarksTab).isDisplayed();
    }

    public void tapBookmarksTab() {
        getDriver().findElement(bookmarksTab).click();
        print("Tapped Bookmarks");
    }

    public void clickOnCancelBtn(){
       // WaitersPage.waitForElement(cancelBtn);
        getDriver().findElement(cancelBtn).click();
    }

    public boolean bookmarksEmptyMessageIsPresent() {
        return getDriver().findElement(bookmarksEmptyMessage).isDisplayed();
    }

    public boolean addBookmarkButtonIsPresent() {
        return getDriver().findElement(addBookmarkButton).isDisplayed();
    }

    public void tapAddBookmarkButton() {
        getDriver().findElement(addBookmarkButton).click();
        print("Tapped Add to Bookmarks button");
    }

    public boolean removeBookmarkButtonIsPresent() {
       // WaitersPage.waitForElement(removeBookmarkButton);
        return getDriver().findElement(removeBookmarkButton).isDisplayed();
    }

    public void tapRemoveBookmarkButton() {
        getDriver().findElement(removeBookmarkButton).click();
        print("Tapped Remove from Bookmarks button");
    }

    public boolean bookmarkAddedToastIsPresent() {
        return getDriver().findElement(bookmarkAddedToast).isDisplayed();
    }

    public boolean bookmarkRemovedToastIsPresent() {
        return getDriver().findElement(bookmarkRemovedToast).isDisplayed();
    }

    public boolean bpageBookmarkedIsPresent() {
       // WaitersPage.waitForElement(bpageBookmarked);
        Boolean result = getDriver().findElement(bpageBookmarked).isDisplayed();
        return result;
    }

    public void tapBpageBookmarked() throws InterruptedException{
        Thread.sleep(3000);
        getDriver().findElement(bpageBookmarked).click();
        print("Tapped Bpage bookmarked");
    }
}