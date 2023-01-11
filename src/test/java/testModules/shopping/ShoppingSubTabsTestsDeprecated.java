package testModules.shopping;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingSubTabsTestsDeprecated extends EditionsInit {

    @Test
    public void testSwipeLeft() {
        testName("Verify swiping between tabs to the left");
        List<String> tabValue = new ArrayList<>();
        tabValue = news.getSubTabActiveLeft();
        for (String e : tabValue) {
            Assert.assertEquals(tabValue, "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
            print("The active tab has value= " + e );
        }
    }

    @Test (priority = 1)
    public void testSwipeRight() {
        testName("Verify swiping between tabs to the left");
        List<String> tabValue = new ArrayList<>();
        tabValue = news.getSubTabActiveRight();
        for (String e : tabValue) {
            Assert.assertEquals(tabValue, "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");
            print("The active tab has value= " + e );
        }
    }

    @Test (priority = 2)
    public void testTrendingSubTab() {
        testName("Verify the Trending sub tab");

        shoppingSubTabs.tapTrendingSubTab();

        Assert.assertEquals(shoppingSubTabs.trendingSubTabIsActive(), "1");
        print("Verified the Trending sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
    }

    @Test (priority = 3)
    public void testAmazonSubTab() {
        testName("Verify the Amazon sub tab");
        shoppingSubTabs.tapAmazonSubTab();

        Assert.assertEquals(shoppingSubTabs.amazonSubTabIsActive(), "1");
        print("Verified the Amazon sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 4)
    public void testBeautySubTab() {
        testName("Verify the Beauty sub tab");
        shoppingSubTabs.tapBeautySubTab();

        Assert.assertEquals(shoppingSubTabs.beautySubTabIsActive(), "1");
        print("Verified the sub-tab Beauty is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 5)
    public void testDealsSubTab() {
        testName("Verify the Deals sub tab");
        shoppingSubTabs.tapDealsSubTab();

        Assert.assertEquals(shoppingSubTabs.dealsSubTabIsActive(), "1");
        print("Verified the sub-tab Deals is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 6)
    public void testHomeSubTab() {
        testName("Verify the Home sub tab");
        shoppingSubTabs.tapHomeSubTab();

        Assert.assertEquals(shoppingSubTabs.homeSubTabIsActive(), "1");
        print("Verified the sub-tab Home is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 7)
    public void testClothingSubTab() {
        testName("Verify the Clothing sub tab");
        shoppingSubTabs.tapClothingSubTab();

        Assert.assertEquals(shoppingSubTabs.clothingSubTabIsActive(), "1");
        print("Verified the Clothing sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 8)
    public void testUnder50SubTab() {
        testName("Verify the Under $50 sub tab");
        shoppingSubTabs.tapUnder50SubTab();

        Assert.assertEquals(shoppingSubTabs.under50SubTabIsActive(), "1");
        print("Verified the Under $50 sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 9)
    public void testGadgetsSubTab() {
        testName("Verify the Gadgets sub tab");
        shoppingSubTabs.tapGadgetsSubTab();

        Assert.assertEquals(shoppingSubTabs.gadgetsSubTabIsActive(), "1");
        print("Verified the Gadgets sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 10)
    public void testSplurgeSubTab() {
        testName("Verify the Splurge-Worthy sub tab");
        shoppingSubTabs.tapSplurgeSubTab();

        Assert.assertEquals(shoppingSubTabs.splurgeSubTabIsActive(), "1");
        print("Verified the Splurge-Worthy sub tab is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        shoppingSubTabs.tapFirstCell();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown();
    }

    @Test (priority = 11)
    public void testGiftSubTab() {
        testName("Verify the Gift Guide sub tab");
        shoppingSubTabs.tapGiftSubTab();

        Assert.assertEquals(shoppingSubTabs.giftSubTabIsActive(), "1");
        print("Verified the sub-tab Gift Guide is active");

        shoppingSubTabs.tapSplash();
        shoppingSubTabs.tapBackButton();
        scroll.scrollDown80_20();
        shoppingLatestSubTabs.tapShopNowButton();
        shoppingLatestSubTabs.returnToBFApp();
        scroll.scrollDown();
    }
}
