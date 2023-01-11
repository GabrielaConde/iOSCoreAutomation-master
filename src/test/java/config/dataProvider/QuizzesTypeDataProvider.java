package config.dataProvider;

import org.testng.annotations.DataProvider;

public class QuizzesTypeDataProvider {

    @DataProvider(name = "poll")
    public static Object[][] fetchData1() throws Exception {
        return new Object[][]{{"Do You Prefer Puppies Or Food?"}};
    }

    @DataProvider(name = "trivia")
    public static Object[][] fetchData2() throws Exception {
        return new Object[][]{{"How Good Are You At Pictionary? Identify These 30-Second Drawings To Find Out"}};
    }

    @DataProvider(name = "predetermined")
    public static Object[][] fetchData3() throws Exception {
        return new Object[][]{{"Try To Guess The 'Avengers: Infinity War' Character By The Simple Drawing"}};
    }

    @DataProvider(name = "instantQuizzes")
    public static Object[][] fetchData4() throws Exception {
        return new Object[][]{{"Which Scandinavian Country Are You Based On Your Personality?"}};
    }

    @DataProvider(name = "personality")
    public static Object[][] fetchData5() throws Exception {
        return new Object[][]{{"Pick A Bunch Of Kittens And We'll Guess Your Life Goal"}};
    }

    @DataProvider(name = "checklist")
    public static Object[][] fetchData6() throws Exception {
        return new Object[][]{{"How Many Of The Top 50 Most Popular Movies Of All Time Have You Seen?"}};
    }
}
