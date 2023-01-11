package config.pages.news;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.aspectj.weaver.World;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class NewsPage extends CommonPage {

    //Catching elements
    //--Latest sub tab
    //NEW NAV

    private final By backToNews = MobileBy.AccessibilityId("News");
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

    private final By newsHeader = MobileBy.AccessibilityId("News");
    private final By backToMore = MobileBy.AccessibilityId("More");


    //--Sub tabs
    private final By inequalitySubTab = MobileBy.AccessibilityId("Inequality");
    private final By JPGSubTab = MobileBy.AccessibilityId("JPG");
    private final By scienceSubTab = MobileBy.AccessibilityId("Science");
    private final By politicsSubTab = MobileBy.AccessibilityId("Politics");
    private final By cultureSubTab = MobileBy.AccessibilityId("Culture");
    private final By healthSubTab = MobileBy.AccessibilityId("Health");
    private final By investigationsSubTab = MobileBy.AccessibilityId("Investigations");
    private final By techSubTab = MobileBy.AccessibilityId("Tech");
    private final By worldSubTab = MobileBy.AccessibilityId("World");
    private final By entertainmentSubTab = MobileBy.AccessibilityId("Entertainment");
    private final By opinionSubTab = MobileBy.AccessibilityId("Opinion");

    // NEW NAV ELEMENTS

 //   private final By inequity = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By inequity = MobileBy.AccessibilityId("Inequality");

  //  private final By science = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By science = MobileBy.AccessibilityId("Science");
  //  private final By politics = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By politics = MobileBy.AccessibilityId("Politics");

    private final By investigations = MobileBy.AccessibilityId("Investigations");
 //   private final By investigations = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By world = MobileBy.AccessibilityId("World");
//    private final By world = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
 //   private final By opinion = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By opinion = MobileBy.AccessibilityId("Opinion");
    private final By more = MobileBy.AccessibilityId("More");
    // NEW NAV FOREIGN EDITIONS

    private final By scienceBtn = MobileBy.AccessibilityId("Science");
    private final By politicsBtn = MobileBy.AccessibilityId("Politics");
    private final By healthBtn = MobileBy.AccessibilityId("Health");
    private final By cultureBtn = MobileBy.AccessibilityId("Culture");
    private final By techBtn = MobileBy.AccessibilityId("Tech");
    private final By worldBtn = MobileBy.AccessibilityId("World");
    private final By entertainmentBtn = MobileBy.AccessibilityId("Entertainment");

    //Methods
    //NEW NAV FOREIGN EDITIONS
    public void clickOnHealthBtn(){driver.findElement(healthBtn).click();}
    public void clickOnCultureBtn(){driver.findElement(cultureBtn).click();}
    public void clickOnScienceBtn(){driver.findElement(cultureBtn).click();}
    public void clickOnPoliticseBtn(){driver.findElement(cultureBtn).click();}
    public void clickOnInvestigationsBtn(){driver.findElement(cultureBtn).click();}
    public void clickOnTechBtn(){driver.findElement(techBtn).click();}
    public void clickOnEntertainmentBtn(){driver.findElement(entertainmentBtn).click();}
    public void clickOnWorldBtn(){driver.findElement(worldBtn).click();}


    //NEW NAV
    public void tapOnEntertainment(){driver.findElement(entertainmentSubTab).click();}
    public void tapOnTech(){driver.findElement(techSubTab).click();}
    public void tapOnJPG(){driver.findElement(JPGSubTab).click();}
    public void tapOnCulture(){driver.findElement(cultureSubTab).click();}
    public void tapOnHealth(){driver.findElement(healthSubTab).click();}
    public void tapOnMore(){driver.findElement(more).click();}
    public void backToNews(){driver.findElement(newsHeader).click();}
    public void backToMore(){driver.findElement(backToMore).click();}

    //ITEMS METHODS FROM MORE MENU
     public void tapOnInequity(){driver.findElement(inequalitySubTab).click();}
    public void tapOnScience(){driver.findElement(scienceSubTab).click();}
    public void tapOnPolitics(){driver.findElement(politicsSubTab).click();}
    public void tapOnWorld(){driver.findElement(worldSubTab).click();}
    public void tapOnOpinion(){driver.findElement(opinionSubTab).click();}

    //--Latest sub tab
    public boolean newsTabIsPresent() {
        return driver.findElement(newsTab).isDisplayed();
    }

    public boolean newsHeaderIsPresent() {
        return driver.findElement(newsHeader).isDisplayed();
    }

    public List<String>  getSubTabActiveLeft() {
        List<MobileElement> swipedTab = driver.findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (MobileElement tab : swipedTab) {
            scroll.swipeLeft();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public List<String>  getSubTabActiveRight() {
        List<MobileElement> swipedTab = driver.findElements(subtabs);
        List<String> tabValue = new ArrayList<>();
        List<String> activeTab = new ArrayList<>();

        for (MobileElement tab : swipedTab) {
            scroll.swipeRight();
            tabValue.add(tab.getAttribute("value"));
            activeTab.add(tab.getText());
            print("Active tab: " + tab.getText());
        }
        return tabValue;
    }

    public void tapInequalitySubTab() {
        driver.findElement(inequalitySubTab).click();
        print("Tapped the Inequality sub-ab");
    }

    public String inequalityIsActive() {
        return driver.findElement(inequalitySubTab).getAttribute("value");
    }

    public void tapJPGSubTab() {
        driver.findElement(JPGSubTab).click();
        print("Tapped the JPG sub-ab");
    }

    public String JPGIsActive() {
        return driver.findElement(JPGSubTab).getAttribute("value");
    }

    public void tapScienceSubTab() {
        driver.findElement(scienceSubTab).click();
        print("Tapped the Science sub-ab");
    }

    public String scienceIsActive() {
        return driver.findElement(scienceSubTab).getAttribute("value");
    }

    public void tapPoliticsSubTab() {
        driver.findElement(politicsSubTab).click();
        print("Tapped the Politics sub-ab");
    }

    public String politicsIsActive() {
        return driver.findElement(politicsSubTab).getAttribute("value");
    }

    public void tapCultureSubTab() {
        driver.findElement(cultureSubTab).click();
        print("Tapped the Culture sub-ab");
    }

    public String cultureIsActive() {
        return driver.findElement(cultureSubTab).getAttribute("value");
    }

    public void tapInvestigationsSubTab() {
        driver.findElement(investigationsSubTab).click();
        print("Tapped the Investigations sub-ab");
    }

    public String investigationsIsActive() {
        return driver.findElement(investigationsSubTab).getAttribute("value");
    }

    public void tapTechSubTab() {
        driver.findElement(techSubTab).click();
        print("Tapped the Tech sub-ab");
    }

    public String techIsActive() {
        return driver.findElement(techSubTab).getAttribute("value");
    }

    public void tapWorldSubTab() {
        driver.findElement(worldSubTab).click();
        print("Tapped the World sub-ab");
    }

    public String worldIsActive() {
        return driver.findElement(worldSubTab).getAttribute("value");
    }

    public void tapEntertainmentSubTab() {
        driver.findElement(entertainmentSubTab).click();
        print("Tapped the Entertainment sub-ab");
    }

    public String entertainmentIsActive() {
        return driver.findElement(entertainmentSubTab).getAttribute("value");
    }

    public void tapOpinionSubTab() {
        driver.findElement(opinionSubTab).click();
        print("Tapped the Opinion sub-ab");
    }

    public String opinionIsActive() {
        return driver.findElement(opinionSubTab).getAttribute("value");
    }
}
