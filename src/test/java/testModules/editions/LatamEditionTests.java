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
    public void testLoUltimoSubTab() {
        testName("INICIO");
        testName("Verify Inicio tab / Lo Último sub-tab");
        print("Verified 'Lo Último' sub-tab is present on Inicio tab");

        latestSubTab.tapSplash();
        print("Verified 'Splash' is present on Home/Lo Último feed");

        editions.tapAtrasButton();
    }

    @Test(priority = 2)
    public void testTendenciasSubTab(){
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
    public void testJajajaSubTab(){
        testName("Verify 'Ja Ja Ja' Sub-Tab");
        print("Verified Sub-tab 'Ja Ja Ja' is present");
        editions.tapJajajaSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Ja Ja Ja'");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }


    @Test (priority = 4)
    public void testChidoSubTab()throws InterruptedException{
        testName("Verify 'Chido' Sub-Tab");
        Assert.assertTrue(editions.chidoSubTabIsPresent());
        print("Verified Sub-tab 'Chido' is present");
        Thread.sleep(3000);
        editions.tapChidoSubTab();

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on sub-tab 'Chido'");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 5)
    public void testMadreDeDiosSubTab()throws InterruptedException{
        testName("Verify '¡madre de dios!' Sub-Tab");
        Assert.assertTrue(editions.madreDeDiosSubTabIsPresent());
        print("Verified Sub-tab '¡madre de dios!' is present");

        Thread.sleep(3000);
        editions.tapMadreDeDiosSubTab();

        homeSubTabs.splashCellIsPresent();
        print("Verified Splash is present on sub-tab '¡madre de dios!'");

        editions.tapAtrasButton();
    }

    @Test (priority = 6)
    public void testLindoSubTab(){
        testName("Verify 'Books' Sub-Tab");
        latestSubTab.tapOnMore();
        editions.tapLindoSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Books'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 7)
    public void testFailSubTab(){
        testName("Verify 'Fail' Sub-Tab");
        print("Verified Sub-tab 'Fail' is present");
        editions.tapFailSubTab();
        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Fail'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 8)
    public void testWTFSubTab(){
        testName("Verify 'WTF' Sub-Tab");
        print("Verified Sub-tab 'WTF' is present");
        editions.tapWTFSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'WTF'");

        editions.tapAtrasButton();
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

    @Test (priority = 10)
    public void testBellezaSubTab(){
        testName("Verify 'Belleza' sub-tab");
        editions.tapBellezaSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Belleza'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 11)
    public void testOfertasShoppingSubTab(){
        testName("Verify 'Ofertas' sub-tab");
        print("Verified 'Ofertas' sub-tab is present");
        editions.ofertasSubTab();
        editions.tapSplash();
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 12)
    public void testHogarSubTab(){
        testName("Verify 'Hogar' sub-tab");
        print("Verified 'Hogar' sub-tab is present");
        editions.hogarSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Hogar'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 13)
    public void testEstiloSubTab(){
        testName("Verify 'Estilo' sub-tab");
        print("Verified 'Estilo' sub-tab is present");
        editions.estiloSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Estilo'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 14)
    public void testIdeasSubTab(){
        testName("Verify 'Ideas para regalar' sub-tab");
        print("Verified 'Ideas para regalar' sub-tab is present");
        latestSubTab.tapOnMore();
        editions.ideasSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Ideas para regalar'");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapAtrasButton();
        editions.tapAtrasButton();

    }

    @Test (priority = 15)
    public void testDeMenos500SubTab(){
        testName("Verify 'De menos de $500' sub-tab");
        print("Verified 'De menos de $500' sub-tab is present");
        editions.menos500SubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'De menos de $500'");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 16)
    public void testElectronicosSubTab(){
        testName("Verify 'Electrónicos' sub-tab");
        print("Verified 'Electrónicos' sub-tab is present");
        editions.electronicosSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Electrónicos'");

        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    @Test (priority = 17)
    public void testValenSubTab(){
        testName("Verify 'Valen cada peso' sub-tab");
        print("Verified 'Valen cada peso' sub-tab is present");
        editions.valenSubTab();

        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Valen cada peso'");

        //print("Bpage on Splash: " + editions.getSplashTitle());
        editions.tapAtrasButton();
        editions.tapAtrasButton();
    }

    //Search
    @Test (priority = 18)
    public void testSearchTab() {
        testName("SEARCH");
        testName("Verify going to Search tab");
        editions.tapSearchTab();

        Assert.assertTrue(editions.suggestedSearchesTextLatamIsPresent());
        print("Verified 'Suggested Searches' title is present Search tab. Search is loading fine");
    }
}