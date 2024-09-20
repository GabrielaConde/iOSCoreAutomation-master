package config.pages.home;
import io.appium.java_client.AppiumBy;

//import com.sun.deploy.util.Waiter;
//import com.sun.java.swing.plaf.motif.MotifBorders;
import config.pages.CommonPage;
import config.pages.WaitersPage;
//import io.appium.java_client.AppiumBy;
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
    private final By healthSubTab = AppiumBy.accessibilityId("Health");
    private final By lgbtqSubTab = By.id("LGBTQ");
    private final By musicSubTab = By.id("Music");
    private final By niftySubTab = By.id("Nifty");
    private final By parentsSubTab = By.id("Parents");
    private final By rewindSubTab = By.id("Rewind");
    private final By styleSubTab = By.id("Style");
    private final By travelSubTab = By.id("Travel");
    private final By ShowsSubTab = By.id("Shows");
    private final By VideosSubTab = By.id("Videos");
    private final By backToMore = AppiumBy.accessibilityId("More");

    //NEW NAV BAR
 /*   private final By recentlyViewedBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By trendingBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By celebrityBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[3]");
    private final By foodBtn = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");
*/

    private final By trendingBtn = AppiumBy.accessibilityId("Trending");
    private final By recentlyViewedBtn = AppiumBy.accessibilityId("Recently Viewed");
    private final By celebrityBtn = AppiumBy.accessibilityId("Celebrity");
    private final By foodBtn = AppiumBy.accessibilityId("Food");

    private final By showsBtn = AppiumBy.accessibilityId("Shows");
    private final By videosBtn = AppiumBy.accessibilityId("Videos");
    private final By animalsBtn = AppiumBy.accessibilityId("Animals");

    private final By showCell = By.xpath("**/XCUIElementTypeCell[`label == \"BuzzFeed Unsolved: True Crime\"`]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    //METHODS NEW NAV
    public void clickOnRecentlyViewedBtn(){getDriver().findElement(recentlyViewedBtn).click();}
    public void clickOnTrendingBtn(){getDriver().findElement(trendingBtn).click();}
    public void clickOnCelebrityBtn(){getDriver().findElement(celebrityBtn).click();}
    public void clickOnFoodBtn(){getDriver().findElement(foodBtn).click();}

    public void clickOnShowsBtn(){getDriver().findElement(showsBtn).click();}
    public void clickOnVideosBtn(){getDriver().findElement(videosBtn).click();}
    public void clickOnAnimalsBtn(){getDriver().findElement(animalsBtn).click();}

    //Methods
    //--Videos feed
    public Boolean firstVideoIsPresent() {
     //   WaitersPage.waitForElement(firstVideo);
        return getDriver().findElement(firstVideo).isDisplayed();
    }

    public void backToMore(){getDriver().findElement(backToMore).click();}

    //--Tabs name - Active
    public Boolean coronavirusTabIsPresent(){
        return getDriver().findElement(coronavirusSubTab).isDisplayed();
    }

    public void clickOnShowCell(){getDriver().findElement(showCell).click();}

    public void clickOnShowstab() {getDriver().findElement(ShowsSubTab).click();};
    public void clickOnCoronavitustab() {getDriver().findElement(coronavirusSubTab).click();};
    public void clickOnTrendingtab() {getDriver().findElement(trendingSubTab).click();};
    public void clickOnTVMoviesTab() {getDriver().findElement(tvMoviesSubTab).click();}
    public void clickOnVideosTab() {getDriver().findElement(videosSubTab).click();}
    public void clickOnAnimalstab() {getDriver().findElement(animalsSubTab).click();};
    public void clickOnCelebritytab() {getDriver().findElement(celebritySubTab).click();};
    public void clickOnBookstab() {getDriver().findElement(booksSubTab).click();};
    public void clickOnCommunitytab() {getDriver().findElement(communitySubTab).click();};
    public void clickOnFoodtab() {getDriver().findElement(foodSubTab).click();};
    public void clickOnHealthtab() {getDriver().findElement(healthSubTab).click();};
    public void clickOnLGTBtab() {getDriver().findElement(lgbtqSubTab).click();};
    public void clickOnMusictab() {getDriver().findElement(musicSubTab).click();};
    public void clickOnNiftytab() {getDriver().findElement(niftySubTab).click();};
    public void clickOnParentstab() {getDriver().findElement(parentsSubTab).click();};
    public void clickRewindtab() {getDriver().findElement(rewindSubTab).click();};
    public void clickOnStyletab() {getDriver().findElement(styleSubTab).click();};
    public void clickOnRewindtab() {getDriver().findElement(rewindSubTab).click();};
    public void clickOnTraveltab() {getDriver().findElement(travelSubTab).click();};

    public String coronavirusTabIsActive(){
        return getDriver().findElement(coronavirusSubTab).getAttribute("value");
    }

    public Boolean tvMoviesTabIsPresent(){
        return getDriver().findElement(tvMoviesSubTab).isDisplayed();
    }

    public String tvMoviesTabIsActive(){
        return getDriver().findElement(tvMoviesSubTab).getAttribute("value");
    }

    public Boolean animalsTabIsPresent(){
        return getDriver().findElement(animalsSubTab).isDisplayed();
    }

    public String animalsTabIsActive(){
        return getDriver().findElement(animalsSubTab).getAttribute("value");
    }

    public Boolean celebrityTabIsPresent(){
        return getDriver().findElement(celebritySubTab).isDisplayed();
    }

    public String celebrityTabIsActive(){
        return getDriver().findElement(celebritySubTab).getAttribute("value");
    }

    public Boolean booksTabIsPresent(){
        return getDriver().findElement(booksSubTab).isDisplayed();
    }

    public String booksTabIsActive(){
        return getDriver().findElement(booksSubTab).getAttribute("value");
    }

    public Boolean communityTabIsPresent(){
        return getDriver().findElement(communitySubTab).isDisplayed();
    }

    public String communityTabIsActive(){
        return getDriver().findElement(communitySubTab).getAttribute("value");
    }

    public Boolean foodTabIsPresent(){
        return getDriver().findElement(foodSubTab).isDisplayed();
    }

    public String foodTabIsActive(){
        return getDriver().findElement(foodSubTab).getAttribute("value");
    }

    public Boolean healthTabIsPresent(){
        return getDriver().findElement(healthSubTab).isDisplayed();
    }

    public String healthTabIsActive(){
        return getDriver().findElement(healthSubTab).getAttribute("value");
    }

    public Boolean lgbtqTabIsPresent(){
        return getDriver().findElement(lgbtqSubTab).isDisplayed();
    }

    public String lgbtqTabIsActive(){
        return getDriver().findElement(lgbtqSubTab).getAttribute("value");
    }

    public Boolean musicTabIsPresent(){
        return getDriver().findElement(musicSubTab).isDisplayed();
    }

    public String musicTabIsActive(){
        return getDriver().findElement(musicSubTab).getAttribute("value");
    }

    public Boolean niftyTabIsPresent(){
        return getDriver().findElement(niftySubTab).isDisplayed();
    }

    public String niftyTabIsActive(){
        return getDriver().findElement(niftySubTab).getAttribute("value");
    }

    public Boolean parentsTabIsPresent(){
        return getDriver().findElement(parentsSubTab).isDisplayed();
    }

    public String parentsTabIsActive(){
        return getDriver().findElement(parentsSubTab).getAttribute("value");
    }

    public Boolean rewindTabIsPresent(){
        return getDriver().findElement(rewindSubTab).isDisplayed();
    }

    public String rewindTabIsActive(){
        return getDriver().findElement(rewindSubTab).getAttribute("value");
    }

    public Boolean styleTabIsPresent(){
        return getDriver().findElement(styleSubTab).isDisplayed();
    }

    public String styleTabIsActive(){
        return getDriver().findElement(styleSubTab).getAttribute("value");
    }

    public Boolean travelTabIsPresent(){
        return getDriver().findElement(travelSubTab).isDisplayed();
    }

    public String travelTabIsActive(){
        return getDriver().findElement(travelSubTab).getAttribute("value");
    }
}
