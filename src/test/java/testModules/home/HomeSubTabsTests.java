package testModules.home;

import config.initPages.EditionsInit;
import org.springframework.ui.context.Theme;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeSubTabsTests extends EditionsInit {

    @BeforeClass
    public void onboardingProcess() {
      //  scroll.swipeRight();
        scroll.swipeRight();
    }

    @Test
    public void trendingTab() throws InterruptedException{
        try{
        print("-------------------STARTING SUB-TABS TESTS ON HOME-------------------");
       // scroll.swipeToTrending();
       // latestSubTab.clickOnHomeIcon();
        homeSubTabs.clickOnTrendingtab();
       // scroll.swipeRight();
       testName("Verify Trending Tab");
        Assert.assertTrue(homeSubTabs.trendingSubTabIsPresent());
        print("Verified Sub-tab 'Trending' is present");

        /*Assert.assertEquals(homeSubTabs.trendingSubTabIsActive(), "1");
        print("Verified 'value' for 'Trending' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Trending'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.firstCellOnTrendingIsPresent());
        print("Verified First Bpage is present on sub-tab 'Trending'");

        homeSubTabs.tapFirstCellOnTrending();
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 1)
    public void coronavirusTab()throws InterruptedException{
        try{
        testName("Verify Coronavirus Sub-Tab");
      //  scroll.swipeLeft();
       // scroll.swipeRight();
        homeSubTabs.clickOnCoronavitustab();

        Assert.assertTrue(homeSubTabs.coronavirusTabIsPresent());
        print("Verified Sub-tab 'Coronavirus' is present");

        /*Assert.assertEquals(homeSubTabs.coronavirusTabIsActive(), "1");
        print("Verified 'value' for 'Coronavirus' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Coronavirus'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Coronavirus'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

   // @Test (priority = 2)
    public void videosTab(){
        testName("Verify Videos Sub-Tab");
       // scroll.swipeRight();

        Assert.assertTrue(homeSubTabs.videosSubTabIsPresent());
        print("Verified Sub-tab 'Videos' is present");

      /*  Assert.assertEquals(homeSubTabs.videosSubTabIsActive(), "1");
        print("Verified 'value' for 'Videos' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.firstVideoIsPresent());
        print("Verified First Video is present on sub-tab 'Videos'");

        homeSubTabs.tapFirstVideo();
        homeSubTabs.tapCloseButton();
    }

    @Test (priority = 3)
    public void tvMoviesTab() throws InterruptedException{
        try{
        testName("Verify TV & Movies Sub-Tab");
       // scroll.swipeLeft();
       // scroll.swipeLeft();
      //  scroll.swipeRight();
        homeSubTabs.clickOnTVMoviesTab();

        Assert.assertTrue(homeSubTabs.tvMoviesTabIsPresent());
        print("Verified Sub-tab 'TV & Movies' is present");

       /* Assert.assertEquals(homeSubTabs.tvMoviesTabIsActive(), "1");
        print("Verified 'value' for 'TV & Movies' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Tv & Movies'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Tv & Movies'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 4)
    public void animalsTab() throws InterruptedException{
        try{
        testName("Verify Animals Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnAnimalstab();

        Assert.assertTrue(homeSubTabs.animalsTabIsPresent());
        print("Verified Sub-tab 'Animals' is present");

       /* Assert.assertEquals(homeSubTabs.animalsTabIsActive(), "1");
        print("Verified 'value' for 'Animals' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Animals'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Animals'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 5)
    public void celebrityTab() throws InterruptedException{
        try{
        testName("Verify Celebrity Sub-Tab");
        //scroll.swipeRight();
        homeSubTabs.clickOnCelebritytab();

        Assert.assertTrue(homeSubTabs.celebrityTabIsPresent());
        print("Verified Sub-tab 'Celebrity' is present");

        /*Assert.assertEquals(homeSubTabs.celebrityTabIsActive(), "1");
        print("Verified 'value' for 'Celebrity' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Celebrity'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Celebrity'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 6)
    public void booksTab() throws InterruptedException{
        try{
        testName("Verify Books Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnBookstab();

        Assert.assertTrue(homeSubTabs.booksTabIsPresent());
        print("Verified Sub-tab 'Books' is present");

        /*Assert.assertEquals(homeSubTabs.booksTabIsActive(), "1");
        print("Verified 'value' for 'Books' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Books'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Books'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 7)
    public void communityTab()throws InterruptedException{
        try{
        testName("Verify Community Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnCommunitytab();

        Assert.assertTrue(homeSubTabs.communityTabIsPresent());
        print("Verified Sub-tab 'Community' is present");

       /* Assert.assertEquals(homeSubTabs.communityTabIsActive(), "1");
        print("Verified 'value' for 'Community' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Community'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on  sub-tab 'Community'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 8)
    public void foodTab() throws InterruptedException{
        try{
        testName("Verify Food Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnFoodtab();

        Assert.assertTrue(homeSubTabs.foodTabIsPresent());
        print("Verified Sub-tab 'Food' is present");

        /*Assert.assertEquals(homeSubTabs.foodTabIsActive(), "1");
        print("Verified 'value' for 'Food' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Food'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Food'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 9)
    public void healthTab() throws InterruptedException{
        try{
        testName("Verify Health Sub-Tab");
        //scroll.swipeRight();
        homeSubTabs.clickOnHealthtab();

        Assert.assertTrue(homeSubTabs.healthTabIsPresent());
        print("Verified Sub-tab 'Health' is present");

        /*Assert.assertEquals(homeSubTabs.healthTabIsActive(), "1");
        print("Verified 'value' for 'Health' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab Health'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Health'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 10)
    public void lgbtqTab() throws InterruptedException{
        try{
        testName("Verify LGBTQ Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnLGTBtab();

        Assert.assertTrue(homeSubTabs.lgbtqTabIsPresent());
        print("Verified Sub-tab 'LGBTQ' is present");

       /* Assert.assertEquals(homeSubTabs.lgbtqTabIsActive(), "1");
        print("Verified 'value' for 'LGBTQ' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'LGBTQ'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'LGBTQ'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 11)
    public void musicTab()throws InterruptedException{
        try{
        testName("Verify Music Sub-Tab");
        //scroll.swipeRight();
        homeSubTabs.clickOnMusictab();

        Assert.assertTrue(homeSubTabs.musicTabIsPresent());
        print("Verified Sub-tab 'Music' is present");

       /* Assert.assertEquals(homeSubTabs.musicTabIsActive(), "1");
        print("Verified 'value' for 'Music' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Music'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Music'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 12)
    public void niftyTab() throws InterruptedException{
        try{
        testName("Verify Nifty Sub-Tab");
      //  scroll.swipeRight();
        homeSubTabs.clickOnNiftytab();

        Assert.assertTrue(homeSubTabs.niftyTabIsPresent());
        print("Verified Sub-tab 'Nifty' is present");

      /*  Assert.assertEquals(homeSubTabs.niftyTabIsActive(), "1");
        print("Verified 'value' for 'Nifty' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Nifty'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.firstVideoIsPresent());
        print("Verified First Video is present on sub-tab 'Nifty'");

        homeSubTabs.tapFirstVideo();
        Thread.sleep(2000);
        homeSubTabs.tapCloseButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 13)
    public void parentsTab()throws InterruptedException{
        try{
        testName("Verify Parents Sub-Tab");
        //scroll.swipeRight();
        homeSubTabs.clickOnParentstab();

        Assert.assertTrue(homeSubTabs.parentsTabIsPresent());
        print("Verified Sub-tab 'Parents' is present");

       /* Assert.assertEquals(homeSubTabs.parentsTabIsActive(), "1");
        print("Verified 'value' for 'Parents' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Parents'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Parents'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 14)
    public void rewindTab() throws InterruptedException{
        try{
        testName("Verify Rewind Sub-Tab");
       // scroll.swipeRight();
        homeSubTabs.clickOnRewindtab();

        Assert.assertTrue(homeSubTabs.rewindTabIsPresent());
        print("Verified Sub-tab 'Rewind' is present");

       /* Assert.assertEquals(homeSubTabs.rewindTabIsActive(), "1");
        print("Verified 'value' for 'Rewind' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Rewind'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Rewind'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 15)
    public void styleTab() throws InterruptedException{
        try{
        testName("Verify Style Sub-Tab");
      //  scroll.swipeRight();
        homeSubTabs.clickOnStyletab();

        Assert.assertTrue(homeSubTabs.styleTabIsPresent());
        print("Verified Sub-tab 'Style' is present");

       /* Assert.assertEquals(homeSubTabs.styleTabIsActive(), "1");
        print("Verified 'value' for 'Style' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Style'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Style'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 16)
    public void travelTab() throws InterruptedException{
        try{
        testName("Verify Travel Sub-Tab");
        homeSubTabs.clickOnTraveltab();
       // scroll.swipeRight();

        Assert.assertTrue(homeSubTabs.travelTabIsPresent());
        print("Verified Sub-tab 'Travel' is present");

        /*Assert.assertEquals(homeSubTabs.travelTabIsActive(), "1");
        print("Verified 'value' for 'Travel' sub-tab is = 1, the sub-tab is active");*/

        Assert.assertTrue(homeSubTabs.splashCellIsPresent());
        print("Verified Splash is present on sub-tab 'Travel'");

        homeSubTabs.tapSplash();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();

        Assert.assertTrue(homeSubTabs.fistCellIsPresent());
        print("Verified First Bpage is present on sub-tab 'Travel'");

        homeSubTabs.tapFirstCell();
        Thread.sleep(2000);
        homeSubTabs.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 17)
    public void testTabs()
    { Assert.assertTrue(false);
    }
}
