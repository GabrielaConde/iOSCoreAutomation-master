package config.dataProvider;

import org.testng.annotations.DataProvider;

public class LoginCredentialsDataProvider {
    @DataProvider(name = "BFuser")
    public static Object[][] fetchData1() throws Exception {
        return new Object[][]{{"SalPimie"}};
    }

    @DataProvider(name = "FBuser")
    public static Object[][] fetchData3() throws Exception {
        return new Object[][]{{"shammni@hotmail.com"}};
    }

    @DataProvider(name = "pass")
    public static Object[][] fetchData2() throws Exception {
        return new Object[][]{{"sanfer12"}};
    }

    @DataProvider(name = "stageUser")
    public static Object[][] fetchData5() throws Exception {
      //  return new Object[][]{{"mark"}};
        return new Object[][]{{"gabmoreau@hotmail.com"}};
    }

    @DataProvider(name = "stagePass")
    public static Object[][] fetchData6() throws Exception {
        return new Object[][]{{"almadormida12"}};
    }
}
