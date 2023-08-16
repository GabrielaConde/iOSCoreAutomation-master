package config.pages.settings;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class OneTrustPage extends CommonPage {
    private final By pcTitle = MobileBy.AccessibilityId("pcTitle");
    private final By BuzzFeedLogo = MobileBy.AccessibilityId("buzzfeed_logo@3x.png");
    private final By WeCareAboutYourPrivacy = MobileBy.xpath("//XCUIElementTypeTextView[@name=\"We Care About Your Privacy\"]");
    private final By weAndOurPartnersStore = MobileBy.AccessibilityId("We and our partners store and/or access information on a device, such as unique IDs in cookies to process personal data. You may accept or manage your choices by clicking below, including your right to object where legitimate interest is used, or at any time in the privacy policy page. These choices will be signaled to our partners and will not affect browsing data.");
    private final By weAndOurPartnersProcessData = MobileBy.xpath("//XCUIElementTypeTextView[@name=\"We and our partners process data to provide:\"]");
    private final By activellyScanDevice = MobileBy.AccessibilityId("Actively scan device characteristics for identification. Store and/or access information on a device. Measure ad performance. Measure content performance. Personalised ads and content, ad and content measurement, audience insights and product development.");
    private final By listOfPartners = MobileBy.AccessibilityId("List of Partners (vendors)");
    private final By bannerRejectAllBtn = MobileBy.AccessibilityId("bannerRejectAllButton");
    private final By showPurpuses = MobileBy.AccessibilityId("bannerPrivacySettingsButton");

   // ======================================================================================

    //Settings screen

    private final By weProcessYourData = MobileBy.AccessibilityId("We process your data to deliver content or advertisements and measure the delivery of such content or advertisements to extract insights about our website. We share this information with our partners on the basis of consent and legitimate interest. You may exercise your right to consent or object to a legitimate interest, based on a specific purpose below or at a partner level in the link under each purpose. These choices will be signaled to our vendors participating in the Transparency and Consent Framework.");
    private final By allowAll = MobileBy.AccessibilityId("pcAllowAllButton");
    private final By rejectAll = MobileBy.AccessibilityId("pcRejectAllButton");
    private final By manageServices = MobileBy.AccessibilityId("Manage Services");
    private final  By vendorsList = MobileBy.AccessibilityId("Vendors List");
    private final By sdkList = MobileBy.AccessibilityId("SDK List");
    private final By consentPreferences = MobileBy.AccessibilityId("Manage Consent Preferences");
    private final By confirmMyChoicesBtn = MobileBy.AccessibilityId("pcConfirmMyChoiceButton");

    //================================================

    public Boolean isWeProcewssYourDataDisplayed(){ return driver.findElement(weProcessYourData).isDisplayed();}
    public Boolean isAllowAllBtnDisplayed(){return driver.findElement(allowAll).isDisplayed();}
    public Boolean isRejectAllBtnSettingsDisplayed(){ return driver.findElement(rejectAll).isDisplayed();}
    public Boolean isManageServicesDisplayed(){return driver.findElement(manageServices).isDisplayed();}
    public Boolean isVendorsListDisplayed(){return driver.findElement(vendorsList).isDisplayed();}
    public Boolean isSDKListDisplayed(){return driver.findElement(sdkList).isDisplayed();}
    public Boolean isConsentPreferencesDisplayed(){return driver.findElement(consentPreferences).isDisplayed();}
    public Boolean isConfirmMyChoicesDisplayed(){return driver.findElement(confirmMyChoicesBtn).isDisplayed();}
    public void tapOnConfirmMyChoices(){driver.findElement(confirmMyChoicesBtn).click();}
    public void clickVendorsList(){driver.findElement(vendorsList).click();}
    public void clickSDKList(){driver.findElement(sdkList).click();}

    private final By searchTxt = MobileBy.AccessibilityId("Search…");
    private final By filterBtn = MobileBy.AccessibilityId("sdkFilterButton");
    private final By allowAllToggle = MobileBy.xpath("//XCUIElementTypeSwitch[@name=\"Allow All Consent\"]");

    //-------------------------------------------------------------------------------------
    public Boolean isSearchTextDisplayed(){ return driver.findElement(searchTxt).isDisplayed();}
    public Boolean isfilterBtnDisplayed(){return driver.findElement(filterBtn).isDisplayed();}
    public Boolean isAllowToggleDisplayed() { return driver.findElement(allowAllToggle).isDisplayed();}
    public void  clickOnfilterBtn() {  driver.findElement(filterBtn).click();}
    public void  clickOnAllow() { driver.findElement(allowAllToggle).click();}
    public void tapAllowAllToggle(){driver.findElement(allowAllToggle).click();}
    //-------------------------------------------------------------------------------------

    public Boolean isPCTitleDisplayed(){ return driver.findElement(pcTitle).isDisplayed();}
    public Boolean isBuzzFeedLogoDisplayed(){return driver.findElement(BuzzFeedLogo).isDisplayed();}
    public Boolean isWeCareAboutYourPrivacyDisplayed(){ return driver.findElement(WeCareAboutYourPrivacy).isDisplayed();}
    public Boolean isWeAndOurPartnersStoreyDisplayed(){return driver.findElement(weAndOurPartnersStore).isDisplayed();}
    public Boolean isWeAndOurPartnersSProcessDataDisplayed(){ return driver.findElement(weAndOurPartnersProcessData).isDisplayed();}
  //  public Boolean isWeCareAboutYourPrivacyDisplayed(){driver.findElement(WeCareAboutYourPrivacy).isDisplayed();}
    public Boolean isActivellyScanDeviceDisplayed(){return driver.findElement(activellyScanDevice).isDisplayed();}
    public Boolean isListOfVendorsDisplayed(){return driver.findElement(listOfPartners).isDisplayed();}
    public Boolean isRejectAllBtnDisplayed(){return driver.findElement(bannerRejectAllBtn).isDisplayed();}
    public Boolean isShowPurpusesDisplayed(){return driver.findElement(showPurpuses).isDisplayed();}

    public void clickOnListOfVendors(){driver.findElement(listOfPartners).click();}
    public void clickOnShowPurposes(){driver.findElement(showPurpuses).click();}


}
