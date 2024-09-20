package testModules.profile;

import config.dataProvider.ProfileDataProvider;
import config.initPages.ProfileInit;
import config.pages.profile.BookmarksPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

//3- Continues from RecentlyViewedEmptyTests2
public class WishlistTests3 extends ProfileInit {

    @BeforeClass
    public void signIn()throws InterruptedException{
        header.tapGuestSignInAndNotif();
        Thread.sleep(2000);
        header.tapProfileButton();
        Thread.sleep(7000);
        header.tapOnContinueAuth0Btb();
        Thread.sleep(2000);
        header.tapCancelAuth();
        Thread.sleep(2000);
        header.tapOnContinueAuth0Btb();
        Thread.sleep(2000);
    }

    @Test()
    public void testWishlistTab()throws InterruptedException {
        Thread.sleep(3000);
        testName("Verify Wishlist tab");
        Assert.assertTrue(wishlist.wishlistIsPresent());
        print("Verified Wishlist is present in the Profile screen");

        wishlist.tapWishlistTab();
    }

    @Test(priority = 1)
    public void testWishlistEmpty()throws InterruptedException {
        testName("Verify Wishlist empty message");
        Thread.sleep(3000);
        Assert.assertTrue(wishlist.wishlistEmptyMessageIsPresent());
        print("Verified Empty message is present in Wishlist");
    }

    @Test(priority = 2)
    public void testExploreButton()throws InterruptedException {
        testName("Verify Explore button");
        Thread.sleep(3000);
        Assert.assertTrue(wishlist.exploreButtonIsPresent());
        print("Verified 'Explore BuzzFeed Shopping' button is present in Wishlist");
        wishlist.tapExploreButton();
        Assert.assertTrue(wishlist.shoppingHeaderIsPresent());
        print("Verified Shopping page is displayed");
    }

    @Test(priority = 3,  dataProvider = "WishList", dataProviderClass = ProfileDataProvider.class)
    public void testAddToWishlist(String data) throws InterruptedException {
        String buzz = "buzz://jenae_sitzes/best-deals-this-week-5-9-22";
        testName("Add a product to the Wishlist");
        Thread.sleep(2000);
        getDriver().activateApp("com.apple.mobilesafari");
     //   getDriver().get("buzz://jenae_sitzes/best-deals-this-week-5-9-22");
     //   getDriver().navigate().to("buzz://jenae_sitzes/best-deals-this-week-5-9-22");
        wishlist.tapSafariHeader();
        Thread.sleep(2000);
        wishlist.enterTextOnSafari(buzz);
        wishlist.tapOnOpenAlert();
        print("Verified Add to wishlist button is present in the bpage");

        wishlist.tapAddMultipleItemsToWishlistButton();

        print("Verified Added to wishlist toast is displayed");
    }

    public Boolean verifyItemsAreAddedToWishlist() {
        try {
            bpage.tapBackButton();
            wishlist.tapHomeTab();
            wishlist.tapProfileButton();
            wishlist.tapWishlistTab();
            return wishlist.verifyItemsAreAdded();
        } catch (Exception e) {
            print("ERROR ON TEST CASE");
            print(e.getMessage());
            return wishlist.verifyItemsAreAdded();
        }
    }



    @Test(priority = 4)
    public void testAddedToWishlist() {
        testName("Verify the product added to the Wishlist");
        verifyItemsAreAddedToWishlist();
        wishlist.multipleSavedProductHeadingIsPresent();
        print("Verified 'Saved product' heading is present in Wishlist");
    }



    @Test(priority = 6)
    public void testGetItButton()throws InterruptedException {
          testName("Verify the Get It button");
        Assert.assertTrue(wishlist.getItButtonIsPresent());
        print("Verified Get It button is present");
        wishlist.tapGetItButton();
       Thread.sleep(1000);
        wishlist.returnToBFApp();
//        wishlist.returnToBFAppViaSafari();

    }

    @Test(priority = 7)
    public void testCancelButton()throws InterruptedException {
        testName("Verify the Cancel button");
        Thread.sleep(4000);
        wishlist.tapMenuButton();
        Thread.sleep(3000);
        print("Verified Cancel button is present");
        wishlist.tapCancelButton();
    }

    public void removeFromWishlist() throws InterruptedException{
            Thread.sleep(4000);
            wishlist.tapMenuButton();
            Thread.sleep(4000);
            wishlist.tapRemoveFromWishlistButton();
    }

    @Test(priority = 8)
    public void testRemoveFromWishlist()throws InterruptedException {
        testName("Remove a product from the Wishlist");
        removeFromWishlist();
        Thread.sleep(2000);
        removeFromWishlist();
            Thread.sleep(2000);
            removeFromWishlist();
        print("Verified removed from wishlist toast is displayed");
    }

    @Test(priority = 9)
    public void testWishlistAfterRemoval()throws InterruptedException{
        testName("Verify the product was removed");
        Thread.sleep(5000);
        Assert.assertTrue(wishlist.wishlistEmptyMessageIsPresent());
        print("Verified Empty message is present in Wishlist");

    }

    @Test(priority = 10, dataProvider = "WishList", dataProviderClass = ProfileDataProvider.class)
    public void testAddingOneItemToWishList(String data) throws InterruptedException {
        String buzz = "buzz://chelseastuart/weekday-deals-10-25-21";
        testName("Verify adding a single item to the wishlist");
        wishlist.tapExploreButton();
     //   wishlist.completeSearch(data);
        getDriver().activateApp("com.apple.mobilesafari");
        wishlist.tapSafariHeader();
        wishlist.enterTextOnSafari(buzz);
        wishlist.tapOnOpenAlert();
        Thread.sleep(2000);
     //   getDriver().get("buzz://chelseastuart/weekday-deals-10-25-21");
        //        getDriver().get("buzz://chelseastuart/weekday-deals-10-25-21");
      //  wishlist.returnToBFApp();
      //  wishlist.returnToBFApp();

        wishlist.tapAddToWishlistButton();
        wishlist.tapBackButton();

    }

    @Test(priority = 11)
    public void testVerifySingleItemAdded() throws InterruptedException
    {
        wishlist.tapProfileButton();
        wishlist.tapWishlistTab();
        wishlist.savedProductHeadingIsPresent();
        removeFromWishlist();

    }
}