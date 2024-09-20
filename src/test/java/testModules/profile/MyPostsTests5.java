package testModules.profile;

import config.initPages.ProfileInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//5- Continues from MyCommentsTests4
public class MyPostsTests5 extends ProfileInit {


  //  @Test()
    public void signInOnFstLaunch()throws InterruptedException{
        posts.tapOnSignInLink();
        posts.enterPassword("sanfer12");
        posts.enterEmail("salpimie");
        Thread.sleep(3000);
        posts.tapSignInBFButton();
        Thread.sleep(3000);
        posts.tapAllowButton();
        posts.switchToAlert();
        posts.tapAllowButton();
        posts.switchToAlert();
        posts.tapNotNow();
        //  signIn.switchToAlert();
        posts.setUSEdition();

    }

    @BeforeClass
    public void signIn()throws InterruptedException{
        header.tapGuestSignInAndNotif();
        Thread.sleep(2000);
        header.tapProfileButton();
        Thread.sleep(7000);
        header.tapOnContinueAuth0Btb();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void testMyPosts() throws InterruptedException{
        testName("Verify My Posts tab");
       /* scroll.swipeRight();
        scroll.swipeRight();
        scroll.swipeRight();*/
        posts.tapOnPerfBtn();
        header.tapOnContinueAuth0Btb();
        Thread.sleep(2000);
        scroll.swipeLeftAppium2();
        scroll.swipeLeftAppium2();
        scroll.swipeLeftAppium2();
        Assert.assertTrue(posts.myPostsIsPresent());
        print("Verified My Posts is present in the Profile screen");
        posts.tapMyPosts();
        Assert.assertTrue(posts.myPostsEmptyMessageIsPresent());
        print("Verified Empty message is present in My Posts");

    }


}