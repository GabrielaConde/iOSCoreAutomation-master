package config.pages;

import basePackage.Base;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScrollsPage extends Base {

    //General scrolls
    public void scrollDown(){
        HashMap scrollObject = new HashMap<>();     //do not move outside the method, it doesn't work.
        scrollObject.put("direction", "down");
        getDriver().executeScript("mobile: scroll",scrollObject);
    }



    public void scrollUntilElement(By locator){
        Integer scrollCount = 0;
        boolean isFoundTheElement = getDriver().findElements(locator).size() > 0;
       // boolean elementVisible = getDriver().findElement(locator).isDisplayed();
        while ( isFoundTheElement == false && scrollCount<= 4) {
       //     scrollDown90_70();
            scrollDown90_50();
            scrollCount ++;
            isFoundTheElement = getDriver().findElements(locator).size() > 0;
        }
    }

    public void scrollMultipleTimes(int times){
        for(int i=0; i< times; i++){
            scrollDown();
        }
    }

    public void scrollDown2Times() {
        for(int i=0; i<1; i++){
            scrollDown();
        }
    }

    public void scrollDown3Times() {
        for(int i=0; i<2; i++){
            scrollDown();
        }
    }

    public void scrollDown6Times() {
        for(int i=0; i<4; i++){
            scrollDown();
        }
    }
    public void scrollUp(){
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "up");
        getDriver().executeScript("mobile: scroll",scrollObject);
    }

    //TouchAction scrolls
    TouchAction action = new TouchAction(getDriver());
    Dimension size = getDriver().manage().window().getSize();

    //--90
    public void scrollDown90_85(){
    /*    int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.85);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_80(){
      /*  int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.80);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_78(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.78);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_75(){
    /*    int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.75);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_70(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.70);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }


    public void scrollDown90_60(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.60);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_50(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.50);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_45(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.45);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_40(){
    /*    int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.40);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_30(){
      /*  int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.30);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_20(){
      /*  int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_15(){
     /*   int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.15);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();*/
    }

    public void scrollDown90_10(){
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.10);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    public void scrollDown90_05(){
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.5);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }


    public void scrollDown90_005(){
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.05);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    //--80
    public void scrollDown80_40(){
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.40);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    public void scrollDown80_20(){
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    public void scrollDown80_10(){
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.10);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    //--Scrolls Up
    public void scrollUp70_90(){
        int starty = (int) (size.height * 0.70);
        int endy = (int) (size.height * 0.90);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    public void scrollUp40_90(){
        int starty = (int) (size.height * 0.40);
        int endy = (int) (size.height * 0.90);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        action.press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                .moveTo(point(startx, endy)).release().perform();
    }

    public void swipeToTrending(){
        for (int i = 0; i<= 4; i++)
        {swipeLeft();}
    }

    //--Swipes
    public void swipeLeft() {
    /*    HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "left");
        getDriver().executeScript("mobile: swipe", scrollObject);/*
     */
        Dimension size = getDriver().manage().window().getSize();

        //Starting x location set to 5% of the width (near left)
        int startx = (int) (size.width * 0.05);
        //Ending x location set to 95% of the width (near right)
        int endx = (int) (size.width * 0.95);
        //y position set to mid-screen vertically
        int starty = size.height / 2;

        scrollHoriz(startx, starty, endx, starty);
    }

    public void swipeRight() {
       /* HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "right");
        getDriver().executeScript("mobile: swipe", scrollObject);*/

        //The viewing size of the device
        //WebgetDriver()Wait wait = new WebgetDriver()Wait(getDriver(), 20);
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(videoStepByStep));

        Dimension size = getDriver().manage().window().getSize();

        //Starting x location set to 5% of the width (near left)
        int endx = (int) (size.width * 0.05);
        //Ending x location set to 95% of the width (near right)
        int startx = (int) (size.width * 0.95);
        //y position set to mid-screen vertically
        int starty = size.height / 2;

        scrollHoriz(startx, starty, endx, starty);
    }

    public void scrollHoriz(int x1, int y1, int x2, int y2) {
        TouchAction action = new TouchAction(getDriver());
        action.press(point(x1, y1)).waitAction(waitOptions(ofSeconds(5))).moveTo(point(x2, y2)).release().perform();
    }

    public void swipeRightAppium2() {
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "right");
        getDriver().executeScript("mobile: swipe", scrollObject);
        print("Swiped right");
    }
    public void swipeLeftAppium2() {
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "left");
        getDriver().executeScript("mobile: swipe", scrollObject);
        print("Swiped left");
    }

    public void scrollUntilElementPlugin(By viewLocator, String locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        //viewLocator is the screen where the element is present
        RemoteWebElement scrollView = (RemoteWebElement) wait.until(presenceOfElementLocated(viewLocator));
        //locator is the element you want to find
        getDriver().executeScript("gesture: scrollElementIntoView", ImmutableMap.of("scrollableView", scrollView.getId(),
                "strategy", "id",
                "selector", locator,
                "percentage", 50,
                "direction", "up",
                "maxCount", 5));
    }

    public void scrollDownPlugin(By viewLocator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        RemoteWebElement scrollView = (RemoteWebElement) wait.until(presenceOfElementLocated(viewLocator));
        getDriver().executeScript("mobile: swipe", ImmutableMap.of("elementId", scrollView.getId(),
                "percentage", 50,
                "direction", "up"));
    }

    public void scrollLeftPlugin(By viewLocator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        RemoteWebElement scrollView = (RemoteWebElement) wait.until(presenceOfElementLocated(viewLocator));
        getDriver().executeScript("mobile: swipe", ImmutableMap.of("elementId", scrollView.getId(),
                "percentage", 50,
                "direction", "left"));
    }

    public void scrollToElementIOS(By locator, IOSDriver driver)throws InterruptedException {
        HashMap<String, Object> scrollObject = new HashMap<>();
        boolean isElementFound = false;
        Integer scrollCount = 0;
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int height = driver.manage().window().getSize().getHeight();
        int startY = (int) (height * 0.7); // Adjusted to be within screen bounds
        int endY = (int) (height * 0.3); // Adjusted to be within screen bounds

        while (!isElementFound) {
            System.out.println("Scrolling...");
            //   try {
            Thread.sleep(2000); // Slower scroll with longer wait time
            //    WebElement element = driver.findElement(ByElement);
            boolean isFoundTheElement = getDriver().findElements(locator).size() > 0;
            //  if (element.isDisplayed()) {
            if (isFoundTheElement == true) {
                isElementFound = true;
            } else {
                scrollObject.put("direction", "down");
                scrollObject.put("startX", startX);
                scrollObject.put("startY", startY);
                scrollObject.put("endX", startX);
                scrollObject.put("endY", endY);
                driver.executeScript("mobile:scroll", scrollObject);
            }
            //     startY = height/2;

            scrollObject.put("direction", "up");
            scrollObject.put("startX", startX);
            scrollObject.put("startY", endY);
            scrollObject.put("endX", startX);
            scrollObject.put("endY", startY);
            driver.executeScript("mobile:scroll", scrollObject);

        /*    } catch (Exception e) {
                // iOS specific scroll using mobile:scroll
              //  HashMap<String, Object> scrollObject = new HashMap<>();
                scrollObject.put("direction", "down");
                scrollObject.put("startX", startX);
                scrollObject.put("startY", startY);
                scrollObject.put("endX", startX);
                scrollObject.put("endY", endY);
                driver.executeScript("mobile:scroll", scrollObject);
            }*/
        }

    }


    public void scrollGeneric(double percentageStart, double percentageEnd, IOSDriver driver) {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (driver.manage().window().getSize().getHeight() * percentageStart);
        int endX = startX;
        int endY = (int) (driver.manage().window().getSize().getHeight() * percentageEnd);
        PointerInput finger1 = new PointerInput (PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove (Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction (finger1.createPointerDown (PointerInput.MouseButton. LEFT.asArg()))
                .addAction(finger1.createPointerMove (Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp (PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));
     //   print("Scrolled down: " + percentageStart + "/" + percentageEnd);
    }

    public void scrollUntilElementGeneric(By locator, int manyTimes, double percentageStart, double percentageEnd, IOSDriver driver) {
        int scrollCount = 0;
        boolean isFoundTheElement = driver.findElements(locator).size() > 0;
        while (isFoundTheElement == false && scrollCount <= manyTimes) {
            scrollGeneric(percentageStart, percentageEnd, driver);
            scrollCount++;
            isFoundTheElement = driver.findElements(locator).size() > 0;
        }
        print("Scrolled down from: " + percentageStart + "/" + percentageEnd + " until element");
    }

    public void scrollGenericManyTimes(double percentageStart, double percentageEnd, int max, IOSDriver driver){
        for(int i=0; i<=max; i++){
            scrollGeneric(percentageStart, percentageEnd, driver);
        }
        print("Scrolled down from: " + percentageStart + "/" + percentageEnd + " until element");
    }

   /* public void swipeLeftByElement(By elementSwipe, int percentage) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        RemoteWebElement carousel = (RemoteWebElement) wait.until(presenceOfElementLocated(elementSwipe));
        getDriver().executeScript("mobile: swipe", Map.of(
                "elementId", carousel.getId(),
                "percentage", percentage,
                "direction", "left"));
        print("Swiped an element to the left");
    }

    public void swipeRightByElement(By elementSwipe, int i) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        RemoteWebElement carousel = (RemoteWebElement) wait.until(presenceOfElementLocated(elementSwipe));
        getDriver().executeScript("mobile: swipe", Map.of(
                "elementId", carousel.getId(),
                "percentage", i,
                "direction", "right"));
        print("Swiped an element to the right");
    } */

    public void swipeLeftHash() {
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "left");
        getDriver().executeScript("mobile: swipe", scrollObject);
        print("Swiped left");
    }

    public void swipeLeftByElement(By elementSwipe, int percentage) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        RemoteWebElement carousel = (RemoteWebElement) wait.until(presenceOfElementLocated(elementSwipe));
        Map<String, Object> params = new HashMap<>();
        params.put("elementId", carousel.getId());
        params.put("percentage", percentage);    params.put("direction", "left");
        getDriver().executeScript("mobile: swipe", params);
        System.out.println("Swiped an element to the left");}

}
