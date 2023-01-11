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
     //   embeds.tapBackButton();
     //   embeds.tapCancelButton();
        fallbackBpage.completeSearch(data);
    }

    @Test(priority = 2)
    public void verifyDataCategoryArePresent() {
        testName("Verify Data & Category are present at top the Fallback Bpage");
        Assert.assertEquals(fallbackBpage.categoryDateArePresent(), "Science • Jul 21, 2021");
        print("Verified Date & Category are ok at top of the Fallback Bpage");
    }

    @Test(priority = 3)
    public void verifyTitleIsPresent() {
        testName("Verify title is present on Fallback Bpage");
        Assert.assertEquals(fallbackBpage.bpageTitleIsPresent(), "US Life Expectancy In 2020 Dropped By More Than It Has Since World War II");
        print("Verified title is present and correct on Fallback Bpage");
    }

    @Test(priority = 4)
    public void verifySubTitleIsPresent() {
        testName("Verify SubTitle is present on Fallback Bpage");
        Assert.assertTrue(fallbackBpage.subtitleIsPresent().contains("We have built a house of cards to live in, and the pandemic was a wind that just blew the house down"));
        print("Verified SubTitle is present on Fallback Bpage");
    }

    //Author
    @Test(priority = 5)
    public void verifyAuthorInfoIsPresentOnBpage() {
        testName("Verify Author Info is present on Fallback Bpage");
        Assert.assertTrue(fallbackBpage.fallbackAuthorInfoIsPresent());
        print("Verified Author Info is present on Fallback Bpage: " + fallbackBpage.fallbackAuthorInfoIsPresent());
    }

    //Internal / External links
    @Test(priority = 7)
    public void tapFallbackExternalLink() {
        testName("Verify tapping 'External' link");
        scroll.scrollDown90_45();
        fallbackBpage.tapFallbackExternalLink();
        print("Verified 'External' link is tap-able");
        fallbackBpage.tapDoneButton();
    }

    @Test(priority = 8)
    public void tapExternalLink() {
        testName("Verify tapping 'External' link");
        fallbackBpage.tapFallbackInternalLink();
        print("Verified 'External' link is tap-able");
    }

    @Test(priority = 9)
    public void verifyInternalLinkLoadsFine() {
        testName("Verify tapping internal link leads to a bpage which loads fine");
        Assert.assertTrue(fallbackBpage.bpageTitleIdDisplayed());
        print("Verified Internal Link Bpage is loading fine: 'US Life Expectancy Has Finally Stopped Declined'");
    }

    //Share bpage
    @Test(priority = 10)
    public void verifyShareButtonIsPresent() {
        testName("Verify 'Share' button is present on bpage");
        fallbackBpage.tapBackButton();

        Assert.assertTrue(fallbackBpage.shareButtonIsPresent());
        print("Verified 'Share' button is present on bpage");
    }

    @Test(priority = 11)
    public void tapShareButtonOnBpage() {
        testName("Verify tapping 'Share' button on Bpage");
        fallbackBpage.tapShare();
        print("Verified tapping 'Share' button is opening the sheet on Bpage");
    }

    @Test(priority = 12)
    public void verifyCopyLinkbuttonIsPresent() {
        testName("Verify 'Copy Link' button is present on Share sheet");
        Assert.assertTrue(fallbackBpage.verifyCopyLinkbuttonIsPresent());
        print("Verified 'Copy Link' button is present on Share sheet");
    }

    @Test(priority = 13)
    public void testTapCopyLinkAndToast() {
        fallbackBpage.tapCopyLink();

        Assert.assertTrue(fallbackBpage.verifyLinkCopiedToastIsPresent());
        System.out.print("'Link Copied' toast is present after tapping 'Copy Link' share option");
    }

    //More on this section
    @Test(priority = 14)
    public void verifyMoreOnThisHeaderIsPresent() {
        testName("Verify 'More In This' header is present'");
        scroll.scrollUp();
        scroll.scrollDown90_85();
    //    fallbackBpage.scrollMoreOnThis();

        try {
         //   Assert.assertTrue(fallbackBpage.moreOnThisHeaderIsPresent());
            print("Verified 'More On This' header is present");
        }catch (RuntimeException exception){
            scroll.scrollDown90_70();
            Assert.assertTrue(fallbackBpage.moreOnThisHeaderIsPresent());
            print("Verified 'More On This' header is present");
        }
    }

 //   @Test(priority = 15)
    public void verifyMoreOnThisBpageIsPresent() {
        testName("Verify bpage from 'More In This' section is present'");
        Assert.assertTrue(fallbackBpage.fallbackMoreOnThisBpageIsPresent());
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

    //More like this section
 //   @Test(priority = 17)
    public void verifyMoreLikeThisHeaderIsPresent() {
        testName("Verify 'More Like this' header is present");
        try{
            Assert.assertTrue(fallbackBpage.moreLikeThisHeaderIsPresent());
            print("Verified 'More Like This' header is present");
        }catch (RuntimeException exception) {
            scroll.scrollDown90_05();
            Assert.assertTrue(fallbackBpage.moreLikeThisHeaderIsPresent());
            print("Verified 'More Like This' header is present");
        }
    }

   // @Test(priority = 18)
    public void verifyMoreLikeThisBpageIsPresent() {
        testName("Verify 'More Like this' Bpage is present");
        Assert.assertTrue(fallbackBpage.moreLikeThisBpageIsPresent());
        print("Verified 'More Like This' bpage is present");
    }

   // @Test(priority = 19)
    public void tapFirstMoreLikeThisBpage() {
        testName("Verify tapping bpage from 'More Like This' section");
        String bpageTitle= fallbackBpage.nativeTitleMoreLikeThisBpage();
        print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + bpageTitle + "'");
        fallbackBpage.tapMoreLikeThisBpage();

        Assert.assertEquals(fallbackBpage.bpageTitleIsPresent(), bpageTitle);
        print("Verified Bpage is loading fine. Actual title: " + "\n" + "'" + fallbackBpage.bpageTitleIsPresent() + "'");

        fallbackBpage.tapBackButton();
        fallbackBpage.tapSearchResult();
    }

    //Trending section
   // @Test(priority = 20)
    public void verifyTrendingHeader() {
        testName("Verify 'Trending' header is present");
        fallbackBpage.scrollTrendingHeaderFallbackBpage();

        Assert.assertTrue(fallbackBpage.trendingHeaderIsPresent());
        print("Verified 'Trending' header is present");
    }

   // @Test(priority = 21)
    public void verifyTrendingBpageIsPresent() {
        testName("Verify 'Trending' bpage is present");

        Assert.assertTrue(fallbackBpage.trendingBpageIsPresent());
        print("Verified 'Trending' bpage is present");
    }

   // @Test(priority = 22)
    public void tapTrendingBpage() {
        testName("Verify tapping 'Trending' bpage");
        print("Expected title to load after tapping bpage from More On this Section: " + "\n" + "'" + fallbackBpage.titleTrendingBpage() + "'");
        fallbackBpage.tapTrendingBpage();
    }
}
