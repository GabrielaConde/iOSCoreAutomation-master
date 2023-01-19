package testModules.search;

import config.initPages.SearchInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//1
public class SearchTests1 extends SearchInit {

    @Test()
    public void testSearchTab() {
        testName("Verify the Search Tab");
        search.tapAllowButton();
        search.tapAllowButton();

        Assert.assertTrue(search.searchTabIsPresent());
        print("Verified Search tab is present in the nav bar");

        search.tapSearchTab();
    }

    @Test(priority = 1)
    public void testSearchField() {
        testName("Verify the Search field");

        Assert.assertTrue(search.searchFieldIsPresent());
        print("Verified Search field is present in the search screen");

        search.tapSearchField();
    }

    @Test(priority = 2)
    public void testSearchTerm() {
        testName("Enter a search term");
        search.sendSearchString("Kate Winslet");
    }

    @Test(priority = 3)
    public void testSearchResult() {
        testName("Verify the Search results");

        Assert.assertTrue(search.searchResultIsPresent());
        print("Verified Search result is displayed");

        search.tapSearchResult();
        search.tapBackButtonFromSearch();
    }

    @Test(priority = 4)
    public void testClearSearch() {
        testName("Clear the search results");
        Assert.assertTrue(search.clearSearchIsPresent());
        print("Verified Clear Search is displayed");

        search.tapClearSearch();
        search.tapCancelButton();
    }
}