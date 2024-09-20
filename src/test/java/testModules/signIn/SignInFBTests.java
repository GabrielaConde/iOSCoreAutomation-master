package testModules.signIn;

import config.InitTest;
import config.dataProvider.LoginCredentialsDataProvider;
import config.pages.signIn.SignInFBPage;
//import javafx.animation.ScaleTransition;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInFBTests extends InitTest {
    protected SignInFBPage login;

    @BeforeClass
    public void initProcess() {
        login = new SignInFBPage();
    }

    @Test(enabled = false, dataProvider = "FBuser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginUserCredentials(String data){
        login.tapAllowButton();
        login.tapProfileButton();
        login.tapFBLoginButton();
        login.tapContinueToFBButton();
        login.tapUserFieldOnFB();
        login.sendUserDataOnFB(data);
    }

    @Test(enabled = false, priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginPasswordCredentials(String data){
        login.tapPasswordFieldOnFB();
        login.sendPassDataOnFB(data);
        login.tapLoginButtonOnFB();
        print ("Logged in from Profile screen");
    }

    @Test(enabled = true, priority = 1)
    public void loginUserWOCAndDelete() throws InterruptedException{
        Thread.sleep(2000);
        login.tapAllowButton();
        Thread.sleep(2000);
        login.tapOnAcceptAllCookiesBtn();
        Thread.sleep(2000);
        login.tapAllowButton();
        Thread.sleep(2000);
      //  login.setUSEdition();
      //  Thread.sleep(5000);
        login.tapProfileButton();
        Thread.sleep(5000);
        login.tapFBLoginButton();
        Thread.sleep(8000);
        login.tapContinueBtn();
        print ("Logged in from Profile screen");
    }

    @Test(priority = 1)
    public void signInFstTime() throws InterruptedException{
        Thread.sleep(15000);
        login.tapUserFieldOnFB();
        login.sendUserDataOnFB("shammni@hotmail.com");
        login.tapPasswordFieldOnFB();
        login.sendPassDataOnFB("sanfer12");
        Thread.sleep(5000);
        login.tapLoginButtonOnFB();
        Thread.sleep(5000);
     //   login.tapNotNow();  UNCOMMENT ON FST TIME
     //   Thread.sleep(5000); UNCOMMENT ON FST TIME
     //   login.tapContinueToFBButton(); UNCOMMENT ON FST TIME
    }

    @Test(priority = 2)
    public void testUserName()throws InterruptedException {
        testName("Verify User Name");
        Thread.sleep(5000);
        Assert.assertTrue(login.FBuserNameIsPresent());
        print("Verified User Name is present in the Profile screen");
    }

    @Test(priority = 3)
    public void testDate()throws InterruptedException {
        testName("Verify Date");
        Thread.sleep(3000);
        Assert.assertTrue(login.FBdateIsPresent());
        print("Verified Date is present in the Profile screen");
    }

}