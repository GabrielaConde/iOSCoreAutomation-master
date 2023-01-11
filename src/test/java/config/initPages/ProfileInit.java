package config.initPages;

import config.InitTest;
import config.pages.ScrollsPage;
import config.pages.bpage.BpagePage;
import config.pages.profile.*;
import org.testng.annotations.BeforeClass;

public class ProfileInit extends InitTest {

    protected BookmarksPage bookmarks;
    protected HeaderPage header;
    protected MyCommentsPage comments;
    protected MyPostsPage posts;
    protected RecentlyViewedPage viewed;
    protected WishlistPage wishlist;
    protected ScrollsPage scroll;
    protected BpagePage bpage;


    @BeforeClass
    public void initializePages() {
        bookmarks = new BookmarksPage();
        bpage = new BpagePage();
        header = new HeaderPage();
        comments = new MyCommentsPage();
        posts = new MyPostsPage();
        viewed = new RecentlyViewedPage();
        wishlist = new WishlistPage();
        scroll = new ScrollsPage();
    }
}