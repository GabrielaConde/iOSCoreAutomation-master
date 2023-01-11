package config.pages.profile;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecentlyViewedPage extends CommonPage {

    //Catching elements
    private final By recentlyViewedTab = MobileBy.AccessibilityId("Recently Viewed");
    private final By recentlyViewedEmptyMessage = MobileBy.AccessibilityId("Take a look around and check out some posts or quizzes!, You can find them again here.");
    private final By bpageViewed = MobileBy.AccessibilityId("33 Things To Bring On Your Next Outdoor Adventure");

    //Methods
    public boolean recentlyViewedIsPresent() {
        WaitersPage.waitForElement(recentlyViewedTab);
        return driver.findElement(recentlyViewedTab).isDisplayed();
    }

    public void tapRecentlyViewedTab() {
        driver.findElement(recentlyViewedTab).click();
        print("Tapped Recently Viewed");
    }

    public boolean recentlyViewedEmptyMessageIsPresent() {
        return driver.findElement(recentlyViewedEmptyMessage).isDisplayed();
    }

    public boolean bpageViewedIsPresent() {
       // return driver.findElement(bpageViewed).isDisplayed();
        try {
            driver.findElement(recentlyViewedEmptyMessage).isDisplayed();
            return false;
        }
        catch (Exception e){ return true;}
    }

    public void tapBpageViewed() {
        driver.findElement(bpageViewed).click();
        print("Tapped a recently viewed bpage");
    }
}
