package config.pages.quizzes.quizzesTypes;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AIQuizzes extends QuizzesTypesGeneralPage{

    private By AiQuizzesLbl = By.xpath("//XCUIElementTypeStaticText[@name=\"AI Quizzes\"]");
    private By AIQuizzesEmojies = By.xpath("//XCUIElementTypeCollectionView[@name=\"BUFFET_COLLECTION\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage");
    private By infinityQuizzesLbl = MobileBy.AccessibilityId("INFINITY QUIZZES");
    private By infinityQUizText = MobileBy.AccessibilityId("BuzzFeed’s quiz of the future uses the magic of AI to create infinite results uniquely personalized to you.");
    private By subscribeLbl = MobileBy.AccessibilityId("Subscribe to BuzzFeed+");
    private By subscribeText = MobileBy.AccessibilityId("An ad free experience with exclusive early access to AI quizzes and more coming soon");
    private By subscribeImage = MobileBy.AccessibilityId("//XCUIElementTypeCell[@name=\"bf_plus_promo_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private By quizImage = By.xpath("//XCUIElementTypeCell[@name=\"buffet_grid_cell\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private By quizText = MobileBy.AccessibilityId("Create Your Perfect Boyfriend (or Girlfriend) Using AI Technology");

    //quiz page

    private By quizTitle = By.xpath("//XCUIElementTypeCollectionView[@name=\"buzz-collectionview\"]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]");
    private By quizDescription = MobileBy.AccessibilityId("Take this quiz and imagine a better future with no dating apps.");

    private By under18 = By.xpath("//XCUIElementTypeOther[@name=\"First, let’s make sure you’re a grown up!\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private By under18Msg = By.xpath("Sorry, this quiz is for adults only! Why don't you");
    private By over18 = By.xpath("//XCUIElementTypeOther[@name=\"First, let’s make sure you’re a grown up!\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]");

    private By ageParterQn = By.xpath("//XCUIElementTypeStaticText[@name=\"What age is your ideal partner?\"]");
    private By agePartnerAnswer = By.xpath("//XCUIElementTypeOther[@name=\"What age is your ideal partner?\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");

    private By genderQn = By.xpath("//XCUIElementTypeStaticText[@name=\"What age is your ideal partner?\"]");
    private By genderAnswer = By.xpath("//XCUIElementTypeOther[@name=\"What age is your ideal partner?\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");

    private By whatDoYouWantQn = By.xpath("//XCUIElementTypeStaticText[@name=\"What do you want from your partner?\"]");
    private By whatDoYOuWantAnswer = By.xpath("//XCUIElementTypeOther[@name=\"What do you want from your partner?\"]/XCUIElementTypeOther[2]");

    private By passTimeQn = By.xpath("How would you like to pass the time with your AI lover?");
    private By passTimeAnswer = By.xpath("//XCUIElementTypeStaticText[@name=\"Sitting together quietly, feeling safe and comfortable\"]");

    private By powerDynamicQn = By.xpath("//XCUIElementTypeStaticText[@name=\"What power dynamic do you want in your relationship with your AI partner?\"]");
    private By powerDynamicANswer = By.xpath("//XCUIElementTypeStaticText[@name=\"I want a partner who accepts that I’m the boss and submits to my desires and needs. My AI lover was created to serve me and they better take that responsibility seriously\"]");

    private By currentRelationshipStatus = By.xpath("//XCUIElementTypeStaticText[@name=\"What is your current relationship status?\"]");
    private By currentRelationshipANswer = By.xpath("//XCUIElementTypeStaticText[@name=\"I'm single and looking for someone to save me from loneliness\"]");

    private By whatMattersQn = By.xpath("//XCUIElementTypeStaticText[@name=\"What matters most to you?\"]");
    private By whatMattersAnswer = By.xpath("//XCUIElementTypeStaticText[@name=\"Looks matter! My partner needs to be hot. Sorry, not sorry.\"]");

    private By whatYouMissQn = By.xpath("//XCUIElementTypeStaticText[@name=\"You're totally over your ex, but you still miss their...\"]");
    private By whatYouMissANswer = By.xpath("//XCUIElementTypeOther[@name=\"You're totally over your ex, but you still miss their...\"]/XCUIElementTypeOther[3]");


}
