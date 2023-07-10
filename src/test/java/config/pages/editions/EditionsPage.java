package config.pages.editions;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import testModules.profile.MyCommentsTests4;

public class EditionsPage extends CommonPage {

    //Catching elements
    //--Editions

    private final By japanfstItem = MobileBy.AccessibilityId("最近チェックしたコンテンツ");
    private final By japanSndItem = MobileBy.AccessibilityId("人気の記事");
    private final By japanTrdItem = MobileBy.AccessibilityId("ホームページ");
    private final By LOL = MobileBy.AccessibilityId("LOL");
    private final By kawaii = MobileBy.AccessibilityId("kawaii");
    private final By win = MobileBy.AccessibilityId("win");
    private final By japanBackBtn = MobileBy.AccessibilityId("戻る");




    private final By atrasButton = MobileBy.AccessibilityId("Atrás");
    private final By editionOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Edition\"]");
    private final By australiaEdition = MobileBy.AccessibilityId("Australia");
    private final By canadaEdition = MobileBy.AccessibilityId("Canada");
    private final By indiaEdition = MobileBy.AccessibilityId("India");
    private final By japanEdition = MobileBy.AccessibilityId("Japan");
    private final By latamEdition = MobileBy.AccessibilityId("Latam");
    private final By ukEdition = MobileBy.AccessibilityId("United Kingdom");

    //--Japan Edition
    private final By buzzfeedLogoJapanEdition = MobileBy.AccessibilityId("ホーム");
    private final By nowHomeJapanSubTab = MobileBy.AccessibilityId("新着記事");
    private final By buzzHomeJapanSubTab = MobileBy.AccessibilityId("人気の記事");
    private final By homeHomeJapanSubTab = MobileBy.AccessibilityId("home");
    private final By lolHomeJapanSubTab = MobileBy.AccessibilityId("LOL");
    private final By kawaiiHomeJapanSubTab = MobileBy.AccessibilityId("kawaii");
    private final By winHomeJapanSubTab = MobileBy.AccessibilityId("Win");
    private final By suggestedSearchesJapanText = MobileBy.AccessibilityId("おすすめ検索");
    private final By settingsOnJapanEdition = MobileBy.AccessibilityId("設定");
    private final By editionOnJapanEdition = MobileBy.AccessibilityId("エディション, Japan");
    private final By closeSettingsJapanEdition = MobileBy.AccessibilityId("閉じる");

    //--Latam Edition
    private final By inicioLatamTab = MobileBy.AccessibilityId("home");
    private final By shoppingLatamTab = MobileBy.AccessibilityId("shopping");
    private final By loUltimoSubTab =  MobileBy.AccessibilityId("Lo último");
    private final By tendenciasSubTab =  MobileBy.AccessibilityId("Tendencias");
    private final By jajajaHomeSubTab =  MobileBy.AccessibilityId("Ja Ja Ja");
    private final By chidoHomeSubTab =  MobileBy.AccessibilityId("Chido");
    private final By madreDeDiosHomeSubTab =  MobileBy.AccessibilityId("¡madre de dios!");
    private final By lindoHomeSubTab =  MobileBy.AccessibilityId("Lindo");
    private final By failHomeSubTab =  MobileBy.AccessibilityId("Fail");
    private final By wtfHomeSubTab =  MobileBy.AccessibilityId("WTF");
    private final By bellezaShoppingSubTab =  MobileBy.AccessibilityId("Belleza y skincare");
    private final By ofertasShoppingSubTab =  MobileBy.AccessibilityId("Ofertas");
    private final By hogarShoppingSubTab =  MobileBy.AccessibilityId("Hogar");
    private final By estiloShoppingSubTab =  MobileBy.AccessibilityId("Estilo");
    private final By ideasShoppingSubTab =  MobileBy.AccessibilityId("Ideas para regalar");
    private final By menos500ShoppingSubTab =  MobileBy.AccessibilityId("De menos de $500");
    private final By electronicosShoppingSubTab =  MobileBy.AccessibilityId("Electrónicos");
    private final By valenShoppingSubTab =  MobileBy.AccessibilityId("Valen cada peso");
    private final By suggestedSearchesLatamText = MobileBy.AccessibilityId("Búsquedas sugeridas");
    private final By settingsOnLatamEdition = MobileBy.AccessibilityId("Configuración");
    private final By editionOnLatamEdition = MobileBy.AccessibilityId("Edición, Latam");
    private final By closeSettingsLatamEdition = MobileBy.AccessibilityId("Cerrar");
    private final By vistosRecientemente = MobileBy.AccessibilityId("Vistos recientemente");
    private final By tapOnPerfilBtn = MobileBy.AccessibilityId("Perfil");

    //--Show tab
    private final By show = By.id("buffet_image_cell");

    //--Shopping sub-tabs
    private final By shoppingTabForeignEditions = By.id("shopping");
    private final By giftIdeasSubTab = MobileBy.AccessibilityId("Gift Ideas");
    private final By selfCareSubTab = MobileBy.AccessibilityId("Self Care");
    private final By treatYourselfSubTab = MobileBy.AccessibilityId("Treat Yourself");
    private final By fashion = MobileBy.AccessibilityId("Fashion");
    private final By under1000 = MobileBy.AccessibilityId("Under ₹ 1000");
    private final By under20 = MobileBy.AccessibilityId("Under £20");
    private final By worthEveryRupee = MobileBy.AccessibilityId("Worth Every Rupee");
    private final By foodSubTab = MobileBy.AccessibilityId("Food");
    private final By booksSubTab = MobileBy.AccessibilityId("Books");
    private final By configuracion = MobileBy.AccessibilityId("Configuración");
    private final By edicion = MobileBy.AccessibilityId("Edición, Latam");
    private final By cerrarMenu = MobileBy.AccessibilityId("Cerrar");


    //Methods
    //--Regular editions
    public void tapEditionOption() {
        driver.findElement(editionOption).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapOnConfiguracion() {driver.findElement(configuracion).click();}
    public void tapOnEdicion(){driver.findElement(edicion).click();}
    public void tapOnCerrar() {driver.findElement(cerrarMenu).click();}


   public void tapOnPerfilBtn(){driver.findElement(tapOnPerfilBtn).click();}

    public void tapOnJapanFstItem(){driver.findElement(japanfstItem).click();}
    public void tapOnJapanSndItem(){driver.findElement(japanSndItem).click();}
    public void tapOnTrdFstItem(){driver.findElement(japanTrdItem).click();}
    public void tapOnJLOLFstItem(){driver.findElement(LOL).click();}
    public void tapOnKawaiiItem(){driver.findElement(kawaii).click();}
    public void tapOnWin(){driver.findElement(win).click();}


    public Boolean australiaEditionIsPresent() {
        return driver.findElement(australiaEdition).isDisplayed();
    }

    public void tapAustraliaEdition() {
        driver.findElement(australiaEdition).click();
        print("Tapped Australia Edition");
    }

    public Boolean canadaEditionIsPresent() {
        return driver.findElement(canadaEdition).isDisplayed();
    }

    public void tapCanadaEdition() {
        driver.findElement(canadaEdition).click();
        print("Tapped Canada Edition");
    }

    public Boolean indiaEditionIsPresent() {
        return driver.findElement(indiaEdition).isDisplayed();
    }

    public void tapIndiaEdition() {
        driver.findElement(indiaEdition).click();
        print("Tapped India Edition");
    }

    public Boolean ukEditionIsPresent() {
        return driver.findElement(ukEdition).isDisplayed();
    }

    public void tapUKEdition() {
        driver.findElement(ukEdition).click();
        print("Tapped UK Edition");
    }

    public void tapJapanBackButton(){driver.findElement(japanBackBtn).click();}

    public void tapAtrasButton(){driver.findElement(atrasButton).click();}

        //--Verify Splash
    public String getSplashTitle(){
        String splashTitle = driver.findElement(splashCell).getText();
        return splashTitle;
    }

    public void tapOnVistosRecientemente(){driver.findElement(vistosRecientemente).click();}

        //--Shows
    public boolean verifyShowIsPresent(){
        return driver.findElement(show).isDisplayed();
    }

        //--News
    public boolean verifyPackageIsPresent(){
        return driver.findElement(itemsPackage).isDisplayed();
    }

        //--Shopping sub-tab
    public boolean foreignShoppingTabIsPresent() {
        return driver.findElement(shoppingTabForeignEditions).isDisplayed();
    }

    public void tapForeignShoppingTab() {
        driver.findElement(shoppingTabForeignEditions).click();
        print("Tapped 'Quizzes' tab");
    }

    public void tapGiftIdeasSubTab() {
        driver.findElement(giftIdeasSubTab).click();
        print("Tapped 'Gift Ideas' subtab from Shopping tab");
    }

    public void tapSelfCareSubTab() {
        driver.findElement(selfCareSubTab).click();
        print("Tapped 'Self Care' subtab from Shopping tab");
    }

    public void tapTreatYourselfSubTab() {
        driver.findElement(treatYourselfSubTab).click();
        print("Tapped 'Treat Yourself' subtab from Shopping tab");
    }

    public void tapFashionSubTab() {
        driver.findElement(fashion).click();
        print("Tapped 'Fashion' subtab from Shopping tab");
    }

    public void tapUnder1000SubTab() {
        driver.findElement(under1000).click();
        print("Tapped 'Under ₹ 1000' subtab from Shopping tab");
    }

    public void tapBooksSubTab() {
        driver.findElement(booksSubTab).click();
        print("Tapped 'Books' subtab from Shopping tab");
    }

    public void tapFoodSubTab() {
        driver.findElement(foodSubTab).click();
        print("Tapped 'Food' subtab from Shopping tab");
    }

    public void tapUnder20SubTab() {
        driver.findElement(under20).click();
        print("Tapped 'Under £20' subtab from Shopping tab");
    }

    public void tapWorthEveryRupeeSubTab() {
        driver.findElement(worthEveryRupee).click();
        print("Tapped 'Worth Every Rupee' subtab from Shopping tab");
    }

    //--Japan edition
    public boolean buzzfeedLogoJapanEditionIsPresent(){
        WaitersPage.waitForElement(buzzfeedLogoJapanEdition);
        return driver.findElement(buzzfeedLogoJapanEdition).isDisplayed();
    }

    public Boolean japanEditionIsPresent() {
        return driver.findElement(japanEdition).isDisplayed();
    }

    public void tapJapanEdition() {
        driver.findElement(japanEdition).click();
        print("Tapped Japan Edition");
    }

    public Boolean nowHomeIsPresent() {
        WaitersPage.waitForElement(nowHomeJapanSubTab);
        return driver.findElement(nowHomeJapanSubTab).isDisplayed();
    }

    public Boolean buzzHomeIsPresent() {
        return driver.findElement(buzzHomeJapanSubTab).isDisplayed();
    }

    public void buzzHomeSubTab() {
        driver.findElement(buzzHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean homeHomeIsPresent() {
        return driver.findElement(homeHomeJapanSubTab).isDisplayed();
    }

    public void homeHomeSubTab() {
        driver.findElement(homeHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean lolHomeIsPresent() {
        return driver.findElement(lolHomeJapanSubTab).isDisplayed();
    }

    public void lolHomeSubTab() {
        driver.findElement(lolHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean kawaiiHomeIsPresent() {
        return driver.findElement(kawaiiHomeJapanSubTab).isDisplayed();
    }

    public void kawaiiHomeSubTab() {
        driver.findElement(kawaiiHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean winHomeIsPresent() {
        return driver.findElement(winHomeJapanSubTab).isDisplayed();
    }

    public void winHomeSubTab() {
        driver.findElement(winHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    //--Search
    public boolean suggestedSearchesTextJapanIsPresent() {
        return driver.findElement(suggestedSearchesJapanText).isDisplayed();
    }

    //--Settings
    public void tapJapanSettingsButton() {
        driver.findElement(settingsOnJapanEdition).click();
        print("Tapped Settings button");
    }

    public void tapEditionOptionOnJapanEdition() {
        driver.findElement(editionOnJapanEdition).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapCloseSettingsButtonOnJapanEdition(){
        driver.findElement(closeSettingsJapanEdition).click();
        print("tapped close settings button");
    }

    //--Latam edition
        //--Home
    public Boolean latamEditionIsPresent() {
        return driver.findElement(latamEdition).isDisplayed();
    }

    public void tapLatamEdition() {
        driver.findElement(latamEdition).click();
        print("Tapped Latam Edition");
    }

    public Boolean inicioTabIsPresent() {
        WaitersPage.waitForElement(inicioLatamTab);
        return driver.findElement(inicioLatamTab).isDisplayed();
    }

    public Boolean loUltimoSubTabIsPresent() {
        WaitersPage.waitForElement(loUltimoSubTab);
        return driver.findElement(loUltimoSubTab).isDisplayed();
    }

    public Boolean tendenciasSubTabIsPresent() {
        return driver.findElement(tendenciasSubTab).isDisplayed();
    }

    public void tapTendenciasSubTab() {
        driver.findElement(tendenciasSubTab).click();
        print("Tapped 'Tendencias' sub-tab on Latam Edition");
    }

    public Boolean jajajaSubTabIsPresent() {
        return driver.findElement(jajajaHomeSubTab).isDisplayed();
    }

    public void tapJajajaSubTab() {
        driver.findElement(jajajaHomeSubTab).click();
        print("Tapped 'Ja Ja Ja' sub-tab on Latam Edition");
    }

    public Boolean chidoSubTabIsPresent() {
        return driver.findElement(chidoHomeSubTab).isDisplayed();
    }

    public void tapChidoSubTab() {
        driver.findElement(chidoHomeSubTab).click();
        print("Tapped 'Chido' sub-tab on Latam Edition");
    }

    public Boolean madreDeDiosSubTabIsPresent() {
        return driver.findElement(madreDeDiosHomeSubTab).isDisplayed();
    }

    public void tapMadreDeDiosSubTab() {
        driver.findElement(madreDeDiosHomeSubTab).click();
        print("Tapped '¡madre de dios!' sub-tab on Latam Edition");
    }

    public Boolean lindoSubTabIsPresent() {
        return driver.findElement(lindoHomeSubTab).isDisplayed();
    }

    public void tapLindoSubTab() {
        driver.findElement(lindoHomeSubTab).click();
        print("Tapped 'Lindo' sub-tab on Latam Edition");
    }

    public Boolean failSubTabIsPresent() {
        return driver.findElement(failHomeSubTab).isDisplayed();
    }

    public void tapFailSubTab() {
        driver.findElement(failHomeSubTab).click();
        print("Tapped 'Fail' sub-tab on Latam Edition");
    }

    public Boolean wtfSubTabIsPresent() {
        return driver.findElement(wtfHomeSubTab).isDisplayed();
    }

    public void tapWTFSubTab() {
        driver.findElement(wtfHomeSubTab).click();
        print("Tapped 'WTF' sub-tab on Latam Edition");
    }

        //--Shopping tab
    public Boolean shoppingLatamTabIsPresent() {
        return driver.findElement(shoppingLatamTab).isDisplayed();
    }

    public void tapShoppingLatamTab() {
        driver.findElement(shoppingLatamTab).click();
        print("Tapped 'Shopping' tab on Latam Edition");
    }

    public Boolean bellezaSubTabIsPresent() {
        return driver.findElement(bellezaShoppingSubTab).isDisplayed();
    }

    public void tapBellezaSubTab() {
        driver.findElement(bellezaShoppingSubTab).click();
        print("Tapped 'Belleza' sub-tab on Latam Edition");
    }

    public Boolean ofertasIsPresent() {
        return driver.findElement(ofertasShoppingSubTab).isDisplayed();
    }

    public void ofertasSubTab() {
        driver.findElement(ofertasShoppingSubTab).click();
        print("Tapped 'Ofertas' sub-tab on Latam Edition");
    }

    public Boolean hogarIsPresent() {
        return driver.findElement(hogarShoppingSubTab).isDisplayed();
    }

    public void hogarSubTab() {
        driver.findElement(hogarShoppingSubTab).click();
        print("Tapped 'Hogar' sub-tab on Latam Edition");
    }

    public Boolean estiloIsPresent() {
        return driver.findElement(estiloShoppingSubTab).isDisplayed();
    }

    public void estiloSubTab() {
        driver.findElement(estiloShoppingSubTab).click();
        print("Tapped 'Estilo' sub-tab on Latam Edition");
    }

    public Boolean ideasIsPresent() {
        return driver.findElement(ideasShoppingSubTab).isDisplayed();
    }

    public void ideasSubTab() {
        driver.findElement(ideasShoppingSubTab).click();
        print("Tapped 'Ideas para Regalar' sub-tab on Latam Edition");
    }

    public Boolean menos500IsPresent() {
        return driver.findElement(menos500ShoppingSubTab).isDisplayed();
    }

    public void menos500SubTab() {
        driver.findElement(menos500ShoppingSubTab).click();
        print("Tapped 'De menos de $500' sub-tab on Latam Edition");
    }

    public Boolean electronicosIsPresent() {
        return driver.findElement(electronicosShoppingSubTab).isDisplayed();
    }

    public void electronicosSubTab() {
        driver.findElement(electronicosShoppingSubTab).click();
        print("Tapped 'De menos de $500' sub-tab on Latam Edition");
    }

    public Boolean valenIsPresent() {
        return driver.findElement(valenShoppingSubTab).isDisplayed();
    }

    public void valenSubTab() {
        driver.findElement(valenShoppingSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

        //--Search
    public boolean suggestedSearchesTextLatamIsPresent() {
        return driver.findElement(suggestedSearchesLatamText).isDisplayed();
    }

        //--Settings
    public void tapLatamSettingsButton() {
        driver.findElement(settingsOnLatamEdition).click();
        print("Tapped Settings button");
    }

    public void tapEditionOptionOnLatamEdition() {
        driver.findElement(editionOnLatamEdition).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapCloseSettingsButtonOnLatamEdition(){
        driver.findElement(closeSettingsLatamEdition).click();
        print("tapped close settings button");
    }
}
