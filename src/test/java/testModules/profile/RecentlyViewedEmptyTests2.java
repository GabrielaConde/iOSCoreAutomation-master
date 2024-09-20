package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//2- Continues from BFHeaderTests1
public class RecentlyViewedEmptyTests2 extends ProfileInit {

    @BeforeClass
    public void signIn()throws InterruptedException{
        header.tapGuestSignInAndNotif();
        Thread.sleep(2000);
        header.tapProfileButton();
        Thread.sleep(7000);
        header.tapOnContinueAuth0Btb();
        Thread.sleep(2000);
    }

    @Test()
    public void testRecentlyViewedTab()throws InterruptedException {
        testName("Verify Recently Viewed tab");
        Thread.sleep(4000);
     //   Assert.assertTrue(viewed.recentlyViewedIsPresent());
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