package config.pages.profile;

import config.pages.CommonPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MyPostsPage extends CommonPage {

    //Catching elements
    private final By myPosts = MobileBy.AccessibilityId("My Posts");
    private final By myPostsEmptyMessage = MobileBy.AccessibilityId("Looks like you haven’t written any posts or quizzes yet!, Tap [here](https://www.buzzfeed.com/annakopsky/the-ultimate-guide-to-making-a-buzzfeed-community-post) to learn more.");

    //Methods
    public boolean myPostsIsPresent() {
        return driver.findElement(myPosts).isDisplayed();
    }

    public void tapMyPosts() {
        driver.findElement(myPosts).click();
        print("Tapped My Posts");
    }

    public boolean myPostsEmptyMessageIsPresent() {
        return driver.findElement(myPostsEmptyMessage).isDisplayed();
    }
}