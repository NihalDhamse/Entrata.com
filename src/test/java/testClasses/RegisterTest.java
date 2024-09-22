package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.HomePage;
import pageClasses.RegisterPage;
import testBase.WebTestBase;

public class RegisterTest extends WebTestBase {

    public static HomePage homePage;
    public static RegisterPage registerPage;

    @BeforeMethod
    public void preCondition()
    {
        initialization();
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(description = "Verify Register functionality with valid Email ID  and valid password")
    public void setRegisterMember()
    {
        SoftAssert softAssert =new SoftAssert();
        homePage.registerElement();
        registerPage.registerPage(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("preferredName"), prop.getProperty("company"), prop.getProperty("title"), prop.getProperty("mobile"), prop.getProperty("emailID"));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
