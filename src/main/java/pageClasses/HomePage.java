package pageClasses;

import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;

public class HomePage extends WebTestBase {

    @FindBy(xpath="//a[@class='signin-button white-nav']")
    WebElement signButtonElement;

    @FindBy(xpath = "//div[text()='X']")
    WebElement closedCookiesOptions;

    @FindBy(xpath = "//div[text()='See How it Works']")
    WebElement seeMoreWorkButtonElement;

    @FindBy(xpath = "//div[text()='Register now!']")
    WebElement registerButtonElement;

    @FindBy(xpath = "//div[text()='Resources']")
    WebElement resourcesElement;

    @FindBy(xpath = "//h3[text()='All Resources']")
    WebElement allResourcesElement;

    @FindBy(xpath = "//div[text()='Schedule Your Demo']")
    WebElement sedualButtonElement;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void signUpElement()
    {
        Util.waitElementUntilToClickable(closedCookiesOptions);
        Util.fluentWaitUntilClicable(signButtonElement);
    }

    public void registerElement(){
        Util.waitElementUntilToClickable(closedCookiesOptions);
        Util.waitElementUntilToClickable(registerButtonElement);
    }

    public void navigationMethodElement()
    {
        Util.waitElementUntilToClickable(closedCookiesOptions);
        Util.mouseHoverActionMethod(resourcesElement);
    }

    public void scrollingMethodElement(){
        Util.waitElementUntilToClickable(closedCookiesOptions);
        Util.mouseHoverActionMethod(resourcesElement);
        Util.waitElementUntilToClickable(allResourcesElement);
    }

    public void sedualMethodElement()
    {
        Util.waitElementUntilToClickable(closedCookiesOptions);
        Util.waitElementUntilToClickable(sedualButtonElement);
    }


}
