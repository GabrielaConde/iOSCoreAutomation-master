package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.initPages.BpageInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//4- Continues from NatBpageEmbedsTests3
public class FallBpageTests4 extends BpageInit {

    @Test(priority = 1, dataProvider = "fallbackBpage", dataProviderClass = BpagesDataProvider.class)
    public void testSearchFallbackBpage(String data) throws InterruptedException {
        print("-------------------STARTING TO TEST FALLBACK BPAGE -------------------");
        testName("Search Fallback Bpage");
        fallbackBpage.completeSearch(data);
    }

  //  @Test(priority = 3)
    public void verifyTitleIsPresent()throws InterruptedException {
        testName("Verify title is present on Fallback Bpage");
        Thread.sleep(3000);
        fallbackBpage.fallbackBpageTitleIsPresent();
        print("Verified title is present and correct on Fallback Bpage");
    }

    @Test(priority = 4)
    public void verifySubTitleIsPresent() {
        testName("Verify SubTitle is present on Fallback Bpage");
        Assert.assertTrue(fallbackBpage.isFallbackSubtitleDisplayed().contains("We have built a house of cards to live in, and the pandemic was a wind that just blew the house down"));
        print("Verified SubTitle is present on Fallback Bpage");
    }

    //Author
    @Test(priority = 5)
    public void verifyAuthorInfoIsPresentOnBpage() {
        testName("Verify Author Info is present on Fallback Bpage");
        Assert.assertTrue(fallbackBpage.fallbackAuthorInfoIsPresent());
        print("Verified Author Info is present on Fallback Bpage: " + fallbackBpage.fallbackAuthorInfoIsPresent());
    }



    //Share bpage
    @Test(priority = 10)
    public void verifyShareButtonIsPresent() {
        testName("Verify 'Share' button is present on bpage");
        Assert.assertTrue(fallbackBpage.shareButtonIsPresent());
        print("Verified 'Share' button is present on bpage");

    }

    @Test(priority = 11)
    public void tapShareButtonOnBpage() {
        testName("Verify tapping 'Share' button on Bpage");
        fallbackBpage.tapShare();
        fallbackBpage.tapCloseButton();
        print("Verified tapping 'Share' button is opening the sheet on Bpage");
    }


    //More on this section
    @Test(priority = 14)
    public void verifyMoreOnThisHeaderIsPresent() {
        testName("Verify 'More In This' header is present'");
      //  scroll.scrollUp();
     //   scroll.scrollDown90_85();
     //   scroll.scrollDown90_70();
    /*    scroll.scrollDown80_20();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown(); */
        fallbackBpage.scrollInBpageMultipleTimes(4);

        fallbackBpage.moreOnThisHeaderIsPresent();
        print("Verified 'More On This' header is present");
        }


   @Test(priority = 15)
    public void verifyMoreOnThisBpageIsPresent() {
        testName("Verify bpage from 'More In This' section is present'");
        fallbackBpage.fallbackMoreOnThisBpageIsPresent();
        print("Verified 'More On This' Bpage is present");
    }

    @Test(priority = 16)
    public void verifyMoreOnThisBpage() {
        testName("Verify tapping the first bpage from More On This section is loading");
        String bpageTitle= fallbackBpage.fallbackTitleMoreOnLikeThisBpage();
        print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + bpageTitle + "'");
        fallbackBpage.fallbackTapMoreOnThisBpage();

        Assert.assertEquals(fallbackBpage.bpageTitleIsPresent(), bpageTitle);
        print("Verified Bpage is loading fine. Actual title: " + "\n" + "'" + fallbackBpage.bpageTitleIsPresent() + "'");

        fallbackBpage.tapBackButton();
        fallbackBpage.tapBackButton();

    }


}
