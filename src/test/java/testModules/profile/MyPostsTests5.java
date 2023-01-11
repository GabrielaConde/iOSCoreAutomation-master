package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//5- Continues from MyCommentsTests4
public class MyPostsTests5 extends ProfileInit {

    @Test()
    public void testMyPosts() {
        testName("Verify My Posts tab");
        scroll.swipeRight();
        scroll.swipeRight();
        scroll.swipeRight();
        Assert.assertTrue(posts.myPostsIsPresent());
        print("Verified My Posts is present in the Profile screen");

        posts.tapMyPosts();

        Assert.assertTrue(posts.myPostsEmptyMessageIsPresent());
        print("Verified Empty message is present in My Posts");


    }


}