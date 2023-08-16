package testModules.settings;

import config.InitTest;
import config.pages.settings.BuzzfeedPlusPage;
import config.pages.settings.OneTrustPage;
import org.omg.IOP.TAG_JAVA_CODEBASE;
import org.springframework.ui.context.Theme;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1
public class BuzzfeedPlusTests1 extends InitTest {

    protected BuzzfeedPlusPage buzzfeed;
    protected OneTrustPage oneTrust;

    @BeforeClass
    public void initProcess() {
        buzzfeed = new BuzzfeedPlusPage();
        oneTrust = new OneTrustPage();
    }

    @Test
    public void testSettingsButton()throws InterruptedException {
        Thread.sleep(35000);
        testName("Verify the Settings button");
        buzzfeed.tapAllowButton();
        Thread.sleep(25000);
        buzzfeed.tapAllowButton();
        Thread.sleep(25000);
    }

    @Test(priority = 1)
    private void validateOTElements()throws InterruptedException{
       oneTrust.isBuzzFeedLogoDisplayed();
       print("Validate BuzzFeed Logo is displayed");
       oneTrust.isWeCareAboutYourPrivacyDisplayed();
        print("Validate We care about your privacy title is displayed");
       oneTrust.isWeAndOurPartnersStoreyDisplayed();
        print("Validate we and our partners description displays");
       oneTrust.isWeAndOurPartnersSProcessDataDisplayed();
        print("Validate We and our partners process data title is displayed");
       oneTrust.clickOnListOfVendors();
       Thread.sleep(2000);
       oneTrust.tapBackButton();
       oneTrust.clickOnShowPurposes();
       oneTrust.tapOnConfirmMyChoices();
    }

    @Test(priority = 2)
    private void acceptOT()throws InterruptedException{
        buzzfeed.tapProfileButton();
        Thread.sleep(4000);
        buzzfeed.tapSettingsButton();
    }


    @Test(priority = 3)
    public void testSettingsHeader() {
        testName("Verify the Settings header");
        Assert.assertTrue(buzzfeed.settingsHeaderIsPresent());
        print("Verified Settings header is present in the settings screen");
    }

    @Test(priority = 4)
    public void testBuzzfeedPlusTitle() {
        testName("Verify the Buzzfeed+ section header");
        Assert.assertTrue(buzzfeed.buzzfeedPlusTitleIsPresent());
        print("Verified Buzzfeed+ section header is present in the settings screen");
    }

    @Test(priority = 5)
    public void testSubscribeSection() {
        testName("Verify the subscribe to Buzzfeed+ section");
        Assert.assertTrue(buzzfeed.subscribeSectionIsPresent());
        print("Verified the subscribe to Buzzfeed+ section is present in the settings screen");
    }

    @Test(priority = 6)
    public void testAppIconSection() {
        testName("Verify the App Icon section");

        Assert.assertTrue(buzzfeed.appIconIsPresent());
        print("Verified the App Icon section is present in the modal");

        buzzfeed.tapAppIconSection();
    }

    @Test(priority = 7)
    public void testAppIconHeader() {
        testName("Verify the App Icon header");
        Assert.assertTrue(buzzfeed.appIconIsPresent());
        print("Verified the App Icon header is present in the modal");
    }

    @Test(priority = 8)
    public void testDefaultIcon() {
        testName("Verify the default icon is selected");
        Assert.assertTrue(buzzfeed.defaultIconIsPresent());
        print("Verified Default Icon is present");
    }

    @Test(priority = 9)
    public void testChangeIcon() {
        testName("Change the app icon");
        buzzfeed.selectPrideIcon();

        Assert.assertTrue(buzzfeed.changeIconConfirmationIsPresent());
        print("Verified the icon confirmation modal is displayed");

        buzzfeed.tapOKButton();
    }

    @Test(priority = 10)
    public void testPrideIcon() {
        testName("Verify the Pride icon");
        Assert.assertTrue(buzzfeed.prideIconIsPresent());
        print("Verified the Pride icon is selected");
    }

    @Test(priority = 11)
    public void testChangeBackIcon() {
        testName("Change back to the default icon");
        buzzfeed.selectDefaultIcon();

        Assert.assertTrue(buzzfeed.changeIconConfirmationIsPresent());
        print("Verified the icon confirmation modal is displayed");

        buzzfeed.tapOKButton();
        buzzfeed.tapSettingsButton();
    }

    @Test(priority = 12)
    public void testMutedWordsSection() {
        testName("Verify the Muted Words section");
        Assert.assertTrue(buzzfeed.mutedWordsIsPresent());
        print("Verified the Muted Words section is present");
        buzzfeed.tapMutedWords();
    }

    @Test(priority = 13)
    public void testMutedWordsHeader() {
        testName("Verify the Muted Words Header");
        Assert.assertTrue(buzzfeed.mutedWordsIsPresent());
        print("Verified the Muted Words Header is present");
        buzzfeed.tapSettingsButton();
    }

    @Test(priority = 14)
    public void testAdFreeSection() {
        testName("Verify the Ad-Free section");
        Assert.assertTrue(buzzfeed.adFreeSectionIsPresent());
        print("Verified the Ad-Free section is present");

        buzzfeed.tapAdFreeSection();
    }

    @Test(priority = 15)
    public void testAdFreeModal() {
        testName("Verify the Ad-Free modal");
        Assert.assertTrue(buzzfeed.adFreeTextIsPresent());
        print("Verified the Ad-Free modal");

        buzzfeed.tapOKButton();
    }

    @Test(priority = 16)
    public void testCustomizableTabsSection() {
        testName("Verify the Customizable Tabs section");
        Assert.assertTrue(buzzfeed.customizableTabsSectionIsPresent());
        print("Verified the Customizable Tabs section is present");

        buzzfeed.tapCustomizableTabsSection();
    }

    @Test(priority = 17)
    public void testCustomizableTabsModal() {
        testName("Verify the Customizable Tabs modal");
        Assert.assertTrue(buzzfeed.customizableTabsTextIsPresent());
        print("Verified the Customizable Tabs modal");

        buzzfeed.tapOKButton();
    }
}