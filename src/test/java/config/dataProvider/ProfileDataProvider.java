package config.dataProvider;

import org.testng.annotations.DataProvider;

public class ProfileDataProvider {

    @DataProvider(name = "BFOriginalProfileName")
    public static Object[][] fetchData1() throws Exception {
        return new Object[][]{{"salpimienta"}};
    }

    @DataProvider(name = "FBOriginalProfileName")
    public static Object[][] fetchData2() throws Exception {
        return new Object[][]{{"s4c162ba1f"}};
    }

    @DataProvider(name = "ChangedProfileName")
    public static Object[][] fetchData3() throws Exception {
        return new Object[][]{{"salpimientas"}};
    }

    //--Wish list
    @DataProvider(name = "WishList")
    public static Object[][] fetchData4() throws Exception {
      //  return new Object[][]{{"If You're Looking To Treat Yourself, Here Are 31 Things Under $10 From Target"}};
        return new Object[][]{{"82 Deals to Check Out This Week"}};
    }

    //--Bookmarks
    @DataProvider(name = "Bookmarks")
    public static Object[][] fetchData5() throws Exception {
        return new Object[][]{{"33 Things To Bring On Your Next Outdoor Adventure"}};
    }
}
