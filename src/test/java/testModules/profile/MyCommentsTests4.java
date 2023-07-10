package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//4- Continues from WishlistTests3
public class MyCommentsTests4 extends ProfileInit {

    @Test()
    public void testMyComments() throws InterruptedException{
        testName("Verify My Comments tab");
        Assert.assertTrue(comments.myCommentsIsPresent());
        print("Verified My Comments is present in the Profile screen");

        comments.tapMyComments();
        Thread.sleep(3000);
        Assert.assertTrue(comments.myCommentsEmptyMessageIsPresent());
        print("Verified Empty message is present in My Comments");


    }
}