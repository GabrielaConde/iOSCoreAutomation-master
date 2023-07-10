package testModules.search;

import config.initPages.SearchInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//2- Continues from SearchTests1
public class RecentSearchesTests2 extends SearchInit {

    @Test()
    public void testCancelButton() {
        testName("Verify the Cancel button");
        search.tapSearchField();
        Assert.assertTrue(recent.cancelButtonIsPresent());
        print("Verified Cancel button is present in the Search screen");
        search.tapSearchField();
        recent.tapCancelButton();
    }

    @Test(priority = 1)
    public void testRecentSearchesTitle() {
        testName("Verify Recent Searches tile is present");
        Assert.assertTrue(recent.recentSearchesTitleIsPresent());
        print("Verified Recent Searches title is present in the Search screen");
    }

    @Test(priority = 2)
    public void testRecentSearches() {
        testName("Verify Recent Search term is present and tapping it");
        Assert.assertTrue(recent.recentSearchTermIsPresent());
        print("Verified Recent Searched term is present in Recent Searches");
        recent.tapRecentSearchTerm();
    }

    @Test(priority = 3)
    public void testSearchResults() {
        testName("Verify the Search results");
        Assert.assertTrue(search.searchResultIsPresent());
        print("Verified Search result is displayed");
        recent.tapSearchResult();
        recent.tapBackButtonFromSearch();
    }

    @Test(priority = 4)
    public void testClearButton() {
        testName("Verify the Clear button");
        recent.tapCancelButton();
        Assert.assertTrue(recent.clearButtonIsPresent());
        print("Verified Clear button is present in the Search screen");
        recent.tapClearButton();
    }

    @Test(priority = 5)
    public void testClearRecentSearchesButton() {
        testName("Verify the Clear Recent searches button");
        Assert.assertTrue(recent.clearRecentSearchesButtonIsPresent());
        print("Verified Clear Recent searches button is displayed after tapping Clear");
        recent.tapClearRecentSearchesButton();
    }

}