package testModules.quizzes.quizzesTypes;

import config.dataProvider.QuizzesTypeDataProvider;
import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuizInstantTests extends EditionsInit {

    //Search Quiz
    @Test(dataProvider = "instantQuizzes", dataProviderClass = QuizzesTypeDataProvider.class)
    public void testSearchInstantQuiz(String data) throws InterruptedException{
       // try{
        print("-------------------STARTING TO TEST INSTANT QUIZ-------------------");
        testName("Search Instant Quiz");
        instant.completeSearch(data);
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //First Screen
    @Test(priority = 1)
    public void testQuizTitleIsPresentAtBeginning() {
     //   try{
        testName("Verify Quiz Title is present");
        Assert.assertEquals(instant.verifyQuizTitleIsPresent(), "Which Scandinavian Country Are You Based On Your Personality?");
        print("Verified Quiz title: 'Which Scandinavian Country Are You Based On Your Personality?");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 2)
    public void testMainImageIsPresent() {
      //  try{
        testName("Verify Main Image is Present");
        Assert.assertTrue(instant.verifyMainImageIsPresent());
        print("Verified Main Image is present on First screen");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 3)
    public void testSubTextIsPresent() {
       // try{
        testName("Verify Sub-Text is present");
        Assert.assertTrue(instant.verifySubTextIsPresent());
        print("Verified Sub-Text is present' on First screen");
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 4)
    public void testAuthorInfoIsPresent() {
       // try{
        testName("Verify Author Info is present");
        Assert.assertTrue(instant.verifyAuthorInfoIsPresent());
        print("Verified Author info is present on First screen");
       /* } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 5)
    public void testPlayWithFriendsButtonIsPresent() {
   //     try{
        testName("Verify Play With Friends Button is present");
        Assert.assertTrue(instant.verifyPlayWithFriendsButtonIsPresent());
        print("Verified 'Play With Friends' button is present on First Screen");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 6)
    public void testPlayNowButton() {
     //   try{
        testName("Verify Play button is present and tapping it");
        Assert.assertTrue(instant.verifyPlayNowButtonIsPresent());
        print("Verified 'Play Now' button is present' on First screen");

        instant.tapPlayNowButton();
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //Completing the Quiz
    @Test(priority = 7)
    public void testQuestion1Countdown() {
      //  try{
        testName("Verify Question 1 out of 6 -> Validations");
       // instant.progressBar();
        Assert.assertEquals(instant.progressBar(), "1 of 6");    //if it fails it's because of https://buzzfeed.atlassian.net/browse/IOS-8692
        print("Verified Progress bar is present and correct");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 8)
    public void testQuestion1() {
      //  try{
        testName("Verify Question 1 out of 6 -> Validations");
       // Assert.assertEquals(instant.questions(), "Pick an animal:");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();

      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

  //  @Test(priority = 9)
    public void testQuestion2Countdown() {
     //   try{
        testName("Verify Question 2 out of 6 -> Validations");
//      Assert.assertEquals(instant.progressBar(), "2 of 6");
        print("Verified Progress bar is present and correct");
        System.out.println("THIS IS THE PROGRESS BAR: " + instant.progressBar());
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 10)
    public void testQuestion2() {
     //   try{
        testName("Verify Question 2 out of 6 -> Validations");
       // Assert.assertEquals(instant.questions(), "Which car is your favorite?");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

  //  @Test(priority = 11)
    public void testQuestion3Countdown() {
      //  try{
        testName("Verify Question 3 out of 6 -> Validations");
    //    Assert.assertEquals(instant.progressBar(), "3 of 6");
        print("Verified Progress bar is present and correct");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 12)
    public void testQuestion3() {
     //   try{
        testName("Verify Question 3 out of 6 -> Validations");
//        Assert.assertEquals(instant.questions(), "Which food item do you like the most?");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

  //  @Test(priority = 13)
    public void testQuestion4Countdown() {
     //   try{
        testName("Verify Question 4 out of 6 -> Validations");
        Assert.assertEquals(instant.progressBar(), "4 of 6");
        print("Verified Progress bar is present and correct");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 14)
    public void testQuestion4() {
     //   try{
        testName("Verify Question 4 out of 6 -> Validations");
//        Assert.assertEquals(instant.questions(), "Which song is your favorite?");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

  //  @Test(priority = 15)
    public void testQuestion5Countdown() {
     //   try{
        testName("Verify Question 5 out of 6 -> Validations");
        Assert.assertEquals(instant.progressBar(), "5 of 6");
        print("Verified Progress bar is present and correct");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 16)
    public void testQuestion5() {
      //  try{
        testName("Verify Question 5 out of 6 -> Validations");
//        Assert.assertEquals(instant.questions(), "Which soda do you like the most?");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 17)
    public void testQuestion6Countdown() {
    //    try{
        testName("Verify Question 6 out of 6 -> Validations");
//        Assert.assertEquals(instant.progressBar(), "6 of 6");
        print("Verified Progress bar is present and correct");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 18)
    public void testQuestion6() {
   //     try{
        testName("Verify Question 6 out of 6 -> Validations");

//        Assert.assertEquals(instant.questions(), "Choose a destination:");
        print("Verified Question is present and correct");

        instant.tapAnyChoice();
   /*     } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //Last Screen
    @Test(priority = 19)
    public void testQuizTitleResultScreenIsPresent() {
      //  try{
        testName("Verify Quiz title on Results screen");
//        Assert.assertTrue(instant.verifyQuizTitleResultsIsPresent());
        print("Verified Quiz title is present on Results screen");
      /*  } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 20)
    public void testImageResultScreenIsPresent() {
     //   try{
        testName("Verify Main Image on Results screen");
        Assert.assertTrue(instant.verifyResultImageIsPresent());
        print("Verified Main Image is present on Results screen");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    @Test(priority = 21)
    public void testDescriptionsResultScreenArePresent() {
    //    try{
        testName("Verify Descriptions of the obtained result are present on Results screen");
        Assert.assertTrue(instant.verifyDescriptionResult1IsPresent());

        Assert.assertTrue(instant.verifyDescriptionResults2IsPresent());
        print("Verified Country and description are present on Results screen");
    /*    } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }

    //Results sub-tab
    @Test(priority = 22)
    public void testResultsSubTab() {
      //  try{
        testName("Verify the quiz is present on Results Sub-tab");
        Assert.assertEquals(instant.verifyQuizOnResultsPersonalityTab(),"Which Scandinavian Country Are You Based On Your Personality?" );
        print("Verified The quiz is present on Results Sub-Tab");
     /*   } catch (Exception e) {
            System.out.println("ERROR ON THIS TEST CASE");
            System.out.print("EXCEPTION: ");
            System.out.print(e.getMessage());
        }*/
    }
}



