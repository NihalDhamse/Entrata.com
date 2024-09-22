package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class LoginPage extends WebTestBase {

    @FindBy(id="entrata-username")
    WebElement usernameElement;

    @FindBy(id="entrata-password")
    WebElement passwordElement;

    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement buttonElement;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void propertyManagerLogin(String username, String password){
        Util.sendTextIntoBox(usernameElement, username);
        Util.sendTextIntoBox(passwordElement,password);
        Util.waitElementUntilToClickable(buttonElement);
    }
}
