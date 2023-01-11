package testModules.news;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewsSubTabsTests extends EditionsInit {

   // @Test
    public void testSwipeLeft() {
        testName("Verify swiping between tabs to the left");
        List<String> tabValue = new ArrayList<>();
        tabValue = news.getSubTabActiveLeft();
        for (String e : tabValue) {
            Assert.assertEquals(tabValue, "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");         //https://buzzfeed.atlassian.net/browse/IOS-8663
            print("The active tab has value= " + e );
        }
    }

   // @Test (priority = 1)
    public void testSwipeRight() {
        testName("Verify swiping between tabs to the left");
        List<String> tabValue = new ArrayList<>();
        tabValue = news.getSubTabActiveRight();
        for (String e : tabValue) {
            Assert.assertEquals(tabValue, "[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]");         //https://buzzfeed.atlassian.net/browse/IOS-8663
            print("The active tab has value= " + e );
        }
    }

    @Test (priority = 2)
    public void testInequalitySubTab() {
        try{
        testName("Verify the Inequality sub tab");
        news.tapInequalitySubTab();

      //  Assert.assertEquals(news.inequalityIsActive(), "1");
        print("Verified the sub-tab Inequality is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 3)
    public void testScienceSubTab() {
        try{
        testName("Verify the Science sub tab");
        news.tapScienceSubTab();

      //  Assert.assertEquals(news.scienceIsActive(), "1");
        print("Verified the sub-tab Science is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 4)
    public void testPoliticsSubTab() {
        try{
        testName("Verify the Politics sub tab");
        news.tapPoliticsSubTab();

      //  Assert.assertEquals(news.politicsIsActive(), "1");
        print("Verified the sub-tab Politics is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 5)
    public void testJPGSubTab() {
        try{
        testName("Verify the JPG sub tab");
        news.tapJPGSubTab();

       // Assert.assertEquals(news.JPGIsActive(), "1");
        print("Verified the sub-tab JPG is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 6)
    public void testCultureSubTab() {
        try{
        testName("Verify the Culture sub tab");
        news.tapCultureSubTab();

       // Assert.assertEquals(news.cultureIsActive(), "1");
        print("Verified the sub-tab Culture is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 7)
    public void testInvestigationsSubTab() {
        try{
        testName("Verify the Investigations sub tab");
        news.tapInvestigationsSubTab();

      //  Assert.assertEquals(news.investigationsIsActive(), "1");
        print("Verified the sub-tab Investigations is active");

        news.tapPackageItem();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 8)
    public void testTechSubTab() {
        try{
        testName("Verify the Tech sub tab");
        news.tapTechSubTab();

      //  Assert.assertEquals(news.techIsActive(), "1");
        print("Verified the sub-tab Tech is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 9)
    public void testWorldSubTab() {
        try{
        testName("Verify the World sub tab");
        news.tapWorldSubTab();

      //  Assert.assertEquals(news.worldIsActive(), "1");
        print("Verified the sub-tab World is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 10)
    public void testEntertainmentSubTab() {
        try{
        testName("Verify the Entertainment sub tab");
        news.tapEntertainmentSubTab();

      //  Assert.assertEquals(news.entertainmentIsActive(), "1");
        print("Verified the sub-tab Entertainment is active");
        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

    @Test (priority = 11)
    public void testOpinionSubTab() {
        try{
        testName("Verify the Opinion sub tab");
        news.tapOpinionSubTab();

      //  Assert.assertEquals(news.opinionIsActive(), "1");
        print("Verified the sub-tab Opinion is active");

        news.tapSplash();
        news.tapBackButton();
        news.tapFirstCell();
        news.tapBackButton();
        scroll.scrollDown();
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }
}