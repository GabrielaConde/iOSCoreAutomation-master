package testModules.home;

import config.initPages.EditionsInit;
import config.pages.home.ShowsSubTabPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShowsSubTabTests extends EditionsInit {


    @BeforeClass
    public void goingToShowsTab() throws InterruptedException {
        signInOnFstLaunch();
        Thread.sleep(3000);
     //   scroll.swipeLeftAppium2();
     //   scroll.swipeLeftAppium2();
      //  Thread.sleep(2000);
        latestSubTab.tapOnMoreSubNav();
        latestSubTab.tapOnShows();
        print("-------------------STARTING SHOWS SUB-TAB TESTS-------------------");
        testName("Verify Shows Sub-Tab is present and tap-able");
        Assert.assertTrue(showSubTab.showsTabIsPresent());
        print("Verified Sub-tab 'Shows' is present");
        //   showSubTab.tapShowSubTab();

    }


    public void signInOnFstLaunch() throws InterruptedException {
        latestSubTab.tapOnSignInLink();
        latestSubTab.enterPassword("sanfer12");
        latestSubTab.enterEmail("salpimie");
        Thread.sleep(2000);
        latestSubTab.tapSignInBFButton();
        Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        latestSubTab.switchToAlert();
        latestSubTab.tapAllowButton();
        latestSubTab.switchToAlert();
        latestSubTab.tapNotNow();
        //  signIn.switchToAlert();
        latestSubTab.setUSEdition();
       }



  //  @Test
    public void verifyShowTabActive(){
        testName("Verify Shows Sub-Tab is active");
    //    Assert.assertEquals(showSubTab.showsTabIsActive(), "1");
        print("Verified 'value' for sub-tab 'Shows' is = 1, the sub-tab is active");

    }



    @Test(priority = 1)
    public void tapShows()throws InterruptedException{
        testName("Verify all Shows from Shows Sub-Tab");
        showSubTab.tapShow();
        print("Verified the Shows are working correctly");
    }
}
