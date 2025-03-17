package config.pages.home;

import config.pages.CommonPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class NewHomeFeed extends HomeLatestPage {
    private By trendingNowLbl = AppiumBy.accessibilityId("Trending Now");

    private By MakeYoursThumbnail = AppiumBy.accessibilityId("make-yours-thumbnail");
    public void tapMakeYours() {getDriver().findElement(MakeYoursThumbnail).click();}

    private By whealOfFortune= AppiumBy.accessibilityId("wheel-of-fortune-thumbnail");
    public void tapOnWhealOfFortune() {getDriver().findElement(whealOfFortune).click();}

    private By makeYoursTitle = AppiumBy.accessibilityId("Make Yours");
    public Boolean isMakeYoursTitleDisplayed() {return getDriver().findElement(makeYoursTitle).isDisplayed();}

    private By newGamesEveryDay = AppiumBy.accessibilityId("New Games Every Day!");
    public void tapOnNewGamesEveryDay() {getDriver().findElement(newGamesEveryDay).click();}



    private By dailyTrivia = AppiumBy.accessibilityId("Daily Trivia");
    private By playNowTrivia = By.xpath("(//XCUIElementTypeButton[@name=\"Play Now\"])[1]");

    private By pyramidScheme = AppiumBy.accessibilityId("Pyramid Scheme");
    private By playNowPyramidScheme = By.xpath("(//XCUIElementTypeButton[@name=\"Play Now\"])[2]");
    public void isTrendingNewLblDisplayed() { getDriver().findElement(trendingNowLbl).isDisplayed();}

    private By seeAllBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"See All\"]");
    public void tapOnSeeAll() {getDriver().findElement(seeAllBtn).click();}

    private By trendingSplash = By.xpath("//XCUIElementTypeCell[@name=\"splash_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    public void tapOnTrendingSplash() { getDriver().findElement(trendingSplash).click();}

    private By splash = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnSplash() {getDriver().findElement(splash).click();}
    private By fstCell = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    public void tapOnFstCell() {getDriver().findElement(fstCell).click();}
    private By trendingTopicsTitle = AppiumBy.accessibilityId("Trending Topics:");
    private By topic1 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");

    private By hotTopic = AppiumBy.accessibilityId("Hot Topic");
    public Boolean isHotTopicDisplayed() { return getDriver().findElement(hotTopic).isDisplayed();}

    private By DisneyTP = AppiumBy.accessibilityId("Disney Adult Central");
    public Boolean isDisnetTPTitleDisplayed(){return getDriver().findElement(DisneyTP).isDisplayed();}

    private By HarryPotterTP = AppiumBy.accessibilityId("Harry Potter");
    public Boolean isHarryPotterTPTitleDisplayed(){return getDriver().findElement(HarryPotterTP).isDisplayed();}

    private By ArcadeTP = AppiumBy.accessibilityId("BuzzFeed Arcade");
    public Boolean isArcadeTPTitleDisplayed(){return getDriver().findElement(ArcadeTP).isDisplayed();}

    private By taylorSwiftTP = AppiumBy.accessibilityId("Taylor Swift");
    public Boolean isTaylorSwiftTPDisplayed() {return getDriver().findElement(taylorSwiftTP).isDisplayed();}

    private By politicsTP = AppiumBy.accessibilityId("Politics");
    public Boolean isPoliticsTPTitleDisplayed(){ return getDriver().findElement(politicsTP).isDisplayed();}

    private By FunnyTweetsTP = AppiumBy.accessibilityId("Funny Tweets");
    public Boolean isFunnyTweetsTPPTitleDisplayed(){ return getDriver().findElement(FunnyTweetsTP).isDisplayed();}

    private By SexAndLoveTP = AppiumBy.accessibilityId("Sex & Love");
    public Boolean isSexAndLoveTitleDisplayed(){return getDriver().findElement(SexAndLoveTP).isDisplayed();}

    private By Health = AppiumBy.accessibilityId("Health");
    public Boolean isTVAndMoviesTPPTitleDisplayed(){return getDriver().findElement(TVAndMovies).isDisplayed();}

    private By TVAndMovies = AppiumBy.accessibilityId("TV & Movies");
    public Boolean isHealthTPPTitleDisplayed(){return getDriver().findElement(Health).isDisplayed();}

    private By LatestPosts = AppiumBy.accessibilityId("Latest Posts");
    public Boolean isLatestPososPPTitleDisplayed(){return getDriver().findElement(LatestPosts).isDisplayed();}

    public void tapOntopic1() {getDriver().findElement(topic1).click();}
    public void tapOntopic2() {getDriver().findElement(topic2).click();}
    public void tapOntopic3() {getDriver().findElement(topic3).click();}
    public void tapOntopic4() {getDriver().findElement(topic4).click();}
    public void tapOntopic5() {getDriver().findElement(topic5).click();}

    public void tapOntopic6() {getDriver().findElement(topic6).click();}

    public void tapOntopic7() {getDriver().findElement(topic7).click();}

    public void tapOntopic8() {getDriver().findElement(topic8).click();}

    public void tapOntopic9() {getDriver().findElement(topic9).click();}

    public void tapOntopic10() {getDriver().findElement(topic10).click();}


    private By topic2 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");
    private By topic3 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]");
    private By topic4 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]");

    private By topic5 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]");
    private By topic6 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]");
    private By topic7 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]");
    private By topic8 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]");
    private By topic9 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]");
    private By topic10 = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]");


    //  private By more = AppiumBy.accessibilityId("More...");
    private By moreTopics = By.xpath("//XCUIElementTypeButton[@name='More Topics']");
    public void tapOntMore() {getDriver().findElement(moreTopics).click();}

    public Boolean isPlayNowDailyTriviaDisplayed(){ return getDriver().findElement(playNowTrivia).isDisplayed();}

    private By PeopleAreTalkingTitle = AppiumBy.accessibilityId("People Are Talking");
    private By discussionTopic = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther");
   // private By discussionCell = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther");
   private By discussionCell = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeAny");

    public void tapDiscussionTopic() {getDriver().findElement(discussionCell).click();}
    private By discussionTopicLabel = AppiumBy.accessibilityId("People Are Talking");
    private By forYouTitle = AppiumBy.accessibilityId("For You");

    private By forYouItem = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnForYou() {getDriver().findElement(forYouItem).click();}

    private By newFeedWhoDis = AppiumBy.accessibilityId("New Feed Who Dis?");

    private By loveIt = AppiumBy.accessibilityId("\uD83D\uDE04 Love it!");
    public void tapOnLoveIt() {getDriver().findElement(loveIt).click();}
    private By giveMoreFeedback = AppiumBy.accessibilityId("Give More Feedback");
    public void tapGiveMoreFeedback() {getDriver().findElement(giveMoreFeedback).click();}

    private By celebNews = AppiumBy.accessibilityId("In Today's Celeb News \uD83D\uDCF0");
    private By MoreFunStuff = AppiumBy.accessibilityId("More Fun Stuff");
    public void isMoreFunStuffDisplayed() {getDriver().findElement(MoreFunStuff).isDisplayed();}

    private By celebCell = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnCelebCell() {getDriver().findElement(celebCell).click();}
    private By shoppingLbl = AppiumBy.accessibilityId("Shopping");
 //   private By shoppingSplash = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    private By shoppingSplash = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnShoppingSplash() {getDriver().findElement(shoppingSplash).click();}
    private By inTheNewsLbl = AppiumBy.accessibilityId("In The News");
    public Boolean isIntheNewsLblDisplayed(){return getDriver().findElement(inTheNewsLbl).isDisplayed();}

    private By inTheNewsItem = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnInTheNewsCell() {
        getDriver().findElement(inTheNewsItem).click();
    }
    private By theBestOfInternet = AppiumBy.accessibilityId("Best of Internet");
    private By bestOfInternetItem = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
    public void tapOnBestOfInternet() {getDriver().findElement(bestOfInternetItem).click();}

    public void goToTrendingTopics(IOSDriver driver)throws InterruptedException {
       scroll.scrollToElementIOS(trendingTopicsTitle, driver);

    }

    public void tapOnPlayNowDailyTrivia(){getDriver().findElement(playNowTrivia).click();}
    public void tapOnPlayNowPyramidScheme(){getDriver().findElement(playNowPyramidScheme).click();}


    public void scrollUntilTrendingTopics(IOSDriver driver){
        scroll.scrollUntilElementGeneric(trendingTopicsTitle, 4, 0.8, 0.7, driver);
    }

    public void scrollUntilDailyTriviaCell(IOSDriver driver){
        scroll.scrollUntilElementGeneric(dailyTrivia, 7, 0.8, 0.7, driver);
    }

    public void scrollUntilPyramidSchemeCell(IOSDriver driver){
        scroll.scrollUntilElementGeneric(pyramidScheme, 2, 0.8, 0.7, driver);
    }
    public void scrollUntilDiscussionTopic(IOSDriver driver){
        scroll.scrollUntilElementGeneric(discussionTopicLabel, 4, 0.8, 0.7, driver);
    }

    public Boolean isDiscussionLabelDisplayed(){
       return getDriver().findElement(discussionTopicLabel).isDisplayed();
    }

    public void scrollUntilForYou(IOSDriver driver){
        scroll.scrollUntilElementGeneric(forYouTitle, 7, 0.8, 0.7, driver);
    }

    public void scrollUntilWhoDis(IOSDriver driver){
        scroll.scrollUntilElementGeneric(newFeedWhoDis, 4, 0.8, 0.7, driver);
    }

    public void scrollUntilShopping(IOSDriver driver){
        scroll.scrollUntilElementGeneric(shoppingLbl, 7, 0.8, 0.7, driver);
    }

    public void scrollUntilInTheNews(IOSDriver driver){
        scroll.scrollUntilElementGeneric(inTheNewsLbl, 10, 0.8, 0.7, driver);
    }

    public void validateTrendingTopics()throws InterruptedException{
        scroll.scrollGeneric(0.8,0.7,getDriver());
        tapOntopic1();
        Thread.sleep(2000);
        isDisnetTPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic2();
        Thread.sleep(2000);
        isHarryPotterTPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic3();
        Thread.sleep(2000);
        isArcadeTPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic4();
        Thread.sleep(2000);
        isTaylorSwiftTPDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic5();
        Thread.sleep(2000);
        isPoliticsTPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic6();
        Thread.sleep(2000);
        isFunnyTweetsTPPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic7();
        Thread.sleep(2000);
        isSexAndLoveTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic8();
        Thread.sleep(2000);
        isHealthTPPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic9();
        Thread.sleep(2000);
        isTVAndMoviesTPPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOntopic10();
        Thread.sleep(2000);
        isLatestPososPPTitleDisplayed();
        Thread.sleep(2000);
        tapBackButton();
    }

    public void validateMoreButton()throws InterruptedException{
        Thread.sleep(3000);
        tapOntMore();
        Thread.sleep(2000);
        tapOnFunnyTweetsSubNav();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnLatestSubNav();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapCelebrityBtn();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnTVAndMovies();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnCommunity();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnFood();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnRandomSubNav();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnLGBTQ();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnVideos();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnShows();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnRewind();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnAnimals();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(1000);
        scroll.scrollGeneric(0.8, 0.7, getDriver());
        tapOnBooks();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnMusic();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnStyle();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnTravel();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnNifty();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnParents();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapOnShowDown();
        Thread.sleep(2000);
        tapBackButton();
        Thread.sleep(2000);
        tapBackButton();
    }




}
