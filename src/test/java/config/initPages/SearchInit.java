package config.initPages;

import config.InitTest;
import config.pages.ScrollsPage;
import config.pages.search.RecentSearchesPage;
import config.pages.search.SearchPage;
import config.pages.search.SuggestedSearchesPage;
import config.pages.shopping.ShoppingPage;
import org.testng.annotations.BeforeClass;

public class SearchInit extends InitTest {

    protected SearchPage search;
    protected RecentSearchesPage recent;
    protected SuggestedSearchesPage suggested;
    protected ScrollsPage scroll;
    protected ShoppingPage shoppingPage;

    @BeforeClass
    public void initializePages() {
        search = new SearchPage();
        recent = new RecentSearchesPage();
        suggested = new SuggestedSearchesPage();
        scroll = new ScrollsPage();
        shoppingPage = new ShoppingPage();
    }
}
