package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//2- Continues from BFHeaderTests1
public class RecentlyViewedEmptyTests2 extends ProfileInit {

    @Test()
    public void testRecentlyViewedTab() {
        testName("Verify Recently Viewed tab");
        Assert.assertTrue(viewed.recentlyViewedIsPresent());
        print("Verified Recently Viewed is present in the Profile screen");
        viewed.tapRecentlyViewedTab();
    }

    @Test(priority = 1)
    public void testRecentlyViewedEmpty() {
        testName("Verify Recently Viewed empty message");
         Assert.assertTrue(viewed.recentlyViewedEmptyMessageIsPresent());
        print("Verified Empty message is present in Recently Viewed");
    }
}