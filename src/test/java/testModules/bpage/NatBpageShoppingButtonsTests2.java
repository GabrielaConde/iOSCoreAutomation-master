package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.initPages.BpageInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//2- Continues from NatBpageTests1
public class NatBpageShoppingButtonsTests2 extends BpageInit {

    @Test(dataProvider = "amazonButtonNativeBpage", dataProviderClass = BpagesDataProvider.class)
    public void testSearchFallbackBpage(String data) throws InterruptedException{
        print("-------------------STARTING TO TEST SHOPPING BUTTONS ON NATIVE BPAGE -------------------");
        testName("Search native Bpage with Amazon shopping button");
        Thread.sleep(3000);
        amazonButton.completeSearch(data);
    }

    @Test(priority = 1)
    public void testBuyFromAmazonButtonIsPresent() {
        testName("Verify 'Buy from Amazon' button is present on bpage");
        Assert.assertEquals(amazonButton.bpageTitleIsPresent(), "33 Trendy Pieces Your Friends Will Want To Borrow");
        print("Verified Bpage title is present. Bpage loaded fine.");

        scroll.scrollDown90_10();

        Assert.assertTrue(amazonButton.buyFromAmazonIsPresent());
        print("Verified 'Buy from Amazon' button is present");
    }

    @Test(priority = 2)
    public void testBuyFromAmazonButton() {
        testName("Verify 'Buy from Amazon' button is present on bpage");
        amazonButton.tapBuyFromAmazonButton();

        Assert.assertTrue(amazonButton.amazonSiteIsPresent());
        print("Verified 'Amazon' site loaded fine");

        amazonButton.returnToBFApp();
    }

    @Test(priority = 3)
    public void testBuyNowIsPresent() {
        testName("Verify 'Buy Now' button is present on bpage");
            amazonButton.scrollBuyNowButton();
            amazonButton.buyNowIsPresent();
            print("Verified 'Buy Now' button is present");
    }

    @Test(priority = 4)
    public void testBuyNowButton() {
        testName("Verify 'Buy Now' button is present on bpage");
        amazonButton.tapBuyNowButton();
        amazonButton.returnToBFApp();
    }
}
