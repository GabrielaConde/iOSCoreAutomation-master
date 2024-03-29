package config.pages.home;

import config.pages.CommonPage;
import config.pages.WaitersPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.ui.context.Theme;
import sun.security.krb5.internal.TGSRep;

import java.util.List;

public class HomeLatestPage extends CommonPage {


    //Catching elements
    //--Home elements

    //NEW TAB NABS
  //  private final By recentlyViewed = MobileBy.AccessibilityId("⏳ Recently Viewed");
  //  private final By backHome = MobileBy.AccessibilityId("Home");

    //COMMENTS IN-FEED
    private final By inFeedCommentBtn = MobileBy.AccessibilityId("Write Comment");
    public void tapOnInFeedComments() {driver.findElement(inFeedCommentBtn).click();}

    //IN FEED ELEMENTS
     private final By dailyTriviaPromo = MobileBy.AccessibilityId("banner_promo_cell");

    public Boolean tapOnDailyTriviaPromo() throws InterruptedException{
        driver.findElement(dailyTriviaPromo).click();
        Thread.sleep(2000);
       return isDailyTriviaHeaderDisplayed();
    }

    //GAMES TAB
    private final By gamesLbl = By.xpath("//XCUIElementTypeStaticText[@name=\"Games\"]");
    private final By featuredGame = MobileBy.AccessibilityId("FEATURED GAME");
    private final By pyramidSchemeImg = MobileBy.AccessibilityId("pyramid-scheme-text-img");
    private final By pyramidSchemeDesc = MobileBy.AccessibilityId("Connect the dots to spell words and score points.");

    private final By quizPartyThumbnail = MobileBy.AccessibilityId("quiz-party-thumbnail");
    private final By dailyTriviaThumbnail = MobileBy.AccessibilityId("daily-trivia-thumbnail");

    private final By moreFunStuffLbl = MobileBy.AccessibilityId("More Fun Stuff");
    private final By whoDis = MobileBy.AccessibilityId("Who Dis?");
    private final By negopotchi = MobileBy.AccessibilityId("Nepogotchi");
    private final By influencer = MobileBy.AccessibilityId("Can you make it as an influencer?");
    private final By profileIcon = By.xpath("//XCUIElementTypeNavigationBar[@name=\"_TtGC7SwiftUI32NavigationStackHosting\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton");

    // DAILY TRIVIA
    private final By dailyTrivia = MobileBy.AccessibilityId("DAILY TRIVIA");
    private final By startButton = MobileBy.AccessibilityId("Start Game");
    private final By triviaOption = By.xpath("XCUIElementTypeButton");
    private final By nextQButton = By.xpath("(//XCUIElementTypeButton[@name=\"Next Question\"])[2]");

    private final By startPyramid = By.xpath("(//XCUIElementTypeStaticText[@name=\"Start\"])[1]");
    private final By howToPlay = MobileBy.AccessibilityId("How To Play");
    private final By nextPyramid = MobileBy.AccessibilityId("Next");
    private final By caretRight = MobileBy.AccessibilityId("Caret Right");
    private final By startBtn = MobileBy.AccessibilityId("Start");

//METHODS
    public void tapCaretRight() {driver.findElement(caretRight).click();}
    public void tapStart() {driver.findElement(startBtn).click();}
    public Boolean isDailyTriviaHeaderDisplayed(){return driver.findElement(dailyTrivia).isDisplayed();}
    public Boolean isStartGameDisplayed(){return driver.findElement(startButton).isDisplayed();}
    public void tapStartPyramid(){ driver.findElement(startPyramid).click();}
    public boolean isHowToPlayHeaderDisplayed() {return driver.findElement(howToPlay).isDisplayed();}
    public void tapNext(){driver.findElement(nextQButton).click();}
    public void tapNextPyramid(){driver.findElement(nextPyramid).click();}

    // SUBNAVS
    private final By subnavTrending = MobileBy.AccessibilityId("Subnav-Trending");
    private final By subnavFunnyTweets = MobileBy.AccessibilityId("Subnav-FunnyTweets");
    private final By subnavGames = MobileBy.AccessibilityId("Subnav-Games");
    private final By subnavLatest = MobileBy.AccessibilityId("Subnav-Latest");
    private final By subnavRandom = MobileBy.AccessibilityId("Subnav-Random");
    private final By subnavGossip = MobileBy.AccessibilityId("Subnav-Gossip");
    private final By subnavGay = MobileBy.AccessibilityId("Subnav-Gay");
    private final By subnavMore = MobileBy.AccessibilityId("Subnav-More");

    //SUBNAV METHODS

    public void tapOnTrendingSubNav(){driver.findElement( subnavTrending).click();}
    public void tapOnFunnyTweetsSubNav(){driver.findElement(subnavFunnyTweets).click();}
    public void tapOnGamesSubNav(){driver.findElement(subnavGames).click();;}
    public void tapOnLatestSubNav(){driver.findElement(subnavLatest).click();;}
    public void tapOnRandomSubNav(){driver.findElement(subnavRandom).click();;}
    public void tapOnGossipSubNav(){driver.findElement(subnavGossip).click();;}
    public void tapOnGaySubNav(){driver.findElement(subnavGay).click();;}
    public void tapOnMoreSubNav(){driver.findElement(subnavMore).click();;}


    //Methods

    public void tapOnProfile(){driver.findElement(profileIcon).click();}
    public Boolean isGamesLblDisplayed(){ return driver.findElement(gamesLbl).isDisplayed();}
    public Boolean isFeaturedGamesDisplayed(){return driver.findElement(featuredGame).isDisplayed();}
    public Boolean isPyramidSchemeImgDisplayed(){return driver.findElement(pyramidSchemeImg).isDisplayed();}
    public Boolean isPyramidSchemeDescDisplayed(){return driver.findElement(pyramidSchemeDesc).isDisplayed();}

    public void clickOnPyramidScheme(){driver.findElement(pyramidSchemeImg).click();}
    public void clickOnQuizParty(){driver.findElement(quizPartyThumbnail).click();}
    public void clickOnDailyTrivia(){driver.findElement(dailyTriviaThumbnail).click();}


    public Boolean isMoreFunStuffLblDisplayed() {return driver.findElement(moreFunStuffLbl).isDisplayed();}
    public void tapOnWhoDis(){driver.findElement(whoDis).click();}
    public void tapOnNepogochi(){driver.findElement(negopotchi).click();}
    public void tapOnInfluencer(){driver.findElement(influencer).click();}



    //
    private final By CTALink = MobileBy.AccessibilityId("See more shopping posts");

    private final By continueReadingLbl = MobileBy.AccessibilityId("Continue Reading");
    private final By lifeBtn = MobileBy.AccessibilityId("Life");
    private final By VideosBtn = MobileBy.AccessibilityId("Videos");
    private final By CelebrityBtn = MobileBy.AccessibilityId("Celebrity");
    private final By AnimalsBtn = MobileBy.AccessibilityId("Animals");
    private final By FoodBtn = MobileBy.AccessibilityId("Food");
    private final By MusicBtn = MobileBy.AccessibilityId("Music");
    private final By trendingVideosTitle = MobileBy.AccessibilityId("Trending Videos");
    private final By trendingVideoCell = By.xpath("(//XCUIElementTypeOther[@name=\"xcThumbnailView\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    private final By playVideo = By.xpath("(//XCUIElementTypeImage[@name=\"xcThumbnailPlayImage\"])[1]");
    private final By closeVideo = By.xpath("xcCloseButton");
    private final By closeComments = MobileBy.AccessibilityId("close");

    private final By backHome = MobileBy.AccessibilityId("Home");
    private final By showCell = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_image_cell\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
 //   private final By backHome = By.xpath("(//XCUIElementTypeButton[@name=\"Back\"])[1]");
 //   private final By recentlyViewed = By.xpath("//*[contains(@name,'Recently Viewed')]");
    private final By recentlyViewed = MobileBy.AccessibilityId("Recently Viewed");
 //   private final By recentlyViewed = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
 //   private final By trending = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[2]");
    private final By trending = MobileBy.AccessibilityId("Trending");
    private final By aiquizzes = MobileBy.AccessibilityId("AI Quizzes");
    private final By celebrity = MobileBy.AccessibilityId("Celebrity");
  //  private final By celebrity = By.xpath("**/XCUIElementTypeCollectionView[`name == \"BUFFET_COLLECTION\"`]/XCUIElementTypeOther/XCUIElementTypeButton[3]");
    private final By food = MobileBy.AccessibilityId("Food");
 //   private final By food = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[4]");
    private final By tvAndMovies = MobileBy.AccessibilityId("TV & Movies");
 //   private final By tvAndMovies = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[5]");
   // private final By more = By.xpath("//*[contains(@name,'More')]");
 //   private final By more = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeButton[6]");
    private final By more = MobileBy.AccessibilityId("More");

  //  private final By coronavirus = By.xpath("/XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By coronavirus = MobileBy.AccessibilityId("Coronavirus");

    private final By videos = MobileBy.AccessibilityId("Videos");
  //  private final By shopping = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

 //   private final By videos = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By shows = MobileBy.AccessibilityId("Shows");
 //   private final By shows = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By animals = MobileBy.AccessibilityId("Animals");
//    private final By animals = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By books = MobileBy.AccessibilityId("Books");
 //   private final By books = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By community = MobileBy.AccessibilityId("Community");
  //  private final By community = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By health = MobileBy.AccessibilityId("Health");
 //   private final By health = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By lgbtq = MobileBy.AccessibilityId("LGBTQ");
 //   private final By lgbtq = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By music = MobileBy.AccessibilityId("Music");
  //  private final By music = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By nifty = MobileBy.AccessibilityId("Nifty");
  //  private final By nifty = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
 //   private final By parents = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
    private final By parents = MobileBy.AccessibilityId("Parents");

    private final By rewind = MobileBy.AccessibilityId("Rewind");
 //   private final By rewind = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By entertainment = MobileBy.AccessibilityId("Entertainment");

   private final By style = MobileBy.AccessibilityId("Style");
 //   private final By style = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    private final By travel = MobileBy.AccessibilityId("Travel");
  //  private final By travel = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

   //TRENDING VISUAL FEED
    private final By commentsBtn = By.xpath("//*[@label='Comments']");
    private final By bookmarkBtn = By.xpath("//*[@label='Bookmark']");
    private final By shareBtn = By.xpath("//*[@label='Share']");
    private final By closeAuthor = MobileBy.AccessibilityId("close");



    //ELEMENTS



    private final By maybeLaterBtn = MobileBy.AccessibilityId("Maybe later");
    private final By shoppingPackageCTA =  By.xpath("//*[contains(@name,'Find even more')]");
    private final By popularProdLbl = MobileBy.AccessibilityId("Popular Products");
    private final By trendingCell = By.xpath("//XCUIElementTypeCell[@name=\"trending_products_package_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage");
  //  private final By trendingCell = By.xpath("//XCUIElementTypeCell[@name='trending_products_package_cell']/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By firstCellShoppingRecommendations = By.xpath("(//XCUIElementTypeCell[@name=\"buffet_grid_cell\"])[1]/XCUIElementTypeOther[2]");
    private final By firstShopNowButton = By.xpath("(//XCUIElementTypeButton[@name='Shop Now'])[1]");
    private final By collectDataDisclaimer = MobileBy.AccessibilityId("BuzzFeed may collect a share of sales if you decide to shop these products. Prices are accurate and items in stock as of time of publication.");
    private final By trendingVideosHeader = MobileBy.AccessibilityId("Trending Videos");
    private final By seeMoreVideoButton = MobileBy.AccessibilityId("See More Video");
    private final By homeFooter = By.xpath("//XCUIElementTypeButton[@name=\"home\"]");
 //   private final By viewsLbl = By.xpath("//*[contains(@Label,'K views')]");
    private final By viewsLbl = By.className("SwiftUI.AccessibilityNode");

    private final By authorName = MobileBy.AccessibilityId("Author");
  //  private final By authorName = By.xpath("//*[contains(@Label,'by')]");

    public void tapOnCTALink(){driver.findElement(CTALink).click();}

    //Methods
    //VISUAL FEED ELEMENTS

    public Boolean validateContinueReadingLblIsDisplayed(){
        WaitersPage.waitForElement(continueReadingLbl);
       return driver.findElement(continueReadingLbl).isDisplayed();
    }

    public void  tapLifeBtn(){
        WaitersPage.waitForElement(lifeBtn);
         driver.findElement(lifeBtn).click();
    }

    public void  tapVideosBtn(){
        WaitersPage.waitForElement(VideosBtn);
        driver.findElement(VideosBtn).click();
    }

    public void  tapCelebrityBtn(){
        WaitersPage.waitForElement(CelebrityBtn);
        driver.findElement(CelebrityBtn).click();
    }

    public void  tapAnimalsBtn(){
        WaitersPage.waitForElement(AnimalsBtn);
        driver.findElement(AnimalsBtn).click();
    }

    public void  tapFoodBtn(){
        WaitersPage.waitForElement(FoodBtn);
        driver.findElement(FoodBtn).click();
    }

    public void  tapMusicBtn(){
        WaitersPage.waitForElement(MusicBtn);
        driver.findElement(MusicBtn).click();
    }

    public void tapOnNextQuestion(){driver.findElement(nextQButton).click();}
    public void selectOption() {driver.findElement(triviaOption).click();}
    public void tapStartBtn() {driver.findElement(startButton).click();}


    public void runDailyTrivia()throws InterruptedException{
        tapStartBtn();
        List<MobileElement> listOfElements = driver.findElements(By.xpath("//XCUIElementTypeButton"));
        for(int i=0; i<5; i++){
            Thread.sleep(1000);
            listOfElements.get(4).click();
          //  Thread.sleep(3000);
            tapOnNextQuestion();
            System.out.println(listOfElements.get(3).getText());
        }
    }



    public void closeComments(){
        driver.findElement(closeComments).click();
    }

    public void scrollDownOnvisualFeed(){
        for(int i=1; i<=20; i++){
            scroll.scrollDown();
        }
    }

    public void closeAuthor(){
        driver.findElement(closeAuthor).click();
    }

    public void tapOnViewsBtn() {int i =0;
        List<MobileElement> views=  driver.findElements(viewsLbl);
        views.get(i).click();}

    public void tapOnBookmarks() {
        int i =0;
        List<MobileElement> bookmarks=  driver.findElements(bookmarkBtn);
        bookmarks.get(i).click();
    }

    public void tapOnAuthorName() {
        int i =0;
        List<MobileElement> authors=  driver.findElements(authorName);
      authors.get(i).click();
    }

    public void tapOnCommentBtn(){
        int i =0;
        List<MobileElement> comments=  driver.findElements(commentsBtn);
        comments.get(i).click();
    }
    public void tapOnShareBtn(){
        int i =0;
        List<MobileElement> share=  driver.findElements(shareBtn);
        share.get(i).click();
    }


    //--Allow button + BuzzFeed logo
    public void backHome(){driver.findElement(backHome).click();}
    public void clickShowCell(){driver.findElement(showCell).click();}
    public boolean allowButtonIsPresent() {
        return driver.findElement(allowButton).isDisplayed();
    }
    public void clickOnMaybeLater(){driver.findElement(maybeLaterBtn).click();}

    public void clickOnHomeIcon() {driver.findElement(homeFooter).click();}

    //Trending videos
    public Boolean validateTrendingVideosTitle() {
        scroll.scrollUntilElement(trendingVideosTitle);
        return driver.findElement(trendingVideosTitle).isDisplayed();}
    public void tapOnTrendingVideo() {driver.findElement(playVideo).click();}
    public void closeTrendingVideo() {driver.findElement(closeVideo).click();}

    //--Splash
    public void dismissTooltip() {
         driver.findElement(dismissTooltip).click();
    }

    //--Shopping package
    public void tapItemsShopPackage(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            tapBackButton();
            System.out.println("Tapped item: " + x  + " from 'Shopping' Package");
            x++;
        }
        print("Tapped all items from 'Shopping' package");
    }

    public void tapOnRecentlyViewed(){driver.findElement(recentlyViewed).click();}
    public void tapOnTrending(){driver.findElement(trending).click();}
    public void tapOnCelebrity(){driver.findElement(celebrity).click();}
    public void tapOnFood(){driver.findElement(food).click();}
    public void tapOnTVAndMovies(){driver.findElement(tvAndMovies).click();}
    public void tapOnMore(){driver.findElement(more).click();}
    public void tapOnCoronavirus(){driver.findElement(coronavirus).click();}
    public void tapOnEntertainment(){driver.findElement(entertainment).click();}
  //  public void tapOnShopping(){driver.findElement(shopping).click();}
    public void tapOnVideos(){driver.findElement(videos).click();}
    public void tapOnShows(){driver.findElement(shows).click();}
    public void tapOnAnimals(){driver.findElement(animals).click();}
    public void tapOnBooks(){driver.findElement(books).click();}
    public void tapOnCommunity(){driver.findElement(community).click();}
    public void tapOnHealth(){driver.findElement(health).click();}
    public void tapOnLGBTQ(){driver.findElement(lgbtq).click();}
    public void tapOnMusic(){driver.findElement(music).click();}
    public void tapOnNifty(){driver.findElement(nifty).click();}
    public void tapOnParents(){driver.findElement(parents).click();}
    public void tapOnRewind(){driver.findElement(rewind).click();}
    public void tapOnStyle(){driver.findElement(style).click();}
    public void tapOnTravel(){driver.findElement(travel).click();}
    public void tapOnAIQuizzes() {driver.findElement(aiquizzes).click();}



    public Boolean shoppingPackageCTAButtonIsPresent() {
        return driver.findElement(shoppingPackageCTA).isDisplayed();
    }

    public void tapShoppingCTAButton(){
        driver.findElement(shoppingPackageCTA).click();
        print("Tapped Shopping Package CTA button: 'Find even more shopping recommendations'");
    }

    public void tapFirstCellShoppingRecommendations(){
        driver.findElement(firstCellShoppingRecommendations).click();
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
        driver.findElement(trendingCell).click();
        print("Tapped first trending cell");
    }

    public Boolean firstShopNowButtonIsPresent(){
        return driver.findElement(firstShopNowButton).isDisplayed();
    }

    public Boolean collectDataDisclaimerIsPresent() {
        scroll.scrollDown90_50();
        return driver.findElement(collectDataDisclaimer).isDisplayed();
    }

    public void tapFirstShowNowTrendingProduct(){
        WaitersPage.waitForElement(firstShopNowButton);
        driver.findElement(firstShopNowButton).click();
        print("Tapped first 'Show Now' button");
    }

    //--Trending videos package
    public void scrollDownToVideos(){
        scroll.scrollDown();
        scroll.scrollDown90_78();
    }

    public void tapItemVideosPackage(){
        int x=1;
        for (MobileElement e : driver.findElements(itemsPackage)) {
            e.click();
            tapCloseButton();
            System.out.println("Tapped item: " + x  + "from 'Trending Videos' Package");
            x++;
        }
        print("Tapped all items from 'Trending Videos' package");
    }

    public Boolean videosHeaderIsPresent() {
        return driver.findElement(trendingVideosHeader).isDisplayed();
    }

    public Boolean seeMoreVideoButtonIsPresent() {
        return driver.findElement(seeMoreVideoButton).isDisplayed();
    }

    public void tapSeeMoreButton(){
        driver.findElement(seeMoreVideoButton).click();
        print("Tapped 'See More Video' button");
    }
}
