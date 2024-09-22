package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.HomePage;
import pageClasses.ScrollingPage;
import testBase.WebTestBase;

public class ScrollingTest extends WebTestBase {

    public static HomePage homePage;
    public static ScrollingPage scrollingPage;

    @BeforeMethod
    public void preCondition()
    {
        initialization();
        homePage = new HomePage();
        scrollingPage = new ScrollingPage();
    }

    @Test(description = "Verify the page should scrolling")
    public void scrollingMethodElement(){
        SoftAssert softAssert=new SoftAssert();
        homePage.scrollingMethodElement();
        scrollingPage.scrollingElement();
        softAssert.assertEquals(scrollingPage.getTextMethodElement(),"Featured", "Get the text from page");

    }

    @AfterMethod
    public void tearDown(){ driver.close();}
}
