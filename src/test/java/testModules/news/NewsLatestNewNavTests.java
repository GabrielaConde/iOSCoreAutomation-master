package testModules.news;

import config.initPages.EditionsInit;
import config.pages.settings.SettingsSetupPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewsLatestNewNavTests extends EditionsInit {
    protected SettingsSetupPage disableAdExp;
    protected String testName;

    @BeforeClass
    public void initProcess() {
        disableAdExp = new SettingsSetupPage();
    }

    //Allow Button
  //  @Test
    public void testAllowButton(){
        print("-------------------STARTING LATEST SUB-TAB TESTS-------------------");
        testName = "TEST ALLOW BUTTON";
            // testName("Verify Allow button is present and tap-able");
            Assert.assertTrue(latestSubTab.allowButtonIsPresent());
            print("Verified Allow Notification button");

            latestSubTab.tapAllowButton();
            latestSubTab.tapAllowButton();

    }

  //  @Test(enabled = false, priority = 1)        //if TRUE, uncomment capabilities (Base) & dismiss tooltip (tapSplash())
    public void enableTrendingPackageExp() {
            testName("Enabling Trending Product package experiments");
            SettingsSetupPage enableExp = new SettingsSetupPage();
            enableExp.enableTrendingPackage();
    }

//    @Test(enabled = true, priority = 1)               //if TRUE, uncomment capabilities (Base class)
    public void disableAdExp() {
            testName("Disabling Dynamic Ads on Bpages");
            disableAdExp.disableAdExp();
    }


    @Test(enabled = true, priority = 3)
    public void moveToNewsTab(){
        news.tapNewsTab();
    }

    @Test (priority = 4)
    public void testNewsHeader() {
            testName("Verify the News Header");
            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");
    }

    @Test (priority = 5)
    public void testQCUSection() {
            testName("Verify the Quickly Catch Up section");
            Assert.assertTrue(news.QCUSectionIsPresent());
            print("Verified the the Quickly Catch Up section is present in the News feed");
    }

    @Test (priority = 6)
    public void testBPage() {
            testName("Verify opening the first b-page under the QCU section");
            news.tapFirstCell();
            news.tapBackButton();
            print("Verified the first b-page under the QCU section opens fine");
    }

    @Test (priority = 7)
    public void testScroll() {
            testName("Verify scroll works as expected");
            scroll.scrollDown();
            scroll.scrollUp();
            print("Verified scroll works as expected");
    }

    @Test(priority =8)
    public void tapOnEntertainment()throws InterruptedException{
        news.tapOnEntertainment();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =9)
    public void tapOnCulture()throws InterruptedException{
        news.tapOnCulture();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =10)
    public void tapOnTech()throws InterruptedException{
        news.tapOnTech();
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();

    }

    @Test(priority =11)
    public void tapOnHealth()throws InterruptedException{
        news.tapOnHealth();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =12)
    public void tapOnJPG()throws InterruptedException{
        news.tapOnJPG();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =13)
    public void tapOnMore()throws InterruptedException{
        news.tapOnMore();
    }

    @Test(priority =14)
    public void tapOnInequity()throws InterruptedException{
        news.tapOnInequity();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =14)
    public void tapOnScience()throws InterruptedException{
        news.tapOnScience();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =15)
    public void tapOnPolitics()throws InterruptedException{
        news.tapOnPolitics();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }

  //  @Test(priority =16)
    public void tapOnInvestigations()throws InterruptedException{
        news.tapInvestigationsSubTab();
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        bpage.tapBackButton();
        news.backToMore();
    }

    @Test(priority =17)
    public void tapOnWorld()throws InterruptedException{
        news.tapOnWorld();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }

    @Test(priority =18)
    public void tapOnOpinion()throws InterruptedException{
        news.tapOnOpinion();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
    }


}
