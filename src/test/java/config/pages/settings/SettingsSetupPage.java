package config.pages.settings;

import config.pages.CommonPage;
import config.pages.signIn.SignInMailPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.Map;

public class SettingsSetupPage extends CommonPage {

    protected final By closeSubscribe = By.xpath("(//XCUIElementTypeButton[@name=\"Close\"])");
//    protected final By closeSubscribe = By.xpath("//*[contains(@name,'Close,')]");
    //Catching elements
    protected final By debugButton = MobileBy.AccessibilityId("Debug");
    protected final By aBeagleExperiments = MobileBy.AccessibilityId("ABeagle Experiments");
    protected final By experiments = MobileBy.AccessibilityId("Experiments");
    protected final By adFeatureFlag = MobileBy.AccessibilityId("Ad Feature Flags");
    protected final By featureFlag = MobileBy.AccessibilityId("Feature Flags");
    protected final By kennelButton = MobileBy.AccessibilityId("Kennel");

    //--Stage
    protected final By serverSettings = MobileBy.AccessibilityId("Server settings");
    protected final By setAllEnvironments = MobileBy.AccessibilityId("Set All Environments, Production");
    protected final By stagingEnvironment = MobileBy.AccessibilityId("Staging");
    protected final By serverSettingsBackButton = By.xpath("//*[contains(@type,'back button')]");

    //--Shopping tab
    protected final By shoppingTabExperiment = MobileBy.AccessibilityId("shopping-tab-ios-7040");
    protected final By enabledOption = MobileBy.AccessibilityId("enabled");

    //--Trending Package exp
    protected final By trendingPckExperiment = MobileBy.AccessibilityId("trending-products-package-IOS-7723");
    protected final By bothFeedsVariant = MobileBy.AccessibilityId("both_feeds");

    //--Ads
    protected final By allAdsBpageDynamicExperiment = MobileBy.AccessibilityId("adflag_ios_all_buzzfeed");
    protected final By offVariant = MobileBy.AccessibilityId("off");

    //--Results sub tab
    protected final By resultsFlag = MobileBy.AccessibilityId("quiz-results-feed-IOS-8603");
    protected final By onVariant = MobileBy.AccessibilityId("on");

    //GAME HUB
    protected final By gameHubFF = MobileBy.AccessibilityId("quiz-game-hub-IOS-8701");

    //IMPROVE SUB TABS NAVIGATION
    protected final By navSubTabs = MobileBy.AccessibilityId("improved-sub-tab-navigation-IOS-8982");
   // protected final By navSubTabs = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]");

    public void closeSubscribe() {driver.findElement(closeSubscribe).click();}


    public void turnOnGameHubFF(){
        editFlag();
        scroll.scrollMultipleTimes(2);
        driver.findElement(gameHubFF).click();
        driver.findElement(onVariant).click();
        driver.findElement(featureFlag).click();
        driver.findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        driver.resetApp();
    }

    //Methods
    public void editExperiment() {
        gotoSettings();
        driver.findElement(settingsButton).click();
        driver.findElement(debugButton).click();
        driver.findElement(aBeagleExperiments).click();
        driver.findElement(experiments).click();
    }

    public void gotoSettings(){
        SignInMailPage signIn = new SignInMailPage();
        signIn.tapProfileButton();
    }

    public void editAdFeatureFlag() {
        gotoSettings();
        driver.findElement(settingsButton).click();
        driver.findElement(debugButton).click();
        driver.findElement(aBeagleExperiments).click();
        driver.findElement(adFeatureFlag).click();
    }

    public void editFlag() {
        gotoSettings();
        driver.findElement(settingsButton).click();
        driver.findElement(debugButton).click();
        driver.findElement(aBeagleExperiments).click();
        driver.findElement(featureFlag).click();
    }

    public void enableImproveSubTabsNavigation() throws InterruptedException{
        editFlag();
        driver.findElement(navSubTabs).click();
        driver.findElement(onVariant).click();
        Thread.sleep(3000);
        driver.findElement(featureFlag).click();
        Thread.sleep(2000);
        driver.findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        driver.resetApp();
    }

    public void enableTrendingPackage() {
        editExperiment();
        driver.findElement(trendingPckExperiment).click();
        driver.findElement(bothFeedsVariant).click();
        driver.findElement(experiments).click();
        driver.findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        driver.resetApp();
    }

    public void disableAdExp() {
        editAdFeatureFlag();
        driver.findElement(allAdsBpageDynamicExperiment).click();
        driver.findElement(offVariant).click();
        driver.findElement(adFeatureFlag).click();
        driver.findElement(kennelButton).click();
        tapDoneButton();
        driver.resetApp();
    }

    public void changeToStage() {
        driver.findElement(settingsButton).click();
        driver.findElement(debugButton).click();
        driver.findElement(serverSettings).click();
        driver.findElement(setAllEnvironments).click();
        driver.findElement(stagingEnvironment).click();
        print("Set environment to Stage");
        driver.resetApp();
    }

    public void enableShoppingTab() {
        editExperiment();
        driver.findElement(shoppingTabExperiment).click();
        driver.findElement(enabledOption).click();
        print("Enabled Shopping tab experiment");
        driver.resetApp();
    }

    public void enableResultsSubTab() {
        editFlag();
        scroll.scrollDown();
        driver.findElement(resultsFlag).click();
        driver.findElement(onVariant).click();
        print("Enabled Results flag for Quizzes tab");
        tapBackButton();
        driver.findElement(kennelButton).click();
        tapDoneButton();
        tapSettingsButton();
        tapCloseButton();
        driver.resetApp();
    }
}
