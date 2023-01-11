package testModules.signIn;

import config.InitTest;
import config.dataProvider.LoginCredentialsDataProvider;
import config.pages.signIn.SignInFBPage;
import javafx.animation.ScaleTransition;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInFBTests extends InitTest {
    protected SignInFBPage login;

    @BeforeClass
    public void initProcess() {
        try{
        login = new SignInFBPage();
        } catch (Exception e) {
            System.out.println("ERROR ON INIT");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(enabled = false, dataProvider = "FBuser", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginUserCredentials(String data){
        try{
        login.tapAllowButton();
        login.tapProfileButton();
        login.tapFBLoginButton();
        login.tapContinueToFBButton();
        login.tapUserFieldOnFB();
        login.sendUserDataOnFB(data);
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(enabled = false, priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginPasswordCredentials(String data){
        try{
        login.tapPasswordFieldOnFB();
        login.sendPassDataOnFB(data);
        login.tapLoginButtonOnFB();
        print ("Logged in from Profile screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(enabled = true, priority = 1)
    public void loginUserWOCAndDelete(){
        try{
        login.tapAllowButton();
        login.tapAllowButton();
        login.tapProfileButton();

        login.tapFBLoginButton();
        login.tapContinueBtn();
       // login.tapAllowButton();
      //  login.tapAllowButton();
       // login.tapContinueToFBButton();
        print ("Logged in from Profile screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 1)
    public void signInFstTime() throws InterruptedException{
        try{
        Thread.sleep(2000);
        login.tapUserFieldOnFB();
        login.sendUserDataOnFB("shammni@hotmail.com");
      //  login.sendUserDataOnFB("joellamiss@outlook.es");
        login.tapPasswordFieldOnFB();
        login.sendPassDataOnFB("sanfer12");
        login.tapLoginButtonOnFB();
      //  login.tapContinueToFBButton();

  /*      login.enterEmail("gabmoreau@hotmail.com");
        login.enterPassword("sanfer12");
        login.tapFBLoginButton(); */
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void testUserName() {
        try{
        testName("Verify User Name");
        Assert.assertTrue(login.FBuserNameIsPresent());
        print("Verified User Name is present in the Profile screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 3)
    public void testDate() {
        try{
        testName("Verify Date");
        Assert.assertTrue(login.FBdateIsPresent());
        print("Verified Date is present in the Profile screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    //@Test(priority = 4)
    public void failTest(){
        Assert.assertTrue(false);
    }
}