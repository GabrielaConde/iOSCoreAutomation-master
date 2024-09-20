package testModules.shopping;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests extends EditionsInit {

    @BeforeClass
    public void signInOnFstLaunch()throws InterruptedException{
        try {
            Thread.sleep(2000);
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            //  latestSubTab.switchToAlert();
            // latestSubTab.tapAllowButton();
            // latestSubTab.switchToAlert();
            latestSubTab.tapOnGuestSignIn();
            Thread.sleep(3000);
      /*  latestSubTab.tapAllowButton();
        latestSubTab.tapOnSignInLink();
        latestSubTab.enterPassword("sanfer12");
        latestSubTab.enterEmail("salpimie");
        Thread.sleep(2000);
        latestSubTab.tapSignInBFButton();
        Thread.sleep(3000);
        latestSubTab.tapNotNow(); */
            //  signIn.switchToAlert();
            //  latestSubTab.setUSEdition();
        }catch (Exception e) {}
    }

    @Test
    public void testShoppingTab()throws InterruptedException {
        try{
     /*   latestSubTab.tapAllowButton();
        Thread.sleep(3000);
        latestSubTab.tapAllowButton();
        Thread.sleep(3000);
        latestSubTab.tapOnAcceptAllCookiesBtn();
        Thread.sleep(3000);*/
     //   latestSubTab.setUSEdition();
        Thread.sleep(3000);
      //  latestSubTab.closeGoToGamesScreen();
        testName("Verify the Shopping Tab");
        shoppingLatestSubTabs.shoppingTabIsPresent();
        print("Verified the Shopping Tab is present in the nav bar");
        print("Verified Allow Notification button");
        }catch (Exception e) {}

    }



    @Test(priority = 1)
    public void testShoppingHeaderIsPresent()throws InterruptedException {
        try{
        Thread.sleep(5000);
        testName("Verify the Shopping Tab");
        shoppingLatestSubTabs.tapShoppingTab();
        Assert.assertTrue(shoppingLatestSubTabs.shoppingHeaderIsPresent());
        print("Verified the Shopping Header is present in the nav bar");
        }catch (Exception e) {}

    }

  //  @Test(priority = 2)
    public void validateBFDisclaimer(){
            testName("Verify BF Disclaimer Is present");
        Assert.assertTrue(shoppingLatestSubTabs.IsDisclaimerPresent());
    }



   @Test(priority = 3)
    public void testBeautyCategory() throws InterruptedException{
        try{
        testName("Test Beauty Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBeautyCategory();
       Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}
    }

    @Test(priority = 3)
    public void testFashionCategory()throws InterruptedException{
        try{
        String category;
        testName("Test Fashion Category");
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFashionCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}

    }
    @Test(priority = 4)
    public void testHomeCategory()throws InterruptedException{
        try{
        String category;
        testName("Test Home Category");
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnHomeCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}

    }

    @Test(priority = 5)
    public void testKidsCategory()throws InterruptedException{
        try{
        testName("Test Kids Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKidsCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}
    }

    @Test(priority = 6)
    public void testPetsCategory()throws InterruptedException{
        try{
        testName("Test Pets Category");
        String category;
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBPetsCategory();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}
    }

    @Test(priority = 7)
    public void testSexToysCategory()throws InterruptedException{
        try{
            testName("Test Sex Toys Category");
        String category;
        Thread.sleep(4000);
        shoppingLatestSubTabs.tapOnSexToysCategory();
        Thread.sleep(4000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapOnCategoryBackBtn();
        }catch (Exception e) {}

    }

    @Test(priority = 8)
    public void testMore()throws InterruptedException{
        try{
            testName("Validate Test More Category");
        String category;
        Thread.sleep(4000);
        shoppingLatestSubTabs.tapOnMoreCategory();
        Thread.sleep(4000);
        Assert.assertTrue(shoppingLatestSubTabs.validateAllCateroryTitleIsDisplayed());
        }catch (Exception e) {}
    }

    @Test(priority = 9)
    public void validateBeautyAndCareMenu()throws InterruptedException{
        try{
        Thread.sleep(3000);
        shoppingLatestSubTabs.clickOnBeautyMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifyBeautyAndCareTitle();
        }catch (Exception e) {}
    }

    @Test(priority = 10)
    public void validateShopAllBeautyAndPersonalCareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapShopBeautyAndPersonalCareSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }
    @Test(priority = 11)
    public void validateHairSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapHairSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 12)
    public void validateSMakeUpSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapMakeUpSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        Thread.sleep(3000);
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 13)
    public void validateOutDoorProductsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOutDoorProductsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 14)
    public void validatePersonalToolsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapPersonalToolsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 16)
    public void validateSkinCareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSkinCareSubMenu();
        Thread.sleep(2000);
      // Assert.assertTrue(shoppingLatestSubTabs.validateSkinCareTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 17)
    public void validateAcneSolutionsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAcneSolutionsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 18)
    public void validateBodySubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapBodySubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 19)
    public void validateFaceSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFaceSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority = 20)
    public void validateFashionMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnFashionMenu();
        Thread.sleep(2000);
        Assert.assertTrue(shoppingLatestSubTabs.verifyFashionCatTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 21)
    public void validateShopAllFashionSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAllFashionSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 22)
    public void validateFashionAccesoriesSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapAccesoriesSubMenu();
        Thread.sleep(2000);
       Assert.assertTrue(shoppingLatestSubTabs.validateFashionAccessoriesTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 23)
    public void validateBagsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBagsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 24)
    public void validateColdWeatherSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnColdWeatherSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 25)
    public void validateGlassesAndSunglassesSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnGlassesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 26)
    public void validateJewerlySubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnJewerlySubMenu();
        Thread.sleep(2000);
       // shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 27)
    public void validateDressesSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapDressesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 28)
    public void validateFootwareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFootwareSubMenu();
        Thread.sleep(2000);
       Assert.assertTrue(shoppingLatestSubTabs.validateFootwareTitle());
        }catch (Exception e) {}

    }
    @Test(priority = 29)
    public void validateBootsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBootsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 30)
    public void validateDressSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnDressSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 31)
    public void validateFlatsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFlatsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 32)
    public void validateHeelsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnHeelsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 33)
    public void validateOutDoorSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOutDoorShoesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 34)
    public void validateSandalsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnSandalsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 35)
    public void validateSneakersSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBagsSneakersMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 36)
    public void validateFormalWareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapFormalWearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 37)
    public void validateJacketsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapJacketsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 38)
    public void validateJeansSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapJeansSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 39)
    public void validateLoungeWareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapLoungeWearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority = 40)
    public void validatePantsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapPlantsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 41)
    public void validateSweatersSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSweatersSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 42)
    public void validateSwimsuitsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapSwimsuitsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 43)
    public void validateTopsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapTopsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 44)
    public void validateUnderwareSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapUnderwearSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority = 45)
    public void validateHomeMenu() throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnHomeMenu();
        Thread.sleep(2000);
     //  Assert.assertTrue(shoppingLatestSubTabs.validateHomeTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 46)
    public void validateBathroomSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBathroomsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 47)
    public void validateBeddingAndMatressSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBeddingMatressSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 48)
    public void validateCleaningSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnCleaningSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 49)
    public void validateKitchenSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKitchenMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateKitchenTitle();
        }catch (Exception e) {}
    }

    @Test(priority = 50)
    public void validateAppliancesSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAppliancesSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 51)
    public void validatToolsSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnToolsSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }


    @Test(priority = 52)
    public void validateDecorSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnDecorSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 53)
    public void validateFurnitureSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnFurnitureSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateFurnitureTitle();
        }catch (Exception e) {}
    }

    @Test(priority = 54)
    public void validateBedroomSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBedroomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 55)
    public void validateKidsRoomSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKidsRoomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 56)
    public void validateKitchenRoomSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnKitchenSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 57)
    public void validateLivingRoomSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnLivingRoomSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 58)
    public void validateSecondOfficeSubMenu()throws InterruptedException {
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOfficeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }



    @Test(priority = 59)
    public void validateOfficeSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapHomeOfficeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

     @Test(priority = 60)
    public void validateOrganizationSubMenu()throws InterruptedException{
        try{
         Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOrganizationSubMenu();
         Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 61)
    public void validateOutdoorSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnOutDoorHomeSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.validateOnOutDoorTitle();
        }catch (Exception e) {}
    }

    @Test(priority = 62)
    public void validateBackyardSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnBackyardSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 63)
    public void validateGardenSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnGardenSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 64)
    public void validateRecreationSubMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnRecreationSubMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 65)
    public void validateKidsMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnKidsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 66)
    public void validatePetsMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnPetsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 67)
    public void validateSexToysMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSexToysMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 68)
    public void validateSportsAndFitnessMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSportsMenu();
        Thread.sleep(2000);
      //  Assert.assertTrue(shoppingLatestSubTabs.validateSportsAndFitnessTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 69)
    public void validateShopAllSportsAndFitnessMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnShopAllSportsAndFitness();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 70)
    public void validateFitnessAccesoriesMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnFitnessAccessories();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 71)
    public void validateMachineryMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnMachinery();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 72)
    public void validatePersonalCareMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnPersonalCareMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 73)
    public void validateStoresMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnStoresMenu();
        Thread.sleep(2000);
       // Assert.assertTrue(shoppingLatestSubTabs.validateStoresTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 74)
    public void validateShopAllStoresMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAllShopStores();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 75)
    public void validateAmazonMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAmazon();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 76)
    public void validateEtsyMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnEtsy();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 77)
    public void validateNordstromMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnNordstram();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 78)
    public void validateSephoraMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnSephora();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 79)
    public void validateShopSmallMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnShopSmail();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 80)
    public void validateTargetMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnTarget();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 81)
    public void validateWalmartMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAllWalmat();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 82)
    public void validateWayfairMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnAWayFair();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 83)
    public void validateSubscriptionsMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnSubscriptions();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 84)
    public void validateTechMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.clickOnTechMenu();
        Thread.sleep(2000);
        Assert.assertTrue(shoppingLatestSubTabs.validateTechTitle());
        }catch (Exception e) {}
    }

    @Test(priority = 85)
    public void validateShopAllTechMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.shopAllTechMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 86)
    public void validateTechAccessoriesMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapTechAccesoriesMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 87)
    public void validateGadgetsMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapgadgetsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    @Test(priority = 88)
    public void validateHomeElectronicsMenu()throws InterruptedException{
        try{
        Thread.sleep(2000);
        shoppingLatestSubTabs.taphomeElectronicsMenu();
        Thread.sleep(2000);
        shoppingLatestSubTabs.verifySplashCategoryLoads();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        shoppingLatestSubTabs.tapBackButton();
        }catch (Exception e) {}
    }

    // COMMENTED AS IT IS DISABLED FOR NOW
 //   @Test(priority = 87)
    public void validateGiftGuideTitle(){
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitle());
    }

    // COMMENTED AS IT IS DISABLED FOR NOW
   // @Test(priority = 88)
    public void validateGiftGuideCTILink() throws InterruptedException{
        scroll.scrollDown90_20();
        Thread.sleep(2000);
        shoppingLatestSubTabs.tapOnCTAGiftGuideLink();
        Assert.assertTrue(shoppingLatestSubTabs.validateGiftGuideTitleOnScreen());

    }

    // COMMENTED AS IT IS DISABLED FOR NOW
   // @Test(priority = 89)
            public void validateGiftGuideSplashLoads()
            { shoppingLatestSubTabs.tapSplash();
                bpage.tapBackButton();
            }

 //   @Test(priority = 90)
    public void validateTrendingPackageTitleIsDisplayed()
    {
        Assert.assertTrue(shoppingLatestSubTabs.validateTrendingProductsTitle());
    }

   // @Test(priority = 91)
    public void tapItemsShoppingPackage(){
            testName("Verify Shopping Package items");
            latestSubTab.tapItemsShopPackage();
    }

  //  @Test(priority =92)
    public void openTrendingModal(){
            testName("Verify opening trending Modal for the first item on Trending Product package");
        latestSubTab.tapFirstTrendingCell();
        shoppingLatestSubTabs.tapCloseButton();
            print("Verified Trending Modal from Trending Product package is working fine on Home/Latest feed");
            shoppingLatestSubTabs.tapBackButton();
    }


   // @Test(priority =93)
    public void testShopNowButton() throws InterruptedException{
        testName("Verify Shop Now button");

        Assert.assertTrue(shoppingLatestSubTabs.shopNowButtonIsPresent());
        print("Verified the Shop Now button is present");

        shoppingLatestSubTabs.tapShopNowButton();
        shoppingLatestSubTabs.returnToBFApp();}

    @Test(priority =94)
    public void validateFeatureStoriesTitle() {
        try{
      Assert.assertTrue(shoppingLatestSubTabs.featureStoryTitleIsDisplayed());
        }catch (Exception e) {}
    }



    @Test (priority = 96)
    public void validateFeatureStoriesDisplays(){
        try{
            testName("validate Feature Stories displays");
            shoppingLatestSubTabs.tapOnFeatureStoriesCell();
            bpage.tapBackButton();
        }catch (Exception e) {}

    }


}