package config.pages.bpage;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BpagePage extends CommonPage {

    //Catching elements
    //--Top elements
    private final By shoppingPackageCTA =  By.xpath("//*[contains(@name,'Find even more')]");
 //   protected final By commentsButton = AppiumBy.accessibilityId("//*[contains(@name,'Comments')]");
    protected final By commentsButton = By.xpath("//*[contains(@name,'Comments')]");
    protected final By categoryDate = By.xpath("//XCUIElementTypeCollectionView[@name='buzz-collectionview']/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]/XCUIElementTypeTextView");
  //  protected final By title = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
    protected final By title = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
  //  protected final By title = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")

 //  protected final By pageView = AppiumBy.accessibilityId("BUZZ_PAGE");
   protected final By pageView = AppiumBy.accessibilityId("buzz-collectionview");
   protected final By pageView2 = AppiumBy.accessibilityId("BUZZ_PAGE");

    protected final By titleFallback = By.xpath("//XCUIElementTypeStaticText[@name=\"US Life Expectancy Plunged A Year And A Half In 2020\"]");
//    protected final By titleFallback = By.xpath("//XCUIElementTypeStaticText[@name=\"US Life Expectancy Plunged A Year And A Half In 2020\"]");
    protected final By subTitleFallback = AppiumBy.accessibilityId("We have built a house of cards to live in, and the pandemic was a wind that just blew the house down,” said one expert.");
    protected final By subtitle = AppiumBy.accessibilityId("\"I was proud of myself just to go out there after what I've been through,\" Biles said afterward.");
    protected final By nativeAuthorName = By.xpath("//XCUIElementTypeOther[@name=\"by Ikran Dahir, BuzzFeed News Reporter\"]");
    protected final By fallbackAuthorName = By.xpath("//XCUIElementTypeImage[@name=\"Dan Vergano\"]");
    protected final By fallbackSubTitle = AppiumBy.accessibilityId("“We have built a house of cards to live in, and the pandemic was a wind that just blew the house down,” said one expert.");

    //--Image, Share and internal/external links
    protected final By imagePost = By.xpath("//XCUIElementTypeOther[@name=\"BUZZ_PAGE\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By image = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage");
    protected final By shareButton = AppiumBy.accessibilityId("Share");
    protected final By closeMVButton = By.xpath("//XCUIElementTypeButton[@name='close-button']");
    protected final By nativeInternalLink = By.xpath("//XCUIElementTypeLink[@name='left in the middle of the team final']");
    protected final By nativeExternalLink = By.xpath("//XCUIElementTypeLink[@name='ties']");
    protected final By fallbackInternalLink = By.xpath("//XCUIElementTypeLink[@name='years of smaller drops']");
    protected final By fallbackExternalLink = By.xpath("//XCUIElementTypeLink[@name='CDC data']");
   // protected final By bookmark = By.xpath("//XCUIElementTypeButton[@name=\"Add Bookmark\"]");
   protected final By bookmark = AppiumBy.accessibilityId("Add Bookmark");

    //--Bottom sections
    protected final By moreOnThisHeader = AppiumBy.accessibilityId("MORE ON THIS");
   // protected final By moreOnThisHeader = AppiumBy.iOSNsPredicateString("label == \"MORE ON THIS\"");
    protected final By nativeMoreOnThisPost = By.xpath("//*[contains(@name,'Simone Biles')]");
    protected final By fallbackMoreOnThisPost = By.xpath("//XCUIElementTypeOther[@name='complementary']/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeLink");
    protected final By moreLikeThisHeader = AppiumBy.accessibilityId("More Like This");
    protected final By relatedContentHeader = AppiumBy.accessibilityId("Related Topics");
    protected final By relatedContentItem = AppiumBy.accessibilityId("Simone Biles");
    protected final By moreLikeThisPost = By.xpath("//XCUIElementTypeCell[@name=\"More Like This\"]/following::XCUIElementTypeCell[1]");
    protected final By trendingHeader = AppiumBy.accessibilityId("Trending");
    protected final By trendingPost = By.xpath("//XCUIElementTypeCell[@name=\"Trending\"]/following::XCUIElementTypeCell[1]");
    protected final By backButton = By.xpath("//XCUIElementTypeButton[@name=\"BUZZ_BACK_BUTTON\"]");
    protected final By backButtonShopping = By.xpath("//XCUIElementTypeButton[@name=\"Shopping\"]");
    protected final By backButtonNews = By.xpath("//XCUIElementTypeButton[@name=\"News\"]");
    protected final By backButtonQuizzes = By.xpath("//XCUIElementTypeButton[@name=\"Quizzes\"]");

    public void tapBackButtonShopping(){ getDriver().findElement(backButtonShopping).click();}
    public void tapBackButtonNews(){ getDriver().findElement(backButtonNews).click();}

    public void tapBackButtonQuizzes(){ getDriver().findElement(backButtonQuizzes).click();}


    //Methods
    //--Top bpage
    public String categoryDateArePresent(){
        String categoryDateInfo = getDriver().findElement(categoryDate).getAttribute("name");
        return categoryDateInfo;
    }

    public String isFallbackSubtitleDisplayed(){
       return getDriver().findElement(fallbackSubTitle).getText();
    }

    public void tapOnBookmark(){
        getDriver().findElement(bookmark).click();
    }

    public Boolean isTitleFallbackDisplayed(){
       return getDriver().findElement(titleFallback).isDisplayed();
    }

    public void tapOnImage(){
        getDriver().findElement(imagePost).click();
    }

    public void tapOnBack(){
        getDriver().findElement(backButton).click();
    }

    public void tapOnCommentsButton(){
        getDriver().findElement(commentsButton).click();
    }

    public void tapOnBpageTitle() throws InterruptedException{
        try {
            getDriver().findElement(title).click();
        } catch (Exception e){};
    }

    public void scrollInBpage(){
        scroll.scrollDownPlugin(pageView);
    }

    public void scrollInBpage2(){
        scroll.scrollDownPlugin(pageView2);
    }

    public void scrollInBpageMultipleTimes(int times){
        for(int i=1; i<= times; i++)
        scroll.scrollDownPlugin(pageView);
    }

    public String bpageTitleIsPresent(){
      //  WaitersPage.waitForElement(title);
        String bpageTitle = getDriver().findElement(title).getText();
        return bpageTitle;
    }

    public String fallbackBpageTitleIsPresent(){
      //  WaitersPage.waitForElement(title);
        String bpageTitle = getDriver().findElement(titleFallback).getText();
        return bpageTitle;
    }

    public Boolean bpageTitleIdDisplayed(){
      //  WaitersPage.waitForElement(title);
       return getDriver().findElement(title).isDisplayed();
    }

    public String subtitleIsPresent(){
        String subtitleName = getDriver().findElement(subtitle).getAttribute("name");
        return subtitleName;
    }

    //--Author
        //--Native
    public Boolean nativeAuthorInfoIsPresent(){
        return getDriver().findElement(nativeAuthorName).isDisplayed();
    }

        //--Fallback
    public Boolean fallbackAuthorInfoIsPresent(){
        return getDriver().findElement(fallbackAuthorName).isDisplayed();
    }

    //--Tap image and share on MV
    public Boolean imageIsPresent(){
        return getDriver().findElement(image).isDisplayed();
    }

    public void tapImage() {
        getDriver().findElement(image).click();
        print("Tapped image to go to MV");
    }

    public Boolean shareButtonIsPresent(){
        return getDriver().findElement(shareButton).isDisplayed();
    }

    public void tapShare() {
        getDriver().findElement(shareButton).click();
        print("Tapped 'Share' button");
    }

    public void tapCloseMVButton() {
        getDriver().findElement(closeMVButton).click();
        print("Tapped 'Close' button on Media Viewer");
    }

    //--Internal/External links
        //--Native
    public void tapNativeInternalLink()throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(nativeInternalLink).click();
        print("Tapped internal link on native bpage");
    }

    public void tapNativeExternalLink() {
        getDriver().findElement(nativeExternalLink).click();
        print("Tapped external link on native bpage");
    }

        //--Fallback
    public void tapFallbackExternalLink() {
        getDriver().findElement(fallbackExternalLink).click();
        print("Tapped external link on fallback bpage");
    }

    public void tapFallbackInternalLink() {
        scroll.scrollDown();
        getDriver().findElement(fallbackInternalLink).click();
        print("Tapped internal link on fallback bpage");
    }

    //--More on this section
        //--Native
    public Boolean moreOnThisHeaderIsPresent(){

        return getDriver().findElement(moreOnThisHeader).isDisplayed();
    }

    public Boolean nativeMoreOnThisBpageIsPresent(){
        return getDriver().findElement(nativeMoreOnThisPost).isDisplayed();
    }

    public String nativeTitleMoreOnThisBpage(){
        String moreOnThisBpageTitle= getDriver().findElement(nativeMoreOnThisPost).getAttribute("name");
        return moreOnThisBpageTitle;
    }

    public void nativeTapMoreOnThisBpage(){
        getDriver().findElement(nativeMoreOnThisPost).click();
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
        return getDriver().findElement(fallbackMoreOnThisPost).isDisplayed();
    }

    public String fallbackTitleMoreOnLikeThisBpage(){
        String moreOnThisBpageTitle= getDriver().findElement(fallbackMoreOnThisPost).getAttribute("name");
        return moreOnThisBpageTitle;
    }

    public void fallbackTapMoreOnThisBpage(){
        getDriver().findElement(fallbackMoreOnThisPost).click();
        print("Tapped first post on More On This section");
    }

    //--More like this section
    public Boolean moreLikeThisHeaderIsPresent(){
        scroll.scrollUntilElement(moreLikeThisHeader);
        return getDriver().findElement(moreLikeThisHeader).isDisplayed();
    }
    public Boolean relatedContentHeaderIsPresent(){
        return getDriver().findElement(relatedContentHeader).isDisplayed();
    }

    public Boolean moreLikeThisBpageIsPresent(){
        scroll.scrollUntilElement(moreLikeThisPost);
        return getDriver().findElement(moreLikeThisPost).isDisplayed();
    }

    public void tapMoreLikeThisBpage(){
        getDriver().findElement(moreLikeThisPost).click();
        print("Tapped first post on More On This section");
    }

    public void tapRelatedContentItem(){
        getDriver().findElement(relatedContentItem).click();
        print("Tapped first post on Related Content section");
    }

    public String nativeTitleMoreLikeThisBpage(){
        String moreOnThisBpageTitle= getDriver().findElement(moreLikeThisPost).getAttribute("name");
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
        return getDriver().findElement(trendingHeader).isDisplayed();
    }

    public Boolean trendingBpageIsPresent(){
        return getDriver().findElement(trendingPost).isDisplayed();
    }

    public void tapTrendingBpage(){
        getDriver().findElement(trendingPost).click();
        print("Tapped post on Trending section");
    }

    public String titleTrendingBpage(){
        String trendingBpageTitle= getDriver().findElement(trendingPost).getAttribute("name");
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
