package testModules.signIn;

import config.InitTest;
import config.dataProvider.LoginCredentialsDataProvider;
import config.pages.signIn.SignInMailPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInEmailTests extends InitTest {
    protected SignInMailPage signIn;

    @BeforeClass
    public void initProcess() {
        signIn = new SignInMailPage();
    }

    @Test(dataProvider = "BFuser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterEmail(String data) throws InterruptedException{
        testName("Enter Email");
        signIn.tapAllowButton();
        Thread.sleep(2000);
        signIn.tapAllowButton();
        Thread.sleep(2000);
        signIn.tapOnAcceptAllCookiesBtn();
        Thread.sleep(4000);
        signIn.closeGoToGamesScreen();
        Thread.sleep(3000);
        Assert.assertTrue(signIn.profileButtonIsPresent());
        print("Verified Sign in button is present in the nav bar");
        signIn.tapProfileButton();
        signIn.emailFieldIsPresent();
        print("Verified Email field is present in the Login screen");

        signIn.enterEmail(data);
      //  Thread.sleep(2000);
      //  signIn.tapNotNow();
    }

    @Test(priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data)  throws InterruptedException {
        testName("Enter password and login");
        signIn.passwordFieldIsPresent();
        print("Verified password field is present in the Login screen");

        signIn.enterPassword(data);

        signIn.signInButtonIsPresent();
        print("Verified Sign In button is present in the Login screen");

        signIn.tapSignInButton();
        Thread.sleep(6000);
        signIn.tapNotNow();
        print("Logged in with email");
    }

    @Test(priority = 2)
    public void testUserName() throws InterruptedException{
        testName("Verify User Name");
        Thread.sleep(3000);
       signIn.userNameIsPresent();
        print("Verified User Name is present in the Profile screen");
    }

    @Test(priority = 3)
    public void testDate() {
        testName("Verify Date");
         signIn.dateIsPresent();
        print("Verified Date is present in the Profile screen");
    }
}