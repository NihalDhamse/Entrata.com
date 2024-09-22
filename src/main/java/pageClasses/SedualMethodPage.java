package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class SedualMethodPage extends WebTestBase {

    @FindBy(id = "FirstName")
    WebElement firstNameElement;

    @FindBy(id = "LastName")
    WebElement lastNameElement;

    @FindBy(id = "Email")
    WebElement emailIDElement;

    @FindBy(id = "Company")
    WebElement companyElement;

    @FindBy(id = "Phone")
    WebElement phoneNumberElement;

    @FindBy(id = "Unit_Count__c")
    WebElement unitCountElement;

    @FindBy(xpath = "//option[text()='11 - 100']")
    WebElement selectCountElement;

    @FindBy(id = "Title")
    WebElement titleElement;

   public SedualMethodPage(){
       PageFactory.initElements( driver,this);
   }

   public void fillDataMethod(String firstName, String lastname, String emailID, String title, String company, String mobile){
       Util.sendTextIntoBox(firstNameElement,firstName);
       Util.sendTextIntoBox(lastNameElement,lastname);
       Util.sendTextIntoBox(emailIDElement,emailID);
       Util.sendTextIntoBox(companyElement,company);
       Util.sendTextIntoBox(phoneNumberElement,mobile);
       Util.waitElementUntilToClickable(unitCountElement);
       Util.waitElementUntilToClickable(selectCountElement);
       Util.sendTextIntoBox(titleElement,title);
   }
}
