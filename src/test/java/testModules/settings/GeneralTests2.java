package testModules.settings;

import config.InitTest;
import config.pages.settings.GeneralPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//2- Continues from BuzzfeedPlusTests1
public class GeneralTests2 extends InitTest {

    protected GeneralPage general;

    @BeforeClass
    public void initProcess() {
        general = new GeneralPage();
    }

    @Test
    public void testGeneralTitle() {
        testName("Verify the General section's title");
        Assert.assertTrue(general.generalHeaderIsPresent());
        print("Verified General section's title");
    }

    @Test (priority = 1)
    public void testEditionSection() {
        testName("Verify the Edition section");
        Assert.assertTrue(general.editionSectionIsPresent());
        print("Verified the Editions section is present");
    }

    @Test (priority = 2)
    public void testDarkModeSection() {
        testName("Verify the Dark Mode section");
        Assert.assertTrue(general.darkModeSectionIsPresent());
        print("Verified the Dark Mode section is present and Match System is the delected option");

        general.tapDarkModeSection();
    }

    @Test (priority = 3)
    public void testDarkModeheader() {
        testName("Verify the Dark Mode header");
        Assert.assertTrue(general.darkModeHeaderIsPresent());
        print("Verified the Dark Mode Header is present");
    }

    @Test (priority = 4)
    public void testSelectLightMode() {
        testName("Change theme to Light Mode");
        Assert.assertTrue(general.lightModeOptionIsPresent());
        print("Verified the Light Mode option is present");

        general.selectLightMode();
        general.tapSettingsButton();
    }

    @Test (priority = 5)
    public void testLightModeIsSelected() {
        testName("Verify Light Mode is selected");
        Assert.assertTrue(general.lightModeSelectedIsPresent());
        print("Verified the Light Mode option is selected in the General section");
    }

    @Test (priority = 6)
    public void testSelectDarkMode() throws InterruptedException{
        testName("Change theme to Dark Mode");
        general.tapThemeSection();
        general.selectDarkMode();

        Assert.assertTrue(general.darkModeSelectedIsPresent());
        print("Verified the Dark Mode option is selected in the General section");
    }

    @Test (priority = 7)
    public void testSelectMatchSystem() {
        testName("Change theme to Match System");
        general.tapThemeSectionDark();
        general.selectMatchSystem();

        Assert.assertTrue(general.darkModeSectionIsPresent());
        print("Verified the Match System option is selected in the General section");
    }

    @Test (priority = 8)
    public void testPushNotificationSection() {
        testName("Verify the Push Notifications section");
        Assert.assertTrue(general.pushNotificationSectionIsPresent());
        print("Verified Push Notification section is present in General");
    }
}