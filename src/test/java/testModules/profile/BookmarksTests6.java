package testModules.profile;

import config.dataProvider.ProfileDataProvider;
import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//6- Continues from MyPostsTests5
public class BookmarksTests6 extends ProfileInit {

    @Test()
    public void testBookmarksTab() {
        testName("Verify Bookmarks tab");
        wishlist.tapWishlistTab();

        Assert.assertTrue(bookmarks.bookmarksTabIsPresent());
        print("Verified Bookmarks is present in the Profile screen");
    }

    @Test(priority = 1)
    public void testEmptyBookmarks()throws InterruptedException {
        testName("Verify Bookmarks empty message");
        bookmarks.tapBookmarksTab();
        Thread.sleep(3000);
        Assert.assertTrue(bookmarks.bookmarksEmptyMessageIsPresent());
        print("Verified Empty message is present in Bookmarks");
    }

    @Test(priority = 2, dataProvider = "Bookmarks", dataProviderClass = ProfileDataProvider.class)
    public void testAddBookmark(String data) throws InterruptedException {
        testName("Add a bookmark");
        bookmarks.tapBackButton();
        Thread.sleep(2000);
        bookmarks.tapHomeTab();
        bookmarks.tapOnSearchIcon();
        bookmarks.completeSearch(data);
        Thread.sleep(3000);
        bookmarks.addBookmarkButtonIsPresent();
        print("Verified Bookmark button is present in the bpage");
        Thread.sleep(2000);
        bookmarks.tapAddBookmarkButton();
        Thread.sleep(2000);
        bookmarks.tapBackButton();

        bookmarks.tapProfileButton();

        print("Verified Added to bookmark toast is displayed");
    }

    @Test(priority = 3)
    public void testBookmarkAdded() throws InterruptedException {
        testName("Verify the recently added bookmark");
        Thread.sleep(4000);
        bookmarks.bpageBookmarkedIsPresent();
        bookmarks.tapBackButton();

        print("Verified the bpage bookmarked is present in the Bookmarks tab");
    }

    @Test(priority = 4, dataProvider = "Bookmarks", dataProviderClass = ProfileDataProvider.class)
    public void testRemoveBookmark(String data) throws InterruptedException {
        testName("Remove bpage bookmarked");
        Thread.sleep(2000);
        bookmarks.tapBpageBookmarked();
        Thread.sleep(2000);
        bookmarks.tapBackButton();
        bookmarks.completeSearch(data);
        Assert.assertTrue(bookmarks.removeBookmarkButtonIsPresent());
        print("Verified Remove Bookmark button is present in the bpage");
        bookmarks.tapRemoveBookmarkButton();
        print("Verified Removed from bookmark toast is displayed");
    }

    @Test(priority = 5,dataProvider = "Bookmarks", dataProviderClass = ProfileDataProvider.class)
    public void testBookmarkRemoved(String data) throws InterruptedException {
        testName("Verify bookmarks is empty again");
        bookmarks.tapBackButton();
        bookmarks.tapProfileButton();
        Thread.sleep(3000);
        Assert.assertTrue(bookmarks.bookmarksEmptyMessageIsPresent());
        print("Verified Empty message is present in Bookmarks");
    }

}