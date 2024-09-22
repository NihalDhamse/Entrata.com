package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class NavigationPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Guides']")
    WebElement guideElement;

    @FindBy(id="course")
    WebElement courseElement;

    @FindBy(xpath = "(//h3[text()='Accounting'])[3]")
    WebElement accountingTextElement;

    @FindBy(xpath = "(//h2[text()='Entrata Accounting 101'])[2]")
    WebElement getTextMethodElement;



    public NavigationPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void navigationPerform()
    {

        Util.waitElementUntilToClickable(guideElement);
        Util.waitElementUntilToClickable(courseElement);
        Util.scrollDownMethod(courseElement);
        Util.scrollUpMethod(accountingTextElement);
        Util.navigateBackwordMethod();
        Util.navigateForwardMethod();

    }

    public String getTextOfHomePageElement(){
        return Util.getTextOfElement(getTextMethodElement);
    }
}
