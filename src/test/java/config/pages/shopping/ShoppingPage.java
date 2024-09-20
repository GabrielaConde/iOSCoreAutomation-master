package config.pages.shopping;

import config.pages.CommonPage;
import config.pages.bpage.BpagePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShoppingPage extends CommonPage {

    //Catching elements
  //  private final By shopNowButton = By.xpath("(//XCUIElementTypeButton[@name=\"Shop Now\"])[2]");
    private final By shopNowButton = AppiumBy.accessibilityId("Shop Now");

    private final By shoppingHeader = AppiumBy.accessibilityId("Shopping");

    public Boolean isShoppingHeaderDisplayed(){return getDriver().findElement(shoppingHeader).isDisplayed();}

    //SHOPPING SEARCH
    private final By shoppingSearch = AppiumBy.accessibilityId("Search BuzzFeed");
//    private final By shoppingSearch = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
   // private final By shoppingSearch = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    private final By BFDisclaimer = By.xpath("//XCUIElementTypeStaticText[@name=\"BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.\"]");
    private final By AmazonProdCell = By.xpath("(//XCUIElementTypeCell[@name=\"product_cell\"])[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther");
    private final By regularBuzzCell = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[]/XCUIElementTypeOther[2]");

    //FEATURE STORIES
    private final By featureStories = AppiumBy.accessibilityId("Featured Stories");
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

   private final By  BeautyAndCare = AppiumBy.accessibilityId("Beauty + Personal Care");
  //  private final By BeautyAndCare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By Fashion = AppiumBy.accessibilityId("Fashion");
    private final By Home =  AppiumBy.accessibilityId("Home");
    private final By ShopAllHome =  AppiumBy.accessibilityId("Shop All Home");
    private final By Kids = AppiumBy.accessibilityId("Kids");
    private final By Pets = AppiumBy.accessibilityId("Pets");
    private final By SexToys = AppiumBy.accessibilityId("Sex Toys");
    private final By Sports = AppiumBy.accessibilityId("Sports + Fitness");
    private final By Stores = AppiumBy.accessibilityId("Stores");
    private final By Subscriptions = AppiumBy.accessibilityId("Subscriptions");
    private final By Tech = AppiumBy.accessibilityId("Tech");
    private final By accesories = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By footware = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By skincare = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By cateogoryName = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Shopping\"]/XCUIElementTypeOther");
    private final By backCategory = By.xpath("(//XCUIElementTypeButton[@name=\"Back\"])[1]");
    private final By categorySplash = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private final By categoryTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"All Categories\"]");
    private final By beautyAndCareTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Beauty + Personal Care\"]");

 //   private final By beautyAndCareTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Beauty + Personal Care\"]");
    private final By FashionTitle = AppiumBy.accessibilityId("Fashion");
    private final By backFromMenu = By.xpath("//XCUIElementTypeButton[@name=\"Back\"]");

    //SubMenus Beauty And Personal Care

    private final By ShopBeautyAndPersonalCare = AppiumBy.accessibilityId("Shop All Beauty + Personal Care");
    private final By Hair = AppiumBy.accessibilityId("Hair");
    private final By Makeup = AppiumBy.accessibilityId("Makeup");
    private final By OutdoorProducts = AppiumBy.accessibilityId("Outdoor Products");
    private final By PersonalTools = AppiumBy.accessibilityId("Personal Tools + Accessories");
    private final By SkinCare = AppiumBy.accessibilityId("Skincare");
    private final By SkinCareTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Skincare\"]");


    // SkinCare Sub Menues
    private final By acneSolutions = AppiumBy.accessibilityId("Acne Solutions");
    private final By body = AppiumBy.accessibilityId("Body");
    private final By face = AppiumBy.accessibilityId("Face");

    //SubMenus Fashion
    private final By shopAllFashionSubMenu = AppiumBy.accessibilityId("Shop All Fashion");
    private final By AccesoriesSubMenu = AppiumBy.accessibilityId("Fashion Accessories");
    private final By DressesSubMenu = AppiumBy.accessibilityId("Dresses");
    private final By FootwareSubMenu = AppiumBy.accessibilityId("Footwear");
    private final By FormalWearSubMenu = AppiumBy.accessibilityId("Formal Wear");
    private final By JacketsSubMenu = AppiumBy.accessibilityId("Jackets");
    private final By JeansSubMenu = AppiumBy.accessibilityId("Jeans");
    private final By LoungeWearSubMenu = AppiumBy.accessibilityId("Loungewear");
    private final By PlantsSubMenu = AppiumBy.accessibilityId("Pants");
    private final By SweatersSubMenu = AppiumBy.accessibilityId("Sweaters");
    private final By SwimsuitsSubMenu = AppiumBy.accessibilityId("Swimsuits");
    private final By TopsSubMenu = AppiumBy.accessibilityId("Tops");
    private final By UnderwearSubMenu = AppiumBy.accessibilityId("Underwear");

    //Fashion accesories sub menu
    private final By Bags = AppiumBy.accessibilityId("Bags");
    private final By ColdWeather = AppiumBy.accessibilityId("Cold Weather");
    private final By GlassesAndSunglasses = AppiumBy.accessibilityId("Glasses + Sunglasses");
    private final By Jewerly = AppiumBy.accessibilityId("Jewelry");
    private final By FashionAccessoriesTitle = By.xpath("//XCUIElementTypeNavigationBar[@name=\"Fashion Accessories\"]");

    // Footware submenu
    private final By footwareTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Footwear\"]");
    private final By Boots = AppiumBy.accessibilityId("Boots");
    private final By Dress = AppiumBy.accessibilityId("Dress");
    private final By Flats = AppiumBy.accessibilityId("Flats");
    private final By Heels = AppiumBy.accessibilityId("Heels");
    private final By OutDoorShoes = AppiumBy.accessibilityId("OutDoor Shoes");
    private final By Sandals = AppiumBy.accessibilityId("Sandals");
    private final By Sneakers = AppiumBy.accessibilityId("Sneakers");


  // Sports and fitness submenu
    private final By ShopAllSportsAndFitness = AppiumBy.accessibilityId("Shop All Sports + Fitness");
    private final By FitnessAndAccessories = AppiumBy.accessibilityId("Fitness Accessories");
    private final By matchinery = AppiumBy.accessibilityId("Machinery");
    private final By PersonalCare = AppiumBy.accessibilityId("Personal Care");

    //Shop All Stores submenu

    private final By ShopAllStores = AppiumBy.accessibilityId("Shop All Stores");
    private final By Amazon = AppiumBy.accessibilityId("Amazon");
    private final By Etsy = AppiumBy.accessibilityId("Etsy");
    private final By Nordstrom = AppiumBy.accessibilityId("Nordstrom");
    private final By Sephora = AppiumBy.accessibilityId("Sephora");
    private final By ShopSmall = AppiumBy.accessibilityId("Shop Small");
    private final By Target = AppiumBy.accessibilityId("Target");
    private final By Walmart = AppiumBy.accessibilityId("Walmart");
    private final By WayFair = AppiumBy.accessibilityId("Wayfair");
    private final By StoresTitle = AppiumBy.accessibilityId("StoresTitle");


    //Shop All Homes
    private final By ShopAllHomeSubMenu = AppiumBy.accessibilityId("Shop All Home");
    private final By BarthroomSubMenu = AppiumBy.accessibilityId("Bathroom");
    private final By BeddingMattressSubMenu = AppiumBy.accessibilityId("Bedding + Mattress");
    private final By CleaningSubMenu = AppiumBy.accessibilityId("Cleaning");
    private final By CookingSubMenu = AppiumBy.accessibilityId("Kitchen");
    private final By DecorSubMenu = AppiumBy.accessibilityId("Decor");
    private final By FurnitureSubMenu = AppiumBy.accessibilityId("Furniture");
    private final By HomeOfficeSubMenu = AppiumBy.accessibilityId("Home Office");
    private final By OrganizationSubMenu = AppiumBy.accessibilityId("Organization");
    private final By OutDoorShoesSubMenu = AppiumBy.accessibilityId("Outdoor Shoes");
    private final By OutDoorHomeSubMenu = AppiumBy.accessibilityId("Outdoor Home");
    private final By HomeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Home\"]");

   // Kitchen submenu
    private final By appliances = AppiumBy.accessibilityId("Appliances");
    private final By tools = AppiumBy.accessibilityId("Tools");
    private final By kitchenTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Kitchen\"]");

    // Furniture submenu
    private final By bedroom = AppiumBy.accessibilityId("Bedroom");
    private final By kidsRoom =  AppiumBy.accessibilityId("Kids Room");
    private final By kitchen = AppiumBy.accessibilityId("Kitchen");
    private final By livingRoom = AppiumBy.accessibilityId("Living Room");
    private final By office = AppiumBy.accessibilityId("Office");
    private final By furnitureTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Furniture\"]");


    // Outdoor home
    private final By backyard = AppiumBy.accessibilityId("Backyard");
    private final By garden =  AppiumBy.accessibilityId("Garden");
    private final By recreation = AppiumBy.accessibilityId("Recreation");
    private final By outdoorHomeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Outdoor Home\"]");

    //Sport + Fitness Sub menu
    private final By sportAndFitnessTitle = AppiumBy.accessibilityId("Shop All Sports + Fitness");
    private final By showAllSportsAndFitness = AppiumBy.accessibilityId("Shop All Sports + Fitness");
    private final By fitnessAccessories = AppiumBy.accessibilityId("Shop All Sports + Fitness");
    private final By machinery = AppiumBy.accessibilityId("Machinery");
    private final By personalCare = AppiumBy.accessibilityId("Personal Care");

    // tech sub menu

    private final By techTitle = AppiumBy.accessibilityId("Shop All Tech");
    private final By shopAllTech = AppiumBy.accessibilityId("Shop All Tech");
    private final By techAccesories = AppiumBy.accessibilityId("Tech Accessories");
    private final By gadgets = AppiumBy.accessibilityId("Gadgets");
    private final By homeElectronics = AppiumBy.accessibilityId("Home Electronics");

    // GIFT GUIDE ITEMS
    private final By giftGuideTitle = AppiumBy.accessibilityId("Latest Gift Guides");
    private final By giftGuidesCTALink = AppiumBy.accessibilityId("See all our Gift Guides");
    private final By giftGuideTitleOnScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Gift Guide\"]");
    private final By trendingProductTitle = AppiumBy.accessibilityId("Trending Products");


    // FEATURE STORIES
    private final By featuresStoriesTitle = AppiumBy.accessibilityId("Featured Stories");

    //ALL Stories
    private final By AllStories = AppiumBy.accessibilityId("All Stories");

    // Shopping videos
    private final By fstVideo = By.xpath("(//XCUIElementTypeOther[@name=\"xcThumbnailView\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private final By playButton = AppiumBy.accessibilityId("xcThumbnailPlayImage");
    private final By closeVideo = AppiumBy.accessibilityId("xcCloseButton");








    //======METHODS==========

    //SHOPPING SEARCH METHODS

    //videos

    public Boolean isVideoDisplayed(){
        scroll.scrollUntilElement(fstVideo);
        return getDriver().findElement(fstVideo).isDisplayed();}

    public void tapOnVideo(){
        getDriver().findElement(playButton).click();
    }
    public void closeVideo(){getDriver().findElement(closeVideo).click();}


    public Boolean IsDisclaimerPresent() { return getDriver().findElement(BFDisclaimer).isDisplayed();}
    public void clickOnShoppingSearch() {getDriver().findElement(shoppingSearch).click();}
    public void typeSearchElement(String word){
      /*  Actions a = new Actions(getDriver());
        a.sendKeys(word);
        a.perform();*/
        sendSearchString(word);
    }
    public void tapOnProductCell(){
        getDriver().findElement(AmazonProdCell).click();
    }

    public void tapOnRegularProduct(){
        getDriver().findElement(regularBuzzCell).click();
    }

    //GIFT GUIDE METHODS
    public Boolean validateGiftGuideTitle(){ return getDriver().findElement(giftGuideTitle).isDisplayed();}
    public void tapOnCTAGiftGuideLink() {getDriver().findElement(giftGuidesCTALink).click();}
    public Boolean validateGiftGuideTitleOnScreen() {return getDriver().findElement(giftGuideTitleOnScreen).isDisplayed();}
    public Boolean validateTrendingProductsTitle()
    {return false;
            //getDriver().findElement(trendingProductsTitle).isDisplayed();

            }



    //FEATURE STORIES METHODS

    public void tapOnFeatureStoriesCell(){getDriver().findElement(featureStoryCell).click();}
    public Boolean featureStoryTitleIsDisplayed(){ return getDriver().findElement(featureStories).isDisplayed();}



    //SHOP ALL HOMES SUB MENUS
    public void tapOnShopAllHommes(){getDriver().findElement(ShopAllHomeSubMenu).click();}
    public void tapOnBathroomsSubMenu(){getDriver().findElement(BarthroomSubMenu).click();}
    public void tapOnBeddingMatressSubMenu(){getDriver().findElement(BeddingMattressSubMenu).click();}
    public void tapOnCleaningSubMenu(){getDriver().findElement(CleaningSubMenu).click();}
    public void tapOnKitchenMenu(){getDriver().findElement(CookingSubMenu).click();}
    public void tapOnDecorSubMenu(){getDriver().findElement(DecorSubMenu).click();}
    public void tapOnFurnitureSubMenu(){getDriver().findElement(FurnitureSubMenu).click();}
    public void tapHomeOfficeSubMenu(){getDriver().findElement(HomeOfficeSubMenu).click();}
    public void tapOnOrganizationSubMenu(){getDriver().findElement(OrganizationSubMenu).click();}
    public void tapOnOutDoorShoesSubMenu(){getDriver().findElement(OutDoorShoesSubMenu).click();}
    public void tapOnOutDoorHomeSubMenu(){getDriver().findElement(OutDoorHomeSubMenu).click();}


    //Kitchen sub menues

    public void tapOnAppliancesSubMenu(){getDriver().findElement(appliances).click();}
    public void tapOnToolsSubMenu(){getDriver().findElement(tools).click();}
    public Boolean validateKitchenTitle() {return getDriver().findElement(kitchenTitle).isDisplayed();}

    // Furniture sub menues

    public void tapOnBedroomSubMenu(){getDriver().findElement(bedroom).click();}
    public void tapOnKidsRoomSubMenu(){getDriver().findElement(kidsRoom).click();}
   // public void tapOutdoorSubMenu(){driver.findElement(OutDoorSubMenu).click();}
    public void tapOnKitchenSubMenu() {getDriver().findElement(kitchen).click();}
    public void tapOnLivingRoomSubMenu() {getDriver().findElement(livingRoom).click();}
    public Boolean validateFurnitureTitle() {return getDriver().findElement(furnitureTitle).isDisplayed();}

    //Outdoor sub menues
    public void tapOnBackyardSubMenu() {getDriver().findElement(backyard).click();}
    public void tapOnGardenSubMenu() {getDriver().findElement(garden).click();}
    public void tapOnRecreationSubMenu() {getDriver().findElement(recreation).click();}
    public Boolean validateOnOutDoorTitle() { return getDriver().findElement(outdoorHomeTitle).isDisplayed();}


    //Outdoor home

    public void tapOnOfficeSubMenu() {getDriver().findElement(office).click();}




    //Shop All Stores submenu METHODS
    public void tapOnAllShopStores(){getDriver().findElement(ShopAllStores).click();}
    public void tapOnAmazon(){getDriver().findElement(Amazon).click();}
    public void tapOnEtsy(){getDriver().findElement(Etsy).click();}
    public void tapOnNordstram(){getDriver().findElement(Nordstrom).click();}
    public void tapOnSephora(){getDriver().findElement(Sephora).click();}
    public void tapOnShopSmail(){getDriver().findElement(ShopSmall).click();}
    public void tapOnTarget(){getDriver().findElement(Target).click();}
    public void tapOnAllWalmat(){getDriver().findElement(Walmart).click();}
    public void tapOnAWayFair(){getDriver().findElement(WayFair).click();}
    public Boolean validateStoresTitle() { return getDriver().findElement(StoresTitle).isDisplayed();}

    //




  // Methods to access Sports and Fitness
    public void tapShopAllSportsAndFitnessSubMenu() {getDriver().findElement(ShopAllSportsAndFitness).click();}
    public void tapFitnessAndAccessoriesSubMenu() {getDriver().findElement(FitnessAndAccessories).click();}
    public void tapMatchinarySubMenu() {getDriver().findElement(matchinery).click();}
    public void tapPersonalCareSubMenu() {getDriver().findElement(PersonalCare).click();}

    // Methods to access Beauty And Personal Care Sub Menu
    public void tapShopBeautyAndPersonalCareSubMenu() {getDriver().findElement(ShopBeautyAndPersonalCare).click();}
    public void tapHairSubMenu() {getDriver().findElement(Hair).click();}
    public void tapMakeUpSubMenu() {getDriver().findElement(Makeup).click();}
    public void tapOutDoorProductsSubMenu() {getDriver().findElement(OutdoorProducts).click();}
    public void tapPersonalToolsSubMenu() {getDriver().findElement(PersonalTools).click();}
    public void tapSkinCareSubMenu() {getDriver().findElement(SkinCare).click();}
    public Boolean validateSkinCareTitle() { return getDriver().findElement(SkinCareTitle).isDisplayed();}


    // Methods to access SkinCare sub menu
    public void tapAcneSolutionsSubMenu() {getDriver().findElement(acneSolutions).click();}
    public void tapBodySubMenu() {getDriver().findElement(body).click();}
    public void tapFaceSubMenu() {getDriver().findElement(face).click();}



// Methods to access Fashion Sub Menu
    public void tapAllFashionSubMenu() {getDriver().findElement(shopAllFashionSubMenu).click();}
    public void tapAccesoriesSubMenu() {getDriver().findElement(AccesoriesSubMenu).click();}
    public void tapDressesSubMenu() {getDriver().findElement(DressesSubMenu).click();}
    public void tapFootwareSubMenu() {getDriver().findElement(FootwareSubMenu).click();}
    public void tapFormalWearSubMenu() {getDriver().findElement(FormalWearSubMenu).click();}
    public void tapJacketsSubMenu() {getDriver().findElement(JacketsSubMenu).click();}
    public void tapJeansSubMenu() {getDriver().findElement(JeansSubMenu).click();}
    public void tapLoungeWearSubMenu() {getDriver().findElement(LoungeWearSubMenu).click();}
    public void tapPlantsSubMenu() {getDriver().findElement(PlantsSubMenu).click();}
    public void tapSweatersSubMenu() {getDriver().findElement(SweatersSubMenu).click();}
    public void tapSwimsuitsSubMenu() {getDriver().findElement(SwimsuitsSubMenu).click();}
    public void tapTopsSubMenu() {getDriver().findElement(TopsSubMenu).click();}
    public void tapUnderwearSubMenu() {getDriver().findElement(UnderwearSubMenu).click();}

    // Methods to access Fashion Accessories sub menu
    public void tapOnBagsSubMenu(){getDriver().findElement(Bags).click();}
    public void tapOnColdWeatherSubMenu(){getDriver().findElement(ColdWeather).click();}
    public void tapOnGlassesSubMenu(){getDriver().findElement(GlassesAndSunglasses).click();}
    public void tapOnJewerlySubMenu(){getDriver().findElement(Jewerly).click();}
    public Boolean validateFashionAccessoriesTitle() { return getDriver().findElement(FashionAccessoriesTitle).isDisplayed();}

    // Methos to access footware submenu

    public void tapOnBootsSubMenu(){getDriver().findElement(Boots).click();}
    public void tapOnDressSubMenu(){getDriver().findElement(Dress).click();}
    public void tapOnFlatsSubMenu(){getDriver().findElement(Flats).click();}
    public void tapOnHeelsSubMenu(){getDriver().findElement(Heels).click();}
    public void tapOnOutdoorSubMenu(){getDriver().findElement(OutDoorShoes).click();}
    public void tapOnSandalsSubMenu(){getDriver().findElement(Sandals).click();}
    public void tapOnBagsSneakersMenu(){getDriver().findElement(Sneakers).click();}
    public Boolean validateFootwareTitle() { return getDriver().findElement(footwareTitle).isDisplayed();}



    public String getCategoryName() { return getDriver().findElement(cateogoryName).getText();}
    public Boolean verifyFashionCatTitle(){ return getDriver().findElement(FashionTitle).isDisplayed();}
    public Boolean verifyBeautyAndCareTitle(){ return getDriver().findElement(beautyAndCareTitle).isDisplayed();}
    public void tapOnCategoryBackBtn(){getDriver().findElement(backCategory).click();}
    public Boolean verifySplashCategoryLoads(){ return getDriver().findElement(categorySplash).isDisplayed();}
    public String validateCateroryTitle() {return getDriver().findElement(categoryTitle).getText();}
    public Boolean validateAllCateroryTitleIsDisplayed() {return getDriver().findElement(categoryTitle).isDisplayed();}

    public void tapOnBeautyCategory(){getDriver().findElement(categoryBeauty).click();}
    public void tapOnFashionCategory(){getDriver().findElement(fashionCategory).click();}
    public void tapOnHomeCategory(){getDriver().findElement(homeCatgegory).click();}
    public void tapOnKidsCategory(){getDriver().findElement(kidsCategory).click();}
    public void tapOnBPetsCategory(){getDriver().findElement(petsCategory).click();}
    public void tapOnSexToysCategory(){getDriver().findElement(sexToysCategory).click();}
    public void tapOnStoresCategory(){getDriver().findElement(storesCategory).click();}
    public void tapOnMoreCategory(){getDriver().findElement(moreCategory).click();}

    public void clickOnBeautyMenu(){getDriver().findElement(BeautyAndCare).click();}
    public void clickOnFashionMenu(){getDriver().findElement(Fashion).click();}
    public void clickOnHomeMenu(){getDriver().findElement(Home).click();}

    //Methods to access Home Sub menues
    public void tapOnShopAllHome(){getDriver().findElement(ShopAllHomeSubMenu).click();}
    public Boolean validateHomeTitle() { return getDriver().findElement(HomeTitle).isDisplayed();}

  // Methods to access Sports + Fitness Sub menu
  public void clickOnShopAllSportsAndFitness(){getDriver().findElement(ShopAllSportsAndFitness).click();}
    public void clickOnFitnessAccessories(){getDriver().findElement(fitnessAccessories).click();}
    public void clickOnMachinery() {getDriver().findElement(machinery).click();}
    public void clickOnPersonalCareMenu(){getDriver().findElement(personalCare).click();}
    public Boolean validateSportsAndFitnessTitle() { return getDriver().findElement(sportAndFitnessTitle).isDisplayed();}





    public void clickOnKidsMenu(){getDriver().findElement(Kids).click();}
    public void clickOnPetsMenu(){getDriver().findElement(Pets).click();}
    public void clickOnSexToysMenu(){getDriver().findElement(SexToys).click();}
    public void clickOnSportsMenu(){getDriver().findElement(Sports).click();}
    public void clickOnStoresMenu(){getDriver().findElement(Stores).click();}
    public void clickOnSubscriptions(){getDriver().findElement(Subscriptions).click();}
    public void clickOnTechMenu(){getDriver().findElement(Tech).click();}
    public void clickOnAccesoriesMenu(){getDriver().findElement(accesories).click();}
    public void clickOnFootwareMenu(){getDriver().findElement(footware).click();}
    public void skincareMenu() {getDriver().findElement(skincare).click();}

    // tech menu methods
    public Boolean validateTechTitle() { return getDriver().findElement(techTitle).isDisplayed();}
    public void shopAllTechMenu() {getDriver().findElement(shopAllTech).click();}
    public void tapTechAccesoriesMenu() {getDriver().findElement(techAccesories).click();}
    public void tapgadgetsMenu() {getDriver().findElement(gadgets).click();}
    public void taphomeElectronicsMenu() {getDriver().findElement(homeElectronics).click();}


    //Methods
    public boolean shoppingTabIsPresent() {
        return getDriver().findElement(shoppingTab).isDisplayed();
    }

    public void tapBackFromMenu(){getDriver().findElement(backFromMenu);}

    public boolean shopNowButtonIsPresent() {
        return getDriver().findElement(shopNowButton).isDisplayed();
    }

    public void tapShopNowButton() {
        getDriver().findElement(shopNowButton).click();
        print("Tapped the Shop now button");
    }
}