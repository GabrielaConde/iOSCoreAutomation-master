package testModules.settings;

import config.InitTest;
import config.pages.settings.LegalPage;
import config.pages.settings.OneTrustPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//4- Continues from CommentBotxTests3
public class LegalTests4 extends InitTest {

    protected LegalPage legal;
    protected OneTrustPage oneTrust;

    @BeforeClass
    public void initProcess() {

        legal = new LegalPage();
        oneTrust = new OneTrustPage();
    }

    @Test
    public void testLegalTitle() {
        testName("Verify the Legal section's title");
        scroll.scrollDown80_40();

        Assert.assertTrue(legal.legalSectionTitleIsPresent());
        print("Verified Legal section's title is present");
    }

    @Test(priority = 1)
    public void testPrivacyPolicy()throws InterruptedException {
        testName("Verify the Buzzfeed Privacy Policy section");
        Assert.assertTrue(legal.privacyPolicyIsPresent());
        print("Verified Buzzfeed Privacy Policy section is present");

      /*  legal.tapPrivacyPolicy();
        Thread.sleep(4000);
        Assert.assertTrue(legal.privacyPolicyTitleIsPresent());
        print("Verified the Buzzfeed Privacy Policy opens correctly");
        Thread.sleep(4000);
        legal.tapDoneButton();
        Thread.sleep(3000);*/
    }

    @Test(priority = 2)
    public void testUserAgreement() throws InterruptedException {
        testName("Verify the Buzzfeed User Agreement section");
        Assert.assertTrue(legal.userAgreementIsPresent());
        print("Verified Buzzfeed User Agreement section is present");
      /*  Thread.sleep(4000);
        legal.tapUserAgreement();

        Assert.assertTrue(legal.userAgreementTitleIsPresent());
        print("Verified the Buzzfeed User Agreement opens correctly");

        legal.tapDoneButton();*/
    }

    @Test(priority = 3)
    public void testUserAccountData()throws InterruptedException {
        testName("Verify the BuzzFeed User Account Data section");
        Thread.sleep(4000);
        Assert.assertTrue(legal.userAccountDataIsPresent());
        print("Verified BuzzFeed User Account Data section is present");
    }

    @Test(priority = 4)
    public void testAppleData()throws InterruptedException {
        testName("Verify the Apple Data & Privacy section");
        Assert.assertTrue(legal.appleDataIsPresent());
        print("Verified Apple Data & Privacy section is present");
        Thread.sleep(4000);
        legal.tapAppleData();
        Thread.sleep(4000);
        legal.returnToBFApp();
    }

  //  @Test(priority = 5)
    public void testQuantcastPrivacyPolicy()throws InterruptedException {
        Thread.sleep(4000);
        testName("Verify the Quantcast Privacy Policy section");
        Assert.assertTrue(legal.quantcastPrivacyPolicyIsPresent());
        print("Verified Quantcast Privacy Policy section is present");

        legal.tapQuantcastPrivacyPolicy();
       Thread.sleep(4000);
        Assert.assertTrue(legal.quantcastPrivacyPolicyTitleIsPresent());
        print("Verified the Quantcast Privacy Policy opens correctly");

        legal.tapDoneButton();
    }

  //  @Test(priority = 6)
    public void testQuantcastTracking() {
        testName("Verify the Quantcast Tracking section");
        Assert.assertTrue(legal.quantcastTrackingIsPresent());
        print("Verified Quantcast Tracking section is present");
    }

 //   @Test(priority = 7)
    public void testNielsen()throws InterruptedException {
        testName("Verify the Nielsen Ratings section");
        Assert.assertTrue(legal.nielsenRatingsIsPresent());
        print("Verified Nielsen Ratings section is present");

      /*  legal.tapNielsenRatings();
      Thread.sleep(3000);
        Assert.assertTrue(legal.aboutNielsenIsPresent());
        print("Verified the Nielsen Ratings opens correctly");

        legal.tapDoneButton();*/
    }

    @Test(priority = 8)
    public void testAdvManagementConsent(){
        testName("Verify Management Consent");
        Assert.assertTrue(legal.manageAdvConsentIsPresent());
        legal.tapOnManageAdvConsentIsPresent();
        print("Verified Management Consent is present");
    }

    @Test(priority = 9)
    public void validateOTItems()throws InterruptedException{
        Thread.sleep(3000);
        testName("Verify OneTrust Main Screen elements");
        Assert.assertTrue(oneTrust.isPCTitleDisplayed());
        print("Verified 'About Your Privacy' title is present");
        Assert.assertTrue(oneTrust.isPCTitleDisplayed());
        print("Verified 'We Process Your Data' text is present");
        Assert.assertTrue(oneTrust.isAllowAllBtnDisplayed());
        print("Verified 'Allow All' button present");
        Assert.assertTrue(oneTrust.isRejectAllBtnSettingsDisplayed());
        print("Verified 'Reject All' button present");
        Assert.assertTrue(oneTrust.isManageServicesDisplayed());
        print("Verified 'Manage Services' item present");
        Assert.assertTrue(oneTrust.isVendorsListDisplayed());
        print("Verified 'Vendors List' item present");
        Assert.assertTrue(oneTrust.isSDKListDisplayed());
        print("Verified 'SDK List' item present");
        scroll.scrollDown();
        Assert.assertTrue(oneTrust.isConfirmMyChoicesDisplayed());
        print("Verified 'Confirm My Choices' item present");
     //   legal.tapDoneButton();
    }



    @Test(priority = 10)
    public void validateVendorsListDisplay()throws InterruptedException{
        Thread.sleep(3000);
        testName("Verify Vendors List Displays");
        oneTrust.clickVendorsList();
        Thread.sleep(3000);
        oneTrust.tapBackButton();
    }

    @Test(priority = 11)
    public void validateSDKListDisplay()throws InterruptedException{
        Thread.sleep(3000);
        testName("Verify SDK  List Displays");
        oneTrust.clickSDKList();
        Thread.sleep(3000);
        oneTrust.tapBackButton();
        Thread.sleep(5000);
        oneTrust.tapOnConfirmMyChoices();
        print("Tapped on 'Confirm My Choices' button");
    }



}
