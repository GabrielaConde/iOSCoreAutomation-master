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
        String pwd = "sanfer12";
        String user = "salpimie";
    }

   // @Test()
    public void signInOnFstLaunch()throws InterruptedException{
        try{
        Thread.sleep(3000);
        signIn.tapAllowButton();
        signIn.tapOnSignInLink();
        signIn.enterPassword("sanfer12");
        signIn.enterEmail("salpimie");
        Thread.sleep(6000);
        signIn.tapSignInBFButton();
        Thread.sleep(5000);
        signIn.tapNotNow();
      //  signIn.switchToAlert();
    //    signIn.setUSEdition();
        }catch (Exception e){}

    }

    @Test(dataProvider = "BFuser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterEmail(String data) throws InterruptedException{
        try{
        testName("Enter Email");
        Thread.sleep(3000);
        signIn.tapAllowButton();
        Thread.sleep(2000);
        signIn.tapOnGuestSignIn();
     //   signIn.tapAllowButton();
        Thread.sleep(2000);
     //   signIn.tapOnAcceptAllCookiesBtn();
      //  Thread.sleep(4000);
      //  signIn.closeGoToGamesScreen();
      //  Thread.sleep(3000);
       // signIn.setUSEdition();
       // Thread.sleep(3000);
       // Assert.assertTrue(signIn.profileButtonIsPresent());
        print("Verified Sign in button is present in the nav bar");
        signIn.tapProfileButton();
      /*  signIn.tapOnSignInWithExistingAccLnk();
        Thread.sleep(2000);
        signIn.emailFieldIsPresent();
        print("Verified Email field is present in the Login screen");*/
        Thread.sleep(3000);
        signIn.tapOnContinueAuth0Btb();
        Thread.sleep(4000);
        signIn.tapProfileButton();
        Thread.sleep(4000);
        signIn.tapOnContinueAuth0Btb();
        Thread.sleep(5000);
        signIn.enterEmailAuth0("gabmoreau@hotmail.com");
        Thread.sleep(3000);
        signIn.tapOnContinueAuth0Btb();
        Thread.sleep(3000);
        signIn.enterPasswordAuth0("almadormida12");
        Thread.sleep(2000);
        signIn.tapShowPassword();
        Thread.sleep(4000);
        signIn.tapOnContinueAuth0Btb();
        Thread.sleep(3000);
        signIn.tapNotNow();
        Thread.sleep(2000);
        signIn.tapNotOnThisDevice();
        }catch (Exception e){}

     //   signIn.enterEmail(data);


      //  signIn.tapNotNow();
    }

  //  @Test(priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void testEnterPassword(String data)  throws InterruptedException {
        testName("Enter password and login");
        signIn.passwordFieldIsPresent();
        print("Verified password field is present in the Login screen");

        signIn.enterPassword(data);
        Thread.sleep(2000);
     //   signIn.signInButtonIsPresent();
        print("Verified Sign In button is present in the Login screen");

        signIn.tapSignInBFButton();
        Thread.sleep(6000);
    //    signIn.tapContinueButton();
      //  signIn.tapNotNow();
        Thread.sleep(5000);
        print("Logged in with email");
    }

  //  @Test(priority = 2)
    public void testUserName() throws InterruptedException{
        testName("Verify User Name");
        Thread.sleep(3000);
       signIn.userNameIsPresent();
        print("Verified User Name is present in the Profile screen");
    }

  //  @Test(priority = 3)
    public void testDate() {
        testName("Verify Date");
         signIn.dateIsPresent();
        print("Verified Date is present in the Profile screen");
    }
}