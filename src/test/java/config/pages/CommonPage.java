package config.pages;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class CommonPage extends Base {

    protected ScrollsPage scroll = new ScrollsPage();

    //Catching Elements
    //--Allow button & Navigation
    protected final By agreeFirstLaunch = MobileBy.AccessibilityId("AGREE");
    //protected final By suscribeBtn = By.xpath("//*[contains(@name,'Close')");
    protected final By suscribeBtn = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])[2]");
    //protected final By suscribeBtn = By.xpath("/XCUIElementTypeButton[@name='Close']");
    protected final By allowTrackButton = By.xpath("/XCUIElementTypeButton[@name='Allow']");
    protected final By continueAds = MobileBy.AccessibilityId("Continue");
    protected final By allowButton = MobileBy.AccessibilityId("Allow");
    //protected final By backButton = By.xpath("//*[contains(@name,'Home')");
    protected final By backButton = MobileBy.AccessibilityId("Back");
    protected final By closeButton = MobileBy.AccessibilityId("Close");
    protected final By backButtonFromSearch = MobileBy.AccessibilityId("Back");

    //protected final By backButton = By.xpath("//XCUIElementTypeButton[@name=\"Home\"]");
    //protected final By backButton = By.xpath("//XCUIElementTypeButton[@name='BUZZ_BACK_BUTTON']");

    protected final By backToTrending = MobileBy.AccessibilityId("Trending");
    protected final By backToCoronavirus = MobileBy.AccessibilityId("Coronavirus");
    protected final By backToFood = MobileBy.AccessibilityId("Food");
    protected final By backToVideos = MobileBy.AccessibilityId("Videos");
    protected final By backToShows = MobileBy.AccessibilityId("Shows");
    protected final By backToAnimals = MobileBy.AccessibilityId("Animals");
    protected final By backToBooks = MobileBy.AccessibilityId("Books");
    protected final By backToCommunity = MobileBy.AccessibilityId("Community");
    protected final By backToHealth = MobileBy.AccessibilityId("Health");
    protected final By backToLGBTQ = MobileBy.AccessibilityId("LGBTQ");
    protected final By backToMusic = MobileBy.AccessibilityId("Music");
    protected final By backToNifty = MobileBy.AccessibilityId("Nifty");
    protected final By backToParents = MobileBy.AccessibilityId("Parents");
    protected final By backToRewind = MobileBy.AccessibilityId("Rewind");
    protected final By backToStyle = MobileBy.AccessibilityId("Style");
    protected final By backToTravel = MobileBy.AccessibilityId("Travel");
    protected final By backToFeed = MobileBy.AccessibilityId("Back");

    //protected final By closeButton = MobileBy.AccessibilityId("Close");
    protected final By doneButton = MobileBy.AccessibilityId("Done");
    //protected final By cancelButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    protected final By cancelButton = MobileBy.AccessibilityId("Cancel");
    protected final By OKButton = MobileBy.AccessibilityId("OK");

    //--Tabs
    protected final By homeTab = MobileBy.AccessibilityId("home");
    protected final By quizzesTab = MobileBy.AccessibilityId("quizzes");
    protected final By newsTab = By.id("news");
    protected final By shoppingTab = MobileBy.AccessibilityId("shoppingPlus");

    //--Subtabs
    protected final By buzzFeedLogo = MobileBy.AccessibilityId("Home");
    protected final By subtabs = By.xpath("//XCUIElementTypeApplication[@name='BuzzFeed 🐞']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeButton");
    protected final By latestSubTab = By.id("Latest");
    protected final By trendingSubTab = MobileBy.AccessibilityId("Trending");
    protected final By videosSubTab = MobileBy.AccessibilityId("Videos");

    //--Feeds
    protected final By splashCellNewNav = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    //protected final By splashCellNewNav = By.xpath("//*[contains(@name,'splash_cell,')]");
    //protected final By splashCellNewNav = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]");
    protected final By fstCellNewNav = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    protected final By splashCell = By.id("splash_cell");
    protected final By firstCell = By.xpath(("(//XCUIElementTypeCell[@name='buffet_grid_cell'])[1]/XCUIElementTypeOther[2]"));
    protected final By firstCellTrending = By.id("simple_feed_item_cell");
    protected final By firstVideo = By.id("simple_video_item_cell");
    protected final By itemsPackage = By.id("SimplePackageCard");

    //--Shopping tab
    protected final By shoppingHeader = MobileBy.AccessibilityId("Shopping");
    protected final By trendingProductsTitle = MobileBy.AccessibilityId("Trending Products");
    protected final By latestGiftGuides = MobileBy.AccessibilityId("Latest Gift Guides");

    //--Quizzes tab
    protected final By quizzesHeader = By.id("Quizzes");

    //--Tooltip on Home & Bpage
    protected final By dismissTooltip = By.xpath("//XCUIElementTypeApplication[@name='BuzzFeed \uD83D\uDC1E']/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton");

    //--News Tag /Latest sub-tab
    protected final By QCUSection = By.xpath("//*[contains(@name,'Quickly Catch Up.')]");

    //--Bpages & Quizzes
    protected final By copyLink = By.xpath("//XCUIElementTypeButton[@name=\"Copy Link\"]");
    //protected final By copyLink = MobileBy.AccessibilityId("Copy Link");

    //protected final By copyLinkToastView = By.id("BFKitToastView");
    protected final By copyLinkToastView = MobileBy.AccessibilityId("Link Copied");

    protected final By copyLinkToastText = By.id("BFKitToastLabel");

    //--Profile
    protected final By profileButton = MobileBy.AccessibilityId("Profile");

    //--Sign in email
    protected final By emailField = MobileBy.iOSNsPredicateString("value == \"Username or Email\"");
    protected final By passwordField = MobileBy.iOSNsPredicateString("value == \"Password\"");
    protected final By signInButton = MobileBy.AccessibilityId("Sign in");

    //--Search
    protected final By searchTab = By.id("search");
    protected final By searchField = By.xpath("//XCUIElementTypeSearchField[@name='Search BuzzFeed']");
    protected final By searchResult = By.id("buffet_grid_cell");
    protected final By suggestedSearchesTitle = MobileBy.AccessibilityId("Suggested Searches");

    //--Settings
    protected final By settingsButton = MobileBy.AccessibilityId("Settings");

    //--Go back to the app
    protected final By openBFAppButton = MobileBy.AccessibilityId("Open");

    //--footers
    protected final By searchIcon = MobileBy.AccessibilityId("search");

    public void backtoTrending() {driver.findElement(backToTrending).click();}
    public void backtoFood() {driver.findElement(backToFood).click();}
    public void backtoCoronavirus() {driver.findElement(backToCoronavirus).click();}
    public void backtoBooks() {driver.findElement(backToBooks).click();}
    public void  backToVideos() {driver.findElement(backToVideos).click();}
    public void backToShows() {driver.findElement(backToShows).click();}
    public void backToAnimals() {driver.findElement(backToVideos).click();}
    public void backtoCommunity() {driver.findElement(backToCommunity).click();}
    public void backtoHealth() {driver.findElement(backToHealth).click();}
    public void backtoLGBTQ() {driver.findElement(backToLGBTQ).click();}
    public void backToMusic() {driver.findElement(backToMusic).click();}
    public void backToNifty() {driver.findElement(backToNifty).click();}
    public void backtoParents() {driver.findElement(backToParents).click();}
    public void backtoRewind() {driver.findElement(backToRewind).click();}
    public void BackToStyle() {driver.findElement(backToStyle).click();}
    public void backtoTravel() {driver.findElement(backToTravel).click();}
    public void backtoFeed(){driver.findElement(backToFeed).click();}


    //Methods
    //--ContinueAds + Allow button + Navigation
    public void tapContinueButton() {
        driver.findElement(continueAds).click();
        print("Tapped 'Continue' button on Ads prompt");
    }

    public void tapOnSuscribeBtn()throws InterruptedException{
        WaitersPage.waitForElement(suscribeBtn);
        Thread.sleep(3000);
        driver.findElement(suscribeBtn).click();
    }

    //NEW NAV
    public Boolean splashCellNewNavIsPresent() {
        return driver.findElement(splashCellNewNav).isDisplayed();
    }

    public void tapSplashNewNav(){
        driver.findElement(splashCellNewNav).click();
    }

    public void tapFstCellNewNav(){
        driver.findElement(fstCellNewNav).click();
    }

    public void tapOnSearchIcon(){
        driver.findElement(searchIcon).click();
    }

    public void tapAgreeFirstLaunch(){
        driver.findElement(agreeFirstLaunch).click();
    }

    public void tapAllowButton() {
        try {
            driver.findElement(allowButton).click();
            print("Tapped Allow Button");
        }catch (Exception e)
        {}
    }

    public void tapAllowTrackButton() {
        driver.findElement(allowTrackButton).click();
        print("Tapped Allow Track Button");
    }

    public void tapBackButtonFromSearch() {
        try {
            WaitersPage.waitForElement(backButtonFromSearch);
            driver.findElement(backButtonFromSearch).click();
            print("Tapped Back button");
        }catch (Exception e){}
    }

    public void tapBackButton() {
        WaitersPage.waitForElement(backButton);
        driver.findElement(backButton).click();
        print("Tapped Back button");
    }

    public void scrollHoriz(int x1, int y1, int x2, int y2) {
        TouchAction action = new TouchAction(driver);
        action.press(point(x1, y1)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x2, y2)).release().perform();
    }

    public void tapCloseButton() {
        WaitersPage.waitForElement(closeButton);
        driver.findElement(closeButton).click();
        print("Tapped the Close button");
    }

    public void tapDoneButton() {
        driver.findElement(doneButton).click();
        print("Tapped 'Done' button");
    }

    public boolean cancelButtonIsPresent() {
        return driver.findElement(cancelButton).isDisplayed();
    }

    public void tapCancelButton() {
        driver.findElement(cancelButton).click();
        print("Tapped Cancel button");
    }

    public void tapOKButton() {
        driver.findElement(OKButton).click();
        print("Tapped the OK button");
    }

    public void tapSettingsButton() {
        driver.findElement(settingsButton).click();
        print("Tapped Settings button");
    }

    //--Tabs - Bottom Navigation Bar
    public void tapHomeTab() {
        driver.findElement(homeTab).click();
        print("Tapped Home tab");
    }

    public void tapQuizzesTab() {
        driver.findElement(quizzesTab).click();
        print("Tapped 'Quizzes' tab");
    }

    public boolean quizzesHeaderIsPresent(){
        return driver.findElement(quizzesHeader).isDisplayed();
    }

    public void tapNewsTab() {
        driver.findElement(newsTab).click();
        print("Tapped 'Quizzes' tab");
    }

    public void tapShoppingTab() {
        driver.findElement(shoppingTab).click();
        print("Tapped 'Quizzes' tab");
    }

    public boolean shoppingHeaderIsPresent() {
        return driver.findElement(shoppingHeader).isDisplayed();
    }

    //--Sub-tabs
    public boolean buzzfeedLogoIsPresent(){
        WaitersPage.waitForElement(buzzFeedLogo);
        return driver.findElement(buzzFeedLogo).isDisplayed();
    }

    public Boolean latestSubTabIsPresent(){
        return driver.findElement(latestSubTab).isDisplayed();
    }

    public String latestSubTabIsActive(){
        return driver.findElement(latestSubTab).getAttribute("value");
    }

    public Boolean trendingSubTabIsPresent(){
        return driver.findElement(trendingSubTab).isDisplayed();
    }

    public void tapTrendingSubTab() {
        driver.findElement(trendingSubTab).click();
        print("Tapped the Trending sub-ab");
    }

    public String trendingSubTabIsActive(){
        return driver.findElement(trendingSubTab).getAttribute("value");
    }

    public Boolean videosSubTabIsPresent() {
        return driver.findElement(videosSubTab).isDisplayed();
    }

    public String videosSubTabIsActive(){
        String value = driver.findElement(videosSubTab).getAttribute("value");
        return value;
    }

    //--News tab / Latest tab
    public boolean QCUSectionIsPresent() {
        return driver.findElement(QCUSection).isDisplayed();
    }

    //--Feeds
    //--Splash
    public Boolean splashCellIsPresent() {
        WaitersPage.waitForElement(splashCell);
        return driver.findElement(splashCell).isDisplayed();
    }

    public void visitSplashAndReturn(){
        tapSplash();
        tapBackButton();
    }

    public void tapSplash() {
        WaitersPage.waitForElement(splashCell);
        driver.findElement(splashCell).click();
        //print("Tapped Splash on feed");
    }

    //--First Cell on Trending
    public Boolean firstCellOnTrendingIsPresent() {
        return driver.findElement(firstCellTrending).isDisplayed();
    }

    public void tapFirstCellOnTrending() {
        driver.findElement(firstCellTrending).click();
        print("Tapped first Bpage under Splash on Trending feed");
    }

    //--First cell on general tabs
    public Boolean fistCellIsPresent() {
        return driver.findElement(firstCell).isDisplayed();
    }

    public void tapFirstCell() {
        driver.findElement(firstCell).click();
        print("Tapped first Bpage under Splash on Feed");
    }

    //--First Video
    public void tapFirstVideo() {
        driver.findElement(firstVideo).click();
        print("Tapped first video on Video feed");
    }

    public void tapPackageItem() {
        driver.findElement(itemsPackage).click();
        print("Tapped an item from the Package");
    }

    //--Trending Products Title
    public boolean trendingProductsTitleIsPresent() {
        return driver.findElement(trendingProductsTitle).isDisplayed();
    }

    //--Dismiss tooltip on Home & Bpages
    public void dismissTooltip() {
        driver.findElement(dismissTooltip).click();
    }

    //--Bpages & Quizzes
    public boolean verifyCopyLinkbuttonIsPresent(){
        return driver.findElement(copyLink).isDisplayed();
    }

    public void tapCopyLink(){
        driver.findElement(copyLink).click();
        print("Tapped 'Copy Link'");
    }

    public boolean verifyLinkCopiedToastIsPresent(){
        WaitersPage.waitForElement(copyLinkToastView);
        return driver.findElement(copyLinkToastView).isDisplayed();
    }

    public boolean verifyLinkCopiedToastTextIsPresent(){
        WaitersPage.waitForElement(copyLinkToastText);
        return driver.findElement(copyLinkToastText).isDisplayed();
    }

    //--Profile
    public void tapProfileButton() {
        driver.findElement(profileButton).click();
        print("Tapped profile button");
    }

    //--Sign in email
    public void enterEmail(String userData) {
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(userData);
        print("Entered email");
    }

    public void enterPassword(String passData) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(passData);
        print("Entered password");
    }

    public void tapSignInButton() {
        driver.findElement(signInButton).click();
        print("Tapped Sign in button in Login screen");
    }

    //--Search
    public void tapSearchTab() {
        driver.findElement(searchTab).click();
        print("Tapped 'Search' tab");
    }

    public void tapSearchField() {
        driver.findElement(searchField).click();
        driver.findElement(searchField).clear();
        print("Tapped on search field");
    }

    public void sendSearchString(String searchTerm) {
        driver.findElement(searchField).sendKeys(searchTerm);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        print("SearchTerm+Enter");
    }

    public void tapSearchResult() {
        driver.findElement(searchResult).click();
        print("Tapped search result");
    }

    public void completeSearch(String data)throws InterruptedException{
        Thread.sleep(4000);
        tapSearchTab();
        tapSearchField();
        sendSearchString(data);
        WaitersPage.waitForElement(searchResult);
        tapSearchResult();
    }

    public boolean suggestedSearchesTitleIsPresent() {
        return driver.findElement(suggestedSearchesTitle).isDisplayed();
    }

    //--Go back to the app
    public void returnToBFApp() throws RuntimeException {
        driver.get("buzzfeed://");

        //--Enable only after simulator fresh reset or on AWS
        try {
            driver.findElement(openBFAppButton).click();
        } catch (RuntimeException exception){
            print("Open button is not displayed");
        }
    }

    //--Waiters
    public void waitForLatestGiftGuidesTitle() {
        WaitersPage.waitForElement(latestGiftGuides);
        print("Shopping page loaded");
    }
}