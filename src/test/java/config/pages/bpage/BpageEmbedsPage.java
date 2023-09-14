package config.pages.bpage;

import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
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
    private final By igProfile = MobileBy.AccessibilityId("Instagram");
    private final By ytPlayButton = MobileBy.AccessibilityId("Play");
  //  private final By twPlayButton = By.xpath("//XCUIElementTypeOther[@name=\"Video Attachment\"]");
  private final By twPlayButton = MobileBy.AccessibilityId("Watch now");
    private final By igVideoEmbed = By.xpath("//XCUIElementTypeButton[@name=\"Control\"]");
    private final By watchNowButtonTikTokEmbed = MobileBy.AccessibilityId("Watch now");
    private final By userTikTokEmbed = MobileBy.AccessibilityId("@alexogray");
    private final By tumblrButton = MobileBy.AccessibilityId("Open in");
    private final By tumblrUser = MobileBy.AccessibilityId("yungterra");
    private final By twitterEmbed = MobileBy.AccessibilityId("20 seconds");



    //Methods
    //--IG and YouTube
    public void waitForNative(){
        WaitersPage.waitForElement(title);
    }

    public Boolean igEmbedIsPresent(){
        return driver.findElement(igEmbed).isDisplayed();
    }

    public void tapIGEmbed(){
        driver.findElement(igEmbed).click();
        print("Tapped 'IG' embed");
    }

    public Boolean ytPlayButtonIsPresent(){
        return driver.findElement(ytPlayButton).isDisplayed();
    }

    //--Twitter
    public Boolean twPlayButtonIsPresent(){
        return driver.findElement(twPlayButton).isDisplayed();
    }

    public void tapTWPlayButton(){
        driver.findElement(twPlayButton).click();
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
        return driver.findElement(igVideoEmbed).isDisplayed();
    }

    //--TikTok
    public void scrollToTikTokVideo() {
        int i;
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
        scroll.scrollDown();
      /*  for(i=0; i<=2; i++) {
            scroll.scrollDown();
            scroll.scrollDown();
          //  scroll.scrollDown();
        }*/
      //  scroll.scrollDown90_80();
     //   scroll.scrollUntilElement(watchNowButtonTikTokEmbed);
    }

    public Boolean tikTokWatchNowButtonIsPresent(){
        return driver.findElement(watchNowButtonTikTokEmbed).isDisplayed();
    }

    public void tapOntikTokWatchNowButton(){
         driver.findElement(watchNowButtonTikTokEmbed).click();
    }

    public Boolean tikTokUserIsPresent(){
        return driver.findElement(userTikTokEmbed).isDisplayed();
    }

    //--Tumblr.
    public Boolean tumblrButtonIsPresent(){
        return driver.findElement(tumblrButton).isDisplayed();
    }

    public Boolean tumblrUserIsPresent(){
        return driver.findElement(tumblrUser).isDisplayed();
    }

    public void tapTwitterVideo(){driver.findElement(twitterEmbed).click();}

    public void tapTumblrButtonEmbed()throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(tumblrButton).click();
        print("Tapped 'Open in tumblr' button");
    }
}
