package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class SignUpPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Property Manager Login']")
    WebElement managerButtonElement;

    @FindBy(xpath = "//div[text()='Resident Login']")
    WebElement residentLoginButtonElement;

    @FindBy(xpath = "//h1[text()='Entrata powers residents and property managers']")
    WebElement signUpPageTest;

    public  SignUpPage(){
        PageFactory.initElements(driver, this);
    }

    public void managerLogin()
    {
        Util.waitElementUntilToClickable(managerButtonElement);
    }

    public void residentLogin()
    {
        Util.waitElementUntilToClickable(residentLoginButtonElement);
    }

    public String getTextOfMySignUpElement()
    {
        return Util.getTextOfElement(signUpPageTest);
    }

}
