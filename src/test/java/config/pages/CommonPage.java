package config.pages;


import basePackage.Base;
//import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.TouchAction;
//import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import io.appium.java_client.android.AndroidDriver();
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.springframework.remoting.support.DefaultRemoteInvocationExecutor;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CommonPage extends Base {

    protected ScrollsPage scroll = new ScrollsPage();

    //Catching Elements
    //--Allow button & Navigation
 //   protected final By suscribeBtn = By.xpath("//*[contains(@name,'Close')");

    protected By loginBtn = AppiumBy.accessibilityId("Login");

    protected By closeButtonTriviaScreen = AppiumBy.accessibilityId("xmark");
    protected By notOnThisDevice = AppiumBy.accessibilityId("Not on this device");
    protected By showPassword = AppiumBy.accessibilityId("Show password");
    protected By collectionView = AppiumBy.accessibilityId("BUFFET_COLLECTION");
    protected By safariHeader = AppiumBy.accessibilityId("CapsuleNavigationBar?isSelected=true");
    protected By signInLink = AppiumBy.accessibilityId("Sign in with existing account");
    protected By homeView = AppiumBy.accessibilityId("BUFFET_COLLECTION");
    protected By pageView = AppiumBy.accessibilityId("buzz-collectionview");
    protected final By suscribeBtn = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])[2]");
  //  protected final By suscribeBtn = By.xpath("/XCUIElementTypeButton[@name='Close']");
    protected final By allowTrackButton = By.xpath("/XCUIElementTypeButton[@name='Allow']");
    protected final By continueBtn = AppiumBy.accessibilityId("permissionConsentAllowConsentButton");
    protected final By acceptAllCookies = AppiumBy.accessibilityId("bannerAllowAllButton");
    protected final By continueAds = AppiumBy.accessibilityId("Continue");

  //  private final By continueSignIn = AppiumBy.accessibilityId("Continue");
    protected final By allowButton = AppiumBy.accessibilityId("Allow");

    protected final By xmark = By.xpath("\t\n" +
            "//XCUIElementTypeButton[@name=\"xmark\"]");
    protected final By quizzesBack = By.xpath("\t\n" + "//XCUIElementTypeButton[@name=\"Quizzes\"]");
 //   protected final By backButton = By.xpath("//*[contains(@name,'Home')");
    protected final By backButton = AppiumBy.accessibilityId("Back");
    protected final By trendingBack = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView");
    protected final By closeButton = AppiumBy.accessibilityId("Close");
    protected final By visualFeedCell = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]");
    protected final By backButtonFromSearch = AppiumBy.accessibilityId("Back");
    protected final By goToGamesButton = AppiumBy.accessibilityId("Go to games");
    protected final By acceptOneTrust = AppiumBy.accessibilityId("bannerAllowAllButton");
    protected final By sweepTakesNoThanks = AppiumBy.accessibilityId("No thanks, I don't like money");

  //  protected final By backButton = By.xpath("//XCUIElementTypeButton[@name=\"Home\"]");
   // protected final By backButton = By.xpath("//XCUIElementTypeButton[@name='BUZZ_BACK_BUTTON']");

    private final By cancelAuth = AppiumBy.accessibilityId("Cancel");
    private final By signInScrollView = AppiumBy.accessibilityId("CenterPageView");
    protected final By backToTrending = AppiumBy.accessibilityId("Trending");
    protected final By backToCoronavirus = AppiumBy.accessibilityId("Coronavirus");
    protected final By backToFood = AppiumBy.accessibilityId("Food");
    protected final By backToVideos = AppiumBy.accessibilityId("Videos");
    protected final By backToShows = AppiumBy.accessibilityId("Shows");
    protected final By backToAnimals = AppiumBy.accessibilityId("Animals");
    protected final By backToBooks = AppiumBy.accessibilityId("Books");
    protected final By backToCommunity = AppiumBy.accessibilityId("Community");
    protected final By backToHealth = AppiumBy.accessibilityId("Health");
    protected final By backToLGBTQ = AppiumBy.accessibilityId("LGBTQ");
    protected final By backToMusic = AppiumBy.accessibilityId("Music");
    protected final By backToNifty = AppiumBy.accessibilityId("Nifty");
    protected final By backToParents = AppiumBy.accessibilityId("Parents");
    protected final By backToRewind = AppiumBy.accessibilityId("Rewind");
    protected final By backToStyle = AppiumBy.accessibilityId("Style");
    protected final By backToTravel = AppiumBy.accessibilityId("Travel");
    protected final By backToFeed = AppiumBy.accessibilityId("Back");


    //NOT NOW button from device
    protected final By notNowBtn = AppiumBy.accessibilityId("Not Now");
    protected final By iGNotNowBtn = AppiumBy.accessibilityId("Not now");

    protected final By guestSignIn = AppiumBy.accessibilityId("Continue as guest");




 //   protected final By closeButton = AppiumBy.accessibilityId("Close");
 //   protected final By doneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]")
 //   protected final By doneButton = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
  //  protected final By doneButton = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    protected final By doneButton = AppiumBy.accessibilityId("Done");
  //  protected final By cancelButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    protected final By cancelButton = AppiumBy.accessibilityId("Cancel");
    protected final By OKButton = AppiumBy.accessibilityId("OK");

    //--Tabs
    protected final By homeTab = AppiumBy.accessibilityId("home");
    protected final By quizzesTab = AppiumBy.accessibilityId("quizzes");
    protected final By newsTab = AppiumBy.accessibilityId("news");
    protected final By shoppingTab = AppiumBy.accessibilityId("shoppingPlus");
    protected final By shoppingJapan = AppiumBy.accessibilityId("shopping");
    protected final By gamesTab = AppiumBy.accessibilityId("games");



    //--Subtabs
    protected final By buzzFeedLogo = AppiumBy.accessibilityId("Home");
    protected final By subtabs = By.xpath("//XCUIElementTypeApplication[@name='BuzzFeed 🐞']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeButton");
    protected final By latestSubTab = By.id("Latest");
    protected final By trendingSubTab = AppiumBy.accessibilityId("Trending");
    protected final By videosSubTab = AppiumBy.accessibilityId("Videos");
    protected final By funnyTweets = By.xpath("//XCUIElementTypeStaticText[@name=\"Funny Tweets\"]");

    //--Feeds
    protected final By splashCellNewNav = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
 //   protected final By splashCellNewNav = By.xpath("//*[contains(@name,'splash_cell,')]");
  //  protected final By splashCellNewNav = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]");

    protected final By trendingSplash = By.xpath("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]");
    protected final By fstCellNewNav = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
   // protected final By splashCell = By.id("splash_cell");
    protected final By splashCell = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]");
    protected final By firstCell = By.xpath(("(//XCUIElementTypeCell[@name='buffet_grid_cell'])[1]/XCUIElementTypeOther[2]"));
    protected final By firstCellTrending = By.id("simple_feed_item_cell");
    protected final By firstVideo = By.id("simple_video_item_cell");
    protected final By itemsPackage = By.id("SimplePackageCard");

    //--Shopping tab
    protected final By shoppingHeader = AppiumBy.accessibilityId("Shopping");
    protected final By trendingProductsTitle = AppiumBy.accessibilityId("Trending Products");
    protected final By latestGiftGuides = AppiumBy.accessibilityId("Latest Gift Guides");
    protected final By latestHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"Latest\"]");
    protected final By randomHeader = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Random\"]\n");
    protected final By gossipHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"Celebrity\"]");
    protected final By lgbtqHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"LGBTQ\"]");

  //  protected final By gearIcon = AppiumBy.accessibilityId("Settings");

    protected final By gearIcon = By.xpath("\t\n" + "//XCUIElementTypeButton[@name=\"gearshape\"]");
  //  protected final By settingsMenu = AppiumBy.xpath("(//XCUIElementTypeButton[@name=\"Settings\"])[2]");
     protected final By settingsMenu = AppiumBy.accessibilityId("Settings");

     public void tapOnLoginBtn(){
         getDriver().findElement(loginBtn).click();
     }

    //Methods
    public Boolean isLatestHeaderDisplayed(){return getDriver().findElement(latestHeader).isDisplayed();}
    public Boolean isRandomHeaderDisplayed(){return getDriver().findElement(randomHeader).isDisplayed();}
    public Boolean isGossipHeaderDisplayed() {return getDriver().findElement(gossipHeader).isDisplayed();}
    public Boolean isLgbtqHeaderDisplayed() {return getDriver().findElement(lgbtqHeader).isDisplayed();}

    public void tapOnContinueSignInBtn(){getDriver().findElement(continueSignIn).click();}


    //--Quizzes tab
    protected final By quizzesHeader = By.id("Quizzes");

     public void tapXMark() {
         getDriver().findElement(xmark).click();
     }

    //--Tooltip on Home & Bpage
    protected final By dismissTooltip = By.xpath("//XCUIElementTypeApplication[@name='BuzzFeed \uD83D\uDC1E']/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton");

    //--News Tag /Latest sub-tab
    protected final By QCUSection = By.xpath("//*[contains(@name,'Quickly Catch Up.')]");

    protected final By backToSettings = AppiumBy.accessibilityId("Settings");

    //--Bpages & Quizzes
  //  protected final By copyLink = By.xpath("//XCUIElementTypeButton[@name=\"Copy Link\"]");
    protected final By copyLink = By.xpath("//XCUIElementTypeCell[@name=\"Copy Link\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
   // protected final By copyLink = AppiumBy.accessibilityId("Copy Link");
    protected final By copyLinkToastView = By.id("BFKitToastView");
    protected final By copyLinkToastText = By.id("BFKitToastLabel");

    //--Profile
    protected final By profileButton = By.xpath("XCUIElementTypeButton[@name=\"gearshape\"]");
    private final By tapOnPerfilBtn = AppiumBy.accessibilityId("Profile");


    //--Sign in email

  //  private final By emailFieldAuth0 = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Email address*\"]");
    private final By emailFieldAuth0 = MobileBy.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField");
  //  private final By passwordFieldAuth0 = AppiumBy.xpath("//XCUIElementTypeOther[@name=\"Password*\"]");

  //  private final By passwordFieldAuth0 = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Password*\"]");
    //XCUIElementTypeStaticText[@name="Password*"]

    private final By passwordFieldAuth0 = AppiumBy.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField");
    private final By continueAuth0Btn = AppiumBy.accessibilityId("Continue");
    protected final By emailField = AppiumBy.iOSNsPredicateString("value == \"Username or Email\"");

    protected final By continueSignIn = AppiumBy.accessibilityId("Continue");
    protected final By passwordField = AppiumBy.iOSNsPredicateString("value == \"Password\"");
   protected final By signInButtonBF = AppiumBy.accessibilityId("Sign in");
    protected final By signInButton = By.xpath("//XCUIElementTypeButton[@name=\"Continue with Facebook\"]");
    protected final By pyramidSchemePopUp = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]");

    //--Search
    protected final By searchTab = AppiumBy.accessibilityId("Search");
    protected final By searchField = By.xpath("//XCUIElementTypeSearchField[@name='Search BuzzFeed']");
    protected final By searchResult = By.id("buffet_grid_cell");
    protected final By suggestedSearchesTitle = AppiumBy.accessibilityId("Suggested Searches");
    private final By configuracion = AppiumBy.accessibilityId("Profile");
    private final By edicion = AppiumBy.accessibilityId("Edición, Latam");
    private final By editionOnAustralia = AppiumBy.accessibilityId("Edition, United States");
    private final By editionOnCanada = AppiumBy.accessibilityId("Edition, Australia");
    private final By editionOnIndia = AppiumBy.accessibilityId("Edition, Canada");
    private final By editionOnUK = AppiumBy.accessibilityId("Edition, India");
    private final By editionOnlatam = AppiumBy.accessibilityId("Edition, United Kingdom");
    private final By editionOnJapan = AppiumBy.accessibilityId("Edición, Latam");
    private final By cerrarMenu = AppiumBy.accessibilityId("Close");
    //private final By tapOnPerfilBtn = AppiumBy.accessibilityId("Perfil");

    public void tapOnEmailFieldAuth0(){
        getDriver().findElement(emailFieldAuth0).click();
    }

    public void tapOnPwdAuth0(){
        getDriver().findElement(passwordFieldAuth0).click();
    }

    public void tapNotOnThisDevice(){
        try{
            getDriver().findElement(notOnThisDevice).click();
        }catch (Exception e){}
    }

    public void tapOnContinueAuth0Btb(){
       try {
           getDriver().findElement(continueAuth0Btn).click();
       }catch (Exception e){};
    }

    public void tapOnConfiguracion() {getDriver().findElement(configuracion).click();}
    public void tapOnEdicion(){getDriver().findElement(edicion).click();}
    public void tapOnEditionOnAustralia(){getDriver().findElement(editionOnAustralia).click();}
    public void tapOnEditionOnCanada(){getDriver().findElement(editionOnCanada).click();}
    public void tapOnEditionOnIndia(){getDriver().findElement(editionOnIndia).click();}
    public void tapOnEditionOnUK(){getDriver().findElement(editionOnUK).click();}

    public void tapOnEditionOnLatam(){getDriver().findElement(editionOnlatam).click();}
    public void tapOnEditionOnJapan(){getDriver().findElement(edicion).click();}


    public void tapOnCerrar() {getDriver().findElement(cerrarMenu).click();}

    public void tapOnCloseTrivia(){getDriver().findElement(closeButtonTriviaScreen);}


    public void tapOnPerfBtn(){getDriver().findElement(tapOnPerfilBtn).click();}

     public void switchToAlert(){
        getDriver().switchTo().alert().accept();
     }


    //--Settings
    protected final By settingsButton = AppiumBy.accessibilityId("Settings");
   // protected final By profileButton = AppiumBy.accessibilityId("Profile");

    //--Go back to the app
    protected final By openBFAppButton = AppiumBy.accessibilityId("Open");


    // footers
    protected final By searchIcon = AppiumBy.accessibilityId("Search");

    protected final By USEdition = AppiumBy.accessibilityId("United States");

    public void tapUSEdition() {getDriver().findElement(USEdition).click();}


    //Methods

    public void tapCancelAuth(){
        try {
            getDriver().findElement(cancelAuth).click();
        } catch (Exception e){}
    }

    public void tapContinueSignIn(){
        try {
            getDriver().findElement(continueSignIn).click();
        } catch (Exception e) {}
    }

    public Boolean isDoneBtnDisplayed(){
        return getDriver().findElement(doneButton).isDisplayed();
    }
    //--ContinueAds + Allow button + Navigation
    public void tapContinueButton() {
        getDriver().findElement(continueAds).click();
        print("Tapped 'Continue' button on Ads prompt");
    }

    public void tapAllOneTrust(){
        try {
            getDriver().findElement(acceptOneTrust).click();
        } catch (Exception e){}
    }

    public void isContentDisplayed(){
        getDriver().findElement(collectionView).isDisplayed();
    }

    public void tapOnTrendingCellFeed(){getDriver().findElement(visualFeedCell).click();}

    public Boolean isPyramidSchemePopUpDisplayed(){
       return getDriver().findElement(pyramidSchemePopUp).isDisplayed();
    }

    public void tapOnGoToGames()throws InterruptedException{
        try {
            Thread.sleep(2000);
            getDriver().findElement(goToGamesButton).click();
        }catch (Exception e){}
    }

    public void tapOnGuestSignIn(){
        getDriver().findElement(guestSignIn).click();
    }

    public Boolean isFunnyTweetsHeaderDisplayed(){return getDriver().findElement(funnyTweets).isDisplayed();}

    public void tapOnNoThanksSweepTakes(){
        try {
            getDriver().findElement(sweepTakesNoThanks).click();
        }catch (Exception e){}
    }

    public void scrollInHome(){
        scroll.scrollDownPlugin(homeView);
    }


    public void tapOnContinueBtn(){
        getDriver().findElement(continueBtn).click();
    }
    public void tapOnAcceptAllCookiesBtn(){
        try {
            getDriver().findElement(acceptAllCookies).click();
        }catch (Exception e){}
    }

    public void closeGoToGamesScreen() {
        try {
            getDriver().findElement(closeButton).click();
        } catch (Exception e) {}
    }

    public void tapOnSuscribeBtn()throws InterruptedException{
     //   try {
         //   WaitersPage.waitForElement(suscribeBtn);
            Thread.sleep(3000);
            getDriver().findElement(suscribeBtn).click();
       // }catch (Exception e) {}
    }

    //NEW NAV
    public Boolean splashCellNewNavIsPresent() {return getDriver().findElement(splashCellNewNav).isDisplayed();}
    public void tapSplashNewNav(){getDriver().findElement(splashCellNewNav).click();}
    public void tapFstCellNewNav(){getDriver().findElement(fstCellNewNav).click();}
    public void tapTrendingSplash() {getDriver().findElement(trendingSplash).click();}

    public void tapOnSearchIcon(){
        getDriver().findElement(searchIcon).click();
    }

    public void tapQuizzesBack(){
        getDriver().findElement(quizzesBack).click();
    }
    public void tapTrendingBack()  {getDriver().findElement(trendingBack).click();}

    public void tapAllowButton() {
        if (env.equals("Local")) {
            try {
                getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                getDriver().findElement(allowButton).click();
                print("Tapped Allow Button");
            } catch (Exception e) {
            }
        }
    }

    public void shoppingJapan() {getDriver().findElement(shoppingJapan).click();}
    public void backtoTrending() {getDriver().findElement(backToTrending).click();}
    public void backtoFood() {getDriver().findElement(backToFood).click();}
    public void backtoCoronavirus() {getDriver().findElement(backToCoronavirus).click();}
    public void backtoBooks() {getDriver().findElement(backToBooks).click();}
    public void  backToVideos() {getDriver().findElement(backToVideos).click();}
    public void backToShows() {getDriver().findElement(backToShows).click();}
    public void backToAnimals() {getDriver().findElement(backToVideos).click();}
    public void backtoCommunity() {getDriver().findElement(backToCommunity).click();}
    public void backtoHealth() {getDriver().findElement(backToHealth).click();}
    public void backtoLGBTQ() {getDriver().findElement(backToLGBTQ).click();}
    public void backToMusic() {getDriver().findElement(backToMusic).click();}
    public void backToNifty() {getDriver().findElement(backToNifty).click();}
    public void backtoParents() {getDriver().findElement(backToParents).click();}
    public void backtoRewind() {getDriver().findElement(backToRewind).click();}
    public void BackToStyle() {getDriver().findElement(backToStyle).click();}
    public void backtoTravel() {getDriver().findElement(backToTravel).click();}
    public void backtoFeed(){getDriver().findElement(backToFeed).click();}
    public void tapNotNow() {
        try {
         //   WaitersPage.waitForElement(notNowBtn);
            getDriver().findElement(notNowBtn).click();
        }catch (Exception e){}
    }
    public void tapIGNotNow() {getDriver().findElement(iGNotNowBtn).click();}

    public void tapOnSignInLink(){
        getDriver().findElement(signInLink).click();
    }

    public void tapAllowTrackButton() {
        getDriver().findElement(allowTrackButton).click();
        print("Tapped Allow Track Button");
    }

    public void tapBackButtonFromSearch() {
        try {
            getDriver().findElement(backButtonFromSearch).click();
        }catch (Exception e){}
    }

    public void tapBackButton() {
     //   WaitersPage.waitForElement(backButton);
        try {
            getDriver().findElement(backButton).click();
        }catch (Exception e) {}

    }

    public void tapSafariHeader(){
        getDriver().findElement(safariHeader).click();
    }

    public void enterTextOnSafari(String text)throws InterruptedException{
        tapSafariHeader();
        Thread.sleep(2000);
        getDriver().findElement(safariHeader).sendKeys(text);
        getDriver().findElement(safariHeader).sendKeys(Keys.ENTER);


    }



    public void scrollHoriz(int x1, int y1, int x2, int y2) {
        TouchAction action = new TouchAction(getDriver());
        action.press(point(x1, y1)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x2, y2)).release().perform();
    }

    public void tapCloseButton() {
        try {
         //   WaitersPage.waitForElement(closeButton);
            getDriver().findElement(closeButton).click();
            print("Tapped the Close button");
        }catch (Exception e){}
    }

    public void tapDoneButton() {
        if (getDriver().findElement(doneButton).isEnabled())
        {    getDriver().findElement(doneButton).click();
         //   driver.getKeyboard(new KeyEvent(AndroidKey.ENTER));

      //    driver.getKeyboard().pressKey(Keys.ENTER);
            //    driver.getKeyboard().pressKey(Keys.CANCEL);
                print("Tapped 'Done' button");
        } else {   print("'Done' button not enabled");}

    }

    public boolean cancelButtonIsPresent() {
        return getDriver().findElement(cancelButton).isDisplayed();
    }

    public void tapCancelButton() throws InterruptedException{
    //    Thread.sleep(2000);
        getDriver().findElement(cancelButton).click();
        print("Tapped Cancel button");
    }

    public void tapOKButton() {
        getDriver().findElement(OKButton).click();
        print("Tapped the OK button");
    }

    public void tapSettingsButton() {
        getDriver().findElement(settingsButton).click();
        print("Tapped Settings button");
    }

    //--Tabs - Bottom Navigation Bar
    public void tapHomeTab() {
        getDriver().findElement(homeTab).click();
        print("Tapped Home tab");
    }

    public void activateApp()throws InterruptedException{
        Thread.sleep(2000);
        getDriver().activateApp("com.apple.mobilesafari");
        Thread.sleep(2000);
        tapSafariHeader();
        Thread.sleep(2000);
         enterTextOnSafari("buzzfeed://");
        Thread.sleep(2000);
        if (env.equals("Local")){
         tapOnOpenAlert();}
    }

    public void backToSettings(){
        getDriver().findElement(backToSettings).click();
    }

    public void tapQuizzesTab() {
        getDriver().findElement(quizzesTab).click();
        print("Tapped 'Quizzes' tab");
    }

    public boolean quizzesHeaderIsPresent(){
        return getDriver().findElement(quizzesHeader).isDisplayed();
    }

    public void tapNewsTab() {
        getDriver().findElement(newsTab).click();
        print("Tapped 'News' tab");
    }

    public void tapGamesTab() {
        getDriver().findElement(gamesTab).click();
        print("Tapped 'Games' tab");
    }

    public Boolean isGamesHeaderDisplayed(){ return getDriver().findElement(gamesTab).isDisplayed();}

    public void tapShoppingTab() {
        getDriver().findElement(shoppingTab).click();
        print("Tapped 'Quizzes' tab");
    }

    public boolean shoppingHeaderIsPresent() {
        return getDriver().findElement(shoppingHeader).isDisplayed();
    }

    //--Sub-tabs
    public boolean buzzfeedLogoIsPresent(){
     //   WaitersPage.waitForElement(buzzFeedLogo);
        return getDriver().findElement(buzzFeedLogo).isDisplayed();
    }
    public void tapOnBuzzFeedLogo(){
        getDriver().findElement(buzzFeedLogo).click();
    }

    public Boolean latestSubTabIsPresent(){
        return getDriver().findElement(latestSubTab).isDisplayed();
    }

    public String latestSubTabIsActive(){
        return getDriver().findElement(latestSubTab).getAttribute("value");
    }

    public Boolean trendingSubTabIsPresent(){
        return getDriver().findElement(trendingSubTab).isDisplayed();
    }

    public void tapTrendingSubTab() {
        getDriver().findElement(trendingSubTab).click();
        print("Tapped the Trending sub-ab");
    }

    public String trendingSubTabIsActive(){
        return getDriver().findElement(trendingSubTab).getAttribute("value");
    }

    public Boolean videosSubTabIsPresent() {
        return getDriver().findElement(videosSubTab).isDisplayed();
    }

    public String videosSubTabIsActive(){
        String value = getDriver().findElement(videosSubTab).getAttribute("value");
        return value;
    }

    //--News tab / Latest tab
    public boolean QCUSectionIsPresent() {
        return getDriver().findElement(QCUSection).isDisplayed();
    }

    //--Feeds
        //--Splash
    public Boolean splashCellIsPresent() {
      //  WaitersPage.waitForElement(splashCell);
        return getDriver().findElement(splashCell).isDisplayed();
    }

    public void visitSplashAndReturn(){
        tapSplash();
        tapBackButton();
    }

    public void tapSplash() {
      //  WaitersPage.waitForElement(splashCell);
        getDriver().findElement(splashCell).click();
     //   print("Tapped Splash on feed");
    }

       //--First Cell on Trending
    public Boolean firstCellOnTrendingIsPresent() {
        return getDriver().findElement(firstCellTrending).isDisplayed();
    }

    public void tapFirstCellOnTrending() {
        getDriver().findElement(firstCellTrending).click();
        print("Tapped first Bpage under Splash on Trending feed");
    }

        //--First cell on general tabs
    public Boolean fistCellIsPresent() {
        return getDriver().findElement(firstCell).isDisplayed();
    }

    public void tapFirstCell() {
        getDriver().findElement(firstCell).click();
        print("Tapped first Bpage under Splash on Feed");
    }

        //--First Video
    public void tapFirstVideo() {
        getDriver().findElement(firstVideo).click();
        print("Tapped first video on Video feed");
    }

    public void tapPackageItem() {
        getDriver().findElement(itemsPackage).click();
        print("Tapped an item from the Package");
    }

        //--Trending Products Title
    public boolean trendingProductsTitleIsPresent() {
        return getDriver().findElement(trendingProductsTitle).isDisplayed();
    }

    //--Dismiss tooltip on Home & Bpages
    public void dismissTooltip() {
        getDriver().findElement(dismissTooltip).click();
    }

    //--Bpages & Quizzes
    public boolean verifyCopyLinkbuttonIsPresent(){
        return getDriver().findElement(copyLink).isDisplayed();
    }


    public void tapShowPassword(){
        getDriver().findElement(showPassword).click();
    }
    public void tapCopyLink(){
        getDriver().findElement(copyLink).click();
        print("Tapped 'Copy Link'");
    }

    public boolean verifyLinkCopiedToastIsPresent(){
        return getDriver().findElement(copyLinkToastView).isDisplayed();
    }

    public boolean verifyLinkCopiedToastTextIsPresent(){
        return getDriver().findElement(copyLinkToastText).isDisplayed();
    }

    //--Profile
    public void tapProfileButton() {
        getDriver().findElement(profileButton).click();
        print("Tapped profile button");
    }

    public void tapGearIcon(){
        getDriver().findElement(gearIcon).click();
    }
    public void tapSettingsMenu(){
        getDriver().findElement(settingsMenu).click();
    }

  public void setUSEdition(){
      tapOnPerfBtn();
      //tapOnConfiguracion();
      tapGearIcon();
      tapSettingsMenu();
      tapOnEdicion();

      tapUSEdition();
      tapOnCerrar();
  }

    //--Sign in email
    public void enterEmail(String userData) {
        getDriver().findElement(emailField).click();
        getDriver().findElement(emailField).sendKeys(userData);
        print("Entered email");
    }

    public void enterEmailAuth0(String userData) throws InterruptedException{
      //  Thread.sleep(6000);
        getDriver().findElement(emailFieldAuth0).click();
        Thread.sleep(2000);
        getDriver().findElement(emailFieldAuth0).sendKeys(userData);
        print("Entered email");

    }


    public void enterPassword(String passData)throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(passwordField).click();
        getDriver().findElement(passwordField).sendKeys(passData);
        print("Entered password");
        Thread.sleep(1000);
        getDriver().hideKeyboard();
    }


    public void enterPasswordAuth0(String passData)throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(passwordFieldAuth0).click();
        getDriver().findElement(passwordFieldAuth0).sendKeys(passData);
        print("Entered password");
    }

    public void tapSignInButton() {
        getDriver().findElement(signInButton).click();
        print("Tapped Sign in button in Login screen");
    }

    public void tapSignInBFButton() {
        getDriver().findElement(signInButtonBF).click();
        print("Tapped Sign in button in Login screen");
    }

    //--Search
    public void tapSearchTab() {
        getDriver().findElement(searchTab).click();
        print("Tapped 'Search' tab");
    }

    public void tapSearchField() {
        getDriver().findElement(searchField).click();
        getDriver().findElement(searchField).clear();
        print("Tapped on search field");
    }

    public void sendSearchString(String searchTerm) {
        getDriver().findElement(searchField).sendKeys(searchTerm);
        getDriver().findElement(searchField).sendKeys(Keys.ENTER);
        print("SearchTerm+Enter");
    }

    public void tapSearchResult()throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(searchResult).click();
        print("Tapped search result");
    }

    public void completeSearch(String data)throws InterruptedException{
     //  Thread.sleep(4000);
     //   tapHomeTab();
        Thread.sleep(2000);
        tapSearchTab();
        tapSearchField();
        sendSearchString(data);
      //  WaitersPage.waitForElement(searchResult);
        tapSearchResult();
    }

    public boolean suggestedSearchesTitleIsPresent() {
        return getDriver().findElement(suggestedSearchesTitle).isDisplayed();
    }


    public void openBF(){
        getDriver().get("buzzfeed://");
    }

    public void tapOnOpenAlert()throws InterruptedException{
     //   Thread.sleep(2000);
        try {
            getDriver().findElement(openBFAppButton).click();
        } catch (Exception e){}
            print("Open button is not displayed");
    }
    //--Go back to the app


    public void returnToBFApp() throws RuntimeException, InterruptedException {
        getDriver().get("buzzfeed://");
        try {
            getDriver().findElement(openBFAppButton).click();
        } catch (RuntimeException exception){
            print("Open button is not displayed");
        }
        Thread.sleep(2000);
    }

    public void returnToBFAppViaSafari() throws RuntimeException, InterruptedException {
        getDriver().activateApp("com.apple.mobilesafari");
        tapSafariHeader();
        Thread.sleep(2000);
        enterTextOnSafari("buzzfeed://");
        if (env.equals("Local")){
        tapOnOpenAlert();}
    }

    //--Waiters
    public void waitForLatestGiftGuidesTitle() {
      //  WaitersPage.waitForElement(latestGiftGuides);
        print("Shopping page loaded");
    }

    public void scrollInBpage2(){
        scroll.scrollDownPlugin(pageView);
    }

    public void scrollInBpageMultipleTimes(int times){
        for(int i=1; i<= times; i++)
            scroll.scrollDownPlugin(pageView);
    }

    public void tapGuestSignInAndNotif()throws InterruptedException{
        Thread.sleep(4000);
        if (env.equals("Local")) {
            tapAllowButton();
        }
        Thread.sleep(2000);
        tapOnGuestSignIn();
        Thread.sleep(2000);
    }



    public void signInWithBFAuth0()throws InterruptedException{
        Thread.sleep(2000);
        tapProfileButton();
        Thread.sleep(7000);
        tapOnContinueAuth0Btb();
        Thread.sleep(4000);
        tapCancelAuth();
        Thread.sleep(4000);
        tapProfileButton();
        Thread.sleep(4000);
         tapOnContinueAuth0Btb();
        Thread.sleep(8000);
        enterEmailAuth0("gabmoreau@hotmail.com");
        Thread.sleep(3000);
        tapOnContinueAuth0Btb();
        Thread.sleep(3000);
        enterPasswordAuth0("almadormida12");
        Thread.sleep(2000);
        tapShowPassword();
        Thread.sleep(4000);
        tapOnContinueAuth0Btb();
        Thread.sleep(3000);
        tapNotNow();
        Thread.sleep(2000);
        tapNotOnThisDevice();
    }
}
