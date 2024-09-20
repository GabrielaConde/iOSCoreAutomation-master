package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OneTrustPage extends CommonPage {
    private final By pcTitle = AppiumBy.accessibilityId("pcTitle");
    private final By BuzzFeedLogo = AppiumBy.accessibilityId("buzzfeed_logo@3x.png");
    private final By WeCareAboutYourPrivacy = AppiumBy.xpath("//XCUIElementTypeTextView[@name=\"We Care About Your Privacy\"]");
    private final By weAndOurPartnersStore = AppiumBy.accessibilityId("We and our partners store and/or access information on a device, such as unique IDs in cookies to process personal data. You may accept or manage your choices by clicking below, including your right to object where legitimate interest is used, or at any time in the privacy policy page. These choices will be signaled to our partners and will not affect browsing data.");
    private final By weAndOurPartnersProcessData = AppiumBy.xpath("//XCUIElementTypeTextView[@name=\"We and our partners process data to provide:\"]");
    private final By activellyScanDevice = AppiumBy.accessibilityId("Actively scan device characteristics for identification. Store and/or access information on a device. Measure ad performance. Measure content performance. Personalised ads and content, ad and content measurement, audience insights and product development.");
    private final By listOfPartners = AppiumBy.accessibilityId("List of Partners (vendors)");
    private final By bannerRejectAllBtn = AppiumBy.accessibilityId("bannerRejectAllButton");
    private final By showPurpuses = AppiumBy.accessibilityId("bannerPrivacySettingsButton");

   // ======================================================================================

    //Settings screen

    private final By weProcessYourData = AppiumBy.accessibilityId("We process your data to deliver content or advertisements and measure the delivery of such content or advertisements to extract insights about our website. We share this information with our partners on the basis of consent and legitimate interest. You may exercise your right to consent or object to a legitimate interest, based on a specific purpose below or at a partner level in the link under each purpose. These choices will be signaled to our vendors participating in the Transparency and Consent Framework.");
    private final By allowAll = AppiumBy.accessibilityId("pcAllowAllButton");
    private final By rejectAll = AppiumBy.accessibilityId("pcRejectAllButton");
    private final By manageServices = AppiumBy.accessibilityId("Manage Services");
    private final  By vendorsList = AppiumBy.accessibilityId("Vendors List");
    private final By sdkList = AppiumBy.accessibilityId("SDK List");
    private final By consentPreferences = AppiumBy.accessibilityId("Manage Consent Preferences");
    private final By confirmMyChoicesBtn = AppiumBy.accessibilityId("pcConfirmMyChoiceButton");

    //================================================

    public Boolean isWeProcewssYourDataDisplayed(){ return getDriver().findElement(weProcessYourData).isDisplayed();}
    public Boolean isAllowAllBtnDisplayed(){return getDriver().findElement(allowAll).isDisplayed();}
    public Boolean isRejectAllBtnSettingsDisplayed(){ return getDriver().findElement(rejectAll).isDisplayed();}
    public Boolean isManageServicesDisplayed(){return getDriver().findElement(manageServices).isDisplayed();}
    public Boolean isVendorsListDisplayed(){return getDriver().findElement(vendorsList).isDisplayed();}
    public Boolean isSDKListDisplayed(){return getDriver().findElement(sdkList).isDisplayed();}
    public Boolean isConsentPreferencesDisplayed(){return getDriver().findElement(consentPreferences).isDisplayed();}
    public Boolean isConfirmMyChoicesDisplayed(){return getDriver().findElement(confirmMyChoicesBtn).isDisplayed();}
    public void tapOnConfirmMyChoices(){getDriver().findElement(confirmMyChoicesBtn).click();}
    public void clickVendorsList(){getDriver().findElement(vendorsList).click();}
    public void clickSDKList(){getDriver().findElement(sdkList).click();}

    private final By searchTxt = AppiumBy.accessibilityId("Search…");
    private final By filterBtn = AppiumBy.accessibilityId("sdkFilterButton");
    private final By allowAllToggle = AppiumBy.xpath("//XCUIElementTypeSwitch[@name=\"Allow All Consent\"]");

    //-------------------------------------------------------------------------------------
    public Boolean isSearchTextDisplayed(){ return getDriver().findElement(searchTxt).isDisplayed();}
    public Boolean isfilterBtnDisplayed(){return getDriver().findElement(filterBtn).isDisplayed();}
    public Boolean isAllowToggleDisplayed() { return getDriver().findElement(allowAllToggle).isDisplayed();}
    public void  clickOnfilterBtn() {  getDriver().findElement(filterBtn).click();}
    public void  clickOnAllow() { getDriver().findElement(allowAllToggle).click();}
    public void tapAllowAllToggle(){getDriver().findElement(allowAllToggle).click();}
    //-------------------------------------------------------------------------------------

    public Boolean isPCTitleDisplayed(){ return getDriver().findElement(pcTitle).isDisplayed();}
    public Boolean isBuzzFeedLogoDisplayed(){return getDriver().findElement(BuzzFeedLogo).isDisplayed();}
    public Boolean isWeCareAboutYourPrivacyDisplayed(){ return getDriver().findElement(WeCareAboutYourPrivacy).isDisplayed();}
    public Boolean isWeAndOurPartnersStoreyDisplayed(){return getDriver().findElement(weAndOurPartnersStore).isDisplayed();}
    public Boolean isWeAndOurPartnersSProcessDataDisplayed(){ return getDriver().findElement(weAndOurPartnersProcessData).isDisplayed();}
  //  public Boolean isWeCareAboutYourPrivacyDisplayed(){getDriver().findElement(WeCareAboutYourPrivacy).isDisplayed();}
    public Boolean isActivellyScanDeviceDisplayed(){return getDriver().findElement(activellyScanDevice).isDisplayed();}
    public Boolean isListOfVendorsDisplayed(){return getDriver().findElement(listOfPartners).isDisplayed();}
    public Boolean isRejectAllBtnDisplayed(){return getDriver().findElement(bannerRejectAllBtn).isDisplayed();}
    public Boolean isShowPurpusesDisplayed(){return getDriver().findElement(showPurpuses).isDisplayed();}

    public void clickOnListOfVendors(){getDriver().findElement(listOfPartners).click();}
    public void clickOnShowPurposes(){getDriver().findElement(showPurpuses).click();}


}
