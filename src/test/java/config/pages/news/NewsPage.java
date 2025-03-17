package config.pages.news;

import org.openqa.selenium.WebElement;
import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.WebElement;
//import org.aspectj.weaver.World;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class NewsPage extends CommonPage {

    //Catching elements
    //--Latest sub tab
    //NEW NAV

    private final By backToNews = AppiumBy.accessibilityId("News");
   // private final By entertainment = By.xpath("//*[contains(@name,'Entertainment')]");
    private final By entertainment = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
 //   private final By tech = By.xpath("//*[contains(@name,'Tech')]");
    private final By tech = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[3]");

 //   private final By JPG = By.xpath("//*[contains(@name,'JPG')]");
    private final By JPG = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[5]");
 //   private final By culture = By.xpath("//*[contains(@name,'Culture')]");
    private final By culture = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");

  //  private final By health = By.xpath("//*[contains(@name,'Health')]");
    private final By health = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");

 //   private final By more = By.xpath("//*[contains(@name,'More')]");
 //   private final By more = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[6]");

    private final By newsHeader = AppiumBy.accessibilityId("News");

    private final By newsSplash = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]");
    public void tapOnNewsSplash() {getDriver().findElement(newsSplash).click();}
   // public Boolean isOntheNewsHeaderVisible(){ getDriver().findElement()}
    private final By backToMore = AppiumBy.accessibilityId("More");


    //--Sub tabs
    private final By inequalitySubTab = AppiumBy.accessibilityId("Inequality");
    private final By JPGSubTab = AppiumBy.accessibilityId("JPG");
    private final By scienceSubTab = AppiumBy.accessibilityId("Science");
    private final By politicsSubTab = AppiumBy.accessibilityId("Politics");
    private final By cultureSubTab = AppiumBy.accessibilityId("Culture");
    private final By healthSubTab = AppiumBy.accessibilityId("Health");
    private final By investigationsSubTab = AppiumBy.accessibilityId("Investigations");
    private final By techSubTab = AppiumBy.accessibilityId("Tech");
    private final By worldSubTab = AppiumBy.accessibilityId("World");
    private final By entertainmentSubTab = AppiumBy.accessibilityId("Entertainment");
    private final By opinionSubTab = AppiumBy.accessibilityId("Opinion");

    // NEW NAV ELEMENTS

 //   private final By inequity = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By inequity = AppiumBy.accessibilityId("Inequality");

  //  private final By science = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By science = AppiumBy.accessibilityId("Science");
  //  private final By politics = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By politics = AppiumBy.accessibilityId("Politics");

    private final By investigations = AppiumBy.accessibilityId("Investigations");
 //   private final By investigations = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By world = AppiumBy.accessibilityId("World");
//    private final By world = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
 //   private final By opinion = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By opinion = AppiumBy.accessibilityId("Opinion");
    private final By more = AppiumBy.accessibilityId("More");
    // NEW NAV FOREIGN EDITIONS

    private final By scienceBtn = AppiumBy.accessibilityId("Science");
    private final By politicsBtn = AppiumBy.accessibilityId("Politics");
    private final By healthBtn = AppiumBy.accessibilityId("Health");
    private final By cultureBtn = AppiumBy.accessibilityId("Culture");
    private final By techBtn = AppiumBy.accessibilityId("Tech");
    private final By worldBtn = AppiumBy.accessibilityId("World");
    private final By entertainmentBtn = AppiumBy.accessibilityId("Entertainment");

    //Methods
    //NEW NAV FOREIGN EDITIONS
    public void clickOnHealthBtn(){getDriver().findElement(healthBtn).click();}
    public void clickOnCultureBtn(){getDriver().findElement(cultureBtn).click();}
    public void clickOnScienceBtn(){getDriver().findElement(cultureBtn).click();}
    public void clickOnPoliticseBtn(){getDriver().findElement(cultureBtn).click();}
    public void clickOnInvestigationsBtn(){getDriver().findElement(cultureBtn).click();}
    public void clickOnTechBtn(){getDriver().findElement(techBtn).click();}
    public void clickOnEntertainmentBtn(){getDriver().findElement(entertainmentBtn).click();}
    public void clickOnWorldBtn(){getDriver().findElement(worldBtn).click();}


    //NEW NAV
    public void tapOnEntertainment(){getDriver().findElement(entertainmentSubTab).click();}
    public void tapOnTech(){getDriver().findElement(techSubTab).click();}
    public void tapOnJPG(){getDriver().findElement(JPGSubTab).click();}
    public void tapOnCulture(){getDriver().findElement(cultureSubTab).click();}
    public void tapOnHealth(){getDriver().findElement(healthSubTab).click();}
    public void tapOnMore(){getDriver().findElement(more).click();}
    public void backToNews(){getDriver().findElement(newsHeader).click();}
    public void backToMore(){getDriver().findElement(backToMore).click();}

    //ITEMS METHODS FROM MORE MENU
     public void tapOnInequity(){getDriver().findElement(inequalitySubTab).click();}
    public void tapOnScience(){getDriver().findElement(scienceSubTab).click();}
    public void tapOnPolitics(){getDriver().findElement(politicsSubTab).click();}
    public void tapOnWorld(){getDriver().findElement(worldSubTab).click();}
    public void tapOnOpinion(){getDriver().findElement(opinionSubTab).click();}

    //--Latest sub tab
    public boolean newsTabIsPresent() {
        return getDriver().findElement(newsTab).isDisplayed();
    }

    public boolean newsHeaderIsPresent() {
        return getDriver().findElement(newsHeader).isDisplayed();
    }

    public List<String>  getSubTabActiveLeft() {
        List<WebElement> swipedTab = getDriver().findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (WebElement tab : swipedTab) {
            scroll.swipeLeft();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public List<String>  getSubTabActiveRight() {
        List<WebElement> swipedTab = getDriver().findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (WebElement tab : swipedTab) {
            scroll.swipeRight();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public void tapInequalitySubTab() {
        getDriver().findElement(inequalitySubTab).click();
        print("Tapped the Inequality sub-ab");
    }

    public String inequalityIsActive() {
        return getDriver().findElement(inequalitySubTab).getAttribute("value");
    }

    public void tapJPGSubTab() {
        getDriver().findElement(JPGSubTab).click();
        print("Tapped the JPG sub-ab");
    }

    public String JPGIsActive() {
        return getDriver().findElement(JPGSubTab).getAttribute("value");
    }

    public void tapScienceSubTab() {
        getDriver().findElement(scienceSubTab).click();
        print("Tapped the Science sub-ab");
    }

    public String scienceIsActive() {
        return getDriver().findElement(scienceSubTab).getAttribute("value");
    }

    public void tapPoliticsSubTab() {
        getDriver().findElement(politicsSubTab).click();
        print("Tapped the Politics sub-ab");
    }

    public String politicsIsActive() {
        return getDriver().findElement(politicsSubTab).getAttribute("value");
    }

    public void tapCultureSubTab() {
        getDriver().findElement(cultureSubTab).click();
        print("Tapped the Culture sub-ab");
    }

    public String cultureIsActive() {
        return getDriver().findElement(cultureSubTab).getAttribute("value");
    }

    public void tapInvestigationsSubTab() {
        getDriver().findElement(investigationsSubTab).click();
        print("Tapped the Investigations sub-ab");
    }

    public String investigationsIsActive() {
        return getDriver().findElement(investigationsSubTab).getAttribute("value");
    }

    public void tapTechSubTab() {
        getDriver().findElement(techSubTab).click();
        print("Tapped the Tech sub-ab");
    }

    public String techIsActive() {
        return getDriver().findElement(techSubTab).getAttribute("value");
    }

    public void tapWorldSubTab() {
        getDriver().findElement(worldSubTab).click();
        print("Tapped the World sub-ab");
    }

    public String worldIsActive() {
        return getDriver().findElement(worldSubTab).getAttribute("value");
    }

    public void tapEntertainmentSubTab() {
        getDriver().findElement(entertainmentSubTab).click();
        print("Tapped the Entertainment sub-ab");
    }

    public String entertainmentIsActive() {
        return getDriver().findElement(entertainmentSubTab).getAttribute("value");
    }

    public void tapOpinionSubTab() {
        getDriver().findElement(opinionSubTab).click();
        print("Tapped the Opinion sub-ab");
    }

    public String opinionIsActive() {
        return getDriver().findElement(opinionSubTab).getAttribute("value");
    }
}
