package testModules.editions;

import config.initPages.EditionsInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JapanEditionTests extends EditionsInit {

    @Test
    public void testJapanEditionIsPresent()throws InterruptedException{
        print("-------------------STARTING JAPAN EDITION TESTS-------------------");
        testName("Verify 'Japan' edition is present");
        editions.tapOnPerfilBtn();
        editions.tapOnConfiguracion();
        editions.tapOnEdicion();

        editions.tapJapanEdition();
        editions.tapOnCerrar();
    }



    @Test (priority = 3)
    public void testHomeSubTab(){
        testName("Verify 'Home' sub-tab");
        print("Verified 'Home' sub-tab is present");
        editions.homeHomeSubTab();
        homeSubTabs.tapSplash();
        print("Verified Splash is present on sub-tab 'Home'");
        editions.tapJapanBackButton();

    }

    @Test (priority = 4)
    public void testLolSubTab(){
        testName("Verify 'Lol' sub-tab");
        Assert.assertTrue(editions.lolHomeIsPresent());
        print("Verified 'Lol' sub-tab is present");
        editions.lolHomeSubTab();
        print("Verified Splash is present on sub-tab 'Lol'");
        editions.tapSplash();
        editions.tapJapanBackButton();
        editions.tapJapanBackButton();

    }

    @Test (priority = 5)
    public void testFstItemSubTab(){
        testName("Verify 'Kawaii' sub-tab");
        print("Verified 'Kawaii' sub-tab is present");

        editions.tapOnJapanFstItem();
        print("Verified Splash is present on sub-tab 'Kawaii'");
        editions.tapJapanBackButton();
    }


    //News
    @Test (priority = 7)
    public void testShoppingTab() throws InterruptedException {
        testName("NEWS");
        testName("Verify going to News tab / Latest sub-tab");
        editions.shoppingJapan();
        Thread.sleep(3000);
        homeSubTabs.tapSplash();
        print("Verified Splash is present on 'Latest' sub-tab");

        editions.tapJapanBackButton();

    }

    //Quizzes
    @Test (priority = 36)
    public void testGoingToQuizzesTab()throws InterruptedException{
        testName("QUIZZES");
        testName("Verify going to Quizzes tab / Latest sub-tab");

        editions.tapQuizzesTab();
        print("Verified 'Quizzes' header is present on Quizzes/Latest feed");
        Thread.sleep(3000);
        editions.tapSplash();
        editions.tapJapanBackButton();
    }

}
