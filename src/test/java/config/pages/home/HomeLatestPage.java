package config.pages.home;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomeLatestPage extends CommonPage {


    //Catching elements
    //--Home elements

    //NEW TAB NABS
  //  private final By recentlyViewed = MobileBy.AccessibilityId("⏳ Recently Viewed");
  //  private final By backHome = MobileBy.AccessibilityId("Home");
    private final By trendingVideosTitle = MobileBy.AccessibilityId("Trending Videos");
    private final By trendingVideoCell = By.xpath("(//XCUIElementTypeOther[@name=\"xcThumbnailView\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By playVideo = By.xpath("(//XCUIElementTypeImage[@name=\"xcThumbnailPlayImage\"])[1]");
    private final By closeVideo = By.xpath("xcCloseButton");

    private final By backHome = MobileBy.AccessibilityId("Home");
    private final By showCell = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_image_cell\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
 //   private final By backHome = By.xpath("(//XCUIElementTypeButton[@name=\"Back\"])[1]");
 //   private final By recentlyViewed = By.xpath("//*[contains(@name,'Recently Viewed')]");
    private final By recentlyViewed = MobileBy.AccessibilityId("Recently Viewed");
 //   private final By recentlyViewed = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
 //   private final By trending = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By trending = MobileBy.AccessibilityId("Trending");
    private final By celebrity = MobileBy.AccessibilityId("Celebrity");
  //  private final By celebrity = By.xpath("**/XCUIElementTypeCollectionView[`name == \"BUFFET_COLLECTION\"`]/XCUIElementTypeOther/XCUIElementTypeButton[3]");
    private final By food = MobileBy.AccessibilityId("Food");
 //   private final By food = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");
    private final By tvAndMovies = MobileBy.AccessibilityId("TV & Movies");
 //   private final By tvAndMovies = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[5]");
   // private final By more = By.xpath("//*[contains(@name,'More')]");
 //   private final By more = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[6]");
    private final By more = MobileBy.AccessibilityId("More");

  //  private final By coronavirus = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By coronavirus = MobileBy.AccessibilityId("Coronavirus");

    private final By videos = MobileBy.AccessibilityId("Videos");
  //  private final By shopping = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

 //   private final By videos = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By shows = MobileBy.AccessibilityId("Shows");
 //   private final By shows = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By animals = MobileBy.AccessibilityId("Animals");
//    private final By animals = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By books = MobileBy.AccessibilityId("Books");
 //   private final By books = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By community = MobileBy.AccessibilityId("Community");
  //  private final By community = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By health = MobileBy.AccessibilityId("Health");
 //   private final By health = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By lgbtq = MobileBy.AccessibilityId("LGBTQ");
 //   private final By lgbtq = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By music = MobileBy.AccessibilityId("Music");
  //  private final By music = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By nifty = MobileBy.AccessibilityId("Nifty");
  //  private final By nifty = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
 //   private final By parents = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By parents = MobileBy.AccessibilityId("Parents");

    private final By rewind = MobileBy.AccessibilityId("Rewind");
 //   private final By rewind = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

   private final By style = MobileBy.AccessibilityId("Style");
 //   private final By style = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By travel = MobileBy.AccessibilityId("Travel");
  //  private final By travel = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");



    //ELEMENTS

    private final By maybeLaterBtn = MobileBy.AccessibilityId("Maybe later");
    private final By shoppingPackageCTA =  By.xpath("//*[contains(@name,'Find even more')]");
    private final By trendingCell = By.xpath("//XCUIElementTypeCell[@name='trending_products_package_cell']/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By firstCellShoppingRecommendations = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[1]/XCUIElementTypeOther[2]");
    private final By firstShopNowButton = By.xpath("(//XCUIElementTypeButton[@name='Shop Now'])[1]");
    private final By collectDataDisclaimer = MobileBy.AccessibilityId("BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.");
    private final By trendingVideosHeader = MobileBy.AccessibilityId("Trending Videos");
    private final By seeMoreVideoButton = MobileBy.AccessibilityId("See More Video");
    private final By homeFooter = By.xpath("//XCUIElementTypeButton[@name=\"home\"]");


    //Methods
    //--Allow button + BuzzFeed logo
    public void backHome(){driver.findElement(backHome).click();}
    public void clickShowCell(){driver.findElement(showCell).click();}
    public boolean allowButtonIsPresent() {
        return driver.findElement(allowButton).isDisplayed();
    }
    public void clickOnMaybeLater(){driver.findElement(maybeLaterBtn).click();}

    public void clickOnHomeIcon() {driver.findElement(homeFooter).click();}

    //Trending videos
    public Boolean validateTrendingVideosTitle() { return driver.findElement(trendingVideosTitle).isDisplayed();}
    public void tapOnTrendingVideo() {driver.findElement(playVideo).click();}
    public void closeTrendingVideo() {driver.findElement(closeVideo).click();}

    //--Splash
    public void dismissTooltip() {
         driver.findElement(dismissTooltip).click();
    }

    //--Shopping package
    public void tapItemsShopPackage(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            tapBackButton();
            System.out.println("Tapped item: " + x  + " from 'Shopping' Package");
            x++;
        }
        print("Tapped all items from 'Shopping' package");
    }

    public void tapOnRecentlyViewed(){driver.findElement(recentlyViewed).click();}
    public void tapOnTrending(){driver.findElement(trending).click();}
    public void tapOnCelebrity(){driver.findElement(celebrity).click();}
    public void tapOnFood(){driver.findElement(food).click();}
    public void tapOnTVAndMovies(){driver.findElement(tvAndMovies).click();}
    public void tapOnMore(){driver.findElement(more).click();}
    public void tapOnCoronavirus(){driver.findElement(coronavirus).click();}
  //  public void tapOnShopping(){driver.findElement(shopping).click();}
    public void tapOnVideos(){driver.findElement(videos).click();}
    public void tapOnShows(){driver.findElement(shows).click();}
    public void tapOnAnimals(){driver.findElement(animals).click();}
    public void tapOnBooks(){driver.findElement(books).click();}
    public void tapOnCommunity(){driver.findElement(community).click();}
    public void tapOnHealth(){driver.findElement(health).click();}
    public void tapOnLGBTQ(){driver.findElement(lgbtq).click();}
    public void tapOnMusic(){driver.findElement(music).click();}
    public void tapOnNifty(){driver.findElement(nifty).click();}
    public void tapOnParents(){driver.findElement(parents).click();}
    public void tapOnRewind(){driver.findElement(rewind).click();}
    public void tapOnStyle(){driver.findElement(style).click();}
    public void tapOnTravel(){driver.findElement(travel).click();}



    public Boolean shoppingPackageCTAButtonIsPresent() {
        return driver.findElement(shoppingPackageCTA).isDisplayed();
    }

    public void tapShoppingCTAButton(){
        driver.findElement(shoppingPackageCTA).click();
        print("Tapped Shopping Package CTA button: 'Find even more shopping recommendations'");
    }

    public void tapFirstCellShoppingRecommendations(){
        driver.findElement(firstCellShoppingRecommendations).click();
        print("Tapped First Bpage on Shopping Recommendations feed");
    }

    //--Trending products package
    public void scrollDownToTrending(){
        scroll.scrollDown6Times();
      //  scroll.scrollDown90_20();
        scroll.scrollUntilElement(trendingCell);

    }

    public void tapFirstTrendingCell(){
        driver.findElement(trendingCell).click();
        print("Tapped first trending cell");
    }

    public Boolean firstShopNowButtonIsPresent(){
        return driver.findElement(firstShopNowButton).isDisplayed();
    }

    public Boolean collectDataDisclaimerIsPresent() {
        scroll.scrollDown90_50();
        return driver.findElement(collectDataDisclaimer).isDisplayed();
    }

    public void tapFirstShowNowTrendingProduct(){
        WaitersPage.waitForElement(firstShopNowButton);
        driver.findElement(firstShopNowButton).click();
        print("Tapped first 'Show Now' button");
    }

    //--Trending videos package
    public void scrollDownToVideos(){
        scroll.scrollDown();
        scroll.scrollDown90_78();
    }

    public void tapItemVideosPackage(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            tapCloseButton();
            System.out.println("Tapped item: " + x  + "from 'Trending Videos' Package");
            x++;
        }
        print("Tapped all items from 'Trending Videos' package");
    }

    public Boolean videosHeaderIsPresent() {
        return driver.findElement(trendingVideosHeader).isDisplayed();
    }

    public Boolean seeMoreVideoButtonIsPresent() {
        return driver.findElement(seeMoreVideoButton).isDisplayed();
    }

    public void tapSeeMoreButton(){
        driver.findElement(seeMoreVideoButton).click();
        print("Tapped 'See More Video' button");
    }
}
