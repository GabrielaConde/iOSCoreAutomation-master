package testModules.settings;

import config.InitTest;
import config.pages.settings.LegalPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//4- Continues from CommentBotxTests3
public class LegalTests4 extends InitTest {

    protected LegalPage legal;

    @BeforeClass
    public void initProcess() {
        legal = new LegalPage();
    }

    @Test
    public void testLegalTitle() {
        testName("Verify the Legal section's title");
        scroll.scrollDown80_40();

        Assert.assertTrue(legal.legalSectionTitleIsPresent());
        print("Verified Legal section's title is present");
    }

    @Test(priority = 1)
    public void testPrivacyPolicy() {
        testName("Verify the Buzzfeed Privacy Policy section");
        Assert.assertTrue(legal.privacyPolicyIsPresent());
        print("Verified Buzzfeed Privacy Policy section is present");

        legal.tapPrivacyPolicy();

        Assert.assertTrue(legal.privacyPolicyTitleIsPresent());
        print("Verified the Buzzfeed Privacy Policy opens correctly");

        legal.tapDoneButton();
    }

    @Test(priority = 2)
    public void testUserAgreement() {
        testName("Verify the Buzzfeed User Agreement section");
        Assert.assertTrue(legal.userAgreementIsPresent());
        print("Verified Buzzfeed User Agreement section is present");

        legal.tapUserAgreement();

        Assert.assertTrue(legal.userAgreementTitleIsPresent());
        print("Verified the Buzzfeed User Agreement opens correctly");

        legal.tapDoneButton();
    }

    @Test(priority = 3)
    public void testUserAccountData() {
        testName("Verify the BuzzFeed User Account Data section");
        Assert.assertTrue(legal.userAccountDataIsPresent());
        print("Verified BuzzFeed User Account Data section is present");
    }

    @Test(priority = 4)
    public void testAppleData() {
        testName("Verify the Apple Data & Privacy section");
        Assert.assertTrue(legal.appleDataIsPresent());
        print("Verified Apple Data & Privacy section is present");

        legal.tapAppleData();
        legal.returnToBFApp();
    }

    @Test(priority = 5)
    public void testQuantcastPrivacyPolicy() {
        testName("Verify the Quantcast Privacy Policy section");
        Assert.assertTrue(legal.quantcastPrivacyPolicyIsPresent());
        print("Verified Quantcast Privacy Policy section is present");

        legal.tapQuantcastPrivacyPolicy();

        Assert.assertTrue(legal.quantcastPrivacyPolicyTitleIsPresent());
        print("Verified the Quantcast Privacy Policy opens correctly");

        legal.tapDoneButton();
    }

    @Test(priority = 6)
    public void testQuantcastTracking() {
        testName("Verify the Quantcast Tracking section");
        Assert.assertTrue(legal.quantcastTrackingIsPresent());
        print("Verified Quantcast Tracking section is present");
    }

    @Test(priority = 7)
    public void testNielsen() {
        testName("Verify the Nielsen Ratings section");
        Assert.assertTrue(legal.nielsenRatingsIsPresent());
        print("Verified Nielsen Ratings section is present");

        legal.tapNielsenRatings();

        Assert.assertTrue(legal.aboutNielsenIsPresent());
        print("Verified the Nielsen Ratings opens correctly");

        legal.tapDoneButton();
    }
}
