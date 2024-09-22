package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.HomePage;
import pageClasses.NavigationPage;
import testBase.WebTestBase;

public class NavigateTest extends WebTestBase {

    public static HomePage homePage;
    public static NavigationPage navigationPage;

    @BeforeMethod
    public void preCondition()
    {
        initialization();
        homePage = new HomePage();
        navigationPage = new NavigationPage();
    }

    @Test(description = "Verify the forward, refresh and backword functionality should be work")
    public void workNavigationMethod(){
        SoftAssert softAssert=new SoftAssert();
        homePage.navigationMethodElement();
        navigationPage.navigationPerform();
        softAssert.assertEquals(navigationPage.getTextOfHomePageElement(),"Entrata Accounting 101", "Get the Massage from the page ");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
