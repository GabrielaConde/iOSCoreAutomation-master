package config.pages.shopping;

import config.pages.CommonPage;
import config.pages.bpage.BpagePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShoppingPage extends CommonPage {

    //Catching elements
  //  private final By shopNowButton = By.xpath("(//XCUIElementTypeButton[@name=\"Shop Now\"])[2]");
    private final By shopNowButton = MobileBy.AccessibilityId("Shop Now");

    private final By shoppingHeader = MobileBy.AccessibilityId("Shopping");

    public Boolean isShoppingHeaderDisplayed(){return driver.findElement(shoppingHeader).isDisplayed();}

    //SHOPPING SEARCH
    private final By shoppingSearch = MobileBy.AccessibilityId("Search BuzzFeed");
//    private final By shoppingSearch = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
   // private final By shoppingSearch = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    private final By BFDisclaimer = By.xpath("//XCUIElementTypeStaticText[@name=\"BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.\"]");
    private final By AmazonProdCell = By.xpath("(//XCUIElementTypeCell[@name=\"product_cell\"])[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther");
    private final By regularBuzzCell = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[]/XCUIElementTypeOther[2]");

    //FEATURE STORIES
    private final By featureStories = MobileBy.AccessibilityId("Featured Stories");
    private final By featureStoriesTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"24 Hilarious Mother’s Day Gifts That’ll Probably Make Her Laugh Out Loud\"]");
    private final By featureStoryCell = By.xpath("//XCUIElementTypeCell[@name=\"shopping_omg_package_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    //Shopping categories
    private final By categoryBeauty = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    private final By fashionCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private final By homeCatgegory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
    private final By kidsCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]");
    private final By petsCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]");
    private final By sexToysCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]");
    private final By storesCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]");
    private final By moreCategory = By.xpath("//XCUIElementTypeCell[@name=\"shopping_categories_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[8]");

    //Shopping menu
    private final By BeautyAndCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Fashion = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Home = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Kids = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Pets = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By SexToys = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Sports = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Stores = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Subscriptions = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Tech = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By accesories = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By footware = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By skincare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By cateogoryName = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Shopping\"]/XCUIElementTypeOther");
    private final By backCategory = By.xpath("(//XCUIElementTypeButton[@name=\"Back\"])[1]");
    private final By categorySplash = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private final By categoryTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"All Categories\"]");
    private final By beautyAndCareTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Beauty + Personal Care\"]");
    private final By FashionTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Fashion\"]");
    private final By backFromMenu = By.xpath("//XCUIElementTypeButton[@name=\"Back\"]");

    //SubMenus Beauty And Personal Care

    private final By ShopBeautyAndPersonalCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Hair = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Makeup = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By OutdoorProducts = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By PersonalTools = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By SkinCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By SkinCareTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Skincare\"]");


    // SkinCare Sub Menues
    private final By acneSolutions = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By body = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By face = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    //SubMenus Fashion
    private final By shopAllFashionSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By AccesoriesSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By DressesSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By FootwareSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By FormalWearSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By JacketsSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By JeansSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By LoungeWearSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By PlantsSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By SweatersSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By SwimsuitsSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By TopsSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By UnderwearSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    //Fashion accesories sub menu
    private final By Bags = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By ColdWeather = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By GlassesAndSunglasses = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Jewerly = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By FashionAccessoriesTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Fashion Accessories\"]");

    // Footware submenu
    private final By footwareTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Footwear\"]");
    private final By Boots = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Dress = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Flats = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Heels = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By OutDoorShoes = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Sandals = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Sneakers = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");


  // Sports and fitness submenu
    private final By ShopAllSportsAndFitness = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By FitnessAndAccessories = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n");
    private final By matchinery = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By PersonalCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    //Shop All Stores submenu

    private final By ShopAllStores = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Amazon = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Etsy = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Nordstrom = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Sephora = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By ShopSmall = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Target = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Walmart = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By WayFair = By.xpath("//XCUIElementTypeApplication[@name='BuzzFeed 🐞']/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By StoresTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Stores\"]");


    //Shop All Homes
    private final By ShopAllHomeSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By BarthroomSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By BeddingMattressSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By CleaningSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By CookingSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By DecorSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By FurnitureSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By HomeOfficeSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By OrganizationSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By OutDoorShoesSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By OutDoorHomeSubMenu = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By HomeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Home\"]");

   // Kitchen submenu
    private final By appliances = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By tools = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By kitchenTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Kitchen\"]");

    // Furniture submenu
    private final By bedroom = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By kidsRoom =  By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By kitchen = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By livingRoom = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By office = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By furnitureTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Furniture\"]");


    // Outdoor home
    private final By backyard = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By garden = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By recreation = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By outdoorHomeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Outdoor Home\"]");

    //Sport + Fitness Sub menu
    private final By sportAndFitnessTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Sports + Fitness\"]");
    private final By showAllSportsAndFitness = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By fitnessAccessories = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By machinery = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By personalCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    // tech sub menu

    private final By techTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Tech\"]");
    private final By shopAllTech = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By techAccesories = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By gadgets = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By homeElectronics = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    // GIFT GUIDE ITEMS
    private final By giftGuideTitle = MobileBy.AccessibilityId("Latest Gift Guides");
    private final By giftGuidesCTALink = MobileBy.AccessibilityId("See all our Gift Guides");
    private final By giftGuideTitleOnScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Gift Guide\"]");
    private final By trendingProductTitle = MobileBy.AccessibilityId("Trending Products");


    // FEATURE STORIES
    private final By featuresStoriesTitle = MobileBy.AccessibilityId("Featured Stories");

    //ALL Stories
    private final By AllStories = MobileBy.AccessibilityId("All Stories");

    // Shopping videos
    private final By fstVideo = By.xpath("(//XCUIElementTypeOther[@name=\"xcThumbnailView\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private final By playButton = MobileBy.AccessibilityId("xcThumbnailPlayImage");
    private final By closeVideo = MobileBy.AccessibilityId("xcCloseButton");








    //======METHODS==========

    //SHOPPING SEARCH METHODS

    //videos

    public Boolean isVideoDisplayed(){
        scroll.scrollUntilElement(fstVideo);
        return driver.findElement(fstVideo).isDisplayed();}

    public void tapOnVideo(){
        driver.findElement(playButton).click();
    }
    public void closeVideo(){driver.findElement(closeVideo).click();}


    public Boolean IsDisclaimerPresent() { return driver.findElement(BFDisclaimer).isDisplayed();}
    public void clickOnShoppingSearch() {driver.findElement(shoppingSearch).click();}
    public void typeSearchElement(String word){
      /*  Actions a = new Actions(driver);
        a.sendKeys(word);
        a.perform();*/
        sendSearchString(word);
    }
    public void tapOnProductCell(){
        driver.findElement(AmazonProdCell).click();
    }

    public void tapOnRegularProduct(){
        driver.findElement(regularBuzzCell).click();
    }

    //GIFT GUIDE METHODS
    public Boolean validateGiftGuideTitle(){ return driver.findElement(giftGuideTitle).isDisplayed();}
    public void tapOnCTAGiftGuideLink() {driver.findElement(giftGuidesCTALink).click();}
    public Boolean validateGiftGuideTitleOnScreen() {return driver.findElement(giftGuideTitleOnScreen).isDisplayed();}
    public Boolean validateTrendingProductsTitle()
    {return false;
            //driver.findElement(trendingProductsTitle).isDisplayed();

            }



    //FEATURE STORIES METHODS

    public void tapOnFeatureStoriesCell(){driver.findElement(featureStoryCell).click();}
    public Boolean featureStoryTitleIsDisplayed(){ return driver.findElement(featureStories).isDisplayed();}



    //SHOP ALL HOMES SUB MENUS
    public void tapOnShopAllHommes(){driver.findElement(ShopAllHomeSubMenu).click();}
    public void tapOnBathroomsSubMenu(){driver.findElement(BarthroomSubMenu).click();}
    public void tapOnBeddingMatressSubMenu(){driver.findElement(BeddingMattressSubMenu).click();}
    public void tapOnCleaningSubMenu(){driver.findElement(CleaningSubMenu).click();}
    public void tapOnKitchenMenu(){driver.findElement(CookingSubMenu).click();}
    public void tapOnDecorSubMenu(){driver.findElement(DecorSubMenu).click();}
    public void tapOnFurnitureSubMenu(){driver.findElement(FurnitureSubMenu).click();}
    public void tapHomeOfficeSubMenu(){driver.findElement(HomeOfficeSubMenu).click();}
    public void tapOnOrganizationSubMenu(){driver.findElement(OrganizationSubMenu).click();}
    public void tapOnOutDoorShoesSubMenu(){driver.findElement(OutDoorShoesSubMenu).click();}
    public void tapOnOutDoorHomeSubMenu(){driver.findElement(OutDoorHomeSubMenu).click();}


    //Kitchen sub menues

    public void tapOnAppliancesSubMenu(){driver.findElement(appliances).click();}
    public void tapOnToolsSubMenu(){driver.findElement(tools).click();}
    public Boolean validateKitchenTitle() {return driver.findElement(kitchenTitle).isDisplayed();}

    // Furniture sub menues

    public void tapOnBedroomSubMenu(){driver.findElement(bedroom).click();}
    public void tapOnKidsRoomSubMenu(){driver.findElement(kidsRoom).click();}
   // public void tapOutdoorSubMenu(){driver.findElement(OutDoorSubMenu).click();}
    public void tapOnKitchenSubMenu() {driver.findElement(kitchen).click();}
    public void tapOnLivingRoomSubMenu() {driver.findElement(livingRoom).click();}
    public Boolean validateFurnitureTitle() {return driver.findElement(furnitureTitle).isDisplayed();}

    //Outdoor sub menues
    public void tapOnBackyardSubMenu() {driver.findElement(backyard).click();}
    public void tapOnGardenSubMenu() {driver.findElement(garden).click();}
    public void tapOnRecreationSubMenu() {driver.findElement(recreation).click();}
    public Boolean validateOnOutDoorTitle() { return driver.findElement(outdoorHomeTitle).isDisplayed();}


    //Outdoor home

    public void tapOnOfficeSubMenu() {driver.findElement(office).click();}




    //Shop All Stores submenu METHODS
    public void tapOnAllShopStores(){driver.findElement(ShopAllStores).click();}
    public void tapOnAmazon(){driver.findElement(Amazon).click();}
    public void tapOnEtsy(){driver.findElement(Etsy).click();}
    public void tapOnNordstram(){driver.findElement(Nordstrom).click();}
    public void tapOnSephora(){driver.findElement(Sephora).click();}
    public void tapOnShopSmail(){driver.findElement(ShopSmall).click();}
    public void tapOnTarget(){driver.findElement(Target).click();}
    public void tapOnAllWalmat(){driver.findElement(Walmart).click();}
    public void tapOnAWayFair(){driver.findElement(WayFair).click();}
    public Boolean validateStoresTitle() { return driver.findElement(StoresTitle).isDisplayed();}

    //




  // Methods to access Sports and Fitness
    public void tapShopAllSportsAndFitnessSubMenu() {driver.findElement(ShopAllSportsAndFitness).click();}
    public void tapFitnessAndAccessoriesSubMenu() {driver.findElement(FitnessAndAccessories).click();}
    public void tapMatchinarySubMenu() {driver.findElement(matchinery).click();}
    public void tapPersonalCareSubMenu() {driver.findElement(PersonalCare).click();}

    // Methods to access Beauty And Personal Care Sub Menu
    public void tapShopBeautyAndPersonalCareSubMenu() {driver.findElement(ShopBeautyAndPersonalCare).click();}
    public void tapHairSubMenu() {driver.findElement(Hair).click();}
    public void tapMakeUpSubMenu() {driver.findElement(Makeup).click();}
    public void tapOutDoorProductsSubMenu() {driver.findElement(OutdoorProducts).click();}
    public void tapPersonalToolsSubMenu() {driver.findElement(PersonalTools).click();}
    public void tapSkinCareSubMenu() {driver.findElement(SkinCare).click();}
    public Boolean validateSkinCareTitle() { return driver.findElement(SkinCareTitle).isDisplayed();}


    // Methods to access SkinCare sub menu
    public void tapAcneSolutionsSubMenu() {driver.findElement(acneSolutions).click();}
    public void tapBodySubMenu() {driver.findElement(body).click();}
    public void tapFaceSubMenu() {driver.findElement(face).click();}



// Methods to access Fashion Sub Menu
    public void tapAllFashionSubMenu() {driver.findElement(ShopBeautyAndPersonalCare).click();}
    public void tapAccesoriesSubMenu() {driver.findElement(AccesoriesSubMenu).click();}
    public void tapDressesSubMenu() {driver.findElement(DressesSubMenu).click();}
    public void tapFootwareSubMenu() {driver.findElement(FootwareSubMenu).click();}
    public void tapFormalWearSubMenu() {driver.findElement(FormalWearSubMenu).click();}
    public void tapJacketsSubMenu() {driver.findElement(JacketsSubMenu).click();}
    public void tapJeansSubMenu() {driver.findElement(JeansSubMenu).click();}
    public void tapLoungeWearSubMenu() {driver.findElement(LoungeWearSubMenu).click();}
    public void tapPlantsSubMenu() {driver.findElement(PlantsSubMenu).click();}
    public void tapSweatersSubMenu() {driver.findElement(SweatersSubMenu).click();}
    public void tapSwimsuitsSubMenu() {driver.findElement(SwimsuitsSubMenu).click();}
    public void tapTopsSubMenu() {driver.findElement(TopsSubMenu).click();}
    public void tapUnderwearSubMenu() {driver.findElement(UnderwearSubMenu).click();}

    // Methods to access Fashion Accessories sub menu
    public void tapOnBagsSubMenu(){driver.findElement(Bags).click();}
    public void tapOnColdWeatherSubMenu(){driver.findElement(ColdWeather).click();}
    public void tapOnGlassesSubMenu(){driver.findElement(GlassesAndSunglasses).click();}
    public void tapOnJewerlySubMenu(){driver.findElement(Jewerly).click();}
    public Boolean validateFashionAccessoriesTitle() { return driver.findElement(FashionAccessoriesTitle).isDisplayed();}

    // Methos to access footware submenu

    public void tapOnBootsSubMenu(){driver.findElement(Boots).click();}
    public void tapOnDressSubMenu(){driver.findElement(Dress).click();}
    public void tapOnFlatsSubMenu(){driver.findElement(Flats).click();}
    public void tapOnHeelsSubMenu(){driver.findElement(Heels).click();}
    public void tapOnOutdoorSubMenu(){driver.findElement(OutDoorShoes).click();}
    public void tapOnSandalsSubMenu(){driver.findElement(Sandals).click();}
    public void tapOnBagsSneakersMenu(){driver.findElement(Sneakers).click();}
    public Boolean validateFootwareTitle() { return driver.findElement(footwareTitle).isDisplayed();}



    public String getCategoryName() { return driver.findElement(cateogoryName).getText();}
    public Boolean verifyFashionCatTitle(){ return driver.findElement(FashionTitle).isDisplayed();}
    public Boolean verifyBeautyAndCareTitle(){ return driver.findElement(beautyAndCareTitle).isDisplayed();}
    public void tapOnCategoryBackBtn(){driver.findElement(backCategory).click();}
    public Boolean verifySplashCategoryLoads(){ return driver.findElement(categorySplash).isDisplayed();}
    public String validateCateroryTitle() {return driver.findElement(categoryTitle).getText();}
    public Boolean validateAllCateroryTitleIsDisplayed() {return driver.findElement(categoryTitle).isDisplayed();}

    public void tapOnBeautyCategory(){driver.findElement(categoryBeauty).click();}
    public void tapOnFashionCategory(){driver.findElement(fashionCategory).click();}
    public void tapOnHomeCategory(){driver.findElement(homeCatgegory).click();}
    public void tapOnKidsCategory(){driver.findElement(kidsCategory).click();}
    public void tapOnBPetsCategory(){driver.findElement(petsCategory).click();}
    public void tapOnSexToysCategory(){driver.findElement(sexToysCategory).click();}
    public void tapOnStoresCategory(){driver.findElement(storesCategory).click();}
    public void tapOnMoreCategory(){driver.findElement(moreCategory).click();}

    public void clickOnBeautyMenu(){driver.findElement(BeautyAndCare).click();}
    public void clickOnFashionMenu(){driver.findElement(Fashion).click();}
    public void clickOnHomeMenu(){driver.findElement(Home).click();}

    //Methods to access Home Sub menues
    public void tapOnShopAllHome(){driver.findElement(ShopAllHomeSubMenu).click();}
    public Boolean validateHomeTitle() { return driver.findElement(HomeTitle).isDisplayed();}

  // Methods to access Sports + Fitness Sub menu
  public void clickOnShopAllSportsAndFitness(){driver.findElement(ShopAllSportsAndFitness).click();}
    public void clickOnFitnessAccessories(){driver.findElement(fitnessAccessories).click();}
    public void clickOnMachinery() {driver.findElement(machinery).click();}
    public void clickOnPersonalCareMenu(){driver.findElement(personalCare).click();}
    public Boolean validateSportsAndFitnessTitle() { return driver.findElement(sportAndFitnessTitle).isDisplayed();}





    public void clickOnKidsMenu(){driver.findElement(Kids).click();}
    public void clickOnPetsMenu(){driver.findElement(Pets).click();}
    public void clickOnSexToysMenu(){driver.findElement(SexToys).click();}
    public void clickOnSportsMenu(){driver.findElement(Sports).click();}
    public void clickOnStoresMenu(){driver.findElement(Stores).click();}
    public void clickOnSubscriptions(){driver.findElement(Subscriptions).click();}
    public void clickOnTechMenu(){driver.findElement(Tech).click();}
    public void clickOnAccesoriesMenu(){driver.findElement(accesories).click();}
    public void clickOnFootwareMenu(){driver.findElement(footware).click();}
    public void skincareMenu() {driver.findElement(skincare).click();}

    // tech menu methods
    public Boolean validateTechTitle() { return driver.findElement(techTitle).isDisplayed();}
    public void shopAllTechMenu() {driver.findElement(shopAllTech).click();}
    public void tapTechAccesoriesMenu() {driver.findElement(techAccesories).click();}
    public void tapgadgetsMenu() {driver.findElement(gadgets).click();}
    public void taphomeElectronicsMenu() {driver.findElement(homeElectronics).click();}


    //Methods
    public boolean shoppingTabIsPresent() {
        return driver.findElement(shoppingTab).isDisplayed();
    }

    public void tapBackFromMenu(){driver.findElement(backFromMenu);}

    public boolean shopNowButtonIsPresent() {
        return driver.findElement(shopNowButton).isDisplayed();
    }

    public void tapShopNowButton() {
        driver.findElement(shopNowButton).click();
        print("Tapped the Shop now button");
    }
}