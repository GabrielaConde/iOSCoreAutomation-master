package config.dataProvider;

import org.testng.annotations.DataProvider;

public class QuizAnswersDataProvider {
    @DataProvider(name = "QuizTriviaAnswers")
    public static Object[][] fetchData() throws Exception {
        return new Object[][]{
                {"king "},
                {"Suit case"},
                {"Bugspray"},
                {"Wedding cake"},
                {"Baguette"},
                {"ray"},
                {"first class"},
                {"Darts"},
                {"stadium"},
                {"Destination"},
                {"seashell"},
                {"Pen Pal"}
        };
    }

    @DataProvider(name = "QuizPredetAnswers")
    public static Object[][] fetchData1() throws Exception {
        return new Object[][]{
                {"Vision"},
                {"Bruce Banner"},
                {"Black Widow"},
                {"Black Widow"},
                {"Vision"},
                {"Tony Stark"},
                {"Thor"},
                {"Loki"},
                {"Tony Stark"},
                {"T'Challa"},
                {"Thanos"},
                {"Wanda Maximoff"}
        };
    }
}