package config.pages.bpage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BpageCommentsPage extends BpagePage{

    //Catching elements
    private final By readCommentsButton = AppiumBy.accessibilityId("Read Comments");
    private final By MoreLikeThisLbl = By.xpath("//XCUIElementTypeStaticText[@name='More Like This']");
    private final By toolbarCommentsBtn = By.xpath("//XCUIElementTypeButton[contains(@name=,'Comments'])");
    private final By reportButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Report\"])[1]");
    private final By addComment = AppiumBy.accessibilityId("Add a comment…");
    private final By postButton = AppiumBy.accessibilityId("Post");
    private final By mostHeartsSection = AppiumBy.accessibilityId("Most Hearts");
    private final By mostHeartsSectionNatUser = By.xpath("//XCUIElementTypeLink[@name='Gabby']");
    private final By mostHeartsSectionFallUser = By.xpath("//XCUIElementTypeLink[@name='amyface30']");
    private final By mostRecentSection = AppiumBy.accessibilityId("Most Recent");
    //private final By user = By.xpath("//XCUIElementTypeLink[contains(@name,'pochii']");
    private final By user = By.xpath("//XCUIElementTypeLink[@name='Gabby']");
   // private final By user = By.xpath("//XCUIElementTypeLink[@name='Mark &bull; Wilkie']");
    private final By comment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]");
    private final By likeCommentButton = AppiumBy.accessibilityId("0 people love this comment.");
    private final By likedCommentButton = AppiumBy.accessibilityId("1 person loves this comment.");
    private final By replyButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Reply\"])[1]");
    private final By replyComment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]");

    //Add Yours
    private final By photoButton = By.xpath("//XCUIElementTypeButton[@name='photo.on.rectangle']");
   // private final By photoButton = AppiumBy.accessibilityId("photo.on");
    private final By chooseFromLibraryButton = AppiumBy.accessibilityId("Choose from library");
    private final By picOnLibrary = AppiumBy.accessibilityId("Photo, March 30, 2018, 4:14 PM");

    private final By deletePhoto = By.xpath("//XCUIElementTypeButton[@name='Close']");
   // private final By deletePhoto = AppiumBy.accessibilityId("close icon");
    private final By picOnComment = By.xpath("//XCUIElementTypeApplication[@name=\"BuzzFeed \uD83D\uDC1E\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]");
    private final By backFromComments = AppiumBy.accessibilityId("Home");

    //--Methods
    public Boolean readCommentsIsPresent(){
        return getDriver().findElement(readCommentsButton).isDisplayed();
    }

    public void backFromHome() {getDriver().findElement(backFromComments).click();}

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
        getDriver().findElement(toolbarCommentsBtn).click();
    }

    public void tapReadCommentsButton(){
        getDriver().findElement(readCommentsButton).click();
        print("Tapped 'Read Comments' button");
    }

    public Boolean reportButtonIsPresent(){
        return getDriver().findElement(reportButton).isDisplayed();
    }

    public void addComment(String message){
        getDriver().findElement(addComment).click();
        getDriver().findElement(addComment).sendKeys(message);
    }

    public Boolean postButtonIsPresent(){
        return getDriver().findElement(postButton).isDisplayed();
    }

    public void tapPostButton(){
        getDriver().findElement(postButton).click();
        print("Tapped 'Post' button");
    }

    public Boolean mostHeartsIsPresent(){
        Boolean ret;
       ret = getDriver().findElement(mostHeartsSection).isDisplayed();
       return ret;
    }

    public void tapMostHeartsSection(){
        getDriver().findElement(mostHeartsSection).click();
    }

    public Boolean nativeMostHeartsUserIsPresent(){
        return getDriver().findElement(mostHeartsSectionNatUser).isDisplayed();
    }

    public Boolean fallbackMostHeartsUserIsPresent(){
        return getDriver().findElement(mostHeartsSectionFallUser).isDisplayed();
    }

    public void tapMostRecentSection(){
        getDriver().findElement(mostRecentSection).click();
    }

    public Boolean mostRecentIsPresent(){
        return getDriver().findElement(mostRecentSection).isDisplayed();
    }

    public Boolean userIsPresent(){
        return getDriver().findElement(user).isDisplayed();
    }

    public String commentIsPresent(){
        String commentOnCommentsList = getDriver().findElement(comment).getAttribute("name");
        return commentOnCommentsList;
    }

    public Boolean likeCommentButtonPresent(){

        return getDriver().findElement(likeCommentButton).isDisplayed();
    }

    public void tapLikeCommentButton() {
        getDriver().findElement(likeCommentButton).click();
        print("Tapped 'Like Comment' button");
    }

    public Boolean likeButtonIsFilled(){
        return getDriver().findElement(likedCommentButton).isDisplayed();
    }

    public Boolean replyButtonPresent(){
        return getDriver().findElement(replyButton).isDisplayed();
    }

    public void tapReplyButton() {
        getDriver().findElement(replyButton).click();
        print("Tapped 'Reply' button");
    }

    public String replyCommentIsPresent(){
        String replyCommentOnCommentsList = getDriver().findElement(replyComment).getAttribute("name");
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
        return getDriver().findElement(photoButton).isDisplayed();
    }

    public void tapAddPhotoButton() {
        getDriver().findElement(photoButton).click();
        print("Tapped 'Add Photo' button");
    }

    public Boolean chooseFromLibraryButtonIsPresent(){
        return getDriver().findElement(chooseFromLibraryButton).isDisplayed();
    }

    public void tapChooseFromLibraryButton() {
        getDriver().findElement(chooseFromLibraryButton).click();
        print("Tapped 'Choose from Library' button");
    }

    public Boolean photoOnLibraryIsPresent(){
        return getDriver().findElement(picOnLibrary).isDisplayed();
    }

    public void tapPhotoFromLibrary() {
        getDriver().findElement(picOnLibrary).click();
        print("Tapped 'Photo' on Library");
    }

    public Boolean deletePhotoIsPresent(){
        return getDriver().findElement(deletePhoto).isDisplayed();
    }

    public void tapDeletePhotoButton() {
        getDriver().findElement(deletePhoto).click();
        print("Tapped 'Delete' button on photo");
    }

    public Boolean picIsPresentOnComment(){
        return getDriver().findElement(picOnComment).isDisplayed();
    }
}


