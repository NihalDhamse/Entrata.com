package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class ScrollingPage extends WebTestBase {

    @FindBy(xpath = "(//h2[text()='AI & Property Management: A Leadership Perspective'])[1]")
    WebElement scrollDownElement;

    @FindBy(xpath = "(//h2[text()='AI & the Multifamily Industry'])[1]")
    WebElement scrollUpElement;

    @FindBy(xpath = "(//div[text()='Featured'])[1]")
    WebElement getTextElement;

    public ScrollingPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void scrollingElement(){

        Util.scrollUpMethod(scrollUpElement);
        Util.scrollDownMethod(scrollDownElement);
    }

    public String getTextMethodElement()
    {
        return Util.getTextOfElement(getTextElement);
    }
}
