package config.pages.bpage;

import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BpageEmbedsPage extends BpagePage{

    //Catching elements
    private final By igEmbed = By.xpath("//XCUIElementTypeOther[@name=\"Instagram\"]");
    private final By igProfile = AppiumBy.accessibilityId("Instagram");
    private final By ytPlayButton = AppiumBy.accessibilityId("Play");
  //  private final By twPlayButton = By.xpath("//XCUIElementTypeOther[@name=\"Video Attachment\"]");
  private final By twPlayButton = AppiumBy.accessibilityId("Watch now");
    private final By igVideoEmbed = By.xpath("//XCUIElementTypeButton[@name=\"Control\"]");
    private final By watchNowButtonTikTokEmbed = AppiumBy.accessibilityId("Watch now");
    private final By userTikTokEmbed = AppiumBy.accessibilityId("@alexogray");
    private final By tumblrButton = AppiumBy.accessibilityId("Open in");
    private final By tumblrUser = AppiumBy.accessibilityId("yungterra");
    private final By twitterEmbed = AppiumBy.accessibilityId("20 seconds");



    //Methods
    //--IG and YouTube
    public void waitForNative(){
      // WaitersPage.waitForElement(title);
    }

    public Boolean igEmbedIsPresent(){
        return getDriver().findElement(igEmbed).isDisplayed();
    }

    public void tapIGEmbed(){
        getDriver().findElement(igEmbed).click();
        print("Tapped 'IG' embed");
    }

    public Boolean ytPlayButtonIsPresent(){
        return getDriver().findElement(ytPlayButton).isDisplayed();
    }

    //--Twitter
    public Boolean twPlayButtonIsPresent(){
        return getDriver().findElement(twPlayButton).isDisplayed();
    }

    public void tapTWPlayButton(){
        getDriver().findElement(twPlayButton).click();
        print("Tapped 'Play' button on Twitter embed");
    }

    //--IG Video
    public void scrollToIGVideo() {
        int i;
        for(i=0; i<=4; i++) {
            scroll.scrollDown();
        }
        scroll.scrollDown90_30();
        scroll.scrollUntilElement(igVideoEmbed);
    }

    public Boolean igVideoIsPresent(){
        return getDriver().findElement(igVideoEmbed).isDisplayed();
    }

    //--TikTok
    public void scrollToTikTokVideo() {
        int i;
     /*   scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown(); */
        scrollInBpageMultipleTimes(4);
      /*  for(i=0; i<=2; i++) {
            scroll.scrollDown();
            scroll.scrollDown();
          //  scroll.scrollDown();
        }*/
      //  scroll.scrollDown90_80();
     //   scroll.scrollUntilElement(watchNowButtonTikTokEmbed);
    }

    public Boolean tikTokWatchNowButtonIsPresent(){
        return getDriver().findElement(watchNowButtonTikTokEmbed).isDisplayed();
    }

    public void tapOntikTokWatchNowButton(){
         getDriver().findElement(watchNowButtonTikTokEmbed).click();
    }

    public Boolean tikTokUserIsPresent(){
        return getDriver().findElement(userTikTokEmbed).isDisplayed();
    }

    //--Tumblr.
    public Boolean tumblrButtonIsPresent(){
        return getDriver().findElement(tumblrButton).isDisplayed();
    }

    public Boolean tumblrUserIsPresent(){
        return getDriver().findElement(tumblrUser).isDisplayed();
    }

    public void tapTwitterVideo(){getDriver().findElement(twitterEmbed).click();}

    public void tapTumblrButtonEmbed()throws InterruptedException{
        Thread.sleep(3000);
        getDriver().findElement(tumblrButton).click();
        print("Tapped 'Open in tumblr' button");
    }
}
