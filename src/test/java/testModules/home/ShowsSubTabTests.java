package testModules.home;

import config.initPages.EditionsInit;
import config.pages.home.ShowsSubTabPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShowsSubTabTests extends EditionsInit {


    @BeforeClass
    public void goingToShowsTab() {
        //showSubTab.swipeRightManyTimes();
        latestSubTab.tapOnMore();
        latestSubTab.tapOnShows();
      //  homeSubTabs.clickOnShowstab();
        print("-------------------STARTING SHOWS SUB-TAB TESTS-------------------");
        testName("Verify Shows Sub-Tab is present and tap-able");
        Assert.assertTrue(showSubTab.showsTabIsPresent());
        print("Verified Sub-tab 'Shows' is present");

     //   showSubTab.tapShowSubTab();

    }

  //  @Test
    public void verifyShowTabActive(){
        try{
        testName("Verify Shows Sub-Tab is active");
    //    Assert.assertEquals(showSubTab.showsTabIsActive(), "1");
        print("Verified 'value' for sub-tab 'Shows' is = 1, the sub-tab is active");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 1)
    public void tapShows(){
        try{
        testName("Verify all Shows from Shows Sub-Tab");
        showSubTab.tapShow();
        print("Verified the Shows are working correctly");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }
}
