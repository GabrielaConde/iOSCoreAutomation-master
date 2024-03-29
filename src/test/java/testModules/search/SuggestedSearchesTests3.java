package testModules.search;

import config.initPages.SearchInit;
import org.testng.Assert;
import org.testng.annotations.Test;

//3- Continues from RecentSearchesTests2
public class SuggestedSearchesTests3 extends SearchInit {

    @Test()
    public void testSuggestedSearches() {
        testName("Verify the Suggested Searches section");
        Assert.assertTrue(suggested.suggestedSearchesTitleIsPresent());
        print("Verified Suggested Searches title is present in the Search screen");

        Assert.assertTrue(suggested.suggestedSearchTermIsPresent());
        print("Verified Suggested Searched term is present in Recent Searches");

        suggested.tapSuggestedSearchTerm();
    }

    @Test(priority = 1)
    public void testSearchResults()throws InterruptedException {
        testName("Verify the Search results from a Suggested Search");
        Thread.sleep(3000);
        Assert.assertTrue(search.searchResultIsPresent());
        print("Verified Search result is displayed");
        recent.tapSearchResult();

    }

    @Test(priority = 2)
    public void testRecentSearches()throws InterruptedException {
        testName("Verify the Suggested Search is displayed now on Recent Searches");
        Thread.sleep(3000);
        recent.tapBackButtonFromSearch();
        recent.tapCancelButton();

        Assert.assertTrue(recent.recentSearchesTitleIsPresent());
        print("Verified Recent Searches title is present in the Search screen");

        Assert.assertTrue(recent.recentSearchTermIsPresent());
        print("Verified Recent Searched term is present in Recent Searches");

    }

    @Test(priority = 3)
    public void validateShoppingSearch(){
            testName("Validate Shopping search");
            shoppingPage.tapShoppingTab();
            shoppingPage.clickOnShoppingSearch();
            shoppingPage.typeSearchElement("bag");
    }

    @Test(priority = 7)
    public void clickOnAmazonPost()throws InterruptedException{
            testName("Validate Amazon post");
            Thread.sleep(3000);
            shoppingPage.tapOnProductCell();
            Thread.sleep(3000);
            shoppingPage.returnToBFApp();
    }

    @Test(priority = 8)
    public void scrollDownOnPosts(){
            testName("Scrolldown on posts");
            scroll.scrollMultipleTimes(6);
    }
}