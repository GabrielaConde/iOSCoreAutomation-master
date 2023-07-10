package config.pages.bpage;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BpagePage extends CommonPage {

    //Catching elements
    //--Top elements
    private final By shoppingPackageCTA =  By.xpath("//*[contains(@name,'Find even more')]");
 //   protected final By commentsButton = MobileBy.AccessibilityId("//*[contains(@name,'Comments')]");
    protected final By commentsButton = By.xpath("//*[contains(@name,'Comments')]");
    protected final By categoryDate = By.xpath("//XCUIElementTypeCollectionView[@name='buzz-collectionview']/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]/XCUIElementTypeTextView");
  //  protected final By title = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
    protected final By title = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");


    protected final By titleFallback = By.xpath("//XCUIElementTypeStaticText[@name=\"US Life Expectancy Plunged A Year And A Half In 2020\"]");
//    protected final By titleFallback = By.xpath("//XCUIElementTypeStaticText[@name=\"US Life Expectancy Plunged A Year And A Half In 2020\"]");
    protected final By subTitleFallback = MobileBy.AccessibilityId("We have built a house of cards to live in, and the pandemic was a wind that just blew the house down,” said one expert.");
    protected final By subtitle = MobileBy.AccessibilityId("\"I was proud of myself just to go out there after what I've been through,\" Biles said afterward.");
    protected final By nativeAuthorName = By.xpath("//XCUIElementTypeOther[@name=\"by Ikran Dahir, BuzzFeed News Reporter\"]");
    protected final By fallbackAuthorName = By.xpath("//XCUIElementTypeImage[@name=\"Dan Vergano\"]");
    protected final By fallbackSubTitle = MobileBy.AccessibilityId("“We have built a house of cards to live in, and the pandemic was a wind that just blew the house down,” said one expert.");

    //--Image, Share and internal/external links
    protected final By imagePost = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By image = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By shareButton = MobileBy.AccessibilityId("Share");
    protected final By closeMVButton = By.xpath("//XCUIElementTypeButton[@name='close-button']");
    protected final By nativeInternalLink = By.xpath("//XCUIElementTypeLink[@name='left in the middle of the team final']");
    protected final By nativeExternalLink = By.xpath("//XCUIElementTypeLink[@name='ties']");
    protected final By fallbackInternalLink = By.xpath("//XCUIElementTypeLink[@name='years of smaller drops']");
    protected final By fallbackExternalLink = By.xpath("//XCUIElementTypeLink[@name='CDC data']");
   // protected final By bookmark = By.xpath("//XCUIElementTypeButton[@name=\"Add Bookmark\"]");
   protected final By bookmark = MobileBy.AccessibilityId("Add Bookmark");

    //--Bottom sections
    protected final By moreOnThisHeader = MobileBy.AccessibilityId("MORE ON THIS");
   // protected final By moreOnThisHeader = MobileBy.iOSNsPredicateString("label == \"MORE ON THIS\"");
    protected final By nativeMoreOnThisPost = By.xpath("//*[contains(@name,'Simone Biles')]");
    protected final By fallbackMoreOnThisPost = By.xpath("//XCUIElementTypeOther[@name='complementary']/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeLink");
    protected final By moreLikeThisHeader = MobileBy.AccessibilityId("More Like This");
    protected final By relatedContentHeader = MobileBy.AccessibilityId("Related Topics");
    protected final By relatedContentItem = MobileBy.AccessibilityId("Simone Biles");
    protected final By moreLikeThisPost = By.xpath("//XCUIElementTypeCell[@name=\"More Like This\"]/following::XCUIElementTypeCell[1]");
    protected final By trendingHeader = MobileBy.AccessibilityId("Trending");
    protected final By trendingPost = By.xpath("//XCUIElementTypeCell[@name=\"Trending\"]/following::XCUIElementTypeCell[1]");
    protected final By backButton = By.xpath("//XCUIElementTypeButton[@name=\"BUZZ_BACK_BUTTON\"]");


    //Methods
    //--Top bpage
    public String categoryDateArePresent(){
        String categoryDateInfo = driver.findElement(categoryDate).getAttribute("name");
        return categoryDateInfo;
    }

    public String isFallbackSubtitleDisplayed(){
       return driver.findElement(fallbackSubTitle).getText();
    }

    public void tapOnBookmark(){
        driver.findElement(bookmark).click();
    }

    public Boolean isTitleFallbackDisplayed(){
       return driver.findElement(titleFallback).isDisplayed();
    }

    public void tapOnImage(){
        driver.findElement(imagePost).click();
    }

    public void tapOnBack(){
        driver.findElement(backButton).click();
    }

    public void tapOnCommentsButton(){
        driver.findElement(commentsButton).click();
    }

    public void tapOnBpageTitle() throws InterruptedException{
        try {
            driver.findElement(title).click();
        } catch (Exception e){};
    }

    public String bpageTitleIsPresent(){
        WaitersPage.waitForElement(title);
        String bpageTitle = driver.findElement(title).getText();
        return bpageTitle;
    }

    public String fallbackBpageTitleIsPresent(){
      //  WaitersPage.waitForElement(title);
        String bpageTitle = driver.findElement(titleFallback).getText();
        return bpageTitle;
    }

    public Boolean bpageTitleIdDisplayed(){
        WaitersPage.waitForElement(title);
       return driver.findElement(title).isDisplayed();
    }

    public String subtitleIsPresent(){
        String subtitleName = driver.findElement(subtitle).getAttribute("name");
        return subtitleName;
    }

    //--Author
        //--Native
    public Boolean nativeAuthorInfoIsPresent(){
        return driver.findElement(nativeAuthorName).isDisplayed();
    }

        //--Fallback
    public Boolean fallbackAuthorInfoIsPresent(){
        return driver.findElement(fallbackAuthorName).isDisplayed();
    }

    //--Tap image and share on MV
    public Boolean imageIsPresent(){
        return driver.findElement(image).isDisplayed();
    }

    public void tapImage() {
        driver.findElement(image).click();
        print("Tapped image to go to MV");
    }

    public Boolean shareButtonIsPresent(){
        return driver.findElement(shareButton).isDisplayed();
    }

    public void tapShare() {
        driver.findElement(shareButton).click();
        print("Tapped 'Share' button");
    }

    public void tapCloseMVButton() {
        driver.findElement(closeMVButton).click();
        print("Tapped 'Close' button on Media Viewer");
    }

    //--Internal/External links
        //--Native
    public void tapNativeInternalLink() {
        driver.findElement(nativeInternalLink).click();
        print("Tapped internal link on native bpage");
    }

    public void tapNativeExternalLink() {
        driver.findElement(nativeExternalLink).click();
        print("Tapped external link on native bpage");
    }

        //--Fallback
    public void tapFallbackExternalLink() {
        driver.findElement(fallbackExternalLink).click();
        print("Tapped external link on fallback bpage");
    }

    public void tapFallbackInternalLink() {
        scroll.scrollDown();
        driver.findElement(fallbackInternalLink).click();
        print("Tapped internal link on fallback bpage");
    }

    //--More on this section
        //--Native
    public Boolean moreOnThisHeaderIsPresent(){

        return driver.findElement(moreOnThisHeader).isDisplayed();
    }

    public Boolean nativeMoreOnThisBpageIsPresent(){
        return driver.findElement(nativeMoreOnThisPost).isDisplayed();
    }

    public String nativeTitleMoreOnThisBpage(){
        String moreOnThisBpageTitle= driver.findElement(nativeMoreOnThisPost).getAttribute("name");
        return moreOnThisBpageTitle;
    }

    public void nativeTapMoreOnThisBpage(){
        driver.findElement(nativeMoreOnThisPost).click();
        print("Tapped first post on More On This section");
    }

        //--Fallback
    public void scrollMoreOnThis() {
        int i;
        for(i=0; i<=2; i++) {
            scroll.scrollDown();
        }
        scroll.scrollDown90_20();
        scroll.scrollUntilElement(fallbackMoreOnThisPost);
    //    scroll.scrollUntilElement(moreOnThisHeader);
    }

    public Boolean fallbackMoreOnThisBpageIsPresent(){
        return driver.findElement(fallbackMoreOnThisPost).isDisplayed();
    }

    public String fallbackTitleMoreOnLikeThisBpage(){
        String moreOnThisBpageTitle= driver.findElement(fallbackMoreOnThisPost).getAttribute("name");
        return moreOnThisBpageTitle;
    }

    public void fallbackTapMoreOnThisBpage(){
        driver.findElement(fallbackMoreOnThisPost).click();
        print("Tapped first post on More On This section");
    }

    //--More like this section
    public Boolean moreLikeThisHeaderIsPresent(){
        scroll.scrollUntilElement(moreLikeThisHeader);
        return driver.findElement(moreLikeThisHeader).isDisplayed();
    }
    public Boolean relatedContentHeaderIsPresent(){
        return driver.findElement(relatedContentHeader).isDisplayed();
    }

    public Boolean moreLikeThisBpageIsPresent(){
        scroll.scrollUntilElement(moreLikeThisPost);
        return driver.findElement(moreLikeThisPost).isDisplayed();
    }

    public void tapMoreLikeThisBpage(){
        driver.findElement(moreLikeThisPost).click();
        print("Tapped first post on More On This section");
    }

    public void tapRelatedContentItem(){
        driver.findElement(relatedContentItem).click();
        print("Tapped first post on Related Content section");
    }

    public String nativeTitleMoreLikeThisBpage(){
        String moreOnThisBpageTitle= driver.findElement(moreLikeThisPost).getAttribute("name");
        return moreOnThisBpageTitle;
    }

    //--Trending section
        //--Native
    public void scrollTrendingHeaderNativeBpage() {
        int i;
        for(i=0; i<=3; i++) {
            scroll.scrollDown();
        }
    }

    public Boolean trendingHeaderIsPresent(){
        return driver.findElement(trendingHeader).isDisplayed();
    }

    public Boolean trendingBpageIsPresent(){
        return driver.findElement(trendingPost).isDisplayed();
    }

    public void tapTrendingBpage(){
        driver.findElement(trendingPost).click();
        print("Tapped post on Trending section");
    }

    public String titleTrendingBpage(){
        String trendingBpageTitle= driver.findElement(trendingPost).getAttribute("name");
        return trendingBpageTitle;
    }

        //--Fallback
    public void scrollTrendingHeaderFallbackBpage() {
        int i;
        for(i=0; i<=5; i++) {
            scroll.scrollDown();
        }
    }
}
