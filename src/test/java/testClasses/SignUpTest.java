package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.HomePage;
import pageClasses.SignUpPage;
import testBase.WebTestBase;

public class SignUpTest extends WebTestBase {

    public static HomePage homePage;
    public static SignUpPage signUpPage;

    SignUpTest()
    {
    super();
    }

    @BeforeMethod
    public void preCondition()
    {
        initialization();
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    @Test(description = "Verify SignUp option should be working fine")
    public void verifySignUp()
    {
        SoftAssert softAssert = new SoftAssert();
        homePage.signUpElement();
        signUpPage.managerLogin();
        softAssert.assertEquals(signUpPage.getTextOfMySignUpElement(),"//h1[text()='Entrata powers residents and property managers']", "SignUp page text should be Match");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
