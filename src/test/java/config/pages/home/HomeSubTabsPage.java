package config.pages.home;

//import com.sun.deploy.util.Waiter;
import com.sun.java.swing.plaf.motif.MotifBorders;
import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;


public class HomeSubTabsPage extends CommonPage {

    //Catching elements
    private final By coronavirusSubTab = By.id("Coronavirus");
    private final By tvMoviesSubTab = By.id("TV & Movies");
    private final By animalsSubTab = By.id("Animals");
    private final By celebritySubTab = By.id("Celebrity");
    private final By booksSubTab = By.id("Books");
    private final By communitySubTab = By.id("Community");
    private final By foodSubTab = By.id("Food");
    private final By healthSubTab = MobileBy.AccessibilityId("Health");
    private final By lgbtqSubTab = By.id("LGBTQ");
    private final By musicSubTab = By.id("Music");
    private final By niftySubTab = By.id("Nifty");
    private final By parentsSubTab = By.id("Parents");
    private final By rewindSubTab = By.id("Rewind");
    private final By styleSubTab = By.id("Style");
    private final By travelSubTab = By.id("Travel");
    private final By ShowsSubTab = By.id("Shows");
    private final By VideosSubTab = By.id("Videos");
    private final By backToMore = MobileBy.AccessibilityId("More");

    //NEW NAV BAR
 /*   private final By recentlyViewedBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By trendingBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By celebrityBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[3]");
    private final By foodBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");
*/

    private final By trendingBtn = MobileBy.AccessibilityId("Trending");
    private final By recentlyViewedBtn = MobileBy.AccessibilityId("Recently Viewed");
    private final By celebrityBtn = MobileBy.AccessibilityId("Celebrity");
    private final By foodBtn = MobileBy.AccessibilityId("Food");

    private final By showsBtn = MobileBy.AccessibilityId("Shows");
    private final By videosBtn = MobileBy.AccessibilityId("Videos");
    private final By animalsBtn = MobileBy.AccessibilityId("Animals");

    private final By showCell = By.xpath("**/XCUIElementTypeCell[`label == \"BuzzFeed Unsolved: True Crime\"`]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    //METHODS NEW NAV
    public void clickOnRecentlyViewedBtn(){driver.findElement(recentlyViewedBtn).click();}
    public void clickOnTrendingBtn(){driver.findElement(trendingBtn).click();}
    public void clickOnCelebrityBtn(){driver.findElement(celebrityBtn).click();}
    public void clickOnFoodBtn(){driver.findElement(foodBtn).click();}

    public void clickOnShowsBtn(){driver.findElement(showsBtn).click();}
    public void clickOnVideosBtn(){driver.findElement(videosBtn).click();}
    public void clickOnAnimalsBtn(){driver.findElement(animalsBtn).click();}

    //Methods
    //--Videos feed
    public Boolean firstVideoIsPresent() {
        WaitersPage.waitForElement(firstVideo);
        return driver.findElement(firstVideo).isDisplayed();
    }

    public void backToMore(){driver.findElement(backToMore).click();}

    //--Tabs name - Active
    public Boolean coronavirusTabIsPresent(){
        return driver.findElement(coronavirusSubTab).isDisplayed();
    }

    public void clickOnShowCell(){driver.findElement(showCell).click();}

    public void clickOnShowstab() {driver.findElement(ShowsSubTab).click();};
    public void clickOnCoronavitustab() {driver.findElement(coronavirusSubTab).click();};
    public void clickOnTrendingtab() {driver.findElement(trendingSubTab).click();};
    public void clickOnTVMoviesTab() {driver.findElement(tvMoviesSubTab).click();}
    public void clickOnVideosTab() {driver.findElement(videosSubTab).click();}
    public void clickOnAnimalstab() {driver.findElement(animalsSubTab).click();};
    public void clickOnCelebritytab() {driver.findElement(celebritySubTab).click();};
    public void clickOnBookstab() {driver.findElement(booksSubTab).click();};
    public void clickOnCommunitytab() {driver.findElement(communitySubTab).click();};
    public void clickOnFoodtab() {driver.findElement(foodSubTab).click();};
    public void clickOnHealthtab() {driver.findElement(healthSubTab).click();};
    public void clickOnLGTBtab() {driver.findElement(lgbtqSubTab).click();};
    public void clickOnMusictab() {driver.findElement(musicSubTab).click();};
    public void clickOnNiftytab() {driver.findElement(niftySubTab).click();};
    public void clickOnParentstab() {driver.findElement(parentsSubTab).click();};
    public void clickRewindtab() {driver.findElement(rewindSubTab).click();};
    public void clickOnStyletab() {driver.findElement(styleSubTab).click();};
    public void clickOnRewindtab() {driver.findElement(rewindSubTab).click();};
    public void clickOnTraveltab() {driver.findElement(travelSubTab).click();};

    public String coronavirusTabIsActive(){
        return driver.findElement(coronavirusSubTab).getAttribute("value");
    }

    public Boolean tvMoviesTabIsPresent(){
        return driver.findElement(tvMoviesSubTab).isDisplayed();
    }

    public String tvMoviesTabIsActive(){
        return driver.findElement(tvMoviesSubTab).getAttribute("value");
    }

    public Boolean animalsTabIsPresent(){
        return driver.findElement(animalsSubTab).isDisplayed();
    }

    public String animalsTabIsActive(){
        return driver.findElement(animalsSubTab).getAttribute("value");
    }

    public Boolean celebrityTabIsPresent(){
        return driver.findElement(celebritySubTab).isDisplayed();
    }

    public String celebrityTabIsActive(){
        return driver.findElement(celebritySubTab).getAttribute("value");
    }

    public Boolean booksTabIsPresent(){
        return driver.findElement(booksSubTab).isDisplayed();
    }

    public String booksTabIsActive(){
        return driver.findElement(booksSubTab).getAttribute("value");
    }

    public Boolean communityTabIsPresent(){
        return driver.findElement(communitySubTab).isDisplayed();
    }

    public String communityTabIsActive(){
        return driver.findElement(communitySubTab).getAttribute("value");
    }

    public Boolean foodTabIsPresent(){
        return driver.findElement(foodSubTab).isDisplayed();
    }

    public String foodTabIsActive(){
        return driver.findElement(foodSubTab).getAttribute("value");
    }

    public Boolean healthTabIsPresent(){
        return driver.findElement(healthSubTab).isDisplayed();
    }

    public String healthTabIsActive(){
        return driver.findElement(healthSubTab).getAttribute("value");
    }

    public Boolean lgbtqTabIsPresent(){
        return driver.findElement(lgbtqSubTab).isDisplayed();
    }

    public String lgbtqTabIsActive(){
        return driver.findElement(lgbtqSubTab).getAttribute("value");
    }

    public Boolean musicTabIsPresent(){
        return driver.findElement(musicSubTab).isDisplayed();
    }

    public String musicTabIsActive(){
        return driver.findElement(musicSubTab).getAttribute("value");
    }

    public Boolean niftyTabIsPresent(){
        return driver.findElement(niftySubTab).isDisplayed();
    }

    public String niftyTabIsActive(){
        return driver.findElement(niftySubTab).getAttribute("value");
    }

    public Boolean parentsTabIsPresent(){
        return driver.findElement(parentsSubTab).isDisplayed();
    }

    public String parentsTabIsActive(){
        return driver.findElement(parentsSubTab).getAttribute("value");
    }

    public Boolean rewindTabIsPresent(){
        return driver.findElement(rewindSubTab).isDisplayed();
    }

    public String rewindTabIsActive(){
        return driver.findElement(rewindSubTab).getAttribute("value");
    }

    public Boolean styleTabIsPresent(){
        return driver.findElement(styleSubTab).isDisplayed();
    }

    public String styleTabIsActive(){
        return driver.findElement(styleSubTab).getAttribute("value");
    }

    public Boolean travelTabIsPresent(){
        return driver.findElement(travelSubTab).isDisplayed();
    }

    public String travelTabIsActive(){
        return driver.findElement(travelSubTab).getAttribute("value");
    }
}
