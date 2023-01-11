package testModules.settings;

import config.InitTest;
import config.pages.settings.BuzzfeedPlusPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//1
public class BuzzfeedPlusTests1 extends InitTest {

    protected BuzzfeedPlusPage buzzfeed;

    @BeforeClass
    public void initProcess() {
        buzzfeed = new BuzzfeedPlusPage();
    }

    @Test
    public void testSettingsButton() {
        try{
        testName("Verify the Settings button");
        buzzfeed.tapAllowButton();

        Assert.assertTrue(buzzfeed.settingsButtonIsPresent());
        print("Verified Settings button is present");

        buzzfeed.tapSettingsButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 1)
    public void testSettingsHeader() {
        try{
        testName("Verify the Settings header");
        Assert.assertTrue(buzzfeed.settingsHeaderIsPresent());
        print("Verified Settings header is present in the settings screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void testBuzzfeedPlusTitle() {
        try{
        testName("Verify the Buzzfeed+ section header");
        Assert.assertTrue(buzzfeed.buzzfeedPlusTitleIsPresent());
        print("Verified Buzzfeed+ section header is present in the settings screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 3)
    public void testSubscribeSection() {
        try{
        testName("Verify the subscribe to Buzzfeed+ section");
        Assert.assertTrue(buzzfeed.subscribeSectionIsPresent());
        print("Verified the subscribe to Buzzfeed+ section is present in the settings screen");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 4)
    public void testAppIconSection() {
        try{
        testName("Verify the App Icon section");

        Assert.assertTrue(buzzfeed.appIconIsPresent());
        print("Verified the App Icon section is present in the modal");

        buzzfeed.tapAppIconSection();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 5)
    public void testAppIconHeader() {
        try{
        testName("Verify the App Icon header");
        Assert.assertTrue(buzzfeed.appIconIsPresent());
        print("Verified the App Icon header is present in the modal");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 6)
    public void testDefaultIcon() {
        try{
        testName("Verify the default icon is selected");
        Assert.assertTrue(buzzfeed.defaultIconIsPresent());
        print("Verified Default Icon is present");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 7)
    public void testChangeIcon() {
        try{
        testName("Change the app icon");
        buzzfeed.selectPrideIcon();

        Assert.assertTrue(buzzfeed.changeIconConfirmationIsPresent());
        print("Verified the icon confirmation modal is displayed");

        buzzfeed.tapOKButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 8)
    public void testPrideIcon() {
        try{
        testName("Verify the Pride icon");
        Assert.assertTrue(buzzfeed.prideIconIsPresent());
        print("Verified the Pride icon is selected");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 9)
    public void testChangeBackIcon() {
        try{
        testName("Change back to the default icon");
        buzzfeed.selectDefaultIcon();

        Assert.assertTrue(buzzfeed.changeIconConfirmationIsPresent());
        print("Verified the icon confirmation modal is displayed");

        buzzfeed.tapOKButton();
        buzzfeed.tapSettingsButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 10)
    public void testMutedWordsSection() {
        try{
        testName("Verify the Muted Words section");
        Assert.assertTrue(buzzfeed.mutedWordsIsPresent());
        print("Verified the Muted Words section is present");

        buzzfeed.tapMutedWords();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 11)
    public void testMutedWordsHeader() {
        try{
        testName("Verify the Muted Words Header");
        Assert.assertTrue(buzzfeed.mutedWordsIsPresent());
        print("Verified the Muted Words Header is present");

        buzzfeed.tapSettingsButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test(priority = 12)
    public void testAdFreeSection() {
        testName("Verify the Ad-Free section");
        Assert.assertTrue(buzzfeed.adFreeSectionIsPresent());
        print("Verified the Ad-Free section is present");

        buzzfeed.tapAdFreeSection();
    }

    @Test(priority = 13)
    public void testAdFreeModal() {
        testName("Verify the Ad-Free modal");
        Assert.assertTrue(buzzfeed.adFreeTextIsPresent());
        print("Verified the Ad-Free modal");

        buzzfeed.tapOKButton();
    }

    @Test(priority = 14)
    public void testCustomizableTabsSection() {
        testName("Verify the Customizable Tabs section");
        Assert.assertTrue(buzzfeed.customizableTabsSectionIsPresent());
        print("Verified the Customizable Tabs section is present");

        buzzfeed.tapCustomizableTabsSection();
    }

    @Test(priority = 15)
    public void testCustomizableTabsModal() {
        testName("Verify the Customizable Tabs modal");
        Assert.assertTrue(buzzfeed.customizableTabsTextIsPresent());
        print("Verified the Customizable Tabs modal");

        buzzfeed.tapOKButton();
    }
}