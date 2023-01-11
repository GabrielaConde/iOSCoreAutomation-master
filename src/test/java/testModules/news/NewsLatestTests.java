package testModules.news;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsLatestTests extends EditionsInit {

    @Test
    public void testNewsTab() {
        try{
        testName("Verify the News Tab");
        news.tapAllowButton();

        Assert.assertTrue(news.newsTabIsPresent());
        print("Verified the News Tab is present in the nav bar");

        news.tapNewsTab();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 1)
    public void testLatestSubTab() {
        try{
        testName("Verify the Latest subtab");
        Assert.assertEquals(news.latestSubTabIsActive(), "1");
        print("Verified 'Latest' sub-tab is active");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 2)
    public void testNewsHeader() {
        try{
        testName("Verify the News Header");
        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 3)
    public void testQCUSection() {
        try{
        testName("Verify the Quickly Catch Up section");
        Assert.assertTrue(news.QCUSectionIsPresent());
        print("Verified the the Quickly Catch Up section is present in the News feed");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 4)
    public void testBPage() {
        try{
        testName("Verify opening the first b-page under the QCU section");
        news.tapFirstCell();
        news.tapBackButton();
        print("Verified the first b-page under the QCU section opens fine");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 5)
    public void testScroll() {
        try{
        testName("Verify scroll works as expected");
        scroll.scrollDown();
        scroll.scrollUp();
        print("Verified scroll works as expected");
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }


}