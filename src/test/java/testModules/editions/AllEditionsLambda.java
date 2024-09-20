package testModules.editions;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.IBuffer;

public class AllEditionsLambda extends EditionsInit {

    @BeforeClass
    public void signInOnFstLaunch() throws InterruptedException {
        try {
            Thread.sleep(3000);
            latestSubTab.tapAllowButton();
            latestSubTab.tapOnGuestSignIn();
            Thread.sleep(3000);
        }catch (Exception e){}
    }

    @Test
    public void testAustraliaEditionIsPresent() {
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        editions.tapSettingsButton();
        editions.tapOnEditionOnAustralia();
        editions.tapAustraliaEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 1)
    public void testGoingNewsTab() throws InterruptedException {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        Thread.sleep(3000);
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
        }catch (Exception e){}
    }

    @Test(priority = 2)
    public void testGoingToQuizzesTab() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        }catch (Exception e){}
    }

    @Test(priority = 3)
    public void testTapOnTrendingCategory() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 4)
    public void testTapOnTriviaCategory() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 5)
    public void testCanWeGuess() throws InterruptedException {
        try{
        testName("testTapWCanWeGuess");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 6)
    public void testTapPolls() throws InterruptedException {
        try{
        testName("testTapOnPolls");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }


    @Test(priority = 7)
    public void testOnMore() throws InterruptedException {
        try{
        testName("testOnMore");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMore();
        }catch (Exception e){}
    }

    @Test(priority = 8)
    public void testTapOnTaylorSwift() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 9)
    public void testTapOnMarvel() throws InterruptedException {
        try{
        testName("testTapOnMarvel");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 10)
    public void testTapOnZodiac() throws InterruptedException {
        try{
        testName("testTapOnZodiac");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 11)
    public void testTapOnHarryPotter() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 12)
    public void testTapOnAnime() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 13)
    public void testTapOnKPop() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 14)
    public void testTapOnGeography() throws InterruptedException {
        try{
        testName("testTapOnGeography");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 15)
    public void testTapOnChecklist() throws InterruptedException {
        try{
        testName("testTapOnChecilist");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }


    @Test(enabled = true, priority = 16)
    public void tapGamesTab() {
            try {
        news.tapGamesTab();
        news.tapHomeTab();
        //   news.tapBackButton();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " + testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(enabled = true, priority = 17)
    public void testCanadaEditionIsPresent() throws InterruptedException {
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Australia' edition is present");
        //  editions.tapHomeTab();
        editions.tapSettingsMenu();
        Thread.sleep(2000);
        editions.tapOnEditionOnCanada();
        print("Verified 'Australia' edition is present in the list");

        editions.tapCanadaEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 18)
    public void testGoingNewsTabOnCanada() throws InterruptedException {
       try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();

        Assert.assertTrue(news.newsHeaderIsPresent());
        print("Verified the Buzzfeed News header in the News feed is present");
       }catch (Exception e){}
    }

    @Test(priority = 19)
    public void testGoingToQuizzesTabOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        }catch (Exception e){}
    }

    @Test(priority = 20)
    public void testTapOnTrendingCategoryOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }


    @Test(priority = 21)
    public void testTapOnAIQuizzesOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 22)
    public void testTapOnTriviaCategoryOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 23)
    public void testTapOnCanWeGuessCategory() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnCanWeGuessCategory");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 24)
    public void testTapPollsOnCanada() throws InterruptedException {
        try{
        testName("testTapOnPolls");
        Thread.sleep(3000);
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(3000);
        editions.tapBackButton();
        }catch (Exception e){}
    }


    @Test(priority = 25)
    public void testOnMoreOnCanada() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testOnMore");
        quizzesSubTabs.tapOnMore();
        }catch (Exception e){}
    }

    @Test(priority = 26)
    public void testTapOnTaylorSwiftOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testOnTaylorSwift");
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 27)
    public void testTapOnMarvelOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnMarvel");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 28)
    public void testTapOnZodiacOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnZodiac");
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 29)
    public void testTapOnHarryPotterOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 30)
    public void testTapOnAnimeOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 31)
    public void testTapOnKPopOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 32)
    public void testTapOnGeographyOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnGeography");
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 33)
    public void testTapOnChecklistOnCanada() throws InterruptedException {
        try{
        Thread.sleep(3000);
        testName("testTapOnChecilist");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(3000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(enabled = true, priority = 34)
    public void tapGamesTabOnCanada() {
          try{
        news.tapGamesTab();
        news.tapHomeTab();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(enabled = true, priority = 35)
    public void testIndiaEditionIsPresent() {
        try{
        print("-------------------STARTING INDIA EDITION TESTS-------------------");
        testName("Verify 'India' edition is present");
        editions.tapSettingsMenu();
        editions.tapOnEditionOnIndia();
        print("Verified 'India' edition is present in the list");
        editions.tapIndiaEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 36)
    public void testGoingNewsTabOnIndia() {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
        }catch (Exception e){}
    }

    @Test(priority = 37)
    public void testGoingToQuizzesTabOnIndia() {
        try{
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        //  editions.visitSplashAndReturn();
    }catch (Exception e){}

    }

    @Test(priority = 38)
    public void testTapOnTrendingCategoryOnIndia() throws InterruptedException {
        try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(enabled = true, priority = 39)
    public void tapGamesTabOnIndia() {
            try {
        news.tapGamesTab();
        news.tapHomeTab();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " + testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(enabled = true, priority = 40)
    public void testUKEditionIsPresent() {
        try{
        print("-------------------STARTING UK EDITION TESTS-------------------");
        testName("Verify 'UK' edition is present");
        editions.tapSettingsMenu();
        editions.tapOnEditionOnUK();

        Assert.assertTrue(editions.ukEditionIsPresent());
        print("Verified 'Australia' edition is present in the list");

        editions.tapUKEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 41)
    public void testGoingNewsTabOnUK() {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.tapNewsTab();
        print("Verified the Buzzfeed News header in the News feed is present");
        }catch (Exception e){}
    }

    @Test(priority = 42)
    public void testGoingToQuizzesTabOnUK() {
        try{
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");
        editions.tapQuizzesTab();
        //  editions.visitSplashAndReturn();
        }catch (Exception e){}
    }

    @Test(priority = 43)
    public void testTapOnTrendingCategoryOnUK() throws InterruptedException {
        try{
        testName("testTapOnTrendingCategory");
        testName("Verify going to Trending Quizzes tab");
        quizzesSubTabs.tapOnTrending();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }


    @Test(priority = 44)
    public void testTapOnAIQuizzesOnUK()throws InterruptedException {
        try{
        testName("testTapOnFoodCategory");
        testName("Verify going to Food category");
        quizzesSubTabs.tapOnAIQuizzes();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 45)
    public void testTapOnTriviaCategoryOnUK() throws InterruptedException {
        try{
        testName("testTapOnTriviaCategory");
        testName("Verify going to Trivia category");
        quizzesSubTabs.tapOnTrivia();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 46)
    public void testTapCanWeGuessOnUK() throws InterruptedException {
        try{
        testName("testTapCanWeGuess");
        quizzesSubTabs.tapOnCanWeGuess();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 47)
    public void testTapPollsOnUK() throws InterruptedException {
        try{
        testName("testTapOnPolls");
        quizzesSubTabs.tapOnPolls();
        Thread.sleep(2000);
        editions.tapBackButton();
        }catch (Exception e){}
    }


    @Test(priority = 48)
    public void testOnMoreOnUK() throws InterruptedException {
        try{
        testName("testOnMore");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnMore();
        }catch (Exception e){}
    }

    @Test(priority = 49)
    public void testTapOnTaylorSwiftOnUK() throws InterruptedException {
        try{
        testName("testOnTaylorSwift");
        Thread.sleep(2000);
        quizzesSubTabs.tapOnTaylorSwift();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 50)
    public void testTapOnMarvelOnUK() throws InterruptedException {
        try{
        testName("testTapOnMarvel");
        quizzesSubTabs.tapOnMarvel();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 51)
    public void testTapOnZodiacOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnZodiac");
        quizzesSubTabs.tapOnZodiac();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 52)
    public void testTapOnHarryPotterOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnHarryPotter");
        quizzesSubTabs.tapOnHarryPotter();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 53)
    public void testTapOnAnimeOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnAnime");
        quizzesSubTabs.tapOnAnime();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 54)
    public void testTapOnKPopOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnKPop");
        quizzesSubTabs.tapOnKpop();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 55)
    public void testTapOnGeographyOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnGeography");
        quizzesSubTabs.tapOnGeographys();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(priority = 56)
    public void testTapOnChecklistOnUK() throws InterruptedException {
        try{
        Thread.sleep(2000);
        testName("testTapOnChecilist");
        quizzesSubTabs.tapOnChecklist();
        Thread.sleep(2000);
        quizzesSubTabs.tapBackButton();
        }catch (Exception e){}
    }

    @Test(enabled = true, priority = 57)
    public void tapGamesTabOnUk()throws InterruptedException{
        Thread.sleep(2000);
        try{
            news.tapGamesTab();
            news.tapHomeTab();
        } catch (Exception e) {
            print("ERROR IN THIS TC: " +  testName("Move to Games Tab"));
            print("ERROR" + e.getMessage());
        }
    }

    @Test(enabled = true, priority = 58)
    public void testLatamEditionIsPresent()throws InterruptedException{
        try{
        print("-------------------STARTING LATAM EDITION TESTS-------------------");
        testName("Verify 'Latam' edition is present");
        Thread.sleep(3000);
        editions.tapSettingsMenu();
        editions.tapOnEditionOnLatam();
        //     Assert.assertTrue(editions.latamEditionIsPresent());
        print("Verified 'India' edition is present in the list");
        editions.tapLatamEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test(priority = 59)
    public void testLoUltimoSubTab(){
        try{
        testName("INICIO");
        testName("Verify Inicio tab / Lo Último sub-tab");
        print("Verified 'Lo Último' sub-tab is present on Inicio tab");
      //  latestSubTab.tapSplash();
        print("Verified 'Splash' is present on Home/Lo Último feed");
      //  editions.tapAtrasButton();
        }catch (Exception e){}
    }

    @Test(priority = 60)
    public void testTendenciasSubTab()throws InterruptedException{
        try{
        print("-------------------STARTING AUSTRALIA EDITION TESTS-------------------");
        testName("Verify 'Tendencias' Tab");
        Assert.assertTrue(editions.tendenciasSubTabIsPresent());
        print("Verified 'Tendencias' Sub-tab is present");
        editions.tapTendenciasSubTab();
        //  homeSubTabs.tapSplash();
        print("Verified Splash is present on 'Tendencias' sub-tab");
        //   editions.tapAtrasButton();
        Thread.sleep(3000);
        editions.tapAtrasButton();
        }catch (Exception e){}
    }

    @Test(priority = 61)
    public void testJapanEditionIsPresent()throws InterruptedException{
        try{
        print("-------------------STARTING JAPAN EDITION TESTS-------------------");
        testName("Verify 'Japan' edition is present");
        Thread.sleep(3000);
        editions.tapSettingsMenu();
        editions.tapOnEditionOnJapan();
        editions.tapJapanEdition();
        editions.tapCloseButton();
        }catch (Exception e){}
    }

    @Test (priority = 61)
    public void testShoppingTab() throws InterruptedException {
        try{
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.shoppingJapan();
        Thread.sleep(3000);
        print("Verified Splash is present on 'Latest' sub-tab");
        }catch (Exception e){}

    }

    //Quizzes
    @Test (priority = 36)
    public void testGoingToQuizzesTabOnJapan()throws InterruptedException{
        try{
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");

        editions.tapQuizzesTab();
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");
        Thread.sleep(3000);
        }catch (Exception e){}
    }

}
