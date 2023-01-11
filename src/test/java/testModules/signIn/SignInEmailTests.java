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
    public void testEnterEmail(String data) {
        testName("Enter Email");
        signIn.tapAllowButton();
        signIn.tapAllowButton();
        Assert.assertTrue(signIn.profileButtonIsPresent());
        print("Verified Sign in button is present in the nav bar");

        signIn.tapProfileButton();

        Assert.assertTrue(signIn.emailFieldIsPresent());
        print("Verified Email field is present in the Login screen");

        signIn.enterEmail(data);
    }

    @Test(priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data) {
        testName("Enter password and login");

        Assert.assertTrue(signIn.passwordFieldIsPresent());
        print("Verified password field is present in the Login screen");

        signIn.enterPassword(data);

        Assert.assertTrue(signIn.signInButtonIsPresent());
        print("Verified Sign In button is present in the Login screen");

        signIn.tapSignInButton();
        print("Logged in with email");
    }

    @Test(priority = 2)
    public void testUserName() {
        testName("Verify User Name");

        Assert.assertTrue(signIn.userNameIsPresent());
        print("Verified User Name is present in the Profile screen");
    }

    @Test(priority = 3)
    public void testDate() {
        testName("Verify Date");

        Assert.assertTrue(signIn.dateIsPresent());
        print("Verified Date is present in the Profile screen");
    }
}