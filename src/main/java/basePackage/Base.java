package basePackage;

import io.appium.java_client.ios.IOSDriver;
import  io.appium.java_client.ios.options.XCUITestOptions;
//import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;


public class Base {
    private static ThreadLocal<IOSDriver> driver = new ThreadLocal<>();


    public static String env = "Local";
    private static final String APP_LOCATION = "/Users/gabrielaconde/Library/Developer/Xcode/DerivedData/BuzzFeed-dkbvwkfuhllwuvexwuwxlnmrmgkk/Build/Products/Debug-iphonesimulator/BuzzFeed.app";

    @Parameters({"device", "platformVersion"})
    @BeforeClass
    public void setUp(String device, String platformVersion) throws Exception {
        URL url;
        XCUITestOptions options = new XCUITestOptions();

        if (env == "Local") {
            //LOCAL
        options.setDeviceName("iPhone 15 Pro");
        options.setPlatformVersion("17.0");
        options.setLocale("US");
        options.setCapability("region", "US");
        options.setApp(APP_LOCATION);

         url = new URL("http://127.0.0.1:4723");

        } else {

            //LAMBDA
            String userName = "gabriela.conde-moreau";
            String gridURL = "@http://hub.lambdatest.com/wd/hub";
            String key = "mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE";
            String hub2 = "https://" + userName + ":" + key + "@mobile-hub.lambdatest.com/wd/hub";

            String hub = "https://gabriela.conde-moreau:mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE@mobile-hub.lambdatest.com/wd/hub";
         //   options.setApp("lt://APP10160291931719244340214972");
       //    options.setApp("lt://APP10160502001721862391159759");
               options.setApp("lt://APP1016061291725567306059863");
            options.setCapability("build", "iOS Core Sept 5");
            options.setDeviceName(device);
            options.setPlatformVersion(platformVersion);
            options.setCapability("appiumVersion", "2.2.1");
            options.setLocale("US");
            options.setLanguage("US");
            options.setCapability("region", "US");
            options.setCapability("isRealMobile", true);

            options.setMaxTypingFrequency(7);
             url = new URL(hub2);

    }

               driver.set(new IOSDriver(url, options));

    }

    public static void baseClassPassed() {
        System.out.println("Capabilities passed, getDriver() started... Starting Tests");
    }


    public void waiter()throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    protected IOSDriver getDriver() {
        return driver.get();

    }
    @AfterClass
    public void tearSuite(){
        if(getDriver() != null){
            getDriver().quit();
            driver.remove();
        }

    }

}
