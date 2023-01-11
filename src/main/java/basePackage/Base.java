package basePackage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Base {

    public static IOSDriver<MobileElement> driver;
    private static final String APP_LOCATION = "/Users/gabrielaconde/Library/Developer/Xcode/DerivedData/BuzzFeed-dlfzqcsvaxkihhcfckvtlybabxsf/Build/Products/Debug-iphonesimulator/BuzzFeed.app";


    public static void setUp() throws Exception {


    /*    String userName = "gabriela.conde-moreau";
        String gridURL = "@http://hub.lambdatest.com/wd/hub";
        String key = "mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE";
        String hub2 = "https://" +userName + ":" + key + "@mobile-hub.lambdatest.com/wd/hub";*/

            DesiredCapabilities caps = new DesiredCapabilities();
            String hub = "https://gabriela.conde-moreau:mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE@mobile-hub.lambdatest.com/wd/hub";

            //LOCAL
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
                caps.setCapability("automationName", "XCUITest");
                //--Experiments
                caps.setCapability("fullReset", false);
                caps.setCapability("noReset", true);
                caps.setCapability("appium:shouldTerminateApp", true);


           //     LOCAL
        //--App
                caps.setCapability(MobileCapabilityType.APP, APP_LOCATION);
        //--Driver
               URL url = new URL("http://127.0.0.1:4723/wd/hub");
                driver = new IOSDriver<MobileElement>(url, caps);

    }

    public static void baseClassPassed() {
        System.out.println("Capabilities passed, Driver started... Starting Tests");
    }

    public static void closeAppBase() {
        driver.terminateApp("com.buzzfeed.buzzfeed-alpha");
        System.out.println("\n"+"Closed App");
    }

    public static void closeDriverBase() {
        driver.quit();
        System.out.println("Closed Driver");
    }

    public static void waiter() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
