package basePackage;

import io.appium.java_client.ios.IOSDriver;
import  io.appium.java_client.ios.options.XCUITestOptions;
//import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;


public class Base {
    private static ThreadLocal<IOSDriver> driver = new ThreadLocal<>();
    String appId;
    String resultOfExec = null;


    public static String env = "Lambda";
    private static final String APP_LOCATION = "/Users/gabrielaconde/Library/Developer/Xcode/DerivedData/BuzzFeed-evttmtbrjzqnhbfddetqlfcpxdsg/Build/Products/Debug-iphonesimulator/BuzzFeed.app";

    @Parameters({"device", "platformVersion"})
    @BeforeClass
    public void setUp(String device, String platformVersion) throws Exception {
        URL url;
        XCUITestOptions options = new XCUITestOptions();
        String appId;
        String resultOfExec = null;

        if (env == "Local") {
            //LOCAL
        options.setDeviceName(device);
        options.setPlatformVersion(platformVersion);
        options.setLocale("US");
        options.setCapability("fullReset", false);
        options.setCapability("noReset", true);
        options.setCapability("region", "US");
        options.setCapability("showXcodeLog", true);
        options.setCapability("autoGrantPermissions", true);
        options. setCapability("autoAcceptAlerts", true);
        options.setApp(APP_LOCATION);

         url = new URL("http://127.0.0.1:4723");

        } else {
            //LAMBDA
        /*  try{
                Process process = Runtime.getRuntime().exec("curl -u \"gabriela.conde-moreau:mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE\" -X POST \"https://manual-api.lambdatest.com/app/upload/realDevice\" -F \"appFile=@\"/Users/gabrielaconde/Developer/CORE_BUILDS/BuzzFeed.ipa\"\" -F \"name=\"BuzzFeed_ipa\"\"");
                BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
                resultOfExec =br.readLine();
            } catch (Exception e){}
            appId = resultOfExec.substring(10, 40);*/

            String userName = "gabriela.conde-moreau";
            String gridURL = "@http://hub.lambdatest.com/wd/hub";
            String key = "mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE";
            String hub2 = "https://" + userName + ":" + key + "@mobile-hub.lambdatest.com/wd/hub";
            String hub = "https://gabriela.conde-moreau:mNywYYEcYCPLNfAQOlAZ9oqkGWoRU4D4sbltLXvbcAQqBFZHOE@mobile-hub.lambdatest.com/wd/hub";
            options.setApp("lt://APP1016024941742339611853371");
           // options.setApp(appId);
            options.setCapability("build", "Test Full Flow");
            options.setDeviceName(device);
            options.setPlatformVersion(platformVersion);
            options.setCapability("appiumVersion", "2.2.1");
            options.setCapability("region", "US");
            options.setCapability("network", "true");
            options.setCapability("appProfiling", "true");
            options.setCapability("devicelog", "true");
            options.setLocale("US");
            options.setLanguage("US");
            options.setCapability("fullReset", false);
            options.setCapability("noReset", true);
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
        try {
            if (getDriver() != null) {
                getDriver().quit();
                driver.remove();

            }
        }catch (Exception e){}

    }

}
