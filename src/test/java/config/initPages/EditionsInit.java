package config.initPages;

import config.InitTest;
import config.pages.ScrollsPage;
import config.pages.bpage.BpagePage;
import config.pages.editions.EditionsPage;
import config.pages.home.HomeLatestPage;
import config.pages.home.HomeSubTabsPage;
import config.pages.home.ShowsSubTabPage;
import config.pages.news.NewsPage;
import config.pages.quizzes.QuizzesLatestPage;
import config.pages.quizzes.QuizzesSubTabsPage;
import config.pages.quizzes.quizzesTypes.*;
import config.pages.settings.SettingsSetupPage;
import config.pages.shopping.ShoppingPage;
import config.pages.shopping.ShoppingSubTabsPageDeprecated;
import org.testng.annotations.BeforeClass;

public class EditionsInit extends InitTest {

    protected HomeSubTabsPage homeSubTabs;
    protected HomeLatestPage latestSubTab;
    protected ShowsSubTabPage showSubTab;
    protected NewsPage news;
    protected ShoppingSubTabsPageDeprecated shoppingSubTabs;
    protected ShoppingPage shoppingLatestSubTabs;
    protected EditionsPage editions;
    protected QuizzesSubTabsPage quizzesSubTabs;
    protected QuizzesLatestPage quizzesLatestSubTab;
    protected QuizPollPage pollQuiz;
    protected QuizChecklistPage checklist;
    protected QuizInstantPage instant;
    protected QuizPersonalityPage personality;
    protected QuizPredetPage predetermined;
    protected QuizTriviaPage trivia;
    protected ScrollsPage scroll;
    protected BpagePage bpage;
    protected SettingsSetupPage disableAdExp;


    @BeforeClass
    public void initializePages() {
        homeSubTabs = new HomeSubTabsPage();
        latestSubTab = new HomeLatestPage();
        showSubTab = new ShowsSubTabPage();
        news = new NewsPage();
        shoppingSubTabs = new ShoppingSubTabsPageDeprecated();
        shoppingLatestSubTabs = new ShoppingPage();
        editions = new EditionsPage();
        quizzesSubTabs = new QuizzesSubTabsPage();
        quizzesLatestSubTab = new QuizzesLatestPage();
        pollQuiz = new QuizPollPage();
        checklist = new QuizChecklistPage();
        instant = new QuizInstantPage();
        personality = new QuizPersonalityPage();
        predetermined = new QuizPredetPage();
        trivia = new QuizTriviaPage();
        scroll = new ScrollsPage();
        bpage = new BpagePage();
        disableAdExp = new SettingsSetupPage();
    }
}
