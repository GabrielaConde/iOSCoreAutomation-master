package config.pages.settings;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import config.pages.signIn.SignInMailPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;

public class SettingsSetupPage extends CommonPage {

    protected final By closeSubscribe = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])");
//    protected final By closeSubscribe = By.xpath("//*[contains(@name,'Close,')]");
    //Catching elements
    protected final By debugButton = AppiumBy.accessibilityId("Debug");

    protected final By adflag_ios_all_buzzfeed = AppiumBy.accessibilityId("adflag_ios_all_buzzfeed");
    protected final By settingsItemMnu = AppiumBy.xpath("(//XCUIElementTypeButton[@name=\"Settings\"])[2]");
    protected final By aBeagleExperiments = AppiumBy.accessibilityId("ABeagle Experiments");
    protected final By experiments = AppiumBy.accessibilityId("Experiments");
    protected final By adFeatureFlag = AppiumBy.accessibilityId("Ad Feature Flags");
    protected final By featureFlag = AppiumBy.accessibilityId("Feature Flags");
    protected final By kennelButton = AppiumBy.accessibilityId("Kennel");

    //--Stage
    protected final By serverSettings = AppiumBy.accessibilityId("Server settings");
    protected final By setAllEnvironments = AppiumBy.accessibilityId("Set All Environments, Production");
    protected final By stagingEnvironment = AppiumBy.accessibilityId("Staging");
    protected final By serverSettingsBackButton = By.xpath("//*[contains(@type,'back button')]");

    //--Shopping tab
    protected final By shoppingTabExperiment = AppiumBy.accessibilityId("shopping-tab-ios-7040");
    protected final By enabledOption = AppiumBy.accessibilityId("enabled");
    protected final By onOption = AppiumBy.accessibilityId("on");

    //--Trending Package exp
    protected final By trendingPckExperiment = AppiumBy.accessibilityId("trending-products-package-IOS-7723");
    protected final By newHomeFeedExperiment = AppiumBy.accessibilityId("new-homefeed-BR-3279");

    protected final By bothFeedsVariant = AppiumBy.accessibilityId("both_feeds");

    //--Ads
    protected final By allAdsBpageDynamicExperiment = AppiumBy.accessibilityId("adflag_ios_all_buzzfeed");
    protected final By offVariant = AppiumBy.accessibilityId("off");

    //--Results sub tab
    protected final By resultsFlag = AppiumBy.accessibilityId("quiz-results-feed-IOS-8603");
    protected final By onVariant = AppiumBy.accessibilityId("on");

    //GAME HUB
    protected final By gameHubFF = AppiumBy.accessibilityId("quiz-game-hub-IOS-8701");
    protected final By gamesTabFF = AppiumBy.accessibilityId("game-tab-BR-3008-NOPROD");

    //VISUAL FEED
    protected final By visualFeedExp = AppiumBy.accessibilityId("visual-feed-APPS-7879");

    //AI QUIZZES
    protected final By aiQuizzes = AppiumBy.accessibilityId("ai-quiz-APPS-8061");

    protected final By AdFlag = AppiumBy.accessibilityId("adflag_ios_all_buzzfeed");

    public void tapAdFlagExp(){getDriver().findElement(AdFlag).click();}

    //IMPROVE SUB TABS NAVIGATION
    protected final By navSubTabs = AppiumBy.accessibilityId("improved-sub-tab-navigation-IOS-8982");
   // protected final By navSubTabs = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]");

    public void closeSubscribe() {
        try {
            Thread.sleep(2000);
            backToSettings();
           // tapBackButton();
            Thread.sleep(2000);
            getDriver().findElement(closeSubscribe).click();
        }catch (Exception e){
            getDriver().findElement(closeSubscribe).click();
        }
    }

    public void setOnOption() {getDriver().findElement(onOption).click();}

    public void tapSettingsItemMenu(){getDriver().findElement(settingsItemMnu).click();}


    public void turnOnGameHubFF(){
        editFlag();
        scroll.scrollMultipleTimes(2);
        getDriver().findElement(gameHubFF).click();
        getDriver().findElement(onVariant).click();
        getDriver().findElement(featureFlag).click();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }

    public void turnOnAIQuizzesFF(){
        editFlag();
        getDriver().findElement(aiQuizzes).click();
        getDriver().findElement(onVariant).click();
        getDriver().findElement(experiments).click();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }

    public void turnOnGamesTabFF(){
        editFlag();
        getDriver().findElement(gamesTabFF).click();
        getDriver().findElement(onOption).click();
        getDriver().findElement(featureFlag).click();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }

    public void turnOnVisualFeedFF()throws InterruptedException{
        editExperiment();
        WaitersPage.waiterEnv(3000);
      //  Thread.sleep(3000);
        getDriver().findElement(visualFeedExp).click();
        WaitersPage.waiterEnv(3000);
     //   Thread.sleep(3000);
        getDriver().findElement(enabledOption).click();
        WaitersPage.waiterEnv(3000);
   //     Thread.sleep(3000);
        getDriver().findElement(experiments).click();
        WaitersPage.waiterEnv(3000);
   //     Thread.sleep(3000);
        getDriver().findElement(kennelButton).click();
        WaitersPage.waiterEnv(3000);
    //    Thread.sleep(3000);
        tapDoneButton();
        WaitersPage.waiterEnv(3000);
     //   Thread.sleep(3000);
        tapSettingsButton();
        WaitersPage.waiterEnv(3000);
    //    Thread.sleep(3000);
        tapCloseButton();
        getDriver().resetApp();
    }

    //Methods
    public void editExperiment() throws InterruptedException{
     //   gotoSettings();
       // getDriver().findElement(settingsButton).click();
        getDriver().findElement(gearIcon).click();
        WaitersPage.waiterEnv(5000);
    //    Thread.sleep(3000);
        getDriver().findElement(debugButton).click();
        WaitersPage.waiterEnv(4000);
     //   Thread.sleep(5000);
    //    tapCancelAuth();
   //     Thread.sleep(2000);
     //   Thread.sleep(3000);
        getDriver().findElement(aBeagleExperiments).click();
        WaitersPage.waiterEnv(3000);

        getDriver().findElement(experiments).click();
        WaitersPage.waiterEnv(2000);

    }

    public void gotoSettings(){
        SignInMailPage signIn = new SignInMailPage();
        signIn.tapProfileButton();
    }

    public void editAdFeatureFlag() throws InterruptedException{
      //  gotoSettings();
        getDriver().findElement(gearIcon).click();
    //    getDriver().findElement(settingsItemMnu).click();
        getDriver().findElement(debugButton).click();
        Thread.sleep(2000);
        getDriver().findElement(aBeagleExperiments).click();
        Thread.sleep(2000);
        getDriver().findElement(adFeatureFlag).click();
    }



    public void editFlag() {
        gotoSettings();
        getDriver().findElement(settingsButton).click();
        getDriver().findElement(debugButton).click();
        getDriver().findElement(aBeagleExperiments).click();

        getDriver().findElement(featureFlag).click();
    }

    public void enableImproveSubTabsNavigation() throws InterruptedException{
        editFlag();
        getDriver().findElement(navSubTabs).click();
        getDriver().findElement(onVariant).click();
        Thread.sleep(3000);
        getDriver().findElement(featureFlag).click();
        Thread.sleep(2000);
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }

    public void enableTrendingPackage()throws InterruptedException {
        editExperiment();
        getDriver().findElement(trendingPckExperiment).click();
        getDriver().findElement(bothFeedsVariant).click();
        getDriver().findElement(experiments).click();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }

    public void enableNewHomeFeed()throws InterruptedException {
        editExperiment();
        getDriver().findElement(newHomeFeedExperiment).click();
        Thread.sleep(2000);
        getDriver().findElement(enabledOption).click();
        getDriver().findElement(experiments).click();
        getDriver().findElement(kennelButton).click();
        getDriver().findElement(adFeatureFlag).click();
        getDriver().findElement(AdFlag).click();
        getDriver().findElement(offVariant).click();
        getDriver().findElement(adFeatureFlag).click();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
     //   getDriver().resetApp();
     //   getDriver().launchApp();
        getDriver().terminateApp("com.buzzfeed.buzzfeed-alpha");
        getDriver().activateApp("com.buzzfeed.buzzfeed-alpha");
    }

    public void disableAdExp() throws InterruptedException{
        editAdFeatureFlag();
        Thread.sleep(6000);
        getDriver().findElement(adflag_ios_all_buzzfeed).click();
        Thread.sleep(2000);
        getDriver().findElement(offVariant).click();
        Thread.sleep(2000);
        getDriver().findElement(adFeatureFlag).click();
        Thread.sleep(2000);
        getDriver().findElement(kennelButton).click();
        Thread.sleep(2000);
        tapDoneButton();
      //  getDriver().resetApp();
        getDriver().terminateApp("com.buzzfeed.buzzfeed");
       // getDriver().activateApp("com.buzzfeed.buzzfeed");
        activateApp();
    }

    public void changeToStage() {
        getDriver().findElement(settingsButton).click();
        getDriver().findElement(debugButton).click();
        getDriver().findElement(serverSettings).click();
        getDriver().findElement(setAllEnvironments).click();
        getDriver().findElement(stagingEnvironment).click();
        print("Set environment to Stage");
        getDriver().resetApp();
    }

    public void enableShoppingTab()throws InterruptedException {
        editExperiment();
        getDriver().findElement(shoppingTabExperiment).click();
        getDriver().findElement(enabledOption).click();
        print("Enabled Shopping tab experiment");
        getDriver().resetApp();
    }

    public void enableResultsSubTab() {
        editFlag();
        scroll.scrollDown();
        getDriver().findElement(resultsFlag).click();
        getDriver().findElement(onVariant).click();
        print("Enabled Results flag for Quizzes tab");
        tapBackButton();
        getDriver().findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        getDriver().resetApp();
    }
}
