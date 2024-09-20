package config.pages.editions;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import testModules.profile.MyCommentsTests4;

public class EditionsPage extends CommonPage {

    //Catching elements
    //--Editions

    private final By japanfstItem = AppiumBy.accessibilityId("最近チェックしたコンテンツ");
    private final By japanSndItem = AppiumBy.accessibilityId("人気の記事");
    private final By japanTrdItem = AppiumBy.accessibilityId("ホームページ");
    private final By LOL = AppiumBy.accessibilityId("LOL");
    private final By kawaii = AppiumBy.accessibilityId("kawaii");
    private final By win = AppiumBy.accessibilityId("win");
    private final By japanBackBtn = AppiumBy.accessibilityId("戻る");




    private final By atrasButton = AppiumBy.accessibilityId("Atrás");
    private final By editionOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Edition\"]");
    private final By australiaEdition = AppiumBy.accessibilityId("Australia");
    private final By canadaEdition = AppiumBy.accessibilityId("Canada");
    private final By indiaEdition = AppiumBy.accessibilityId("India");
    private final By japanEdition = AppiumBy.accessibilityId("Japan");
    private final By latamEdition = AppiumBy.accessibilityId("Latam");
    private final By ukEdition = AppiumBy.accessibilityId("United Kingdom");


    //--Japan Edition
    private final By buzzfeedLogoJapanEdition = AppiumBy.accessibilityId("ホーム");
    private final By nowHomeJapanSubTab = AppiumBy.accessibilityId("新着記事");
    private final By buzzHomeJapanSubTab = AppiumBy.accessibilityId("人気の記事");
    private final By homeHomeJapanSubTab = AppiumBy.accessibilityId("home");
    private final By lolHomeJapanSubTab = AppiumBy.accessibilityId("LOL");
    private final By kawaiiHomeJapanSubTab = AppiumBy.accessibilityId("kawaii");
    private final By winHomeJapanSubTab = AppiumBy.accessibilityId("Win");
    private final By suggestedSearchesJapanText = AppiumBy.accessibilityId("おすすめ検索");
    private final By settingsOnJapanEdition = AppiumBy.accessibilityId("設定");
    private final By editionOnJapanEdition = AppiumBy.accessibilityId("エディション, Japan");
    private final By closeSettingsJapanEdition = AppiumBy.accessibilityId("閉じる");

    //--Latam Edition
    private final By inicioLatamTab = AppiumBy.accessibilityId("home");
    private final By shoppingLatamTab = AppiumBy.accessibilityId("shopping");
    private final By loUltimoSubTab =  AppiumBy.accessibilityId("Lo último");
    private final By tendenciasSubTab =  AppiumBy.accessibilityId("Tendencias");
    private final By jajajaHomeSubTab =  AppiumBy.accessibilityId("Ja Ja Ja");
    private final By chidoHomeSubTab =  AppiumBy.accessibilityId("Chido");
    private final By madreDeDiosHomeSubTab =  AppiumBy.accessibilityId("¡madre de dios!");
    private final By lindoHomeSubTab =  AppiumBy.accessibilityId("Lindo");
    private final By failHomeSubTab =  AppiumBy.accessibilityId("Fail");
    private final By wtfHomeSubTab =  AppiumBy.accessibilityId("WTF");
    private final By bellezaShoppingSubTab =  AppiumBy.accessibilityId("Belleza y skincare");
    private final By ofertasShoppingSubTab =  AppiumBy.accessibilityId("Ofertas");
    private final By hogarShoppingSubTab =  AppiumBy.accessibilityId("Hogar");
    private final By estiloShoppingSubTab =  AppiumBy.accessibilityId("Estilo");
    private final By ideasShoppingSubTab =  AppiumBy.accessibilityId("Ideas para regalar");
    private final By menos500ShoppingSubTab =  AppiumBy.accessibilityId("De menos de $500");
    private final By electronicosShoppingSubTab =  AppiumBy.accessibilityId("Electrónicos");
    private final By valenShoppingSubTab =  AppiumBy.accessibilityId("Valen cada peso");
    private final By suggestedSearchesLatamText = AppiumBy.accessibilityId("Búsquedas sugeridas");
    private final By settingsOnLatamEdition = AppiumBy.accessibilityId("Configuración");
    private final By editionOnLatamEdition = AppiumBy.accessibilityId("Edición, Latam");
    private final By closeSettingsLatamEdition = AppiumBy.accessibilityId("Cerrar");
    private final By vistosRecientemente = AppiumBy.accessibilityId("Vistos recientemente");
    private final By tapOnPerfilBtn = AppiumBy.accessibilityId("Perfil");

    //--Show tab
    private final By show = By.id("buffet_image_cell");

    //--Shopping sub-tabs
    private final By shoppingTabForeignEditions = By.id("shopping");
    private final By giftIdeasSubTab = AppiumBy.accessibilityId("Gift Ideas");
    private final By selfCareSubTab = AppiumBy.accessibilityId("Self Care");
    private final By treatYourselfSubTab = AppiumBy.accessibilityId("Treat Yourself");
    private final By fashion = AppiumBy.accessibilityId("Fashion");
    private final By under1000 = AppiumBy.accessibilityId("Under ₹ 1000");
    private final By under20 = AppiumBy.accessibilityId("Under £20");
    private final By worthEveryRupee = AppiumBy.accessibilityId("Worth Every Rupee");
    private final By foodSubTab = AppiumBy.accessibilityId("Food");
    private final By booksSubTab = AppiumBy.accessibilityId("Books");
    private final By configuracion = AppiumBy.accessibilityId("Settings");
    private final By edicion = AppiumBy.accessibilityId("Edición, Latam");
    private final By cerrarMenu = AppiumBy.accessibilityId("Close");


    //Methods
    //--Regular editions
    public void tapEditionOption() {
        getDriver().findElement(editionOption).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapOnConfiguracion() {getDriver().findElement(configuracion).click();}
    public void tapOnEdicion(){getDriver().findElement(edicion).click();}
    public void tapOnCerrar() {getDriver().findElement(cerrarMenu).click();}


   public void tapOnPerfilBtn(){getDriver().findElement(tapOnPerfilBtn).click();}

    public void tapOnJapanFstItem(){getDriver().findElement(japanfstItem).click();}
    public void tapOnJapanSndItem(){getDriver().findElement(japanSndItem).click();}
    public void tapOnTrdFstItem(){getDriver().findElement(japanTrdItem).click();}
    public void tapOnJLOLFstItem(){getDriver().findElement(LOL).click();}
    public void tapOnKawaiiItem(){getDriver().findElement(kawaii).click();}
    public void tapOnWin(){getDriver().findElement(win).click();}


    public Boolean australiaEditionIsPresent() {
        return getDriver().findElement(australiaEdition).isDisplayed();
    }

    public void tapAustraliaEdition() {
        getDriver().findElement(australiaEdition).click();
        print("Tapped Australia Edition");
    }


    public Boolean canadaEditionIsPresent() {
        return getDriver().findElement(canadaEdition).isDisplayed();
    }

    public void tapCanadaEdition() {
        getDriver().findElement(canadaEdition).click();
        print("Tapped Canada Edition");
    }

    public Boolean indiaEditionIsPresent() {
        return getDriver().findElement(indiaEdition).isDisplayed();
    }

    public void tapIndiaEdition() {
        getDriver().findElement(indiaEdition).click();
        print("Tapped India Edition");
    }

    public Boolean ukEditionIsPresent() {
        return getDriver().findElement(ukEdition).isDisplayed();
    }

    public void tapUKEdition() {
        getDriver().findElement(ukEdition).click();
        print("Tapped UK Edition");
    }

    public void tapJapanBackButton(){getDriver().findElement(backButton).click();}

    public void tapAtrasButton(){getDriver().findElement(backButton).click();}

        //--Verify Splash
    public String getSplashTitle(){
        String splashTitle = getDriver().findElement(splashCell).getText();
        return splashTitle;
    }

    public void tapOnVistosRecientemente(){getDriver().findElement(vistosRecientemente).click();}

        //--Shows
    public boolean verifyShowIsPresent(){
        return getDriver().findElement(show).isDisplayed();
    }

        //--News
    public boolean verifyPackageIsPresent(){
        return getDriver().findElement(itemsPackage).isDisplayed();
    }

        //--Shopping sub-tab
    public boolean foreignShoppingTabIsPresent() {
        return getDriver().findElement(shoppingTabForeignEditions).isDisplayed();
    }

    public void tapForeignShoppingTab() {
        getDriver().findElement(shoppingTabForeignEditions).click();
        print("Tapped 'Quizzes' tab");
    }

    public void tapGiftIdeasSubTab() {
        getDriver().findElement(giftIdeasSubTab).click();
        print("Tapped 'Gift Ideas' subtab from Shopping tab");
    }

    public void tapSelfCareSubTab() {
        getDriver().findElement(selfCareSubTab).click();
        print("Tapped 'Self Care' subtab from Shopping tab");
    }

    public void tapTreatYourselfSubTab() {
        getDriver().findElement(treatYourselfSubTab).click();
        print("Tapped 'Treat Yourself' subtab from Shopping tab");
    }

    public void tapFashionSubTab() {
        getDriver().findElement(fashion).click();
        print("Tapped 'Fashion' subtab from Shopping tab");
    }

    public void tapUnder1000SubTab() {
        getDriver().findElement(under1000).click();
        print("Tapped 'Under ₹ 1000' subtab from Shopping tab");
    }

    public void tapBooksSubTab() {
        getDriver().findElement(booksSubTab).click();
        print("Tapped 'Books' subtab from Shopping tab");
    }

    public void tapFoodSubTab() {
        getDriver().findElement(foodSubTab).click();
        print("Tapped 'Food' subtab from Shopping tab");
    }

    public void tapUnder20SubTab() {
        getDriver().findElement(under20).click();
        print("Tapped 'Under £20' subtab from Shopping tab");
    }

    public void tapWorthEveryRupeeSubTab() {
        getDriver().findElement(worthEveryRupee).click();
        print("Tapped 'Worth Every Rupee' subtab from Shopping tab");
    }

    //--Japan edition
    public boolean buzzfeedLogoJapanEditionIsPresent(){
      //  WaitersPage.waitForElement(buzzfeedLogoJapanEdition);
        return getDriver().findElement(buzzfeedLogoJapanEdition).isDisplayed();
    }

    public Boolean japanEditionIsPresent() {
        return getDriver().findElement(japanEdition).isDisplayed();
    }

    public void tapJapanEdition() {
        getDriver().findElement(japanEdition).click();
        print("Tapped Japan Edition");
    }

    public Boolean nowHomeIsPresent() {
      //  WaitersPage.waitForElement(nowHomeJapanSubTab);
        return getDriver().findElement(nowHomeJapanSubTab).isDisplayed();
    }

    public Boolean buzzHomeIsPresent() {
        return getDriver().findElement(buzzHomeJapanSubTab).isDisplayed();
    }

    public void buzzHomeSubTab() {
        getDriver().findElement(buzzHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean homeHomeIsPresent() {
        return getDriver().findElement(homeHomeJapanSubTab).isDisplayed();
    }

    public void homeHomeSubTab() {
        getDriver().findElement(homeHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean lolHomeIsPresent() {
        return getDriver().findElement(lolHomeJapanSubTab).isDisplayed();
    }

    public void lolHomeSubTab() {
        getDriver().findElement(lolHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean kawaiiHomeIsPresent() {
        return getDriver().findElement(kawaiiHomeJapanSubTab).isDisplayed();
    }

    public void kawaiiHomeSubTab() {
        getDriver().findElement(kawaiiHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    public Boolean winHomeIsPresent() {
        return getDriver().findElement(winHomeJapanSubTab).isDisplayed();
    }

    public void winHomeSubTab() {
        getDriver().findElement(winHomeJapanSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

    //--Search
    public boolean suggestedSearchesTextJapanIsPresent() {
        return getDriver().findElement(suggestedSearchesJapanText).isDisplayed();
    }

    //--Settings
    public void tapJapanSettingsButton() {
        getDriver().findElement(settingsOnJapanEdition).click();
        print("Tapped Settings button");
    }

    public void tapEditionOptionOnJapanEdition() {
        getDriver().findElement(editionOnJapanEdition).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapCloseSettingsButtonOnJapanEdition(){
        getDriver().findElement(closeSettingsJapanEdition).click();
        print("tapped close settings button");
    }

    //--Latam edition
        //--Home
    public Boolean latamEditionIsPresent() {
        return getDriver().findElement(latamEdition).isDisplayed();
    }

    public void tapLatamEdition() {
        getDriver().findElement(latamEdition).click();
        print("Tapped Latam Edition");
    }

    public Boolean inicioTabIsPresent() {
      //  WaitersPage.waitForElement(inicioLatamTab);
        return getDriver().findElement(inicioLatamTab).isDisplayed();
    }

    public Boolean loUltimoSubTabIsPresent() {
      //  WaitersPage.waitForElement(loUltimoSubTab);
        return getDriver().findElement(loUltimoSubTab).isDisplayed();
    }

    public Boolean tendenciasSubTabIsPresent() {
        return getDriver().findElement(tendenciasSubTab).isDisplayed();
    }

    public void tapTendenciasSubTab() {
        getDriver().findElement(tendenciasSubTab).click();
        print("Tapped 'Tendencias' sub-tab on Latam Edition");
    }

    public Boolean jajajaSubTabIsPresent() {
        return getDriver().findElement(jajajaHomeSubTab).isDisplayed();
    }

    public void tapJajajaSubTab() {
        getDriver().findElement(jajajaHomeSubTab).click();
        print("Tapped 'Ja Ja Ja' sub-tab on Latam Edition");
    }

    public Boolean chidoSubTabIsPresent() {
        return getDriver().findElement(chidoHomeSubTab).isDisplayed();
    }

    public void tapChidoSubTab() {
        getDriver().findElement(chidoHomeSubTab).click();
        print("Tapped 'Chido' sub-tab on Latam Edition");
    }

    public Boolean madreDeDiosSubTabIsPresent() {
        return getDriver().findElement(madreDeDiosHomeSubTab).isDisplayed();
    }

    public void tapMadreDeDiosSubTab() {
        getDriver().findElement(madreDeDiosHomeSubTab).click();
        print("Tapped '¡madre de dios!' sub-tab on Latam Edition");
    }

    public Boolean lindoSubTabIsPresent() {
        return getDriver().findElement(lindoHomeSubTab).isDisplayed();
    }

    public void tapLindoSubTab() {
        getDriver().findElement(lindoHomeSubTab).click();
        print("Tapped 'Lindo' sub-tab on Latam Edition");
    }

    public Boolean failSubTabIsPresent() {
        return getDriver().findElement(failHomeSubTab).isDisplayed();
    }

    public void tapFailSubTab() {
        getDriver().findElement(failHomeSubTab).click();
        print("Tapped 'Fail' sub-tab on Latam Edition");
    }

    public Boolean wtfSubTabIsPresent() {
        return getDriver().findElement(wtfHomeSubTab).isDisplayed();
    }

    public void tapWTFSubTab() {
        getDriver().findElement(wtfHomeSubTab).click();
        print("Tapped 'WTF' sub-tab on Latam Edition");
    }

        //--Shopping tab
    public Boolean shoppingLatamTabIsPresent() {
        return getDriver().findElement(shoppingLatamTab).isDisplayed();
    }

    public void tapShoppingLatamTab() {
        getDriver().findElement(shoppingLatamTab).click();
        print("Tapped 'Shopping' tab on Latam Edition");
    }

    public Boolean bellezaSubTabIsPresent() {
        return getDriver().findElement(bellezaShoppingSubTab).isDisplayed();
    }

    public void tapBellezaSubTab() {
        getDriver().findElement(bellezaShoppingSubTab).click();
        print("Tapped 'Belleza' sub-tab on Latam Edition");
    }

    public Boolean ofertasIsPresent() {
        return getDriver().findElement(ofertasShoppingSubTab).isDisplayed();
    }

    public void ofertasSubTab() {
        getDriver().findElement(ofertasShoppingSubTab).click();
        print("Tapped 'Ofertas' sub-tab on Latam Edition");
    }

    public Boolean hogarIsPresent() {
        return getDriver().findElement(hogarShoppingSubTab).isDisplayed();
    }

    public void hogarSubTab() {
        getDriver().findElement(hogarShoppingSubTab).click();
        print("Tapped 'Hogar' sub-tab on Latam Edition");
    }

    public Boolean estiloIsPresent() {
        return getDriver().findElement(estiloShoppingSubTab).isDisplayed();
    }

    public void estiloSubTab() {
        getDriver().findElement(estiloShoppingSubTab).click();
        print("Tapped 'Estilo' sub-tab on Latam Edition");
    }

    public Boolean ideasIsPresent() {
        return getDriver().findElement(ideasShoppingSubTab).isDisplayed();
    }

    public void ideasSubTab() {
        getDriver().findElement(ideasShoppingSubTab).click();
        print("Tapped 'Ideas para Regalar' sub-tab on Latam Edition");
    }

    public Boolean menos500IsPresent() {
        return getDriver().findElement(menos500ShoppingSubTab).isDisplayed();
    }

    public void menos500SubTab() {
        getDriver().findElement(menos500ShoppingSubTab).click();
        print("Tapped 'De menos de $500' sub-tab on Latam Edition");
    }

    public Boolean electronicosIsPresent() {
        return getDriver().findElement(electronicosShoppingSubTab).isDisplayed();
    }

    public void electronicosSubTab() {
        getDriver().findElement(electronicosShoppingSubTab).click();
        print("Tapped 'De menos de $500' sub-tab on Latam Edition");
    }

    public Boolean valenIsPresent() {
        return getDriver().findElement(valenShoppingSubTab).isDisplayed();
    }

    public void valenSubTab() {
        getDriver().findElement(valenShoppingSubTab).click();
        print("Tapped 'Valen cada peso' sub-tab on Latam Edition");
    }

        //--Search
    public boolean suggestedSearchesTextLatamIsPresent() {
        return getDriver().findElement(suggestedSearchesLatamText).isDisplayed();
    }

        //--Settings
    public void tapLatamSettingsButton() {
        getDriver().findElement(settingsOnLatamEdition).click();
        print("Tapped Settings button");
    }

    public void tapEditionOptionOnLatamEdition() {
        getDriver().findElement(editionOnLatamEdition).click();
        print("Tapped 'Edition' on Settings");
    }

    public void tapCloseSettingsButtonOnLatamEdition(){
        getDriver().findElement(closeSettingsLatamEdition).click();
        print("tapped close settings button");
    }
}
