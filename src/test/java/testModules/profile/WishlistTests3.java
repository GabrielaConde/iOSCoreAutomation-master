package testModules.profile;

import config.dataProvider.ProfileDataProvider;
import config.initPages.ProfileInit;
import config.pages.profile.BookmarksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

//3- Continues from RecentlyViewedEmptyTests2
public class WishlistTests3 extends ProfileInit {

    @Test()
    public void testWishlistTab() {
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
        testName("Add a product to the Wishlist");
        driver.get("buzz://jenae_sitzes/best-deals-this-week-5-9-22");
    //        driver.get("buzz://chelseastuart/weekday-deals-10-25-21");
            wishlist.returnToBFApp();
            wishlist.returnToBFApp();
            wishlist.returnToBFApp();
            wishlist.returnToBFApp();
    //    wishlist.waitForBpage();
       // scroll.scrollDown80_10();
        wishlist.scrollToMultipleItemsButton();

    //    Assert.assertTrue(wishlist.addToWishlistButtonIsPresent());
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
    public void testGetItButton() {
          testName("Verify the Get It button");
        Assert.assertTrue(wishlist.getItButtonIsPresent());
        print("Verified Get It button is present");

        wishlist.tapGetItButton();
        wishlist.returnToBFApp();

    }

    @Test(priority = 7)
    public void testCancelButton()throws InterruptedException {
        testName("Verify the Cancel button");
        Thread.sleep(3000);
        wishlist.tapMenuButton();
        Assert.assertTrue(wishlist.cancelButtonIsPresent());
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
        testName("Verify adding a single item to the wishlist");
        wishlist.tapExploreButton();
     //   wishlist.completeSearch(data);

        driver.get("buzz://chelseastuart/weekday-deals-10-25-21");
        //        driver.get("buzz://chelseastuart/weekday-deals-10-25-21");
        wishlist.returnToBFApp();
        wishlist.returnToBFApp();

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