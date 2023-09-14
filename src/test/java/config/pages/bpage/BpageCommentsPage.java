package config.pages.bpage;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BpageCommentsPage extends BpagePage{

    //Catching elements
    private final By readCommentsButton = MobileBy.AccessibilityId("Read Comments");
    private final By MoreLikeThisLbl = By.xpath("//XCUIElementTypeStaticText[@name='More Like This']");
    private final By toolbarCommentsBtn = By.xpath("//XCUIElementTypeButton[contains(@name=,'Comments'])");
    private final By reportButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Report\"])[1]");
    private final By addComment = MobileBy.AccessibilityId("Add a comment…");
    private final By postButton = MobileBy.AccessibilityId("Post");
    private final By mostHeartsSection = MobileBy.AccessibilityId("Most Hearts");
    private final By mostHeartsSectionNatUser = By.xpath("//XCUIElementTypeLink[@name='MollyStroup']");
    private final By mostHeartsSectionFallUser = By.xpath("//XCUIElementTypeLink[@name='amyface30']");
    private final By mostRecentSection = MobileBy.AccessibilityId("Most Recent");
    //private final By user = By.xpath("//XCUIElementTypeLink[contains(@name,'pochii']");
    private final By user = By.xpath("//XCUIElementTypeLink[@name='Gabb']");
   // private final By user = By.xpath("//XCUIElementTypeLink[@name='Mark &bull; Wilkie']");
    private final By comment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]");
    private final By likeCommentButton = MobileBy.AccessibilityId("0 people love this comment.");
    private final By likedCommentButton = MobileBy.AccessibilityId("1 person loves this comment.");
    private final By replyButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Reply\"])[1]");
    private final By replyComment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");

    //Add Yours
    private final By photoButton = By.xpath("//XCUIElementTypeButton[@name='photo.on.rectangle']");
   // private final By photoButton = MobileBy.AccessibilityId("photo.on");
    private final By chooseFromLibraryButton = MobileBy.AccessibilityId("Choose from library");
    private final By picOnLibrary = MobileBy.AccessibilityId("Photo, March 30, 2018, 4:14 PM");

    private final By deletePhoto = By.xpath("//XCUIElementTypeButton[@name='Close']");
   // private final By deletePhoto = MobileBy.AccessibilityId("close icon");
    private final By picOnComment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By backFromComments = MobileBy.AccessibilityId("Home");

    //--Methods
    public Boolean readCommentsIsPresent(){
        return driver.findElement(readCommentsButton).isDisplayed();
    }

    public void backFromHome() {driver.findElement(backFromComments).click();}

    public void scrollToReadCommentsOnNatBpage(){
        int i;
        for(i=0; i<=5; i++) {
            scroll.scrollDown();
        }
      //  scroll.scrollUntilElement(readCommentsButton);
    }

    public void scrollToReadCommentsOnFallBpage(){
        int i;
        for(i=0; i<=2; i++) {
            scroll.scrollDown();
        }
        //scroll.scrollUntilElement(MoreLikeThisLbl);
    }

    public void tapOnToolbarComments(){
        driver.findElement(toolbarCommentsBtn).click();
    }

    public void tapReadCommentsButton(){
        driver.findElement(readCommentsButton).click();
        print("Tapped 'Read Comments' button");
    }

    public Boolean reportButtonIsPresent(){
        return driver.findElement(reportButton).isDisplayed();
    }

    public void addComment(String message){
        driver.findElement(addComment).click();
        driver.findElement(addComment).sendKeys(message);
    }

    public Boolean postButtonIsPresent(){
        return driver.findElement(postButton).isDisplayed();
    }

    public void tapPostButton(){
        driver.findElement(postButton).click();
        print("Tapped 'Post' button");
    }

    public Boolean mostHeartsIsPresent(){
        Boolean ret;
       ret = driver.findElement(mostHeartsSection).isDisplayed();
       return ret;
    }

    public void tapMostHeartsSection(){
        driver.findElement(mostHeartsSection).click();
    }

    public Boolean nativeMostHeartsUserIsPresent(){
        return driver.findElement(mostHeartsSectionNatUser).isDisplayed();
    }

    public Boolean fallbackMostHeartsUserIsPresent(){
        return driver.findElement(mostHeartsSectionFallUser).isDisplayed();
    }

    public void tapMostRecentSection(){
        driver.findElement(mostRecentSection).click();
    }

    public Boolean mostRecentIsPresent(){
        return driver.findElement(mostRecentSection).isDisplayed();
    }

    public Boolean userIsPresent(){
        return driver.findElement(user).isDisplayed();
    }

    public String commentIsPresent(){
        String commentOnCommentsList = driver.findElement(comment).getAttribute("name");
        return commentOnCommentsList;
    }

    public Boolean likeCommentButtonPresent(){

        return driver.findElement(likeCommentButton).isDisplayed();
    }

    public void tapLikeCommentButton() {
        driver.findElement(likeCommentButton).click();
        print("Tapped 'Like Comment' button");
    }

    public Boolean likeButtonIsFilled(){
        return driver.findElement(likedCommentButton).isDisplayed();
    }

    public Boolean replyButtonPresent(){
        return driver.findElement(replyButton).isDisplayed();
    }

    public void tapReplyButton() {
        driver.findElement(replyButton).click();
        print("Tapped 'Reply' button");
    }

    public String replyCommentIsPresent(){
        String replyCommentOnCommentsList = driver.findElement(replyComment).getAttribute("name");
        return replyCommentOnCommentsList;
    }

    //ADD YOURS
    public void scrollToAddYoursReadComments(){
        int i;
        for(i=0; i<=1; i++) {
            scroll.scrollDown();
        }
      //  scroll.scrollUntilElement(readCommentsButton);
    }

    public Boolean addPhotoButtonIsPresent(){
        return driver.findElement(photoButton).isDisplayed();
    }

    public void tapAddPhotoButton() {
        driver.findElement(photoButton).click();
        print("Tapped 'Add Photo' button");
    }

    public Boolean chooseFromLibraryButtonIsPresent(){
        return driver.findElement(chooseFromLibraryButton).isDisplayed();
    }

    public void tapChooseFromLibraryButton() {
        driver.findElement(chooseFromLibraryButton).click();
        print("Tapped 'Choose from Library' button");
    }

    public Boolean photoOnLibraryIsPresent(){
        return driver.findElement(picOnLibrary).isDisplayed();
    }

    public void tapPhotoFromLibrary() {
        driver.findElement(picOnLibrary).click();
        print("Tapped 'Photo' on Library");
    }

    public Boolean deletePhotoIsPresent(){
        return driver.findElement(deletePhoto).isDisplayed();
    }

    public void tapDeletePhotoButton() {
        driver.findElement(deletePhoto).click();
        print("Tapped 'Delete' button on photo");
    }

    public Boolean picIsPresentOnComment(){
        return driver.findElement(picOnComment).isDisplayed();
    }
}


