package config.dataProvider;

import org.testng.annotations.DataProvider;

public class BpagesDataProvider {

    @DataProvider(name = "nativeBpage")
    public static Object[][] fetchData1() throws Exception {
        return new Object[][]{
                {"Simone Biles Won A Bronze Medal In Her Olympic Return"}
        };
    }

    @DataProvider(name = "fallbackBpage")
    public static Object[][] fetchData2() throws Exception {
        return new Object[][]{
                {"US Life Expectancy In 2020 Dropped By More Than It Has Since World War II"}
        };
    }

    @DataProvider(name = "fallbackBpageComments")
    public static Object[][] fetchData3() throws Exception {
        return new Object[][]{
                {"Benedict Cumberbatch Says NHS Workers Are Real-Life Superheroes"}
        };
    }

    @DataProvider(name = "nativeBPageComment")
    public static Object[][] fetchData4() throws Exception {
        return new Object[][]{
                {"15 Things You're Gonna Want To Bring To College That No One Tells You About"}
        };
    }

    @DataProvider(name = "amazonButtonNativeBpage")
    public static Object[][] fetchData5() throws Exception {
        return new Object[][]{
                {"33 Trendy Pieces Your Friends Will Want To Borrow"}
        };
    }

    @DataProvider(name = "addYoursButtonNativeBpage")
    public static Object[][] fetchData6() throws Exception {
        return new Object[][]{
                {"Send Us A Picture Of Your Really Big Dog"}
        };
    }

    @DataProvider(name = "comment")
    public static Object[][] fetchData7() throws Exception {
        return new Object[][]{
                {"It's amazing"}
        };
    }

    @DataProvider(name = "replyComment")
    public static Object[][] fetchData8() throws Exception {
        return new Object[][]{
                {"I really like it"}
        };
    }

    @DataProvider(name = "addYoursComment")
    public static Object[][] fetchData9() throws Exception {
        return new Object[][]{
                {"Not a dog but... Nature related"}
        };
    }

    @DataProvider(name = "IGYTEmbed")
    public static Object[][] fetchData10() throws Exception {
        return new Object[][]{
                {"Whitney Port Opened Up About Her Recent Pregnancy Loss After Sharing Health Concerns Two Weeks Ago"}
        };
    }

    @DataProvider(name = "YTVideoEmbed")
    public static Object[][] fetchData11() throws Exception {
        return new Object[][]{
                {"Rather Than Just Hiding Extremist Videos, YouTube Will Offer Anti-Extremist Results"}
        };
    }

    @DataProvider(name = "twitterEmbed")
    public static Object[][] fetchData12() throws Exception {
        return new Object[][]{
                {"Addison Rae Accused Of Being A Trump Supporter On Twitter After She Excitedly Greeted The Former President At UFC 264"}
        };
    }

    @DataProvider(name = "instagramVideoEmbed")
    public static Object[][] fetchData13() throws Exception {
        return new Object[][]{
                {"Maisie Richardson-Sellers' Instagram Is Pretty Much A Stan Account For Their Girlfriend, And I'm Obsessed With It"}
        };
    }

    @DataProvider(name = "tiktokEmbed")
    public static Object[][] fetchData14() throws Exception {
        return new Object[][]{
                {"Someone On TikTok Tricked A Bunch Of \"Love Island\" Fans Into Thinking They Were On The Show"}
        };
    }

    @DataProvider(name = "tumblrEmbed")
    public static Object[][] fetchData15() throws Exception {
        return new Object[][]{
                {"16 Tumblr Replies That Made Me Laugh To Myself At My Desk"}
        };
    }
}
