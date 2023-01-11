package testModules.settings;

import config.InitTest;
import config.pages.settings.CommentBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//3- Continues from GeneralTests2
public class CommentBoxTests3 extends InitTest {

    protected CommentBoxPage comment;

    @BeforeClass
    public void initProcess() {
        comment = new CommentBoxPage();
    }

    @Test
    public void testCommentBoxTitle() {
        testName("Verify the Comment Box section's title");

        scroll.scrollDown80_20();

        Assert.assertTrue(comment.commentBoxTitleIsPresent());
        print("Verified the Comment Box section's title is present");
    }

    @Test (priority = 1)
    public void testSuggestAppFeature() {
        testName("Verify the Suggest an App Feature section");

        Assert.assertTrue(comment.suggestAppFeatureIsPresent());
        print("Verified the Suggest an App Feature is present");
    }

    @Test (priority = 2)
    public void testReportIssue() {
        testName("Verify the Report a Technical Issue section");

        Assert.assertTrue(comment.reportIssueIsPresent());
        print("Verified the Report a Technical Issue is present");
    }

    @Test (priority = 3)
    public void testEditorialFeedback() {
        testName("Verify the Leave Editorial Feedback section");

        Assert.assertTrue(comment.editorialFeedbackIsPresent());
        print("Verified the Leave Editorial Feedback is present");
    }

    @Test (priority = 4)
    public void testFAQSection() {
        testName("Verify the Frequently Asked Questions section");

        Assert.assertTrue(comment.FAQSectionIsPresent());
        print("Verified the Frequently Asked Questions is present");
    }

    @Test (priority = 5)
    public void testFAQHeader() {
        testName("Verify the Frequently Asked Questions header");

        comment.tapFAQSection();

        Assert.assertTrue(comment.FAQHeaderIsPresent());
        print("Verified the FAQ Header is present");
    }

    @Test (priority = 6)
    public void testChangeEdition() {
        testName("Verify the Change Edition FAQ");

        Assert.assertTrue(comment.changeEditionIsPresent());
        print("Verified Change Edition FAQ is present");

        comment.tapChangeEdition();

        Assert.assertTrue(comment.changeEditionTextIsPresent());
        print("Verified Change Edition Text is present");

        comment.tapChangeEdition();
    }

    @Test (priority = 7)
    public void testResetPassword() {
        testName("Verify the Reset Password FAQ");

        Assert.assertTrue(comment.resetPasswordIsPresent());
        print("Verified Reset Password FAQ is present");

        comment.tapResetPassword();

        Assert.assertTrue(comment.resetPasswordTextIsPresent());
        print("Verified Reset Password Text is present");

        comment.tapResetPassword();
    }

    @Test (priority = 8)
    public void testUpdateProfilePhoto() {
        testName("Verify the Update Profile Photo FAQ");

        Assert.assertTrue(comment.updateProfilePhotoIsPresent());
        print("Verified Update Profile Photo FAQ is present");

        comment.tapUpdateProfilePhoto();

        Assert.assertTrue(comment.updateProfilePhotoTextIsPresent());
        print("Verified Update Profile Photo Text is present");

        comment.tapUpdateProfilePhoto();
    }

    @Test (priority = 9)
    public void testEditUsername() {
        testName("Verify the Edit Username FAQ");

        Assert.assertTrue(comment.editUsernameIsPresent());
        print("Verified Edit Username FAQ is present");

        comment.tapEditUsername();

        Assert.assertTrue(comment.editUsernameTextIsPresent());
        print("Verified Edit Username Text is present");

        comment.tapEditUsername();
    }

    @Test (priority = 10)
    public void testEditLanguage() {
        testName("Verify the Edit Language FAQ");

        Assert.assertTrue(comment.editLanguageIsPresent());
        print("Verified Edit Language FAQ is present");

        comment.tapEditLanguage();

        Assert.assertTrue(comment.editLanguageTextIsPresent());
        print("Verified Edit Language Text is present");

        comment.tapSettingsButton();
    }

    @Test (priority = 11)
    public void testBetaTester() {
        testName("Verify Beta Tester section");

        Assert.assertTrue(comment.betaTesterIsPresent());
        print("Verified the Beta Tester section is present");

        comment.tapBetaTester();
        comment.tapDoneButton();
    }
}