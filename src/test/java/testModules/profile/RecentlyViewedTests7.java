package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//7- Continues from BookmarksTests6
public class RecentlyViewedTests7 extends ProfileInit {

    @Test()
    public void testRecentlyViewedBapge() throws InterruptedException{
        testName("Open a bpage from the Recently Viewed tab");
        Thread.sleep(3000);
        scroll.swipeRight();
        scroll.swipeRight();
        bookmarks.tapBookmarksTab();
        viewed.recentlyViewedIsPresent();
        viewed.tapRecentlyViewedTab();
        Thread.sleep(4000);
        Assert.assertTrue(viewed.bpageViewedIsPresent());
        viewed.tapBpageViewed();
        viewed.tapBackButton();
    }

    @Test(priority = 1)
    public void testRecentlyViewedScreen() {
        testName("Verify bpage in the Recently Viewed tab");
        Assert.assertTrue(viewed.bpageViewedIsPresent());
        print("Verified a Recently Viewed bpage is present");

    }
}