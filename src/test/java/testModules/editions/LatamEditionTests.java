package testModules.editions;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LatamEditionTests extends EditionsInit {

    @Test
    public void testLatamEditionIsPresent()throws InterruptedException{
        print("-------------------STARTING LATAM EDITION TESTS-------------------");
        testName("Verify 'Latam' edition is present");
        Thread.sleep(3000);
        editions.tapProfileButton();
        editions.tapSettingsButton();
        editions.tapEditionOption();
        Assert.assertTrue(editions.latamEditionIsPresent());
        print("Verified 'India' edition is present in the list");
        editions.tapLatamEdition();
        editions.tapCloseButton();
    }

    //Home
    @Test(priority = 1)
    public void testLoUltimoSubTab(){
        testName("INICIO");
        testName("Verify Inicio tab / Lo Último sub-tab");
        print("Verified 'Lo Último' sub-tab is present on Inicio tab");
        latestSubTab.tapSplash();
        print("Verified 'Splash' is present on Home/Lo Último feed");
        editions.tapAtrasButton();
    }

    @Test(priority = 2)
    public void testTendenciasSubTab(){
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Tendencias' Tab");
        Assert.assertTrue(editions.tendenciasSubTabIsPresent());
        print("Verified 'Tendencias' Sub-tab is present");
        editions.tapTendenciasSubTab();
        homeSubTabs.tapSplash();
        print("Verified Splash is present on 'Tendencias' sub-tab");
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 3)
    public void testVistosRecientementeSubTab(){
        testName("Verify 'Ja Ja Ja' Sub-Tab");
        print("Verified Sub-tab 'Ja Ja Ja' is present");
        editions.tapOnVistosRecientemente();
        print("Verified Splash is present on sub-tab 'Ja Ja Ja'");
        editions.tapAtrasButton();
    }

    //Shopping
    @Test (priority = 9)
    public void testShoppingTab(){
        editions.tapShoppingLatamTab();
        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Lo último'");
        editions.tapAtrasButton();
    }

}
