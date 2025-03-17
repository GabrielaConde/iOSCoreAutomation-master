package config.pages.home;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.springframework.ui.context.Theme;
//import sun.security.krb5.internal.TGSRep;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomeLatestPage extends CommonPage {


    //Catching elements
    //--Home elements

    //NEW TAB NABS
  //  private final By recentlyViewed = AppiumBy.accessibilityId("⏳ Recently Viewed");
  //  private final By backHome = AppiumBy.accessibilityId("Home");

    //COMMENTS IN-FEED
    private final By inFeedCommentBtn = AppiumBy.accessibilityId("Write Comment");
    public void tapOnInFeedComments() {getDriver().findElement(inFeedCommentBtn).click();}

    private final By swipeCell = By.xpath("/XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther");

    public void horizontalSwap() {
        scroll.swipeLeftByElement(subnavTrending,1);
    }

    //IN FEED ELEMENTS
     private final By dailyTriviaPromo = AppiumBy.accessibilityId("banner_promo_cell");

    private final By closePyramidScheme = By.xpath("//XCUIElementTypeButton[@name=\"xmark\"]");

    public void tapOnClosePyramidScheme() {getDriver().findElement(closePyramidScheme).click();}

    public void tapOnDailyTriviaPromo() throws InterruptedException{
        getDriver().findElement(dailyTriviaPromo).click();
        Thread.sleep(2000);
      // return isDailyTriviaHeaderDisplayed();
    }

    public void closePyramidScheme(){getDriver().findElement(closePyramidScheme);}

   // private By homeView = AppiumBy.accessibilityId("BUFFET_COLLECTION");
    private By homeView = AppiumBy.accessibilityId("_TtGC7SwiftUI32NavigationStackHosting");

    //GAMES TAB
    private final By gamesLbl = By.xpath("//XCUIElementTypeStaticText[@name=\"Games\"]");
    private final By featuredGame = AppiumBy.accessibilityId("FEATURED GAME");
    private final By pyramidSchemeImg = AppiumBy.accessibilityId("pyramid-scheme-text-img");
    private final By pyramidSchemeDesc = AppiumBy.accessibilityId("Connect the dots, find the words, solve the puzzle!");

    private final By quizPartyThumbnail = AppiumBy.accessibilityId("quiz-party-thumbnail");
    private final By dailyTriviaThumbnail = AppiumBy.accessibilityId("daily-trivia-thumbnail");

    private final By moreFunStuffLbl = AppiumBy.accessibilityId("More Fun Stuff");
    private final By whoDis = AppiumBy.accessibilityId("Who Dis?");
    private final By negopotchi = AppiumBy.accessibilityId("Nepogotchi");
    private final By influencer = AppiumBy.accessibilityId("Can you make it as an influencer?");
    private final By profileIcon = By.xpath("//XCUIElementTypeNavigationBar[@name=\"_TtGC7SwiftUI32NavigationStackHosting\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton");

    // DAILY TRIVIA
    private final By dailyTrivia = AppiumBy.accessibilityId("DAILY TRIVIA");
    private final By startButton = AppiumBy.accessibilityId("Start Game");
    private final By triviaOption = By.xpath("XCUIElementTypeButton");
    private final By nextQButton = By.xpath("(//XCUIElementTypeButton[@name=\"Next Question\"])[2]");

 //   private final By startPyramid = By.xpath("(//XCUIElementTypeStaticText[@name=\"Start\"])[1]");
    private final By startPyramid = AppiumBy.accessibilityId("Get Started");
    private final By howToPlay = AppiumBy.accessibilityId("How To Play");
    private final By nextPyramid = AppiumBy.accessibilityId("Next");
    private final By caretRight = AppiumBy.accessibilityId("Caret Right");
    private final By startBtn = AppiumBy.accessibilityId("Start");

//METHODS
    public void tapCaretRight() {getDriver().findElement(caretRight).click();}
    public void tapStart() {getDriver().findElement(startBtn).click();}
    public Boolean isDailyTriviaHeaderDisplayed(){return getDriver().findElement(dailyTrivia).isDisplayed();}
    public Boolean isStartGameDisplayed(){return getDriver().findElement(startButton).isDisplayed();}
    public void tapStartPyramid(){ getDriver().findElement(startPyramid).click();}
    public boolean isHowToPlayHeaderDisplayed() {return getDriver().findElement(howToPlay).isDisplayed();}
    public void tapNext(){getDriver().findElement(nextQButton).click();}
    public void tapNextPyramid(){getDriver().findElement(nextPyramid).click();}

    // SUBNAVS
    private final By subnavTrending = AppiumBy.accessibilityId("Subnav-Trending");
    private final By subnavFunnyTweets = AppiumBy.accessibilityId("Funny Tweets");
    private final By subnavGames = AppiumBy.accessibilityId("Subnav-Games");
    private final By subnavLatest = AppiumBy.accessibilityId("Latest");
    private final By subnavRandom = AppiumBy.accessibilityId("Random");
    private final By subnavGossip = AppiumBy.accessibilityId("Subnav-Gossip");
    private final By subnavGay = AppiumBy.accessibilityId("Subnav-Gay");
    private final By subnavMore = AppiumBy.accessibilityId("Subnav-More");

    //SUBNAV METHODS

    public void tapOnTrendingSubNav(){getDriver().findElement( subnavTrending).click();}

    public void tapOnFunnyTweetsSubNav(){getDriver().findElement(subnavFunnyTweets).click();}
    public void tapOnGamesSubNav(){getDriver().findElement(subnavGames).click();;}
    public void tapOnLatestSubNav(){getDriver().findElement(subnavLatest).click();;}
    public void tapOnRandomSubNav(){getDriver().findElement(subnavRandom).click();;}
    public void tapOnGossipSubNav(){getDriver().findElement(subnavGossip).click();;}
    public void tapOnGaySubNav(){getDriver().findElement(subnavGay).click();;}
    public void tapOnMoreSubNav(){getDriver().findElement(subnavMore).click();;}


    public Boolean isPyramidSchemeHeaderDisplayed(){
       return getDriver().findElement(pyramidSchemeImg).isDisplayed();
    }


    //Methods

    public void tapOnProfile(){getDriver().findElement(profileIcon).click();}
    public Boolean isGamesLblDisplayed(){ return getDriver().findElement(gamesLbl).isDisplayed();}
    public Boolean isFeaturedGamesDisplayed(){return getDriver().findElement(featuredGame).isDisplayed();}
    public Boolean isPyramidSchemeImgDisplayed(){return getDriver().findElement(pyramidSchemeImg).isDisplayed();}
    public Boolean isPyramidSchemeDescDisplayed(){return getDriver().findElement(pyramidSchemeDesc).isDisplayed();}

    public void clickOnPyramidScheme(){getDriver().findElement(pyramidSchemeImg).click();}
    public void clickOnQuizParty(){getDriver().findElement(quizPartyThumbnail).click();}
    public void clickOnDailyTrivia(){getDriver().findElement(dailyTriviaThumbnail).click();}


    public Boolean isMoreFunStuffLblDisplayed() {return getDriver().findElement(moreFunStuffLbl).isDisplayed();}
    public void tapOnWhoDis(){getDriver().findElement(whoDis).click();}
    public void tapOnNepogochi(){getDriver().findElement(negopotchi).click();}
    public void tapOnInfluencer(){getDriver().findElement(influencer).click();}



    //
    private final By CTALink = AppiumBy.accessibilityId("See more shopping posts");

    private final By showDown = AppiumBy.accessibilityId("Showdown");
    public void tapOnShowDown(){getDriver().findElement(showDown).click();}

    private final By continueReadingLbl = AppiumBy.accessibilityId("Continue Reading");
    private final By lifeBtn = AppiumBy.accessibilityId("Life");
    private final By VideosBtn = AppiumBy.accessibilityId("Videos");
    private final By CelebrityBtn = AppiumBy.accessibilityId("Celebrity");
    private final By AnimalsBtn = AppiumBy.accessibilityId("Animals");
    private final By FoodBtn = AppiumBy.accessibilityId("Food");
    private final By MusicBtn = AppiumBy.accessibilityId("Music");
    private final By trendingVideosTitle = AppiumBy.accessibilityId("Trending Videos");
    private final By trendingVideoCell = By.xpath("(//XCUIElementTypeOther[@name=\"xcThumbnailView\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By playVideo = By.xpath("(//XCUIElementTypeImage[@name=\"xcThumbnailPlayImage\"])[1]");
    private final By closeVideo = By.xpath("xcCloseButton");
    private final By closeComments = AppiumBy.accessibilityId("close");

    private final By backHome = AppiumBy.accessibilityId("Home");
    private final By showCell = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_image_cell\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
 //   private final By backHome = By.xpath("(//XCUIElementTypeButton[@name=\"Back\"])[1]");
 //   private final By recentlyViewed = By.xpath("//*[contains(@name,'Recently Viewed')]");
    private final By recentlyViewed = AppiumBy.accessibilityId("Recently Viewed");
 //   private final By recentlyViewed = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
 //   private final By trending = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By trending = AppiumBy.accessibilityId("Trending");
    private final By aiquizzes = AppiumBy.accessibilityId("AI Quizzes");
    private final By celebrity = AppiumBy.accessibilityId("Celebrity");
  //  private final By celebrity = By.xpath("**/XCUIElementTypeCollectionView[`name == \"BUFFET_COLLECTION\"`]/XCUIElementTypeOther/XCUIElementTypeButton[3]");
    private final By food = AppiumBy.accessibilityId("Food");
 //   private final By food = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");
    private final By tvAndMovies = AppiumBy.accessibilityId("TV & Movies");
 //   private final By tvAndMovies = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[5]");
   // private final By more = By.xpath("//*[contains(@name,'More')]");
 //   private final By more = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[6]");
    private final By more = AppiumBy.accessibilityId("More");

  //  private final By coronavirus = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By coronavirus = AppiumBy.accessibilityId("Coronavirus");

    private final By videos = AppiumBy.accessibilityId("Videos");
  //  private final By shopping = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

 //   private final By videos = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By shows = AppiumBy.accessibilityId("Shows");
 //   private final By shows = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By animals = AppiumBy.accessibilityId("Animals");
//    private final By animals = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By books = AppiumBy.accessibilityId("Books");
 //   private final By books = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By community = AppiumBy.accessibilityId("Community");
  //  private final By community = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By health = AppiumBy.accessibilityId("Health");
 //   private final By health = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By lgbtq = AppiumBy.accessibilityId("LGBTQ");
 //   private final By lgbtq = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By music = AppiumBy.accessibilityId("Music");
  //  private final By music = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By nifty = AppiumBy.accessibilityId("Nifty");
  //  private final By nifty = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
 //   private final By parents = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By parents = AppiumBy.accessibilityId("Parents");

    private final By rewind = AppiumBy.accessibilityId("Rewind");
 //   private final By rewind = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By entertainment = AppiumBy.accessibilityId("Entertainment");

   private final By style = AppiumBy.accessibilityId("Style");
 //   private final By style = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By travel = AppiumBy.accessibilityId("Travel");
  //  private final By travel = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

   //TRENDING VISUAL FEED
    private final By commentsBtn = By.xpath("//*[@label='Comments']");
    private final By bookmarkBtn = By.xpath("//*[@label='Bookmark']");
    private final By shareBtn = By.xpath("//*[@label='Share']");
    private final By closeAuthor = AppiumBy.accessibilityId("close");



    //ELEMENTS



    private final By maybeLaterBtn = AppiumBy.accessibilityId("Maybe later");
    private final By shoppingPackageCTA =  By.xpath("//*[contains(@name,'Find even more')]");
    private final By popularProdLbl = AppiumBy.accessibilityId("Popular Products");
    private final By trendingCell = By.xpath("//XCUIElementTypeCell[@name=\"trending_products_package_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage");
  //  private final By trendingCell = By.xpath("//XCUIElementTypeCell[@name='trending_products_package_cell']/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By firstCellShoppingRecommendations = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[1]/XCUIElementTypeOther[2]");
    private final By firstShopNowButton = By.xpath("(//XCUIElementTypeButton[@name='Shop Now'])[1]");
    private final By collectDataDisclaimer = AppiumBy.accessibilityId("BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.");
    private final By trendingVideosHeader = AppiumBy.accessibilityId("Trending Videos");
    private final By seeMoreVideoButton = AppiumBy.accessibilityId("See More Video");
    private final By homeFooter = By.xpath("//XCUIElementTypeButton[@name=\"home\"]");
 //   private final By viewsLbl = By.xpath("//*[contains(@Label,'K views')]");
    private final By viewsLbl = By.className("SwiftUI.AccessibilityNode");

    private final By authorName = AppiumBy.accessibilityId("Author");
  //  private final By authorName = By.xpath("//*[contains(@Label,'by')]");

    public void tapOnCTALink(){getDriver().findElement(CTALink).click();}

    //Methods
    //VISUAL FEED ELEMENTS

    public Boolean validateContinueReadingLblIsDisplayed(){
      //  WaitersPage.waitForElement(continueReadingLbl);
       return getDriver().findElement(continueReadingLbl).isDisplayed();
    }

    public void  tapLifeBtn(){
      //  WaitersPage.waitForElement(lifeBtn);
         getDriver().findElement(lifeBtn).click();
    }

    public void  tapVideosBtn(){
      //  WaitersPage.waitForElement(VideosBtn);
        getDriver().findElement(VideosBtn).click();
    }

    public void  tapCelebrityBtn(){
      //  WaitersPage.waitForElement(CelebrityBtn);
        getDriver().findElement(CelebrityBtn).click();
    }

    public void  tapAnimalsBtn(){
      //  WaitersPage.waitForElement(AnimalsBtn);
        getDriver().findElement(AnimalsBtn).click();
    }

    public void  tapFoodBtn(){
      //  WaitersPage.waitForElement(FoodBtn);
        getDriver().findElement(FoodBtn).click();
    }

    public void  tapMusicBtn(){
      //  WaitersPage.waitForElement(MusicBtn);
        getDriver().findElement(MusicBtn).click();
    }

    public void tapOnNextQuestion(){getDriver().findElement(nextQButton).click();}
    public void selectOption() {getDriver().findElement(triviaOption).click();}
    public void tapStartBtn() {getDriver().findElement(startButton).click();}


    public void runDailyTrivia()throws InterruptedException{
        tapStartBtn();
        List<WebElement> listOfElements = getDriver().findElements(By.xpath("//XCUIElementTypeButton"));
        for(int i=0; i<5; i++){
            Thread.sleep(1000);
            listOfElements.get(4).click();
          //  Thread.sleep(3000);
            tapOnNextQuestion();
            System.out.println(listOfElements.get(3).getText());
        }
    }



    public void closeComments(){
        getDriver().findElement(closeComments).click();
    }

    public void scrollDownOnvisualFeed(){
        for(int i=1; i<=20; i++){
            scroll.scrollDown();
        }
    }

    public void closeAuthor(){
        getDriver().findElement(closeAuthor).click();
    }

    public void tapOnViewsBtn() {int i =0;
        List<WebElement> views=  getDriver().findElements(viewsLbl);
        views.get(i).click();}

    public void tapOnBookmarks() {
        int i =0;
        List<WebElement> bookmarks=  getDriver().findElements(bookmarkBtn);
        bookmarks.get(i).click();
    }

    public void tapOnAuthorName() {
        int i =0;
        List<WebElement> authors=  getDriver().findElements(authorName);
      authors.get(i).click();
    }

    public void tapOnCommentBtn(){
        int i =0;
        List<WebElement> comments=  getDriver().findElements(commentsBtn);
        comments.get(i).click();
    }
    public void tapOnShareBtn(){
        int i =0;
        List<WebElement> share=  getDriver().findElements(shareBtn);
        share.get(i).click();
    }


    //--Allow button + BuzzFeed logo
    public void backHome(){getDriver().findElement(backHome).click();}
    public void clickShowCell(){getDriver().findElement(showCell).click();}
    public boolean allowButtonIsPresent() {
        return getDriver().findElement(allowButton).isDisplayed();
    }
    public void clickOnMaybeLater(){getDriver().findElement(maybeLaterBtn).click();}

    public void clickOnHomeIcon() {getDriver().findElement(homeFooter).click();}

    //Trending videos
    public Boolean validateTrendingVideosTitle() {
        scroll.scrollUntilElement(trendingVideosTitle);
        return getDriver().findElement(trendingVideosTitle).isDisplayed();}
    public void tapOnTrendingVideo() {getDriver().findElement(playVideo).click();}
    public void closeTrendingVideo() {getDriver().findElement(closeVideo).click();}

    //--Splash
    public void dismissTooltip() {
         getDriver().findElement(dismissTooltip).click();
    }

    //--Shopping package
    public void tapItemsShopPackage(){
        int x=1;
        for (WebElement e : getDriver().findElements(itemsPackage)) {
            e.click();
            tapBackButton();
            System.out.println("Tapped item: " + x  + " from 'Shopping' Package");
            x++;
        }
        print("Tapped all items from 'Shopping' package");
    }

    public void tapOnRecentlyViewed(){getDriver().findElement(recentlyViewed).click();}
    public void tapOnTrending(){getDriver().findElement(trending).click();}
    public void tapOnCelebrity(){getDriver().findElement(celebrity).click();}
    public void tapOnFood(){getDriver().findElement(food).click();}
    public void tapOnTVAndMovies(){getDriver().findElement(tvAndMovies).click();}
    public void tapOnMore(){getDriver().findElement(more).click();}
    public void tapOnCoronavirus(){getDriver().findElement(coronavirus).click();}
    public void tapOnEntertainment(){getDriver().findElement(entertainment).click();}
  //  public void tapOnShopping(){getDriver().findElement(shopping).click();}
    public void tapOnVideos(){getDriver().findElement(videos).click();}
    public void tapOnShows(){getDriver().findElement(shows).click();}
    public void tapOnAnimals(){getDriver().findElement(animals).click();}
    public void tapOnBooks(){getDriver().findElement(books).click();}
    public void tapOnCommunity(){getDriver().findElement(community).click();}
    public void tapOnHealth(){getDriver().findElement(health).click();}
    public void tapOnLGBTQ(){getDriver().findElement(lgbtq).click();}
    public void tapOnMusic(){getDriver().findElement(music).click();}
    public void tapOnNifty(){getDriver().findElement(nifty).click();}
    public void tapOnParents(){getDriver().findElement(parents).click();}
    public void tapOnRewind(){getDriver().findElement(rewind).click();}
    public void tapOnStyle(){getDriver().findElement(style).click();}
    public void tapOnTravel(){getDriver().findElement(travel).click();}
    public void tapOnAIQuizzes() {getDriver().findElement(aiquizzes).click();}



    public Boolean shoppingPackageCTAButtonIsPresent() {
        return getDriver().findElement(shoppingPackageCTA).isDisplayed();
    }

    public void tapShoppingCTAButton(){
        getDriver().findElement(shoppingPackageCTA).click();
        print("Tapped Shopping Package CTA button: 'Find even more shopping recommendations'");
    }

    public void tapFirstCellShoppingRecommendations(){
        getDriver().findElement(firstCellShoppingRecommendations).click();
        print("Tapped First Bpage on Shopping Recommendations feed");
    }

    //--Trending products package
    public void scrollDownToTrending(){
        scroll.scrollMultipleTimes(3);
        scroll.scrollDown90_20();
        scroll.scrollUntilElement(popularProdLbl);
        scroll.scrollDown90_70();

    }

    public void tapFirstTrendingCell(){
        getDriver().findElement(trendingCell).click();
        print("Tapped first trending cell");
    }

    public Boolean firstShopNowButtonIsPresent(){
        return getDriver().findElement(firstShopNowButton).isDisplayed();
    }

    public Boolean collectDataDisclaimerIsPresent() {
        scroll.scrollDown90_50();
        return getDriver().findElement(collectDataDisclaimer).isDisplayed();
    }

    public void tapFirstShowNowTrendingProduct(){
      //  WaitersPage.waitForElement(firstShopNowButton);
        getDriver().findElement(firstShopNowButton).click();
        print("Tapped first 'Show Now' button");
    }

    //--Trending videos package
    public void scrollDownToVideos(){
        scroll.scrollDown();
        scroll.scrollDown90_78();
    }

    public void tapItemVideosPackage(){
        int x=1;
        for (WebElement e : getDriver().findElements(itemsPackage)) {
            e.click();
            tapCloseButton();
            System.out.println("Tapped item: " + x  + "from 'Trending Videos' Package");
            x++;
        }
        print("Tapped all items from 'Trending Videos' package");
    }

    public Boolean videosHeaderIsPresent() {
        return getDriver().findElement(trendingVideosHeader).isDisplayed();
    }

    public Boolean seeMoreVideoButtonIsPresent() {
        return getDriver().findElement(seeMoreVideoButton).isDisplayed();
    }

    public void tapSeeMoreButton(){
        getDriver().findElement(seeMoreVideoButton).click();
        print("Tapped 'See More Video' button");
    }

    public void scrollInHome(){
        scroll.scrollDownPlugin(homeView);
    }

    public void scrollUntilInFeedComments(){
        scroll.scrollDownPlugin(inFeedCommentBtn);
    }

    public void scrollMultipleTimesOnhome(int times){
        for (int i=1; i<= times; i++){
            scroll.scrollDownPlugin(homeView);
        }
    }

    public void scrollLeftMultipleTimesOnhome(int times){
        for (int i=1; i<= times; i++){
            scroll.scrollDownPlugin(homeView);
        }
    }

    public void scrollLeftOnhome(){
            scroll.scrollLeftPlugin(homeView);

    }
}
