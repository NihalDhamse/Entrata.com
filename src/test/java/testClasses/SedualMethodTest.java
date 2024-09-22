package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.SedualMethodPage;
import testBase.WebTestBase;

public class SedualMethodTest extends WebTestBase {

    public static HomePage homePage;
    public static SedualMethodPage sedualMethodPage;

    @BeforeMethod
    public void preCondition()
    {
        initialization();
        homePage = new HomePage();
        sedualMethodPage = new SedualMethodPage();
    }

    @Test(description = "Verify watch video form should be fill")
    public void watchVideoMethod(){
        homePage.sedualMethodElement();
        sedualMethodPage.fillDataMethod(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("emailID"), prop.getProperty("mobile"), prop.getProperty("title"), prop.getProperty("company") );
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
