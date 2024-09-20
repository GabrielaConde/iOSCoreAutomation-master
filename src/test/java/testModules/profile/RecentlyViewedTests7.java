package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//7- Continues from BookmarksTests6
public class RecentlyViewedTests7 extends ProfileInit {

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
    public void testRecentlyViewedBapge() throws InterruptedException{
        try{
        testName("Open a bpage from the Recently Viewed tab");
        Thread.sleep(3000);
        scroll.swipeRight();
        scroll.swipeRight();
        bookmarks.tapBookmarksTab();
        viewed.recentlyViewedIsPresent();
        viewed.tapRecentlyViewedTab();
        Thread.sleep(4000);
        viewed.bpageViewedIsPresent();
        viewed.tapBpageViewed();
        viewed.tapBackButton();
        }catch (Exception e){
            print("ERROR ON TEST CASE");
            print(e.getMessage());
        }
    }

    @Test(priority = 1)
    public void testRecentlyViewedScreen() {
        try{
        testName("Verify bpage in the Recently Viewed tab");
        viewed.bpageViewedIsPresent();
        print("Verified a Recently Viewed bpage is present");
        }catch (Exception e){
            print("ERROR ON TEST CASE");
            print(e.getMessage());
        }

    }
}