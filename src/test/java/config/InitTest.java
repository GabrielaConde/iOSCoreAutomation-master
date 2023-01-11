package config;

import basePackage.HookInt;
import config.pages.ScrollsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class InitTest extends HookInt {

    protected ScrollsPage scroll;

    public String testName(String testName){
        System.out.println("------------------------------------------------------"+"\n"+"---Test: "+testName+"---");
        return testName;
    }

    @BeforeSuite
    public static void setUpTest() throws Exception {
        platform();
    }

    @BeforeClass
    public void initializePages() {
        scroll = new ScrollsPage();
    }

    @AfterSuite
    public static void tearDown(){
        closeApp();
        closeDriver();

    }
}

