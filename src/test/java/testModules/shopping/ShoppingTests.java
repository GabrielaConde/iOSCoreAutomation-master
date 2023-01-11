package testModules.shopping;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests extends EditionsInit {

    @Test
    public void testShoppingTab() {
        latestSubTab.tapAllowButton();
        latestSubTab.tapAllowButton();
        testName("Verify the Shopping Tab");
        Assert.assertTrue(shoppingLatestSubTabs.shoppingTabIsPresent());
        print("Verified the Shopping Tab is present in the nav bar");
        print("Verified Allow Notification button");

    }



    @Test(priority = 1)
    public void testShoppingHeaderIsPresent() {

        testName("Verify the Shopping Tab");
        shoppingLatestSubTabs.tapShoppingTab();
        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the Shopping Header is present in the nav bar");

    }

   // @Test(priority = 2)
    public void validateBFDisclaimer(){
        try{
            testName("Verify BF Disclaimer Is present");
        Assert.assertTrue(shoppingLatestSubTabs.IsDisclaimerPresent());
        } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }
    }



   @Test(priority = 3)
    public void testBeautyCategory(){
        testName("Test Beauty Category");
        String category;
        shoppingLatestSubTabs.tapOnBeautyCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
    }

    @Test(priority = 3)
    public void testFashionCategory(){
        String category;
        testName("Test Fashion Category");
        shoppingLatestSubTabs.tapOnFashionCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();

    }
    @Test(priority = 4)
    public void testHomeCategory(){
        String category;
        testName("Test Home Category");
        shoppingLatestSubTabs.tapOnHomeCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();

    }

    @Test(priority = 5)
    public void testKidsCategory(){
            testName("Test Kids Category");
        String category;
        shoppingLatestSubTabs.tapOnKidsCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
    }

    @Test(priority = 6)
    public void testPetsCategory(){
            testName("Test Pets Category");
            String category;
        shoppingLatestSubTabs.tapOnBPetsCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
    }

    @Test(priority = 7)
    public void testSexToysCategory(){
            testName("Test Sex Toys Category");
        String category;
        shoppingLatestSubTabs.tapOnSexToysCategory();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();

    }

    @Test(priority = 8)
    public void testMore(){
            testName("Validate Test More Category");
        String category;
        shoppingLatestSubTabs.tapOnMoreCategory();
        Assert.assertTrue(shoppingLatestSubTabs.validateAllCateroryTitleIsDisplayed());

    }

    @Test(priority = 9)
    public void validateBeautyAndCareMenu()throws InterruptedException{
        shoppingLatestSubTabs.clickOnBeautyMenu();
        shoppingLatestSubTabs.verifyBeautyAndCareTitle();
    }

    @Test(priority = 10)
    public void validateShopAllBeautyAndPersonalCareSubMenu(){
        shoppingLatestSubTabs.tapShopBeautyAndPersonalCareSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }
    @Test(priority = 11)
    public void validateHairSubMenu(){
        shoppingLatestSubTabs.tapHairSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 12)
    public void validateSMakeUpSubMenu(){
        shoppingLatestSubTabs.tapMakeUpSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 13)
    public void validateOutDoorProductsSubMenu(){
        shoppingLatestSubTabs.tapOutDoorProductsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 14)
    public void validatePersonalToolsSubMenu(){
        shoppingLatestSubTabs.tapPersonalToolsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 16)
    public void validateSkinCareSubMenu(){
        shoppingLatestSubTabs.tapSkinCareSubMenu();
       Assert.assertTrue(shoppingLatestSubTabs.validateSkinCareTitle());
    }

    @Test(priority = 17)
    public void validateAcneSolutionsSubMenu(){
        shoppingLatestSubTabs.tapAcneSolutionsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 18)
    public void validateBodySubMenu(){
        shoppingLatestSubTabs.tapBodySubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 19)
    public void validateFaceSubMenu(){
        shoppingLatestSubTabs.tapFaceSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }


    @Test(priority = 20)
    public void validateFashionMenu(){
        shoppingLatestSubTabs.clickOnFashionMenu();
        Assert.assertTrue(shoppingLatestSubTabs.verifyFashionCatTitle());
    }

    @Test(priority = 21)
    public void validateShopAllFashionSubMenu(){
        shoppingLatestSubTabs.tapAllFashionSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingSubTabs.tapBackButton();
    }

    @Test(priority = 22)
    public void validateFashionAccesoriesSubMenu(){
        shoppingLatestSubTabs.tapAccesoriesSubMenu();
       Assert.assertTrue(shoppingLatestSubTabs.validateFashionAccessoriesTitle());
    }

    @Test(priority = 23)
    public void validateBagsSubMenu(){
        shoppingLatestSubTabs.tapOnBagsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 24)
    public void validateColdWeatherSubMenu(){
        shoppingLatestSubTabs.tapOnColdWeatherSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 25)
    public void validateGlassesAndSunglassesSubMenu(){
        shoppingLatestSubTabs.tapOnGlassesSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 26)
    public void validateJewerlySubMenu(){
        shoppingLatestSubTabs.tapOnJewerlySubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 26)
    public void validateDressesSubMenu(){
        shoppingLatestSubTabs.tapDressesSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 27)
    public void validateFootwareSubMenu(){
        shoppingLatestSubTabs.tapFootwareSubMenu();
       Assert.assertTrue(shoppingLatestSubTabs.validateFootwareTitle());

    }
    @Test(priority = 28)
    public void validateBootsSubMenu(){
        shoppingLatestSubTabs.tapOnBootsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 29)
    public void validateDressSubMenu(){
        shoppingLatestSubTabs.tapOnDressSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 30)
    public void validateFlatsSubMenu(){
        shoppingLatestSubTabs.tapOnFlatsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 31)
    public void validateHeelsSubMenu(){
        shoppingLatestSubTabs.tapOnHeelsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 32)
    public void validateOutDoorSubMenu(){
        shoppingLatestSubTabs.tapOnOutDoorShoesSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 33)
    public void validateSandalsSubMenu(){
        shoppingLatestSubTabs.tapOnSandalsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 34)
    public void validateSneakersSubMenu(){
        shoppingLatestSubTabs.tapOnBagsSneakersMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 35)
    public void validateFormalWareSubMenu(){
        shoppingLatestSubTabs.tapFormalWearSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 36)
    public void validateJacketsSubMenu(){
        shoppingLatestSubTabs.tapJacketsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 37)
    public void validateJeansSubMenu(){
        shoppingLatestSubTabs.tapJeansSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 38)
    public void validateLoungeWareSubMenu(){
        shoppingLatestSubTabs.tapLoungeWearSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }


    @Test(priority = 39)
    public void validatePantsSubMenu(){
        shoppingLatestSubTabs.tapPlantsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 39)
    public void validateSweatersSubMenu(){
        shoppingLatestSubTabs.tapSweatersSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 40)
    public void validateSwimsuitsSubMenu(){
        shoppingLatestSubTabs.tapSwimsuitsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 41)
    public void validateTopsSubMenu(){
        shoppingLatestSubTabs.tapTopsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 42)
    public void validateUnderwareSubMenu(){
        shoppingLatestSubTabs.tapUnderwearSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }


    @Test(priority = 43)
    public void validateHomeMenu(){
        shoppingLatestSubTabs.clickOnHomeMenu();
       Assert.assertTrue(shoppingLatestSubTabs.validateHomeTitle());
    }

    @Test(priority = 44)
    public void validateBathroomSubMenu(){
        shoppingLatestSubTabs.tapOnBathroomsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 45)
    public void validateBeddingAndMatressSubMenu(){
        shoppingLatestSubTabs.tapOnBeddingMatressSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 46)
    public void validateCleaningSubMenu(){
        shoppingLatestSubTabs.tapOnCleaningSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 47)
    public void validateKitchenSubMenu(){
        shoppingLatestSubTabs.tapOnKitchenMenu();
        shoppingLatestSubTabs.validateKitchenTitle();
    }

    @Test(priority = 48)
    public void validateAppliancesSubMenu(){
        shoppingLatestSubTabs.tapOnAppliancesSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 49)
    public void validatToolsSubMenu(){
        shoppingLatestSubTabs.tapOnToolsSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }


    @Test(priority = 50)
    public void validateDecorSubMenu(){
        shoppingLatestSubTabs.tapOnDecorSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 51)
    public void validateFurnitureSubMenu(){
        shoppingLatestSubTabs.tapOnFurnitureSubMenu();
        shoppingLatestSubTabs.validateFurnitureTitle();
    }

    @Test(priority = 52)
    public void validateBedroomSubMenu(){
        shoppingLatestSubTabs.tapOnBedroomSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 53)
    public void validateKidsRoomSubMenu(){
        shoppingLatestSubTabs.tapOnKidsRoomSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 54)
    public void validateKitchenRoomSubMenu(){
        shoppingLatestSubTabs.tapOnKitchenSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 55)
    public void validateLivingRoomSubMenu(){
        shoppingLatestSubTabs.tapOnLivingRoomSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 56)
    public void validateSecondOfficeSubMenu() {
        shoppingLatestSubTabs.tapOnOfficeSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }



    @Test(priority = 57)
    public void validateOfficeSubMenu(){
        shoppingLatestSubTabs.tapHomeOfficeSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

     @Test(priority = 58)
    public void validateOrganizationSubMenu(){
        shoppingLatestSubTabs.tapOnOrganizationSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 59)
    public void validateOutdoorSubMenu(){
        shoppingLatestSubTabs.tapOnOutDoorHomeSubMenu();
        shoppingLatestSubTabs.validateOnOutDoorTitle();
    }

    @Test(priority = 60)
    public void validateBackyardSubMenu(){
        shoppingLatestSubTabs.tapOnBackyardSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 61)
    public void validateGardenSubMenu(){
        shoppingLatestSubTabs.tapOnGardenSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 62)
    public void validateRecreationSubMenu(){
        shoppingLatestSubTabs.tapOnRecreationSubMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();

    }




    @Test(priority = 63)
    public void validateKidsMenu(){
        shoppingLatestSubTabs.clickOnKidsMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 64)
    public void validatePetsMenu(){
        shoppingLatestSubTabs.clickOnPetsMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 65)
    public void validateSexToysMenu(){
        shoppingLatestSubTabs.clickOnSexToysMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 66)
    public void validateSportsAndFitnessMenu(){
        shoppingLatestSubTabs.clickOnSportsMenu();
        Assert.assertTrue(shoppingLatestSubTabs.validateSportsAndFitnessTitle());
    }

    @Test(priority = 67)
    public void validateShopAllSportsAndFitnessMenu(){
        shoppingLatestSubTabs.clickOnShopAllSportsAndFitness();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 68)
    public void validateFitnessAccesoriesMenu(){
        shoppingLatestSubTabs.clickOnFitnessAccessories();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 69)
    public void validateMachineryMenu(){
        shoppingLatestSubTabs.clickOnMachinery();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 70)
    public void validatePersonalCareMenu(){
        shoppingLatestSubTabs.clickOnPersonalCareMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 71)
    public void validateStoresMenu(){
        shoppingLatestSubTabs.clickOnStoresMenu();
        Assert.assertTrue(shoppingLatestSubTabs.validateStoresTitle());
    }

    @Test(priority = 72)
    public void validateShopAllStoresMenu(){
        shoppingLatestSubTabs.tapOnAllShopStores();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 73)
    public void validateAmazonMenu(){
        shoppingLatestSubTabs.tapOnAmazon();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 74)
    public void validateEtsyMenu(){
        shoppingLatestSubTabs.tapOnEtsy();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 75)
    public void validateNordstromMenu(){
        shoppingLatestSubTabs.tapOnNordstram();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 76)
    public void validateSephoraMenu(){
        shoppingLatestSubTabs.tapOnSephora();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 77)
    public void validateShopSmallMenu(){
        shoppingLatestSubTabs.tapOnShopSmail();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 78)
    public void validateTargetMenu(){
        shoppingLatestSubTabs.tapOnTarget();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 79)
    public void validateWalmartMenu(){
        shoppingLatestSubTabs.tapOnAllWalmat();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 80)
    public void validateWayfairMenu(){
        shoppingLatestSubTabs.tapOnAWayFair();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 81)
    public void validateSubscriptionsMenu(){
        shoppingLatestSubTabs.clickOnSubscriptions();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 82)
    public void validateTechMenu(){
        shoppingLatestSubTabs.clickOnTechMenu();
        Assert.assertTrue(shoppingLatestSubTabs.validateTechTitle());
    }

    @Test(priority = 83)
    public void validateShopAllTechMenu(){
        shoppingLatestSubTabs.shopAllTechMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 84)
    public void validateTechAccessoriesMenu(){
        shoppingLatestSubTabs.tapTechAccesoriesMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 85)
    public void validateGadgetsMenu(){
        shoppingLatestSubTabs.tapgadgetsMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 86)
    public void validateHomeElectronicsMenu(){
        shoppingLatestSubTabs.taphomeElectronicsMenu();
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
    }

    @Test(priority = 87)
    public void validateGiftGuideTitle(){
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitle());
    }

    @Test(priority = 88)
    public void validateGiftGuideCTILink() throws InterruptedException{
        scroll.scrollDown90_20();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnCTAGiftGuideLink();
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitleOnScreen());

    }

    @Test(priority = 89)
            public void validateGiftGuideSplashLoads()
            { shoppingLatestSubTabs.tapSplash();
                bpage.tapBackButton();
            }

    @Test(priority = 90)
    public void validateTrendingPackageTitleIsDisplayed()
    {
        Assert.assertTrue(shoppingLatestSubTabs.validateTrendingProductsTitle());
    }

    @Test(priority = 91)
    public void tapItemsShoppingPackage(){
            testName("Verify Shopping Package items");
            latestSubTab.tapItemsShopPackage();
    }

    @Test(priority =92)
    public void openTrendingModal(){
            testName("Verify opening trending Modal for the first item on Trending Product package");
        latestSubTab.tapFirstTrendingCell();
        shoppingLatestSubTabs.tapCloseButton();
            print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");
            shoppingLatestSubTabs.tapBackButton();
    }


  //  @Test(priority =93)
    public void testShopNowButton() {
        testName("Verify Shop Now button");

        Assert.assertTrue(shoppingLatestSubTabs.shopNowButtonIsPresent());
        print("Verified the Shop Now button is present");

        shoppingLatestSubTabs.tapShopNowButton();
        shoppingLatestSubTabs.returnToBFApp();}

    @Test(priority =94)
    public void validateFeatureStoriesTitle() {
      Assert.assertTrue(shoppingLatestSubTabs.featureStoryTitleIsDisplayed());
    }



    @Test (priority = 96)
    public void validateFeatureStoriesDisplays(){
            testName("validate Feature Stories displays");
            shoppingLatestSubTabs.tapOnFeatureStoriesCell();
            bpage.tapBackButton();

    }


    @Test(priority = 98)
    public void validateTapOnVideos(){
        scroll.scrollMultipleTimes(1);
      shoppingLatestSubTabs.tapOnVideo();
      shoppingLatestSubTabs.closeVideo();
    }



    @Test(priority = 99)
    public void validateShoppingSearch2() throws InterruptedException{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnShoppingSearch();
        shoppingLatestSubTabs.typeSearchElement("bag");
    }

    @Test(priority = 100)
    public void clickOnAmazonPost(){
        shoppingLatestSubTabs.tapOnProductCell();
        shoppingLatestSubTabs.returnToBFApp();
        scroll.scrollMultipleTimes(6);
    }


}