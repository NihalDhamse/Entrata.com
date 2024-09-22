package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class RegisterPage extends WebTestBase {

    @FindBy(xpath = "(//div[@class=\"standard-button-text\"])[1]")
    WebElement registerNewButtonElement;

    @FindBy(xpath = "//input[@aria-label=\"First Name\"]")
    WebElement firstNameTextElement;

    @FindBy(xpath = "//input[@aria-label=\"Last Name\"]")
    WebElement lastNameTextElement;

    @FindBy(xpath = "//input[@aria-label=\"Preferred Name:\"]")
    WebElement preferedNameElement;

    @FindBy(xpath = "//input[@aria-label='Company']")
    WebElement companyElement;

    @FindBy(xpath="//input[@aria-label='Title']")
    WebElement titleElement;

    @FindBy(xpath="//input[@aria-label='Email Address']")
    WebElement emailAddressElement;

    @FindBy(xpath = "//input[@aria-label='Mobile']")
    WebElement mobileElement;

    @FindBy(id="adminRegSelected_0")
    WebElement clickCheckBoxElement;

    @FindBy(id="//button[@id='forward']")
    WebElement clickNextButtonElement;



    public RegisterPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void registerPage(String firstName, String lastName, String preferredName, String company, String title, String mobile, String emailID)
    {
        Util.waitElementUntilToClickable(registerNewButtonElement);
        Util.sendTextIntoBox(firstNameTextElement,firstName);
        Util.sendTextIntoBox(lastNameTextElement,lastName);
        Util.sendTextIntoBox(preferedNameElement,preferredName);
        Util.sendTextIntoBox(companyElement,company);
        Util.sendTextIntoBox(titleElement, title);
        Util.sendTextIntoBox(emailAddressElement,emailID);
        Util.sendTextIntoBox(mobileElement,mobile);
        Util.waitElementUntilToClickable(clickCheckBoxElement);
        Util.waitElementUntilToClickable(clickCheckBoxElement);
        Util.waitElementUntilToClickable(clickNextButtonElement);
    }


}
