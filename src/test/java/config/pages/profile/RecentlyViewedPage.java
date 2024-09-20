package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecentlyViewedPage extends CommonPage {

    //Catching elements
    private final By recentlyViewedTab = AppiumBy.accessibilityId("Recently Viewed");
    private final By recentlyViewedEmptyMessage = AppiumBy.accessibilityId("Take a look around and check out some posts or quizzes!, You can find them again here.");
    private final By bpageViewed = AppiumBy.accessibilityId("33 Things To Bring On Your Next Outdoor Adventure");

    //Methods
    public boolean recentlyViewedIsPresent() {
       // WaitersPage.waitForElement(recentlyViewedTab);
        return getDriver().findElement(recentlyViewedTab).isDisplayed();
    }

    public void tapRecentlyViewedTab() {
        getDriver().findElement(recentlyViewedTab).click();
        print("Tapped Recently Viewed");
    }

    public boolean recentlyViewedEmptyMessageIsPresent() {
        return getDriver().findElement(recentlyViewedEmptyMessage).isDisplayed();
    }

    public boolean bpageViewedIsPresent() {
       // return getDriver().findElement(bpageViewed).isDisplayed();
        try {
            getDriver().findElement(recentlyViewedEmptyMessage).isDisplayed();
            return false;
        }
        catch (Exception e){ return true;}
    }

    public void tapBpageViewed() {
        getDriver().findElement(bpageViewed).click();
        print("Tapped a recently viewed bpage");
    }
}
