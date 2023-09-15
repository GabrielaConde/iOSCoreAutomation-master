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
    public void enableTrendingPackageExp()throws InterruptedException {
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
        try{
        news.tapNewsTab();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to News Tab"));
            print("ERROR" + e.getMessage());
        }

    }

    @Test (priority = 4)
    public void testNewsHeader() {
            testName("Verify the News Header");
            try{
            Assert.assertTrue(news.newsHeaderIsPresent());
            print("Verified the Buzzfeed News header in the News feed is present");
            } catch (Exception e) {
                print("ERROR IN THIS TC: " +  testName("Verify the News Header"));
                print("ERROR" + e.getMessage());
            }
    }

    @Test (priority = 5)
    public void testQCUSection() {
            testName("Verify the Quickly Catch Up section");
            try{
            Assert.assertTrue(news.QCUSectionIsPresent());
            print("Verified the the Quickly Catch Up section is present in the News feed");
            } catch (Exception e) {
                print("ERROR IN THIS TC: " +  testName("Verify the Quickly Catch Up section"));
                print("ERROR" + e.getMessage());
            }
    }

    @Test (priority = 6)
    public void testBPage() {
            testName("Verify opening the first b-page under the QCU section");
            try{
            news.tapFirstCell();
            news.tapBackButton();
            print("Verified the first b-page under the QCU section opens fine");
            } catch (Exception e) {
                print("ERROR IN THIS TC: " +  testName("Verify opening the first b-page under the QCU section"));
                print("ERROR" + e.getMessage());
            }
    }

    @Test (priority = 7)
    public void testScroll() {
            testName("Verify scroll works as expected");
            try{
            scroll.scrollDown();
            scroll.scrollUp();
            print("Verified scroll works as expected");
            } catch (Exception e) {
                print("ERROR IN THIS TC: " +  testName("Verify scroll works as expected"));
                print("ERROR" + e.getMessage());
            }
    }

    @Test(priority =8)
    public void tapOnEntertainment()throws InterruptedException{
        try{
        news.tapOnEntertainment();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Entertainment feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =9)
    public void tapOnCulture()throws InterruptedException{
        try{
        news.tapOnCulture();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Culture feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =10)
    public void tapOnTech()throws InterruptedException{
        try{
        news.tapOnTech();
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Tech feed"));
            print("ERROR" + e.getMessage());
        }

    }

    @Test(priority =11)
    public void tapOnHealth()throws InterruptedException{
        try{
        news.tapOnHealth();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Health feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =12)
    public void tapOnJPG()throws InterruptedException{
        try{
        news.tapOnJPG();
        Thread.sleep(2000);
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify JPG feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =13)
    public void tapOnMore()throws InterruptedException{
        try{
        news.tapOnMore();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify tap On More"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =14)
    public void tapOnInequity()throws InterruptedException{
        try{
        news.tapOnInequity();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Inequity feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =14)
    public void tapOnScience()throws InterruptedException{
        try{
        news.tapOnScience();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Science feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =15)
    public void tapOnPolitics()throws InterruptedException{
        try{
        news.tapOnPolitics();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Politics feed"));
            print("ERROR" + e.getMessage());
        }
    }

  //  @Test(priority =16)
    public void tapOnInvestigations()throws InterruptedException{
        try{
        news.tapInvestigationsSubTab();
        news.tapFirstCell();
        bpage.tapOnBpageTitle();
        bpage.tapBackButton();
        news.backToMore();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Investigations feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =17)
    public void tapOnWorld()throws InterruptedException{
        try{
        news.tapOnWorld();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify World feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =18)
    public void tapOnOpinion()throws InterruptedException{
        try{
        news.tapOnOpinion();
        Thread.sleep(2000);
        news.tapFirstCell();
        news.tapBackButton();
        news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Verify Opinion feed"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(priority =19)
    public void testFailed(){
        Assert.assertTrue(false);
    }


}
