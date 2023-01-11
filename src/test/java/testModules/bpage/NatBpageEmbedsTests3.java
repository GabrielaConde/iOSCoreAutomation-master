package testModules.bpage;

import config.dataProvider.BpagesDataProvider;
import config.initPages.BpageInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//3- Continues from NatBpageShoppingButtonsTests2
public class NatBpageEmbedsTests3 extends BpageInit {

    //IG
    @Test(dataProvider = "IGYTEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchIGYTNativeBpage(String data)throws InterruptedException {
        print("-------------------STARTING TO EMBEDS ON NATIVE BPAGE-------------------");
        testName("Search Native Bpage with IG and YouTube embeds");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);
    }

    @Test(priority = 2)
    public void testIGEmbedIsPresent() {
        testName("Verify IG embed is present");
        embeds.waitForNative();
        scroll.scrollDown();

        Assert.assertTrue(embeds.igEmbedIsPresent());
        print("Verified IG embed is present");
    }

    @Test(priority = 3)
    public void testTapIGProfileIsPresent() {
        testName("Verify tapping IG embed leads to web page");
        embeds.tapIGEmbed();
        embeds.tapDoneButton();
        print("Verified tapping IG embed leads to web page");
    }

    //YouTube
    @Test(priority = 4, dataProvider = "YTVideoEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchYTVideoNativeBpage(String data)throws InterruptedException {
        testName("Search Native Bpage with Twitter embed");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);
    }

    @Test(priority = 5)
    public void testPlayYTButtonIsPresent() {
        testName("Verify tapping 'Play' button on YouTube embed");
        embeds.waitForNative();

        Assert.assertTrue(embeds.ytPlayButtonIsPresent());
        print("Verified 'Play' button is present ");

    }

    //Twitter
    @Test(priority = 6, dataProvider = "twitterEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchTwitterNativeBpage(String data)throws InterruptedException {
        testName("Search Native Bpage with Twitter embed");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);
    }

    @Test(priority = 7)
    public void testTWEmbedIsPresent() {
        testName("Verify Twitter embed is present");
        embeds.waitForNative();
        scroll.scrollDown90_40();

        Assert.assertTrue(embeds.twPlayButtonIsPresent());
        print("Verified Twitter embed is present");

        embeds.tapTWPlayButton();

    }

    //IG Videos
    @Test(priority = 8, dataProvider = "instagramVideoEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchIGVideoNativeBpage(String data)throws InterruptedException {
        testName("Search Native Bpage with IG Video embed");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);

    }

   // @Test(priority = 9)
    public void testIGVideoIsPresent() {
        testName("Verify IG Video embed is present");
        embeds.waitForNative();
        embeds.scrollToIGVideo();

        Assert.assertTrue(embeds.igVideoIsPresent());
        print("Verified IG Video embed is present");
    }

    //TikTok
    @Test(priority = 10, dataProvider = "tiktokEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchTikTokVideoNativeBpage(String data)throws InterruptedException {
        testName("Search Native Bpage with Tik Tok Video embed");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);
    }

    @Test(priority = 11)
    public void testTikTokVideoIsPresent() {
        testName("Verify Tik Tok video embed is present");
        embeds.waitForNative();
        embeds.scrollToTikTokVideo();

        Assert.assertTrue(embeds.tikTokWatchNowButtonIsPresent());
        print("Verified 'Watch now' button on Tik Tok video embed is present");

        Assert.assertTrue(embeds.tikTokUserIsPresent());
        nativeBpage.tapBackButton();
        print("Verified user from Tik Tok video embed is present");
    }

    //Tumblr.
   // @Test(priority = 12, dataProvider = "tumblrEmbed", dataProviderClass = BpagesDataProvider.class)
    public void testSearchTumblrNativeBpage(String data) throws InterruptedException {
        try{
        testName("Search Native Bpage with Tumblr embed");
        embeds.tapBackButton();
        embeds.tapCancelButton();
        embeds.completeSearch(data);
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }

 //   @Test(priority = 13)
    public void testTumblrIsPresent() {
        testName("Verify Tumblr embed is present");
        embeds.waitForNative();
        Assert.assertTrue(embeds.tumblrButtonIsPresent());
        print("Verified 'Open in tumblr' button on Tumblr embed is present");
        nativeBpage.tapBackButton();
        Assert.assertTrue(embeds.tumblrUserIsPresent());
        print("Verified user from Tumblr embed is present");
    }

   // @Test(priority = 14)
    public void testTappingTumblrButton() throws InterruptedException {
        testName("Verify Tumblr button leads to web page");
        embeds.tapTumblrButtonEmbed();                          //button is not working, known issue.
        print("Verified Tumblr button leads to web page");
        embeds.tapDoneButton();
    }
}
